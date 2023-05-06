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
@Table(name = "v_ascension")
public class VAscension {
	@Id
	private int id;
	private String name;
	private String avatar;
	private boolean upgrading;
	private String type;
	private String faction;
	private String ascension;
	@Column(name = "ascension_id")
	private int ascensionId;

}
