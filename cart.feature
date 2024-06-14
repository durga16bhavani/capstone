Feature:JPetStore Cart Functionality

Scenario:Add items to the cart
   Given The user is on the JPetStore SignInpage
   When The user signs in with username and password
   And The user clicks on the cart image
   Then The user should be redirected to the view cart page
   When The user clicks on Fish
   Then The user should redirected to the fish category page
   When The user clicks on product id
   Then The user should be redirected to the items page of that product
   When The user clicks on add to cart button which is next to item price
   Then The product should be added to the cart and redirected to view cart page
