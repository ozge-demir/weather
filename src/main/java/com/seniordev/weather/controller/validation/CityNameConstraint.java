package com.seniordev.weather.controller.validation;

/*
 * Jakarta Bean Validation API
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

/**
 * The annotated element must not be {@code null} and must contain at least one
 * non-whitespace character. Accepts {@code CharSequence}.
 *
 * @author Hardy Ferentschik
 * @since 2.0
 *
 * @see Character#isWhitespace(char)
 */
@Documented
@Constraint(validatedBy = {CityNameValidator.class })
@Target({ METHOD, FIELD, PARAMETER})
@Retention(RUNTIME)
public @interface CityNameConstraint {

    String message() default "Invalid city name";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
