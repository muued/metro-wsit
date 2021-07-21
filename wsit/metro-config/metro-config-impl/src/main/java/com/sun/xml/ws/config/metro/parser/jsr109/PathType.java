/*
 * Copyright (c) 2010, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-28 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.18 at 11:59:48 AM EEST 
//


package com.sun.xml.ws.config.metro.parser.jsr109;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The elements that use this type designate either a relative
 *         path or an absolute path starting with a "/".
 *         
 *         In elements that specify a pathname to a file within the
 *         same Deployment File, relative filenames (i.e., those not
 *         starting with "/") are considered relative to the root of
 *         the Deployment File's namespace.  Absolute filenames (i.e.,
 *         those starting with "/") also specify names in the root of
 *         the Deployment File's namespace.  In general, relative names
 *         are preferred.  The exception is .war files where absolute
 *         names are preferred for consistency with the Servlet API.
 *         
 *       
 * 
 * <p>Java class for pathType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="pathType">
 *   <simpleContent>
 *     <restriction base="<http://java.sun.com/xml/ns/javaee>string">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pathType")
public class PathType
    extends String
{


}
