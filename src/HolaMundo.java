import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args){
        System.out.println("Hola mundo");

        //Variables
        int entero = 10;
        double decimal = 10.1;
        entero++;
        String numeros = "124";

        System.out.println(entero + decimal + numeros);

        //Condicionales
        boolean decirSi = true;

        if (decirSi){
            System.out.println("Boleano");
        }else{
            System.out.println("no");
        }

        //switch
        String caso = "caso1";

        switch (caso){
            case "caso1":
                System.out.println("el caso es"+ caso);

            case "caso2":
                System.out.println("caso 2");

            default :
                System.out.println("no encontrado");
        }

        //Funciones
        String saludo = Funciones.Saludo("Julián");
        System.out.println("Esto es un saludo: " + saludo);

        //Scanner
        System.out.println("digita un número");
        Scanner sc = new Scanner(System.in);
        int respuesta = Integer.valueOf(sc.nextLine());

        System.out.println(respuesta);

        //Bucles
        int iterador = 0;
        while(iterador < 5){
            System.out.println(iterador);
            System.out.println("------------while");
            iterador++;
        }

        for (int i =0; i<5; i++){
            System.out.println(iterador);
            System.out.println("------------for");
        }

        //Arreglos
        String arr[] = new String[3];
        for (int i =0; i< arr.length;i++){
            arr[i]= "hola"+i;
            System.out.println("posición "+(i+1)+arr[i]);
        }




    }

}
