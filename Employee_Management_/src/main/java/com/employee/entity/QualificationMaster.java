package com.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblQualificationMaster")
public class QualificationMaster {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Qualification", nullable = false)
    private String qualification;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public QualificationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QualificationMaster(Long id, String qualification) {
		super();
		this.id = id;
		this.qualification = qualification;
	}
    
    
}
