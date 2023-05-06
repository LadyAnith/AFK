package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VFurnitureUpgrading;
import com.afk.arena.repository.VFurnitureUpgradingRepository;

@RestController
@RequestMapping("/afk")
public class VFurnitureUpgradingController {

	@Autowired
	private VFurnitureUpgradingRepository repo;

	@GetMapping("VFurnitureUpgrading")
	public List<VFurnitureUpgrading> getAllVFurnitureUpgrading() {
		return repo.findAll();
	}
}