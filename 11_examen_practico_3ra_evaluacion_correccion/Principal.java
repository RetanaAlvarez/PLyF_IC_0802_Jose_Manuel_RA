public class Principal{
        //2.- Dentro de esta clase "Principal" crear el punto de entrada "main".
        public static void main(String[] args) {
                //3.- Crear una instancia de tipo "PruebaExamen" y de nombre "pe", <<pero sin asignar memoria>>.
                PruebaExamen pe;
                //4.- Asignar una Expresión lambda a la instancia "pe", en la cual se imprima la suma de TRES números Enteros.
                pe = (numero1, numero2, nuevo) ->  System.out.println(numero1+numero2);
                //5.- Invocar "operacionPrueba" e imprimir el resultado de la suma de DOS números Enteros.
                pe.operacionPueba(5, 2,9);
                //6.- Invocar "mensajeHola".
                pe.mensajeHola();
                //7.- Invocar "mensajeHola" y enviar cualquier String.
                pe.mensajeHola("mensaje");
                /*8.- Asignar una Expresión lambda a la instancia "pe", en la cual se 
                imprima la suma del primer argumento con la multiplicación del segundo argumento por el tercer argumento.*/
                pe = (numero1, numero2, nuevo) ->  System.out.println((numero1*numero2)+nuevo);
                /*9.- Con "pe" invocar a "operacionPrueba", pasando como primer argumento cualquier número Entero,
                pasando como segundo argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros 
                (los que tú desees) y pasando como tercer 
                argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros (los que tú desees). */
                pe.operacionPueba(6,PruebaExamen.operacionPueba(2,3),PruebaExamen.operacionPueba(3,5));
                /*12.- Regresando al punto de entrada "MAIN", invocar al método "miMetodo" pasando como argumento a "pe".*/
                miMetodo(pe);
                /*16.- Regresando al punto de entrada "MAIN", asignar una Expresión lambda a la instancia "pe", en la cual se imprima 
                la suma del primer argumento con la división del segundo argumento entre el tercer argumento (DEBE IMPRIMIR LOS DECIMALES). 
                <-- AQUÍ LO DEBES HACER (DECIMALES)*/
                pe=(a, b,c)->System.out.println((float)a+((float)b/(float)c));
                /*17.- Invocar al método "miMetodo" y enviar como primer argumento a "pe", y tres Enteros cualesquiera.*/
                miMetodo(pe,4,4,4);
                /*13.- Invocar al método "miMetodo", pasando como argumento una Expresión lambda, en la cual se
                imprima la suma del primer argumento 
                con  la división del segundo argumento entre el tercer argumento.*/
                miMetodo((numero1,numero2,nuevo)->System.out.println(numero1+(numero2/nuevo)));
                
                
        }
        /*10.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático y privado de nombre
        "miMetodo", el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen".*/
        private static void miMetodo(PruebaExamen pe){
        /*11.- Dentro del método "miMetodo" (del paso 10), repetir lo mismo que el punto "9", pero con el objeto que se recibe como argumento.*/
        pe.operacionPueba(6,PruebaExamen.operacionPueba(3,7),PruebaExamen.operacionPueba(5,7));
}
        /*14.- Dentro la clase "Principal" (NO en el punto de Entrada MAIN), crear un método estático
         y privado de nombre "miMetodo", el cual no retorna NADA y recibe como argumento un Objeto de tipo "PruebaExamen"
         , y tres valores de tipo Entero (separados).*/
        private static void miMetodo ( PruebaExamen pe, int numero2, int numero1, int nuevo){
        /*15.- Dentro del método "miMetodo" (creado en el punto 14), utilizar el 
        objeto recibido para invocar a "operacionPrueba",
        pasando como primer argumento el primer valor Entero recibido,
         pasando como segundo argumento el resultado obtenido de invocar "operacionPrueba" que recibe dos Enteros 
         (el segundo valor recibido) y pasando como tercer argumento el resultado obtenido de invocar "operacionPrueba" 
         que recibe dos Enteros (el tercer valor recibido). */
        pe.operacionPueba(numero2,PruebaExamen.operacionPueba(numero1,numero1),PruebaExamen.operacionPueba(nuevo,nuevo));
        }               
}