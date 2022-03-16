Feature: Validation of Adactin Hotel Booking ID

  Background: 
    Given User launch Adactin Hotel Web Application
    Then Login Page is diplayed

  @Reg @Smoke
  Scenario: TC01_Validation of Adactin Hotel Login
    When User Enter Valid UserName and Password
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed

  @Smoke @Sanity
  Scenario: TC02_Validation of Adactin Hotel Search Hotel
    When User Enter Valid UserName and Password
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed
    When User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom
    And User Clicks Search Button

  @Sanity @Smoke
  Scenario: TC03_Validation of Adactin Hotel Book A Hotel
    When User Enter Valid UserName and Password
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed
    When User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom
    And User Clicks Search Button
    Then User Verify Select Hotel Page is Displayed
    When User Click Radio Button And User Click Continue
    Then User Verify Book a Hotel Page is Displayed

  @Sanity @Smoke @Reg
  Scenario: TC04_Validation of Adactin Hotel Booking Order Id
    When User Enter Valid UserName and Password
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed
    When User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom
    And User Clicks Search Button
    Then User Verify Select Hotel Page is Displayed
    When User Click Radio Button And User Click Continue
    Then User Verify Book a Hotel Page is Displayed
    When User Enter Valid FirstName, LastName and BillingAddress
    When User Enter Valid CreditCardNo and Select CardType , Month, Year and Enter Valid CVVNumber
    And User Click Book Now Button
    Then User Verify Booking Confirmation Page is Displayed and Confirmation Order ID is Showned

  @Reg @Smoke
  Scenario: TC05_Validation of Adactin Hotel Booking Order Id With WebTable
    When User Enter Valid UserName and Password With DataTable
      | Andrew07 |
      | 1283YR   |
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed
    When User Enter Valid Location,Hotels, RoomType, NumberOfRooms, CheckInDate, CheckOutDate, AdultPerRoom and ChildrenPerRoom With DataTable
      | Paris     | Hotel Sunshine | Deluxe     |
      | 3 - Three | 13/03/2022     | 15/03/2022 |
      | 4 - Four  | 2 - Two        |            |
    And User Clicks Search Button
    Then User Verify Select Hotel Page is Displayed
    When User Click Radio Button And User Click Continue
    Then User Verify Book a Hotel Page is Displayed
    When User Enter Valid FirstName, LastName and BillingAddress With DataTable
      | FirstName       | Andrew                 |
      | LastName        | Vimal                  |
      | Billing Address | Choolaimedu,Chennai-10 |
    When User Enter Valid CreditCardNo and Select CardType , Month, Year and Enter Valid CVVNumber With DataTable
      | CardNo           | CardType         | Month | Year | CVV  |
      | 9998765678654343 | VISA             | May   | 2022 | 5678 |
      | 4567898765434567 | American Express | June  | 2022 | 6789 |
    And User Click Book Now Button
    Then User Verify Booking Confirmation Page is Displayed and Confirmation Order ID is Showned

  @Smoke @Sanity
  Scenario Outline: TC_06 Validation Of Adactin Website using Multiple Datas
    When User Enter Valid "<UserName>" and "<Password>"
    And User Clicks Login Button
    Then User Verify  Search Hotel Page is displayed
    When User Enter Valid "<Location>","<Hotels>", "<RoomType>", "<NumberOfRooms>", "<CheckInDate>", "<CheckOutDate>", "<AdultPerRoom>" and "<ChildrenPerRoom>"
    And User Clicks Search Button
    Then User Verify Select Hotel Page is Displayed
    When User Click Radio Button And User Click Continue
    Then User Verify Book a Hotel Page is Displayed
    When User Enter Valid "<FirstName>", "<LastName>" and "<BillingAddress>"
    When User Enter Valid "<CreditCardNo>" and Select"<CardType>" , "<Month>", "<Year>" and Enter Valid "<CVVNumber>"
    And User Click Book Now Button
    Then User Verify Booking Confirmation Page is Displayed and Confirmation Order ID is Showned

    Examples: 
      | UserName | Password | Location  | Hotels         | RoomType     | NumberOfRooms | CheckInDate | CheckOutDate | AdultPerRoom | ChildrenPerRoom | FirstName | LastName | BillingAddress            | CreditCardNo     | CardType         | Month    | Year | CVVNumber |
      | Andrew07 | 1283YR   | Paris     | Hotel Sunshine | Super Deluxe | 3 - Three     | 12/03/2022  | 14/03/2022   | 4 - Four     | 3 - Three       | Vimal     | Andrew   | Choolaimedu,Chennai-10    | 9222234567890987 | American Express | December | 2022 |      2341 |
      | Andrew07 | 1283YR   | Sydney    | Hotel Creek    | Deluxe       | 2 - Two       | 13/03/2022  | 15/03/2022   | 3 - Three    | 2 - Two         | Andrew    | Vimal    | Nungambakam,Chennai-10    | 9222234567890344 | VISA             | March    | 2022 |      2333 |
      | Andrew07 | 1283YR   | Melbourne | Hotel Hervey   | Double       | 3 - Three     | 14/03/2022  | 16/03/2022   | 2 - Two      | 1 - One         | Venky     | Kumar    | AnnaNagar,Chennai-10      | 9222234567890555 | Master Card      | April    | 2022 |      2344 |
      | Andrew07 | 1283YR   | London    | Hotel Cornice  | Standard     | 1 - One       | 15/03/2022  | 17/03/2022   | 1 - One      | 4 - Four        | Herbert   | Raj      | ValluvarKottam,Chennai-10 | 9222234567890666 | American Express | May      | 2022 |      2355 |
