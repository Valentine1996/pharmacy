/// *** *** Model :: Entity :: IncomeExpenseClause *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 12:42:50 :: 2014-07-08 12:35:37
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
/**
 * Class for reflect table income_expense_clause from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "income_expense_clause",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {
            "name"
        }
    )
)
public class IncomeExpenseClause implements Serializable {
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

    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public IncomeExpenseClause() {
    }

    /**
     * Constructor
     *
     * @param name
     */
    public IncomeExpenseClause(String name) {
        this.name = name;
    }

    //- SECTION :: GET -//

    /**
     * Get ID of year
     *
     * @return Long ID of year
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Get name of year
     *
     * @return Integer year
     */
    public String getName() {
        return this.name;
    }

    //- SECTION :: SET -//

    /**
     * Set ID of year
     *
     * @param id
     */
    public void setId( Long id ) {
        this.id = id;
    }

    /**
     * Set name of year
     *
     * @param name
     */
    public void setName( String name ) {
        this.name = name;
    }
    
}
