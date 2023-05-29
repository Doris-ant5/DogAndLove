package org.dog.spring.api.repository;

import org.dog.spring.api.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    Optional<Image> findByName(String name);

    Optional<Image> getImageById (int id);

}
