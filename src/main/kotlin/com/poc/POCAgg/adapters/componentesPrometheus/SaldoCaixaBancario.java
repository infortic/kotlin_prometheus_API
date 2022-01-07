package com.poc.POCAgg.adapters.componentesPrometheus;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class SaldoCaixaBancario {

    public final Gauge SALDO_CAIXA_GERAL_GAUGE;

    public SaldoCaixaBancario(MeterRegistry meterRegistry){
        SALDO_CAIXA_GERAL_GAUGE = Gauge.builder("","","")
    }

}
