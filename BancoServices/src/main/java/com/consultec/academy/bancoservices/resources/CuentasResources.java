package com.consultec.academy.bancoservices.resources;

import com.consultec.academy.bancoservices.dao.CuentasDAO;
import com.consultec.academy.bancoservices.models.abstracts.Cuenta;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@Path("/cuentas")
public class CuentasResources {

    private static final Logger log = LoggerFactory.getLogger(main.java.com.consultec.academy.bancoservices.resources.HelloResource.class);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearCuenta(Cuenta cuenta) {
        CuentasDAO cuentasDAO = new CuentasDAO();
        cuentasDAO.agregarCuenta(cuenta);
        return Response.status(200).entity("Cuenta Creada").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultarCuentas() {

        CuentasDAO cuentasDAO = new CuentasDAO();
        return Response.status(200).entity(cuentasDAO.consultarTodo()).build();
    }
}
