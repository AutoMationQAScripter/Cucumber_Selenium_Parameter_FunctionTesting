Feature: Gmail login check

  Scenario Outline: Gmail login check
    Given Launch Browser and check Page
    When Enter "<Username>" and "<Password>"
    Then Check invalid message

    Examples: 
      | Username                    | Password |
      | paldeepak.itm@gmail.com     |   123456 |
      | paldeepak.cs@gmail.com      |   123214 |
      | paldeepak.cs@gmail.com      |   325468 |
      | santoshkushwah024@gmail.com |  4565163 |
