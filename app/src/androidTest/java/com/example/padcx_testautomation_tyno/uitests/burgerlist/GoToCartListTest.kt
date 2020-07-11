package com.example.padcx_testautomation_tyno.uitests.burgerlist

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnitRunner
import com.example.padcx_testautomation_tyno.R
import com.zg.burgerjoint.activities.MainActivity
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class GoToCartListTest {
    private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)


    @Before
    open fun setUp(){
    activityTestRule.launchActivity(Intent())}

@Test
fun tapOnCart_navigateToCartList(){
    onView(withId(R.id.ivCart)).perform(click())

    onView(withId(R.id.btnCheckOut)).check(matches(isDisplayed()))
}
}