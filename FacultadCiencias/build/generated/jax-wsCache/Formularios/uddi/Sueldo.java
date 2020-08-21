
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sueldo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sueldo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="pagoHoras" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sueldo", propOrder = {
    "horas",
    "pagoHoras"
})
public class Sueldo {

    protected double horas;
    protected double pagoHoras;

    /**
     * Obtiene el valor de la propiedad horas.
     * 
     */
    public double getHoras() {
        return horas;
    }

    /**
     * Define el valor de la propiedad horas.
     * 
     */
    public void setHoras(double value) {
        this.horas = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoHoras.
     * 
     */
    public double getPagoHoras() {
        return pagoHoras;
    }

    /**
     * Define el valor de la propiedad pagoHoras.
     * 
     */
    public void setPagoHoras(double value) {
        this.pagoHoras = value;
    }

}
