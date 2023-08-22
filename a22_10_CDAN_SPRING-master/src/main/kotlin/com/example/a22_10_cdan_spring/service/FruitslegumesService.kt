package com.example.a22_10_cdan_spring.service

import com.example.a22_10_cdan_spring.model.Fruitslegumes
import com.example.a22_10_cdan_spring.model.UserService
import com.example.a22_10_cdan_spring.repository.FruitslegumesRepository
import org.springframework.stereotype.Service


@Service
class FruitslegumesService(val fruitslegumesRepository: FruitslegumesRepository) {


    fun getAll() : List<Fruitslegumes>{
        return fruitslegumesRepository.findAll()
    }

    fun getAllFruits(): List<Fruitslegumes> = fruitslegumesRepository.findAll()


}