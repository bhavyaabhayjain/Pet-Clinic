package com.noob.clinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.noob.clinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
