package com.afk.arena.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import lombok.Data;

@Data
@Immutable
@Entity
@Table(name = "v_gears_upgrading")
public class VGearsUpgrading {

	@Id
	@Column(name = "hero_id")
	private Integer heroId;
	private String name;
	private int obtained;
	private String type;
	private String faction;
	private int weapon;
	private int armor;
	private int helmet;
	private int boots;
	private boolean upgrading;
	private Integer target;
	private Integer priority;
}
