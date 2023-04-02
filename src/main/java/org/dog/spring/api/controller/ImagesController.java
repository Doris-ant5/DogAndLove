package org.dog.spring.api.controller;


import org.dog.spring.api.service.ImagesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/api/v1/images")
public class ImagesController {
    private final ImagesService imagesService;

    public ImagesController(ImagesService imagesService) {
        super();
        this.imagesService = imagesService;
    }

}

