package market.dto;

import market.entity.UserRole;
import market.entity.UserSex;

/**
 * Created by ivegotaname on 28.11.16.
 */
public class UserDTO {
    private Integer id;
    private String firstName;
    private String secondName;
    private String birthday;
    private String login;
    private String password;
    private String email;
    private UserSex sex;
    private UserRole role;

    public UserDTO() {
    }

    public UserDTO(Integer id, String firstName, String secondName, String birthday, String login, String password, String email, UserSex sex, UserRole role) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.login = login;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSex getSex() {
        return sex;
    }

    public void setSex(UserSex sex) {
        this.sex = sex;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
