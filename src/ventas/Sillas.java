package ventas;

public class Sillas {

    private int precio;
    private String letra;
    private int numero;
    private boolean disponible;

    public Sillas(int precio, String letra, int numero) {
        this.precio = precio;
        this.letra = letra;
        this.numero = numero;
        this.disponible = true;
    }



    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
