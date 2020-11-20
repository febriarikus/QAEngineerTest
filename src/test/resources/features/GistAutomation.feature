Feature: Gist Automation
  As registered user
  I want to create,edit,delete a gist and see all my gist list
  So that I can run all of the above actions

  Scenario: Create a gist
    Given login as registered github user
    When I create new public gist
    Then I get new public gist on my list

    Scenario: Edit a gist
      Given login as registered github user
      When I edit file name of gist
      Then I get updated file name of gist
