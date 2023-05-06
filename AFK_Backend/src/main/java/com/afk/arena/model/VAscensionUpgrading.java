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
@Table(name = "v_ascension_upgrading")
public class VAscensionUpgrading {
	@Id
	private int id;
	private String name;
	private String type;
	private String faction;
	private String ascension;
	@Column(name = "ascension_id")
	private int ascensionId;

}
