package com.dashboard.maicosoft.dto;

import com.dashboard.maicosoft.model.Company;

public record RegisterConfirmationDTO(String cnpj,
                                      String companyAddressStreet,
                                      String companyAddressDistrict,
                                      String companyState,
                                      String companyCity,
                                      String companyPhoneCode,
                                      String companyPhone) {

    public RegisterConfirmationDTO(Company company) {
        this(company.getCnpj(), company.getCompanyAddressStreet(), company.getCompanyAddressDistrict(),
                company.getCompanyState(), company.getCompanyCity(), company.getCompanyPhoneCode(), company.getCompanyPhone());
    }
}
