package com.pn.springbaseproject.m40Benefit;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "BEN_TB_M40_RECEIVE", schema = "SSOBENSCM")
public class BENTBM40ReceiveEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "RECEIVE_ID")
    private Long receiveId;

    @Column(name = "REQUEST_ID")
    private Long requestId;

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

    @Column(name = "BANK_ACC_NO")
    private String bankAccNo;

    @Column(name = "BANK_ACC_NAME")
    private String bankAccName;

    @Column(name = "BANK")
    private String bank;

    @Column(name = "BANK_BRANCH")
    private String bankBranch;

    @Column(name = "POSTAL_ORDER_NO")
    private String postalOrderNo;

    @Column(name = "POSTAL_ORDER_ZIPCODE")
    private String postalOrderZipcode;

    @Column(name = "SSO_OFFICE_CODE")
    private String ssoOfficeCode;

    @Column(name = "SSO_OFFICE_ID")
    private Long ssoOfficeId;

    @Column(name = "RECV_ID_CARD")
    private String recvIdCard;

    @Column(name = "RECV_TITLE")
    private String recvTitle;

    @Column(name = "RECV_NAME")
    private String recvName;

    @Column(name = "RECV_SURNAME")
    private String recvSurname;

    @Column(name = "RECV_TEL")
    private String recvTel;

    @Column(name = "RECV_RELATIONSHIP")
    private String recvRelationship;

    @Column(name = "RELATIONSHIP_CODE")
    private String relationshipCode;

    @Column(name = "RECV_TYPE")
    private String recvType;

    @Column(name = "RECV_NATION")
    private String recvNation;

    @Column(name = "RECV_PASSPORT_NO")
    private String recvPasssport;

    @Column(name = "AMOUNT")
    private Long amount;

    @Column(name = "RECV_FULLNAME")
    private String recvFullname;

    @Column(name = "ADDR_VILLAGE")
    private String addrVillage;

    @Column(name = "ADDR_SOI")
    private String addrSoi;

    @Column(name = "ADDR_MOO")
    private String addrMoo;

    @Column(name = "ADDR_TEL_NO")
    private String addrTelNo;

    @Column(name = "ADDR_MOBILE_NO")
    private String addrMobileNo;

    @Column(name = "ADDR_EMAIL")
    private String addrEmail;


}