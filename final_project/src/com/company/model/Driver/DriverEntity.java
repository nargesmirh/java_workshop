package com.company.model.Driver;

public class DriverEntity {
    private String name,id,numberOfPlaque,certificateNumber,numberOfCardMechine,InsuranceNumber;


    public String getCertificateNumber() {
        return certificateNumber;
    }

    public DriverEntity setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }

    public String getId() {
        return id;
    }

    public DriverEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getInsuranceNumber() {
        return InsuranceNumber;
    }

    public DriverEntity setInsuranceNumber(String insuranceNumber) {
        InsuranceNumber = insuranceNumber;
        return this;
    }

    public String getName() {
        return name;
    }

    public DriverEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getNumberOfCardMechine() {
        return numberOfCardMechine;
    }

    public DriverEntity setNumberOfCardMechine(String numberOfCardMechine) {
        this.numberOfCardMechine = numberOfCardMechine;
        return this;
    }

    public String getNumberOfPlaque() {
        return numberOfPlaque;
    }

    public DriverEntity setNumberOfPlaque(String numberOfPlaque) {
        this.numberOfPlaque = numberOfPlaque;
        return this;
    }
}
