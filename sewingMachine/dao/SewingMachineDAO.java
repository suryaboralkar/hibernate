package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.SewingMachineDTO;

public interface SewingMachineDAO {
	public void saveData(SewingMachineDTO sewingDTO);
	public void getData();
	public void updateData();
	public void deleteData();

}
