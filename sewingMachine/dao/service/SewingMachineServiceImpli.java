package com.xworkz.sewingMachine.dao.service;

import com.xworkz.sewingMachine.dao.SewingMachineDAO;
import com.xworkz.sewingMachine.dao.SewingMachineDAOImpli;
import com.xworkz.sewingMachine.dto.SewingMachineDTO;

public class SewingMachineServiceImpli implements SewingMachineService {
	SewingMachineDAO impli = new SewingMachineDAOImpli();

	@Override
	public void validateSewingMachineDetails(SewingMachineDTO dto) {
		boolean res = true;
		if (dto.getName() == null) {
			System.out.println("please enter the name");
			res = false;
		}
		if (dto.getColour() == null || dto.getColour().length() <= 4) {
			System.out.println("please enter valid colour name");
			res = false;
		}
		if (dto.getPrice() == 0 || dto.getPrice() < 999) {
			System.out.println("please enter valid price");
			res = false;

		}
		if(dto.getType()==null) {
			System.out.println("please enter the type");
			res=false;
		}
		if(res) {
			impli.saveData(dto);
			System.out.println("data added");
		}

	}

	@Override
	public void fetchValidData() {
		
		impli.getData();
		System.out.println("the data is validated");
		
	}

}
