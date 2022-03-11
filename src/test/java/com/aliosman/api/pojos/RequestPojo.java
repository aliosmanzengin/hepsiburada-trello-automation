package com.aliosman.api.pojos;

public class RequestPojo {
    private String name;
    private String key;
    private String token;

    public RequestPojo() {
    }

    public RequestPojo(String name, String key, String token) {
        this.name = name;
        this.key = key;
        this.token = token;
    }

    @Override
    public String toString() {
        return "RequestPojo{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

}
