package tn.enicarthage.services;

import java.util.List;

import tn.enicarthage.entities.user;

public interface IUserService {

	public boolean insert(user user);
	public List<user> getAllUser();
	public boolean delete(String userId);
	public boolean update(user user);
	public user getUserByEmail(String email);
}
