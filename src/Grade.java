public class Grade {
    private String subject;
    private double value;

    public Grade(String subject, double value) {
        this.subject = subject;
        this.value = value;
    }

    public String getSubject() {
        return this.subject;
    }

    public double getValue() {
        return this.value;
    }
}

