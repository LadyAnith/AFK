package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VCrystal;

@Repository
public interface VCrystalRepository extends JpaRepository<VCrystal, Integer> {

}
