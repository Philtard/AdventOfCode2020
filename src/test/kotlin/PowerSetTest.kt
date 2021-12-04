import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PowerSetTest {
    @Test
    fun test() {
        val powerSet = PowerSet(listOf(1, 2, 3, 4).iterator()).toList()
        val expected = """
            
            1
            2
            1,2
            3
            1,3
            2,3
            1,2,3
            4
            1,4
            2,4
            1,2,4
            3,4
            1,3,4
            2,3,4
            1,2,3,4
        """.trimIndent()
        assertEquals(expected, powerSet.joinToString("\n") { it.joinToString(",") })
    }
}