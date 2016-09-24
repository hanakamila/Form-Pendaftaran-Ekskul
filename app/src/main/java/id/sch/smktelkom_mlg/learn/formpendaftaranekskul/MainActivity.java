package id.sch.smktelkom_mlg.learn.formpendaftaranekskul;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText etnm;
    RadioButton rbX, rbXI;
    Button ok;
    TextView tvHasil, tvJurus, tvEkskul;
    Spinner jurus;
    CheckBox cbPadus, cbFutsal, cbVoli, cbBasket;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnm = (EditText) findViewById(R.id.editTextNama);
        rbX = (RadioButton) findViewById(R.id.radioButtonX);
        rbXI = (RadioButton) findViewById(R.id.radioButtonXI);
        ok = (Button) findViewById(R.id.buttonOK);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        jurus = (Spinner) findViewById(R.id.spinnerjurusan);
        tvJurus = (TextView) findViewById(R.id.textViewJurusan);
        cbPadus = (CheckBox) findViewById(R.id.checkBoxPadus);
        cbBasket = (CheckBox) findViewById(R.id.checkBoxBasket);
        cbFutsal = (CheckBox) findViewById(R.id.checkBoxFutsal);
        cbVoli = (CheckBox) findViewById(R.id.checkBoxVoli);
        tvEkskul = (TextView) findViewById(R.id.textViewEkskul);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hasil = null;
                if (rbX.isChecked()) {
                    hasil = rbX.getText().toString();
                } else if (rbXI.isChecked()) {
                    hasil = rbXI.getText().toString();
                } else {
                    hasil = ("Pilih kelas");
                }

                String nama = etnm.getText().toString();
                tvHasil.setText("\nTerimakasih Telah Mendaftar\n" + "Nama : " + nama + "\nKelas : " + hasil);
                tvJurus.setText("Jurusan : " + jurus.getSelectedItem().toString());
                doClick();
            }


        });
    }

    private void doClick() {
        String ekskul = "Ekskul yang dipilih\n";
        int startlen = ekskul.length();
        if (cbPadus.isChecked()) ekskul += cbPadus.getText() + "\n";
        if (cbBasket.isChecked()) ekskul += cbBasket.getText() + "\n";
        if (cbFutsal.isChecked()) ekskul += cbFutsal.getText() + "\n";
        if (cbVoli.isChecked()) ekskul += cbVoli.getText() + "\n";
        if (ekskul.length() == startlen) ekskul += "Pilih ekskul";

        tvEkskul.setText(ekskul);

    }
}
