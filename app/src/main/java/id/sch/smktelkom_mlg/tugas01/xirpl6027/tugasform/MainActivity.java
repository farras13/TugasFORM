package id.sch.smktelkom_mlg.tugas01.xirpl6027.tugasform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Spinner spKelas;
    TextView tvHasil;
    CheckBox cbolh, cbsn, cbpg;
    RadioGroup rgstatus;
    Button bKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextnama);
        spKelas = (Spinner) findViewById(R.id.spinnerkelas);
        tvHasil = (TextView) findViewById(R.id.textViewhasil);
        rgstatus = (RadioGroup) findViewById(R.id.radiogroupstatus);
        cbolh = (CheckBox) findViewById(R.id.checkBoxOlh);
        cbpg = (CheckBox) findViewById(R.id.checkBoxpg);
        cbsn = (CheckBox) findViewById(R.id.checkBoxsn);
        bKirim = (Button) findViewById(R.id.buttonKirim);

        rgstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
                doClik();
            }


        });

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClik();
            }
        });


    }

    private void doProcess() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            tvHasil.setText("Nama anda : " + nama);
        }
    }

    private boolean isValid() {
        boolean valid = true;
        String nama = etNama.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama anda belum diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
            valid = false;
        } else {

        }
    }


    private void doClik() {

    }
}
