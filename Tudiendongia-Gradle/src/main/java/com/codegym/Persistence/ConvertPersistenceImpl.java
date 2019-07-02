package com.codegym.Persistence;



import java.util.HashMap;
import java.util.Map;

public class ConvertPersistenceImpl implements GeneralPersistence{
    Map<String,String> dictionnary=new HashMap<>();
    {
        dictionnary.put("hello","xin chao");
        dictionnary.put("BYE","tam biet");
        dictionnary.put("one","1");
        dictionnary.put("ten","10");
    }

    @Override
    public String find(String name) {
        return dictionnary.get(name);
    }
}
