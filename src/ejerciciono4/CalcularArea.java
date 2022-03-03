package ejerciciono4;

public class CalcularArea extends FigurasGeometricas {

    public void calcularArea() {
        if (this.nombre == "Cuadrado") {
            int area = base * altura;
            System.out.println("El area del " + this.nombre + " es igual a " + area + ".");
        } else if (this.nombre == "Rectangulo") {
            int area = base * altura;
            System.out.println("El area del " + this.nombre + " es igual a " + area + ".");
        } else if (this.nombre == "Triangulo"){
            int area = (base * altura) / 2;
            System.out.println("El area del " + this.nombre + " es igual a " + area + ".");
        } else {
            System.out.println("No reconozco esa figura.");
        }

    }
}
