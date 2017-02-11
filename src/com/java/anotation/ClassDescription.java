package com.java.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.SOURCE)
//@Retention (RetentionPolicy.RUNTIME)
//@Retention (RetentionPolicy.CLASS)

@Target({ElementType.METHOD,ElementType.TYPE})
/**
 * ElementType.ANNOTATION_TYPE
ElementType.CONSTRUCTOR
ElementType.FIELD
ElementType.LOCAL_VARIABLE
ElementType.METHOD
ElementType.PACKAGE
ElementType.PARAMETER
ElementType.TYPE
 * @author dnegi
 *
 */
@interface	ClassDescription {

	String Auther();
	String name();
	String abc="Test value";
	
	
}
