package com.zskhousing.zskhousing.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ElectricityConsumptionDTO {
    private int totalConsumption;
    private int lastMonthConsumption;
}
