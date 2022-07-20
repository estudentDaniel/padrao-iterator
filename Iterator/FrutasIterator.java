package Iterator;

public class FrutasIterator implements Iterator {
    Fruta [] index;
    int i = 0;

    //constructor
    public FrutasIterator(Fruta[] index) {
        this.index = index;
    }

    @Override
    public boolean hashNext() {
        if (i >= index.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Fruta frutas = index[i]; //estanciando minha fruta
         i++;
        return frutas;
    }

    
    
}
