package com.rharris.simpleapp

import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import io.mockk.mockk
import io.mockk.verify
import org.junit.Rule
import org.junit.Test

class DolphinScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun navigateToHornetsPage() {
        // Create a mock NavHostController
        val mockNavController = mockk<NavHostController>(relaxed = true)

        // Set content with DolphinScreen and the mocked NavController
        composeTestRule.setContent {
            DolphinScreen(navController = mockNavController)
        }

        // Perform click on the "To Hornets Page" button
        composeTestRule.onNodeWithText("To Hornets Page").performClick()

        // Verify that the navigation call was made with the correct route
        verify { mockNavController.navigate("greeting") }
    }

    @Test
    fun verifyDolphinScreenUI() {
        composeTestRule.setContent {
            val navController = rememberNavController()
            DolphinScreen(navController = navController)
        }

        // Verify UI elements
        composeTestRule.onNodeWithText("Miami Dolphins").assertExists()
        composeTestRule.onNodeWithText("Shop Dolphins").assertExists().assertIsEnabled()
        composeTestRule.onNodeWithText("To Hornets Page").assertExists()
        composeTestRule.onNodeWithContentDescription("Dolphins Logo").assertExists()
    }
}