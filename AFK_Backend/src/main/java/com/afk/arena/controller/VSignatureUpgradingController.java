package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VSignatureUpgrading;
import com.afk.arena.repository.VSignatureUpgradingRepository;

@RestController
@RequestMapping("/afk")
public class VSignatureUpgradingController {

	@Autowired
	private VSignatureUpgradingRepository repo;

	@GetMapping("VSignatureUpgrading")
	public List<VSignatureUpgrading> getAllVSignatureUpgrading() {
		return repo.findAll();
	}
}