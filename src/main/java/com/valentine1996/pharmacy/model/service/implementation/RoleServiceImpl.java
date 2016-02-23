package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.Role;
import com.valentine1996.pharmacy.model.repository.RoleRepository;
import com.valentine1996.pharmacy.model.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;
    /**
     * Find styles for page
     *
     * @return List < Role > List of Roles
     */
    @Override
    public List < Role > findAll() {
        return this.roleRepository.findAll();
    }

    /**
     * Create
     *
     * @param role Data for create new Role
     * @return Created Role
     */
    @Override
    public Role create(Role role) {
        return this.roleRepository.save(role);
    }

    /**
     * Find Role by id
     *
     * @param id Unique identificator
     * @return Role Found
     */
    @Override
    public Role find(Long id) {
        return this.roleRepository.findOne(id);
    }

    /**
     * Update
     *
     * @param role Role for update
     * @return Role Updated
     */
    @Override
    public Role update(Role role) {
        return this.roleRepository.save( role);
    }

    /**
     * Find Role by id
     *
     * @param authority Unique identificator
     * @return Role Found
     */
    @Override
    public Role findByAuthority(String authority) {
        return this.roleRepository.findByAuthority(authority);
    }

    /**
     * Delete
     *
     * @param id Identificator of Role
     */
    @Override
    public void delete(Long id) {
        this.roleRepository.delete(id);
    }
}
