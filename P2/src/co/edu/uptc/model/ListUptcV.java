package co.edu.uptc.model;

public class ListUptcV {

    Object list[];

    public ListUptcV(){
        list = new Object[1];
        list[0] = null;
    }

    public void incrementVector(){
        Object[] aux = new Object[list.length + 1];
        for (int i = 0; i <= aux.length ; i++)
            aux[i] = list[i];
        aux[aux.length-1] = null;
        list = aux;
    }

    public void decrementVector(){
        Object [] aux = new Object[list.length -1];
        for (int i = 0; i <= aux.length; i++){
            if (list[i]==null){
                list [i] = list[i+1];
                list[i+1] = null;
            }
            aux[i] = list[i];
        }
        aux[aux.length-1] = null;
    }

    public void delete(int index){
        list[index] = null;
        decrementVector();
    }

    public void add(Object o){
        list[list.length -1] = o;
        incrementVector();
    }

    public int size(){
        return list.length;
    }

}
