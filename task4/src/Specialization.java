public enum Specialization {
    THERAPIST("Терапевт"),
    THROAT("Лор"),
    NEUROLOGIST("Невролог"),
    GASTROENTEROLOGIST("Гастроэнтеролог"),
    PSYCHIATRIST("Психиатр");

    private final String name;

    Specialization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
