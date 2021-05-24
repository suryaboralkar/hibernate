package com.xworkz.sewingMachine.dao.service;

import com.xworkz.sewingMachine.dto.SewingMachineDTO;

public interface SewingMachineService {
	
	public void validateSewingMachineDetails(SewingMachineDTO dto);
	public void fetchValidData();

}
