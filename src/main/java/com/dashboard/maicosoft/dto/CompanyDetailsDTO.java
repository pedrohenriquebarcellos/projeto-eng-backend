package com.dashboard.maicosoft.dto;

import com.dashboard.maicosoft.model.Company;

public record CompanyDetailsDTO(
        int id,
        String cnpj,
        int companyStoreIdNumber,
        String companyAddressStreet,
        String companyAddressDistrict,
        String companyFantasyName,
        String companyLegalName,
        char companyType,
        String companyCep,
        String companyState,
        String companyCityCode,
        String companyCity,
        String companyRegion,
        String companyCountryDescription,
        String companyCountryId,
        String companyPhoneCode,
        String companyPhone,
        String companyBirthDate,
        String companyHomePage,
        boolean isActive
) {
    public CompanyDetailsDTO(Company company) {
        this(
                company.getId(),
                company.getCnpj(),
                company.getCompanyStoreIdNumber(),
                company.getCompanyAddressStreet(),
                company.getCompanyAddressDistrict(),
                company.getCompanyFantasyName(),
                company.getCompanyLegalName(),
                company.getCompanyType(),
                company.getCompanyCep(),
                company.getCompanyState(),
                company.getCompanyCityCode(),
                company.getCompanyCity(),
                company.getCompanyRegion(),
                company.getCompanyCountryDescription(),
                company.getCompanyCountryId(),
                company.getCompanyPhoneCode(),
                company.getCompanyPhone(),
                company.getCompanyBirthDate(),
                company.getCompanyHomePage(),
                company.isActive()
        );
    }

}
