import org.junit.runner.RunWith
import org.mockito.Mockito
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
@PrepareForTest([TestClass.class])
class MockStaticMethodSpec extends Specification {
    def "Test static method"() {
        setup :
        PowerMockito.mockStatic(TestClass.class)
        when :
        Mockito.when(TestClass.staticMethod())
                .thenReturn("Verify String")
        then :
        TestClass.staticMethod() == "Verify String"
    }
}