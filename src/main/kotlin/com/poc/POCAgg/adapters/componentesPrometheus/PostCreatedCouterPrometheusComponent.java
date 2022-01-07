package com.poc.POCAgg.adapters.componentesPrometheus;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class PostCreatedCouterPrometheusComponent {

    public final Counter REQUISICOES_POST_CREATE_201;

    public PostCreatedCouterPrometheusComponent(MeterRegistry registry) {
        REQUISICOES_POST_CREATE_201 = Counter
                .builder("REQUISICOES_CRIACAO_CONTA_COUNTER")
                .description("Número de requicições tipo 201")
                .register(registry);
    }

    public void incrementedRequisicoesPostCreatedOk() {
        REQUISICOES_POST_CREATE_201.increment();
    }
}