import com.example.nullpointertest.GameLib
import com.example.nullpointertest.Games
import com.example.nullpointertest.routes
import org.junit.Test

class NullTest {
    @Test
    fun nullTest() {
        assert(Games.companionRoutes.first().name == "minecraft")
    }

    @Test
    fun outNullTest() {
        assert(routes.first().name == "minecraft")
    }

    @Test
    fun doubleTest() {
        assert(routes.first().name == "minecraft")
        assert(Games.companionRoutes.first().name == "minecraft")
    }

    @Test
    fun doubleTest2() {
        assert(Games.companionRoutes.first().name == "minecraft")
        assert(routes.first().name == "minecraft")
    }
}