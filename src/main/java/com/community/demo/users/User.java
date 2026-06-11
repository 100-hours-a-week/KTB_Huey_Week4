package com.community.demo.users;

public class User {
    private long id;
    private String nickname;
    private String profileImage;
    private boolean is_deleted;
    private static long auto_increment = 1;

    public User(String nickname, String profileImage) {
        this.nickname = nickname;
        this.profileImage = profileImage;
        is_deleted = false;

        this.id = auto_increment;
        auto_increment++;
    }

    public void modifyNickname(String modifiedNickname) {
        this.nickname = modifiedNickname;
    }

    public void signout() {
        is_deleted = true;
    }
}
