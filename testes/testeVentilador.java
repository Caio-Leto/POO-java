package testes;

class Ventilador1 {
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador();
        v1.modelo = "Arno";
        v1.cor = "Branco";
        v1.velocidade = 2;
        v1.OneOff = true;

        v1.status();
        v1.ligado();

        Ventilador v2 = new Ventilador();
        v2.modelo = "Mondial";
        v2.cor = "Pink";
        v2.velocidade = 3;
        v2.OneOff = false;

        v2.status();
        v2.ligado();
    }

}