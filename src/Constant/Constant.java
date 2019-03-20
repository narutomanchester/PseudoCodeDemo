/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constant;

/**
 *
 * @author mac
 */
public class Constant {
    public static final int SIZE_PSEUDOCODE_CONTAINER_TEXT = 29;
    public static final String COLOR_DESCRIPTION_TEXT_PSEUDOCODE_CONTAINER = "F0E6EF";
    public static final String COLOR_PSEUDOCODE_TEXT_PSEUDOCODE_CONTAINER = "000000";
    public static final String COLOR_SELECTED_PSEUDOCODE_TEXT_PSEUDOCODE_CONTAINER = "ffffff";
    public static final String COLOR_SELECTED_PSEUDOCODE_VIEW_BACKGROUND = "000000";
    
    public static final String FONT_PSEUDOCODE_CONTAINER_TEXT = "Arial";
    public static final double TIME_DELAY = 0.5;
    public static final String COLOR_DESCRIPTION_VIEW_BACKGROUND = "d9513c";
    public static final String COLOR_PSEUDOCODE_VIEW_BACKGROUND = "fec515";
    public static final String[] QUICKSORT_PSEUDO_CODE = {
                                                        "   QuickSort(arr[], low, high)",
                                                        "       if (low < high)",
                                                        "           pi = partition(arr, low, high);",
                                                        "           QuickSort(arr, low, pi - 1);",
                                                        "           QuickSort(arr, pi + 1, high);"};
    public static final String QUICKSORT_PSEUDO_CODE_COMMENT = "/*pi is partitioning index, arr[pi] is now at right place*/";
}
