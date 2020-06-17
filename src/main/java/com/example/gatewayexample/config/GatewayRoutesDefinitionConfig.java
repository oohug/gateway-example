
package com.example.gatewayexample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.InMemoryRouteDefinitionRepository;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteDefinitionWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Slf4j
public class GatewayRoutesDefinitionConfig {


//    @Bean
//    RouteDefinitionLocator routeDefinitionLocator(){
////        return new GatewayRoutesRepository();
//        return new InMemoryRouteDefinitionRepository();
//    }
//
//    @Bean
//    @Primary
//    RouteDefinitionWriter routeDefinitionWriter(){
//        return new InMemoryRouteDefinitionRepository();
//    }
}