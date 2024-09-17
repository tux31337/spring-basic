package hello.hello_spring.controller;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("name = " + name);
        this.name = name;
    }
}
