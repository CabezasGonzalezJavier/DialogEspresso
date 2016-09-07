package com.thedeveloperworldisyours.dialogespresso;

import android.os.SystemClock;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by javierg on 07/09/16.
 */
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void dialogTest() {
        onView(withId(R.id.activity_main_button)).perform(click());
        onView(withText("None of the about")).check(matches(isDisplayed()));
        SystemClock.sleep(1500);
        onView(withText("None of the about")).perform(click());
        SystemClock.sleep(1500);
    }
}