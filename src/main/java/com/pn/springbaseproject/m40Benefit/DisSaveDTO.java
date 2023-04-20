package com.pn.springbaseproject.m40Benefit;

import lombok.Data;

@Data
public class DisSaveDTO {

    private String sk;
    private String benefitType;
    private String title;
    private String name;
    private String surname;
    private Long idCard;
    private Long insurerId;
    private String reqByRelationship;
    private String reqByTitle;
    private String reqByName;
    private String reqBySurname;
    private Integer reqByIdCard;
    private String reqByNation;
    private Integer addrNo;
    private String addrVillage;
    private Integer addrSoi;
    private String addrRoad;
    private Integer addrMoo;
    private String addrSubdistrict;
    private String addrDistrict;
    private String addrProvince;
    private Integer addrZipcode;
    private String addrEmail;
    private Integer addrTelNo;
    private Integer addrMobileNo;
    private String ssoOfficeld;
    private Boolean useGuarantee;
    private String  useCopyPatient;
    private Integer requestDate;
    private Integer sendReviewDate;
    private String reviewBy;
    private  Integer disCode;
    private  String  disDetail;
    private Boolean disStatus;
    private Integer decisionNo;
    private Integer disStartDate;
    private String disRemark;
    private Boolean disValidate;
    private Boolean recvStatus;
    private String recvRelationship;
    private String recvFullname;
    private Long recvIdCard;
    private String recvType;
    private String bank;
    private String bankBranch;
    private Integer bankAccNo;
    private String bankAccName;
    private Integer postalOrderZip;
    private Integer amount;

}

