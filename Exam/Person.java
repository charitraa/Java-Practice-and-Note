package Day2;

public class Person {
    private int pid;
    private String fullname, address;

    public Person() {
        this.pid = 0;
        this.fullname = "";
        this.address = "";
    }

    public Person(int pid, String fullname, String address) {
        this.pid = pid;
        this.fullname = fullname;
        this.address = address;
    }

    public int getPid() {
        return this.pid;

    }

    public String getFullName() {
        return this.fullname;

    }

    public String getAddress() {
        return this.address;

    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return this.pid + ", " + this.fullname + ", " + this.address;
    }

}
