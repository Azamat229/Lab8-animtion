

package render.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private Context mContext;
    private Resources mResources;
    private RelativeLayout mRelativeLayout;
    private TextView mTextView;
    private Button mButton;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button button_2_1 = (Button) findViewById(R.id.btn_2_1);
        button_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });


        // Get the application context
        mContext = getApplicationContext();

        // Get the Resources
        mResources = getResources();

        // Get the widgets reference from XML layout
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);
        mButton = (Button) findViewById(R.id.btn);
        mImageView = (ImageView) findViewById(R.id.iv);

        // Set a click listener for Button widget
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                // Initialize a new Bitmap object
                Bitmap bitmap = Bitmap.createBitmap(
                        500, // Width
                        300, // Height
                        Bitmap.Config.ARGB_8888 // Config


                );

                // Initialize a new Canvas instance
                Canvas canvas = new Canvas(bitmap);

                // Draw a solid color to the canvas background
                canvas.drawColor(Color.LTGRAY);

                // Initialize a new Paint instance to draw the Rectangle
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(Color.YELLOW);
                paint.setAntiAlias(true);

                // Set a pixels value to padding around the rectangle
                int padding = 50;

                /*
                    public Rect (int left, int top, int right, int bottom)
                        Create a new rectangle with the specified coordinates. Note: no range
                        checking is performed, so the caller must ensure that left <= right and
                        top <= bottom.

                    Parameters
                        left : The X coordinate of the left side of the rectangle
                        top : The Y coordinate of the top of the rectangle
                        right : The X coordinate of the right side of the rectangle
                        bottom : The Y coordinate of the bottom of the rectangle

                */

                // Initialize a new Rect object
                Rect rectangle = new Rect(
                        padding, // Left
                        padding, // Top
                        canvas.getWidth() - padding, // Right
                        canvas.getHeight() - padding // Bottom
                );

                /*
                    public void drawRect (Rect r, Paint paint)
                        Draw the specified Rect using the specified Paint. The rectangle will be
                        filled or framed based on the Style in the paint.

                    Parameters
                        r : The rectangle to be drawn.
                        paint : The paint used to draw the rectangle
                */

                // Finally, draw the rectangle on the canvas
                canvas.drawRect(rectangle,paint);

                // Display the newly created bitmap on app interface
                mImageView.setImageBitmap(bitmap);
            }
        });






    }

    public void openNewActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}