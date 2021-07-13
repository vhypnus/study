package org.monan.study.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

public class CaffeineSample {

    public static void main(String[] args) {

        Cache<String,String> cache = Caffeine.newBuilder().maximumSize(10_000).build();

    }
}
