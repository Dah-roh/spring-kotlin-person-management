package com.sample.microservice.Repository

import com.sample.microservice.Models.Gender
import com.sample.microservice.Models.Person
import org.springframework.stereotype.Repository
import javax.annotation.PostConstruct

@Repository
class PersonRepository {
    val persons = mutableListOf<Person>()
@PostConstruct
fun init() {
    save(Person(null, "Gadibia Oghenetevwodaro", 27, Gender.MALE))
    save(Person(null, "Nwoke Jideofor", 7, Gender.MALE))
}

    fun findById(id: Int): Person? {
        return persons.singleOrNull { it.id == id}
    }

    fun findAll(): List<Person> {

        return persons
    }

        fun save(person: Person): Person {
        person.id = (persons.maxBy { it.id!!}?.id?: 0) + 1
        persons.add(person)
        return person
    }

fun update(person: Person): Person {
    val index = persons.indexOfFirst { it.id == person.id}
    if(index>= 0){
        persons[index] = person
    }
    return person
}

    fun removeById(id: Int): Boolean{
        return persons.removeIf {
            it.id == id
        }
    }

}
