public class TestClass3 {

    private TestClass2 testClass2;

    public TestClass3(TestClass2 testClass2) {
        this.testClass2 = testClass2;
    }

    public String run() {
        return testClass2.staticMethod();
    }
}
