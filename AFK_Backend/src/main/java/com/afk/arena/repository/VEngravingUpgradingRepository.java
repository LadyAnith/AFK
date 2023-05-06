package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VEngravingUpgrading;

@Repository
public interface VEngravingUpgradingRepository extends JpaRepository<VEngravingUpgrading, Integer> {

}
