package blankonpelem.kalkulatorgeometri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnhitung(View view) {
        Spinner bangun=(Spinner) findViewById(R.id.spiner);
        EditText in1 = (EditText) findViewById(R.id.input1);
        EditText in2 = (EditText) findViewById(R.id.input2);
        TextView luas = (TextView) findViewById(R.id.hasilL);
        TextView keliling = (TextView) findViewById(R.id.hasilK);


        String nilai1=in1.getText().toString();
        String nilai2=in2.getText().toString();
        int nl1=Integer.parseInt(nilai1);
        int nl2=Integer.parseInt(nilai2);

        if(bangun.getSelectedItem().toString().equals("Persegi")) {
            int hasilL=nl1*nl2;
            String hasilLuas=String.valueOf(hasilL);
            luas.setText(hasilLuas);

            int hasilK=(2*nl1)+(2*nl2);
            String hasilKeliling=String.valueOf(hasilK);
            keliling.setText(hasilKeliling);
        }

        else if (bangun.getSelectedItem().toString().equals("Lingkaran")){
            double pi = Math.PI;
            double hasilL= pi*(nl1*nl1);
            String hasilLuas=String.valueOf(hasilL);
            luas.setText(hasilLuas);

            double hasilK= pi*(2*nl1);
            String hasilKeliling=String.valueOf(hasilK);
            keliling.setText(hasilKeliling);
        }

        else if (bangun.getSelectedItem().toString().equals("Segitiga")){
            double hasilL= (nl1*nl2)/2;
            String hasilLuas=String.valueOf(hasilL);
            luas.setText(hasilLuas);

            double sqrt = (float) Math.sqrt((nl1*nl1)+(nl2*nl2));
            double hasilK= nl1+nl2+sqrt;
            String hasilKeliling=String.valueOf(hasilK);
            keliling.setText(hasilKeliling);



        }

    }

}
