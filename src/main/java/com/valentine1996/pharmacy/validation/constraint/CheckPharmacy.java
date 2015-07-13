/// *** *** Validation :: Constraint :: CheckPharmacy *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 16:34:16 :: 2014-07-12 16:38:20
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.validation.constraint;


import com.valentine1996.pharmacy.validation.constraint.Impl.CheckAcsValidator;
import com.valentine1996.pharmacy.validation.constraint.Impl.CheckPharmacyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.*;

/**
 * Constraint for checking pharmacy in database
 */
@Documented
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckPharmacyValidator.class)
@ReportAsSingleViolation
public @interface CheckPharmacy {
    String message() default "This pharmacy isn't in database";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
