package qa_automation_03.homeWork_07;
//https://www.codewars.com/kata/555086d53eac039a2a000083/train/java

public class Opposites_Attract {
    public static boolean isLove(final int flower1, final int flower2) {
        if ( flower1 % 2==0 && flower2 %2!=0 ) {
            return true;
        } else if (flower1 % 2!=0 && flower2 %2==0){
            return true;
        } else {return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLove(1,4));
        System.out.println(isLove(2,2));
        System.out.println(isLove(1,1));
        System.out.println(isLove(0,1));
    }
}
