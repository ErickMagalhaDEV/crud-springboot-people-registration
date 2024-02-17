package com.erickmagalhadev.peaple.dto.response;

import com.erickmagalhadev.peaple.entitiy.Person;
import lombok.Getter;

@Getter
public class PersonResponseDTO {
    private Long id;
    private String name;
    private String cpf;
    private Integer age;

    public PersonResponseDTO(Person person) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }
}
