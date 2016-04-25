package net.mdavies.reactnativephoneinfo;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap; 
import java.util.Map;
import android.telephony.TelephonyManager;
import android.support.annotation.Nullable;
import android.util.Log;

public class ReactNativePhoneInfoModule extends ReactContextBaseJavaModule {
    private Context context;

    public ReactNativePhoneInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
    }

    /**
     * @return the name of this module. This will be the name used to {@code require()} this module
     * from javascript.
     */
    @Override
    public String getName() {
        return "ReactNativePhoneInfo";
    }

    private String getPhoneNumber() {
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        Log.w("PhoneInfo", telephonyManager.toString());
        String phoneNumber = telephonyManager.getLine1Number();
        Log.w("PhoneInfo", "phone:" + phoneNumber);
        return phoneNumber;
    }
    
    @Override
    public @Nullable Map<String, Object> getConstants() {
        HashMap<String, Object> constants = new HashMap<String, Object>();
        constants.put("phoneNumber", this.getPhoneNumber());
        return constants;
    }
}
