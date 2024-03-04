package com.luv2code.example.demo.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentErrorResponse {
    private int status;
    private String message;
    private long timestamp;

}
