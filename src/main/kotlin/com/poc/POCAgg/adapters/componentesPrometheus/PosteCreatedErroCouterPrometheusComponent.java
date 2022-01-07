package com.poc.POCAgg.adapters.componentesPrometheus;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class PosteCreatedErroCouterPrometheusComponent {

    public final Counter POSTC_REATED_ERROR_COUNTER;
//    public Gauge SaldoAtualConta

    public PosteCreatedErroCouterPrometheusComponent(MeterRegistry registry){
        POSTC_REATED_ERROR_COUNTER = Counter.builder("REQUICICAO_POSTC_REATED_ERROR")
                .description("contador de requicições de criação de conta com erro")
                .register(registry);
    }

    public void incrementaPosteCreatedErro(){
        POSTC_REATED_ERROR_COUNTER.increment();
    }

}
