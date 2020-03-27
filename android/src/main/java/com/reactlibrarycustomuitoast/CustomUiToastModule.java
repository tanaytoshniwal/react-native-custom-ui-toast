package com.reactlibrarycustomuitoast;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

import org.json.JSONObject;

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

    public int getPosition(String pos){
        switch (pos){
            case "top":
                return Gravity.TOP|Gravity.CENTER_HORIZONTAL;
            case "topleft":
                return Gravity.TOP|Gravity.LEFT;
            case "topright":
                return Gravity.TOP|Gravity.RIGHT;
            case "center":
                return Gravity.CENTER|Gravity.CENTER_HORIZONTAL;
            case "centerleft":
                return Gravity.CENTER|Gravity.LEFT;
            case "centerright":
                return Gravity.CENTER|Gravity.RIGHT;
            case "bottom":
                return Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL;
            case "bottomleft":
                return Gravity.BOTTOM|Gravity.LEFT;
            case "bottomright":
                return Gravity.BOTTOM|Gravity.RIGHT;
            default:
                return Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL;
        }
    }

    @ReactMethod
    public void showToast(String message, int duration, ReadableMap styles) {
        Context context = getReactApplicationContext();
        try {
            Toast toast = Toast.makeText(context, message, duration);

            View toastView = toast.getView();
            int _position = getPosition(
                    (styles.hasKey("position")) ? styles.getString("position"): ""
            );
            int _X = (styles.hasKey("offsetX")) ? styles.getInt("offsetX"): 0;
            int _Y = (styles.hasKey("offsetY")) ? styles.getInt("offsetY"): 0;
            String _color = (styles.hasKey("backgroundColor")) ? styles.getString("backgroundColor"): "#aaaaaa";
            String _textColor = (styles.hasKey("color")) ? styles.getString("color"): "#000000";

            toastView.setBackgroundColor(Color.parseColor(_color));

            TextView text = toastView.findViewById(android.R.id.message);
            text.setTextColor(Color.parseColor(_textColor));

            toast.setGravity(_position, _X, _Y);
            toast.show();
        }
        catch(Exception e){
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
