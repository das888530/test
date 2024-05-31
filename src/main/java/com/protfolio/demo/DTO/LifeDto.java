package com.protfolio.demo.DTO;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LifeDto {

    private int id;
    private String stage;
    private String startTime;
    private String endTime;
    private String description;
    private String status;

}
