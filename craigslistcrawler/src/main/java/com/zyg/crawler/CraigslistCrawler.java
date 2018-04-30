package com.zyg.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CraigslistCrawler {
    public static String CRAIGSLIST_URL = "https://sfbay.craigslist.org/d/apts-housing-for-rent/search/apa";
    public static void main(String[] args) {
        Crawl(CRAIGSLIST_URL);
    }

    public static void Crawl(String url){
        try{

            Document doc = Jsoup.connect(CRAIGSLIST_URL).get();
            Elements elements = doc.getElementsByClass("result-info");
            int i = 0;
            for(Element element : elements){
                String title = element.child(2).text();
               String detail_url = element.child(2).attr("href");
               Element  result_meta = element.getElementsByClass("result-meta").first();
               String price = getElementText(result_meta.getElementsByClass("result-price").first());
               String hood =  getElementText(result_meta.getElementsByClass("result-hood").first());
                System.out.println("(" + title + ",\n" + price + ",\n" +detail_url + ",\n" + hood+ ")");

                if(i == 20) break;

                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String getElementText(Element element){
        if(element == null )
            return "null";
        else
            return element.text();
    }
}
