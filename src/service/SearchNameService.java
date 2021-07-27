package service;

import dao.SearchNameDao;
public class SearchNameService implements SearchNameInterface{

    private SearchNameDao sd;
    public SearchNameService(){
        sd=new SearchNameDao();
    }
    
    @Override
    public void search(String name) throws Exception{
        sd.search(name);
    }
       
}
