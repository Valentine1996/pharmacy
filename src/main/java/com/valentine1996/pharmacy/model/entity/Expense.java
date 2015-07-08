/// *** *** Model :: Entity :: Expense *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 17:16:31 :: 2014-07-08 17:15:54
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
 * Class for reflect table expense from persistence layout
 *
 * @version 1.0
 */
public class Expense implements Serializable {

    /// *** Properties  *** ///
    @Id
    @GeneratedValue
    @Column( name = "id" )
    protected Long id;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "year_id" )
    protected Year year;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "accounting_system_id" )
    protected AccountingSystem accountingSystem;

    @NotNull
    @ManyToOne
    @JoinColumn( name = "distribution_way_id" )
    protected DistributionWay distributionWay;

    @NotNull
    @NotEmpty
    @Length( max = 16 )
    @Column( name = "month", length = 16 )
    protected String month;

    @NotNull
    @NotEmpty
    @Length( max = 100 )
    @Column( name = "name", length = 100 )
    protected String name;
    
    @NotNull 
    @Column( name = "income")
    protected Boolean income;
    
    @NotNull
    @Column( name = "sum")
    protected Double sum;

    
}
