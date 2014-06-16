package fergoman123.mods.fergotools.util.item;

public class UtilRecipe {

    public static final String[] pickaxeRecipe = new String[]{"xxx", " y ", " y "};
    public static final String[] shovelRecipe =  new String[]{"x", "y", "y"};
    public static final String[] axeRecipe = new String[]{"xx", "xy", " y"};
    public static final String[] hoeRecipe = new String[]{"xx", " y", " y"};
    public static final String[] swordRecipe = new String[]{"x", "x", "y"};

    public static final String[] bowRecipe = new String[]{" yx", "y x", " yx"};

    public static final String[] blockRecipe = new String[]{"xxx", "xxx", "xxx"};
    public static final String[] furnaceRecipe = new String[]{"xxx", "x x", "xxx"};

    public static final String[] helmetRecipe = new String[]{"xxx", "x x"};
    public static final String[] chestplateRecipe = new String[]{"x x", "xxx", "xxx"};
    public static final String[] leggingsRecipe = new String[]{"xxx", "x x", "x x"};
    public static final String[] bootsRecipe = new String[]{"x x", "x x"};

    public static class RecipeArray
    {
        public static String[] getPickaxeRecipe(){return UtilRecipe.pickaxeRecipe;}
        public static String[] getShovelRecipe(){return UtilRecipe.shovelRecipe;}
        public static String[] getAxeRecipe(){return UtilRecipe.axeRecipe;}
        public static String[] getHoeRecipe(){return UtilRecipe.hoeRecipe;}
        public static String[] getSwordRecipe(){return UtilRecipe.swordRecipe;}

        public static String[] getBowRecipe(){return UtilRecipe.bowRecipe;}

        public static String[] getBlockRecipe(){return UtilRecipe.blockRecipe;}
        public static String[] getFurnaceRecipe(){return UtilRecipe.furnaceRecipe;}

        public static String[] getHelmetRecipe(){return UtilRecipe.helmetRecipe;}
        public static String[] getChestplateRecipe(){return UtilRecipe.chestplateRecipe;}
        public static String[] getLeggingsRecipe(){return UtilRecipe.leggingsRecipe;}
        public static String[] getBootsRecipe(){return UtilRecipe.bootsRecipe;}
    }
}
