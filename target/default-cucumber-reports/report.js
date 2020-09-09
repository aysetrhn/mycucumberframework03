$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fhcregister.feature");
formatter.feature({
  "name": "FhcTrip Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fhcregister"
    }
  ]
});
formatter.scenario({
  "name": "fhcTrip registration test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fhcregister"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici fhctrip sayfasindadir",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_fhctrip_sayfasindadir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici \"create a new account\" butonuna tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_butonuna_tiklar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici username girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_username_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici password girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_password_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici email girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_email_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici fullname girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_fullname_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici phone girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_phone_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici SSN girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_SSN_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici driving lisans girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_driving_lisans_girer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici country dropdowndan secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_country_dropdowndan_secer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici state dropdowndan secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_state_dropdowndan_secer()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with index: 7\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027AYSETURHAN\u0027, ip: \u0027192.168.1.21\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.setSelectedByIndex(Select.java:297)\r\n\tat org.openqa.selenium.support.ui.Select.selectByIndex(Select.java:172)\r\n\tat stepdefinitions.FhcRegisterStepDef.kullanici_state_dropdowndan_secer(FhcRegisterStepDef.java:72)\r\n\tat ✽.kullanici state dropdowndan secer(file:///C:/Users/Dell%20E7250/IdeaProjects/mycucumberframework/src/test/resources/features/fhcregister.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "kullanici adress girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_adress_girer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici working sector girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_working_sector_girer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici birthday girer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_birthday_girer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "kullanici save butonuna tiklar",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.FhcRegisterStepDef.kullanici_save_butonuna_tiklar()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});