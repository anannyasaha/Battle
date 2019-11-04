import java.util.Random; //importing random to generate random number
public class CPUPlayer implements Player{   //implements the player interface
Monster monster;   //initiating a variable in monster type.
public CPUPlayer(Monster monster){  //constructor
  this.monster=monster;
}
public Monster getMonster(){        //to access the monster
  return this.monster;
}
public boolean hasLost(){        //to determine whether the player has lost
  if(this.monster.getHP()<=0){
    return true;}
    else return false;
  }
  public int chooseMove(){
    Random rand=new Random();  //generating a random number for the moves
    int move=0;
    while(move<=0){
      move=rand.nextInt(5); //making sure that the random number is between 0 and 5
    }
    System.out.println("Opponent used "+ move); //printing the opponents move
    return move;
  }
  public boolean isFasterThan(Player gamer){  // //comparing speed to determine which player is faster
    Monster temp;                   //declaring temporary monster
    temp=gamer.getMonster();       //keeping the monster of player gamer
    if(temp.getSpeed()<this.monster.getSpeed())  //comparing speed
    {
      return true;
    }
    else return false;
  }

    public void attack(Player gamer,int playermove){
      int power=0;
      float accuracy=0.0f;
      if(playermove==1){   //we take the monster's move power and accuracy
        power=this.monster.move1.power;
        accuracy=this.monster.move1.accuracy;
      }
      if(playermove==2){
        power=this.monster.move2.power;
        accuracy=this.monster.move2.accuracy;
      }
      if(playermove==3){
        power=this.monster.move3.power;
        accuracy=this.monster.move3.accuracy;
      }
      if(playermove==4){
        power=this.monster.move4.power;
        accuracy=this.monster.move4.accuracy;
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
      if(tempaccuracy>accuracy){//if the random nnumber is more thand accuracy of the
        //move then it is a miss.no damage is dealt.
        damageDealt=0;
        System.out.println("The move is a miss because accuracy is" +tempaccuracy);
        //printing a line where you tell the user when the move is missed
      }

      Monster temp;
      temp=gamer.getMonster(); //getting the monster
      int tempHp;
      tempHp=temp.getHP(); // previous hp.
      temp.setHp(tempHp-damageDealt); // now we have to update the new hp value after the damage.
    }


}
