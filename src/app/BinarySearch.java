package app;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

  @SuppressWarnings("deprecated")
  public static void main(String[] args) {
    int[] whitelist = In.readInts(args[0]);
    In in = new In(args[1]);
    Arrays.sort(whitelist);
    while (in.hasNextLine()) {
      int key = Integer.parseInt(in.readLine());
      if (rank(key, whitelist) < 0) {
        StdOut.println(key);
      }
    }
  }

  @SuppressWarnings("deprecated")
  public static void mainOld(String[] args) {
    int[] whitelist = In.readInts(args[0]);
    Arrays.sort(whitelist);
    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (rank(key, whitelist) < 0) {
        StdOut.println(key);
      }
    }
  }

  public static void mainNew(String[] args) {
    // int[] whitelist = In.readInts(args[0]);
    int[] whitelist = {84, 48, 68, 10, 18, 98, 12, 23, 54, 57, 33, 16, 77, 11, 29};
    List<Integer> src = Arrays.asList(23, 50, 10, 99, 18, 23, 98, 84, 11, 10, 48, 77, 13, 54, 98, 77, 77, 68);
    Iterator<Integer> iter = src.iterator();
    Arrays.sort(whitelist);
    while (iter.hasNext()) {
      int key = iter.next();
      if (rank(key, whitelist) < 0) {
        StdOut.println(key);
      }
    }
  }

}