//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.25 a las 02:41:04 PM VET 
//


package com.sefspring.wsdls.countryinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfContinentsByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftContinent"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfContinentsByCodeResult"
})
@XmlRootElement(name = "ListOfContinentsByCodeResponse")
public class ListOfContinentsByCodeResponse {

    @XmlElement(name = "ListOfContinentsByCodeResult", required = true)
    protected ArrayOftContinent listOfContinentsByCodeResult;

    /**
     * Obtiene el valor de la propiedad listOfContinentsByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftContinent }
     *     
     */
    public ArrayOftContinent getListOfContinentsByCodeResult() {
        return listOfContinentsByCodeResult;
    }

    /**
     * Define el valor de la propiedad listOfContinentsByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftContinent }
     *     
     */
    public void setListOfContinentsByCodeResult(ArrayOftContinent value) {
        this.listOfContinentsByCodeResult = value;
    }

}
