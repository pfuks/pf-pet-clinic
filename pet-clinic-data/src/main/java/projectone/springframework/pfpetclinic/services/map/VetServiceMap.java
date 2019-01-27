package projectone.springframework.pfpetclinic.services.map;


import projectone.springframework.pfpetclinic.model.Vet;
import projectone.springframework.pfpetclinic.services.CrudService;
import projectone.springframework.pfpetclinic.services.map.AbstractMapService;

import java.util.Set;

/**
 * Created by pfuks on 1/27/2019.
 */
public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet, Long> {


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }
}
