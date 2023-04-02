package org.dog.spring.api.controller;

import jakarta.validation.Valid;
import org.dog.spring.api.model.*;
import org.dog.spring.api.service.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        super();
        this.dogService = dogService;
    }

    @GetMapping
    public ResponseEntity<List<Dog>> getDog() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.getAllDogs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dog> getDogById(@PathVariable int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.getDogById(id));
    }


    @GetMapping("/createTestDog")
    public ResponseEntity<Dog> createTestDog () {

        // ---------------------------------------
        // ---------------------------------------
        // PIERWSZY PIES
        // ---------------------------------------
        // ---------------------------------------

        Dog dog = new Dog();

        List<PersonalitiesDog> personalities = new ArrayList<>();
        personalities.add(PersonalitiesDog.SMART);
        personalities.add(PersonalitiesDog.ADORABLE);

        List<NeedmentsDog> needs = new ArrayList<>();
        needs.add(NeedmentsDog.BEHAVIORIST);

        List<RacesDog> races = new ArrayList<>();
        races.add(RacesDog.AKITA);
        races.add(RacesDog.BOXER);
        races.add(RacesDog.COCKER_SPANIEL);

        List<HealthDog> health = new ArrayList<>();
        health.add(HealthDog.JOINTDYSPLASIA);
        health.add(HealthDog.SENSITIVESTOMACH);

        dog.setIdentifierTag("Krk/545/A");
        dog.setName("Aperol");
        dog.setSex(Sex.valueOf("MALE"));

        // 1. REGISTRATION DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dateString = "11-02-2023";

        try {
            Date registrationDateDog = sdf.parse(dateString);
            dog.setDateRegistration(registrationDateDog);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog.setSize(SizeOfAnimal.LARGE);
        dog.setCastration(true);
        dog.setVax(true);
        dog.setChip(true);
        dog.setDescription("Lovely and adorable dog. Like long walkings!");

        //dog.setImages();

        // 2. BIRTH DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
        String dateBirthDog = "04-04-2020";

        try {
            Date dateOfBirth = sdf.parse(dateBirthDog);
            dog.setBirthDate(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        dog.setRaceDog(races);
        dog.setHealthDog(health);
        dog.setPersonalitiesDog(personalities);
        dog.setNeedmentsDog(needs);


        // ---------------------------------------
        // ---------------------------------------
        // DRUGI PIES
        // ---------------------------------------
        // ---------------------------------------

       Dog dog2 = new Dog ();

        List <PersonalitiesDog> personalities2 = new ArrayList<>();
        personalities2.add(PersonalitiesDog.ACCEPTING_OTHER_ANIMALS);
        personalities2.add(PersonalitiesDog.CAREFUL);

        List <NeedmentsDog> needs2 = new ArrayList<>();
        needs2.add(NeedmentsDog.FOR_BEGINNER_OWNERS);

        List <RacesDog> races2 = new ArrayList<>();
        races2.add(RacesDog.ALASKAN_MALAMUTE);

        List <HealthDog> health2 = new ArrayList<>();
        health2.add(HealthDog.FOODINTOLERANCES);

        dog2.setIdentifierTag("Krk/546/B");
        dog2.setName("Felka");
        dog2.setSex(Sex.valueOf("FEMALE"));

        // 1. REGISTRATION DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
        String dateString3 = "05-09-2022";

        try {
            Date registrationDateDog3 = sdf3.parse(dateString3);
            dog2.setDateRegistration(registrationDateDog3);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog2.setSize(SizeOfAnimal.MEDIUM);
        dog2.setCastration(false);
        dog2.setVax(true);
        dog2.setChip(true);
        dog2.setDescription("Very energetic dog. She runs fast!");

        //dog2.setImages();

        // 2. BIRTH DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy");
        String dateBirthDog4 = "04-04-2020";

        try {
            Date dateOfBirth4 = sdf4.parse(dateBirthDog4);
            dog2.setBirthDate(dateOfBirth4);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog2.setRaceDog(races2);
        dog2.setHealthDog(health2);
        dog2.setPersonalitiesDog(personalities2);
        dog2.setNeedmentsDog(needs2);


        // ---------------------------------------
        // ---------------------------------------
        // TRZECI PIES
        // ---------------------------------------
        // ---------------------------------------

        Dog dog3 = new Dog ();

        List <PersonalitiesDog> personalities3 = new ArrayList<>();
        personalities3.add(PersonalitiesDog.WISE);
        personalities3.add(PersonalitiesDog.AGGRESSIVE_TO_DOGS);
        personalities3.add(PersonalitiesDog.DISTRUSTFUL_OF_STRANGERS);
        personalities3.add(PersonalitiesDog.LEARNS_QUICKLY);
        personalities3.add(PersonalitiesDog.STRONG);

        List <NeedmentsDog> needs3 = new ArrayList<>();
        needs3.add(NeedmentsDog.LITTLE_ACTIVITY);
        needs3.add(NeedmentsDog.PHYSIOTHERAPY);

        List <RacesDog> races3 = new ArrayList<>();
        races3.add(RacesDog.BULLDOG_ENGLISH);
        races3.add(RacesDog.ROTWAILER);
        races3.add(RacesDog.BASSET);
        races3.add(RacesDog.BULTERIER);

        List <HealthDog> health3 = new ArrayList<>();
        health3.add(HealthDog.DISEASE);

        dog3.setIdentifierTag("Krk/547/C");
        dog3.setName("Cyprian");
        dog3.setSex(Sex.valueOf("MALE"));

        // 1. REGISTRATION DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd-MM-yyyy");
        String dateString5 = "05-09-2022";

        try {
            Date registrationDateDog5 = sdf3.parse(dateString5);
            dog3.setDateRegistration(registrationDateDog5);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog3.setSize(SizeOfAnimal.SMALL);
        dog3.setCastration(true);
        dog3.setVax(true);
        dog3.setChip(false);
        dog3.setDescription("A dog with a strong and independent personality!");

        //dog3.setImages();

        // 2. BIRTH DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf6 = new SimpleDateFormat("dd-MM-yyyy");
        String dateBirthDog6 = "16-03-2020";

        try {
            Date dateOfBirth6 = sdf6.parse(dateBirthDog6);
            dog3.setBirthDate(dateOfBirth6);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog3.setRaceDog(races3);
        dog3.setHealthDog(health3);
        dog3.setPersonalitiesDog(personalities3);
        dog3.setNeedmentsDog(needs3);

        // ---------------------------------------
        // ---------------------------------------
        // CZWARTY PIES
        // ---------------------------------------
        // ---------------------------------------

        Dog dog4 = new Dog ();

        List <PersonalitiesDog> personalities4 = new ArrayList<>();
        personalities4.add(PersonalitiesDog.ACCEPTING_OTHER_ANIMALS);
        personalities4.add(PersonalitiesDog.ADORABLE);
        personalities4.add(PersonalitiesDog.RECEIVED);
        personalities4.add(PersonalitiesDog.POSITIVE);
        personalities4.add(PersonalitiesDog.WISE);

        List <NeedmentsDog> needs4 = new ArrayList<>();
        needs4.add(NeedmentsDog.HOUSE_WITH_GARDEN);
        needs4.add(NeedmentsDog.LOTS_OF_ACTIVITY);
        needs4.add(NeedmentsDog.FOR_EXPERIENCED_OWNER);

        List <RacesDog> races4 = new ArrayList<>();
        races4.add(RacesDog.MASTIF);

        List <HealthDog> health4 = new ArrayList<>();
        health4.add(HealthDog.ALERGIES);

        dog4.setIdentifierTag("Krk/548/D");
        dog4.setName("Tadeusz");
        dog4.setSex(Sex.valueOf("MALE"));

        // 1. REGISTRATION DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf7 = new SimpleDateFormat("dd-MM-yyyy");
        String dateString7 = "30-12-2022";

        try {
            Date registrationDateDog7 = sdf3.parse(dateString7);
            dog4.setDateRegistration(registrationDateDog7);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog4.setSize(SizeOfAnimal.LARGE);
        dog4.setCastration(true);
        dog4.setVax(true);
        dog4.setChip(false);
        dog4.setDescription("Dog can be stubborn at times, needs extra training!");

        //dog4.setImages();

        // 2. BIRTH DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf8 = new SimpleDateFormat("dd-MM-yyyy");
        String dateBirthDog8 = "23-07-2017";

        try {
            Date dateOfBirth8 = sdf6.parse(dateBirthDog8);
            dog4.setBirthDate(dateOfBirth8);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog4.setRaceDog(races4);
        dog4.setHealthDog(health4);
        dog4.setPersonalitiesDog(personalities4);
        dog4.setNeedmentsDog(needs4);

        // ---------------------------------------
        // ---------------------------------------
        // PIĄTY PIES
        // ---------------------------------------
        // ---------------------------------------

        Dog dog5 = new Dog ();

        List <PersonalitiesDog> personalities5 = new ArrayList<>();
        personalities5.add(PersonalitiesDog.ACCEPTING_OTHER_ANIMALS);
        personalities5.add(PersonalitiesDog.WISE);
        personalities5.add(PersonalitiesDog.LOVING);
        personalities5.add(PersonalitiesDog.LOVING_CHILDREN);

        List <NeedmentsDog> needs5 = new ArrayList<>();
        needs5.add(NeedmentsDog.GOOD_FOR_ELDERLY_PEOPLE);

        List <RacesDog> races5 = new ArrayList<>();
        races5.add(RacesDog.LABRADOR);

        List <HealthDog> health5 = new ArrayList<>();
        health5.add(HealthDog.ALERGIES);
        health5.add(HealthDog.FOODINTOLERANCES);

        dog5.setIdentifierTag("Krk/549/E");
        dog5.setName("Diana");
        dog5.setSex(Sex.valueOf("FEMALE"));

        // 1. REGISTRATION DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf9 = new SimpleDateFormat("dd-MM-yyyy");
        String dateString9 = "29-11-2018";

        try {
            Date registrationDateDog9 = sdf3.parse(dateString9);
            dog5.setDateRegistration(registrationDateDog9);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog5.setSize(SizeOfAnimal.LARGE);
        dog5.setCastration(true);
        dog5.setVax(true);
        dog5.setChip(false);
        dog5.setDescription("Amazing dog for everyone!");

        //dog5.setImages();

        // 2. BIRTH DATE
        // ---------------------------------------
        // ---------------------------------------
        SimpleDateFormat sdf10 = new SimpleDateFormat("dd-MM-yyyy");
        String dateBirthDog10 = "13-06-2012";

        try {
            Date dateOfBirth10 = sdf6.parse(dateBirthDog10);
            dog5.setBirthDate(dateOfBirth10);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        dog5.setRaceDog(races5);
        dog5.setHealthDog(health5);
        dog5.setPersonalitiesDog(personalities5);
        dog5.setNeedmentsDog(needs5);


            dogService.addDog(dog);
            dogService.addDog(dog2);
            dogService.addDog(dog3);
            dogService.addDog(dog4);
            dogService.addDog(dog5);

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(dog);

    }


    @PostMapping
    public ResponseEntity<Dog> addDog(@Valid @RequestBody Dog dog) {
        dogService.addDog(dog);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()         // http://localhost:8077/api/v1/dogs
                .path("/{id}")                // http://localhost:8077/api/v1/dogs/{id}
                .buildAndExpand(dog.getId()) // http://localhost:8077/api/v1/dogs/4
                .toUri();
        return ResponseEntity
                .created(location)
                .body(dog);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dog> updateDog(@Valid @RequestBody Dog dog, @PathVariable int id) {
        return ResponseEntity.ok(dogService.updateDogById(dog, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDog(@PathVariable int id) {
        dogService.deleteDogById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("searchDogByIdentifierTag/{identifierTag}") //localhost:8077/api/v1/dogs/{identifierTag}
    public ResponseEntity<Dog> getDogTag(@PathVariable String identifierTag) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByIdentifierTag(identifierTag));
    }

    @GetMapping("searchDogByName/{name}") //localhost:XXXX/api/v1/dogs/{name}
    private ResponseEntity<Dog> getDogName(@PathVariable String name) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByName(name));
    }
    @GetMapping("searchDogBySex/{sex}") //localhost:XXXX/api/v1/dogs/{sex}
    private ResponseEntity<Dog> getDogSex(@PathVariable char sex) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogBySex(sex));
    }

    @GetMapping("searchDogByDateRegistration/{dateRegistration}") //localhost:XXXX/api/v1/dogs/{dateRegistration}
    private ResponseEntity<Dog> getDogDateRegistration(@PathVariable Date dateRegistration) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByDateRegistration(dateRegistration));
    }


    @GetMapping("searchDogBySize/{size}") //localhost:XXXX/api/v1/dogs/{size}
    private ResponseEntity<Dog> getDogSize(@PathVariable String size) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogBySize(size));
    }

    @GetMapping("searchDogByCastration/{castration}") //localhost:XXXX/api/v1/dogs/{castration}
    private ResponseEntity<Dog> getDogCastration(@PathVariable boolean castration) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByCastration(castration));
    }

    @GetMapping("searchDogByVax/{vax}") //localhost:XXXX/api/v1/dogs/{vax}
    private ResponseEntity<Dog> getDogVax(@PathVariable boolean vax) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByVax(vax));
    }

    @GetMapping("searchDogByChip/{chip}") //localhost:XXXX/api/v1/dogs/{chip}
    private ResponseEntity<Dog> getDogChip(@PathVariable boolean chip) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByChip(chip));
    }

    @GetMapping("searchDogByBirthDate/{birthDate}") //localhost:XXXX/api/v1/dogs/{birthDate}
    private ResponseEntity<Dog> getDogBirthDate(@PathVariable Date birthDate) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByBirthDate(birthDate));
    }

    @GetMapping("searchDogByRace/{raceDog}") //localhost:XXXX/api/v1/dogs/{raceDog}
    private ResponseEntity<Dog> getDogRace(@PathVariable RacesDog raceDog) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByRace(raceDog));
    }

    @GetMapping("searchDogByPersonality/{personalityDog}") //localhost:XXXX/api/v1/dogs/{personalityDog}
    private ResponseEntity<Dog> getDogPersonality(@PathVariable PersonalitiesDog personalityDog) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByPersonality(personalityDog));
    }
    @GetMapping("searchDogByNeedments/{needmentsDog}") //localhost:XXXX/api/v1/dogs/{needmentsDog}
    private ResponseEntity<Dog> getDogNeedmentsDog(@PathVariable NeedmentsDog needmentsDog) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dogService.searchDogByNeedments(needmentsDog));
    }

}
