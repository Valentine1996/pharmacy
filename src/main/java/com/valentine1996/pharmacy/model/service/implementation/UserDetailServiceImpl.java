package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.Role;
import com.valentine1996.pharmacy.model.entity.User;
import com.valentine1996.pharmacy.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserDetailServiceImpl implements UserDetailsService{
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(final String username) 
        throws UsernameNotFoundException {
        User user = userService.findByUserName(username);
        List < GrantedAuthority > authorities =
            buildUserAuthority(user.getRoles());

        return buildUserForAuthentication(user, authorities);
    }


    public org.springframework.security.core.userdetails.User buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
            user.isEnabled(), true, true, true, authorities);
    }

    public List < GrantedAuthority > buildUserAuthority(Set < Role > userRoles) {
        Set < GrantedAuthority > setAuths = new HashSet < GrantedAuthority >();

        // Build user's authorities
        for ( Role role : userRoles) {
            setAuths.add(new SimpleGrantedAuthority( role.getAuthority()));
        }

        List < GrantedAuthority > result = new ArrayList < GrantedAuthority >(setAuths);
        return result;
    }
}
