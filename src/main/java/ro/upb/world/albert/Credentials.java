package ro.upb.world.albert;

public class Credentials {
    private String email;
    private String password;

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email added:" + this.email);
    }
    public void setPassword(String passwd) {
        password = passwd;
        System.out.println("Password set:" + password);
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

}
