package com.amdocs.kogito.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private String mobileNumber;
    private String secondaryMobile;
    private char gender;
    
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dob;

}