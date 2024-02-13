package com.example.instagram2;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kalkulator extends AppCompatActivity {

    // Variable komponen
    EditText angka1;
    EditText angka2;
    Button btn1;
    Spinner spinnerOperator;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        // Inisialisasi komponen
        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        btn1 = findViewById(R.id.btn1);
        spinnerOperator = findViewById(R.id.spinner);
        txtHasil = findViewById(R.id.txthasil);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(angka1.getText().toString().isEmpty() || angka2.getText().toString().isEmpty()){
                    Toast.makeText(kalkulator.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }else{
                    double number1 = Double.parseDouble(angka1.getText().toString());
                    double number2 = Double.parseDouble(angka2.getText().toString());
                    double result = 0;

                    String text = spinnerOperator.getSelectedItem().toString();
                    switch (text) {
                        case "Tambah":
                            result = number1 + number2;
                            int resultint = (int)result;
                            txtHasil.setText(resultint+"");
                            break;
                        case "Kurang":
                            result = number1 - number2;
                            txtHasil.setText(Double.toString(result));
                            resultint = (int)result;
                            txtHasil.setText(resultint+"");
                            break;

                        case "Kali":
                            result = number1 * number2;
                            resultint = (int)result;
                            txtHasil.setText(resultint+"");
                            break;

                        case "Bagi":
                            if (number2 == 0) {
                                Toast.makeText(kalkulator.this, "Pembagi tidak boleh 0", Toast.LENGTH_SHORT).show();
                            } else {
                                result = number1 / number2;
                                txtHasil.setText(Double.toString(result));
                            }
                            break;
                        default:
                            Toast.makeText(kalkulator.this, "Data tidak boleh kosong", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });
    }
}