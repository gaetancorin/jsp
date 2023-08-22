package com.example.a22_10_cdan_spring.controller

import com.example.a22_10_cdan_spring.service.FruitslegumesService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class CommandeController(private val fruitslegumesService: FruitslegumesService) {
    @PostMapping("/commande")
    fun passerCommande(@RequestParam selectedFruits: List<Long>, @RequestParam quantities: Map<Long, Int>): String {
        for (fruitId in selectedFruits) {
            val quantity = quantities[fruitId] ?: 0
            if (quantity > 0) {
                fruitslegumesService.updateFruitQuantity(fruitId, quantity)
            }
        }
        return "redirect:/fruits"
    }
}