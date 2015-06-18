package es.ual.cnsa.reservas;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2015-06-18T17:11:53")
@StaticMetamodel(Tipohabitacion.class)
public class Tipohabitacion_ { 

    public static volatile SingularAttribute<Tipohabitacion, Long> id;
    public static volatile SingularAttribute<Tipohabitacion, String> nombre;
    public static volatile SingularAttribute<Tipohabitacion, Double> precio;
    public static volatile SingularAttribute<Tipohabitacion, Integer> cantidad;
    public static volatile SingularAttribute<Tipohabitacion, String> descripcion;
    public static volatile SingularAttribute<Tipohabitacion, BigInteger> hotelId;
    public static volatile SingularAttribute<Tipohabitacion, Integer> capacidad;
    public static volatile SingularAttribute<Tipohabitacion, Integer> version;

}