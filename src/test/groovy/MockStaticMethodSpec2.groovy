import org.mockito.Mockito
import org.powermock.api.mockito.PowerMockito
import spock.lang.Specification

class MockStaticMethodSpec2 extends Specification {
    def "Test static method"() {
        given :
            def testClass2 = Mock(TestClass2);
            testClass2.staticMethod() >> "22"
            def testClass3 = new TestClass3(testClass2);
        when :
            def res = testClass3.run();
        then :
            res == "22"
    }
}
