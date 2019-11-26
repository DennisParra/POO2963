/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edad;

import java.util.Calendar;

/**
 *
 * @author Fred & Dennis
 */
public class ExtractDate {

    public int calculardays(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();

        // Cálculo de las diferencias.
        //"Fecha actual" extrae fecha del servidor o PC.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
        if (months < 0 // Aún no es el mes de su cumpleaños
                || (months == 0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return days;
    }

    public int calcularmonths(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();

        // Cálculo de las diferencias.
        //"Fecha actual" extrae fecha del servidor o PC.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
        if (months < 1 // Aún no es el mes de su cumpleaños
                || (months == 1 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return months + 1;
    }

    public int calcularyears(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();

        // Cálculo de las diferencias.
        //"Fecha actual" extrae fecha del servidor o PC.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
        if (months < 0 // Aún no es el mes de su cumpleaños
                || (months == 0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return years;
    }

}
