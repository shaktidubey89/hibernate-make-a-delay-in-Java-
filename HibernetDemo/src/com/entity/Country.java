package com.entity;

public class Country {
	
	private String code;
	private String Name;
	private String continent;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", Name=" + Name + ", continent=" + continent + "]";
	}
	
	

}
