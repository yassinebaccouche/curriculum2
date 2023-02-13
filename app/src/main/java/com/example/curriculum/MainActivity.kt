package com.example.curriculum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        var name=findViewById<EditText>(R.id.name);
        var age=findViewById<EditText>(R.id.age);
        var email=findViewById<EditText>(R.id.email);

        var btn=findViewById<Button>(R.id.next);

        btn.setOnClickListener(View.OnClickListener {
            if(name.text.isEmpty()){
                Toast.makeText(applicationContext,"Entrer votre nom",Toast.LENGTH_LONG).show();

            }else{
                if(age.text.isEmpty()){
                    Toast.makeText(applicationContext,"Entrer votre age",Toast.LENGTH_LONG).show();
                }else{
                    if(email.text.isEmpty()){
                        Toast.makeText(applicationContext,"Entrer votre email",Toast.LENGTH_LONG).show();
                    }else{
                        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email.text).matches()){
                            Toast.makeText(applicationContext,"Invalide Email",Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }



        })

    }
}