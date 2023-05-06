package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VCrystalUpgrading;

@Repository
public interface VCrystalUpgradingRepository extends JpaRepository<VCrystalUpgrading, Integer> {

}
