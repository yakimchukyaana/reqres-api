# Project with API automated tests for <a href="https://reqres.in/">Reqres</a>

# 📘Contents

- <a href="#tools">Technologies and tools</a>
- <a href="#cases">Test cases</a>
- <a href="#jenkins">Run tests with Jenkins</a>
- <a href="#console">Run tests from terminal</a>
- <a href="#allureReport">Allure reports</a>
- <a href="#allure">Integration with Allure TestOps</a>
- <a href="#telegram">Telegram notifications</a>

<a id="tools"></a>
## 🔧 Technologies and tools

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="media/logos/intellijIdea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://rest-assured.io/"><img src="media/logos/restAssured.png" width="50" height="50"  alt="Rest-Assured"/></a>
<a href="https://www.java.com/"><img src="media/logos/java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="media/logos/gitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="media/logos/jUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="media/logos/gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="media/logos/allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://https://qameta.io/"><img src="media/logos/allureTestOps.svg" width="50" height="50"  alt="AllureTestOps"/></a>
<a href="https://www.jenkins.io/"><img src="media/logos/jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://https://telegram.org/"><img src="media/logos/telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

<a id="cases"></a>
## 💼 Test cases

- ✅ Get a specific user with get request
- ✅ Get a non-existing user with get request
- ✅ Get a list of users with get request
- ✅ Create a user with post request
- ✅ Delete a user with delete request
- ✅ Register a user with post request
- ✅ Register a user without password with post request
- ✅ Update user information with patch request
- ✅ Update user information with put request


<a id="jenkins"></a>
## <img src="media/logos/jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Run tests with <a target="_blank" href="https://jenkins.autotests.cloud/job/student-yakimchukyaana-qa_guru_21-reqres-api/"> Jenkins </a>

To run tests with Jenkins you need to click on the Build button. After running, you will see an allure report which appears near every run.

<p align="center">
<a href="https://jenkins.autotests.cloud/job/student-yakimchukyaana-qa_guru_21-reqres-api/"><img src="media/screenshots/jenkinsPage.png" alt="Jenkins1"/></a>
</p>

<a id="console"></a>
## 🚀 Run tests from terminal
CLI command:
```
gradle clean test
```

<a id="allureReport"></a>
## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/logos/allure.svg"> </a> <a target="_blank" href="https://jenkins.autotests.cloud/job/student-yakimchukyaana-qa_guru_21-reqres-api/allure/"> Allure </a> reports

Allure report for tests looks like this: 
<p align="center">
<img title="Allure Overview" src="media/screenshots/allureExample.png">
</p>

### You can click on each test to find details:
- tags
- severity
- duration
- steps
- request
- response
- history

## 📎 Test example
<p align="center">
<img title="AllureSuite" src="media/screenshots/testExample.png">
</p>

<a id="allure"></a>
## <img src="media/logos/allureTestOps.svg" width="25" height="25"  alt="Allure_TO"/></a> Integration with  <a target="_blank" href="https://allure.autotests.cloud/project/3773/dashboards"> Allure TestOps</a>

There you can find all information about crucial things such as:

## 📈 Dashboards

<p align="center">
<img title="Allure TestOps DashBoard" src="media/screenshots/allureTestOpsDashboard.png">
</p>

## 📝 Testcases
<p align="center">
<img title="AllureTC" src="media/screenshots/allureTestOpsTestCases.png">
</p>

## 🚤 Launches
<p align="center">
<img title="Allure Tests" src="media/screenshots/allureTestOpsLaunches.png">
</p>

<a id="telegram"></a>
## <img src="media/logos/telegram.svg" width="25" height="25"  alt="Telegram"/></a> Telegram notifications
After each build test results are sent to a `Telegram` chat. It looks like this

<p align="center">
<img title="telegram" src="media/screenshots/notification.jpeg">
</p>