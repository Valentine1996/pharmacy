/// *** *** Model :: Entity :: DistributionWay *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 12:42:50 :: 2014-07-08 12:50:30
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
 * Created by valentyn on 7/8/15.
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "distribution_way",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {
            "name"
        }
    )
)
public class DistributionWay implements Serializable{
    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @NotEmpty
    @Length( max = 32 )
    @Column( name = "name", length = 32 )
    protected String name;

    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public DistributionWay() {
    }

    /**
     * Constructor
     *
     * @param name
     */
    public DistributionWay(String name) {
        this.name = name;
    }

    //- SECTION :: GET -//

    /**
     * Get ID of distribution way
     *
     * @return Long ID of year
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Get name of distribution way
     *
     * @return String distribution way
     */
    public String getName() {
        return this.name;
    }

    //- SECTION :: SET -//

    /**
     * Set ID of distribution way
     *
     * @param id
     */
    public void setId( Long id ) {
        this.id = id;
    }

    /**
     * Set name of distribution way
     *
     * @param name
     */
    public void setName( String name ) {
        this.name = name;
    }

}
