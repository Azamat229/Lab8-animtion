

package render.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import render.animations.Attention;
import render.animations.Bounce;
import render.animations.Fade;
import render.animations.Flip;
import render.animations.Render;
import render.animations.Rotate;
import render.animations.Slide;
import render.animations.Zoom;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Render render;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonBounceInLeft = findViewById(R.id.btn_bounce_inleft); // bounce in left
        Button buttonBounceInRight = findViewById(R.id.btn_bounce_inright); // bounce in right
        Button buttonBounceInUp = findViewById(R.id.button_bounce_inup); // bounce in up
        Button buttonBounceInDown = findViewById(R.id.btn_bounce_indown); // bounce in down
        Button buttonBounceIn = findViewById(R.id.btn_bounce_in); // bounce in

        Button buttonFadeInUp = findViewById(R.id.btn_fade_inup); // fade in up
        Button buttonFadeInDown = findViewById(R.id.btn_fade_indown); // fade in down
        Button buttonFadeInRight = findViewById(R.id.btn_fade_inright); // fade in right
        Button buttonFadeInLeft = findViewById(R.id.btn_fade_inleft); // fade left

        Button buttonFadeOutUp = findViewById(R.id.btn_fade_outup); // fade out up
        Button buttonFadeOutDown = findViewById(R.id.btn_fade_outdown); // fade out down
        Button buttonFadeOutRight = findViewById(R.id.btn_fade_outright); // fade out right
        Button buttonFadeOutLeft = findViewById(R.id.btn_fade_outleft); // fade out left

        Button buttonFadeIn = findViewById(R.id.btn_fade_in); // fade in
        Button buttonFadeOut = findViewById(R.id.btn_fade_out); // fade out

        Button buttonFlipInX = findViewById(R.id.btn_flip_inx); // flip in x
        Button buttonFlipInY = findViewById(R.id.btn_flip_iny); // flip in y
        Button buttonFlipOutX = findViewById(R.id.btn_flip_outx); // flip out x
        Button buttonFlipOutY = findViewById(R.id.btn_flip_outy); // flip out y

        Button button2 = (Button) findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });





        imageView = findViewById(R.id.iv_image);

        render = new Render(this);
        render.setDuration(1000);




        buttonBounceInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InLeft(imageView));
                render.start();
            }
        });

        buttonBounceInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InRight(imageView));
                render.start();
            }
        });

        buttonBounceInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InUp(imageView));
                render.start();
            }
        });

        buttonBounceInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.InDown(imageView));
                render.start();
            }
        });

        buttonBounceIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Bounce.In(imageView));
                render.start();
            }
        });

        buttonFadeInUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InUp(imageView));
                render.start();
            }
        });

        buttonFadeInDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InDown(imageView));
                render.start();
            }
        });

        buttonFadeInRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InRight(imageView));
                render.start();
            }
        });

        buttonFadeInLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.InLeft(imageView));
                render.start();
            }
        });

        buttonFadeOutUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutUp(imageView));
                render.start();
            }
        });


        buttonFadeOutDown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutDown(imageView));
                render.start();
            }
        });

        buttonFadeOutRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutRight(imageView));
                render.start();
            }
        });

        buttonFadeOutLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.OutLeft(imageView));
                render.start();
            }
        });

        buttonFadeIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.In(imageView));
                render.start();
            }
        });

        buttonFadeOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Fade.Out(imageView));
                render.start();
            }
        });

        buttonFlipInX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.InX(imageView));
                render.start();
            }
        });

        buttonFlipInY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.InY(imageView));
                render.start();
            }
        });

        buttonFlipOutX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.OutX(imageView));
                render.start();
            }
        });

        buttonFlipOutY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                render.setAnimation(Flip.OutY(imageView));
                render.start();
            }
        });

    }

    public void openNewActivity1(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
