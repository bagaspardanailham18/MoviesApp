package com.bagas.jetpackpro.moviesapp.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.bagas.jetpackpro.moviesapp.R
import com.bagas.jetpackpro.moviesapp.utils.DataDummy
import com.bagas.jetpackpro.moviesapp.utils.EspressoIdlingResource
import org.hamcrest.core.IsNot.not
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val dummyMovie = DataDummy.generateRemoteDummyMovies()
    private val dummyTvshow = DataDummy.generateRemoteDummyTvshow()

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.getEspressoIdlingResource())
    }

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
        onView(withId(R.id.tv_rates))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_runtime))
                .check(matches(not(withText(""))))
        onView(withId(R.id.tv_lang))
                .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun loadTvshow() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rvTvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvshow.size))
    }

    @Test
    fun loadDetailTvshow() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(isRoot()).perform(swipeUp())
        onView(withId(R.id.tv_poster))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_rates))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_seasons))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_runtime_episodes))
            .check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview))
                .check(matches(isDisplayed()))
        onView(withId(R.id.tv_lang))
                .check(matches(isDisplayed()))
    }
}