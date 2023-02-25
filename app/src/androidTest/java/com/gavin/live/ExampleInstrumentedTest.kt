package com.gavin.live

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.gavin.live.utils.SortUtils
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
        val original = intArrayOf(9,1,5,8,3,7,4,6,2);
        val bubbleSort = SortUtils.bubbleSort(original);
        Log.e("AAA","bubbleSort ="+bubbleSort.contentToString())

        val original2 = intArrayOf(9,1,5,8,3,7,4,6,2);
        val bubbleSort2 = SortUtils.bubbleSort2(original2);
        Log.e("AAA","bubbleSort2 ="+bubbleSort2.contentToString())

        val original3 = intArrayOf(9,1,5,8,3,7,4,6,2);
        val selectSort = SortUtils.selectSort(original3);
        Log.e("AAA","selectSort ="+selectSort.contentToString())

        val original4 = intArrayOf(9,1,5,8,3,7,4,6,2);
        val insertSort = SortUtils.insertSort(original4);
        Log.e("AAA","insertSort ="+insertSort.contentToString())
    }
}