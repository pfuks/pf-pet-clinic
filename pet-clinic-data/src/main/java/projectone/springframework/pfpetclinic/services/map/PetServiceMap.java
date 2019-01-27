package projectone.springframework.pfpetclinic.services.map;

import projectone.springframework.pfpetclinic.model.Pet;
import projectone.springframework.pfpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by pfuks on 1/27/2019.
 */
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long>{


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }
}
