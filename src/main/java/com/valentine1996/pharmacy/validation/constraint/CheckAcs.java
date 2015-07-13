/// *** *** Validation :: Constraint :: CheckAcs *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 16:27:10 :: 2014-07-12 16:29:20
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.validation.constraint;


import com.valentine1996.pharmacy.validation.constraint.Impl.CheckAcsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.*;

/**
 * Constraint for checking accounting system in database
 */
@Documented
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckAcsValidator.class)
@ReportAsSingleViolation
public @interface CheckAcs {
    String message() default "This accounting system isn't in database";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
