public class ControleFluxo {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
       

    }

    private static void ifFlecha() {
        int mes = 2;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");

            }
        }
    }

    private static void ifSemFlecha() {
        int mes = 1;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        }
    }
    

    
    
    
   
}
