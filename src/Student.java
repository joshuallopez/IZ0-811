public class Student {
    private int studentId;
    private String studentName;
    private String address;
    public static String fixedField = "Ryerson & McMaster Universities";
    private static String schoolNames = "McMaster & Ryerson Universities";

    public Student(int studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }
    public Student(){
        this(0, "Dummy Name", "Dummy Address");
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchoolNames() {
        return schoolNames;
    }
    public void setSchoolNames(String schoolNames) {
        Student.schoolNames = schoolNames;
    }

    public static void main(String[] args) {
        Student studentOne = new Student(1, "Vanessa", "Thornlea");
        Student studentTwo = new Student(2, "Josue", "Mississauga");
        System.out.println(studentOne.studentId);
        System.out.println(studentOne.studentName);
        System.out.println(studentOne.address);
        System.out.println(studentTwo.studentId);
        System.out.println(studentTwo.studentName);
        System.out.println(studentOne.address);
        System.out.println(fixedField);
        System.out.println(schoolNames);

        Student studentDummy = new Student();
        System.out.println(studentDummy.getStudentId());
        System.out.println(studentDummy.getStudentName());
        System.out.println(studentDummy.getAddress());

        Student studentReal = new Student(2, "Vanessa", "Thornlea");
        System.out.println(studentReal.getStudentId());
        System.out.println(studentReal.getStudentName());
        System.out.println(studentReal.getAddress());
    }

}
