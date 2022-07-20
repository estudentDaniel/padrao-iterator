package Iterator;

public class Main {
    
    public static void main(String[] args) {
        Fruta [] index = new Fruta[4];
//nao precisa saber se é array, vetor e etc ele faz 
            index[0] = new Fruta("maçã");
            index[1] = new Fruta("banana");
            index[2] = new Fruta("pera");
            index[3] = new Fruta("uva");

            Iterator iteratorIndex = new FrutasIterator(index);

            while (iteratorIndex.hashNext()) {
                Fruta fruta = (Fruta)iteratorIndex.next();
                System.out.println(fruta.nome);
            }
    }
 
}
