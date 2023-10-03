Button calculateButton = findViewById(R.id.calculateButton);
TextView bmiResultTextView = findViewById(R.id.bmiResultTextView);

calculateButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        EditText weightEditText = findViewById(R.id.weightEditText);
        EditText heightEditText = findViewById(R.id.heightEditText);

        // Get the weight and height values entered by the user
        double weight = Double.parseDouble(weightEditText.getText().toString());
        double height = Double.parseDouble(heightEditText.getText().toString());

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Display the BMI result
        bmiResultTextView.setText("BMI: " + bmi);
    }
});

// Function to calculate BMI
private double calculateBMI(double weight, double height) {
    // BMI formula: weight (kg) / (height (m) * height (m))
    return weight / (height * height);
}