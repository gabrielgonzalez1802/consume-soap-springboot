//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.25 a las 02:41:02 PM VET 
//


package com.sefspring.wsdls.sefservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para amoViewDTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="amoViewDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idclass" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="idmo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nombreamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amoViewDTO", propOrder = {
    "id",
    "idclass",
    "idmo",
    "nombreamo"
})
public class AmoViewDTO {

    protected int id;
    protected long idclass;
    protected long idmo;
    protected String nombreamo;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idclass.
     * 
     */
    public long getIdclass() {
        return idclass;
    }

    /**
     * Define el valor de la propiedad idclass.
     * 
     */
    public void setIdclass(long value) {
        this.idclass = value;
    }

    /**
     * Obtiene el valor de la propiedad idmo.
     * 
     */
    public long getIdmo() {
        return idmo;
    }

    /**
     * Define el valor de la propiedad idmo.
     * 
     */
    public void setIdmo(long value) {
        this.idmo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreamo() {
        return nombreamo;
    }

    /**
     * Define el valor de la propiedad nombreamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreamo(String value) {
        this.nombreamo = value;
    }

}
