package com.dashboard.maicosoft.controller;

import com.dashboard.maicosoft.dto.LoginUserDto;
import com.dashboard.maicosoft.dto.UserLoginResponseDTO;
import com.dashboard.maicosoft.service.AuthenticationService;
import com.dashboard.maicosoft.service.UserAuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationService authService;

    @Autowired
    private UserAuthService userAuthService;


    @PostMapping("/login")
    public ResponseEntity<UserLoginResponseDTO> authenticateUser(@Valid @RequestBody LoginUserDto loginUserDto) {

        var authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUserDto.userName(), loginUserDto.password()));
        UserDetails userDetails = userAuthService.loadUserByUsername(loginUserDto.userName());

        var token = authService.generateToken(userDetails.getUsername());
        System.out.println(new UserLoginResponseDTO(token, userDetails.getUsername()));

        return ResponseEntity.ok(new UserLoginResponseDTO(userDetails.getUsername(), token));
    }

}
