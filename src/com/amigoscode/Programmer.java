package com.amigoscode;

public class Programmer extends  Employee {

    private String[] programmingLanguages;

    public Programmer(String name, String address, int age, String experience) {
        super(name, address, age, experience);
    }

    public Programmer(String name, String address, int age, String experience, String[] programmingLanguages) {
        super(name, address, age, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeSomeCode(){
        super.sayHi();
        System.out.println(this.name + ":Writing some code...");
    }

    @Override
    public void sayHi() {
        var msg = """
                Hello my name is %s
                I'm a programmer
                """.formatted(this.name);
        System.out.println(msg);
    }
}
