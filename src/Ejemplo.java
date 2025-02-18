public class Ejemplo {
    Pila<Object> x = new Pila<>();

    public Ejemplo(){

    }

    public String invertirCadena(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder();
        if(x.pilaLlena()){
            return "Pila llena";
        }

        for(int i=0; i<cadena.length(); i++){
            x.push(String.valueOf(cadena.charAt(i)));
        }

        while(!x.pilaVacia()){
            cadenaInvertida.append(x.pop());
        }
        return cadenaInvertida.toString();
    }

    public boolean revisarSintaxis(String cadena){
        String [] cadenaSplit = cadena.split("");
        if(x.pilaLlena()){
            return false;
        }

        for(int i=0; i<cadena.length(); i++){
            if(cadenaSplit[i].equals("{") || cadenaSplit[i].equals("[") || cadenaSplit[i].equals("(")){
                x.push(cadenaSplit[i]);
            } else if(cadenaSplit[i].equals(")")){
                if(!x.pop().equals("(")){
                    return false;
                }
            } else if(cadenaSplit[i].equals("]")){
                if(!x.pop().equals("[")){
                    return false;
                }
            } else if(cadenaSplit[i].equals("}")){
                if(!x.pop().equals("{")){
                    return false;
                }
            } else{
                return false;
            }
        }
        return x.pilaVacia();
    }

    public Pila<Integer> menorAMayor(int [] numeros){
        Pila<Integer> pilaNueva = new Pila<>();
        Pila<Integer> pilaEntrada = new Pila<>();

        int auxiliar;

        if(x.pilaLlena()){
            System.out.println("Pila llena");
        }

        for(int i=0; i<numeros.length; i++){
            pilaEntrada.push(numeros[i]);
        }

        while(!pilaEntrada.pilaVacia()){
            auxiliar = pilaEntrada.pop();
            while(!pilaNueva.pilaVacia() && pilaNueva.peek() < auxiliar){
                pilaEntrada.push(pilaNueva.pop());
            }
            pilaNueva.push(auxiliar);
        }

        return pilaNueva;
    }
}
