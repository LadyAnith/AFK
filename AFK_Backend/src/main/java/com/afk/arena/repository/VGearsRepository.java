package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VGears;

@Repository
public interface VGearsRepository extends JpaRepository<VGears, Integer> {

}
