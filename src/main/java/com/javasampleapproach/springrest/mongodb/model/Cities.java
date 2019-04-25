package com.javasampleapproach.springrest.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "customer.cities")
public class Cities {
    @Id
    private String dbId;
 
    private String id;
    private String name;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDbId() {
		return dbId;
	}
	public void setDbId(String dbId) {
		this.dbId = dbId;
	}
	
	public Cities(String dbId, String id, String name) {
		super();
		this.dbId = dbId;
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cities [dbId=" + dbId + ", id=" + id + ", name=" + name + "]";
	}

    
}
