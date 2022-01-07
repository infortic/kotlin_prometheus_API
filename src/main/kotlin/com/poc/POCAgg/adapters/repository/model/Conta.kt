package com.poc.POCAgg.adapters.repository.model

import java.util.*

data class Conta(
        val id: String? = UUID.randomUUID().toString(),
        val nome: String?,
        val documento: String,
        val saldo: Int
                  )
