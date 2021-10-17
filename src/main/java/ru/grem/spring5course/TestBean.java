package ru.grem.spring5course;

public class TestBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestBean(String name) {
        this.name = name;
    }
}
