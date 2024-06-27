/**
 * Clase que representa una tabla hash de listas de artículos.
 */
public class HashtableListaArticulos(){
    public int tamano;
    public ListaArticulos[] palabras;

    /**
     * Constructor de la clase HashtableListaArticulos.
     * 
     * @param tamano El tamaño de la tabla hash.
     */

    public HashtableListaArticulos(int tamano){
        this.tamano=tamano;
        this.palabras=new ListaArticulos[tamano];
        for (i=0; i<tamano; i++){
            this.palabras[i] = new ListaArticulos
        }
    }

    /**
     * Calcula el índice hash para una palabra clave.
     * 
     * @param pc La palabra clave.
     * @return El índice hash.
     */
    
    public int hash(String pc){
        int index =0;
        for (int i=0; i< pc.length, i++){
            index += Integer.parseInt(titulo.charAt(i));
            
        }
        return index % tamano;
    }

    /**
     * Inserta un artículo en la tabla hash.
     * 
     * @param titulo  El título del artículo.
     * @param autor   El autor del artículo.
     * @param resumen El resumen del artículo.
     * @param pc      Las palabras clave del artículo.
     */

    public void insertarArticulo(String titulo, String autor, String resumen, String[] pc){
        int index = this.hash(String titulo);
        for(i=0; i<pc.length; i++){
            if(!this.palabras[index].primero.pc.equals("")){
                this.palabras[index].primero.titulo = titulo;
                this.palabras[index].primero.autor = autor;
                this.palabras[index].primero.resumen = resumen;
                this.palabras[index].primero.pc = pc[i];
            }else{
                if(!pc.toUpperCase().equals(this.palabras[index].primero.pc)){
                    int aux = index + 1;
                    boolean insertar = true;
                    while(!this.palabras[index].palabras.equals("")){
                        if(pc[i].toUpperCase().equals(this.articulos[index].primero.pc)){
                            insertar = false;
                            break;
                        } 
                        aux++;
                        if(aux == tamano){aux = 0}
                        else if (index == aux){
                            aux = nuevoArreglo()
                            break;}
                    }
                    if(insertar){
                        this.articulos[aux].titulo = titulo;
                        this.articulos[aux].autor = autor;
                        this.articulos[aux].resumen = resumen;
                        this.articulos[aux].pc = pc;
                    }
                }else{
                    ArticulosCientificos x = new ArticulosCientificos ();
                    x.titulo = titulo;
                    x.autor = autor;
                    x.resumen = resumen;
                    x.pc = pc;
                    this.articulos[index].insertar.titulo
                }
            }
        }
    }

    /**
     * Busca una palabra clave en la tabla hash.
     * 
     * @param pc La palabra clave.
     * @return La lista de artículos que contiene la palabra clave.
     */

    public ListaArticulos BuscarPalabraClave(String pc){
        int index = this.hash(String pc);
        if(this.arreglo[index].primero.pc.equals(pc)){
            return this.arreglo[index]
        }else{
            int aux = index + 1
            while(!this.arreglo[index].primero.pc.equals(pc)){
                if(index==aux)
                    return null;
                }
                aux++;
                if(aux==tamano){aux=0}
            }
            return this.arreglo[aux]
        }
    }
}
