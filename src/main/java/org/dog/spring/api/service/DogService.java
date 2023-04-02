package org.dog.spring.api.service;

import org.dog.spring.api.exception.*;
import org.dog.spring.api.model.*;
import org.dog.spring.api.repository.DogRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Date;
import java.time.Period;

@Service
public class DogService {

    private final DogRepository dogRepo;

    public DogService(DogRepository dogRepo) {
        super();
        this.dogRepo = dogRepo;
    }

    public List<Dog> getAllDogs() {
        return dogRepo.findAll();
    }

    public Dog getDogById(int id) {
        Optional<Dog> dogOptional = dogRepo.findById(id);
        if (dogOptional.isEmpty()) {
            throw new DogResourceNotFoundException(getNotFoundDogIdErrorMessage(id));
        }
        return dogOptional.get();
    }

    public Dog addDog(Dog dog) {
        Optional<Dog> dogOptional = dogRepo.findDogByName(dog.getName());
        if (dogOptional.isPresent()) {
            throw new DogNameExistsException("Dog with name of " + dog.getName() + " already exists.");
        }
        return dogRepo.save(dog);
    }

    public void deleteDogById(int id) {
        Optional<Dog> dogOptional = dogRepo.findById(id);
        if (dogOptional.isEmpty()) {
            throw new ResourceDogByIdNotFoundException(getNotFoundDogIdErrorMessage(id));
        }
        dogRepo.deleteById(id);
    }

    public Dog updateDogById (Dog dog, int id) {
        Optional<Dog> dogOptional = dogRepo.findById(id);
        if (dogOptional.isEmpty()) {
            throw new ResourceDogByIdNotFoundException(getNotFoundDogIdErrorMessage(id));
        }
        dog.setId(id);
        return dogRepo.save(dog);
    }

    public Dog searchDogByIdentifierTag (String identifierTag) {
        Optional<Dog> dogOptional = dogRepo.findDogByIdentifierTag(identifierTag);
        if(dogOptional.isEmpty()) {
            throw new IdentifierTagDogResourceNotFoundException(getNotFoundIdentifierTagDogErrorMessage(identifierTag));
        }
        return dogOptional.get();
    }

    public Dog searchDogByName (String name) {
        Optional<Dog> dogOptional = dogRepo.findDogByName(name);
        if(dogOptional.isEmpty()) {
            throw new NameDogResourceNotFoundException(getNotFoundNameDogErrorMessage(name));
        }
        return dogOptional.get();
    }

    public Dog searchDogBySex (char sex) {
        Optional<Dog> dogOptional = dogRepo.findDogBySex(sex);
        if(dogOptional.isEmpty()) {
            throw new SexDogResourceNotFoundException(getNotFoundSexDogErrorMessage(sex));
        }
        return dogOptional.get();
    }

    public Dog searchDogByDateRegistration (Date dateRegistration) {
        Optional<Dog> dogOptional = dogRepo.findDogByDateRegistration(dateRegistration);
        if(dogOptional.isEmpty()) {
            throw new DateRegistrationDogResourceNotFoundException(getNotFoundDateRegistrationDogErrorMessage(dateRegistration));
        }
        return dogOptional.get();
    }


    public Dog searchDogBySize (String size) {
        Optional<Dog> dogOptional = dogRepo.findDogBySize(size);
        if(dogOptional.isEmpty()) {
            throw new SizeDogResourceNotFoundException(getNotFoundSizeDogErrorMessage(size));
        }
        return dogOptional.get();
    }

    public Dog searchDogByCastration (boolean castration) {
        Optional<Dog> dogOptional = dogRepo.findDogByCastration(castration);
        if(dogOptional.isEmpty()) {
            throw new CastrationDogResourceNotFoundException(getNotFoundCastrationDogErrorMessage(castration));
        }
        return dogOptional.get();
    }

    public Dog searchDogByVax (boolean vax) {
        Optional<Dog> dogOptional = dogRepo.findDogByVax(vax);
        if(dogOptional.isEmpty()) {
            throw new VaxDogResourceNotFoundException(getNotFoundVaxDogErrorMessage(vax));
        }
        return dogOptional.get();
    }

