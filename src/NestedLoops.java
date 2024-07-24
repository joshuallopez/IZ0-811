public class NestedLoops {
    public static void main(String[] args){
        int [][] values = {{1,2,3}, {2,3}, {4,5,6,4}};
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            for( int j = 0; j < values[i].length; j++){
                sum = sum + values[i][j];
            }
        }
        System.out.println("sum is: " + sum);

        //checkingBob();
        firstBob();
    }

    public static void checkingBob(){
        String[] [] groups = {{"Ally", "Vanessa", "Bob"}, {"Carlos", "Juan", "Gabriel", "Aaron"}, {"Olivier", "Bob", "Brigitte", "Dino"}};

        for(int i = 0; i < groups.length; i++){
            for(String name : groups[i]){
                System.out.println("Checking " + name);
                if("Bob".equals(name)){
                    System.out.println("Found Bob in group " + i);
                    break;
                }
            }
        }
    }

    public static void firstBob(){
        String[] [] groups = {{"Ally", "Vanessa", "Bob", "Josue"}, {"Carlos", "Juan", "Gabriel", "Aaron"}, {"Olivier", "Bob", "Brigitte", "Dino"}};

        BREAKING_LOOPS: for(int i = 0; i < groups.length; i++){
            for(String name : groups[i]){
                System.out.println("Checking " + name);
                if("Bob".equals(name)){
                    System.out.println("Found Bob in group " + i);
                    break BREAKING_LOOPS;
                }
            }
        }
    }
    
}
