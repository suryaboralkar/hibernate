package com.xworkz.service;

import com.xworkz.DTO.PizzaDTO;

public interface PizzaService {
	
	public void validatePizzaData(PizzaDTO dto);
	public void FetchData();
	public void validateUpdate();
	public void deleteData();

}
