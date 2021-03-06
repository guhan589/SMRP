package com.example.smrp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    Button Btn_login; //로그인 버튼 객체
    EditText Txt_id, Txt_password; // 아이디 입력 객체, 비밀번호 입력 객체
    String id="", password=""; // 사용자의 아이디와 비밀번호를 저장하는 변수
    TextView tv_findId;
    ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Txt_id =findViewById(R.id.Txt_id);
        Txt_password = findViewById(R.id.Txt_password);
        Btn_login = findViewById(R.id.Btn_Innerlogin);
        tv_findId = findViewById(R.id.tv_findId);
        iv_back = findViewById(R.id.iv_back);

        Btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        tv_findId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, findIdActivity.class);
                startActivity(intent);

            }
        });

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        id = String.valueOf(Txt_id.getText());
        password = String.valueOf(Txt_password.getText());

    }
}
