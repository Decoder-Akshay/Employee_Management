package com.employee.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.QualificationMaster;

@Repository
public interface QualificationMasterRepository extends JpaRepository<QualificationMaster, Long> {

}
