class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class second_task_11 {
    public static void main(String[] args) {
        try {
            validateAge(15);
            System.out.println("Age validated successfully");
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
