package com.realdolmen.candyshop.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: make a sublcass entity of candy (use table name 'chocolate_bar'), add discriminators
@Entity
@Table (name = "cholote_bar")
@DiscriminatorValue("chocolate")
public class ChocolateBar extends Candy  {
    // TODO: add length property (int)
	private int length;

	public int getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}
	
}
