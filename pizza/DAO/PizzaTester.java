package com.xworkz.DAO;

import com.xworkz.DTO.PizzaDTO;
import com.xworkz.service.PizzaService;
import com.xworkz.service.PizzaServieImpli;

public class PizzaTester {
	
	public static void main(String[] args) {
		PizzaService impli = new PizzaServieImpli();
		
		PizzaDTO dto = new PizzaDTO("corn", "hyderabad", 80, true, "regular", "veg");
		impli.FetchData();
		//impli2.validatePizzaData(dto);
	}

}