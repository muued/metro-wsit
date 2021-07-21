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
 *         The message-destination-linkType is used to link a message
 *         destination reference or message-driven bean to a message
 *         destination.
 *         
 *         The Assembler sets the value to reflect the flow of messages
 *         between producers and consumers in the application.
 *         
 *         The value must be the message-destination-name of a message
 *         destination in the same Deployment File or in another
 *         Deployment File in the same Java EE application unit.
 *         
 *         Alternatively, the value may be composed of a path name
 *         specifying a Deployment File containing the referenced
 *         message destination with the message-destination-name of the
 *         destination appended and separated from the path name by
 *         "#". The path name is relative to the Deployment File
 *         containing Deployment Component that is referencing the
 *         message destination.  This allows multiple message
 *         destinations with the same name to be uniquely identified.
 *         
 *       
 * 
 * <p>Java class for message-destination-linkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="message-destination-linkType">
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
@XmlType(name = "message-destination-linkType")
public class MessageDestinationLinkType
    extends String
{


}
