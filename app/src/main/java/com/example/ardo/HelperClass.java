package com.example.ardo;

//import androidx.appcompat.app.AppCompatActivity;

public class HelperClass {
    public HelperClass() {
    }

    String name, email, password, confirmpassword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public HelperClass(String name, String email, String password, String confirmpassword) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_helper_class);
//    }
}