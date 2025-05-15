package com.dashboard.maicosoft.service;

import com.dashboard.maicosoft.dto.RegisterCompanyDTO;
import com.dashboard.maicosoft.dto.UpdateCompanyDTO;
import com.dashboard.maicosoft.model.Company;
import com.dashboard.maicosoft.repository.CompanyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company register(RegisterCompanyDTO data) {
        return companyRepository.save(new Company(data));
    }

    public Company update(UpdateCompanyDTO data, Long id) {
        var company = companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Company not found with this id: " + id));

        if (data.companyFantasyName() != null)
            company.setCompanyFantasyName(data.companyFantasyName());

        if (data.companyType() != null)
            company.setCompanyType(data.companyType().charAt(0));

        if (data.companyAddressStreet() != null)
            company.setCompanyAddressStreet(data.companyAddressStreet());

        if (data.companyAddressDistrict() != null)
            company.setCompanyAddressDistrict(data.companyAddressDistrict());

        if (data.companyCep() != null)
            company.setCompanyCep(data.companyCep());

        if (data.companyState() != null)
            company.setCompanyState(data.companyState());

        if (data.companyCity() != null)
            company.setCompanyCity(data.companyCity());

        if (data.companyRegion() != null)
            company.setCompanyRegion(data.companyRegion());

        if (data.companyCountryDescription() != null)
            company.setCompanyCountryDescription(data.companyCountryDescription());

        if (data.companyPhoneCode() != null)
            company.setCompanyPhoneCode(data.companyPhoneCode());

        if (data.companyPhone() != null)
            company.setCompanyPhone(data.companyPhone());

        if (data.companyBirthDate() != null)
            company.setCompanyBirthDate(data.companyBirthDate());

        if (data.companyHomePage() != null)
            company.setCompanyHomePage(data.companyHomePage());

        if (data.isActive() != null)
            company.setActive(data.isActive());

        return companyRepository.save(company);
    }


}
