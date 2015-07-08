/// *** *** Model :: Entity :: Year *** *** *** *** *** *** *** *** *** ///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <vitaliyacm@gmail.com>
 *
 * @date 2014-07-08 12:01:15 :: 2014-07-08 12:17:37
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Class for reflect table year from persistence layout
 *
 * @version 1.0
 */

@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "year",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {
            "name"
        }
    )
)
public class Year implements Serializable {

    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @Min(2010)
    @Column( name = "name")
    protected Integer name;

    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public Year() {
    }

    /**
     * Constructor
     *
     * @param name
     */
    public Year(Integer name) {
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
    public Integer getName() {
        return this.name;
    }

    //- SECTION :: SET -//

    /**
     * Set ID of year
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Set name of year
     *
     * @param name
     */
    public void setName(Integer name) {
        this.name = name;
    }
}
