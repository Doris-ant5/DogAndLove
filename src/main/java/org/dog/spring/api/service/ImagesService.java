package org.dog.spring.api.service;

import org.dog.spring.api.repository.ImagesRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagesService {

    private final ImagesRepository imagesRepo;

    public ImagesService(ImagesRepository imagesRepo) {
        super();
        this.imagesRepo = imagesRepo;
    }

}
