package com.valentine1996.model;

import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.validation.Path;
import javax.validation.Validation;
import javax.validation.Validator;

/**
 * Abstract base class for testing of validation witj access to database
 *
 * @version 1.0
 */

public class ContextAbstractModel extends BaseModel{

    @Autowired
    public static Validator validator;


    @BeforeClass
    public static void setUp() {
        // Set validator
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    //- SECTION :: HELPERS -//
    /**
     * Helper for get property name
     *
     * @param path Path with nodes
     * @return String name of property
     */
    protected String getPropertyName( Path path ) {
        // Set default result
        String propertyName = null;

        for ( Path.Node node : path ) {
            String nodeName = node.getName();

            if ( !nodeName.isEmpty() ) {
                propertyName = nodeName;
            }
        }

        return propertyName;
    }
}