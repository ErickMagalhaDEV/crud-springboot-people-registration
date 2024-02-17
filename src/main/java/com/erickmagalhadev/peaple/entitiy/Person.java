package com.erickmagalhadev.peaple.entitiy;

import jakarta.persistence.*;
import lombok.*;

@Entity //indica que é uma tabela no banco
@Table(name = "tb_people") // nome da tabela no banco
@NoArgsConstructor
@Getter
@Setter
public class Person {
    @Id //chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;
    @Column(name = "age", nullable = false)
    private Integer age;

    @Builder
    public Person(String name, String cpf, Integer age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
    }
}
