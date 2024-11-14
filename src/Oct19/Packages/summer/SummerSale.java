package Oct19.Packages.summer;

public class SummerSale {

       public String offer(){
            return "Summer sale";

        }
        private String show(){
           return "Static method";

        }
        public String show2(){
            String s = show();
            return s;
        }
    }

