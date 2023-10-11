import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView breakfastText, lunchText, dinnerText;
    private Button generateButton;

    private String[] breakfastPlans = {"Oatmeal with fruits", "Scrambled eggs with toast", "Yogurt with granola"};
    private String[] lunchPlans = {"Grilled chicken salad", "Vegetable stir-fry", "Quinoa bowl"};
    private String[] dinnerPlans = {"Salmon with broccoli", "Pasta with tomato sauce", "Tofu and vegetable curry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        breakfastText = findViewById(R.id.breakfastText);
        lunchText = findViewById(R.id.lunchText);
        dinnerText = findViewById(R.id.dinnerText);
        generateButton = findViewById(R.id.generateButton);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Generate random plans
                Random random = new Random();
                String randomBreakfast = breakfastPlans[random.nextInt(breakfastPlans.length)];
                String randomLunch = lunchPlans[random.nextInt(lunchPlans.length)];
                String randomDinner = dinnerPlans[random.nextInt(dinnerPlans.length)];

                // Display the generated plans
                breakfastText.setText("Breakfast: " + randomBreakfast);
                lunchText.setText("Lunch: " + randomLunch);
                dinnerText.setText("Dinner: " + randomDinner);
            }
        });
    }
}
