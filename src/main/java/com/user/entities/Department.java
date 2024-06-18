package com.user.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@Data
public class Department {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int departmentid;

	    //@Column(name = "", nullable = false, length = 100)
	    private String name;
	    
	    private String userId;
	    
}
