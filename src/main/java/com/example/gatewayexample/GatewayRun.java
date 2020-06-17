package com.example.gatewayexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayRun {

    public static void main(String[] args) {
        SpringApplication.run(GatewayRun.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/about").uri("http://ityouknow.com"))
//                .build();
//    }

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {

        RouteLocator routeLocator = builder.routes()
                .route(r ->
                        r.path("/java/**")
                                .filters(
                                        f -> f.stripPrefix(1)
                                )
                                .uri("localhost:8022/index/health1")
                )
                .build();
        System.out.println(routeLocator);
        return routeLocator;
    }
}
