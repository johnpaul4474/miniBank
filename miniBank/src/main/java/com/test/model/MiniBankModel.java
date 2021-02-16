package com.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="miniBankUsers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MiniBankModel {
	@Id
	@GeneratedValue
	public int id;
	private String users;
	private String transaction;
	private float amount;

}
