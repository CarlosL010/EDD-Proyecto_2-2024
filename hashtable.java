
public class Hashtable(){
    public int tamano;
    public ArticulosCientificos[] articulos;

    public Hashtable(int tamano){
        this.tamano=tamano;
        this.articulos = new ArticulosCientificos[tamano];
        for (i=0; i< tamano, i++){
            this.articulos[i] = new ArticulosCientificos();
        }
    }

    public int hash(String titulo){
        int index =0;
        for (i=0; i< titulo.length, i++){
            index += Integer.parseInt(titulo.charAt(i));
        }
        return index % tamano;
    }

    public void insertarArticulo(String titulo, String autor, String resumen, String[] pc){
        int index = this.hash(String titulo);
        if(!this.articulos[index].titulo.equals("")){
            this.articulos[index].titulo = titulo;
            this.articulos[index].autor = autor;
            this.articulos[index].resumen = resumen;
            this.articulos[index].pc = pc;
        }else{
            if(!titulo.toUpperCase().equals(this.articulos[index].titulo)){
                int aux = index + 1;
                boolean insertar = true;
                while(!this.articulos[index].titulo.equals("")){
                    if(titulo.toUpperCase().equals(this.articulos[index].titulo)){
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
            }
        }
    }

    public int nuevoArreglo(){
        int t = tamano;
        ArticulosCientificos[] arreglo = new ArticulosCientificos[tamano + 1];
        for (i=0; i< tamano, i++){
            this.arreglo[i] =this.articulos[i];
            
        }
        tamano = tamano ++;
        return t;

    }
    
    public ArticulosCientificos buscarTitulo(String titulo){
        int index = this.hash(String titulo);
        if(this.arreglo[index].titulo.equals(titulo)){
            return this.arreglo[index]
        }else{
            int aux = index + 1
            while(!this.arreglo[index].titulo.equals(titulo)){
                if(index==aux)
                    return null;
                }
                aux++;
                if(aux==tamano){aux=0}
            }
            return this.arreglo[aux]
        }
    }

    public ListaArticulos buscarAutor(String autor){
        ListaArticulos encontrados = new ListaArticulos();
        for(i=0; i<tamano; i++){
            if (this.articulos[i].autor.equals(autor)){
                encontrados.insertarFinal(this.articulos[i])
            }
        }
        return encontrados;
    }
}