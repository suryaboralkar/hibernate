package com.xworkz.sewingMachine.sewingMachineTester;

import com.xworkz.sewingMachine.dao.SewingMachineDAO;
import com.xworkz.sewingMachine.dao.SewingMachineDAOImpli;
import com.xworkz.sewingMachine.dao.service.SewingMachineService;
import com.xworkz.sewingMachine.dao.service.SewingMachineServiceImpli;
import com.xworkz.sewingMachine.dto.SewingMachineDTO;

public class SewingMachineTester {

	public static void main(String[] args) {
		SewingMachineDTO dto = new SewingMachineDTO("usha", "white", 1099.00, "electric machine", true);
		  SewingMachineService impli = new SewingMachineServiceImpli();
		         // impli.validateSewingMachineDetails(dto);
		impli.fetchValidData();

	}

}
