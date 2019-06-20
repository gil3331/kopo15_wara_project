package edu.polytech.kopo15_wara_project;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button login_button;
        setContentView(R.layout.activity_login);
        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idStr,passStr;
                EditText idEdit, passEdit;
                idEdit = findViewById(R.id.IdEditText);
                passEdit = findViewById(R.id.PassWdEditText);
                idStr = idEdit.getText().toString();
                passStr = passEdit.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);

                intent.putExtra("inputID",idStr);
                intent.putExtra("inputPassword",passStr);



                if(idStr.equals("aaa")&&passStr.equals("1111")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("bbb")&&passStr.equals("2222")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("ccc")&&passStr.equals("3333")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("ddd")&&passStr.equals("4444")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("eee")&&passStr.equals("5555")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("fff")&&passStr.equals("6666")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("ggg")&&passStr.equals("7777")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("hhh")&&passStr.equals("8888")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("iii")&&passStr.equals("9999")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }else if(idStr.equals("jjj")&&passStr.equals("1234")){
                    Toast.makeText(getApplicationContext(),"로그인 성공",Toast.LENGTH_LONG).show();
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"로그인 실패",Toast.LENGTH_LONG).show();
                }
            }
        });





    }
}
