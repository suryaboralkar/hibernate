package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.InstaDTO;

public interface InstaDAO {
	public void saveData(InstaDTO dto);
	public void getData();
	public void updataInstaData();
	public void deleteselectedData();

}
