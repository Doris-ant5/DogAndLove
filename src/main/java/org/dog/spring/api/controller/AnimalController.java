package org.dog.spring.api.controller;

import org.dog.spring.api.model.Animal;
import org.dog.spring.api.service.AnimalService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Date;
import java.time.Period;

@RestController
@RequestMapping("/api/v1/animals")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        super();
        this.animalService = animalService;
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAnimal() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.getAllAnimals());
    }

    @GetMapping("/id")
    public ResponseEntity<Animal> getAnimalById(@PathVariable int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.getAnimalById(id));
    }

    @GetMapping("searchAnimalByIdentifierTag/{identifierTag}") //localhost:XXXX/api/v1/animals/{identifierTag}
    public ResponseEntity<Animal> getAnimalTag(@PathVariable String identifierTag) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByIdentifierTag(identifierTag));
    }

    @GetMapping("searchAnimalByName/{name}") //localhost:XXXX/api/v1/animals/{name}
    private ResponseEntity<Animal> getAnimalName(@PathVariable String name) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByName(name));
    }

    @GetMapping("searchAnimalBySex/{sex}") //localhost:XXXX/api/v1/animals/{sex}
    private ResponseEntity<Animal> getAnimalSex(@PathVariable char sex) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalBySex(sex));
    }

    @GetMapping("searchAnimalByDateRegistration/{dateRegistration}") //localhost:XXXX/api/v1/animals/{dateRegistration}
    private ResponseEntity<Animal> getAnimalDateRegistration(@PathVariable Date dateRegistration) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByDateRegistration(dateRegistration));
    }


    @GetMapping("searchAnimalBySize/{size}") //localhost:XXXX/api/v1/animals/{size}
    private ResponseEntity<Animal> getAnimalSize(@PathVariable String size) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalBySize(size));
    }

    @GetMapping("searchAnimalByCastration/{castration}") //localhost:XXXX/api/v1/animals/{castration}
    private ResponseEntity<Animal> getAnimalCastration(@PathVariable boolean castration) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByCastration(castration));
    }

    @GetMapping("searchAnimalByVax/{vax}") //localhost:XXXX/api/v1/animals/{vax}
    private ResponseEntity<Animal> getAnimalVax(@PathVariable boolean vax) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByVax(vax));
    }

    @GetMapping("searchAnimalByChip/{chip}") //localhost:XXXX/api/v1/animals/{chip}
    private ResponseEntity<Animal> getAnimalChip(@PathVariable boolean chip) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByChip(chip));
    }

    @GetMapping("searchAnimalByBirthDate/{birthDate}") //localhost:XXXX/api/v1/animals/{birthDate}
    private ResponseEntity<Animal> getAnimalBirthDate(@PathVariable Date birthDate) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(animalService.searchAnimalByBirthDate(birthDate));
    }

}