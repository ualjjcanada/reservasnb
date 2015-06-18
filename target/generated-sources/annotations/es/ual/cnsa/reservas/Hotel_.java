package es.ual.cnsa.reservas;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2015-06-18T17:11:53")
@StaticMetamodel(Hotel.class)
public class Hotel_ { 

    public static volatile SingularAttribute<Hotel, Long> id;
    public static volatile SingularAttribute<Hotel, String> nombre;
    public static volatile SingularAttribute<Hotel, String> categoria;
    public static volatile SingularAttribute<Hotel, String> localidad;
    public static volatile SingularAttribute<Hotel, String> domicilio;
    public static volatile SingularAttribute<Hotel, String> telefono;
    public static volatile SingularAttribute<Hotel, String> descripcion;
    public static volatile SingularAttribute<Hotel, String> codpostal;
    public static volatile SingularAttribute<Hotel, String> provincia;
    public static volatile SingularAttribute<Hotel, Integer> version;
    public static volatile SingularAttribute<Hotel, BigInteger> administradorId;

}