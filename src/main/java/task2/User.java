package task2;

import java.io.Serializable;

public class User implements Serializable {

    private String userName;
    private Integer userAge;


    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        System.out.println(userAge);
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
