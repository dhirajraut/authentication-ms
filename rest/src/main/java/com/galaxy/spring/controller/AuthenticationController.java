package com.galaxy.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.galaxy.spring.model.AuthenticationVO;
import com.galaxy.spring.service.IAuthenticationService;

@RestController
@RequestMapping(path = "v1/")
public class AuthenticationController {

    @Autowired
    IAuthenticationService service;

    @RequestMapping(method = RequestMethod.POST, path = RestConstants.URL_AUTHENTICATE_BASE)
    public String getAuthenticationToken(@RequestBody AuthenticationVO authenticationClaims) {

        /* Authenticate User. */
        service.authenticateUser(authenticationClaims);

        /* Generate Token. */
        return "";
    }
}
