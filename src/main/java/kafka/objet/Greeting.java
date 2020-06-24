package kafka.objet;

public class Greeting {
    private String msg;
    private String name;

    public Greeting(String msg, String name) {
        this.msg = msg;
        this.name = name;
    }

    public Greeting() {
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
