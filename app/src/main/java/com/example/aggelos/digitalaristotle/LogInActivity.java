package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aggelos.myapplication.R;

public class LogInActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView vtinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        vtinfo = (TextView)findViewById(R.id.vtinfo);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
  }

        private void validate(String userName,String userPassword){

        if(userName.equals("admin") && userPassword.equals("admin")){
            Intent intent = new Intent(LogInActivity.this,CategoryActivity.class);
            startActivity(intent);
        }else{
            vtinfo.setText("Wrong username or password");
        }

    }
}




