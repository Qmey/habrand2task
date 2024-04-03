public class first_task_22 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String input = args[0];
            if (input.equals("open")) {
                System.out.println("Opening file...");
            } else {
                System.out.println("Invalid command");
            }
        } else {
            System.out.println("No command provided");
        }
    }
}
