package com.dashboard.maicosoft.model;

import com.dashboard.maicosoft.dto.RegisterCompanyDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "companies")
@Entity(name =  "Company")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String cnpj;
    private int companyStoreIdNumber;
    private String companyAddressStreet;
    private String companyAddressDistrict;
    private String companyFantasyName;
    private String companyLegalName;
    private char companyType;
    private String companyCep;
    private String companyState;
    private String companyCityCode;
    private String companyCity;
    private String companyRegion;
    private String companyCountryDescription;
    private String companyCountryId;
    private String companyPhoneCode;
    private String companyPhone;
    private String companyBirthDate;
    private String companyHomePage;
    private boolean isActive;


    public Company(RegisterCompanyDTO registerCompanyDTO) {
        this.cnpj = registerCompanyDTO.cnpj();
        this.companyStoreIdNumber = registerCompanyDTO.companyStoreIdNumber();
        this.companyAddressStreet = registerCompanyDTO.companyAddressStreet();
        this.companyAddressDistrict = registerCompanyDTO.companyAddressDistrict();
        this.companyFantasyName = registerCompanyDTO.companyFantasyName();
        this.companyLegalName = registerCompanyDTO.companyLegalName();
        this.companyType = registerCompanyDTO.companyType();
        this.companyCep = registerCompanyDTO.companyCep();
        this.companyState = registerCompanyDTO.companyState();
        this.companyCityCode = registerCompanyDTO.companyCityCode();
        this.companyCity = registerCompanyDTO.companyCity();
        this.companyRegion = registerCompanyDTO.companyRegion();
        this.companyCountryDescription = registerCompanyDTO.companyCountryDescription();
        this.companyCountryId = registerCompanyDTO.companyCountryId();
        this.companyPhoneCode = registerCompanyDTO.companyPhoneCode();
        this.companyPhone = registerCompanyDTO.companyPhone();
        this.companyBirthDate = registerCompanyDTO.companyBirthDate();
        this.companyHomePage = registerCompanyDTO.companyHomePage();
        this.isActive = true;
    }
}
