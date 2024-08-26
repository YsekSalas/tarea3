/**
 * Representa una bocina inteligente con capacidades de reproducción de música, control de volumen y encendido/apagado.
 */
public class BocinaInteligente {

    // Atributos
    private String marca;
    private String modelo;
    private String color;
    private int volumen;
    private boolean encendido;
    private boolean reproductor;

    /**
     * Crea una instancia de BocinaInteligente con valores predeterminados.
     */

    public BocinaInteligente() {
    }

    /**
     * Crea una instancia de BocinaInteligente con la marca, modelo y color especificados.
     *
     * @param marca El marca de la bocina.
     * @param modelo El modelo de la bocina.
     * @param color El color de la bocina.
     */

    public BocinaInteligente(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Crea una instancia de BocinaInteligente con todos los atributos especificados.
     *
     * @param marca El marca de la bocina.
     * @param modelo El modelo de la bocina.
     * @param color El color de la bocina.
     * @param volumen El nivel de volumen inicial de la bocina.
     * @param encendido El estado de encendido de la bocina (true si está encendida, false si está apagada).
     * @param reproductor El estado del reproductor (true si está activo, false si está inactivo).
     */

    public BocinaInteligente(String marca, String modelo, String color, int volumen, boolean encendido,boolean reproductor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.volumen = volumen;
        this.encendido = encendido;
        this.reproductor = reproductor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public boolean isReproductor() {
        return reproductor;
    }
    public void setReproductor(boolean reproductor) {
        this.reproductor = reproductor;
    }
    
     /**
     * Devuelve una representación en cadena de la bocina inteligente.
     *
     * @return Una cadena que representa el estado actual de la bocina inteligente.
     */

    @Override
    public String toString() {
        return "BocinaInteligente [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", volumen=" + volumen
                + ", encendido=" + encendido + ", reproductor=" + reproductor + "]";
    }

    /**
     * Cambia el estado de encendido de la bocina inteligente.
     *
     * @param indicador El nuevo estado de encendido (true para encender, false para apagar).
     * @return Una cadena que indica si la bocina está encendida o apagada.
     */

    public String encendido(boolean indicador){
        String estado = "";
        this.encendido = indicador;
        estado = indicador ? "Encendido" : "Apagado";

        return estado;
    }

    /**
     * Ajusta el volumen de la bocina inteligente.
     *
     * @param nivel El nuevo nivel de volumen que se desea establecer. El volumen solo se ajusta si está en el rango de 1 a 99.
     * @return Una cadena que indica el volumen actual.
     */

    public String volumen(int nivel){
        String estado = "";
        if (nivel > 0 && nivel < 100){
            this.volumen += nivel;
            estado = "volumen actual: " + this.volumen;
        }
        return estado;
    }

    /**
     * Activa el reproductor de la bocina inteligente con una reproducción aleatoria.
     *
     * @return Una cadena que indica que la reproducción es aleatoria.
     */

    public String reproducir(){
        String reproduciendo = "aleatorio";
        this.reproductor = true;
        return reproduciendo;
    }

    /**
     * Activa el reproductor de la bocina inteligente para reproducir una canción específica.
     *
     * @param rolita El nombre de la canción que se desea reproducir.
     * @return El nombre de la canción que se está reproduciendo.
     */
    
    public String reproducir(String rolita){
        this.reproductor = true;
        return rolita;
    }
}