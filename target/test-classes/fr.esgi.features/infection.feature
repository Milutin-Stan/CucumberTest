Feature: Infection of a city

  Scenario: First infection
    Given "PARIS" has not been infected
    When "PARIS" is infected
    Then "PARIS"' infection level should be increase to 1

  Scenario: Second infection
    Given "PARIS" has been infected 1 time
    When "PARIS" is infected
    Then "PARIS"' infection level should be increase to 2

  Scenario: Third infection
    Given "PARIS" has been infected 2 time
    When "PARIS" is infected
    Then "PARIS"' infection level should be increase to 3

  Scenario: Fourth infection
    Given "PARIS" has been infected 3 time
    When "PARIS" is infected
    Then "PARIS"' infection level should be increase to 4