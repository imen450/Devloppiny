package tn.enicarthage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enicarthage.Repository.AdminRepository;
import tn.enicarthage.entities.Admin;

@Service
public class AdminServiceImpl implements IAdminService{
	
	@Autowired
	AdminRepository AR;

	@Override
	public boolean insert(Admin admin) {
		try {
		AR.save(admin);
		return true;
				
	}catch (Exception e) {
		System.out.println("Exception(ADD): " + e);
		return false;
		}
	}

	@Override
	public Admin getAdminById(Long adminId) {
		
		return AR.getById(adminId);
	}

}
