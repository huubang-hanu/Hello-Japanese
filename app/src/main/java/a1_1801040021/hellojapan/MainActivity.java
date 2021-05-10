package a1_1801040021.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ScrollView hira_table, kata_table;
    private TextView table_name_kata, table_name_hira;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References of Hiragana table components
        table_name_hira = findViewById(R.id.table_name_hira);
        hira_table = findViewById(R.id.hira_table);

        //References of Katakana table components
        table_name_kata = findViewById(R.id.table_name_kata);
        kata_table = findViewById(R.id.kata_table);

        //Set dummy data for media player
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
    }

    /**
     * Add event listener to switch table button
     *
     * @effects
     *  <pre>
     *      if click on hira button
     *          hide kata table and display hira table with animation
     *
     *      if click on kata button
     *          hide hira tablbe and display kata table with animation
     *  </pre>
     * @param v
     */
    public void onRadioBtnClick(View v) {
        switch (v.getId()) {
            case R.id.radio_btn_hira:
                //Reset MediaPlayer when user switch between two table
                if(mediaPlayer != null){
                    mediaPlayer.reset();
                }
                hira_table.scrollTo(0,0);
                //Hide Katakana table
                kata_table.animate().alpha(0).setDuration(500).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        kata_table.setVisibility(View.GONE);
                    }
                });
                table_name_kata.animate().alpha(0).setDuration(500).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        kata_table.setVisibility(View.GONE);
                    }
                });

                //Display Hiragana table
                hira_table.setVisibility(View.VISIBLE);
                table_name_hira.setVisibility(View.VISIBLE);
                hira_table.animate().alpha(1).setDuration(1000);
                table_name_hira.animate().alpha(1).setDuration(1000);
                break;

                
            case R.id.radio_btn_kata:
                //Reset MediaPlayer when user switch between two table
                if(mediaPlayer != null){
                    mediaPlayer.reset();
                }
                kata_table.scrollTo(0,0);
                //Hide Hiragana table
                hira_table.animate().alpha(0).setDuration(500).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        hira_table.setVisibility(View.GONE);
                    }
                });
                table_name_hira.animate().alpha(0).setDuration(500).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        table_name_hira.setVisibility(View.GONE);
                    }
                });

                //Display Katakana table
                kata_table.setVisibility(View.VISIBLE);
                table_name_kata.setVisibility(View.VISIBLE);
                kata_table.animate().alpha(1).setDuration(1000);
                table_name_kata.animate().alpha(1).setDuration(1000);
                break;
        }

    }

    /**
     * Add event listener for character buttons
     * @effects <pre>
     *     user click a character button
     *          play sound of that character
     *     if user click a new one
     *          stop playing sound of the previous selected butoon
     *          play sound of the new one character
     * </pre>
     *
     * @param v
     */
    public void onClickButton(View v){
        switch (v.getTag().toString()){
            case "a":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing but click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
                mediaPlayer.start();
                break;

            case "i":
                if((mediaPlayer.isPlaying())){
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.i);
                mediaPlayer.start();
                break;

            case "u":
                if((mediaPlayer.isPlaying())){   //Reset MediaPlayer if it is playing but click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
                mediaPlayer.start();
                break;

            case "e":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing but click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
                mediaPlayer.start();
                break;

            case "o":
                if((mediaPlayer.isPlaying())){   //Reset MediaPlayer if it is playing but click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
                mediaPlayer.start();
                break;

            case "ka":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mediaPlayer.start();
                break;

            case "ki":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mediaPlayer.start();
                break;

            case "ku":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mediaPlayer.start();
                break;

            case "ke":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mediaPlayer.start();
                break;

            case "ko":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mediaPlayer.start();
                break;

            case "sa":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mediaPlayer.start();
                break;

            case "shi":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mediaPlayer.start();
                break;

            case "su":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
                mediaPlayer.start();
                break;

            case "se":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
                mediaPlayer.start();
                break;

            case "so":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
                mediaPlayer.start();
                break;

            case "ta":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mediaPlayer.start();
                break;

            case "chi":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mediaPlayer.start();
                break;

            case "tsu":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mediaPlayer.start();
                break;

            case "te":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
                mediaPlayer.start();
                break;

            case "to":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
                mediaPlayer.start();
                break;


            case "na":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
                mediaPlayer.start();
                break;

            case "ni":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mediaPlayer.start();
                break;

            case "nu":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mediaPlayer.start();
                break;

            case "ne":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mediaPlayer.start();
                break;

            case "no":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
                mediaPlayer.start();
                break;


            case "ha":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mediaPlayer.start();
                break;

            case "hi":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mediaPlayer.start();
                break;

            case "fu":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mediaPlayer.start();
                break;

            case "he":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
                mediaPlayer.start();
                break;

            case "ho":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mediaPlayer.start();
                break;

            case "ma":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mediaPlayer.start();
                break;

            case "mi":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mediaPlayer.start();
                break;

            case "mu":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mediaPlayer.start();
                break;

            case "me":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
                mediaPlayer.start();
                break;

            case "mo":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mediaPlayer.start();
                break;

            case "ya":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mediaPlayer.start();
                break;



            case "yu":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mediaPlayer.start();
                break;



            case "yo":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mediaPlayer.start();
                break;

            case "ra":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mediaPlayer.start();
                break;

            case "ri":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mediaPlayer.start();
                break;

            case "ru":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mediaPlayer.start();
                break;

            case "re":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
                mediaPlayer.start();
                break;

            case "ro":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mediaPlayer.start();
                break;

            case "wa":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mediaPlayer.start();
                break;

            case "wo":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing but click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mediaPlayer.start();
                break;

            case "n":
                if((mediaPlayer.isPlaying())){  //Reset MediaPlayer if it is playing when click button
                    mediaPlayer.reset();
                }
                mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
                mediaPlayer.start();
                break;

            default:
                break;
        }
    }
}