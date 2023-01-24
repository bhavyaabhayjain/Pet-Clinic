package com.noob.clinic.services;

import java.util.List;

import com.noob.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

	List<Owner> findAllByLastNameLike(String lastname);

}
