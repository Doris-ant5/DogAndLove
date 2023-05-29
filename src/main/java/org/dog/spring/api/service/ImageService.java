package org.dog.spring.api.service;

import org.dog.spring.api.exception.DogResourceNotFoundException;
import org.dog.spring.api.exception.ImageResourceNotFoundException;
import org.dog.spring.api.model.Dog;
import org.dog.spring.api.model.Image;
import org.dog.spring.api.repository.ImageRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImageService {

    private final ImageRepository imageRepo;

    public ImageService(ImageRepository imagesRepo) {
        super();
        this.imageRepo = imagesRepo;
    }

    public Image save(Image img) {
        return imageRepo.save(img);
    }


    public Image getImageById(int id) {
        Optional<Image> imageOptional = imageRepo.findById(id);
        if (imageOptional.isEmpty()) {
            throw new ImageResourceNotFoundException(getNotFoundDogIdErrorMessage(id));
        }
        return imageOptional.get();
    }

    private String getNotFoundDogIdErrorMessage(int id) {
        return "image with id " + id + " not found.";
    }

}
