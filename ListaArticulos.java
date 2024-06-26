public class ListaArticulos{
    public ArticulosCientificos primero;
    public int tamano;

    public ListaArticulos(){
        primero = null;
        tamano = 0;
    }

    public void insertarFinal(ArticulosCientificos nuevo){
        ArticulosCientificos auxiliar = this.primero;
        while(auxiliar.siguiente != null){
            auxiliar = auxiliar.siguiente
        }
        auxiliar.siguiente = nuevo;
        tamano++;
    }