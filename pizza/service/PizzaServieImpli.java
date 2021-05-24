package com.xworkz.service;

import com.xworkz.DAO.PizzaDAO;
import com.xworkz.DAO.PizzaDAOImpli;
import com.xworkz.DTO.PizzaDTO;

public class PizzaServieImpli implements PizzaService {
	PizzaDAO dao = new PizzaDAOImpli();

	@Override
	public void validatePizzaData(PizzaDTO dto) {
		boolean res = true;
		if (dto.getName() == null) {
			System.out.println("please select the pizza name");
			res = false;
		}
		if (dto.getLocation() == null || dto.getLocation().length() < 5) {
			System.out.println("please check with your entered location");
			res = false;
		}
		if (dto.getPrice() == 0 || dto.getPrice() < 55) {
			System.out.println("please enter valid price");
			res=false;
		}
		if (dto.getSize() == null) {
			System.out.println("please select the size");
			res = false;
		}
		if (dto.getType() == null) {
			System.out.println("please select the type");
			res=false;
		}
		if (res)

		{
			dao.savePizzaData(dto);
			System.out.println("data added successfull" + res);
		}
	}

	@Override
	public void FetchData() {
		dao.getPizzaData();
		System.out.println("this is varified data");
	}
}