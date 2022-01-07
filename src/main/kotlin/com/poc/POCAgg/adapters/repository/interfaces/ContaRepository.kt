package com.poc.POCAgg.adapters.repository.interfaces

import com.poc.POCAgg.adapters.repository.model.Conta
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ContaRepository : MongoRepository<Conta, String> {
    fun findByDocumento(documento: String): Optional<Conta>
}