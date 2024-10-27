public class Pinos {
    public static void main(String[] args) {
        PinoRedondo pinoRedondo = new PinoRedondoConcreto(5);
        PinoQuadrado pinoQuadrado = new PinoQuadrado(7);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        BuracoRedondo buraco = new BuracoRedondo(6);

        System.out.println("Pino redondo encaixa? " + buraco.encaixa(pinoRedondo));
        System.out.println("Pino quadrado adaptado encaixa? " + buraco.encaixa(adaptador));
    }
}