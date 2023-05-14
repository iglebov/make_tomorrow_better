package space.iglebov.maketomorrowbetter;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.ImageSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class SecondStageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startofthegame);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Save

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 1);
        editor.commit();

        // Save(end)

        final ImageView TextWelcome = findViewById(R.id.WelcomeText);
        final ImageView Tree_Growing_Up_Second_Stage = findViewById(R.id.Tree_Growing_Up_Second_Stage);
        final ImageView WaterImage = findViewById(R.id.Task_Water);
        final ImageView ActivitySport = findViewById(R.id.SportActivity);
        final ImageView FlowerMusic = findViewById(R.id.MusicFlower);
        final ImageView BookReading = findViewById(R.id.BookReading);
        final ImageView Walk = findViewById(R.id.Walk);
        final ImageView FilmWatching = findViewById(R.id.FilmWatching);
        final ImageView Food = findViewById(R.id.Food);
        final ImageView JobGood = findViewById(R.id.GoodJob);
        final ImageView DerjatTak = findViewById(R.id.TakDerjat);
        final ImageView Tree_Growing_Up_First_Stage = findViewById(R.id.Tree_Growing_Up_First_Stage);
        final ImageView EkonomitVodu = findViewById(R.id.EkomonitVodu);
        final ImageView Otdix = findViewById(R.id.Otdix);
        final ImageView Dance = findViewById(R.id.Dance);
        final ImageView Yoga = findViewById(R.id.Yoga);
        final ImageView Garbage = findViewById(R.id.Garbage);
        final ImageView MorningTraining = findViewById(R.id.MorningTraining);
        final ImageView Singing = findViewById(R.id.Sing);
        final ImageView Goal = findViewById(R.id.Goal);
        final ImageView BiggestFlower = findViewById(R.id.BiggestFlower);
        final ImageView Fact_Dreaming = findViewById(R.id.Fact_Dreaming);
        final ImageView Communication = findViewById(R.id.Communication);
        final ImageView Meditation = findViewById(R.id.Meditation);
        final ImageView UborkaVKomnate = findViewById(R.id.UborkaVKomnate);
        final ImageView Tea = findViewById(R.id.Tea);
        final CheckedTextView checkedTextView = findViewById(R.id.checked_textview);

        // Objects

        final ImageView Tree1 = findViewById(R.id.Tree1);
        final ImageView Tree2 = findViewById(R.id.Tree2);
        final ImageView Tree3 = findViewById(R.id.Tree3);
        final ImageView Tree4 = findViewById(R.id.Tree4);
        final ImageView Tree5 = findViewById(R.id.Tree5);
        final ImageView Tree6 = findViewById(R.id.Tree6);
        final ImageView Tree7 = findViewById(R.id.Tree7);
        final ImageView Tree8 = findViewById(R.id.Tree8);
        final ImageView Flower = findViewById(R.id.Flower);

        // Objects(end)

        final ImageView Xorosho = findViewById(R.id.Xorosho);
        final ImageView SuperKartinka = findViewById(R.id.SuperKartinka);
        final ImageView HalfWay = findViewById(R.id.HalfWay);
        final ImageView Otlichno = findViewById(R.id.Otlichno);
        final ImageView SuperPuperKartinka = findViewById(R.id.SuperPuperKartinka);
        final ImageView ThreeTasks = findViewById(R.id.ThreeTasks);
        final ImageView Thank_you_1 = findViewById(R.id.Thank_you_1);
        final ImageView Thank_you_2 = findViewById(R.id.Thank_you_2);
        final ImageView Thank_you_3 = findViewById(R.id.Thank_you_3);
        final ImageView Thank_you_4 = findViewById(R.id.Thank_you_4);
        final ImageView Thank_you_5 = findViewById(R.id.Thank_you_5);
        final ImageView DontGiveUp = findViewById(R.id.DontGiveUp);
        final ImageView DerevoViroslo = findViewById(R.id.DerevoViroslo);
        final ImageView TolkoVpered = findViewById(R.id.VperedTolko);
        DerevoViroslo.setVisibility(View.INVISIBLE);
        Tree_Growing_Up_First_Stage.setVisibility(View.INVISIBLE);
        TolkoVpered.setVisibility(View.INVISIBLE);
        DontGiveUp.setVisibility(View.INVISIBLE);

        // Credits

        Thank_you_1.setVisibility(View.INVISIBLE);
        Thank_you_2.setVisibility(View.INVISIBLE);
        Thank_you_3.setVisibility(View.INVISIBLE);
        Thank_you_4.setVisibility(View.INVISIBLE);
        Thank_you_5.setVisibility(View.INVISIBLE);

        // Credits(end)

        ThreeTasks.setVisibility(View.GONE);
        Button button_end = (Button)findViewById(R.id.button_end);
        button_end.setVisibility(View.INVISIBLE);
        Xorosho.setVisibility(View.INVISIBLE);
        SuperKartinka.setVisibility(View.INVISIBLE);
        HalfWay.setVisibility(View.INVISIBLE);
        Otlichno.setVisibility(View.INVISIBLE);
        SuperPuperKartinka.setVisibility(View.INVISIBLE);

        // Objects

        Tree1.setVisibility(View.INVISIBLE);
        Tree2.setVisibility(View.VISIBLE);
        Tree3.setVisibility(View.INVISIBLE);
        Tree4.setVisibility(View.INVISIBLE);
        Tree5.setVisibility(View.INVISIBLE);
        Tree6.setVisibility(View.INVISIBLE);
        Tree7.setVisibility(View.INVISIBLE);
        Tree8.setVisibility(View.INVISIBLE);
        Flower.setVisibility(View.INVISIBLE);

        // Objects(end)

        Meditation.setVisibility(View.INVISIBLE);
        UborkaVKomnate.setVisibility(View.INVISIBLE);
        Garbage.setVisibility(View.INVISIBLE);
        MorningTraining.setVisibility(View.INVISIBLE);
        Singing.setVisibility(View.INVISIBLE);
        Yoga.setVisibility(View.INVISIBLE);
        BiggestFlower.setVisibility(View.INVISIBLE);
        Tea.setVisibility(View.INVISIBLE);
        Fact_Dreaming.setVisibility(View.INVISIBLE);
        Communication.setVisibility(View.INVISIBLE);
        EkonomitVodu.setVisibility(View.INVISIBLE);
        Goal.setVisibility(View.INVISIBLE);
        Otdix.setVisibility(View.INVISIBLE);
        Dance.setVisibility(View.INVISIBLE);
        Walk.setVisibility(View.INVISIBLE);
        FilmWatching.setVisibility(View.INVISIBLE);
        Food.setVisibility(View.INVISIBLE);
        BookReading.setVisibility(View.INVISIBLE);
        Tree_Growing_Up_First_Stage.setVisibility(View.GONE);
        JobGood.setVisibility(View.INVISIBLE);
        DerjatTak.setVisibility(View.INVISIBLE);
        FlowerMusic.setVisibility(View.INVISIBLE);
        WaterImage.setVisibility(View.INVISIBLE);
        ActivitySport.setVisibility(View.INVISIBLE);
        TextWelcome.setVisibility(View.INVISIBLE);
        Tree_Growing_Up_Second_Stage.setVisibility(View.INVISIBLE);
        checkedTextView.setVisibility(View.VISIBLE);
        checkedTextView.setText("Почитать книгу");
        checkedTextView.setOnClickListener(new View.OnClickListener(){
            private int a = 0;
            private int n = 0;
            private String[] seasons = {"Прогуляться на природе", "Посмотреть фильм", "Покушать"};
            @Override
            public void onClick(View v) {
                checkedTextView.toggle();
                if(checkedTextView.isChecked()) {
                    checkedTextView.setChecked(false);
                    checkedTextView.setVisibility(View.INVISIBLE);
                    checkedTextView.setText(seasons[n]);
                    n++;
                    a++;
                    if (a == 1){
                        Xorosho.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Xorosho.setVisibility(View.INVISIBLE);
                            }
                        },2 * 1000);
                        BookReading.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                BookReading.setVisibility(View.INVISIBLE);
                                checkedTextView.setVisibility(View.VISIBLE);
                            }
                        },8 * 1000);
                    }
                    if (a == 2){
                        Walk.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Walk.setVisibility(View.INVISIBLE);
                                checkedTextView.setVisibility(View.VISIBLE);
                            }
                        },7 * 1000);
                    }
                    if (a == 3){
                        Otlichno.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Otlichno.setVisibility(View.INVISIBLE);
                                FilmWatching.setVisibility(View.VISIBLE);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        FilmWatching.setVisibility(View.INVISIBLE);
                                        checkedTextView.setVisibility(View.VISIBLE);
                                        try{
                                            Intent intent = new Intent(SecondStageActivity.this, ThirdStageActivity.class);
                                            startActivity(intent);finish();
                                            overridePendingTransition(0,0);
                                        }catch (Exception e){

                                        }
                                    }
                                },6 * 1000);
                            }
                        },2 * 1000);
                        Tree2.setVisibility(View.INVISIBLE);
                        Tree3.setVisibility(View.VISIBLE);
                    }
                }
            }

        });
        Button button_back = (Button)findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    Intent intent = new Intent(SecondStageActivity.this, MainActivity.class);
                    startActivity(intent);finish();
                    overridePendingTransition(0,0);
                }catch (Exception e){

                }
            }
        });

    }
    //Системная кнопка - начало
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent(SecondStageActivity.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e){

        }
        //Системная кнопка - конец
    }
}