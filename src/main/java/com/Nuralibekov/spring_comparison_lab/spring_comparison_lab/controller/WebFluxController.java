package com.Nuralibekov.spring_comparison_lab.spring_comparison_lab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/webflux")
public class WebFluxController {

    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.delay(Duration.ofMillis(100)) // Симуляция задержки
                .thenReturn("Hello from WebFlux!");
    }
}