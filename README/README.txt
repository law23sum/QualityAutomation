# COE Automation Framework

   Core Benefits
         Build Tool (Gradle)           =>     Rapid builds, tests, debugs, commits, validations.
         Replace Runner Files          =>     Command-line arguments to select which test suites to execute.


   Gradle Build Framework
         Initialization
            Install require version tool  =>      brew|choco|pip install java groovy gradle mvn
            Refer build tool compatible   =>      https://docs.gradle.org/current/userguide/compatibility.html
            Integrate gradle support      =>      build.gradle -> right click -> gradle framework
         Configuration
            Build
                 Enter into the terminal       =>     gradle : gradle list
                 Update version                =>     gradle : ctrl + shift + F = gradle-<version>
            Test
                 Insert args per attribute     =>     gradle : gradlew -Dcucumber.filter.tags="@E2E"
                                                                       -Dcucumber.features="src/test/resources/features"
                                                                       -Dcucumber.glue="com.company.steps"
                                                                       -Dcucumber.options="--plugin json:target/cucumber-report.json"
                                                                       -DmaxParallelForks=4
                                                                       --info or --debug or --quiet or --warn

                                                                       --PselectedEnv=staging
                                                                       webdriver.start.maximized = true
            Report
                 <Details>

    Troubleshoot
            Ensure VPN if off - prevents jdk to reach ip + ports