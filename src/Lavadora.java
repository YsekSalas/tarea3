    /**
     * La clase Lavadora representa una lavadora con varias características, 
     * como marca, modelo, color, tiempo de lavado, tipo de lavado, estado de desagüe, 
     * estado de encendido y capacidad de llenado.
     */

public class Lavadora {

    //*ATRIBUTOS*//

    /**
     * La marca de la lavadora.
     */
    private String marca;

    /**
     * El modelo de la lavadora.
     */
    private String modelo;

    /**
     * El color de la lavadora.
     */
    private String color;

    /**
     * El tiempo del ciclo de lavado en minutos.
     */
    private int tiempo;

    /**
     * El tipo de lavado, representado como booleano.
     * True indica lavado intensivo, false indica lavado regular.
     */
    private boolean tipoLavado;

    /**
     * El estado del desagüe. True indica que está activado, false indica que está desactivado.
     */
    private boolean desague;

    /**
     * El estado de encendido de la lavadora. True indica que está encendida, false indica que está apagada.
     */
    private boolean encendido;

    /**
     * La capacidad de llenado en litros de la lavadora.
     */
    private float capacidad;

    //*METODOS**//

    /**
     * Constructor por defecto que crea una nueva instancia de Lavadora sin inicializar sus atributos.
     */

    public Lavadora() {
    }

     /**
     * Constructor que inicializa la lavadora con marca, modelo y color.
     *
     * @param marca La marca de la lavadora.
     * @param modelo El modelo de la lavadora.
     * @param color El color de la lavadora.
     */

    public Lavadora(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Constructor que inicializa todos los atributos de la lavadora.
     *
     * @param marca La marca de la lavadora.
     * @param modelo El modelo de la lavadora.
     * @param color El color de la lavadora.
     * @param tiempo El tiempo del ciclo de lavado.
     * @param tipoLavado El tipo de lavado (intensivo o regular).
     * @param desague El estado del desagüe.
     * @param encendido El estado de encendido de la lavadora.
     * @param capacidad La capacidad de llenado en litros.
     */

    public Lavadora(String marca, String modelo, String color, int tiempo, boolean tipoLavado, boolean desague, boolean encendido, float capacidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tiempo = tiempo;
        this.tipoLavado = tipoLavado;
        this.desague = desague;
        this.encendido = encendido;
        this.capacidad = capacidad;
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
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public boolean isTipoLavado() {
        return tipoLavado;
    }
    public void setTipoLavado(boolean tipoLavado) {
        this.tipoLavado = tipoLavado;
    }
    public boolean isDesague() {
        return desague;
    }
    public void setDesague(boolean desague) {
        this.desague = desague;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public float getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

     /**
     * Retorna una cadena que representa la lavadora con todos sus atributos.
     * 
     * @return Una cadena con la información de la lavadora.
     */
    
    @Override
    public String toString() {
        return "Lavadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tiempo=" + tiempo
                + ", tipoLavado=" + tipoLavado + ", desague=" + desague + ", encendido=" + encendido + ",capacidad=" + capacidad + "]";
    }

    /**
     * Establece el estado de encendido de la lavadora y devuelve una cadena que indica si está encendida o apagada.
     *
     * @param Indicador True para encender la lavadora, false para apagarla.
     * @return Una cadena que indica "Encendido" o "Apagado" según el estado.
     */

    public String encendido(boolean indicador){
        String estado = "";
        this.encendido = indicador;
        estado = indicador?"Encendido":"Apagado";

        return estado;
    }

     /**
     * Establece la duración del ciclo de lavado según la opción seleccionada y devuelve una cadena con la duración.
     *
     * @param ciclo La opción del ciclo (1 a 5).
     * @return Una cadena que indica la duración del ciclo o un mensaje de error si el valor no es permitido.
     */
    
    public String tiempo(int ciclo){
        String duracion = "";
        switch (ciclo) {
            case 1:
                duracion = "duracion 5 min";
                this.tiempo = 5;
            break;

            case 2:
                duracion = "duracion 10 min";
                this.tiempo = 10;
            break;

            case 3:
                duracion = "duracion 15 min";
                this.tiempo = 15;
            break;

            case 4:
                duracion = "duracion 30 min";
                this.tiempo = 30;
            break;

            case 5:
                duracion = "duracion 45 min";
                this.tiempo = 45;
            break;
    
            default:
            duracion = "no esta permitido ese valor";
            break;
        }
        return duracion;
    }

     /**
     * Establece el nivel de llenado según la opción seleccionada y devuelve una cadena con el nivel de llenado.
     *
     * @param opcion La opción del nivel de llenado (1 a 3).
     * @return Una cadena que indica el nivel de llenado o un mensaje de error si el valor no es permitido.
     */

    public String llenado(int opcion){
        String nivel = "";
        switch (opcion) {
            case 1:
                nivel = "llenado minimo "+ 20 + "L";
                this.capacidad = 20;
            break;

            case 2:
                nivel = "llenado medio "+ 40 + "L";
                this.capacidad = 40;
            break;

            case 3:
                nivel = "llenado maximo "+ 60 + "L";
                this.capacidad = 60;
            break;

            default:
            nivel = "llenado no admitido";

            break;
        }
        return nivel;
    }

     /**
     * Establece el nivel de llenado en litros y devuelve una cadena que indica el nivel de llenado.
     * El nivel permitido es entre 0 y 60 litros.
     *
     * @param litros La cantidad de litros a llenar.
     * @return Una cadena que indica el nivel de llenado o un mensaje de error si el valor no es permitido.
     */

    public String llenado(float litros){
        String nivel = "llenado no admitido";
        
        if (litros >= 0 && litros <=60 ){
            this.capacidad = litros;
            nivel = "llenado " + litros + "L";
        };

        return nivel;
    }

    
}
