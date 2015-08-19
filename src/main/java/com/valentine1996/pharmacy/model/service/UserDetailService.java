package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.Role;
import com.valentine1996.pharmacy.model.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Set;

/**
 * Service for work with users authority
 *
 * @version 1.0
 */
public interface UserDetailService {
    public UserDetails loadUserByUsername(final String username);

    public org.springframework.security.core.userdetails.User buildUserForAuthentication(User user,
                                            List < GrantedAuthority > authorities);

    public List<GrantedAuthority> buildUserAuthority(Set < Role > userRoles);
}
