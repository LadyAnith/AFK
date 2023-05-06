package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VEngraving;
import com.afk.arena.repository.VEngravingRepository;

@RestController
@RequestMapping("/afk")
public class VEngravingController {

	@Autowired
	private VEngravingRepository repo;

	@GetMapping("/VEngraving")
	public List<VEngraving> getAllVEngraving() {
		return repo.findAll();
	}
}