package sv.edu.udb.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText votos;
    int c1=0;
    int c2=0;
    int c3=0;
    int c4=0;
    double pc1=0;
    double pc2=0;
    double pc3=0;
    double pc4=0;
    double pcnulos=0;
    int cnulos=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        votos=(EditText)findViewById(R.id.txtVotos);
    }
    public void calculo (View v){
        String voto=votos.getText().toString();
        String[] votosF = voto.split(",");
        int n=(voto.split(",").length);
        for(int i =0; i< n; i++ ){
           switch (Integer.valueOf(  votosF[i])){
               case 1:
                   c1++;
                   break;
               case 2:
                   c2++;
                   break;
               case 3:
                   c3++;
                   break;
               case 4:
                   c4++;
                   break;
               default:
                   cnulos++;
                   break;
           }
        }
        pc1=(c1*100)/n;
        pc2=(c2*100)/n;
        pc3=(c3*100)/n;
        pc4=(c4*100)/n;
        pcnulos=(cnulos*100)/n;
        Toast notificacion=Toast.makeText(this,"Candidato 1: "+pc1+"%, Canditado 2: "+pc2+"%, Canditado 3: "+pc3+"%, Canditado 4: "+pc4+"%, Votos Nulos: "+pcnulos+"%",Toast.LENGTH_LONG);
        notificacion.show();
        c1=0;
        c2=0;
        c3=0;
         c4=0;

         pc1=0;
        pc2=0;
         pc3=0;
         pc4=0;
         pcnulos=0;
         cnulos=0;
        votosF=null;


    }
}