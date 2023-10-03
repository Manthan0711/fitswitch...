TextView heartRateTextView = findViewById(R.id.heartRateTextView);
Button startButton = findViewById(R.id.startButton);

startButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        // Perform heart rate measurement and update the UI
        int heartRate = // Your code to measure heart rate (e.g., sensor readings)
        heartRateTextView.setText("Heart Rate: " + heartRate + " BPM");
    }
});