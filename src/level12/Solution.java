package level12;

import java.awt.*;
import java.util.ArrayList;

public class Solution {
    static ArrayList<Point> points = new ArrayList<Point>();

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 100;
        point.y = 200;
        points.add(point);
    }

    static class Point {
        int x;
        int y;
    }
}
