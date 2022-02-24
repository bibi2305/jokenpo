package bibi.jokenpo;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
    // variaveis
    private ImageView player1;
    private ImageView player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1 = findViewById(R.id.p1);
        player2 = findViewById(R.id.p2);

        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast alerta = Toast.makeText(getApplicationContext(),"player 1 selecionado", Toast.LENGTH_LONG);
                alerta.show();
                Log.i("aviso","oi player 1");
            }
        });

        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast alerta2 = Toast.makeText(getApplicationContext(),"player 2 selecionado", Toast.LENGTH_LONG);
                alerta2.show();
                Log.i("aviso","oi player 2");
            }
        });
    }
}