package org.dog.spring.api.repository;

import org.dog.spring.api.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Period;
import java.util.Date;
import java.util.Optional;

public interface AnimalRepository extends JpaRepository <Animal, Integer> {
    Optional <Animal> findAnimalByName (String name);
    Optional <Animal> findAnimalByIdentifierTag (String identifierTag);
    Optional <Animal> findAnimalBySex (char sex);
    Optional <Animal> findAnimalByDateRegistration (Date dateRegistration);
    Optional <Animal> findAnimalBySize (String size);
    Optional <Animal> findAnimalByCastration (boolean castration);
    Optional <Animal> findAnimalByVax (boolean vax);
    Optional <Animal> findAnimalByChip (boolean chip);
    Optional <Animal> findAnimalByBirthDate (Date birthDate);
}
