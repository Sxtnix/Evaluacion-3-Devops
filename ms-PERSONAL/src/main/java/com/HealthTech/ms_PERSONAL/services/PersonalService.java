package com.HealthTech.ms_PERSONAL.services;

import com.HealthTech.ms_PERSONAL.model.PersonalSanitario;
import com.HealthTech.ms_PERSONAL.repositories.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalService {

    @Autowired
    private PersonalRepository repository;

    public List<PersonalSanitario> listarTodoElPersonal() {
        return repository.findAll();
    }

    public PersonalSanitario guardar(PersonalSanitario personal) {
        return repository.save(personal);
    }
}