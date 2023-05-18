package com.example.lemonade

import org.junit.Test
import android.widget.TextView
import org.junit.Assert.assertEquals
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testButtonClick_count2() {
        val mainActivity = MainActivity()
        mainActivity.onCreate(null)

        val textResult = mainActivity.findViewById<TextView>(R.id.text_clickMe)

        mainActivity.onClickImageBtn()

        assertEquals("Click to juice the lemon!", textResult.text)
    }
}