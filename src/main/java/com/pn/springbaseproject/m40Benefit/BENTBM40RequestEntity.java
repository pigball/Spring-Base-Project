package com.pn.springbaseproject.m40Benefit;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "BEN_TB_M40_REQUEST", schema = "SSOBEMSCM")
public class BENTBM40RequestEntity  extends AuditEntity implements Serializable {

    @Id
    @Column(name = "REQUEST_ID")
    private Long requestID;

    @Column(name = "REQUEST_NO")
    private String requestNo;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "ID_CARD")
    private String idCard;

    @Column(name = "BENEFIT_TYPE")
    private String benefitType ;

    @Column(name = "ADDR_NO")
    private String addrNo;

    @Column(name = "ADDR_ROAD")
    private String addrRoad;

    @Column(name = "ADDR_SUBDISTRICT")
    private String addrSubdistrict;

    @Column(name = "ADDR_DISTRICT")
    private String addrDistrict;

    @Column(name = "ADDR_PROVINCE")
    private String addrProvince;

    @Column(name = "ADDR_ZIPCODE")
    private String addrZipcode;

    @Column(name = "APPROVE_STATUS_NU")
    private String approveStatusNu;

    @Column(name = "APPROVE_DATE_NU")
    private Date approveDateNu;

    @Column(name = "APPROVE_USER_NU")
    private String approveUserNu;

    @Column(name = "APPROVE_REASON_NU")
    private String approveReasonNu;

    @Column(name = "REQ_BY_TYPE")
    private String reqByTypte;

    @Column(name = "REQ_BY_ID_CARD")
    private String reqByIdCard;

    @Column(name = "REQ_BY_TITLE")
    private String reqByTitle;

    @Column(name = "REQ_BY_NAME")
    private String reqByName;

    @Column(name = "REQ_BY_SURNAME")
    private String reqBySurname;

    @Column(name = "REQ_BY_NATION")
    private String reqByNation;

    @Column(name = "ADDR_VILLAGE")
    private String addrVillage;

    @Column(name = "ADDR_SOI")
    private String addrSoi;

    @Column(name = "ADDR_MOO")
    private String addrMoo;

    @Column(name = "ADDR_EMAIL")
    private String addrEmail;

    @Column(name = "ADDR_TEL_NO")
    private String addrTelNo;

    @Column(name = "ADDR_MOBILE_NO")
    private String addrMobileNo;

    @Column(name = "REVIEW_DATE")
    private Date reviewDate;

    @Column(name = "INSURER_ID")
    private Long insurerId ;

    @Column(name = "REQ_BY_RELATIONSHIP")
    private String reqByRelationship;

    @Column(name = "SSO_OFFICE_ID")
    private Long ssoOfficeId;

    @Column(name = "SSO_OFFICE_CODE")
    private String ssoOfficeCode;

    @Column(name = "REQUEST_DATE")
    private Date requestDate;
}
