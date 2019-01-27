package projectone.springframework.pfVetclinic.services;

import projectone.springframework.pfpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by pfuks on 1/27/2019.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
