package com.valentine1996.pharmacy.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Class for reflect table user from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
        name = "user"
)
public class User implements Serializable {
    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @Column(name = "username", unique=true)
    protected String username;

    @NotNull
    @Column(name="password")
    protected String password;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = CascadeType.PERSIST
    )
    protected List< Role > roles;

    public User() {
    }

    public User(String username, String password, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List < Role > getRoles() {
        return roles;
    }

    public void setRoles ( List < Role > roles) {
        this.roles = roles;
    }


}
