package Desafios;

public class HerancaPolimorfismo {
    static class Veiculo{
        String marca;
        String modelo;

        public Veiculo(String marca, String modelo){
            this.marca = marca;
            this.modelo = modelo;
        }

        public void acelerar(){
            System.out.println("O veiculo está acelerando.");

        }
    }

    static class Carro extends Veiculo{
        public Carro(String marca, String modelo){
            super(marca, modelo);
        }
        public void acelerar(){
            System.out.println("O carro está acelerando rapidamente");
        }
    }

    static class Moto extends Veiculo{
        public Moto(String marca, String modelo){
            super(marca, modelo);
        }

        @Override
        public void acelerar() {
            System.out.println("A moto está acelerando com agilidade");
        }

        public class Main{
            public static void main(String[] args) {
                Veiculo carro = new Carro("Chevrolet", "Celta");
                Veiculo moto = new Moto("Honda", "CBR");

                carro.acelerar();
                moto.acelerar();

            }
        }
    }
}
