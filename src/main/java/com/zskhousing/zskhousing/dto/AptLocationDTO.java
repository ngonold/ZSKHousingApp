package com.zskhousing.zskhousing.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AptLocationDTO {
    private String street;
    private int houseNumber;
    private int porchNumber;
    private int floorNumber;
}
