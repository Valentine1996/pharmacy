/// *** *** Validation :: Constraint :: Year  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-08 19:15:10 :: 2014-07-08
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.validation.constraint;

import com.valentine1996.pharmacy.validation.constraint.Impl.CheckYearValidator;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

@Documented
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckYearValidator.class)
@ReportAsSingleViolation
public @interface CheckYear {
    String message() default "This year isn't in database";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
