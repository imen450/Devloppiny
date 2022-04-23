package tn.enicarthage.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import tn.enicarthage.Repository.userRepository;
import tn.enicarthage.entities.Role;
import tn.enicarthage.entities.user;

public class UserService implements IUserService {
	
	@Autowired
	userRepository UR;

	@Override
	public void create(user user) {
		Long id_user=user.getId_user();
		String name=user.getName();
		String surname=user.getSurname();
		 String pseudo=user.getPseudo();
		 String email=user.getEmail();
		 String tel=user.getTel();
		String country=user.getCountry();
		Role role=user.getRole();
		user u=new user(id_user, name,surname,pseudo, email,  tel, country,
				 role);
		 UR.save(u);
	}

	@Override
	public List<user> getAllUser() {
		return UR.findAll();
	}

	@Override
	public void delete(Long userId) {
        UR.deleteById(userId);

	}

	@Override
	public void update(user user ) {
		user currentUser = UR.findById(user.getId_user()).get();

        currentUser.setCountry(user.getCountry());
        currentUser.setEmail(user.getEmail());
        currentUser.setId_user(user.getId_user());
        currentUser.setName(user.getName());
        currentUser.setPseudo(user.getPseudo());
        currentUser.setRole(user.getRole());
        currentUser.setSurname(user.getSurname());
        currentUser.setTel(user.getTel());

        UR.save(currentUser);
		
	}

	@Override
	public user search(Long id) {
        return UR.getById(id);
	}

}
