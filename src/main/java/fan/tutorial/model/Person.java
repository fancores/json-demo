package fan.tutorial.model;

import java.util.Date;

public class Person {

	private String sex;
	private String name;
	private Date birthdate;
	private String birthplace;
	
	public Person(){
		
	}
	
	public Person(String name, String sex, Date birthdate, String birthplace){
		this.sex = sex;
		this.name = name;
		this.birthdate = birthdate;
		this.birthplace = birthplace;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return name + "  " + sex + "  " + birthplace;
	}
}