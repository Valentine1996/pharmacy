package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.Role;

import java.util.List;

public interface RoleService {
    //- SECTION :: MAIN -//
    /**
     * Find styles for page
     *
     * @return List < Role > List of Roles
     */
    public List < Role > findAll();

    /**
     * Create
     *
     * @param Role Data for create new Role
     * @return Created Role
     */
    public Role create( Role Role );

    /**
     * Find Role by id
     *
     * @param id Unique identificator
     * @return Role Found
     */
    public Role find( Long id );

    /**
     * Find Role by id
     *
     * @param authority  Unique identificator
     * @return Role Found
     */
    public Role findByAuthority( String authority );

    /**
     * Update
     *
     * @param Role Role for update
     * @return Role Updated
     */
    public Role update( Role Role );

    /**
     * Delete
     *
     * @param id Identificator of Role
     */
    public void delete( Long id );
}
