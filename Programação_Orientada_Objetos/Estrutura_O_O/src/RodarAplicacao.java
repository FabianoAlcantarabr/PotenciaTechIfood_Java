public class RodarAplicacao {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Preta");
        carro1.setModelo("Creta");
        carro1.setTanque(50);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro();

        carro2.setCor("Prata");
        carro2.setModelo("Hilux");
        carro2.setTanque(65);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getTanque());
        System.out.println(carro2.totalValorTanque(6.25));
    }
    
}
