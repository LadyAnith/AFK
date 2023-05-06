package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VGearsUpgrading;
import com.afk.arena.repository.VGearsUpgradingRepository;

@RestController
@RequestMapping("/afk")
public class VGearsUpgradingController {

	@Autowired
	private VGearsUpgradingRepository repo;

	@GetMapping("VGearsUpgrading")
	public List<VGearsUpgrading> getAllVGearsUpgrading() {
		return repo.findAll();
	}
}