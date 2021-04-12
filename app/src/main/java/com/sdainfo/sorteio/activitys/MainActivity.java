package com.sdainfo.sorteio.activitys;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sdainfo.sorteio.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView numero_sorteado;
    private ImageView bola_sorteada;
    private int numero;


    private MediaPlayer backgroundMediaPlayer, bolasMediaPlayer;
    private SeekBar seekBarVolune;

    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaComponentes();

        executarMusicaBackground();

        controlarVolune();

    }

    private void iniciaComponentes() {
        bola_sorteada = findViewById(R.id.ivImagem);
        seekBarVolune = findViewById(R.id.sbVolume);
    }

    private void controlarVolune() {
        //atribui o gerenciador
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        // buscar os valores do som
        int volumeMax = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        //atribuindo os valores buscados
        seekBarVolune.setMax(volumeMax);
        seekBarVolune.setProgress(volumeAtual);

        //controlando o volume
        seekBarVolune.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void sortear(View view) {

        numero_sorteado = findViewById(R.id.tvNumeroSorteado);
        numero = new Random().nextInt(91);
        numero_sorteado.setText(String.valueOf("Nº :  " + numero));
        numeroImagem(numero);

    }

    private void somMusicaBolas() {
        if (bolasMediaPlayer != null) {
            bolasMediaPlayer.start();
        }
    }

    private void numeroImagem(int numero) {
        pararMusicaBackground();
        switch (numero) {
            case 0:
                bola_sorteada.setImageResource(R.drawable.a00);
                break;
            case 1:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v01);
                bola_sorteada.setImageResource(R.drawable.a01);
                somMusicaBolas();
                break;
            case 2:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v02);
                bola_sorteada.setImageResource(R.drawable.a02);
                somMusicaBolas();
                break;
            case 3:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v03);
                bola_sorteada.setImageResource(R.drawable.a03);
                somMusicaBolas();
                break;
            case 4:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v04);
                bola_sorteada.setImageResource(R.drawable.a04);
                somMusicaBolas();
                break;
            case 5:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v05);
                bola_sorteada.setImageResource(R.drawable.a05);
                somMusicaBolas();
                break;
            case 6:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v06);
                bola_sorteada.setImageResource(R.drawable.a06);
                somMusicaBolas();
                break;
            case 7:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v07);
                bola_sorteada.setImageResource(R.drawable.a07);
                somMusicaBolas();
                break;
            case 8:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v08);
                bola_sorteada.setImageResource(R.drawable.a08);
                somMusicaBolas();
                break;
            case 9:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v09);
                bola_sorteada.setImageResource(R.drawable.a09);
                somMusicaBolas();
                break;
            case 10:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v10);
                bola_sorteada.setImageResource(R.drawable.a10);
                somMusicaBolas();
                break;
            case 11:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v11);
                bola_sorteada.setImageResource(R.drawable.a11);
                somMusicaBolas();
                break;
            case 12:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v12);
                bola_sorteada.setImageResource(R.drawable.a12);
                somMusicaBolas();
                break;
            case 13:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v13);
                bola_sorteada.setImageResource(R.drawable.a13);
                somMusicaBolas();
                break;
            case 14:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v14);
                bola_sorteada.setImageResource(R.drawable.a14);
                somMusicaBolas();
                break;
            case 15:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v15);
                bola_sorteada.setImageResource(R.drawable.a15);
                somMusicaBolas();
                break;
            case 16:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v16);
                bola_sorteada.setImageResource(R.drawable.a16);
                somMusicaBolas();
                break;
            case 17:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v17);
                bola_sorteada.setImageResource(R.drawable.a17);
                somMusicaBolas();
                break;
            case 18:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v18);
                bola_sorteada.setImageResource(R.drawable.a18);
                somMusicaBolas();
                break;
            case 19:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v19);
                bola_sorteada.setImageResource(R.drawable.a19);
                somMusicaBolas();
                break;
            case 20:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v20);
                bola_sorteada.setImageResource(R.drawable.a20);
                somMusicaBolas();
                break;
            case 21:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v21);
                bola_sorteada.setImageResource(R.drawable.a21);
                somMusicaBolas();
                break;
            case 22:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v22);
                bola_sorteada.setImageResource(R.drawable.a22);
                somMusicaBolas();
                break;
            case 23:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v23);
                bola_sorteada.setImageResource(R.drawable.a23);
                somMusicaBolas();
                break;
            case 24:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v24);
                bola_sorteada.setImageResource(R.drawable.a24);
                somMusicaBolas();
                break;
            case 25:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v25);
                bola_sorteada.setImageResource(R.drawable.a25);
                somMusicaBolas();
                break;
            case 26:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v26);
                bola_sorteada.setImageResource(R.drawable.a26);
                somMusicaBolas();
                break;
            case 27:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v27);
                bola_sorteada.setImageResource(R.drawable.a27);
                somMusicaBolas();
                break;
            case 28:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v28);
                bola_sorteada.setImageResource(R.drawable.a28);
                somMusicaBolas();
                break;
            case 29:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v29);
                bola_sorteada.setImageResource(R.drawable.a29);
                somMusicaBolas();
                break;
            case 30:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v30);
                bola_sorteada.setImageResource(R.drawable.a30);
                somMusicaBolas();
                break;
            case 31:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v31);
                bola_sorteada.setImageResource(R.drawable.a31);
                somMusicaBolas();
                break;
            case 32:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v32);
                bola_sorteada.setImageResource(R.drawable.a32);
                somMusicaBolas();
                break;
            case 33:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v33);
                bola_sorteada.setImageResource(R.drawable.a33);
                somMusicaBolas();
                break;
            case 34:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v34);
                bola_sorteada.setImageResource(R.drawable.a34);
                somMusicaBolas();
                break;
            case 35:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v35);
                bola_sorteada.setImageResource(R.drawable.a35);
                somMusicaBolas();
                break;
            case 36:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v36);
                bola_sorteada.setImageResource(R.drawable.a36);
                somMusicaBolas();
                break;
            case 37:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v37);
                bola_sorteada.setImageResource(R.drawable.a37);
                somMusicaBolas();
                break;
            case 38:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v38);
                bola_sorteada.setImageResource(R.drawable.a38);
                somMusicaBolas();
                break;
            case 39:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v39);
                bola_sorteada.setImageResource(R.drawable.a39);
                somMusicaBolas();
                break;
            case 40:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v40);
                bola_sorteada.setImageResource(R.drawable.a40);
                somMusicaBolas();
                break;
            case 41:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v41);
                bola_sorteada.setImageResource(R.drawable.a41);
                somMusicaBolas();
                break;
            case 42:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v42);
                bola_sorteada.setImageResource(R.drawable.a42);
                somMusicaBolas();
                break;
            case 43:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v43);
                bola_sorteada.setImageResource(R.drawable.a43);
                somMusicaBolas();
                break;
            case 44:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v44);
                bola_sorteada.setImageResource(R.drawable.a44);
                somMusicaBolas();
                break;
            case 45:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v45);
                bola_sorteada.setImageResource(R.drawable.a45);
                somMusicaBolas();
                break;
            case 46:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v46);
                bola_sorteada.setImageResource(R.drawable.a46);
                somMusicaBolas();
                break;
            case 47:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v47);
                bola_sorteada.setImageResource(R.drawable.a47);
                somMusicaBolas();
                break;
            case 48:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v48);
                bola_sorteada.setImageResource(R.drawable.a48);
                somMusicaBolas();
                break;
            case 49:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v49);
                bola_sorteada.setImageResource(R.drawable.a49);
                somMusicaBolas();
                break;
            case 50:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v50);
                bola_sorteada.setImageResource(R.drawable.a50);
                somMusicaBolas();
                break;
            case 51:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v51);
                bola_sorteada.setImageResource(R.drawable.a51);
                somMusicaBolas();
                break;
            case 52:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v52);
                bola_sorteada.setImageResource(R.drawable.a52);
                somMusicaBolas();
                break;
            case 53:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v53);
                bola_sorteada.setImageResource(R.drawable.a53);
                somMusicaBolas();
                break;
            case 54:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v54);
                bola_sorteada.setImageResource(R.drawable.a54);
                somMusicaBolas();
                break;
            case 55:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v55);
                bola_sorteada.setImageResource(R.drawable.a55);
                somMusicaBolas();
                break;
            case 56:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v56);
                bola_sorteada.setImageResource(R.drawable.a56);
                somMusicaBolas();
                break;
            case 57:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v57);
                bola_sorteada.setImageResource(R.drawable.a57);
                somMusicaBolas();
                break;
            case 58:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v58);
                bola_sorteada.setImageResource(R.drawable.a58);
                somMusicaBolas();
                break;
            case 59:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v59);
                bola_sorteada.setImageResource(R.drawable.a59);
                somMusicaBolas();
                break;
            case 60:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v60);
                bola_sorteada.setImageResource(R.drawable.a60);
                somMusicaBolas();
                break;
            case 61:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v61);
                bola_sorteada.setImageResource(R.drawable.a61);
                somMusicaBolas();
                break;
            case 62:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v62);
                bola_sorteada.setImageResource(R.drawable.a62);
                somMusicaBolas();
                break;
            case 63:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v63);
                bola_sorteada.setImageResource(R.drawable.a63);
                somMusicaBolas();
                break;
            case 64:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v64);
                bola_sorteada.setImageResource(R.drawable.a64);
                somMusicaBolas();
                break;
            case 65:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v65);
                bola_sorteada.setImageResource(R.drawable.a65);
                somMusicaBolas();
                break;
            case 66:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v66);
                bola_sorteada.setImageResource(R.drawable.a66);
                somMusicaBolas();
                break;
            case 67:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v67);
                bola_sorteada.setImageResource(R.drawable.a67);
                somMusicaBolas();
                break;
            case 68:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v68);
                bola_sorteada.setImageResource(R.drawable.a68);
                somMusicaBolas();
                break;
            case 69:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v69);
                bola_sorteada.setImageResource(R.drawable.a69);
                somMusicaBolas();
                break;
            case 70:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v70);
                bola_sorteada.setImageResource(R.drawable.a70);
                somMusicaBolas();
                break;
            case 71:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v71);
                bola_sorteada.setImageResource(R.drawable.a71);
                somMusicaBolas();
                break;
            case 72:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v72);
                bola_sorteada.setImageResource(R.drawable.a72);
                somMusicaBolas();
                break;
            case 73:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v73);
                bola_sorteada.setImageResource(R.drawable.a73);
                somMusicaBolas();
                break;
            case 74:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v74);
                bola_sorteada.setImageResource(R.drawable.a74);
                somMusicaBolas();
                break;
            case 75:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v75);
                bola_sorteada.setImageResource(R.drawable.a75);
                somMusicaBolas();
                break;
            case 76:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v76);
                bola_sorteada.setImageResource(R.drawable.a76);
                somMusicaBolas();
                break;
            case 77:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v77);
                bola_sorteada.setImageResource(R.drawable.a77);
                somMusicaBolas();
                break;
            case 78:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v78);
                bola_sorteada.setImageResource(R.drawable.a78);
                somMusicaBolas();
                break;
            case 79:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v79);
                bola_sorteada.setImageResource(R.drawable.a79);
                somMusicaBolas();
                break;
            case 80:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v80);
                bola_sorteada.setImageResource(R.drawable.a80);
                somMusicaBolas();
                break;
            case 81:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v81);
                bola_sorteada.setImageResource(R.drawable.a81);
                somMusicaBolas();
                break;
            case 82:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v82);
                bola_sorteada.setImageResource(R.drawable.a82);
                somMusicaBolas();
                break;
            case 83:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v83);
                bola_sorteada.setImageResource(R.drawable.a83);
                somMusicaBolas();
                break;
            case 84:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v84);
                bola_sorteada.setImageResource(R.drawable.a84);
                somMusicaBolas();
                break;
            case 85:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v85);
                bola_sorteada.setImageResource(R.drawable.a85);
                somMusicaBolas();
                break;
            case 86:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v86);
                bola_sorteada.setImageResource(R.drawable.a86);
                somMusicaBolas();
                break;
            case 87:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v87);
                bola_sorteada.setImageResource(R.drawable.a87);
                somMusicaBolas();
                break;
            case 88:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v88);
                bola_sorteada.setImageResource(R.drawable.a88);
                somMusicaBolas();
                break;
            case 89:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v89);
                bola_sorteada.setImageResource(R.drawable.a89);
                somMusicaBolas();
                break;
            case 90:
                bolasMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.v90);
                bola_sorteada.setImageResource(R.drawable.a90);
                somMusicaBolas();
                break;
            default:
                bola_sorteada.setImageResource(R.drawable.a00);
                break;

        }

    }

    private void executarMusicaBackground() {
        backgroundMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.piao);
        if (backgroundMediaPlayer != null) {
            backgroundMediaPlayer.start();
            backgroundMediaPlayer.setLooping(true);
        }
    }

    private void pausarMusicaBackground() {
        if (backgroundMediaPlayer.isPlaying())
            backgroundMediaPlayer.pause();
    }

    private void pararMusicaBackground() {
        if (backgroundMediaPlayer.isPlaying())
            backgroundMediaPlayer.stop();
    }

    @Override
    protected void onStop() {
        super.onStop();
        pausarMusicaBackground();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (backgroundMediaPlayer != null && backgroundMediaPlayer.isPlaying()) {
            backgroundMediaPlayer.stop();
            backgroundMediaPlayer.release();
            backgroundMediaPlayer = null;
        }


    }
}












