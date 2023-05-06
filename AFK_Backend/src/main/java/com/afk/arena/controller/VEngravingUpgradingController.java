package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VEngravingUpgrading;
import com.afk.arena.repository.VEngravingUpgradingRepository;

@RestController
@RequestMapping("/afk")
public class VEngravingUpgradingController {

	@Autowired
	private VEngravingUpgradingRepository repo;

	@GetMapping("/VEngravingUpgrading")
	public List<VEngravingUpgrading> getAllVEngravingUpgrading() {
		return repo.findAll();
	}
}