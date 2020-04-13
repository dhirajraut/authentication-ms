package com.galaxy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.galaxy.spring.model.AuthenticationVO;

@Service
public class AuthenticationService implements IAuthenticationService {

//    @Autowired
//    AuthenticationManager authenticationManager;

    @Override
    public void authenticateUser(AuthenticationVO authenticationClaims) {

        /* Authenticate User. * /
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationClaims.getUserId(),
                                                        authenticationClaims.getPassword()));
                                                        */
    }
}
