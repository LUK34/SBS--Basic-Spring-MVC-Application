package kw.kng.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kw.kng.app.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> 
{
	

}
