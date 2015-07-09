/// *** *** Model :: Entity :: Pharmacy *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 13:08:15 :: 2014-07-08 13:30:30
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Class for reflect table pharmacy from persistence layout
 *
 * @version 1.0
 */
@SuppressWarnings( "serial" )
@Entity
@Table(
    name = "pharmacy",
    uniqueConstraints = @UniqueConstraint(
        columnNames = {
            "name",
            "shortname"
        }
    )
)
public class Pharmacy implements Serializable {
    
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

    @NotNull
    @NotEmpty
    @Length( max = 32 )
    @Column( name = "shortname", length = 32 )
    protected String shortName;

    @NotNull
    @NotEmpty
    @Length( max = 8 )
    @Column( name = "legal_form", length = 8 )
    protected String legalForm;

    @NotNull
    @NotEmpty
    @Length( max = 32 )
    @Column( name = "region", length = 32 )
    protected String region;

    @NotNull
    @NotEmpty
    @Column( name = "calculation_consider")
    protected Boolean calculationConsider;

    @OneToMany(
        fetch = FetchType.LAZY,
        mappedBy = "pharmacy",
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    protected List< Profit> profits;
    /// *** Methods     *** ///

    /**
     * Default constructor
     */
    public Pharmacy() {
    }

    /**
     * Constructor
     * 
     * @param name
     * @param shortName
     * @param legalForm
     * @param region
     * @param calculationConsider
     */
    public Pharmacy(String name, String shortName, String legalForm, String region, Boolean calculationConsider) {
        this.name = name;
        this.shortName = shortName;
        this.legalForm = legalForm;
        this.region = region;
        this.calculationConsider = calculationConsider;
    }

    //- SECTION :: GET -//

    /**
     * Get id of pharmacy
     * 
     * @return Long id
     */
    public Long getId() {
        return id;
    }

    /**
     * Get name of pharmacy
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Get short name of pharmacy
     *
     * @return String shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Get legal form of pharmacy
     *
     * @return Long id
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Get region of pharmacy
     *
     * @return Long id
     */
    public String getRegion() {
        return region;
    }

    /**
     * Get calculation consideration of pharmacy
     *
     * @return Long id
     */
    public Boolean getCalculationConsider() {
        return calculationConsider;
    }

    /**
     * Get list of profits of pharmacy
     *
     * @return Long id
     */
    public List < Profit > getProfits() {
        return profits;
    }

    //- SECTION :: SET -//

    /**
     * Set id of pharmacy
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Set name of pharmacy
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set short name of pharmacy
     *
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * Set legal form of pharmacy
     *
     * @param legalForm
     */
    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }

    /**
     * Set region of pharmacy
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Set calculation consideration of pharmacy
     *
     * @param calculationConsider
     */
    public void setCalculationConsider(Boolean calculationConsider) {
        this.calculationConsider = calculationConsider;
    }

    /**
     * Set list of profits of pharmacy
     *
     * @param profits
     */
    public void setProfits( List < Profit > profits) {
        this.profits = profits;
    }
}
