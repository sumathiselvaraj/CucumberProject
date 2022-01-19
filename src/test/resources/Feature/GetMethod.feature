@Get_Request
Feature: GET METHOD
  
  Background : 
  *Url 'https://lms-admin-rest-service.herokuapp..com/programs'

  Scenario: Authorization as default
    Given User creates GET Request for LMS API end point
    When User Send Https Request
    Then User receive HTTP 401 error "UnAuthorized"

  Scenario: Check the Authorization
    Given User creates LMS API end point
    When User set Authorization to "basic auth" with valid credentials and Send Https Request
    Then User receive HTTP 200 Ok Status code with all record

  Scenario: User creates a GET request  "To check getting all the records"
    Given User creates GET Request for LMS API end point
    When User Send Https Request
    Then User receive HTTP 200 Ok Status code " displayed all  records from LMS values"

  Scenario: Check using the incomplete/wrong URL
    Given User creates GET Request with incomplete /wrong url
    When User Send Https Request
    Then User receive HTTP 404 Error Code "Path_Not Found"
