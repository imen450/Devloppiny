package tn.enicarthage.services;

import tn.enicarthage.entities.Admin;

public interface IAdminService {
	
	public boolean insert(Admin admin);
	public Admin getAdminById(Long adminId);

}
