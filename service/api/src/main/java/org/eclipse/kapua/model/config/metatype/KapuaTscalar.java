/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.kapua.model.config.metatype;
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.11.25 at 06:05:15 PM CET
//

/**
 * <p>
 * Java class for Tscalar complex type.
 *
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;simpleType name="Tscalar"&gt;
 *  &lt;restriction base="string"&gt;
 *      &lt;enumeration value="String"/&gt;
 *      &lt;enumeration value="Long"/&gt;
 *      &lt;enumeration value="Double"/&gt;
 *      &lt;enumeration value="Float"/&gt;
 *      &lt;enumeration value="Integer"/&gt;
 *      &lt;enumeration value="Byte"/&gt;
 *      &lt;enumeration value="Char"/&gt;
 *      &lt;enumeration value="Boolean"/&gt;
 *      &lt;enumeration value="Short"/&gt;
 *      &lt;enumeration value="Password"/&gt;
 *  &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 *
 * @since 1.0
 * 
 */
public interface KapuaTscalar {

    /**
     * Gets the value property.
     *
     * @return possible object is {@link String } with restricted values
     *
     */
    public String value();
}
