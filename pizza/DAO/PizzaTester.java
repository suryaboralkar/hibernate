package com.xworkz.DAO;

import com.xworkz.DTO.PizzaDTO;
import com.xworkz.service.PizzaService;
import com.xworkz.service.PizzaServieImpli;

public class PizzaTester {
	
	public static void main(String[] args) {
		PizzaService impli = new PizzaServieImpli();
	PizzaDAO dao=	new PizzaDAOImpli();
		PizzaDTO dto = new PizzaDTO("corncheese", "hyderabad", 80, true, "regular", "veg");
		
		//impli.validatePizzaData(dto);
		//impli.FetchData(2);
		//impli.validateUpdate(2);
		//impli.deleteData();
		//dao.fetchAllPizzaData();
		//dao.getTotalPriceOfAllPizza();
		dao.getPizzaPriceByName("corn");
		//dao.getMaxPriceOfPizza();
		//dao.getMinPriceOfPizza();
		//dao.getAvgPriceOfPizza();
		//dao.loadFirstResultAndMaxResult(1,5);
	}

}
