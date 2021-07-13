package org.monan.study.guava;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class GuavaCacheSample {

    public static void main(String[] args) {

        Cache<String,String> cache = CacheBuilder.newBuilder().maximumSize(1).build() ;
        System.out.println(cache.getIfPresent("hello")) ;

        try {
            String v = cache.get("hello", new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "word";
                }
            }) ;

            System.out.println(v) ;
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
