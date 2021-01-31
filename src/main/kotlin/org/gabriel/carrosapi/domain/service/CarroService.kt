package org.gabriel.carrosapi.domain.service

import org.gabriel.carrosapi.domain.model.Carro
import org.gabriel.carrosapi.domain.repository.CarroRepository
import org.springframework.stereotype.Service
import java.util.*

/**
 * @project carros-api-kt
 * @author daohn on 31/01/2021
 */
@Service
class CarroService(private val repository: CarroRepository) {

  fun findAll(): List<Carro> = repository.findAll()

  fun getCarroById(id: Long): Optional<Carro> = repository.findById(id)

  fun findByTipo(tipo: String): MutableList<Carro> = repository.findByTipo(tipo)

  fun save(carro: Carro): Carro = repository.save(carro)

}