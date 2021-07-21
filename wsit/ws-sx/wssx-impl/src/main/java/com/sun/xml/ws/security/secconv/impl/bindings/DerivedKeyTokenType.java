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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.02.24 at 05:55:09 PM PST 
//


package com.sun.xml.ws.security.secconv.impl.bindings;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sun.xml.ws.security.secext10.SecurityTokenReferenceType;
/**
 * <p>Java class for DerivedKeyTokenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DerivedKeyTokenType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}SecurityTokenReference" minOccurs="0"/>
 *         <element name="Properties" type="{http://schemas.xmlsoap.org/ws/2005/02/sc}PropertiesType" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <choice>
 *             <element name="Generation" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *             <element name="Offset" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *           </choice>
 *           <element name="Length" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         </sequence>
 *         <element ref="{http://schemas.xmlsoap.org/ws/2005/02/sc}Label" minOccurs="0"/>
 *         <element ref="{http://schemas.xmlsoap.org/ws/2005/02/sc}Nonce" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Id"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedKeyTokenType", propOrder = {
    "securityTokenReference",
    "properties",
    "generation",
    "offset",
    "length",
    "label",
    "nonce"
})
public class DerivedKeyTokenType {

    @XmlElement(name = "SecurityTokenReference", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
    protected SecurityTokenReferenceType securityTokenReference;
    @XmlElement(name = "Properties", namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc")
    protected PropertiesType properties;
    @XmlElement(name = "Generation", namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc")
    protected BigInteger generation;
    @XmlElement(name = "Offset", namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc")
    protected BigInteger offset;
    @XmlElement(name = "Length", namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc")
    protected BigInteger length;
    @XmlElement(name = "Label", namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc")
    protected String label;
    @XmlElement(name = "Nonce", namespace = "http://schemas.xmlsoap.org/ws/2005/02/sc")
    protected byte[] nonce;
    @XmlAttribute(name = "Algorithm")
    protected String algorithm;
    @XmlAttribute(name = "Id", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the securityTokenReference property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTokenReferenceType }
     *     
     */
    public SecurityTokenReferenceType getSecurityTokenReference() {
        return securityTokenReference;
    }

    /**
     * Sets the value of the securityTokenReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTokenReferenceType }
     *     
     */
    public void setSecurityTokenReference(SecurityTokenReferenceType value) {
        this.securityTokenReference = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeneration(BigInteger value) {
        this.generation = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the nonce property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNonce() {
        return nonce;
    }

    /**
     * Sets the value of the nonce property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNonce(byte[] value) {
        this.nonce = ((byte[]) value);
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
