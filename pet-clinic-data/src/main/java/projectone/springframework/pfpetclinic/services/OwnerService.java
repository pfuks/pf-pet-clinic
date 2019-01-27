package projectone.springframework.pfpetclinic.services;

import projectone.springframework.pfpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by pfuks on 1/27/2019.
 */
public interface OwnerService {

    Owner findByLastName(String name);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
