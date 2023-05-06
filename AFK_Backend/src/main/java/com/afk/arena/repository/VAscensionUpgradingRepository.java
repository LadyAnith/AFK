package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VAscensionUpgrading;

@Repository
public interface VAscensionUpgradingRepository extends JpaRepository<VAscensionUpgrading, Integer> {

}
