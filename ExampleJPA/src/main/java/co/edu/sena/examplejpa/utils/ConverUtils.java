/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Aprendiz
 */
public class ConverUtils {

    /**
     * Convierte fecha a string
     *
     * @param
     * @return
     */
    public static String dateToString(Date date) {
        DateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String result = dateformat.format(date);
        return result;
    }

    /**
     *
     * Convierte string en fecha
     *
     * @return
     * @throws Exception
     */
    public static Date stringToDate(String text) throws Exception {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(text);
        return date;
    }

    /**
     *
     * Convierte una hora en string
     * @return
     * @throws
     */
    public static String TimeToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String result = dateFormat.format(date);
        return result;
    }

    /**
     * Convierte un string en una hora
     *
     * @return
     * @throws
     */
    public static Date stringToTime(String text) throws ParseException {
        Date date = new SimpleDateFormat("HH:mm").parse(text);
        return date;
    }
    
   public static Date localDateToDate(LocalDate localDate)
   {
       return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
   }
   
    public static Date localTimeToDate(LocalTime localTime)
   {
       return Date.from(LocalDate.now().atTime(localTime).atZone(ZoneId.systemDefault()).toInstant());
   }

     /**
     * Convierte de date a localDate
     *
     * @return
     * @throws
     */
    
    public static LocalDate dateToLocalDate(Date date)
    {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
