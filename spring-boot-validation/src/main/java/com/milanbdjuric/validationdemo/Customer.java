package com.milanbdjuric.validationdemo;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 2, message = "is required")
    private String lastName;
    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less then or equal to ten")
    private Integer freePasses;
    @Pattern(regexp = "^[0-9]{5}", message = "only 5 digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
