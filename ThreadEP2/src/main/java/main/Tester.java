/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author MartinLodahl
 */


public class Tester {

    public List<Group> getData() throws Exception {

        ArrayList<String> urlsToUse = new ArrayList();
        BlockingQueue<Document> producedDocuments;
        ExecutorService pool = Executors.newFixedThreadPool(10);
        List<Future<Document>> futureList = new ArrayList();
        List<Group> groups = new ArrayList();

        urlsToUse.add("http://www.alfen.me/CA1/");

        for (int i = 0; i < urlsToUse.size(); i++) {
            String url = urlsToUse.get(i);
            Callable<Document> call = () -> {
                final Document doc = Jsoup.connect(url).get();
                return doc;
            };

            Future<Document> fs = pool.submit(call);
            futureList.add(fs);
        }

        for (int i = 0; i < futureList.size(); i++) {
            Group g = new Group(futureList.get(i).get().select("div#group").text(), futureList.get(i).get().select("div#class").text(), futureList.get(i).get().select("div#authors").text());
            groups.add(g);
        }

        shutdownAndAwaitTermination(pool);
        return groups;
    }

    static void shutdownAndAwaitTermination(ExecutorService pool) throws InterruptedException {
        pool.shutdown(); // Disable new tasks from being submitted
        // Wait a while for existing tasks to terminate
        if (!pool.awaitTermination(8, TimeUnit.SECONDS)) {
            pool.shutdownNow();
        }
    }
}
