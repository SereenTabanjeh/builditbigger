package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    @Test
    public void testDoInBackground() throws Exception {
        com.udacity.gradle.builditbigger.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;
        new EndpointsAsyncTask().execute(fragment);
        Thread.sleep(4000);
        assertTrue("there is error to get the Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);
    }
}