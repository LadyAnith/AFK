package com.afk.arena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afk.arena.model.VSignature;
import com.afk.arena.repository.VSignatureRepository;

@RestController
@RequestMapping("/afk")
public class VSignatureController {

	@Autowired
	private VSignatureRepository repo;

	@GetMapping("/VSignature")
	public List<VSignature> getAllVSignature() {
		return repo.findAll();
	}
}
