package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VAscensionUpgrading;
import com.afk.arena.repository.VAscensionUpgradingRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/afk")
public class VAscensionUpgradingController {

	@Autowired
	private VAscensionUpgradingRepository repo;

	@GetMapping("/VAscensionUpgrading")
	public List<VAscensionUpgrading> getAllVAscensionUpgrading() {
		return repo.findAll();
	}
}
