package com.example.ardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    TextView existingUser;

    private EditText inputName,inputEmail, inputPassword, inputConfirmPassword;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        existingUser=findViewById(R.id.existingUser);
        inputName=findViewById(R.id.inputName);
        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        inputConfirmPassword=findViewById(R.id.inputConfirmPassword);

        btnRegister=findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(view -> checkCredentials());

        existingUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });

    }
    private void checkCredentials() {
        String Name=inputName.getText().toString();
        String Email=inputEmail.getText().toString();
        String Password=inputPassword.getText().toString();
        String ConfirmPassword=inputConfirmPassword.getText().toString();

        if (Name.isEmpty())
        {
            inputName.setError("Your name is not valid..!");
            return;
        }
        if (!Email.contains("@"))
        {
            inputEmail.setError("Email ID is not valid");
            return;
        }
        if (Password.length()<7)
        {
            inputPassword.setError("Password is not valid");
            return;
        }
        if (!ConfirmPassword.equals(Password))
        {
            inputConfirmPassword.setError("Password does not match");
            return;
        }
        else
        {
            Toast.makeText(this, "Registration", Toast.LENGTH_SHORT).show();
        }
    }

    private void showError(EditText input, String s) {

        input.setError(s);
        input.requestFocus();
    }

}