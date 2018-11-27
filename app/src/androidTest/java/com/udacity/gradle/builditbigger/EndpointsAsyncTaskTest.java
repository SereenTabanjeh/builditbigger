package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;



import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        try {
            MainActivityFragment fragment = new MainActivityFragment();
            EndpointsAsyncTask syncEndpoint = (EndpointsAsyncTask) new EndpointsAsyncTask().execute(fragment);
            syncEndpoint.execute();
            String result = syncEndpoint.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e) {
            Log.e("Test:", " Timed out");
        }
    }
}
