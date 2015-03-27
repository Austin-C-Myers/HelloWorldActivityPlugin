/**
 * An Image Picker Plugin for Cordova/PhoneGap.
 */
package com.synconset;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

public class HelloWorld extends CordovaPlugin {
	public static String TAG = "ImagePicker";
	 
	private CallbackContext callbackContext;
	private JSONObject params;
	 
	public boolean execute(String action, final JSONArray args, final CallbackContext callbackContext) throws JSONException {
		 this.callbackContext = callbackContext;
		 this.params = args.getJSONObject(0);
		//if (action.equals("getPictures")) {
			Intent intent = new Intent(cordova.getActivity(), HelloWorldActivity.class);

			//if (this.cordova != null) {
				this.cordova.startActivityForResult((CordovaPlugin) this, intent, 0);
			//}
		//}
		return true;
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent data) {

	}
}