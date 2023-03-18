# Ambulance


## Title: Home Section (working)

Description:
The home section of the Ambulance app provides users with quick access to important features such as first aid information, booking an ambulance, and reminders to pay their bills.

Features:

1. First Aid: Users can access important first aid information from the home section of the app.
2. Book Ambulance: Users can quickly book an ambulance from the home section of the app.
3. Sticky Top Card: The top of the home section includes a sticky card with a reminder to pay bills and a CTA to pay now.

Layout:
The home section layout includes three main components:

1. First Aid: A button to access first aid information.
2. Book Ambulance: A button to quickly book an ambulance.
3. Sticky Top Card: A sticky card that includes a reminder to pay bills and a CTA to pay now.

Implementation:

1. First Aid: Clicking on the "First Aid" button will open a new page with important first aid information for common emergencies.
2. Book Ambulance: Clicking on the "Book Ambulance" button will open a form where users can input their location and request an ambulance.
3. Sticky Top Card: The sticky card will always be visible at the top of the home section, reminding users to pay their bills and providing a CTA to pay now. Clicking on the CTA will take users to a payment page.

Overall, the home section of the Ambulance app provides users with quick and easy access to important features that can help them in an emergency situation.


## The log in page

1. Two EditText fields for the user to enter their username and password.
2. An ImageView displaying a logo or an image related to the app.
3. Two buttons, one for logging in and another for signing up.


## Bottom Navigation 

In bottom_navigation.xml, the BottomNavigationView is defined as a com.google.android.material.bottomnavigation.BottomNavigationView. It has an ID of bottom_navigation, a width of match_parent, and a height of wrap_content. The app:menu attribute specifies the menu resource file to be used for the Bottom Navigation component, which is bottom_navigation_menu.xml.

In bottom_navigation_menu.xml,there are four menu items defined for the Bottom Navigation component, each with an ID, icon, and title. The icons and titles are specified using the android:icon and android:title attributes, respectively. The IDs are used to identify the selected menu item in the listener code.
