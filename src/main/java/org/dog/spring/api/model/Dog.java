package org.dog.spring.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Entity
@DiscriminatorValue(value = "DOG")
public class Dog extends Animal {

    @Enumerated(EnumType.STRING)
    private List<RacesDog> raceDog;
    @NotEmpty(message = "List with info about dog health must not be null or blank.")
    @Enumerated(EnumType.STRING)
    private List<HealthDog> healthDog;
    @NotEmpty(message = "List with info about dog personality must not be null or blank.")
    @Enumerated(EnumType.STRING)
    private List<PersonalitiesDog> personalitiesDog;
    @NotEmpty(message = "List with info about dog needments must not be null or blank.")
    @Enumerated(EnumType.STRING)
    private List<NeedmentsDog> needmentsDog;

    public Dog() {
        super();
    }

    public Dog(List<RacesDog> raceDog, List<HealthDog> healthDog,
               List<PersonalitiesDog> personalitiesDog, List<NeedmentsDog> needmentsDog) {

        super();
        this.raceDog = raceDog;
        this.healthDog = healthDog;
        this.personalitiesDog = personalitiesDog;
        this.needmentsDog = needmentsDog;
    }

    public List<RacesDog> getRaceDog() {
        return raceDog;
    }

    public void setRaceDog(List<RacesDog> raceDog) {
        this.raceDog = raceDog;
    }

    public List<HealthDog> getHealthDog() {
        return healthDog;
    }

    public void setHealthDog(List<HealthDog> healthDog) {
        this.healthDog = healthDog;
    }

    public List<PersonalitiesDog> getPersonalitiesDog() {
        return personalitiesDog;
    }

    public void setPersonalitiesDog(List<PersonalitiesDog> personalitiesDog) {
        this.personalitiesDog = personalitiesDog;
    }

    public List<NeedmentsDog> getNeedmentsDog() {
        return needmentsDog;
    }

    public void setNeedmentsDog(List<NeedmentsDog> needmentsDog) {
        this.needmentsDog = needmentsDog;
    }
}
