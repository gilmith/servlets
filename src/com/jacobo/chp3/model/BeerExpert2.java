package com.jacobo.chp3.model;

public class BeerExpert2 {
	
	private String tamanho;
	
	public BeerExpert2(String tamanho){
		this.tamanho = tamanho;
	}
	
	public String getPedo(){
		switch (tamanho) {
		case "pequenho":
			return "no te vas a pillar una gorda";
		case "mediano":
			return "menudo puntillo";
		case "grande":
			return "tia para";
		default:
			return "nada de nada";
		}
	}

}
