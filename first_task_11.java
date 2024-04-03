public class first_task_11 {
    public static void main(String[] args) {
        String originalStr = "Java is a programming language";
        int index = originalStr.indexOf("programming");
        if (index != -1) {
            String modifiedStr = originalStr.substring(0, index) + "Java was a programming language";
            System.out.println(modifiedStr);
        }
    }
}
