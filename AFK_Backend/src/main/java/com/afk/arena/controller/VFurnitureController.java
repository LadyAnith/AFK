package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VFurniture;
import com.afk.arena.repository.VFurnitureRepository;

@RestController
@RequestMapping("/afk")
public class VFurnitureController {

	@Autowired
	private VFurnitureRepository repo;

	@GetMapping("VFurniture")
	public List<VFurniture> getAllVFurniture() {
		return repo.findAll();
	}
}