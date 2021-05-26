package com.xworkz.DAO;

import com.xworkz.DTO.PizzaDTO;

public interface PizzaDAO {
	public void savePizzaData(PizzaDTO pizzaDTO);
	public void getPizzaData();
	public void updatePizzaData();
	public void deleteSelectedData();
	

}
