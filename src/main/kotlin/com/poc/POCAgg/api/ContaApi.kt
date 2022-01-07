package com.poc.POCAgg.api
import com.poc.POCAgg.adapters.repository.model.Conta
import com.poc.POCAgg.core.NucleoNegocios
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/conta")
class ContaApi (val coreNegocios: NucleoNegocios){

    @PostMapping
    fun create(@RequestBody conta: Conta) = ResponseEntity.ok(coreNegocios.createdPerson(conta))

}