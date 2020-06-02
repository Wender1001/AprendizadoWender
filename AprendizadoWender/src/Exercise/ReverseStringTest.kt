package Exercise

import org.junit.Assert
import org.junit.Test

class ReverseStringTest {

    @Test
    fun reverseUsingSB(){
        Assert.assertEquals("rednew",reverseUsingSB("wender"))

    }

    @Test
    fun reverseUsingLoop(){
        Assert.assertEquals("wender","rednew")

    }
}