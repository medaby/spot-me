package fr.medab.spotmebusiness.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import fr.medab.spotmebusiness.dtos.SpotCreate;
import jakarta.validation.Valid;

// /spots = collections
@RestController
@RequestMapping("/spots")
public class SpotController {

    // @RequestBody 	=> TXT/JSON
    // @ModelAttribute 	=> multipart form data
    @PostMapping
    void create(@Valid @ModelAttribute SpotCreate inputs) {
	System.out.println(inputs);
	MultipartFile image = inputs.image();
	System.out.println(image.getName());
	System.out.println(image.getSize());
	System.out.println(image.getOriginalFilename());
	System.out.println(image.getContentType());

    }
}
