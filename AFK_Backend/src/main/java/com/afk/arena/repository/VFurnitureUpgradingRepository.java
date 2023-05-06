package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VFurnitureUpgrading;

@Repository
public interface VFurnitureUpgradingRepository extends JpaRepository<VFurnitureUpgrading, Integer> {

}
