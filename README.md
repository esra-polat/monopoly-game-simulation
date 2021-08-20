> The monopoly game simulation is coded in Java with object oriented approaches. It is a term project for my "Object Oriented Software Design" course. This is a group project and my group friend is @nurdenizcayli. The documents and diagrams we prepared while developing the project are in the design-detail folder.

####Design Class Diagram

![](https://github.com/esra-polat/monopoly-game-simulation/blob/master/design-details/monopoly-design-class-diagram.jpg)

####Domain Model

![](https://github.com/esra-polat/monopoly-game-simulation/blob/master/design-details/monopoly-domain-model.jpg)

####Sequence Diagram

![](https://github.com/esra-polat/monopoly-game-simulation/blob/master/design-details/monopoly-sequence-diagram-1.jpg)
![](https://github.com/esra-polat/monopoly-game-simulation/blob/master/design-details/monopoly-sequence-diagram-2.jpg)
![](https://github.com/esra-polat/monopoly-game-simulation/blob/master/design-details/monopoly-sequence-diagram-3.jpg)

###REQUİREMENT ANALYSİS DOCUMENT
####VISION
We imagine about creating the game called Monopoly. In the first iteration 
of the Monopoly, we aim to create a login page for the game. According to the 
game rules, we want to enter the number of squares and tax squares and we want 
the user/users to choose player's number between 2 and 8. After entering the 
number of the user, we expect the users to enter their name and starting money 
for the game. Then, game starts, board and their squares created. For the first 
iteration, the dice are tossed for each player that players start playing from go 
square and players moved on the board and their money decreases when they 
come to tax square. 
For the second iteration, we added electric tax square, water tax square, go 
to jail square, in jail square, community chest card square and chance card square. 
In the electric and water tax square, decreases the money of player. In go to jail 
square, player goes to jail square and in jail square, player tries to get out of 
prison. In community chest and chance card square, player plays the game 
according to the card he/she draws.
For the third iteration, we added free parking square, railroad square, 
purchase and rental square, bagdat avenue, beyoglu avenue, taksim avenue and 
istiklal avenue. In free parking square, player waits and does nothing. In railroad 
and avenue squares, if the player wants to buy this field, player buyes or waits in 
this field. 
####PROBLEM STATEMENT
In the first iteration, our aim is creating the general structure of the game 
and move the user’s on the board. When the users move on the board, there will 
be some optional cases that will be left to the initiative of the user. Therefore, the 
game will not automatically completely. For instance, buying a house, using a 
chance card when you are in the jail, etc. In the first iteration, there will be just 
moving on the board. However, during the game there will be optional cases.
In the second iteration, specific frames have been added to the game. For 
instance, electric tax square, water tax square, go to jail square, in jail square, 
community chest card square and chance card square. Now the game proceeds 
according to the rules in these squares.
In the third iteration, new specific frames have been added to the game. For 
instance, free parking square, railroad square, purchase and rental square, bagdat 
avenue, beyoglu avenue, taksim avenue and istiklal avenue. Now the all squares is 
added and game game is completed.
####SCOPE
The monopoly game has different kind of a squares in the board to provide 
the continuity the game. In the starting, a dice tournament happens and the order 
of the players is determined. Before starting the game, a desired amount of 
money is disbursed to the players. The players can use these money to buy 
avenues and rent them. During the game there will be many cases to reduce the 
money of the player and determine the winner. In spite of that, the player can 
earn money from the avenues and each time he/she pass the starting point. The 
players also pay tax for Utilities as avenues. When the player less money than the 
tax, he/she goes bankrupt and loses the game. Until a one player who is winner 
stands in the game and other ones go bankrupt, the game continues.
####SYSTEM CONSTRAİNT
Will run with in a Java IDE environment and therefore require no additional 
software to be installed on a client machine Will not provides a Graphical User 
interface.
####GLOSSARY OF TERMS 
**Dice**: It rolls the dice.
**Board**: Where the game is played on and which contains received number of 
squares.
**Square**: The location where the player is on and which are placed on the board.
**GoSquare**: The game starts this location.
**Login**: Part of received starting information in the game.
**MonopolyGame**: The game runs in this class.
**Player**: Person playing the game.
**ReqularSquare**: Unprocessed square.
**TaxSquare**: Part of received tax in the game.
**ElectricTaxSquare**: Part of received electric tax in the game.
**WaterTaxSquare**: Part of received water tax in the game.
**GoToJailSquare**: Player goes to jail square.
**InJailSquare**: Player tries to get out of prison.
**CommunityChestCardSquare**: Some squares on the board which are mostly about 
financial directions in the game.
**ChanceCardSquare**: Some squares on the board which contains some directions to 
change the flow of the game.
**FreeParkingSquare**: Player waits in this square.
**RailRoadSquare**: When players come this square, if the owner of the square exists, 
player pays rent to the owner. If there is no owner of the square, the player is 
asked if player wants to take the square, he or she pays price.
**PurchaseAndRentalSquare**: The location where the player purchase and rents 
squares.
**Bagdat/Beyoglu/Istiklal/Taksim Avenue:** House or hotel can be established in this 
square, the owner gets a rental income.
####GLOSSARY OF TERMS 
* Number of squares should be entered.
* Number of tax squares should be entered.
* Number of electric tax squares should be entered.
* Number of water tax squares should be entered.
* Number of community chest card squares should be entered.
* Number of chance card squares should be entered.
* Players number should be entered integer number between 2-8. 
* User enters the players’ names. 
* User enters the starting money. 
* Game starts. 
* Players start the game respectively. 
* Player’s money decreases if he/she comes to tax squares(electric, water tax).
* If the player enters the prison and has enough money, he/she pays the money and the money decreases.
* If the player comes to the location that has a chance card, the chance card is randomly selected.
* If the player comes to the location that has a community chest card, the community chest card is randomly selected.
* If the player comes to the free parking, he/she does not do anything.
* If the player comes to the railroad square and if the owner of the railroad square exist, player pays rent. If the owner of the railroad square does not exist and player wants to buy, player pays price of railroad square.
* If the player comes to one of the avenues (bagdat, beyoglu, taksim, istiklal) and if the owner of the avenue square exist, player pays rent. If the owner of the avenue square does not exist and player wants to buy, player pays price of avenue square. And finally, if the player wants to establish a house or hotel in the square and has enough money, he or she can.
* The game ends when one of the players drops the money.
