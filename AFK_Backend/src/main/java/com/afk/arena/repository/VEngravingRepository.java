package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VEngraving;

@Repository
public interface VEngravingRepository extends JpaRepository<VEngraving, Integer> {

}
