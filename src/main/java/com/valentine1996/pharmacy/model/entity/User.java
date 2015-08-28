package com.valentine1996.pharmacy.model.entity;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.validator.constraints.Length;

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
    @Length( min = 2 , max = 32)
    @Column(name = "first_name", unique=true)
    protected String firstName;

    @NotNull
    @Length( min = 2 , max = 32)
    @Column(name = "last_name", unique=true)
    protected String lastName;

    @NotNull
    @Length( min = 8, max = 32)
    @Column(name = "login", unique=true)
    protected String login;

    @NotNull
    @Email
    @Column(name = "email", unique=true)
    protected String email;

    @NotNull
    @Column(name="password")
    protected String password;

    @Column(name = "enabled", nullable = false)
    protected Boolean enabled;

    @OneToMany( fetch = FetchType.EAGER, cascade = CascadeType.PERSIST )
    @JoinTable(
        name = "user_roles",
        joinColumns = {
            @JoinColumn(
                name = "user_id",
                nullable = false,
                updatable = false
            )
        },
        inverseJoinColumns = {
            @JoinColumn(
                name = "role_id",
                nullable = false,
                updatable = false
            )
        }
    )
    protected Set < Role > roles = new HashSet<>(0);

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
