/// *** *** Validation :: Constraint :: CheckClause  *** *** *** *** *** *** *///

/** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *
 *                                                                  *
 * @copyright 2014 (c), by Valentine
 *
 * @author Valentyn Namisnyk <valentunnamisnuk@gmail.com>
 *
 * @date 2014-07-12 16:21:10 :: 2014-07-12 16:25:20
 *
 * @address /Ukraine/Ivano-Frankivsk/Rozhniw
 *                                                                  *
 *///*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *

/// *** Code    *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ///
package com.valentine1996.pharmacy.validation.constraint;

import com.valentine1996.pharmacy.validation.constraint.Impl.CheckClauseValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import java.lang.annotation.*;

/**
 * Constraint for checking income / expense clause in database
 */
@Documented
@Target( ElementType.FIELD )
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckClauseValidator.class)
@ReportAsSingleViolation
public @interface CheckClause {
    String message() default "This clause isn't in database";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
