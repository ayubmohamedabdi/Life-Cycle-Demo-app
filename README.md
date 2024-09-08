# Android Lifecycle Demo

This is a demo application to showcase the Android Activity lifecycle and how UI elements, such as `TextView`, can be updated to reflect the current lifecycle state of an activity. The lifecycle events are displayed both in the application UI and logged to Logcat.

## Project Overview

The goal of this project is to demonstrate how an Android activity goes through different lifecycle states (`onCreate`, `onStart`, `onResume`, etc.) and how you can update the UI to reflect the current state.

### Features:
- Displays the current lifecycle state on the screen using a `TextView`.
- Logs lifecycle events to Logcat.
- Handles device orientation changes (landscape/portrait).

## Project Structure

- **MainActivity.java**: The main activity that handles lifecycle events.
- **activity_main.xml**: The layout file containing the `TextView` that displays the current lifecycle state.
- **AndroidManifest.xml**: Configures the app's activity and lifecycle settings.

## How It Works

- When the app is launched, the `onCreate` method is called, and the lifecycle state is displayed on the screen.
- Each lifecycle event (`onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`) updates the `TextView` with the current state.
- Orientation changes trigger lifecycle transitions, such as moving from `onPause` to `onDestroy` and then back to `onCreate`.

## Running the App

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Build and run the project on an emulator or a physical Android device.
4. Use Logcat in Android Studio to observe the lifecycle event logs.
5. Rotate the device to see how the lifecycle methods are called during orientation changes, and the UI will update accordingly.

## Requirements

- Android Studio
- An Android device or emulator running Android API 21 (Lollipop) or higher



