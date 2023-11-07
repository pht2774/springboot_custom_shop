<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

#C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

mainscreen.html  
++line 14: changing the title of the webapp to "Portable Gaming Console"
++line 21: change header to "PGC Inventory"

#D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

add about.html to describe the shop mission and product
add AboutUs controller to render about.html view when access from URL

about.html
++line 18: add link back to mainscreen.html

mainscreen.html
++line 18: add link to about.html

#E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

BootStrapData.java
++line 58: add condition to check part count and product count (both equal 0) before initializing demo inventory to prevent duplication
++line 61-103: add demo parts to outsourcedPartRepository
++line 112-121: add demo products to productRepository

#F. Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters

add purchaseSuccess.html template to indicate the customer has made a successful purchase
add purchaseFailed.html template to indicate the customer can't order due to out of stock item

mainscreen.html
++line 87-89: add "Buy Now" button as a html hidden form input that take the productId of tempProduct and pass the value to the BuyProductController

add BuyProductController.java that display either purchaseSuccess.html or purchaseFailed.html based on product.getInv()
++line 23-24: check to see if the product is in the database and set it to the product object
++line 25-31: check condition to see productIvn. If it is greater than 0, decree the productInv by one, save new productInv and display success message. Otherwise, display failure message.

#G. Modify the parts to track maximum and minimum inventory

Part.java
++line 24: enforce inventory minimum is 0
++line 25: add minIvn field to Part entity
++line 26: enforce inventory max to be positive
++line 27: add maxInv field to Part entity
++line 45-51: add a constructor that accept (String name, double price, int inv, int minIvn, int maxInv) to set up Part object
++line 66: add getter method to get minIvn from a Part object
++line 67: add setter method to set minIvn for a Part object
++line 68: add getter method to get maxIvn from a Part object
++line 69: add setter method to set maxIvn for a Part object
++line 129-131: add conditional check (isValid) to see if the user enters the correct inventory values (between minIvn and maxIvn inclusive)

BootStrapData.java
++line 67-68: set minInv and maxInv values for sample part 1
++line 78-79: set minInv and maxInv values for sample part 2
++line 89-90: set minInv and maxInv values for sample part 3
++line 100-101: set minInv and maxInv values for sample part 4
++line 111-112: set minInv and maxInv values for sample part 5

InhousePartForm.html
++line 26-27: add input for user to provide custom minimum and maximum number of an in-housed part's inventory

OutsourcedPartForm.html
++line 27-28: add input for user to provide custom minimum and maximum number of an out-sourced part's inventory

application.properties
++line 6: rename the database file to match the local persistence storage

AddOutsourcedPartController.java
++line 45: add conditional check to call isValid method for part entity to check user entered value
++line 46: use bindingResult.rejectValue to display error message to user if values entered is out of range

AddInhousePartController.java
++line 44: add conditional check to call isValid method for part entity to check user entered value
++line 45: use bindingResult.rejectValue to display error message to user if values entered is out of range

#H. Add validation for between or at the maximum and minimum fields

AddOutsourcedPartController.java
++line 48-50: add conditional check to see if the inventory is below the minimum value and display error message for outsourced parts
++line 51-53: add conditional check to see if the inventory is above the maximum value and display error message for outsourced parts

AddInhousePartController.java
++line 48-50: add conditional check to see if the inventory is below the minimum value and display error message for in-housed parts
++line 51-53: add conditional check to see if the inventory is above the maximum value and display error message for in-housed parts

EnufPartsValidator.java
++line 36: add conditional check for (p.getInv() - 1) < p.getMinIvn() to see if updating a product causes associated parts falling below minimum part inventory value
++line 37 - 38: add violation constrain to display error message in "inv" field 
