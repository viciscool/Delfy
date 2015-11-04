package com.projectvish.delfy;

import android.app.Application;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Vish on 28/10/15.
 */
public class DelphyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "sQ16ffkLdkmSSsp5ALQxQbZdGJrm6BlbOCEFtkUd", "QejO0SxUkgvwaBaUtSkoZMBIQoqOp6Pt8lQqKkS2");
    }
}
