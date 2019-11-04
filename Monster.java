class Monster{
public String name;
public String type;
public int hp;
public int speed;         //class variables initiation
public int attack;
public int defense;
public Move move1;
public Move move2;
public Move move3;
public Move move4;
public Monster(String name,String type,int hp,int speed,int attack, //constructor
int defense,Move move1,Move move2,Move move3, Move move4){ //initialization
  this.name=name;
  this.type=type;
  this.hp=hp;
  this.speed=speed;
  this.attack=attack;
  this.defense=defense;
   this.move1=move1; //moves of the monster to fight other monster.It is a another class
  this.move2=move2;
   this.move3=move3;
  this.move4=move4;
}
int getHP(){   //accessor of HP
  return this.hp;
}
String getName(){  //Accessor of name
  return this.name;
}
int getAttack(){   //Accessor of attack power
  return this.attack;
}
int getDefense(){   //Accessor of defense power
  return this.defense;
}
void setHp(int hp){
  this.hp=hp;    //Mutator of HP
}
int getSpeed(){  //accessor of speed
  return this.speed;
}

}
