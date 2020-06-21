package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onSubmitClick (View view){
        TextView _firstName = findViewById(R.id.firstName);
        TextView _lastName = findViewById(R.id.lastName);
        TextView _fullName = findViewById(R.id.fullName);
        TextView _email = findViewById(R.id.email);

        EditText _inputFirstName = findViewById(R.id.inputFirstName);
        EditText _inputLastName = findViewById(R.id.inputLastName);
        EditText _inputEmail = findViewById(R.id.inputEmail);

        _firstName.setText("First Name : "+ _inputFirstName.getText().toString());
        _lastName.setText("Last Name : "+ _inputLastName.getText().toString());
        _fullName.setText("Full Name : " + _inputFirstName.getText().toString() +" " + _inputLastName.getText().toString());
        _email.setText("Email : "+ _inputEmail.getText().toString());


    }
}