package com.learning.core.day4;

class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class InvalidNameException extends CatheyBankException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidPostException extends CatheyBankException {
    public InvalidPostException(String message) {
        super(message);
    }
}

class InvalidAgeException extends CatheyBankException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicantName())) {
            throw new InvalidNameException("Invalid Applicant Name");
        }

        if (!isValidPost(applicant.getPostApplied())) {
            throw new InvalidPostException("Invalid Post");
        }

        if (!isValidAge(applicant.getApplicantAge())) {
            throw new InvalidAgeException("Invalid Age");
        }

        System.out.println("All details are valid");
    }

    public boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

    public boolean isValidPost(String post) {
        return post != null && (post.equals("Probationary Officer") ||
                                post.equals("Assistant") ||
                                post.equals("Special Cadre Officer"));
    }

    public boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

class Applicant {
    private String applicantName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

public class D04P03 {
	public static void main(String[] args) {
        Validator validator = new Validator();

        // Test cases
        testValidation("Mary", "Assistant", 34, validator); // Input 1
        testValidation("Mary", "Clerk", 27, validator); // Input 2
        testValidation("", "Probationary Officer", 30, validator); // Input 3
        testValidation("Joseph", "Probationary Officer", 29, validator); // Input 4
    }

    public static void testValidation(String name, String post, int age, Validator validator) {
        try {
            validator.validate(new Applicant(name, post, age));
            System.out.println("All details are valid.");
        } catch (InvalidNameException | InvalidPostException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (CatheyBankException e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
