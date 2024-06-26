package fr.medab.spotmebusiness.dtos.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Documented
@Constraint(validatedBy = FileSizeValidator.class)
public @interface FileSize {

    static final long ONE_MB = 1024 * 1024;

    static final long  TWO_MB = ONE_MB * 2;

    long max() default FileSize.ONE_MB;

    String message() default "la taille du fichier est plus grand !";

    Class<?>[] groups () default {};

    Class<? extends Payload>[] payload() default {};

}
