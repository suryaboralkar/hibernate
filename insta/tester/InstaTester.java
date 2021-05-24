package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dto.InstaDTO;
import com.xworkz.xworkzapp.service.InstaService;
import com.xworkz.xworkzapp.service.InstaServiceImpli;

public class InstaTester {

	public static void main(String[] args)

	{
		InstaService impli = new InstaServiceImpli();
		InstaDTO dto = new InstaDTO("suryaprakash", "surya1234", 6, 6, "public", true);
		//impli.validataInstaDetails(dto);
		impli.fetchInstaData();
		
	}

}
