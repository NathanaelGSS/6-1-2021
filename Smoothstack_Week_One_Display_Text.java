
package smoothstack_week_one_display_text;

/**
 *
 * @author Nathanael
 */
public class Smoothstack_Week_One_Display_Text {

    /**
     * @param args the command line arguments
     */
    static String ninePeriods = ".........";//Aminimum length that can be used evey time
    static String fourStars = "****";//Alength that justfies beig stored in a variable
    public static void main(String[] args) {
        System.out.println("1)");//Just printing what was requested, there's nothing fancy to comment on.
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println(fourStars);
        System.out.println(ninePeriods);
        System.out.println("2)");
        System.out.println(ninePeriods + ".");
        System.out.println(fourStars);
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
        System.out.println("3)");
        System.out.println("     *");
        System.out.println("    ***");
        System.out.println("   *" + fourStars);
        System.out.println("  " + fourStars + "***");
        System.out.println(ninePeriods + "..");
        System.out.println("4)");
        System.out.println(ninePeriods + "...");
        System.out.println("  " + fourStars + "***");
        System.out.println("   *" + fourStars);
        System.out.println("    ***");
        System.out.println("     *");
    }
    
}
