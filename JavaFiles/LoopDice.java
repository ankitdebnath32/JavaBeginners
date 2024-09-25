package JavaFiles;

public class LoopDice {
    public static void main(String[] args) {
        int dice = 1;
        System.out.println(dice);
        
        while (dice <=6){
            if(dice<6){
                System.out.println("No Yatzy.");
            }else{
                System.out.println("Yatzy!");
            }

            dice = dice + 1;
            System.out.println(dice);
        }
    }

}
