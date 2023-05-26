# aqa20.saucedemo
mvn versions:display-dependency-updates

[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   io.github.bonigarcia:webdrivermanager ................. 5.3.2 -> 5.3.3
[INFO]   org.aspectj:aspectjweaver ............................ 1.9.8 -> 1.9.19
[INFO]   org.seleniumhq.selenium:selenium-java .............. 3.141.59 -> 4.9.1
[INFO]   org.testng:testng ..................................... 7.7.1 -> 7.8.0
[INFO]
[INFO] The following dependencies in Plugin Dependencies have newer versions:
[INFO]   org.aspectj:aspectjweaver ............................ 1.9.8 -> 1.9.19

mvn clean test

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 14.435 s - in TestSuite
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  25.627 s
[INFO] Finished at: 2023-05-26T00:18:36+03:00
[INFO] ------------------------------------------------------------------------

mvn clean -DloginStandardUser='standard_user' -Dpassword='secret_sauce' -DsuiteXmlFile='src/test/resources/suit.xml' test



