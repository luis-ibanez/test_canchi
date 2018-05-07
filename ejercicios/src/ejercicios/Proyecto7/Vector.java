package ejercicios.Proyecto7;

/**
 * Created by libanez on 07/05/2018.
 */
public class Vector {

    private int index = 0;
    private int[] data;

    public Vector(){
        data = new int[500];
    }

    //constante
    public void add(int value){
        data[index] = value;
        index ++;
        if(index > data.length-10){
            int[] newData = new int[data.length+500];
            for(int i = 0; i<data.length ; i++){
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    //constante
    public int getLast(){
        int value =  data[index-1];
        index --;
        return value;
    }
}
