import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversorNumeros {


    // Atribut
    private int resultat = 0;


    // Constructor
    public ConversorNumeros(){}


    // Getters & Setters
    public int getResultat(){

        return this.resultat;
    }


    public void setResultat(int resultat){

        this.resultat += resultat;
    }


    // Metodes

    /**
     * Verificam que el nombre a traduir sigui un nombre romà valid
     * @param nombre
     * @return boolean
     */
    public static boolean verificar(String nombre){

        String verificacio = "^(M{0,3}(CM|CD|D?)C{0,3}(XC|XL|L?)X{0,3}(IX|IV|V?)I{0,3})";

        return nombre.matches(verificacio);

    }


    /**
     * Calculam els valors substractius del nombre romà
     * i ho guardam a la variable resultat
     * @param nombre
     */
    public void calcularGrupsSubstractius(String nombre) {

        String valoresSubstractius = "C[MD]|XC|XL|IX|IV";
        Pattern patt = Pattern.compile(valoresSubstractius);
        Matcher match = patt.matcher(nombre);

        while (match.find()) {

            for (Numeros roma : Numeros.values()) {

                if (roma.name().equals(match.group())) {

                   this.setResultat(roma.getNombre());

                }
            }
        }
    }


    /**
     * Calculam els valors ssumatoris del nombre romà
     * i ho guardam a la variable resultat
     * @param nombre
     */
    public void calcularGrupsSumatoris(String nombre){

            //String regexSumatoris = "C(?![MD])|X(?![CLMD])|I(?![XCLDMV])";
            String regexSumatoris = "(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])";
            Pattern patt = Pattern.compile(regexSumatoris);
            Matcher matcher = patt.matcher(nombre);

            while (matcher.find()){

                for (Numeros roma : Numeros.values()) {

                    if (matcher.group().equals(roma.name())) {

                        this.setResultat(roma.getNombre());

                    }

                }

        }

    }


    /**
     * Crida als mètodes anteriors i retorna el resultat
     * @param roma
     * @return resultat
     */
    public int convertirNumeroRoma(String roma) {

        this.calcularGrupsSubstractius(roma);
        this.calcularGrupsSumatoris(roma);

        return this.getResultat();

    }
}
