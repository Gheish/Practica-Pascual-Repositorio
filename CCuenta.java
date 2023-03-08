public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    private float cantidad; //añado el atributo cantidad

    public CCuenta(){
    }

    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    public String getNombre(){ //encapsulo los atributos
        return nombre;
    }

    public String getCuenta(){
        return cuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }

    public void ingresar(float cantidad) throws Exception{ //metodo para añadir cantidd al saldo actual

        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;

    }

    public void retirar(float cantidad) throws Exception{ //metodo para retirar cantidad al saldo actual

        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;

    }

}
