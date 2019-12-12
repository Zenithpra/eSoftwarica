package com.zenith.esoftwaricathidassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText textUsername;
    private EditText textPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textUsername=findViewById(R.id.textusername);
        textPassword=findViewById(R.id.textpassword);

        btnLogin=findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username,password;
        username=textUsername.getText().toString();
        password=textPassword.getText().toString();

        if(username.equals("admin") && password.equals("admin")){
            Intent intent= new Intent(MainActivity.this,NavigationContentActivity.class);
            startActivity(intent);
        }
        else{
            textUsername.setText("");
            textPassword.setText("");
            Toast.makeText(this, "Username or Password Incorrect.", Toast.LENGTH_LONG).show();
        }
    }
}
