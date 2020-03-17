package com.sample.microservice.Repository

import org.springframework.stereotype.Repository

@Repository
class PersonRepository {
    val persons: MutableList<Person> = ArrayList()

    fun findById(): List<Person> {

    }


}
