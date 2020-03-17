package com.sample.microservice.Controllers

import com.sample.microservice.Repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController {

    @Autowired
    lateint var repository: PersonRepository


}