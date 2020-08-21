
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
 
    <body>
        <h1>ESFOT</h1
        <%-- FORMULARIO PARA LAS CAPTURAS DE LOS DATOS --%>
        <form action="Consumo.jsp" method="POST">
            <div class="form-group">
                <label for="txt_num1">Dia 1</label>
                <input type="text" name="txt_num1"/>
                <br>

                <label for="txt_num2">Dia 2</label>
                <input type="text" name="txt_num2"/>
                <br>

                <label for="txt_num3">Dia 3</label>
                <input type="text" name="txt_num3"/>
                <br>

                <label for="txt_num4">Dia 4</label>
                <input type="text" name="txt_num4"/>
                <br>

                <label for="txt_num5">Dia 5</label>
                <input type="text" name="txt_num5"/>
                <br>

                <p><strong>¿Cuánto te pagan por hora?</strong></p>
            
                <label for="txt_num6">Cobro:</label>
                <input type="text" name="txt_num6"/>

                <button type="submit">Consultar</button>
            </div>
        </form>

        <%-- VARIABLE PARA ALMACENAR LOS DATOS DEL INPUT DEL FORMULARIO --%>
        <%!
            String s_num1, s_num2, s_num3, s_num4, s_num5, s_num6;
            int horasTotal;
        %>

        <%-- ALMACENAR LOS DATOS CAPTURADOS DE LAS VARIABLES --%>
        <%
            s_num1 = request.getParameter("txt_num1");
            s_num2 = request.getParameter("txt_num2");
            s_num3 = request.getParameter("txt_num3");
            s_num4 = request.getParameter("txt_num4");
            s_num5 = request.getParameter("txt_num5");
            //por hota coras:
            s_num6 = request.getParameter("txt_num6");


        %>

        <%-- start web service invocation --%><hr/>
        <%
            try {
                uddi.Formularios_Service service = new uddi.Formularios_Service();
                uddi.Formularios port = service.getFormulariosPort();
                // TODO initialize WS operation arguments here
                double diaUno = Double.parseDouble(s_num1);
                double diaDos = Double.parseDouble(s_num2);
                double diaTres = Double.parseDouble(s_num3);
                double diaCuatro = Double.parseDouble(s_num4);
                double diaCinco = Double.parseDouble(s_num5);
                // TODO process result here
                double result = port.horasTrabajadas(diaUno, diaDos, diaTres, diaCuatro, diaCinco);
                out.println("Horas de trabajo totales: " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
        
        
        <%-- start web service invocation --%><hr/>
        <%
            try {
                uddi.Formularios_Service service = new uddi.Formularios_Service();
                uddi.Formularios port = service.getFormulariosPort();
                // TODO initialize WS operation arguments here
                double horas =  Double.parseDouble(s_num6);
                double pagoHoras = Double.parseDouble(s_num1)+ Double.parseDouble(s_num2)+ Double.parseDouble(s_num3)+ Double.parseDouble(s_num4)+Double.parseDouble(s_num5);
                // TODO process result here
                double result = port.sueldo(horas, pagoHoras);
                out.println("Sueldo correspondiente: " + result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>
  
        <%-- end web service invocation --%><hr/>
        
                
    </body>
</html>
