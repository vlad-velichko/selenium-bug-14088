need to install MS Teams on your Windows machine before run

Log output:
```
file.exists() = false
Files.exists(...) = true
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
Exception in thread "main" org.openqa.selenium.remote.NoSuchDriverException: Unable to obtain: msedgedriver, error MicrosoftEdge must exist: C:\Users\vvelichko\AppData\Local\Microsoft\WindowsApps\ms-teams.exe
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors/driver_location/
Build info: version: '4.21.0', revision: '79ed462ef4'
System info: os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '21-ea'
Driver info: driver.version: SelenideDriver
	at org.openqa.selenium.remote.service.DriverFinder.getBinaryPaths(DriverFinder.java:121)
	at org.openqa.selenium.remote.service.DriverFinder.getDriverPath(DriverFinder.java:55)
	at org.openqa.selenium.edge.EdgeDriver.generateExecutor(EdgeDriver.java:71)
	at org.openqa.selenium.edge.EdgeDriver.<init>(EdgeDriver.java:60)
	at org.openqa.selenium.edge.EdgeDriver.<init>(EdgeDriver.java:56)
	at com.codeborne.selenide.webdriver.EdgeDriverFactory.create(EdgeDriverFactory.java:33)
	at com.codeborne.selenide.webdriver.WebDriverFactory.createWebDriverInstance(WebDriverFactory.java:117)
	at com.codeborne.selenide.webdriver.WebDriverFactory.createWebDriver(WebDriverFactory.java:67)
	at com.codeborne.selenide.drivercommands.CreateDriverCommand.lambda$createDriver$0(CreateDriverCommand.java:72)
	at com.codeborne.selenide.logevents.SelenideLogger.wrap(SelenideLogger.java:133)
	at com.codeborne.selenide.logevents.SelenideLogger.get(SelenideLogger.java:113)
	at com.codeborne.selenide.drivercommands.CreateDriverCommand.createDriver(CreateDriverCommand.java:48)
	at com.codeborne.selenide.drivercommands.LazyDriver.createDriver(LazyDriver.java:139)
	at com.codeborne.selenide.drivercommands.LazyDriver.getAndCheckWebDriver(LazyDriver.java:126)
	at com.codeborne.selenide.SelenideDriver.getAndCheckWebDriver(SelenideDriver.java:211)
	at com.codeborne.selenide.logevents.SelenideLogger.lambda$run$0(SelenideLogger.java:105)
	at com.codeborne.selenide.logevents.SelenideLogger.wrap(SelenideLogger.java:133)
	at com.codeborne.selenide.logevents.SelenideLogger.run(SelenideLogger.java:104)
	at com.codeborne.selenide.drivercommands.Navigator.open(Navigator.java:87)
	at com.codeborne.selenide.SelenideDriver.open(SelenideDriver.java:89)
	at org.example.Main.main(Main.java:26)
Caused by: java.lang.IllegalStateException: MicrosoftEdge must exist: C:\Users\vvelichko\AppData\Local\Microsoft\WindowsApps\ms-teams.exe
	at org.openqa.selenium.internal.Require$FileStateChecker.isFile(Require.java:346)
	at org.openqa.selenium.internal.Require$FileStateChecker.isExecutable(Require.java:368)
	at org.openqa.selenium.remote.service.DriverFinder.getBinaryPaths(DriverFinder.java:104)
	... 20 more

Process finished with exit code 1

```
