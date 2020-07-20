package com.example.rest.webservices.restfulwebservices;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HelloWorldBean)) {
            return false;
        }
        HelloWorldBean helloWorldBean = (HelloWorldBean) o;
        ret;
    }

    @Override
    public int hashCode() {
        return Objects.hashCod);
    }

    @Override
    public String toString() {
        return "{" + "}";
    }

}
