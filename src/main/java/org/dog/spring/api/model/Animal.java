package org.dog.spring.api.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ANIMAL_TYPE")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animalgen")
    @SequenceGenerator(name = "animalgen", sequenceName = "animal_id_seq", allocationSize = 1)
    private int id;
    @NotBlank(message = "Identifier tag must not be null or blank.")
    @Size(min = 2, max= 50, message = "Animal identifier tag must be longer than 2 characters and less than 50.")
    private String identifierTag;
    @NotBlank(message = "Animal name must not be null or blank.")
    @Size(min = 1, max= 50, message = "Animal name must be longer than 1 character and less than 50.")
    private String name;

    @NotNull(message = "Animal sex must not be null or blank.")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    //@NotNull(message = "Animal date registration must not be null or blank.")
    private Date dateRegistration;

    @NotNull(message = "Animal size must not be null or blank.")
    @Enumerated(EnumType.STRING)
    private SizeOfAnimal size;

    @NotNull(message = "Animal castration must not be null or blank.")
    private boolean castration;

    @NotNull(message = "Animal vax must not be null or blank.")
    private boolean vax;

    @NotNull(message = "Animal chip must not be null or blank.")
    private boolean chip;
    @NotBlank(message = "Animal description must not be null or blank.")
    @Size(min = 5, max= 350, message = "Animal description must be longer than 5 characters and less than 350.")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "animal_id")

    @JsonManagedReference
    private List<Image> animalImages;

    private Date birthDate;

    public Animal() {
        super();
    }

    public Animal(String identifierTag, String name, Sex sex, Date dateRegistration,
                  SizeOfAnimal size, boolean castration, boolean vax, boolean chip,
                  String description, List<Image> animalImages, Date birthDate) {

        super();
        this.identifierTag = identifierTag;
        this.name = name;
        this.sex = sex;
        this.dateRegistration = dateRegistration;
        this.size = size;
        this.castration = castration;
        this.vax = vax;
        this.chip = chip;
        this.description = description;
        this.animalImages = animalImages;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifierTag() {
        return identifierTag;
    }

    public void setIdentifierTag(String identifierTag) {
        this.identifierTag = identifierTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public SizeOfAnimal getSize() {
        return size;
    }

    public void setSize(SizeOfAnimal size) {
        this.size = size;
    }

    public boolean isCastration() {
        return castration;
    }

    public void setCastration(boolean castration) {
        this.castration = castration;
    }

    public boolean isVax() {
        return vax;
    }

    public void setVax(boolean vax) {
        this.vax = vax;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
       return animalImages;
   }

   public void setImages(List<Image> images) {
        this.animalImages = animalImages;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Period getAge(LocalDate currentDate, Date birthDate) {
        LocalDate birthLocalDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentLocalDate = LocalDate.now();
        Period currentAnimalAge = Period.between(birthLocalDate, currentLocalDate );

        return currentAnimalAge;
    }
}
