public class ModuleFiveTesting {
    public enum GroceryItem { GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER }

    public static void main(String[] args) {
        GroceryItem userItem;

        /* Your code will be tested with GR_APPLES and other values for userItem
         */
        userItem = GroceryItem.GR_APPLES;

        /* Your solution goes here  */
        switch (userItem) {
            case GR_APPLES:
            case GR_BANANAS:
                System.out.println("Fruit");
                break;
            case GR_JUICE:
            case GR_WATER:
                System.out.println("Drink");
                break;
            default:
                break;

                /* Your solution goes here  */
                //        if (userItem == (GroceryItem.GR_APPLES ||
                //        GroceryItem.GR_BANANAS)) {
                //            System.out.println("Fruit");
                //        }

                //        if (userItem == (GroceryItem.GR_JUICE ||
                //        GroceryItem.GR_WATER)) {
                //            System.out.println("Drink");
                //        }
        }
    }
}
