
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para horasTrabajadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="horasTrabajadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diaUno" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="diaDos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="diaTres" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="diaCuatro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="diaCinco" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "horasTrabajadas", propOrder = {
    "diaUno",
    "diaDos",
    "diaTres",
    "diaCuatro",
    "diaCinco"
})
public class HorasTrabajadas {

    protected double diaUno;
    protected double diaDos;
    protected double diaTres;
    protected double diaCuatro;
    protected double diaCinco;

    /**
     * Obtiene el valor de la propiedad diaUno.
     * 
     */
    public double getDiaUno() {
        return diaUno;
    }

    /**
     * Define el valor de la propiedad diaUno.
     * 
     */
    public void setDiaUno(double value) {
        this.diaUno = value;
    }

    /**
     * Obtiene el valor de la propiedad diaDos.
     * 
     */
    public double getDiaDos() {
        return diaDos;
    }

    /**
     * Define el valor de la propiedad diaDos.
     * 
     */
    public void setDiaDos(double value) {
        this.diaDos = value;
    }

    /**
     * Obtiene el valor de la propiedad diaTres.
     * 
     */
    public double getDiaTres() {
        return diaTres;
    }

    /**
     * Define el valor de la propiedad diaTres.
     * 
     */
    public void setDiaTres(double value) {
        this.diaTres = value;
    }

    /**
     * Obtiene el valor de la propiedad diaCuatro.
     * 
     */
    public double getDiaCuatro() {
        return diaCuatro;
    }

    /**
     * Define el valor de la propiedad diaCuatro.
     * 
     */
    public void setDiaCuatro(double value) {
        this.diaCuatro = value;
    }

    /**
     * Obtiene el valor de la propiedad diaCinco.
     * 
     */
    public double getDiaCinco() {
        return diaCinco;
    }

    /**
     * Define el valor de la propiedad diaCinco.
     * 
     */
    public void setDiaCinco(double value) {
        this.diaCinco = value;
    }

}
