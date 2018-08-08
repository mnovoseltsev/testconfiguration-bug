# testconfiguration-bug

Demo project to reproduce unexpected behavour with Spring Framework `@TestConfiguration`.

There are two tests. 
First test `injectedStringShouldContainValueFromTestConfiguration()` uses `@TestConfiguration` as an `@Import` statement. 
Second test `injectedStringShouldContainValueFromInnerTestConfiguration()` uses `@TestConfiguration` as an inner static class.
First test fail, however second works as expected.
