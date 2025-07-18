package org.example.firstspringboot.model;

public class Message {
    private String id;
    private String name;
    private String message;

    public Message(String id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
