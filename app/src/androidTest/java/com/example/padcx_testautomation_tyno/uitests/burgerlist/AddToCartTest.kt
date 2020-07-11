package com.example.padcx_testautomation_tyno.uitests.burgerlist

import android.content.Intent
import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.example.padcx_testautomation_tyno.R
import com.example.padcx_testautomation_tyno.uitests.utils.first
import com.zg.burgerjoint.activities.MainActivity
import kotlinx.android.synthetic.main.view_item_burger.view.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AddToCartTest {
    private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Before
    fun setUp(){
        activityTestRule.launchActivity(Intent())
    }

    @Test
    fun tapAddToCart_numberOfItemsInCartIncreased() {
        onView(first<View>(withId(R.id.btnAddToCart))).perform(click())

        onView(withId(R.id.tvCartCount)).check(matches(withText("1")))
    }

}