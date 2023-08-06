package Day2;

public class person {
    private int pid;
    private String name;

    public person() {
        this.pid = 0;
        this.name = "";
        ;
    }

    public person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    // getter
    public int getPid() {
        return this.pid;
    }

    public String getName() {
        return this.name;
    }

    // setter
    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.pid + " " + this.name;

    }
}
