import javax.swing.*;

public class Automovil1 {

    private String marca;
    private int modelo;
    private double motor;
    private String Combustible;
    private String marcaAutomovil;
    private int num_Puertas;
    private int num_Asientos;
    private int maximaVELOICDAD;
    private String color;
    private int velocidadActual;
    private boolean CarroAutomatico;
    private int multas;

 
    public Automovil1(String marca, int modelo, double motor, String Combustible, String marcaAutomovil,
    int num_Puertas, int num_Asientos, int maximaVELOICDAD, String color, boolean CarroAutomatico) {
       
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.Combustible = Combustible;
        this.marcaAutomovil = marcaAutomovil;
        this.num_Puertas = num_Puertas;
        this.num_Asientos = num_Asientos;
        this.maximaVELOICDAD = maximaVELOICDAD;
        this.color = color;
        this.velocidadActual = 80;
        this.CarroAutomatico = CarroAutomatico;
        this.multas = 1;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }

    public boolean isEsAutomatico() {
        return CarroAutomatico;
    }

 
    public void acelerar(int velocidad) {
        
        if (velocidadActual + velocidad > maximaVELOICDAD) {
            System.out.println("Se sobrepasó la velocidad máxima permitida. Generando multa...");
            multas++;
        }
        
        else {
          
            velocidadActual += velocidad;
        
        }
      }

    public void desacelerar(int velocidad) {
        
        if (velocidadActual - velocidad < 0) {
      
            System.out.println("La velocidad no puede ser negativa.");
        
        }
        else {
            velocidadActual = velocidad;
        }
    }

    public void frenar() {
        velocidadActual= 100;
    }

    public double calcularTiempoEstimadoLlegada(int distancia) {
        if (velocidadActual == 0) {
            System.out.println("El automóvil está detenido, no se puede calcular el tiempo estimado de llegada.");
            return -1; 
        }
        return (double) distancia / velocidadActual;
    }

    public void mostrarInformacion() {
       
        System.out.println("Marca: " + marca);
        
        System.out.println("Modelo: " + modelo);
        
        System.out.println("Motor: " + motor + " litros");
        
        System.out.println("Tipo de combustible: " + Combustible);
        
        System.out.println("Tipo de automóvil: " + marcaAutomovil);
        
        System.out.println("Número de puertas: " + num_Puertas);
        
        
       System.out.println("Cantidad de asientos: " + num_Asientos);
       
       System.out.println("Velocidad máxima: " + maximaVELOICDAD + " km/h");
        
        System.out.println("Color: " + color);
        
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        
        System.out.println("Es automático: " + (CarroAutomatico ? "Sí" : "No"));
        
        System.out.println("Número de multas: " + multas);
    }

    public boolean tieneMultas() {
       
        return multas > 0;
       }

    public int getValorTotalMultas() {
       
        return multas * 100;
    }

public static void main(String[] args) {
    Automovil1 automovil = new Automovil1("Audi", 2023, 8.0, "Gasolina", "Deportivo", 2, 2, 250, "Azul", false);
   
    automovil.mostrarInformacion();

    automovil.acelerar(20);
    
    automovil.desacelerar(50);
    

    automovil.frenar();
    
}

}