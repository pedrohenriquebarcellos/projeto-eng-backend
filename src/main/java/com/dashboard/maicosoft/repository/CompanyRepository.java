package com.dashboard.maicosoft.repository;

import com.dashboard.maicosoft.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company findCompaniesById(Long id);

}
