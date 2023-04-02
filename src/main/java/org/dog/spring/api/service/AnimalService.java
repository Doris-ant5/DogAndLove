package org.dog.spring.api.service;

import org.dog.spring.api.exception.*;
import org.dog.spring.api.model.Animal;
import org.dog.spring.api.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    private final AnimalRepository animalRepo;

    public AnimalService(AnimalRepository animalRepo) {
        super();
        this.animalRepo = animalRepo;
    }

    public List<Animal> getAllAnimals() {
        return animalRepo.findAll();
    }

    public Animal getAnimalById(int id) {
        Optional<Animal> animalOptional = animalRepo.findById(id);
        if(animalOptional.isEmpty()) {
            throw new IdResourceNotFoundException(getNotFoundErrorMessage(id));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByIdentifierTag (String identifierTag) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByIdentifierTag(identifierTag);
        if(animalOptional.isEmpty()) {
            throw new TagResourceNotFoundException(getNotFoundTagErrorMessage(identifierTag));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByName (String name) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByName(name);
       // if(animalOptional.isEmpty()) {
        //    throw new NameResourceNotFoundException(getNotFoundNameErrorMessage(name));
        //}
        return animalOptional.get();
    }

    public Animal searchAnimalBySex (char sex) {
        Optional<Animal> animalOptional = animalRepo.findAnimalBySex(sex);
        if(animalOptional.isEmpty()) {
            throw new SexResourceNotFoundFoundException(getNotFoundSexErrorMessage(sex));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByDateRegistration (Date dateRegistration) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByDateRegistration(dateRegistration);
        if(animalOptional.isEmpty()) {
            throw new DateRegistrationResourceNotFoundException(getNotFoundDateRegistrationErrorMessage(dateRegistration));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalBySize (String size) {
        Optional<Animal> animalOptional = animalRepo.findAnimalBySize(size);
        if(animalOptional.isEmpty()) {
            throw new SizeResourceNotFoundException(getNotFoundSizeErrorMessage(size));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByCastration (boolean castration) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByCastration(castration);
        if(animalOptional.isEmpty()) {
            throw new CastrationResourceNotFoundException(getNotFoundCastrationErrorMessage(castration));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByVax (boolean vax) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByVax(vax);
        if(animalOptional.isEmpty()) {
            throw new VaxResourceNotFoundException(getNotFoundVaxErrorMessage(vax));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByChip (boolean chip) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByChip(chip);
        if(animalOptional.isEmpty()) {
            throw new ChipResourceNotFoundException(getNotFoundChipErrorMessage(chip));
        }
        return animalOptional.get();
    }

    public Animal searchAnimalByBirthDate (Date birthDate) {
        Optional<Animal> animalOptional = animalRepo.findAnimalByBirthDate(birthDate);
        if(animalOptional.isEmpty()) {
            throw new BirthDateResourceNotFoundException(getNotFoundBirthDateErrorMessage(birthDate));
        }
        return animalOptional.get();
    }

    private String getNotFoundBirthDateErrorMessage(Date birthDate) {
        return "Animal with birth date " + birthDate + " not found.";
    }

    private String getNotFoundChipErrorMessage(boolean chip) {
        return "Animal with status of chip " + chip + " not found.";
    }

    private String getNotFoundVaxErrorMessage(boolean vax) {
        return "Animal with status of vax " + vax + " not found.";
    }

    private String getNotFoundCastrationErrorMessage(boolean castration) {
        return "Animal with status of castration " + castration + " not found.";
    }

    private String getNotFoundSizeErrorMessage(String size) {
        return "Animal with size " + size + " not found.";
    }

    private String getNotFoundAgeErrorMessage(Period currentAgeDog) {
        return "Animal with age " + currentAgeDog + " not found.";
    }

    private String getNotFoundDateRegistrationErrorMessage(Date dateRegistration) {
        return "Animal with date registration" + dateRegistration + " not found.";
    }

    private String getNotFoundSexErrorMessage(char sex) {
        return "Animal with sex " + sex + " not found.";
    }

    private String getNotFoundNameErrorMessage(String name) {
        return "Animal with name " + name + " not found.";
    }

    private String getNotFoundTagErrorMessage(String identifierTag) {
        return "Animal with identifier tag " + identifierTag + " not found.";
    }

    private String getNotFoundErrorMessage(int id) {
        return "Animal with id of " + id + " not found.";
    }
}