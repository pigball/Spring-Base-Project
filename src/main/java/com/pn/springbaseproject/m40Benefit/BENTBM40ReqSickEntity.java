package com.pn.springbaseproject.m40Benefit;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "BEN_TB_M40_REQ_SICK", schema = "SSOBEMSCM")
public class BENTBM40ReqSickEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "REQ_SICK_ID")
    private Long reqSickId;

    @Column(name = "REQUEST_ID")
    private Long requestId;

    @Column(name = "USE_GUARANTEE")
    private String useGuarantee;

    @Column(name = "USE_COPY_PATIENT")
    private String useCopyPatient;

    @Column(name = "SICK_CODE")
    private String sickCode;

    @Column(name = "SICK_DETAIL")
    private String sickDetail;

    @Column(name = "SICK_START_DATE")
    private Date sickStartDate;

    @Column(name = "SICK_AMOUNT_DAY")
    private Date sickAmountDay;

    @Column(name = "SICK_END_DATE")
    private Date sickEndDate;

    @Column(name = "LATE_REASON")
    private String lateReason;

    @Column(name = "RAMARK")
    private String remark;

    @Column(name = "SICK_CASE")
    private String sickCase;

    @Column(name = "SICK_RIGHT_DATE")
    private Date sickRightDate;

    @Column(name = "SICK_VALIDATE_RIGHT")
    private String sickValidateRight;

}

