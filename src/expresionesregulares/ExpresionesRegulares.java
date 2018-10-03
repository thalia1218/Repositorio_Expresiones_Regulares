/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;

import java.util.regex.Pattern;

/**
 *
 * @author thalia
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";

// Lo siguiente devuelve true
System.out.println(Pattern.matches(regexp, "11/12/2014"));
System.out.println(Pattern.matches(regexp, "1/12/2014"));
System.out.println(Pattern.matches(regexp, "11/2/2014"));


// Los siguientes devuelven false
System.out.println(Pattern.matches(regexp, "11/12/14"));  // El año no tiene cuatro cifras
System.out.println(Pattern.matches(regexp, "11//2014"));  // el mes no tiene una o dos cifras
System.out.println(Pattern.matches(regexp, "11/12/14perico"));  // Sobra "perico"
    }
    
}
