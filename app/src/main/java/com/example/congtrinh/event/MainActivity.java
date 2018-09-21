package com.example.congtrinh.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtSoa,edtSob;
    TextView tvKetQua;
    Button btnTong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSoa=(EditText) findViewById(R.id.edtSoa);
        edtSob=(EditText) findViewById(R.id.edtSob);
        tvKetQua=(TextView) findViewById(R.id.tvKetQua);

    }

    public void btntong2so(View view) {
        int a= Integer.parseInt(edtSoa.getText()+"");
        int b= Integer.parseInt(edtSob.getText()+"");
        tvKetQua.setText((a+b)+"");
    }
}
