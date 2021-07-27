package controller;

import service.SearchNameService;

public class SearchAllController {
    
    private SearchNameService ss;
    
    SearchAllController (){
        ss=new SearchNameService();
    }
    
    public  void search(String s) throws Exception{
        ss.search(s);
    }
}
