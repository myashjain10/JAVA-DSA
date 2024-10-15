package JavaDSA.Arrays.MyArray;

public class MyArray {
    private int[] items;
    private int currentIndex;// this represent the index at which new value will be inserted = (indexOf(lastValue) + 1)
    public MyArray(int initialSize){
        this.items = new int[initialSize];

    }
    //this will allow us to insert the new values to our array
    public void insert(int value){
        this.items[currentIndex] = value;
        currentIndex++;

    }
    //toString is a predefined function, for Myarray obj, we are overloading it
    // so that we get desired format on system.out
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int num:this.items){
            str.append(num + ", ");
        }
        //after this loop, there will be a comma at the end
        // to remove this , use backspace escape char
        str.append("\b").append("\b").append("]");
        
        return str.toString();

    }

}
