package com.employee.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.PersonalMaster;

@Repository
public interface PersonalMasterRepository extends JpaRepository<PersonalMaster, Long> {

}
