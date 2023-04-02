package org.dog.spring.api.repository;

import org.dog.spring.api.model.Images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagesRepository extends JpaRepository<Images, Integer> {

}
