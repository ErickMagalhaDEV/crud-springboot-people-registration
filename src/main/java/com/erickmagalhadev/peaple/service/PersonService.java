package com.erickmagalhadev.peaple.service;


import com.erickmagalhadev.peaple.dto.request.PersonRequestDTO;
import com.erickmagalhadev.peaple.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {
    PersonResponseDTO findById(Long id);
    List<PersonResponseDTO> findAll();
    PersonResponseDTO register(PersonRequestDTO personDTO);
    PersonResponseDTO update(Long id, PersonRequestDTO personDTO);
    String delete(Long id);
}
