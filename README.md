# Battle
 The battle system will
simulate a battle between a human player and a CPU player. Each player will have their 'monster' that
will battle one another using a selection of moves.
Upon examining this driver code, you will see that you need to implement the following classes:
 Player - represents players in general
  ◦ This class has no constructor
 HumanPlayer - selects moves by asking the user via console input
  ◦ Constructor arguments:
     ▪ monster (Monster) - the player's battling monster
 CPUPlayer - selects moves by generating a random number
  ◦ Constructor arguments:
     ▪ monster (Monster) - the player's battling monster
 Monster - represents a monster with four available moves
  ◦ Constructor arguments:
     ▪ name (String) - the name of the creature
     ▪ type (String) - the type of the creature
     ▪ hp (int) - the hit points of the creature
     ▪ speed (int) - the speed stat of the creature
     ▪ attack (int) - the attack stat of the creature
     ▪ defense (int) - the defense stat of the creature
     ▪ move1 (Move) - the first move
     ▪ move2 (Move) - the second move
     ▪ move3 (Move) - the third move
     ▪ move4 (Move) - the fourth move
 Move - represents a single move
  ◦ Constructor arguments:
     ▪ name (String) - the name of the move
     ▪ type (String) - the type of the move
     ▪ power (int) - the attack power of the move
     ▪ accuracy (float) - 0.0-1.0, representing the hit percentage for the move
The battle system first asks each player to choose their next move. The CPU player will select their move
randomly. The human player will present a list of moves to the user on the console, and ask the user to
select one (e.g. by entering a number 1-4) on the console. The battle system then selects which monster
is faster (a monster with a higher speed stat is faster). The faster monster uses their move first.
Then, determine if the move will hit the defending monster. Generate a random floating point number
between 0.0 and 1.0. If the number is greater than the accuracy of the move (impossible for some moves
that have accuracy 1.0), then the move is a miss and no damage is dealt to the defending monster.
Each move's attack is calculated using the following formula:

damageDealth = attacking monster's attack stat + attacking monster move's power - defending monster's defense stat

The calculated damage is then subtracted from the HP of the defending monster. If the HP becomes less
than (or equal to) zero, the monster is dead and cannot attack any further, including the move selected at
the beginning of this round.

If both monsters are still alive when the round has finished, the process repeats. When finished, the
driver class will display a message determining if the human player has won or lost the battle. 
