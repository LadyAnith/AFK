package com.afk.arena.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.Data;

@Data
@Immutable
@Entity
@Table(name = "v_crystal_upgrading")
public class VCrystalUpgrading {
	@Id
	private int id;
	private String name;
	private boolean upgrading;
	private String type;
	private String faction;
	private String ascension;
	private int crystal;
}
