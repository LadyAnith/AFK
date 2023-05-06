package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VGears;
import com.afk.arena.repository.VGearsRepository;

@RestController
@RequestMapping("/afk")
public class VGearsController {

	@Autowired
	private VGearsRepository repo;

	@GetMapping("VGears")
	public List<VGears> getAllVGears() {
		return repo.findAll();
	}
}