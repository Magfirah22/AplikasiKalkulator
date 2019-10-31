package id.ac.poliban.mi.firah.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etAngkake1 = findViewById(R.id.etAngkake1);
        EditText etAngkake2 = findViewById(R.id.etAngkake2);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersih = findViewById(R.id.btBersih);
        TextView tvJumlah = findViewById(R.id.tvjumlah);

        btTambah.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama + aKedua;
            tvJumlah.setText(Integer.toString(hasilnya));
        });

        btKurang.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama - aKedua;
            tvJumlah.setText(Integer.toString(hasilnya));
        });

        btKali.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkake1.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkake2.getText().toString());
            int hasilnya = aPertama * aKedua;
            tvJumlah.setText(Integer.toString(hasilnya));
        });

        btBagi.setOnClickListener(v -> {
            Double aPertama = Double.parseDouble(etAngkake1.getText().toString());
            Double aKedua = Double.parseDouble(etAngkake2.getText().toString());
            double hasilnya = aPertama / aKedua;
            tvJumlah.setText(Double.toString(hasilnya));
        });

        btBersih.setOnClickListener(v -> {
            etAngkake2.setText("");
            etAngkake1.setText("");
            etAngkake1.requestFocus();
            tvJumlah.setText("0");
        });
    }
}
