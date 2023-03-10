package kw.kng.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kw.kng.app.entities.User;
import kw.kng.app.repository.UserRepository;
import kw.kng.app.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	UserRepository urepo;
	
	@Override
	public void saveUser(User us) 
	{
		urepo.save(us);
	}
	

}
