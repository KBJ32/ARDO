package com.example.ardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class loginActivity extends AppCompatActivity {

    EditText inputEmail, editPassword;
    Button btnLogin;
    TextView textViewSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.inputEmail);
        editPassword = findViewById(R.id.editPassword);
        textViewSignUp = findViewById(R.id.textViewSignUp);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validateEmail() || !validatePassword()){

                }else{
                    checkUser();
                }
            }
        });

        textViewSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }


    public boolean validateEmail() {
        String val = inputEmail.getText().toString();
        if (val.isEmpty()) {
            inputEmail.setError("Email cannot be empty");
            return false;
        } else {
            inputEmail.setError(null);
            return true;
        }
    }

    public boolean validatePassword() {
        String val = editPassword.getText().toString();
        if (val.isEmpty()) {
            editPassword.setError("Password cannot be empty");
            return false;
        } else {
            editPassword.setError(null);
            return true;
        }
    }


    public void checkUser(){
        String userEmail = inputEmail.getText().toString().trim();
        String userPassword = editPassword.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUserDatabase = reference.orderByChild("email").equalTo(userEmail);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    inputEmail.setError(null);

//                    DataSnapshot userEmailDS = snapshot.child(userEmail);

                    DataSnapshot userPasswordDS = snapshot.child("password");

                    final String getpassword = userPasswordDS.getValue(String.class);

                    if(!Objects.equals(getpassword, userPassword)){
                        inputEmail.setError(null);
                        Intent intent = new Intent(loginActivity.this, Mainpageafterlogin.class);
                        startActivity(intent);
                    } else{
                        editPassword.setError("Invalid Credentials");
                        editPassword.requestFocus();

                    }
                }else{
                    inputEmail.setError("User does not exist");
                    inputEmail.requestFocus();
                }
            }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




//        textViewSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(loginActivity.this,RegisterActivity.class));
//            }
//        });




















//        TextView textViewSignup;
////
//        textViewSignup = findViewById(R.id.textViewSignUp);
//        textViewSignup.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, RegisterActivity.class)));
    }
}