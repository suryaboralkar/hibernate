package com.xworkz.xworkzapp.sewingMachineTester;

import com.xworkz.xworkzapp.dao.SewingMachineDAO;
import com.xworkz.xworkzapp.dao.SewingMachineDAOImpli;
import com.xworkz.xworkzapp.dao.service.SewingMachineService;
import com.xworkz.xworkzapp.dao.service.SewingMachineServiceImpli;
import com.xworkz.xworkzapp.dto.SewingMachineDTO;

public class SewingMachineTester {

	public static void main(String[] args) {
		SewingMachineDTO dto = new SewingMachineDTO("usha", "white", 1099.00, "electric machine", true);
		  SewingMachineService impli = new SewingMachineServiceImpli();
		         // impli.validateSewingMachineDetails(dto);
		impli.fetchValidData();

	}

}
