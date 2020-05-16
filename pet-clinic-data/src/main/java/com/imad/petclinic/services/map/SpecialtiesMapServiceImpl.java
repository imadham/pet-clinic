package com.imad.petclinic.services.map;

import com.imad.petclinic.model.Specialty;
import com.imad.petclinic.services.SpecialtiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtiesMapServiceImpl extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
