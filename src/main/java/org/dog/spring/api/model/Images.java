package org.dog.spring.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import javax.persistence.Lob;


@Entity
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "imagesgen")
    @SequenceGenerator(name = "imagesgen", sequenceName = "images_id_seq", allocationSize = 1)
    private int id;
    @Lob
    @Column(name = "imagesdata", length = 1000)
    private byte[] byteImages;

    @NotBlank(message = "Image name must not be null or blank.")
    private String imageName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Animal animal;

    public Images() {
        super();
    }

    public Images(int id, byte[] byteImages, String imageName, Animal animal) {
        this.id = id;
        this.byteImages = byteImages;
        this.imageName = imageName;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getByteImages() {
        return byteImages;
    }

    public void setByteImages(byte[] byteImages) {
        this.byteImages = byteImages;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
