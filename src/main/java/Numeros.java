public enum Numeros {


    /* Cada nombre romà utilitza el constructor, passant-li el nombre entre parentesis,
    d'aquesta manera s'assigna a la variable nombre */
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000),
    IV(4),
    IX(9),
    XL(40),
    XC(90),
    CD(400),
    CM(900);

    int nombre = 0;

     Numeros(int nombre){

        this.nombre = nombre;

    }

    public int getNombre(){

        return this.nombre;

    }



}
