package projectone.springframework.pfpetclinic.services;

import projectone.springframework.pfpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by pfuks on 1/27/2019.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
