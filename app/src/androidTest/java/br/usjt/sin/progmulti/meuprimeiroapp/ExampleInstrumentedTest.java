package br.usjt.sin.progmulti.meuprimeiroapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//claudemir cardoso RA 816155452
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    //claudemir cardoso RA 816155452
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("br.usjt.sin.progmulti.meuprimeiroapp", appContext.getPackageName());
    }
}
