# SignLanguageInterpretingApp

This app recieves encoded sign langauge data from an Arduino board using bluetooth, and updates the UI with the ASL sign corresponding to the data. The encoded sign language data is gathered by monitoring the user's hand motion using flex sensors on each finger, along with an IMU (Inertial measurement unit).

Built using Android Studio (XML and Java).

App Features:
- Bluetooth data reception is done on a different thread, allowing the app to remain responsive.
- UI is updated with text and image of the ASL sign corresponding to the data recieved.
- Plays an audio file of the ASL sign corresponding to the data recieved. Audio in the app is managed using the MediaPlayer API.

Video Demo:


https://user-images.githubusercontent.com/47334973/179563936-0a181d9a-cf4c-4d60-b23b-f5def03451a3.mp4

