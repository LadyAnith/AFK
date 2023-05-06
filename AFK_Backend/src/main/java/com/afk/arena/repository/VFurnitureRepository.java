package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VFurniture;

@Repository
public interface VFurnitureRepository extends JpaRepository<VFurniture, Integer> {

}
