# SignLanguageInterpretingApp

This app recieves encoded sign langauge data from an Arduino board using bluetooth, and updates the UI with the ASL sign corresponding to the data. The encoded sign language data is gathered by monitoring the user's hand motion using flex sensors on each finger, along with an IMU (Inertial measurement unit).

Built using Android Studio (XML and Java).

App Features:
- Bluetooth data reception is done on a different thread, allowing the app to remain responsive.
- Manages audio in the app using the MediaPlayer API whenever a new sign is displayed on the UI.
