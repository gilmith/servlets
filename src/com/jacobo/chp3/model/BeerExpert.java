package com.jacobo.chp3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * este es el modelo de MVC que cogera la peticion que le pasa el servlet
 * @author jake
 *
 */

public class BeerExpert {
	
	public List<String> getBrands(String color){
		List<String> brands = new ArrayList<String>();
		if(color.equals("amber")){
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Bout Stout");
		}
		return brands;
	}

}
