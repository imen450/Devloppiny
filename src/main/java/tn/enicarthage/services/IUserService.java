package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.user;

public interface IUserService {

	public void create(user user);
	public List<user> getAllUser();
	public void delete(Long userId);
	public void update(user user);
	public user search(Long id);
}
