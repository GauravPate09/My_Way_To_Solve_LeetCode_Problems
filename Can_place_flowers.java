package org.example.My_Way_To_Solve_LeetCode_Problems;

public class Can_place_flowers {
//    You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
//    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
//    Example 1:
//    Input: flowerbed = [1,0,0,0,1], n = 1
//    Output: true
//    Example 2:
//    Input: flowerbed = [1,0,0,0,1], n = 2
//    Output: false

        public static boolean canPlaceFlowers(int[] flowerbed, int n) {

            int counter=0;
            if(flowerbed.length==1 && flowerbed[0]==0){
                counter++;
            }
            for (int i = 0; i < flowerbed.length - 1; i++) {

                if(i==0 && flowerbed[i]==0){
                    if (flowerbed[i + 1] == 0) {
                        counter++;
                        flowerbed[i] = 1;
                    }
                }
                if (i>=1 && flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        counter++;
                        flowerbed[i] = 1;
                    }
                    if(i+1 ==flowerbed.length-1 && flowerbed[i]==0 && flowerbed[i+1]==0 )
                    {
                        counter++;
                    }
                }
            }
            //System.out.println(counter);
            return counter >= n ? true : false;
        }

    public static void main(String[] args) {
        int[] flowerbed ={1,0,0,0,1};

       Boolean t = canPlaceFlowers(flowerbed,2);
        System.out.println(t);
    }
}


