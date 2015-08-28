/// *** *** Model :: Service :: Implementation :: UserServiceImpl *** *** *///
/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-18-08 10:50:30 :: 2014--08 18:15:20
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***///
package com.valentine1996.pharmacy.model.service.implementation;

import com.valentine1996.pharmacy.model.entity.User;
import com.valentine1996.pharmacy.model.repository.UserRepository;
import com.valentine1996.pharmacy.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    /**
     * Find users
     *
     * @return List < User > List of Users
     */
    @Override
    public List < User > findAll() {
        return this.userRepository.findAll();
    }

    /**
     * Create
     *
     * @param user Data for create new User
     * @return Created User
     */
    @Override
    public User create(User user) {
        return this.userRepository.save( user );
    }

    /**
     * Find User by id
     *
     * @param id Unique identificator
     * @return User Found
     */
    @Override
    public User find(Long id) {
        return this.userRepository.findOne( id );
    }

    /**
     * Update
     *
     * @param user User for update
     * @return User Updated
     */
    @Override
    public User update(User user) {
        return this.userRepository.save( user );
    }

    /**
     * Find User by name
     *
     * @param login
     * @return User Found
     */
    @Override
    @SuppressWarnings("unchecked")
    public User findByLogin(String login) {
        return this.userRepository.findByLogin(login);
    }

    /**
     * Delete
     *
     * @param id Identificator of User
     */
    @Override
    public void delete(Long id) {

    }
}
