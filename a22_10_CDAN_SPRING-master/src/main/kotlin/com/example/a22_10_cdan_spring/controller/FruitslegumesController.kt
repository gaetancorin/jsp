package com.example.a22_10_cdan_spring.controller

import com.example.a22_10_cdan_spring.UserBean
import com.example.a22_10_cdan_spring.model.Fruitslegumes
import com.example.a22_10_cdan_spring.model.UserService
import com.example.a22_10_cdan_spring.service.FruitslegumesService
import jakarta.servlet.http.HttpSession
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/fruits")
class FruitslegumesController {

    //http://localhost:8080/fruits/products
    @GetMapping("/products")
    fun products(userBean: UserBean, fruitslegumes: Fruitslegumes, session: HttpSession): String {
        userBean.login = "toto@toto.fr"
        userBean.password = "tata"
        println("/login " + session.getId())

        var userSave = UserService.findBySessionId(session.id)

//        var fruitslegumes = FruitslegumesService.getAll()
//        var fruitslegumes2 = FruitslegumesService.getAllFruits()

        //Lance studentForm.html
        return "/products";
    }
}