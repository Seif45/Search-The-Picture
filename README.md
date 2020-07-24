SEARCH THE PICTURE


1 Objectives

1. Getting Introduced to Multi-Dimensional Arrays in JAVA.
2. Becoming familiar with problem thinking using appropriate data structure.
3. Becoming familiar with JUnit Tests.


2 Problem Statement

Three weeks ago, MyOwnBusiness Inc. received an urgent call from the IIHF (International
Ice Hockey Federation) requesting a system to raise an alarm to the referee when there are too
many players from the same team inside the rink. The system will be composed of three parts:

• A digital camera in the ceiling to take photos of the rink every second.

• A software module to extract the position of each player from the photo taken by the
digital camera.

• A software module to count the number of players from the same team inside the hockey
rink.

The team has just finished the module to count the number of players inside the hockey
rink, so now it is time to implement the module to extract the players’ positions from the photo
taken by the digital camera.

The photo taken by the camera is given as a String[], where the x-th character of the y-th
element is the color of the 2 x 2 square whose upper-left corner is at (2*x, 2*y). Colors are
either uppercase letters (’A’-’Z’) or digits (’0’-’9’). Uppercase letters represent terrain features
(floor, chairs, spectators, etc.) and each digit X represents the color of the uniform used by the
X-th team.

Two squares A and B belong to the same object if and only if there exists a chain of squares
where the first square is A, the last square is B, each pair of consecutive squares in the chain
shares a common edge and all the squares in the chain have the same color. The position of
an object C is the center of its bounding box, where its bounding box is defined as smallest
axis-aligned box that contains all the object’s squares. An object’s area is defined as the sum
of the areas of all the squares that compose the object. An object is a player from the i-th
team if and only if it is colored with the digit i and its area is at least threshold.

Return a java.awt.Point[] containing all the players in the photo from the k-th team. Each
element should represent a single player and be formatted java.awt.Point(X,Y), where (X,
Y) is the center of the player’s bounding box, and X and Y have no extra leading zeros.
Sort the players in increasing order by x-coordinate. Sort players with the same x-coordinate
in increasing order by y-coordinate.


3 Constraints

• photo will contain between 1 and 50 elements, inclusive.

• Each element of photo will contain between 1 and 50 elements, inclusive.

• Each element of photo will contain the same number of characters.

• Each element of photo will contain only uppercase letters (’A’-’Z’) and digits (’0’-’9’).

• k will be between 0 and 9, inclusive.

• threshold will be between 1 and 10000, inclusive.

• You should handle empty/null image.
