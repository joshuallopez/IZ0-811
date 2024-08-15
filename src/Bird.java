public class Bird {

    //Instance Variables

    private int age;
    private float wingSpan;
    private double weight;
    private boolean canFly;
    private String species;

    //Static Variables

    private static int totalBirds;
    private static float averageWingSpan;
    private static double averageWeight;
    private static boolean commonFlyAbility;
    private static String commonSpecies;

    //Constructor

    public Bird(int age, float wingSpan, double weight, boolean canFly, String species) {
        this.age = age;
        this.wingSpan = wingSpan;
        this.weight = weight;
        this.canFly = canFly;
        this.species = species;
    }

    public void fly(){
        System.out.println("Bird Details:");
        System.out.println("Age: " + age);
        System.out.println("Wing Span: " + wingSpan);
        System.out.println("Weight: " + weight);
        System.out.println("Can Fly: " + canFly);
        System.out.println("Species: " + species);

        // Print static variables
        System.out.println("Total Birds: " + totalBirds);
        System.out.println("Average Wing Span: " + averageWingSpan);
        System.out.println("Average Weight: " + averageWeight);
        System.out.println("Common Fly Ability: " + commonFlyAbility);
        System.out.println("Common Species: " + commonSpecies);

        if(canFly){
            System.out.println(species + " is Flying!");
        }
        else{
            System.out.println(species + " cannot fly.");
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public float getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(float wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isCanFly() {
        return canFly;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    //Getter and Setter methods for static instances.
    public static int getTotalBirds() {
        return totalBirds;
    }
    public static void setTotalBirds(int totalBirds) {
        Bird.totalBirds = totalBirds;
    }

    public static float getAverageWingSpan() {
        return averageWingSpan;
    }
    public static void setAverageWingSpan(float averageWingSpan){
        Bird.averageWeight = averageWingSpan;
    }

    public static double getAverageWeight(){
        return averageWeight;
    }
    public static void setAverageWeight(double averageWeight){
        Bird.averageWeight = averageWeight;
    }

    public static boolean getCommonFlyAbility() {
        return commonFlyAbility;
    }
    public static void setCommonFlyAbility(boolean commonFlyAbility) {
        Bird.commonFlyAbility = commonFlyAbility;
    }
    public static String getCommonSpecies() {
        return commonSpecies;
    }
    public static void setCommonSpecies(String commonSpecies) {
        Bird.commonSpecies = commonSpecies;
    }

    public static void main(String[] args) {
        Bird birdie = new Bird(3, 2.5f, 1.5, true, "Eagle");
        birdie.fly();
        Bird birdieTwo = new Bird(3, 2.5f, 1.5, false, "Penguin");
        birdieTwo.fly();

        Bird.setTotalBirds(2);
        Bird.setAverageWingSpan((birdie.getWingSpan() + birdieTwo.getWingSpan()) / 2);
        Bird.setAverageWeight((birdie.getWeight() + birdieTwo.getWeight()) / 2);
        Bird.setCommonFlyAbility(false);
        Bird.setCommonSpecies("Birds");

        System.out.println("Total Birds: " + Bird.getTotalBirds());
        System.out.println("Average Wing Span: " + Bird.getAverageWingSpan());
        System.out.println("Average Weight: " + Bird.getAverageWeight());
        System.out.println("Common Fly Ability: " + Bird.getCommonFlyAbility());
        System.out.println("Common Species: " + Bird.getCommonSpecies());

    }
}
