import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ExemploOrdenado {
    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
        int idade;
        String nome;
        String cor;
        add(new Gato(nome = "Jon", idade = 18, cor = "Preto"));
          add(new Gato(nome = "Simba", idade = 6, cor = "Tigrado"));
          add(new Gato(nome = "Jon", idade = 12, cor = "Amarelo"));   
        }};
        System.out.println(meusGatos);

        System.out.println("Ordem de Inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem Aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Compare nomes");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordenar por idade");
        //Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort( new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("ordenar nor cor");
        //meusGatos.sort( new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/Cor/ Idade");
        //meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

  
    @Override
    public String toString() {
        return "Gato{" + "nome ='" + nome + '\'' + ", idade = " + idade + ", cor = '" + cor + '\'' +

        '}';
        
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
    
    class ComparatorIdade implements Comparator<Gato> {

        @Override
        public int compare(Gato g1, Gato g2) {
            // TODO Auto-generated method stub
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    class ComparatorCor implements Comparator<Gato> {

            @Override
            public int compare(Gato g1, Gato g2) {
                // TODO Auto-generated method stub
                return g1.getCor().compareToIgnoreCase(g2.getCor());
            }

        }

    /*class ComparatorNomeCorIdade implements Comparator<Gato> {

            private static final int Integer = 0;

            /* (non-Javadoc)
             * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
             */
            /* @Override
            public int compare(Gato g1, Gato g2) {
                int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
                if (nome != 0)
                    return nome;
                int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
                if (cor != 0)
                    return cor;

                return Integer compare(g1.getIdade(), g2.getIdade());
            }
        
    }*/
    
}
