package com.example.ardo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {


//    TextView existingUser;
//DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://ardo-2c5f5-default-rtdb.firebaseio.com/").child("users");

    Button btn;



    EditText inputName,inputEmail, inputPassword, inputConfirmPassword;
    Button btnRegister;
    TextView existingUser;
    FirebaseDatabase database;
    DatabaseReference reference;

//    private FirebaseDatabase db = FirebaseDatabase.getInstance();
//    private DatabaseReference root = db.getReference().child("Users");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


//        TextView btn =findViewById(R.id.existingUser);


        inputName = findViewById(R.id.editPassword);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConfirmPassword);
        btnRegister = findViewById(R.id.btnRegister);
        existingUser = findViewById(R.id.existingUser);

//
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String Name = inputName.getText().toString();
//                String Email = inputEmail.getText().toString();
//                String Password = inputPassword.getText().toString();
//                String ConfirmPassword = inputConfirmPassword.getText().toString();
//
////                using hashmap
//                HashMap<String, String> userMap = new HashMap<>();
//                userMap.put("Name", Name);
//                userMap.put("Email", Email);
//                userMap.put("Password", Password);
//                userMap.put("ConfirmPassword", ConfirmPassword);
//                root.push().setValue(userMap);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String Name = inputName.getText().toString();
                String Email = inputEmail.getText().toString();
                String Password = inputPassword.getText().toString();
                String ConfirmPassword = inputConfirmPassword.getText().toString();

                HelperClass helperClass = new HelperClass(Name, Email, Password, ConfirmPassword);
                reference.child(Name).setValue(helperClass);

                Toast.makeText(RegisterActivity.this, "Registration", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegisterActivity.this, loginActivity.class);
                startActivity(intent);

            }
        });


        existingUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
    }












//        existingUser = findViewById(R.id.existingUser);
//        existingUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(RegisterActivity.this, loginActivity.class));
//            }
//        });

//         btn1 =findViewById(R.id.next);
//          btn1.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//                  startActivity(new Intent(RegisterActivity.this,dummyActivity.class));
//              }
//          });


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String Name=inputName.getText().toString();
//                String Email=inputEmail.getText().toString();
//                String Password=inputPassword.getText().toString();
//                String ConfirmPassword=inputConfirmPassword.getText().toString();
//
//             using hashmap

//                HashMap<String, String> userMap = new HashMap<>();
//                userMap.put("Name", Name);
//                userMap.put("Email", Email);
//                userMap.put("Password", Password);
//                userMap.put("ConfirmPassword", ConfirmPassword);
//                root.push().setValue(userMap);
//
//
//                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
//            }
//        });

//
//        void checkCredentials(){
//        String Name;
//        String Email;
//        String Password;
//        String ConfirmPassword;
//
//        {
//            Name = inputName.getText().toString();
//            Email = inputEmail.getText().toString();
//            Password = inputPassword.getText().toString();
//            ConfirmPassword = inputConfirmPassword.getText().toString();
//        }
//
//
//        if (Name.isEmpty())
//        {
//            inputName.setError("Your name is not valid..!");
//            return;
//        }
//        if (!Email.contains("@"))
//        {
//            inputEmail.setError("Email ID is not valid");
//            return;
//        }
//        if (Password.length()<7)
//        {
//            inputPassword.setError("Password is not valid");
//            return;
//        }
//        if (!ConfirmPassword.equals(Password))
//        {
//            inputConfirmPassword.setError("Password does not match");
//            return;
//        }
//        else
//        {
//            Toast.makeText(this, "Registration", Toast.LENGTH_SHORT).show();
//        }
//    }

//    private void showError(EditText input, String s) {
//
//        input.setError(s);
//        input.requestFocus();
//
//    }
    }

