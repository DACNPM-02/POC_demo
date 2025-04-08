package com.example.pocdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.pocdemo.repository.elastic")
@EnableJpaRepositories(basePackages = "com.example.pocdemo.repository.jpa")
public class ElasticsearchConfig {
} 