package com.example.gatewayexample.service;

import com.example.gatewayexample.model.GatewayRoutesEntity;
import org.springframework.cloud.gateway.filter.FilterDefinition;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;

import java.util.List;

public interface GatewayRoutesService {

    List<GatewayRoutesEntity> findAll() throws Exception;

    String loadRouteDefinition() throws Exception;

    GatewayRoutesEntity save(GatewayRoutesEntity gatewayDefine) throws Exception;

    void deleteById(String id) throws Exception;

    boolean existsById(String id) throws Exception;

    List<PredicateDefinition> getPredicateDefinition(String predicates);

    List<FilterDefinition> getFilterDefinition(String filters);

}