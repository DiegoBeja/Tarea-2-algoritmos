public class Main {
    public static void main(String[] args) {
        Ejemplo x = new Ejemplo();

//        System.out.println(x.invertirCadena("Hola mundo"));
//
//        System.out.println(x.revisarSintaxis("{[()]}"));
//        System.out.println(x.revisarSintaxis("{[)]}"));
//        System.out.println(x.revisarSintaxis("{[()]"));

        int [] numeros = {5,2,1,9,4,2};

        Pila<Integer> resultado = x.menorAMayor(numeros);

        while(!resultado.pilaVacia()){
            System.out.println(resultado.pop());
        }
    }
}