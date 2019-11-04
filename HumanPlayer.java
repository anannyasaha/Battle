import java.util.Scanner;  //importing scanner to take input.
import java.util.Random;   //importing random to generate random number
public class HumanPlayer implements Player{    //implements the player interface
Monster monster;
//public DoublyLinkedList movelist;  //initiating a variable in monster type.
public HumanPlayer(Monster monster){
  this.monster=monster;  //constructor
}
public Monster getMonster(){
  return this.monster;   //to access the monster
}
public boolean hasLost(){   //to determine whether the player has lost
  if(this.monster.getHP()<=0){
    return true;}
    else return false;
  }
  public int chooseMove(){
    Scanner input = new Scanner(System.in);  //initialising the scanner
    int number=5;
    while(number>4||number<0){      //it makes sure that user gives the right input
    System.out.println("                  Select your move    ");
    System.out.println("Move1 = Name-Scratch,Type-Normal,Power-40, Accuracy-1.0");
    System.out.println("Move2 =Name-Ember, Type-Fire,Power-40, Accuracy-1.0");
    System.out.println("Move3 = Name-Peck, Type-Flying,Power-35, Accuracy-1.0");
    System.out.println("Move4 = Name-Fire Spin,Type-Fire, Power-35,Accuracy-0.85");
     number=input.nextInt();   //taking user input
    if(number>4||number<0){
      System.out.print("Invalid choice.Type another number between 1-4");
    }
  }
    return number;
  }
  public boolean isFasterThan(Player gamer){   //comparing speed to determine which player is faster
    Monster temp;                //declaring temporary monster
    temp=gamer.getMonster();       //keeping the monster of player gamer
    if(temp.getSpeed()<this.monster.getSpeed())   //comparing speed
    {
      return true;
    }
    else return false;
  }
  public void attack(Player gamer,int playermove){
    int power=0;
    float accuracy=0.0f;

    if(playermove==1){           //we take the monster's move power and accuracy
      power=this.monster.move1.power;
      accuracy=this.monster.move1.accuracy;
      //gamer.movelist.insert(move1,1);
    }
    if(playermove==2){
      power=this.monster.move2.power;
      accuracy=this.monster.move2.accuracy;
    //  gamer.movelist.insert(move2,2);
    }
    if(playermove==3){
      power=this.monster.move3.power;
      accuracy=this.monster.move3.accuracy;
    //  gamer.movelist.insert(move3,3);
    }
    if(playermove==4){
      power=this.monster.move4.power;
      accuracy=this.monster.move4.accuracy;
    //  gamer.movelist.insert(move4,4);
    }
    int damageDealt;
    damageDealt=this.monster.getAttack()+power-gamer.getMonster().getDefense();
    //following the formula and accessing attack of this monster and defense of
    //defender monster
    Random rand=new Random();
    float rangeMin = 0.0f;
    float rangeMax = 1.0f;
    float tempaccuracy=rangeMin + (rangeMax - rangeMin)*rand.nextFloat();
    //generating a random accuracy in between 0.0 and 0.1

    if(tempaccuracy>accuracy){ //if the random nnumber is more thand accuracy of the
      //move then it is a miss.no damage is dealt.
      damageDealt=0;
      System.out.println("The move is a miss because accuracy is" +tempaccuracy);
      //printing a line where you tell the user when the move is missed
    }

    Monster temp;
    temp=gamer.getMonster(); //getting the monster
    int tempHp;
    tempHp=temp.getHP(); // previous hp.
    temp.setHp(tempHp-damageDealt); // now we have to update the new hp value
    // after the damage.
  }


}
