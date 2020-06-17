//package com.example.gatewayexample.config;
//
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//import java.net.URI;
//
//public class LoadBalancerClientFilter implements GlobalFilter, Ordered {
//    @Override
//    public int getOrder() {
//        return LOAD_BALANCER_CLIENT_FILTER_ORDER;
//    }
//
//    @Override
//    @SuppressWarnings("Duplicates")
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        return chain.filter(exchange);
//    }
//
//    protected ServiceInstance choose(ServerWebExchange exchange) {
//        return loadBalancer.choose(
//                ((URI) exchange.getAttribute(GATEWAY_REQUEST_URL_ATTR)).getHost());
//    }
//}