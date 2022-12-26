package com.example.myapplication44;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class QR extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    int a = 880111601;

    private IntentIntegrator qrScan;

    private TextView barcodenum;

    ImageView iv_item;
    ImageView tv_item;
    ArrayAdapter<String> adapter = null;
    Spinner spinner = null;

    String[] items = {"캔", "캔햄, 통조림"};
    int[] itemImgs1 = {R.drawable.rebox20, R.drawable.rebox21};
    int[] itemImgs2 = {R.drawable.rebox201, R.drawable.rebox211};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr);


        iv_item = findViewById(R.id.iv_item);
        tv_item = findViewById(R.id.tv_item);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner=findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

        barcodenum = (TextView) findViewById(R.id.barcodenum);

        qrScan = new IntentIntegrator(this);
        qrScan.setOrientationLocked(false);
        qrScan.setPrompt("바코드를 사각형안에 위치해주세요.");
        qrScan.setBeepEnabled(true);
        qrScan.initiateScan();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
                Toast.makeText(this, "바코드나 QR 형식을 확인해주세요.", Toast.LENGTH_LONG).show();
                //finish();
                // todo
            } else {
                //정수를 > 문자열로 변환
                barcodenum.setText(result.getContents());
                String barcode_num = barcodenum.getText().toString();
                if(barcode_num.equals("8801382148500")) {
                    Toast.makeText(this, "플라스틱입니다", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getApplicationContext(), box5.class);
                    startActivity(intent);
                }
                    // todo
                 else if(barcode_num.equals("8801116019397")) {
                    Toast.makeText(this, "캔입니다", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getApplicationContext(), box2.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(this, "인식할 수 없는 바코드 입니다.", Toast.LENGTH_LONG).show();
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }

    }


    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        iv_item.setImageResource(itemImgs1[i]);
        tv_item.setImageResource(itemImgs2[i]);
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        iv_item.setImageResource(itemImgs1[0]);
        tv_item.setImageResource(itemImgs2[0]);
    }

}


