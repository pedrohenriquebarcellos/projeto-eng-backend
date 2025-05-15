package com.dashboard.maicosoft.controller;

import com.dashboard.maicosoft.dto.CompanyDetailsDTO;
import com.dashboard.maicosoft.dto.RegisterCompanyDTO;
import com.dashboard.maicosoft.dto.RegisterConfirmationDTO;
import com.dashboard.maicosoft.dto.UpdateCompanyDTO;
import com.dashboard.maicosoft.repository.CompanyRepository;
import com.dashboard.maicosoft.service.CompanyService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.stream.Stream;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    CompanyService companyService = new CompanyService();

    @Autowired
    CompanyRepository companyRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<RegisterConfirmationDTO> registerCompany(@RequestBody @Valid RegisterCompanyDTO registerCompanyDTO, UriComponentsBuilder uriBuilder) {
        var company = companyService.register(registerCompanyDTO);
        var uri = uriBuilder.path("/companies/{id}").buildAndExpand(company.getId()).toUri();

        return ResponseEntity.created(uri).body(new RegisterConfirmationDTO(company));
    }

    @GetMapping
    public ResponseEntity<Stream<CompanyDetailsDTO>> getAllCompanies() {
        var companyList = companyRepository.findAll().stream().map(CompanyDetailsDTO::new);

        return ResponseEntity.ok(companyList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDetailsDTO> getCompany(@PathVariable Long id) {
        var company = companyRepository.findCompaniesById(id);

        return ResponseEntity.ok(new CompanyDetailsDTO(company));
    }


    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<CompanyDetailsDTO> updateCompany(@RequestBody @Valid UpdateCompanyDTO updateCompanyDTO, @PathVariable Long id) {
        var company = companyRepository.getReferenceById(id);
        companyService.update(updateCompanyDTO, id);

        return ResponseEntity.ok(new CompanyDetailsDTO(company));
    }
}
