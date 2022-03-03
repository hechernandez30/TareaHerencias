package ejerciciono4;

public class EjercicioNo4 {
    public static void main(String[] args) {
        
        CalcularArea figura1 = new CalcularArea();
        //Por el momento funciona para calcular Area y Perimetro, creo que me esta dando error en el volumen con el retorno, por el tiempo ya no puedo verlo, 
        //para probarlo, escribe "Cuadrado","Rectangulo","Triangulo" y te calculara ambas cifras.
        figura1.nombre = "Triangulo";
        figura1.base = 4;
        figura1.altura = 4;
        figura1.grados = 90;
        figura1.radio = 5;
        figura1.calcularArea();
        figura1.calcularPerimetro();
        //figura1.calcularVolumen();
        figura1.girarEnGrados();
    }
    
}
