Feature: Prueba

  Background:
    * url 'https://reqres.in'

  Scenario: Get all users
    Given path '/api/users?page=2'
    When method get
    Then status 200
