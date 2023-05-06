package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VAscension;

@Repository
public interface VAscensionRepository extends JpaRepository<VAscension, Integer> {

}
