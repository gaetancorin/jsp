package com.example.a22_10_cdan_spring.service

import com.example.a22_10_cdan_spring.model.Fruitslegumes
import com.example.a22_10_cdan_spring.model.UserService
import com.example.a22_10_cdan_spring.repository.FruitslegumesRepository
import org.springframework.stereotype.Service


@Service
class FruitslegumesService(val fruitslegumesRepository: FruitslegumesRepository) {


    fun getAllFruits(): List<Fruitslegumes> = fruitslegumesRepository.findAll()

    fun getFruitById(id: Long): Fruitslegumes? = fruitslegumesRepository.findById(id).orElse(null)

    fun updateFruitQuantity(fruitId: Long, newQuantity: Int) {
        val fruit = fruitslegumesRepository.findById(fruitId).orElse(null)
        fruit?.let {
            it.number = newQuantity
            fruitslegumesRepository.save(it)
        }
    }

}