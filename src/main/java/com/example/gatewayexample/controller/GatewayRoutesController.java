package com.example.gatewayexample.controller;

import com.example.gatewayexample.service.RefreshRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/gateway")
public class GatewayRoutesController {

    @Autowired
    private RefreshRouteService refreshRouteService;

    @Autowired
    private RouteDefinitionRepository routeDefinitionRepository;

    @Autowired
    private RouteLocator routeLocator;

    @GetMapping("/routes")
    @ResponseBody
    public Object routes() {
        Mono<Map<String, RouteDefinition>> routeDefs =
                routeDefinitionRepository.getRouteDefinitions().collectMap(RouteDefinition::getId);
        System.out.println(routeDefs);

        Mono<List<Route>> routes = routeLocator.getRoutes().collectList();
        System.out.println(routes);

        return routes;
    }

    @GetMapping("/refreshRoutes")
    public String refreshRoutes() {
        System.out.println(routeDefinitionRepository);
        refreshRouteService.refreshRoutes();
        return "success";
    }
}