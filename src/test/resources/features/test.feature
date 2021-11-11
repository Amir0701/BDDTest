Feature: test
  Scenario: enter to yandex
    Given URL "https://passport.yandex.ru/auth"
    When i am input login "usmonamir"
    And  i input password "amir0036"
    Then i go to disk


  Scenario: download file
    When i find "Data.xlsx"
    And i download file
    Then i check "Data.xlsx"

  Scenario: upload image
    When i choose a image
    Then i upload image