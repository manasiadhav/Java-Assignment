public class Student {
    private int prn;
    private String name;
    private String dob;
    private float marks;

    public Student(int prn) {
        this.prn = prn;
    }

    public Student(int prn, String name) {
        this(prn);
        this.name = name;
    }

    public Student(int prn, String name, float marks) {
        this(prn , name);
        this.marks = marks;
    }

    public Student(int prn, String name, String dob, float marks) {
        this(prn , name, marks);
        this.dob = dob;
    }

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob){
        this.dob=dob;
    }
    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

}
