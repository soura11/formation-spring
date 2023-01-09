package com.example.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guitariste {

	@Autowired
	private Guitare guitare;

	public Guitariste() {
		// TODO Auto-generated constructor stub
	}

	public void getJouer() {
		System.out.println("Le guitariste joue de la : " + this.guitare.jouer());
	}

}
