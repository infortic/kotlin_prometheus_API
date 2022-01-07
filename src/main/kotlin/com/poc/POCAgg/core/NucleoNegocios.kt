package com.poc.POCAgg.core

import com.poc.POCAgg.adapters.componentesPrometheus.PostCreatedCouterPrometheusComponent
import com.poc.POCAgg.adapters.componentesPrometheus.PosteCreatedErroCouterPrometheusComponent
import com.poc.POCAgg.adapters.repository.interfaces.ContaRepository
import com.poc.POCAgg.adapters.repository.model.Conta
import org.springframework.stereotype.Service

@Service
class NucleoNegocios(val repository: ContaRepository,
                     val conterRequicicoesCriarConta: PostCreatedCouterPrometheusComponent,
                     val conterRequicicoesErro: PosteCreatedErroCouterPrometheusComponent) {

    fun createdPerson(conta: Conta): Conta{
        try {
            var conta = repository.save(conta)
            conterRequicicoesCriarConta.incrementedRequisicoesPostCreatedOk()
        } catch (e: Error) {
            conterRequicicoesErro.incrementaPosteCreatedErro()
        }finally {
            return conta
        }
    }
}