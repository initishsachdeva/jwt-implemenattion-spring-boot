package com.jwt.jwtimplementationspringboot.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username.equals("Nitish")){
            return new User("Nitish","def123",new ArrayList<>());
        }else{
            throw new UsernameNotFoundException("User not found with username - > " + username);
        }
    }
}
