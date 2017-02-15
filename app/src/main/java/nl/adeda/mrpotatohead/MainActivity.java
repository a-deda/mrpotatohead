package nl.adeda.mrpotatohead;

import android.app.Activity;
import android.media.Image;
import android.net.Uri;
import android.opengl.Visibility;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    static final String ARMS_SAVE = "armsSave";
    static final String EARS_SAVE = "earsSave";
    static final String EYEBROWS_SAVE = "eyebrowsSave";
    static final String EYES_SAVE = "eyesSave";
    static final String GLASSES_SAVE = "glassesSave";
    static final String HAT_SAVE = "hatSave";
    static final String MOUTH_SAVE = "mouthSave";
    static final String MUSTACHE_SAVE = "mustacheSave";
    static final String NOSE_SAVE = "noseSave";
    static final String SHOES_SAVE = "shoesSave";

    // Checkbox variable prototypes
    private CheckBox checkArms;
    private CheckBox checkEars;
    private CheckBox checkEyebrows;
    private CheckBox checkEyes;
    private CheckBox checkGlasses;
    private CheckBox checkHat;
    private CheckBox checkMouth;
    private CheckBox checkMustache;
    private CheckBox checkNose;
    private CheckBox checkShoes;

    // Image variable prototypes
    private ImageView arms;
    private ImageView ears;
    private ImageView eyebrows;
    private ImageView eyes;
    private ImageView glasses;
    private ImageView hat;
    private ImageView mouth;
    private ImageView mustache;
    private ImageView nose;
    private ImageView shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Image variables
        arms = (ImageView) findViewById(R.id.arms);
        ears = (ImageView) findViewById(R.id.ears);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        glasses = (ImageView) findViewById(R.id.glasses);
        hat = (ImageView) findViewById(R.id.hat);
        mouth = (ImageView) findViewById(R.id.mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        nose = (ImageView) findViewById(R.id.nose);
        shoes = (ImageView) findViewById(R.id.shoes);


        if (savedInstanceState != null) {
            int vsblArms = savedInstanceState.getInt(ARMS_SAVE);
            int vsblEars = savedInstanceState.getInt(EARS_SAVE);
            int vsblEyebrows = savedInstanceState.getInt(EYEBROWS_SAVE);
            int vsblEyes = savedInstanceState.getInt(EYES_SAVE);
            int vsblGlasses = savedInstanceState.getInt(GLASSES_SAVE);
            int vsblHat = savedInstanceState.getInt(HAT_SAVE);
            int vsblMouth = savedInstanceState.getInt(MOUTH_SAVE);
            int vsblMustache = savedInstanceState.getInt(MUSTACHE_SAVE);
            int vsblNose = savedInstanceState.getInt(NOSE_SAVE);
            int vsblShoes = savedInstanceState.getInt(SHOES_SAVE);

            // Import saved instance
            arms.setVisibility(vsblArms);
            ears.setVisibility(vsblEars);
            eyebrows.setVisibility(vsblEyebrows);
            eyes.setVisibility(vsblEyes);
            glasses.setVisibility(vsblGlasses);
            hat.setVisibility(vsblHat);
            mouth.setVisibility(vsblMouth);
            mustache.setVisibility(vsblMustache);
            nose.setVisibility(vsblNose);
            shoes.setVisibility(vsblShoes);
        }

        // Put views into variables
        checkArms = (CheckBox) findViewById(R.id.checkBox1);
        checkEars = (CheckBox) findViewById(R.id.checkBox2);
        checkEyebrows = (CheckBox) findViewById(R.id.checkBox3);
        checkEyes = (CheckBox) findViewById(R.id.checkBox4);
        checkGlasses = (CheckBox) findViewById(R.id.checkBox5);
        checkHat = (CheckBox) findViewById(R.id.checkBox6);
        checkMouth = (CheckBox) findViewById(R.id.checkBox7);
        checkMustache = (CheckBox) findViewById(R.id.checkBox8);
        checkNose = (CheckBox) findViewById(R.id.checkBox9);
        checkShoes = (CheckBox) findViewById(R.id.checkBox10);

        // Set listeners
        checkArms.setOnClickListener(this);
        checkEars.setOnClickListener(this);
        checkEyebrows.setOnClickListener(this);
        checkEyes.setOnClickListener(this);
        checkGlasses.setOnClickListener(this);
        checkHat.setOnClickListener(this);
        checkMouth.setOnClickListener(this);
        checkMustache.setOnClickListener(this);
        checkNose.setOnClickListener(this);
        checkShoes.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {
        // Show part that has been checked
        switch (view.getId()) {
            case R.id.checkBox1:
                if (checkArms.isChecked()) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox2:
                if (checkEars.isChecked()) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox3:
                if (checkEyebrows.isChecked()) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox4:
                if (checkEyes.isChecked()) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox5:
                if (checkGlasses.isChecked()) {
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox6:
                if (checkHat.isChecked()) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox7:
                if (checkMouth.isChecked()) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox8:
                if (checkMustache.isChecked()) {
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkBox9:
                if (checkNose.isChecked()) {
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox10:
                if (checkShoes.isChecked()) {
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle save) {
        super.onSaveInstanceState(save);

        // Save visibility of parts
        save.putInt(ARMS_SAVE, arms.getVisibility());
        save.putInt(EARS_SAVE, ears.getVisibility());
        save.putInt(EYEBROWS_SAVE, eyebrows.getVisibility());
        save.putInt(EYES_SAVE, eyes.getVisibility());
        save.putInt(GLASSES_SAVE, glasses.getVisibility());
        save.putInt(HAT_SAVE, hat.getVisibility());
        save.putInt(MOUTH_SAVE, mouth.getVisibility());
        save.putInt(MUSTACHE_SAVE, mustache.getVisibility());
        save.putInt(NOSE_SAVE, nose.getVisibility());
        save.putInt(SHOES_SAVE, shoes.getVisibility());
    }
}
