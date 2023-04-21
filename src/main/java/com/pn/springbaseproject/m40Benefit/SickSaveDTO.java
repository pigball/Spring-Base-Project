package com.pn.springbaseproject.m40Benefit;

import lombok.Data;

import java.util.Date;

@Data
public class SickSaveDTO {

    private String sk;
    private String benefitType;
    private String title;
    private String name;
    private String surname;
    private String idCard;
    private Long insurerId;
    private String reqByRelationship;
    private String reqByTitle;
    private String reqByName;
    private String reqBySurname;
    private String reqByIdCard;
    private String reqByNation;
    private String addrNo;
    private String addrVillage;
    private String addrSoi;
    private String addrRoad;
    private String addrMoo;
    private String addrSubdistrict;
    private String addrDistrict;
    private String addrProvince;
    private String addrZipcode;
    private String addrEmail;
    private String addrTelNo;
    private String addrMobileNo;
    private String ssoOfficeld;
    private String useGuarantee;
    private String  useCopyPatient;
    private Date requestDate;
    private Date reviewDate;
    private String sickCode;
    private String sickDetail;
    private String sickCase;
    private Date sickRightDate;
    private Date sickStartDate;
    private Date sickEndDate;
    private String sickAmountDay;
    private String sickLateReason;
    private String sickRemark;
    private String sickValidateRight;
    private Boolean recvStatus;
    private String recvRelationship;
    private String recvFullname;
    private String recvIdCard;
    private String recvType;
    private String bank;
    private String bankBranch;
    private String bankAccNo;
    private String bankAccName;
    private String postalOrderZip;
    private Long amount;


}
