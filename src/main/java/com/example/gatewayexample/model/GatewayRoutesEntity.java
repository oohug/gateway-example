package com.example.gatewayexample.model;

import lombok.Data;

@Data
public class GatewayRoutesEntity {

    private Long id;

    private String serviceId;

    private String uri;

    private String predicates;

    private String filters;

}