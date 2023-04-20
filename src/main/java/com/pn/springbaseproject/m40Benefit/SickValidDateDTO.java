package com.pn.springbaseproject.m40Benefit;

import lombok.Data;

@Data
public class SickValidDateDTO {
    private Integer insurerId;
    private Boolean useGuarantee;
    private Integer sickAmountDay;
    private Integer sickCase;
}
