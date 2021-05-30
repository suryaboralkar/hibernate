package com.xworkz.DAO;

import com.xworkz.DTO.PizzaDTO;

public interface PizzaDAO {
	public void savePizzaData(PizzaDTO pizzaDTO);
	public void getPizzaData(int n);
	public void updatePizzaData(int n);
	public void deleteSelectedData(int n);
	//----------by named qureis------------------
	public void fetchAllPizzaData();
	 public void getPizzaPriceByName(String pizzaName);///////////////
	public void loadFirstResultAndMaxResult(int startpoint,int endpoint);
	public void getTotalPriceOfAllPizza();
	public void getMaxPriceOfPizza();
	public void getMinPriceOfPizza();
	public void getAvgPriceOfPizza();


	
	

}
