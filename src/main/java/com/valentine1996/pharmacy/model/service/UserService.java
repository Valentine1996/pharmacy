package com.valentine1996.pharmacy.model.service;

import com.valentine1996.pharmacy.model.entity.User;

import java.util.List;

/**
 * Service for work with user
 *
 * @version 1.0
 */
public interface UserService {
    //- SECTION :: MAIN -//
    /**
     * Find users
     *
     * @return List < User > List of Users
     */
    public List< User > findAll();

    /**
     * Create
     *
     * @param user Data for create new User
     * @return Created User
     */
    public User create( User user );

    /**
     * Find User by id
     *
     * @param id Unique identificator
     * @return User Found
     */
    public User find( Long id );

    /**
     * Update
     *
     * @param user User for update
     * @return User Updated
     */
    public User update( User user );

    /**
     * Find User by name
     *
     * @param login
     * @return User Found
     */
    public User findByLogin(String login);

    /**
     * Delete
     *
     * @param id Identificator of User
     */
    public void delete( Long id );
}
