package com.bahar.buploadingvideo.model;

public enum ERole {
    ROLE_ADMIN("admin"),
    ROLE_MODERATOR("pm"),
    ROLE_USER("user");

    private final String name;

    ERole(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
