package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VCrystal;
import com.afk.arena.model.VCrystalUpgrading;
import com.afk.arena.repository.VCrystalRepository;
import com.afk.arena.repository.VCrystalUpgradingRepository;

@RestController
@RequestMapping("/afk")
public class VCrystalController {

	@Autowired
	private VCrystalRepository repo;

	@Autowired
	private VCrystalUpgradingRepository repoUp;

	@GetMapping("/VCrystal")
	public List<VCrystal> getAllVCrystal() {
		return repo.findAll();
	}

	@GetMapping("/VCrystalUpgrading")
	public List<VCrystalUpgrading> getAllVCrystalUpgrading() {
		return repoUp.findAll();
	}

}
