import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversorNumeros {

    private int resultat = 0;

    public ConversorNumeros(){}

    public static boolean verificar(String numero){

        String verificacion = "^(M{0,3}(CM|CD|D?)C{0,3}(XC|XL|L?)X{0,3}(IX|IV|V?)I{0,3})";

        return numero.matches(verificacion);

    }


    public void calcularGruposSubstractivos(String numero) {

        String valoresSubstractivos = "C[MD]|XC|XL|IX|IV";
        Pattern patt = Pattern.compile(valoresSubstractivos);
        Matcher match = patt.matcher(numero);

        while (match.find()) {

            for (Numeros roman : Numeros.values()) {

                if (roman.name().equals(match.group())) {

                   setResultat(roman.getNumero());

                }
            }
        }
    }


    public int getResultat(){

        return this.resultat;
    }

    public void setResultat(int resultat){

        this.resultat += resultat;
    }


}
