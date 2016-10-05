package fr.icdc.dei.todolist.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private long id;
	
	@Column(nullable = false)
	private String label;
	
	@Column
	private Date beginningDate;
	
	@Column
	private Date endingDate;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Date getBeginninDate() {
		return this.beginningDate;
	}

	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}

	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
		
	}

	public Date getEndingDate() {
		return  this.endingDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
