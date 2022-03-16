$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AdactinBooking.feature");
formatter.feature({
  "name": "Validation of Adactin Hotel Booking ID",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Hotel Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.user_launch_Adactin_Hotel_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Page is diplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.login_Page_is_diplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC01_Validation of Adactin Hotel Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User Enter Valid UserName and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_UserName_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Clicks_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify  Search Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Search_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#order_no\"}\n  (Session info: chrome\u003d99.0.4844.51)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.1\u0027, revision: \u0027e8fcc2cecf\u0027\nSystem info: host: \u0027DESKTOP-FS4CIQU\u0027, ip: \u0027192.168.1.17\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [f8bc1130f95b89b89bdedd4e88eea757, findElement {using\u003did, value\u003dorder_no}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.51, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\andre\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51122}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:51122/devtoo..., se:cdpVersion: 99.0.4844.51, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: f8bc1130f95b89b89bdedd4e88eea757\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:367)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.baseclass.BaseClass.findElementById(BaseClass.java:143)\r\n\tat org.stepDefination.HooksClass.afterExecution(HooksClass.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Hotel Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.user_launch_Adactin_Hotel_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Page is diplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.login_Page_is_diplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC04_Validation of Adactin Hotel Booking Order Id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "User Enter Valid UserName and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_UserName_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Clicks_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify  Search Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Search_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_Location_Hotels_RoomType_NumberOfRooms_CheckInDate_CheckOutDate_AdultPerRoom_and_ChildrenPerRoom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Clicks_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Radio Button And User Click Continue",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Click_Radio_Button_And_User_Click_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Book a Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Book_a_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid FirstName, LastName and BillingAddress",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_FirstName_LastName_and_BillingAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid CreditCardNo and Select CardType , Month, Year and Enter Valid CVVNumber",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_CreditCardNo_and_Select_CardType_Month_Year_and_Enter_Valid_CVVNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Click_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Booking Confirmation Page is Displayed and Confirmation Order ID is Showned",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Booking_Confirmation_Page_is_Displayed_and_Confirmation_Order_ID_is_Showned()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch Adactin Hotel Web Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.user_launch_Adactin_Hotel_Web_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Page is diplayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.login_Page_is_diplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC05_Validation of Adactin Hotel Booking Order Id With WebTable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Reg"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User Enter Valid UserName and Password With DataTable",
  "rows": [
    {
      "cells": [
        "Andrew07"
      ]
    },
    {
      "cells": [
        "1283YR"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_UserName_and_Password_With_DataTable(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Clicks_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify  Search Hotel Page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Search_Hotel_Page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom With DataTable",
  "rows": [
    {
      "cells": [
        "Paris",
        "Hotel Sunshine",
        "Deluxe"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "13/03/2022",
        "15/03/2022"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "2 - Two",
        ""
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_Location_Hotels_RoomType_NumberOfRooms_CheckInDate_CheckOutDate_AdultPerRoom_and_ChildrenPerRoom_With_DataTable(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Clicks_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Select Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Select_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Radio Button And User Click Continue",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Click_Radio_Button_And_User_Click_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Book a Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Book_a_Hotel_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid FirstName, LastName and BillingAddress With DataTable",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Andrew"
      ]
    },
    {
      "cells": [
        "LastName",
        "Vimal"
      ]
    },
    {
      "cells": [
        "Billing Address",
        "Choolaimedu,Chennai-10"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_FirstName_LastName_and_BillingAddress_With_DataTable(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Valid CreditCardNo and Select CardType , Month, Year and Enter Valid CVVNumber With DataTable",
  "rows": [
    {
      "cells": [
        "CardNo",
        "CardType",
        "Month",
        "Year",
        "CVV"
      ]
    },
    {
      "cells": [
        "9998765678654343",
        "VISA",
        "May",
        "2022",
        "5678"
      ]
    },
    {
      "cells": [
        "4567898765434567",
        "American Express",
        "June",
        "2022",
        "6789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.user_Enter_Valid_CreditCardNo_and_Select_CardType_Month_Year_and_Enter_Valid_CVVNumber_With_DataTable(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Book Now Button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_Click_Book_Now_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Verify Booking Confirmation Page is Displayed and Confirmation Order ID is Showned",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.user_Verify_Booking_Confirmation_Page_is_Displayed_and_Confirmation_Order_ID_is_Showned()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});