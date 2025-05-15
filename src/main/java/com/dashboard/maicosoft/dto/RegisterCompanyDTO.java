package com.dashboard.maicosoft.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterCompanyDTO(

        @NotBlank String cnpj,
        @NotNull int companyStoreIdNumber,
        @NotBlank String companyAddressStreet,
        @NotBlank String companyAddressDistrict,
        @NotBlank String companyFantasyName,
        @NotBlank String companyLegalName,
        @NotNull char companyType,
        @NotBlank String companyCep,
        @NotBlank String companyState,
        @NotBlank String companyCityCode,
        @NotBlank String companyCity,
        String companyRegion,
        String companyCountryDescription,
        String companyCountryId,
        @NotBlank String companyPhoneCode,
        @NotBlank String companyPhone,
        String companyBirthDate,
        String companyHomePage) { }
