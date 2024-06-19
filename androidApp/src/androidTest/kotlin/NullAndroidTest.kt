import androidx.activity.compose.setContent
import androidx.compose.ui.test.isDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.nullpointertest.android.Content
import com.example.nullpointertest.android.MainActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class NullAndroidTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun DoubleTest1() {
        // ボタンをクリック
        composeTestRule.onNodeWithText("Out Test").performClick()
        composeTestRule.onNodeWithText("minecraft").isDisplayed()
        // ボタンをクリック
        composeTestRule.onNodeWithText("Companion Test").performClick()
        composeTestRule.onNodeWithText("minecraft").isDisplayed()
    }

    @Test
    fun DoubleTest2() {
        // ボタンをクリック
        composeTestRule.onNodeWithText("minecraft").isDisplayed()
        composeTestRule.onNodeWithText("Companion Test").performClick()
        // ボタンをクリック
        composeTestRule.onNodeWithText("Out Test").performClick()
        composeTestRule.onNodeWithText("minecraft").isDisplayed()
    }


    @Test
    fun CompanionOnlyTest() {
        // ボタンをクリック
        composeTestRule.onNodeWithText("Companion Test").performClick()
        composeTestRule.onNodeWithText("minecraft").isDisplayed()
    }

    @Test
    fun OutOnlyTest() {
        // ボタンをクリック
        composeTestRule.onNodeWithText("Out Test").performClick()
        composeTestRule.onNodeWithText("minecraft").isDisplayed()
    }


}