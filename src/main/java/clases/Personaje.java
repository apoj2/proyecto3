package clases;

public class Personaje {

    // atributos
    public String nombre;
    public int poderPatada;
    public int poderGolpe;
    public int defensa;
    public int superPoder;



    int cantidadDeVida;


    //constructor

    public Personaje() {
    }

    public Personaje(String nombre, int poderPatada, int poderGolpe, int defensa, int superPoder, int cantidadDeVida) {
        this.nombre = nombre;
        this.poderPatada = poderPatada;
        this.poderGolpe = poderGolpe;
        this.defensa = defensa;
        this.superPoder = superPoder;
        this.cantidadDeVida = cantidadDeVida;
    }

    //metodos

    public void atacar(int ataqueEnemigo) {

        this.cantidadDeVida = this.cantidadDeVida - ataqueEnemigo;

    }
    public void defender(int ataqueEnemigo){

        this.cantidadDeVida = cantidadDeVida - (ataqueEnemigo - this.defensa);

    }
    public void aplicarSuperPoder(boolean poder){

        if(poder == true){

            this.poderGolpe = this.poderPatada + this.superPoder;

        }else{

            this.defensa = this.defensa + this.superPoder;

        }



    }


}
