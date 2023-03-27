package org.example;

 public class Winds_Hurricanes
    {
        private String direction;
        private String name;
        private int speed;
        private int Saffir;
        public Winds_Hurricanes(String direction, String name, int speed, int Saffir)
        {
        this.direction = direction;
        this.name = name;
        this.speed = speed;
        this.Saffir = Saffir;
        }
        public String getDirection()
        {
            return direction;
        }
        public void setDirection(String direction){
            this.direction = direction;    }
        public String getName() {
            return name;    }
        public void setName(String name){
            this.name = name;    }
        public int getSpeed() {
            return speed;    }
        public void setSpeed(int speed){
            this.speed = speed;    }
        public int getSaffir() {
            return Saffir;    }
        public void setSaffir(int Saffir){
            this.Saffir = Saffir;    }

        @Override
        public String toString() {
            return "Winds_Hurricanes{" +
                    "direction " + direction + '\''
                    + "name " + name +'\'' +
                    "speed" + speed +'\''
                    + "Saffir" + Saffir ;

        }
    }

