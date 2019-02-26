Feature: SearchFeature
  This feature deals with search functionality of amazon.com

  Scenario: Search for specific product on Amazon.com
    Given User is on Amazon homepage
    When He search for "Nikon"
    And Sort results from highest price to lowest
    Then He select second product and click it for details
    And From page details check that product topic contains text “Nikon D3X”