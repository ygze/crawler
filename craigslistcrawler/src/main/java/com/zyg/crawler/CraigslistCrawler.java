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

            //find all class with name, result-info
            Elements elements = doc.getElementsByClass("result-info");
            int i = 0;
            for(Element element : elements){
                //get element of link to get url and title
                Element  link = element.getElementsByClass("result-title hdrlnk").first();
                String title = getElementText(link);
                String detail_url = link.attr("href");

               //get element of result-meta to get price, hood
               Element  result_meta = element.getElementsByClass("result-meta").first();
               String price = getElementText(result_meta.getElementsByClass("result-price").first());
               String hood =  getElementText(result_meta.getElementsByClass("result-hood").first());

               printInfo(title, price, detail_url, hood);

                if(i == 20) break;

                i++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * element:  element node
     * return:    if element is null, return "null"; otherwise, the content of the element
     */
    public static String getElementText(Element element){
        if(element == null )
            return "null";
        else
            return element.text();
    }

    public static void printInfo(String title, String price, String detail_url, String hood){
        System.out.println("(" + title + ",\n" + price + ",\n" +detail_url + ",\n" + hood+ ")");

    }
}
