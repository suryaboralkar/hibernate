package com.xworkz.service;

import com.xworkz.DTO.PizzaDTO;

public interface PizzaService {
	
	public void validatePizzaData(PizzaDTO dto);
	public void FetchData(int n);
	public void validateUpdate(int n);
	public void deleteData(int n);

}
