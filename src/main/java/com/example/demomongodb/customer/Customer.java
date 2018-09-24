package com.example.demomongodb.customer;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import javax.validation.constraints.NotNull;

@Data
public class Customer {
    @Id
    private String id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private Integer age;
    @NotNull
    private String email;
	public void setId(String id2) {
	}

}
