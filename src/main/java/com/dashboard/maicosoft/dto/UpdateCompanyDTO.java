package com.dashboard.maicosoft.dto;

public record UpdateCompanyDTO(
        String companyFantasyName,
        String companyType,
        String companyAddressStreet,
        String companyAddressDistrict,
        String companyCep,
        String companyState,
        String companyCity,
        String companyRegion,
        String companyCountryDescription,
        String companyPhoneCode,
        String companyPhone,
        String companyBirthDate,
        String companyHomePage,
        Boolean isActive) {

}
