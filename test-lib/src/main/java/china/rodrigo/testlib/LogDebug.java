package china.rodrigo.testlib;

import android.util.Log;

/**
 * Created by Rodrigo on 24/01/2018.
 */

public class LogDebug {
    private String TAG = "TEST-LIB";
    public void debug(String message){
        Log.d(TAG, message);
    }
}
