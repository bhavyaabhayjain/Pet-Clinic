package com.noob.clinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.noob.clinic.model.Speciality;
import com.noob.clinic.services.SpecialityService;

@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService{

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	
	
}
