package com.junebatch.corejava.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NewTest {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(131587, 132615, 132622, 132640, 132138, 132140, 132192, 132220, 132245, 132266, 132268, 132275, 131789, 131807, 132330, 132351, 132348, 132363, 132379, 132377, 131896, 131906, 131904, 131914, 131912, 131917, 131937, 131955, 131952, 132542, 132029, 132559, 131567, 135185, 134177, 132672, 133210, 133212, 133223, 135325, 133803, 133812, 135389, 135392, 132932, 132944, 135075, 135081, 135085, 134644, 134136));

        HashSet<Integer> dbset = new HashSet<>(Arrays.asList(135392, 131567, 131587, 131789, 131807, 131896, 131904, 131906, 131912, 131914, 131917, 131937, 131952, 131955, 131972, 131974, 131976, 131978, 131980, 131982, 131984, 132029, 132138, 132140, 132192, 132220, 132245, 132266, 132268, 132275, 132330, 132348, 132351, 132363, 132377, 132379, 132542, 132559, 132615, 132622, 132640, 132672, 132932, 132944, 133210, 133212, 133223, 133803, 133812, 135081, 135185, 134177, 135325, 135389, 135075, 135085, 134644, 134136));


        List<Integer> contentCardIds = dbset.stream().filter(contentCardId -> !set.contains(contentCardId)).collect(Collectors.toList());

        System.out.println(contentCardIds);
        System.out.println("matched cards : " + contentCardIds.size());
    }
}
