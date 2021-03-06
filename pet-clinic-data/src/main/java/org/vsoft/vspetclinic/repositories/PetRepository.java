package org.vsoft.vspetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.vsoft.vspetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
