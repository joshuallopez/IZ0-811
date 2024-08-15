public class TestClass {
    private static Bird bird;
    private static Bird birdTwo;

    public static void main(String[] args) {
        bird = new Bird(2, 1.5f, 2.3, true, "Sparrow");
        TestClass testClass = new TestClass();
        testClass.birdTwo = new Bird(4, 3.2f, 4.5, false, "Penguin");

        // Assign values to the members of bird1 using bird2
        bird.setAge(testClass.birdTwo.getAge());
        bird.setWingSpan(testClass.birdTwo.getWingSpan());
        bird.setWeight(testClass.birdTwo.getWeight());
        bird.setCanFly(testClass.birdTwo.isCanFly());
        bird.setSpecies(testClass.birdTwo.getSpecies());

        // Print out the instance variables of both Bird objects
        System.out.println("Bird 1 Instance Variables:");
        System.out.println("Age: " + bird.getAge());
        System.out.println("Wing Span: " + bird.getWingSpan());
        System.out.println("Weight: " + bird.getWeight());
        System.out.println("Can Fly: " + bird.isCanFly());
        System.out.println("Species: " + bird.getSpecies());

        System.out.println("\nBird 2 Instance Variables:");
        System.out.println("Age: " + testClass.birdTwo.getAge());
        System.out.println("Wing Span: " + testClass.birdTwo.getWingSpan());
        System.out.println("Weight: " + testClass.birdTwo.getWeight());
        System.out.println("Can Fly: " + testClass.birdTwo.isCanFly());
        System.out.println("Species: " + testClass.birdTwo.getSpecies());


        Student student = new Student(1, "Original Name", "Original Address");
        method1(student);
    }
    public static void method1(Student student){
        student.setStudentId(1001);
        student.setStudentName("Updated Name");
        student.setAddress("Updated Address");
        student.setSchoolNames("Updated School");

        method2(student);

        System.out.println("\nBack in method1 after method2:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("School Names: " + student.getSchoolNames());
    }
    public static void method2(Student student){
        // Print the current values
        System.out.println("\nIn method2:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("School Names: " + student.getSchoolNames());

        // Assign a new Student object to the parameter
        student = new Student(2002, "New Student", "New Address");
        student.setSchoolNames("New School");

        // Update the instance fields of the new Student object
        student.setStudentId(3003);
        student.setStudentName("Another Name");
        student.setAddress("Another Address");

        // Print the updated values
        System.out.println("\nIn method2 after reassigning:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("School Names: " + student.getSchoolNames());
    }
}
