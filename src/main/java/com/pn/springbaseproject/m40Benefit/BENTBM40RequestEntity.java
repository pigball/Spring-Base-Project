package com.pn.springbaseproject.m40Benefit;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.io.Serializable;
import java.math.BigDecimal;

@EntityListeners(AuditingEntityListener.class)
@Entity(name = "BEN_TB_M40_REQUEST")
public class BENTBM40RequestEntity  extends AuditEntity implements Serializable {
    @Column(name = "REQUEST_ID")
    private Long requestID;

    @Column(name = "REQUEST_NO")
    private Long requestNo;

    @Column(name = "TITLE")
    private String title;

}
