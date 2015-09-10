package org.sergio.jtaSpringProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.log4j.Logger;

@Entity
public class Person {

	private static final Logger logger = Logger.getLogger(Person.class);
	
	private Long id;
	
	private String name;
	
	public Person(){
		super();
		if(logger.isTraceEnabled()){
			logger.trace("Person()");
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		if(logger.isTraceEnabled()){
			logger.trace("getId()");
		}
		return id;
	}

	public void setId(Long id) {
		if(logger.isTraceEnabled()){
			logger.trace("setId(Long id)");
		}
		this.id = id;
	}

	@Column
	public String getName() {
		if(logger.isTraceEnabled()){
			logger.trace("getName()");
		}
		return name;
	}

	public void setName(String name) {
		if(logger.isTraceEnabled()){
			logger.trace("setName(String name)");
		}
		this.name = name;
	}

	@Override
	public String toString() {
		if(logger.isTraceEnabled()){
			logger.trace("toString()");
		}
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + id);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
