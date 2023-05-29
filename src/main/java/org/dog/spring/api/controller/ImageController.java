package org.dog.spring.api.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.dog.spring.api.model.Animal;
import org.dog.spring.api.model.Image;
import org.dog.spring.api.service.AnimalService;
import org.dog.spring.api.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/animalImages")
public class ImageController {
    @Autowired
    ImageService imageService;

    @Autowired
    AnimalService animalService;

    @PostMapping("/upload/{animalId}")
    public String uplaodImage(@RequestParam("imageFile") MultipartFile file,
            @PathVariable("animalId") Integer animalId
    ) throws IOException {
        Animal animal = animalService.getAnimalById(animalId);
        System.out.println("Original Image Byte Size - " + file.getBytes().length);
        Image img = new Image(
                file.getBytes(), file.getOriginalFilename(), animal, file.getContentType());
        img = imageService.save(img);

        return "";
    }

    @GetMapping(path = { "/get/{imageId}" })
    public Image getImage(@PathVariable("imageId") int imageId) throws IOException {

        Image img = imageService.getImageById(imageId);
        return img;
    }

    @RequestMapping(value = "/getAsImage/{imageId}", method = RequestMethod.GET)
    public void showImage(@PathVariable("imageId") Integer imageId, HttpServletResponse response, HttpServletRequest request)
            throws ServletException, IOException {

        Image img = imageService.getImageById(imageId);
        response.setContentType(img.getType());
        response.getOutputStream().write(img.getPicByte());

        response.getOutputStream().close();
    }
}
