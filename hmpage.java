import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWorkouts(View view) {
        // Navigate to the Workouts screen
        startActivity(new Intent(this, WorkoutsActivity.class));
    }

    public void openNutrition(View view) {
        // Navigate to the Nutrition screen
        startActivity(new Intent(this, NutritionActivity.class));
    }

    public void openProfile(View view) {
        // Navigate to the Profile screen
        startActivity(new Intent(this, ProfileActivity.class));
    }
}
