package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.InstaDAO;
import com.xworkz.xworkzapp.dao.InstaDAOImpli;
import com.xworkz.xworkzapp.dto.InstaDTO;

public class InstaServiceImpli implements InstaService {
	
	InstaDAO impli = new InstaDAOImpli();

	public boolean validataInstaDetails(InstaDTO dto) {
		
		boolean res=true;
		
		if(dto.getName()==null && dto.getName().length()<4) {
			System.out.println("invalid name");
			res=false;
		}if(dto.getNoOfFollowers()==0 || dto.getNoOfFollowers()<5) {
			System.out.println("please increase your followers");
		res=false;
			
		}if(dto.getNoOfFollowing()==0 || dto.getNoOfFollowing()<=5) {
			System.out.println("please increase your following");
			res=false;
		}if(dto.getPassword()==null || dto.getPassword().startsWith("INSTA")) {
			System.out.println("please check your password");
			res=false;
			
		}if(dto.getType()==null) {
			System.out.println("please mention the type");
			res=false;
		}if(res) {
			impli.saveData(dto);
			
		}else System.out.println("please enter valid data");
		
	
	
	return res;
	}

	public void fetchInstaData() {
		impli.getData();
		System.out.println("this is varified data");
		
	}

}
