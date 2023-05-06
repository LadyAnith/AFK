package com.afk.arena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afk.arena.model.VSignature;

@Repository
public interface VSignatureRepository extends JpaRepository<VSignature, Integer> {

}
