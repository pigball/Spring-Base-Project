package com.pn.springbaseproject.m40Benefit;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "BEN_TB_M40_INSURER_RIGHT", schema = "SSOBENSCM")
public class BENTBM40InsurerRightEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "INSURER_RIGHT_ID")
    private Long insurerRightId ;

    @Column(name = "INSURER_ID")
    private Long insurerId;

    @Column(name = "SSO_NO")
    private String ssoNo ;

    @Column(name = "ID_CARD_NO")
    private String idCardNo ;

    @Column(name = "SICK_CON_RIGHT")
    private String sickConRight ;

    @Column(name = "DEATH_CON_RIGHT")
    private String deathConRight ;

    @Column(name = "OLD_CON_RIGHT")
    private String oldConRight ;

    @Column(name = "CHILD_CON_RIGHT")
    private String childConRight ;

    @Column(name = "DISABILITY_CON_RIGHT1")
    private String disabilityConRight1 ;

    @Column(name = "SICK_QUOTA_CASE1")
    private Long sickQuotaCase1 ;

    @Column(name = "SICK_QUOTA_PERIOD")
    private String sickQuotaPeriod ;

    @Column(name = "IS_DEAD")
    private String isDead ;

    @Column(name = "OLD_DUP_3339")
    private String oldDup ;

    @Column(name = "LAST_VALID_CONPAID_DATE")
    private Date lastValidConpaidDate;

    @Column(name = "SICK_QUOTA_CASE2")
    private Long sickQuotaCase2;

    @Column(name = "SICK_QUOTA_CASE3")
    private Long sickQuotaCase3;

    @Column(name = "DISABILITY_CON_RIGHT2")
    private String disabilityConRight2 ;

    @Column(name = "DISABILITY_CON_RIGHT3")
    private String disabilityConRight3 ;

    @Column(name = "DISABILITY_CON_RIGHT4")
    private String disabilityConRight4 ;
}
