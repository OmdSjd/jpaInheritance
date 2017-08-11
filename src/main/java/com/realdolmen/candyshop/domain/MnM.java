package com.realdolmen.candyshop.domain;

import javax.persistence.*;

// TODO: make a sublcass entity of candy, add discriminators
@Entity
@DiscriminatorValue("m&m")
public class MnM extends Candy {
    // TODO: add property nuts (boolean)
	private Boolean nuts;

	public Boolean getNuts() {
		return nuts;
	}

	public void setNuts(Boolean nuts) {
		this.nuts = nuts;
	}
}
