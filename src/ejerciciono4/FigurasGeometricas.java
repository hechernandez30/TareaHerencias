package ejerciciono4;

public class FigurasGeometricas {

    //Se definen las variables, tambien llamadas atributos.
    String nombre;
    String color;
    int altura;
    int base;
    double pi = 3.1416;
    double radio;
    float apotema;
    float ladoN;
    int grados;

    //Se definen los metodos de la clase FigurasGeometricas.
    public void calcularArea() {
        int area = base * altura;
        System.out.println("El area es de " + area);
    }

    public void calcularPerimetro() {
        int perimetro = base * 4;
        System.out.println("El perimetro del " + this.nombre +" es de " + perimetro + ".");
    }

    public void calcularVolumen() {
        int cubo = base * base * base;
        System.out.println("El volumen del " + this.nombre + " es igual a " + cubo + ".");
    }

    public void girarEnGrados() {
        int giro = grados;
        System.out.println("Se giro " + giro + " grados hacia donde lo solicitaste.");
    }

}
