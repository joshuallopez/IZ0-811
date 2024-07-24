public class PlayingWFLoops {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        //Print alternate elements.
        for(int x : numbers){
            if(x%2==0){
                System.out.print(x + ", ");
            }
        }
        //Print Reverse alternate elements
        for(int i = numbers.length-1; i >= 0; i--){
            if(numbers[i]%2==0){
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
