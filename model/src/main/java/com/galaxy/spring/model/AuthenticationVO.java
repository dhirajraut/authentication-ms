package com.galaxy.spring.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationVO {

    private String userId;
    private String password;
    private String locale;
    private int timeoutInSeconds;
}
