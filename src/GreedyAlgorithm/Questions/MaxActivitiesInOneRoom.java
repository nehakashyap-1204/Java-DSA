package GreedyAlgorithm.Questions;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxActivitiesInOneRoom {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};
        int maxMeetings = 1;
        int lastEnd = end[0];

        List<Integer> ans = new ArrayList<>();
        ans.add(0);

        for (int i = 1; i < end.length; i++) {
            if (start[i] > lastEnd) {
               maxMeetings++;
               ans.add(i);
               lastEnd = end[i];
            }
        }

        System.out.println("Max Meetimgs = " + ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }
    }
}
