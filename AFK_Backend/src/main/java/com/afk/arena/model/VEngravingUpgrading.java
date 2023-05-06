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
@Table(name = "v_engraving_upgrading")
public class VEngravingUpgrading {
	@Id
	private int id;
	@Column(name = "hero_id")
	private Integer heroId;
	@Column(name = "prior_id")
	private Integer priorId;
	private String name;
	private boolean upgrading;
	private String type;
	private String faction;
	private int engraving;
	private Integer target;
	private Integer priority;
}
