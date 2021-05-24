package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.InstaDTO;

public interface InstaService {
	
	public boolean validataInstaDetails(InstaDTO dto);
         public void fetchInstaData();
}
