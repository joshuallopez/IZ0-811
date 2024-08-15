public class HTMLTableExample {
    public static void main(String[] args) {
        String[] names = {"Amy", "Bob", "Charlie"};
        int [] numbers = {1, 2, 3};

        System.out.println("<table>");
        System.out.println("<tr><th>Name</th><th>Value</th></tr>");
        for(int i = 0; i < names.length; i++){
            System.out.printf("<tr><td>%s</td><td>%d</td></tr>\n", names[i], numbers[i]);
        }
        System.out.println("</table>");
    }
}
