package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Login UI Elements
    private EditText userNameTxtField;
    private EditText passwordTxtField;
    private Button loginBtn;

    //Login Informations
    private static final String usernameValue  = "edureka";
    private static final String passwordValue  = "edureka123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inflate UI elements as instances
        userNameTxtField = findViewById(R.id.userNameTxtField);
        passwordTxtField = findViewById(R.id.passwordTxtField);
        loginBtn = findViewById(R.id.loginbtn);

        //Handle LoginBtn OnClickListener
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 //Validate Login credentials
                 if(validateLogin()){
                     displayToastMessage("Successfully authenticated");
                 }else{
                     displayToastMessage("Invalid username or password");
                 }
            }
        });
    }

    protected boolean validateLogin() {

        if (userNameTxtField.getText().toString().equalsIgnoreCase(usernameValue) &&
                    passwordTxtField.getText().toString().equalsIgnoreCase(passwordValue)){

            return true;
        }

        return false;
    }

    protected void displayToastMessage(String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayToastMessage("onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayToastMessage("onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        displayToastMessage("onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        displayToastMessage("onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        displayToastMessage("onDestroy called");
    }

}
