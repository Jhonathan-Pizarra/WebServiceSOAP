/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author erick
 */
@WebService(serviceName = "Formularios")
public class Formularios {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hola EPN " + txt + " !";
    }
    
     @WebMethod(operationName = "horasTrabajadas")
    public double horasTrabajadas(@WebParam(name = "diaUno") double diaUno,
                                  @WebParam(name = "diaDos") double diaDos,
                                  @WebParam(name = "diaTres") double diaTres,
                                  @WebParam(name = "diaCuatro") double diaCuatro,
                                  @WebParam(name = "diaCinco") double diaCinco) {
        return diaUno+diaDos+diaTres+diaCuatro+diaCinco;
    }
    
     @WebMethod(operationName = "sueldo")
    public double sueldo(@WebParam(name = "horas") double horas,
                           @WebParam(name = "pagoHoras") double pagoHoras) {
        return horas*pagoHoras;
    }
    
}
