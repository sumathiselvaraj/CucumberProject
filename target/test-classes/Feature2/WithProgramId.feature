@Get{{ProgramId}}_Request
Feature: GET {{ProgramId}} Method
  
  Background : Set to "Basic Auth"
  *Url 'https://lms-admin-rest-service.herokuapp..com/programs/{{ProgramId}}'

  Scenario: Check if we are getting record of a particular programID
    Given User creates  GET Request with "ProgramId Parameter" for LMS API endpoint
    When User Send Https Request
    Then User receive HTTP 200 Ok Status code "displayed with required body details "

  Scenario: Check if we are getting record of a non-existing programID
    Given User creates  GET Request with "Non -existing ProgramId Parameter"
    When User Send Https Request
    Then User receive HTTP 200 Ok Status code "NULL BODY"

  Scenario: Check if we are getting record of a programID = 0
    Given User creates Request with ProgramID =0
    When User Send request for program ID set to 0
    Then User receive HTTP 200 Ok Status code "NULL BODY"

  Scenario: Check if we are getting record "programID = alphanumeric"
    Given User creates  GET Request for LMS API endpoint
    When User Send GET request for "alphanumeric programId"
    Then User receive status 400 -Bad request
