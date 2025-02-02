package com.sprint.saleshistory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprint.saleshistory.entities.CountryEntity;
import com.sprint.saleshistory.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<CountryEntity> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{countryId}")
    public CountryEntity getCountryById(@PathVariable Long countryId) {
        return countryService.getCountryById(countryId);
    }

    @PostMapping
    public CountryEntity saveCountry(@RequestBody CountryEntity country) {
        return countryService.saveCountry(country);
    }

    @DeleteMapping("/{countryId}")
    public void deleteCountry(@PathVariable Long countryId) {
        countryService.deleteCountry(countryId);
    }
    
    
}
