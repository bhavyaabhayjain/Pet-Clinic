package com.noob.clinic.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.noob.clinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>{

	Owner findByLastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastname);
}
