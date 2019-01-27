package projectone.springframework.pfpetclinic.services.map;

import ch.qos.logback.classic.pattern.Abbreviator;
import projectone.springframework.pfpetclinic.model.Owner;
import projectone.springframework.pfpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by pfuks on 1/27/2019.
 */
public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner, Long>{


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}
