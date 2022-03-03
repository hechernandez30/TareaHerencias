package ejerciciono4;

public class CalcularPerimetro extends FigurasGeometricas {
        public void calcularPerimetro() {
        if (this.nombre == "Cuadrado") {
            int perimetro = base * 4;
            System.out.println("El perimetro del " + this.nombre + " es igual a " + perimetro + ".");
        } else if (this.nombre == "Rectangulo") {
            int perimetro = (base*2)+(altura*2);
            System.out.println("El perimetro del " + this.nombre + " es igual a " + perimetro + ".");
        } else if (this.nombre == "Triangulo"){
            int perimetro = (base *3);
            System.out.println("El perimetro del " + this.nombre + " es igual a " + perimetro + ".");
        } else {
            System.out.println("No reconozco esa figura.");
        }

    }
    
}
