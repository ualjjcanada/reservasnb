package es.ual.cnsa.reservas;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2015-06-18T17:11:53")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Long> id;
    public static volatile SingularAttribute<Reserva, Integer> ocupacion;
    public static volatile SingularAttribute<Reserva, Double> precio;
    public static volatile SingularAttribute<Reserva, Date> fechafin;
    public static volatile SingularAttribute<Reserva, BigInteger> clienteId;
    public static volatile SingularAttribute<Reserva, Integer> cantidad;
    public static volatile SingularAttribute<Reserva, BigInteger> tipohabitacionId;
    public static volatile SingularAttribute<Reserva, String> nombretomador;
    public static volatile SingularAttribute<Reserva, Date> fechainicio;
    public static volatile SingularAttribute<Reserva, Integer> version;

}