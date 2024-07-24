public class LoopOne {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers [i - 1] + numbers[i - 2];
        }
        for(int i : numbers){
            System.out.println(i);
        }

        int x = 2;
        while(x < numbers.length){
            numbers[x] = numbers[x - 1] + numbers[x - 2];
            x++;
        }
    }
}
