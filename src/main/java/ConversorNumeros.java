import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversorNumeros {


    public ConversorNumeros(){}

    public static boolean verificar(String numero){

        String verificacion = "^(M{0,3}(CM|CD|D?)C{0,3}(XC|XL|L?)X{0,3}(IX|IV|V?)I{0,3})";

        return numero.matches(verificacion);

    }



}
