package ma.projet.android.efmjavaxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText weightEditText;
    EditText heightEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText =(EditText) findViewById(R.id.weight_edit_text);
         heightEditText =(EditText) findViewById(R.id.height_edit_text);


        String weightStr = weightEditText.Text.toString();
        String heightStr = heightEditText.Text.toString();


        double poids = Double.parseDouble(weightStr);
        double taille = Double.parseDouble(heightStr);


        double imc = poids / (taille * taille) ;

        String status;
        if (imc< 18.5) {
            status = "Maigreur";
        } else if (imc < 25) {
            status = "Normale";
        } else if (imc < 30) {
            status = "Surpoids";
        } else {
            status = "Obésité";
        }
        Toast.makeText(getApplicationContext(), "IMC: " + imc + "\nStatus: " + status, Toast.LENGTH_SHORT).show();

    }
}