package com.bagas.jetpackpro.moviesapp.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.ui.detail.DetailItemActivity
import com.bagas.jetpackpro.moviesapp.utils.DataDummy
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import java.util.regex.Pattern

class MainActivityTest {

    private val dummyMovie = DataDummy.GenerateDummyMovies()
    private val dummyTvshow = DataDummy.GenerateDummyTvshow()

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_poster))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyMovie[0].genre)))
        onView(withId(R.id.tv_rates))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyMovie[0].rating)))
        onView(withId(R.id.tv_overview))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyMovie[0].overview)))
        onView(withId(R.id.tv_hour))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyMovie[0].hour)))
        onView(withId(R.id.tv_stars))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyMovie[0].stars)))
        onView(withId(R.id.tv_director))
            .check(matches(withText(dummyMovie[0].director)))
    }

    @Test
    fun loadTvshow() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rvTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvshow.size))
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
    }

    @Test
    fun loadDetailTvshow() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_poster))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyTvshow[0].genre)))
        onView(withId(R.id.tv_rates))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyTvshow[0].rating)))
        onView(withId(R.id.tv_overview))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyTvshow[0].overview)))
        onView(withId(R.id.tv_seasons))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyTvshow[0].seasons)))
        onView(withId(R.id.tv_stars))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyTvshow[0].stars)))
        onView(withId(R.id.tv_director))
            .check(matches(isDisplayed()))
            .check(matches(withText(dummyTvshow[0].director)))
    }

}