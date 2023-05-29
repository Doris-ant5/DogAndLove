package org.dog.spring.api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.Lob;


@Entity
public class Image extends RepresentationModel<Image> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "imagesgen")
    @SequenceGenerator(name = "imagesgen", sequenceName = "images_id_seq", allocationSize = 1)
    private int id;
    @Lob
    @Column(name = "imagesdata", length = 2000000)
    @JsonIgnore
    private byte[] picByte;

    @NotBlank(message = "Image name must not be null or blank.")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Animal animal;

    @Column(name = "type")
    private String type;

    public Image() {
        super();
    }

    public Image(byte[] picByte, String name, Animal animal, String type) {
        this.picByte = picByte;
        this.name = name;
        this.animal = animal;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
