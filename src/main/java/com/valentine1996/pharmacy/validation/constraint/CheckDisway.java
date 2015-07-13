/// *** *** Validation :: Constraint :: CheckDisway  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-13 16:13:30 :: 2014-07-13 16:13:50
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.validation.constraint;

import com.valentine1996.pharmacy.validation.constraint.Impl.CheckDiswayValidator;
import com.valentine1996.pharmacy.validation.constraint.Impl.CheckYearValidator;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

/**
 * Constraint for checking distribution way in database
 */
@Documented
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckDiswayValidator.class)
@ReportAsSingleViolation
public @interface CheckDisway {
    String message() default "This distribution way isn't in database";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
