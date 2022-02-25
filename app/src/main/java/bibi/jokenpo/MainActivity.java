package bibi.jokenpo;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
    // variaveis
    private ImageView player1;
    private ImageView player2;
    private int joga1 = 0;
    private TextView btJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //elementos na tela
        player1 = findViewById(R.id.p1);
        player2 = findViewById(R.id.p2);
        btJogar = findViewById(R.id.txtplay);

        // Evento ao clicar para alterar a mão 1
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(joga1 == 0){
                    player1.setImageResource(R.drawable.papel);
                    joga1++;
                }else if(joga1 == 1){
                    player1.setImageResource(R.drawable.tesoura);
                    joga1++;
                }else if(joga1 == 2){
                    player1.setImageResource(R.drawable.pedra);
                    joga1 = 0;
                }
            }
        });

        //Evento ao clicar em jogar
        btJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geraPlayer2();
            }
        });
    }

    // Evento de alterar de forma aleatória a mão 2.
    private void geraPlayer2(){
        int joga2 = (int)(Math.random()*150);
        if(joga2 >= 0 && joga2 < 50){
            player2.setImageResource(R.drawable.papel);
        }else if(joga2 >= 50 && joga2 < 100){
            player2.setImageResource(R.drawable.tesoura);
        }else if(joga2 >= 100){
            player2.setImageResource(R.drawable.pedra);
        }
        joga2 = 0;
    }
}