package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VAscension;
import com.afk.arena.repository.VAscensionRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/afk")
public class VAscensionController {

	@Autowired
	private VAscensionRepository repo;

	@GetMapping("/VAscension")
	public List<VAscension> getAllVAscension() {
		return repo.findAll();
	}
}
