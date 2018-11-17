$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/test/test.feature");
formatter.feature({
  "line": 1,
  "name": "Test log in to Canopy",
  "description": "",
  "id": "test-log-in-to-canopy",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14769035588,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#\tScenario: Log in to the Canopy homepage"
    },
    {
      "line": 4,
      "value": "#\t\tGiven Canopy homepage is loaded"
    },
    {
      "line": 5,
      "value": "#\t\tWhen navigated to Canopy Homepage"
    },
    {
      "line": 6,
      "value": "#\t\tThen User should be able to log in"
    }
  ],
  "line": 8,
  "name": "Navigate to Create Task",
  "description": "",
  "id": "test-log-in-to-canopy;navigate-to-create-task",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "navigated to Stashboard",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Created a new task",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Stashboard should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userIsLoggedIn()"
});
formatter.result({
  "duration": 2157582179,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.navigatedToStashboard()"
});
formatter.result({
  "duration": 1365251692,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.createdANewTask()"
});
formatter.result({
  "duration": 78884016743,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //div[@class\u003d\u0027k-list-container k-popup k-group k-reset k-state-border-up\u0027]//input[@class\u003d\u0027k-textbox\u0027] (tried for 2 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:113)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:283)\r\n\tat com.automation.pageobjects.BasePage.waitFor(BasePage.java:30)\r\n\tat com.automation.pageobjects.UploadFilePage.selectAccount(UploadFilePage.java:384)\r\n\tat com.automation.step_definitions.StepDefinitions.createdANewTask(StepDefinitions.java:98)\r\n\tat ✽.And Created a new task(features/test/test.feature:11)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //div[@class\u003d\u0027k-list-container k-popup k-group k-reset k-state-border-up\u0027]//input[@class\u003d\u0027k-textbox\u0027]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027NAG1-LHP-N06748\u0027, ip: \u0027192.168.2.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:896)\r\n\tat java.util.Optional.orElseThrow(Optional.java:290)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:260)\r\n\tat com.automation.pageobjects.BasePage.waitFor(BasePage.java:30)\r\n\tat com.automation.pageobjects.UploadFilePage.selectAccount(UploadFilePage.java:384)\r\n\tat com.automation.step_definitions.StepDefinitions.createdANewTask(StepDefinitions.java:98)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:34)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:30)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:35)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:298)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:48)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.stashboardShouldBeDisplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 164276323,
  "status": "passed"
});
});