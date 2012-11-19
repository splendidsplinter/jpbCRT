package com.apress.springrecipes.court.service;

public class ReservationCourtNotFoundException extends RuntimeException {


    public static final long serialVersionUID = 1L;
    private String courtName;
    
    public ReservationCourtNotFoundException(String courtName) {
        this.courtName = courtName;
    }

    public String getCourtName() {
        return courtName;
    }

}
