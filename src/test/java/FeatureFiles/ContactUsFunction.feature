Feature: Contact Us page



  Scenario Outline: Verify Sending message func.
  Given Navigate to automationPractice
  When Click on sing button and enter the username and password"FalcoN"
  Then User should login successfully
  Then Navigate to contactUsPage
  Then Click on the SubjectHeading options class
  Then Input a message
  |Message|<UserInput>|
  Then Send message
  Then Verify Successfully message

    Examples:
      | UserInput|
      | Msg1 |
      | Msg2 |
      | Msg3 |




#  This project is testing the http://automationpractice.com/
        #
        #  •	There are 3 functionalities.
        #  •	Test these 3 functionalities with cucumber – TestNG and Java.
        #  •	You should have Feature file, Step definition and page classes (page object model)
        #  •	Use explicit wait as much as you can try to not use Thread.sleep.
        #  •	Create your own steps in the feature file.
        #
        #
        #  Functionalities:
        #
        #  1)	Contact us
        #
        #  •	You should test this at least 3 different input (use scenario outline)
        #
        #  2)	Specials
        #  3)	Order history