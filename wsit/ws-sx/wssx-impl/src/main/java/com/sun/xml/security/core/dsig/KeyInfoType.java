/*
 * Copyright (c) 1997, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b24-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.01.20 at 03:59:03 PM IST 
//


package com.sun.xml.security.core.dsig;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.crypto.XMLStructure;

/**
 * <p>Java class for KeyInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}KeyName"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}KeyValue"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}RetrievalMethod"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}X509Data"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}PGPData"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}SPKIData"/>
 *         <element ref="{http://www.w3.org/2000/09/xmldsig#}MgmtData"/>
 *         <any/>
 *       </choice>
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlRootElement(name="KeyInfoType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyInfoType", propOrder = {
    "content"
})
public class KeyInfoType {

    @XmlElementRefs({
        @XmlElementRef(name = "KeyName", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.KeyName.class),
        @XmlElementRef(name = "PGPData", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.PGPData.class),
        @XmlElementRef(name = "RetrievalMethod", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.RetrievalMethod.class),
        @XmlElementRef(name = "X509Data", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.X509Data.class),
        @XmlElementRef(name = "KeyValue", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.KeyValue.class),
        @XmlElementRef(name = "SPKIData", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.SPKIData.class),
        @XmlElementRef(name = "MgmtData", namespace = "http://www.w3.org/2000/09/xmldsig#", type = com.sun.xml.ws.security.opt.crypto.dsig.keyinfo.MgmtData.class)
    })
    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<XMLStructure> content;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PGPDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link RetrievalMethodType }{@code >}
     * {@link JAXBElement }{@code <}{@link X509DataType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link KeyValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link SPKIDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     * @return 
     */
    public List<XMLStructure> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
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
