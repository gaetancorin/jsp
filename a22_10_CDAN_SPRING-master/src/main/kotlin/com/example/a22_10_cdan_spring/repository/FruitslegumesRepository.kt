package com.example.a22_10_cdan_spring.repository

import com.example.a22_10_cdan_spring.model.Fruitslegumes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FruitslegumesRepository : JpaRepository<Fruitslegumes, Long> {
//    teacherRep.save(TeacherBean(null, "Toto", 5));
}