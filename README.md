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
