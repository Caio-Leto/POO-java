package testes;

class Ventilador {
    String modelo;
    String cor;
    int velocidade;
    boolean OneOff;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Um ventilador: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("está desligado?: " + this.OneOff);
    }

    void ligado() {
        if (this.OneOff == true) {
            System.out.println("O ventilador está ligado!");
        } else {
            System.out.println("O ventilador está desligado!");
        }
    }

    void on() {
        this.OneOff = true;
    }

    void of() {
        this.OneOff = false;
    }
}