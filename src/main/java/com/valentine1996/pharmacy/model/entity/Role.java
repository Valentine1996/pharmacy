package com.valentine1996.pharmacy.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Class for reflect table user from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
        name = "role",
    uniqueConstraints = @UniqueConstraint(
        columnNames = { "role", "username" })
)
public class Role implements Serializable {
    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "user_id" )
    protected User user;

    @NotNull
    @Column(name = "authority")
    protected String authority;


    public Role() {
    }

    public Role(User user, String authority) {
        this.user = user;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
