package com.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblEmployeeMaster")
public class EmployeeMaster {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "personal_id", referencedColumnName = "id")
    private PersonalMaster personalMaster;

    @Column(name = "JoiningDate", nullable = false)
    private String joiningDate;

    @Column(name = "Salary", nullable = false)
    private double salary;

    @ManyToOne
    @JoinColumn(name = "qualification_id", referencedColumnName = "id")
    private QualificationMaster qualificationMaster;

    @Column(name = "isFresherEmployee", nullable = false)
    private boolean isFresherEmployee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PersonalMaster getPersonalMaster() {
		return personalMaster;
	}

	public void setPersonalMaster(PersonalMaster personalMaster) {
		this.personalMaster = personalMaster;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public QualificationMaster getQualificationMaster() {
		return qualificationMaster;
	}

	public void setQualificationMaster(QualificationMaster qualificationMaster) {
		this.qualificationMaster = qualificationMaster;
	}

	public boolean isFresherEmployee() {
		return isFresherEmployee;
	}

	public void setFresherEmployee(boolean isFresherEmployee) {
		this.isFresherEmployee = isFresherEmployee;
	}

	public EmployeeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeMaster(Long id, PersonalMaster personalMaster, String joiningDate, double salary,
			QualificationMaster qualificationMaster, boolean isFresherEmployee) {
		super();
		this.id = id;
		this.personalMaster = personalMaster;
		this.joiningDate = joiningDate;
		this.salary = salary;
		this.qualificationMaster = qualificationMaster;
		this.isFresherEmployee = isFresherEmployee;
	}
    
}
