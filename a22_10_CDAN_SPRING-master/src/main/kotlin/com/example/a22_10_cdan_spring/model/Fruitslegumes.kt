package com.example.a22_10_cdan_spring.model

import jakarta.persistence.*

@Entity
@Table(name = "fruitslegumes")
data class Fruitslegumes(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var fruitslegumesid: Long? = null,
    var nom: String = "",
    var activated: Int? = null,
    var number: Int? = null)