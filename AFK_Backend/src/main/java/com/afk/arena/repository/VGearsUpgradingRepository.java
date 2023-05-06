package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VGearsUpgrading;

@Repository
public interface VGearsUpgradingRepository extends JpaRepository<VGearsUpgrading, Integer> {

}
