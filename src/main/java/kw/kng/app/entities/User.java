package kw.kng.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User 
{
	@Id
	private String name;
	private String email;
	private Integer phno;

}
