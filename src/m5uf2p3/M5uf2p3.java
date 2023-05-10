/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m5uf2p3;

import java.util.Calendar;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */
public class M5uf2p3 {

    public static void main(String[] args) {
        M5uf2p3 invertir = new M5uf2p3();
        String cadena = invertir.inverteix("Hola");
        System.out.println("El resultado es: " + cadena);

        M5uf2p3 factorial = new M5uf2p3();
        double numero = factorial.factorial(8);
        System.out.println("El factorial es: " + numero);

        M5uf2p3 edat = new M5uf2p3();
        int anys = edat.edat(23, 1, 2001);
        System.out.println("L'edad es: " + anys);

    }

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();
        return sb.toString();

    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */

    public static int edat(int dia, int mes, int año) {
        if (dia < 1 || mes < 1 || mes > 12 || año < 0
                || (mes == 2 && dia > 29)
                || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)
                || dia > 31) {
            return -2;
        }

        // Obtiene la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        int añoActual = fechaActual.get(Calendar.YEAR);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1;
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

        // Calcula la edad
        int edad = añoActual - año;
        if (mesActual < mes || (mesActual == mes && diaActual < dia)) {
            edad--;
        }

        // Comprueba si la edad es válida
        if (edad > 150) {
            return -1;
        } else {
            return edad;
        }
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        if (numero < 0) {
            return -1;
        } else if (numero == 0 || numero == 1) {
            return 1;
        } else {
            int resultado = 1;
            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }
            return resultado;

        }
    }
}
