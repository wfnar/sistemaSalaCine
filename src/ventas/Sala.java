package ventas;

public class Sala {

    Sillas[][] sillasSala = new Sillas[7][7];


    public Sala() {
        llenarSala();
    }



    private void llenarSala(){
        for(int fila=0;fila<sillasSala.length;fila++){
            char letra = (char)(65+fila);
            int precioSilla=0;
            if (fila<2) {
                precioSilla = 10000;

            }
            else if(fila<5){
                precioSilla = 20000;
            }
            else{
                precioSilla = 25000;
            }
                for (int columna = 0; columna< sillasSala[fila].length; columna++) {

                    sillasSala[fila][columna] = new Sillas(precioSilla, String.valueOf(letra), (columna + 1));
                }

        }

    }


}
