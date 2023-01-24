Feature: Belly

  Scenario: a few cukes
    Given the child has 42 cucumbers in its belly
    When the child waits 2 hours
    Then the child's belly should growl
