class GoodDeal
{
    public static boolean goodDeal(double originalPrice, double salePrice){
        return salePrice < (0.75 * originalPrice); 
    }

    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected)
    {
		 boolean result = goodDeal(originalPrice, salePrice);
        if (result == expected) {
            System.out.println("PASS: goodDeal(" + originalPrice + ", " + salePrice + ") → " + result);
        } else {
            System.out.println("FAIL: goodDeal(" + originalPrice + ", " + salePrice + ") → " + result 
                               + " (expected " + expected + ")");
        }
    }

    public static void main(String[] args)
    {
        testGoodDeal(100, 50, true);
        testGoodDeal(100, 80, false);
        testGoodDeal(100, 75, false); 
        testGoodDeal(100, 20, true); 
    }
}
