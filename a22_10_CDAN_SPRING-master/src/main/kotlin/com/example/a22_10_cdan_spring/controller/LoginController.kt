package com.example.a22_10_cdan_spring.controller

import com.example.a22_10_cdan_spring.UserBean
import com.example.a22_10_cdan_spring.model.UserService
import com.example.a22_10_cdan_spring.service.FruitslegumesService
import jakarta.servlet.http.HttpSession
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class LoginController {

    //http://localhost:8080/user/login
    @GetMapping("/login")
    fun login(userBean: UserBean, session: HttpSession): String {
        userBean.login = "toto@toto.fr"
        userBean.password = "tata"
        println("/login " + session.getId())

        var userSave = UserService.findBySessionId(session.id)

        if(userSave != null) {

            //redirection
            return "redirect:/user/userregister";
        }


        //Lance studentForm.html
        return "login/login";
    }

    //Méthode de récéption du formulaire
    @PostMapping("/loginSubmit")
    fun formResponse(userBean: UserBean, session: HttpSession): String {
        println("User créé : $userBean")

        userBean.sessionId = session.id
        UserService.save(userBean)

        //redirige sur une autre url
        return "redirect:/user/userregister";
    }

    //http://localhost:8080/user/userregister
    //Affiche la page userregister
    @GetMapping("/userregister")
    fun userregister(session: HttpSession): String {

        var userSave = UserService.findBySessionId(session.id)

        if(userSave == null) {

            //redirection
            return "redirect:/login";
        }


        return "login/userregister";
    }

    //http://localhost:8080/user/products
    @GetMapping("/products")
    fun products(userBean: UserBean, session: HttpSession): String {
        userBean.login = "toto@toto.fr"
        userBean.password = "tata"
        println("/login " + session.getId())

        var userSave = UserService.findBySessionId(session.id)

//        var fruitslegumes = FruitslegumesService.getAll()

        //Lance studentForm.html
        return "/products";
    }
}