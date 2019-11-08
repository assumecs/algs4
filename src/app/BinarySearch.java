package app;
import java.util.Arrays;

import utils.In;
import utils.StdIn;
import utils.StdOut;

/**
 * 二分查找法
 * 测试数据
 * https://algs4.cs.princeton.edu/11model/tinyW.txt
 * https://algs4.cs.princeton.edu/11model/tinyT.txt
 * https://algs4.cs.princeton.edu/11model/largeW.txt
 * https://algs4.cs.princeton.edu/11model/largeT.txt // 这个文件80+M
 */
public class BinarySearch {

  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) /2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if(key > a[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);
    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (rank(key, whitelist) < 0) {
        StdOut.println(key);
      }
    }
  }
}