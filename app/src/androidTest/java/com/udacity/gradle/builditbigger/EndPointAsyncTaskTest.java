package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by maysaraodeh on 18/10/2017.
 */


@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {
    private Context instrumentationContext;

    @Before
    public void setup() {
        instrumentationContext = InstrumentationRegistry.getTargetContext();
    }
    @Test
    public void testDoInBackground() throws Exception {
        EndpointAsyncTask asyncTask=new EndpointAsyncTask();
        asyncTask.execute(instrumentationContext);
        try{
            String joke=asyncTask.get();
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

    }

}
