public class Main {
    public static void main(String[] args) {
        Ejemplo x = new Ejemplo();
        int [] numeros = {5,2,1,9,4,2};

        Pila<Integer> resultado = x.menorAMayor(numeros);

        // Imprimir el resultado
        while (!resultado.pilaVacia()) {
            System.out.println(resultado.pop());
        }
    }
}