package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VSignatureUpgrading;

@Repository
public interface VSignatureUpgradingRepository extends JpaRepository<VSignatureUpgrading, Integer> {

}
