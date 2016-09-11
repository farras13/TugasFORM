package id.sch.smktelkom_mlg.tugas01.xirpl6027.tugasform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Spinner spKelas;
    TextView tvHasil, tvHasil2, tvHasil3, tvHasil4;
    CheckBox cbolh, cbsn, cbpg;
    RadioGroup rgstatus;
    Button bKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextnama);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        tvHasil = (TextView) findViewById(R.id.textViewhasil);
        tvHasil2 = (TextView) findViewById(R.id.Hasil2);
        tvHasil3 = (TextView) findViewById(R.id.Hasil3);
        tvHasil4 = (TextView) findViewById(R.id.Hasil4);
        rgstatus = (RadioGroup) findViewById(R.id.radiogroupstatus);
        cbolh = (CheckBox) findViewById(R.id.checkBoxOlh);
        cbpg = (CheckBox) findViewById(R.id.checkBoxpg);
        cbsn = (CheckBox) findViewById(R.id.checkBoxsn);
        bKirim = (Button) findViewById(R.id.buttonKirim);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
                doClik();
            }
        });


    }

    private void doClik() {

        String hasil = null;
        if (rgstatus.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(rgstatus.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }
        if (hasil == null) {
            tvHasil3.setText("Belum memilih Status");
        } else {
            tvHasil3.setText("Gender Anda : " + hasil);
        }
        tvHasil2.setText("Kelas : " + spKelas.getSelectedItem().toString());

        String hasil4 = "Bidang:\n";
        int startlen = hasil4.length();
        if (cbolh.isChecked()) hasil4 += cbolh.getText() + "\n";
        if (cbsn.isChecked()) hasil4 += cbsn.getText() + "\n";
        if (cbpg.isChecked()) hasil4 += cbpg.getText() + "\n";

        if (hasil.length() == startlen) hasil4 += "Tidak ada Pilihan";
        tvHasil4.setText(hasil4);
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
            etNama.setError(null);
        }
        return valid;
    }



}
