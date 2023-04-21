package com.pn.springbaseproject.m40Benefit;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "BEN_MS_M40_RIGHT", schema = "SSOBENSCM")
public class BENMSM40RightEntity extends AuditEntity implements Serializable {

    @Id
    @Column(name = "RIGHT_ID")
    private Long rightId;

    @Column(name = "PACKAGE")
    private String pacKage;

    @Column(name = "BENEFIT_TYPE")
    private String benefitType;

    @Column(name = "EFFECTIVE_DATE")
    private Date effectiveDate;

    @Column(name = "CASE_ID")
    private Long caseID;

    @Column(name = "PARAM_NAME")
    private String paramName;

    @Column(name = "PARAM_COND")
    private String paramCond;

    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Column(name = "PAY_PER")
    private String payPer;

    @Column(name = "PAY_VALUE")
    private Long payValue;

    @Column(name = "PARAM_REMARK")
    private String paramRemark;

    @Column(name = "PARAM_UNIT")
    private String paramUnit;

    @Column(name = "PAY_LIMIT")
    private String payLimit;

}
