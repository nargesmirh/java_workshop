package com.company.model.Officer;

public class OfficerEntity {
    private String officerName,passwordOfficer,officerCode,carOwnerName,dates,times,descriptionOftheAccident,numberOfPlaque,certificateNumber
            ,numberOfCardmachine,insuranceNumber,recordViolations,negativePoint;
    private long theAmountOfFines;


    public String getCarOwnerName() {
        return carOwnerName;
    }

    public OfficerEntity setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
        return this;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public OfficerEntity setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }

    public String getDescriptionOftheAccident() {
        return descriptionOftheAccident;
    }

    public OfficerEntity setDescriptionOftheAccident(String descriptionOftheAccident) {
        this.descriptionOftheAccident = descriptionOftheAccident;
        return this;
    }

    public String getDates() {
        return dates;
    }

    public OfficerEntity setDates(String dates) {
        this.dates = dates;
        return this;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public OfficerEntity setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
        return this;
    }

    public String getNegativePoint() {
        return negativePoint;
    }

    public OfficerEntity setNegativePoint(String negativePoint) {
        this.negativePoint = negativePoint;
        return this;
    }

    public String getNumberOfCardmachine() {
        return numberOfCardmachine;
    }

    public OfficerEntity setNumberOfCardmachine(String numberOfCardmachine) {
        this.numberOfCardmachine = numberOfCardmachine;
        return this;
    }

    public String getNumberOfPlaque() {
        return numberOfPlaque;
    }

    public OfficerEntity setNumberOfPlaque(String numberOfPlaque) {
        this.numberOfPlaque = numberOfPlaque;
        return this;
    }

    public String getOfficerCode() {
        return officerCode;
    }

    public OfficerEntity setOfficerCode(String officerCode) {
        this.officerCode = officerCode;
        return this;
    }

    public String getOfficerName() {
        return officerName;
    }

    public OfficerEntity setOfficerName(String officerName) {
        this.officerName = officerName;
        return this;
    }

    public String getPasswordOfficer() {
        return passwordOfficer;
    }

    public OfficerEntity setPasswordOfficer(String passwordOfficer) {
        this.passwordOfficer = passwordOfficer;
        return this;
    }

    public String getRecordViolations() {
        return recordViolations;
    }

    public OfficerEntity setRecordViolations(String recordViolations) {
        this.recordViolations = recordViolations;
        return this;
    }

    public String getTimes() {
        return times;
    }

    public OfficerEntity setTimes(String times) {
        this.times = times;
        return this;
    }

    public long getTheAmountOfFines() {
        return theAmountOfFines;
    }

    public OfficerEntity setTheAmountOfFines(long theAmountOfFines) {
        this.theAmountOfFines = theAmountOfFines;
        return this;
    }
}
