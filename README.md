#  VOIS-Automation_Assesment_Task1

## Introduction

This project includes automated test scripts for the below VOIS assesment task:
## Task Description:
### Scenario1:
-	Open amazon link “https://www.amazon.com/” then type " car accessories".
-	Select the first Item.
-	Add item to the cart.
-	Go to the cart and check that item is added successfully.
### Scenario2:
-	Open today's deals.
-	from the left side filters select "Headphones" and "grocery".
-	from the discount part choose "10% off or more".
-	go to the fourth page then select any item and add it to the cart.
## Features:
-	Allure Report generated automatically after finishing test.
-	DataDriven.
-	Screenshot in case of faliure.

## General Notes:
-	Cookies added before the execution of every method to handle captcha, so kindly Update the cookie before run the test as its is expired sometimes.
-	In scenario2.It is required to go to the fourth page then select any item and add it to the cart, but the current page has 2 pages only not four pages so the test navigate to the second page.
-	In scenario2. Test is handled to add products to cart that have the following specifications only (has add to cart button in its page, available to be delivered)

