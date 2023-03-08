package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Football")
public class Model {
	@Id
	private int sno;
	private String name;
	private int age;
	private String position;
	private int jerseyno;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public Model(int sno, String name, int age, String position, int jerseyno) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.position = position;
		this.jerseyno = jerseyno;
	}
	public Model() {
		
	}
	
	public String toString() {
		return "S.No="+sno+"Name="+name+"Age="+age+"Position="+position+"Jerseyno="+jerseyno
				;
	}
	

}
