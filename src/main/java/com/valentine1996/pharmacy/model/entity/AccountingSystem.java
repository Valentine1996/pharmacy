/// *** *** Model :: Entity :: AccountingSystem *** *** *** *** *** *** *** ///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 12:22:59 :: 2014-07-08 12:35:37
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.entity;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

/**
 * Class for reflect table accounting_system from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "accounting_system",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {
            "name"
        }
    )
)
public class AccountingSystem implements Serializable{

    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @Column( name = "name", length = 16 )
    protected String name;

    @OneToMany(
        fetch = FetchType.LAZY,
        mappedBy = "accountingSystem",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    List < Expense > expenses;
    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public AccountingSystem() {
    }

    /**
     * Constructor
     *
     * @param name
     */
    public AccountingSystem(String name) {
        this.name = name;
    }

    //- SECTION :: GET -//

    /**
     * Get ID of accounting system
     *
     * @return Long ID of accounting system
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Get name of accounting system
     *
     * @return String accounting system
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get list of expenses of accounting system
     *
     * @return List < Expense > expenses
     */
    public List < Expense > getExpenses() {
        return expenses;
    }

    //- SECTION :: SET -//

    /**
     * Set ID of accounting system
     *
     * @param id
     */
    public void setId( Long id ) {
        this.id = id;
    }

    /**
     * Set name of accounting system
     *
     * @param name
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * Set list of expenses of accounting system
     *
     * @param expenses
     */
    public void setExpenses( List < Expense > expenses) {
        this.expenses = expenses;
    }
}
