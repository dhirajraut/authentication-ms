package com.galaxy.spring.service;

import com.galaxy.spring.model.AuthenticationVO;

public interface IAuthenticationService {

    public void authenticateUser(AuthenticationVO authenticationClaims);
}
