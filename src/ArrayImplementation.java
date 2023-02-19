public class ArrayImplementation {
    private int[] items;
    private int count;
    public ArrayImplementation(int length){
        items = new int[length];
    }
    public void print(){
        for (int i = 0; i<count; i++)
        {
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if (items.length == count){
            //create a new array of double size
            int[] newItems = new int[count*2];
            //copy into new array
            for(int i = 0; i<count;i++)
            {
                newItems[i] = items[i];

            }
            items = newItems;

        }
        items[count++] = item;
    }
    public void removeAt(int index){
        //validate index
        //shift the items to fill the holes
        if(index < 0 || index >=count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i<count;i++)
        {
            items[i] = items[i+1];
        }
        count--;

    }
}
