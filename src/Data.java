import java.util.ArrayList;

public class Data {
    public int value;
    public static void main(String[] args){
        Data d = new Data();
        d.value = 0;
        Data[] data = new Data[3];
        data[0] = d;
        data[1] = d;
        data[2] = d;

        int[] intArray = {1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<intArray.length; i+=2){
            list.add(intArray[i]);
        }

        for(int i = 0; i<list.size(); i++){
            if(list.get(i) % 2 ==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

        int midList = list.size() / 2;
        list.add(midList, 2);
        System.out.println("Updated list: " + list);

    }
}
