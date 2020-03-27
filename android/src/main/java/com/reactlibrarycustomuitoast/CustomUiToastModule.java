package com.reactlibrarycustomuitoast;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class CustomUiToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public CustomUiToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "CustomUiToast";
    }

    int getDuration(String duration) {
        return (duration.equals("long")) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT;
    }

    @ReactMethod
    public void showToast(String message, String position, String textColor, String bgColor, String duration) {
        Context context = getReactApplicationContext();
        try {
            int _duration = getDuration(duration.toLowerCase());
            Toast.makeText(context, message, _duration);
        }
        catch(Exception e){
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
