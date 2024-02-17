package com.erickmagalhadev.peaple.entitiy.repository;

import com.erickmagalhadev.peaple.entitiy.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
