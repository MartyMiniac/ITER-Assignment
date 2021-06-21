package ch6.part17;

class Entity {
    public enum direction {
      NORTH,
      EAST,
      SOUTH,
      WEST
    }
    private int skin;
    private direction d;
    private int directionChange=1;
    private int[] pos={0,0};
    private int size;
    
    public Entity(int size) {
      this.d=Entity.direction.EAST;
      this.skin=0;
      this.size=size;
    } 

    public int[] move() {
      switch(this.d) {
        case NORTH:
          this.pos[0]--;
          break;
        case EAST:
          this.pos[1]++;
          break;
        case SOUTH:
          this.pos[0]++;
          break;
        case WEST:
          this.pos[1]--;
          break;
      }
      if(checkHittingBorder()) {
        changeDir();
      }
      return this.pos;
    }

    public int[] getPos() {
      return this.pos;
    }

    private void changeDir() {
      this.directionChange++;
      if(this.directionChange%4==0) {
        this.skin++;
      }
      this.d=Entity.direction.values()[this.directionChange%4];
      //System.out.println(this.d);
    }
    private boolean checkHittingBorder() {
      switch(this.d) {
        case NORTH:
          return this.pos[0]==this.skin;
        case EAST:
          return this.pos[1]==this.size-this.skin-1;
        case SOUTH:
          return this.pos[0]==this.size-this.skin-1;
        case WEST:
          return this.pos[1]==0;
      }

      return false;
    }
  }
