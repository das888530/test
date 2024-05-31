package com.protfolio.demo.DTO;



import lombok.Builder;
import lombok.Data;

@Data@Builder
public class UserDto {

    private String user_name;
    private String name;
    private String created_on;
    private String update_on;

}
