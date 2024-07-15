package com.sbcogrs.sbcogrs;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //without scope, this method only validates the token but not if this api has the permission to call
    @GetMapping(path = "/GetUser")
    @PreAuthorize("hasAuthority('SCOPE_sbuserapi/readuser')")
    public String getUser() {
        //business logic
        return "Access Granted: Reading user details";
    }

    @PostMapping(path = "/UpdateUser")
    @PreAuthorize("hasAuthority('SCOPE_sbuserapi/updateuser')")
    public String writeUser(){
        return "Access Granted: Reading writing details";
    }


}
