package com.gavin.live

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.gavin.live", appContext.packageName)
        Log.e("AAA","test-q")

        val list = ArrayList<String>()
        list.add("A");
        list.add("B");
        list.add("B");

        val list2 = list;

        Log.e("AAA","list ="+ list.size+",list2 ="+list2.size)
    }

    @Test
    fun useAppTest(){
        var arry = Array(3) { it -> (it * 2) };

        Log.e("AAA","arry ="+arry.size)

        val cQueue = CQueue()
        cQueue.appendTail(10)
        cQueue.appendTail(12)
        cQueue.appendTail(14)
        val i = cQueue.deleteHead()
        Log.e("AAA", "deleteHead = $i")
    }
}