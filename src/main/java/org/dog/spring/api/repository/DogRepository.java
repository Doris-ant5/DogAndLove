package org.dog.spring.api.repository;

import org.dog.spring.api.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Date;
import java.time.Period;

public interface DogRepository extends JpaRepository<Dog, Integer> {
    Optional<Dog> findDogByName (String name);
    Optional<Dog> findDogByIdentifierTag (String identifierTag);
    Optional<Dog> findDogByDateRegistration (Date dateRegistration);
    Optional<Dog> findDogBySex (char sex);
    Optional<Dog> findDogBySize (String size);
    Optional<Dog> findDogByCastration (boolean castration);
    Optional<Dog> findDogByVax (boolean vax);
    Optional<Dog> findDogByChip (boolean chip);
    Optional<Dog> findDogByBirthDate (Date birthDate);
    Optional<Dog> findDogByRaceDog (RacesDog raceDog);
    Optional<Dog> findDogByHealthDog (HealthDog healthDog);
    Optional<Dog> findDogByPersonalitiesDog (PersonalitiesDog personalityDog);
    Optional<Dog> findDogByNeedmentsDog (NeedmentsDog needmentsDog);

}
