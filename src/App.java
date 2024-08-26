public class App {
    public static void main(String[] args) throws Exception {

        Lavadora lavadora1 = new Lavadora("samgung", "x3000", "blanco");
        System.out.println(lavadora1.toString());
        System.out.println(lavadora1.encendido(true));
        System.out.println(lavadora1.tiempo(3));
        System.out.println(lavadora1.llenado(3));
        BocinaInteligente bocina1 = new BocinaInteligente("alexa","adiel cuac","negro");
        System.out.println(bocina1.toString());
        System.out.println(bocina1.encendido(true));
        System.out.println(bocina1.volumen(50));
        System.out.println(bocina1.reproducir("waste"));

    }


}