    public Dog searchDogByChip (boolean chip) {
        Optional<Dog> dogOptional = dogRepo.findDogByChip(chip);
        if(dogOptional.isEmpty()) {
            throw new ChipDogResourceNotFoundException(getNotFoundChipDogErrorMessage(chip));
        }
        return dogOptional.get();
    }

    public Dog searchDogByBirthDate (Date birthDate) {
        Optional<Dog> dogOptional = dogRepo.findDogByBirthDate(birthDate);
        if(dogOptional.isEmpty()) {
            throw new BirthDateDogResourceNotFoundException(getNotFoundBirthDateDogErrorMessage(birthDate));
        }
        return dogOptional.get();
    }

    public Dog searchDogByRace (RacesDog racesDog) {
        Optional<Dog> dogOptional = dogRepo.findDogByRaceDog(racesDog);
        if(dogOptional.isEmpty()) {
            throw new RacesDogResourceNotFoundException(getNotFoundRacesDogErrorMessage(racesDog));
        }
        return dogOptional.get();
    }

    public Dog searchDogByHealth (HealthDog healthDog) {
        Optional<Dog> dogOptional = dogRepo.findDogByHealthDog(healthDog);
        if(dogOptional.isEmpty()) {
            throw new HealthDogResourceNotFoundException(getNotFoundHealthDogErrorMessage(healthDog));
        }
        return dogOptional.get();
    }

    public Dog searchDogByPersonality (PersonalitiesDog personalityDog) {
        Optional<Dog> dogOptional = dogRepo.findDogByPersonalitiesDog(personalityDog);
        if(dogOptional.isEmpty()) {
            throw new PersonalitiesDogResourceNotFoundException(getNotFoundPersonalitiesDogErrorMessage(personalityDog));
        }
        return dogOptional.get();
    }

    public Dog searchDogByNeedments (NeedmentsDog needmentsDog) {
        Optional<Dog> dogOptional = dogRepo.findDogByNeedmentsDog(needmentsDog);
        if(dogOptional.isEmpty()) {
            throw new NeedmentsDogResourceNotFoundException(getNotFoundNeedmentsDogErrorMessage(needmentsDog));
        }
        return dogOptional.get();
    }

    private String getNotFoundNeedmentsDogErrorMessage(NeedmentsDog needmentsDog) {
        return "Dog with needments " + needmentsDog + " not found.";
    }

    private String getNotFoundPersonalitiesDogErrorMessage(PersonalitiesDog personalityDog) {
        return "Dog with personality " + personalityDog + " not found.";
    }

    private String getNotFoundHealthDogErrorMessage(HealthDog healthDog) {
        return "Dog with health " + healthDog + " not found.";
    }

    private String getNotFoundRacesDogErrorMessage(RacesDog racesDog) {
        return "Dog with race " + racesDog + " not found.";
    }

    private String getNotFoundBirthDateDogErrorMessage(Date birthDate) {
        return "Dog with birth date " + birthDate + " not found.";
    }

    private String getNotFoundChipDogErrorMessage(boolean chip) {
        return "Dog with status of chip " + chip + " not found.";
    }

    private String getNotFoundVaxDogErrorMessage(boolean vax) {
        return "Dog with status of vax " + vax + " not found.";
    }

    private String getNotFoundCastrationDogErrorMessage(boolean castration) {
        return "Dog with status of castration " + castration + " not found.";
    }

    private String getNotFoundSizeDogErrorMessage(String size) {
        return "Dog with size " + size + " not found.";
    }

    private String getNotFoundCurrentAgeDogErrorMessage(Period currentAnimalAge) {
        return "Dog with age " + currentAnimalAge + " not found.";
    }

    private String getNotFoundDateRegistrationDogErrorMessage(Date dateRegistration) {
        return "Dog with date registration " + dateRegistration + " not found.";
    }

    private String getNotFoundSexDogErrorMessage(char sex) {
        return "Dog with sex " + sex + " not found.";
    }

    private String getNotFoundNameDogErrorMessage(String name) {
        return "Dog with name " + name + " not found.";
    }

    private String getNotFoundIdentifierTagDogErrorMessage(String identifierTag) {
        return "Dog with identifier tag " + identifierTag + " not found.";
    }

    private String getNotFoundDogIdErrorMessage(int id) {
        return "Dog with id " + id + " not found.";
    }
}
