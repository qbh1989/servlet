package org.jboss.seam.servlet.event.qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRequestEvent;

/**
 * Qualifies observer method parameters to select events that fire when HTTP
 * artifacts are being initialized.
 * 
 * The event parameter can be a {@link ServletContextEvent} or a
 * {@link ServletRequestEvent}.
 * 
 * @author Nicklas Karlsson
 */
@Qualifier
@Target( { FIELD, PARAMETER })
@Retention(RUNTIME)
public @interface Initialized
{
}