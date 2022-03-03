package ejerciciono4;

public class CalcularVolumen extends FigurasGeometricas {
        public void calcularVolumen() {
        if (this.nombre == "Cubo") {
            int volumen = base * base * base;
            System.out.println("El volumen del " + this.nombre + " es igual a " + volumen + ".");
        } else if (this.nombre == "Cilindro") {
            double volumen = Double.parseDouble(((pi*(radio*radio)) * altura));
            System.out.println("El volumen del " + this.nombre + " es igual a " + volumen + ".");
        } else if (this.nombre == "Esfera"){
            double volumen = 3/4 *(this.pi * Math.pow(this.radio, 3));
            System.out.println("El volumen del " + this.nombre + " es igual a " + volumen + ".");
        } else {
            System.out.println("No reconozco esa figura.");
        }

    }
}
