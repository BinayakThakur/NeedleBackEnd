package com.needle.utlis;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class SearchUtils {



    public String searchSingleQuery(String table, String field, String search){
        String sql="Select * from "+table+"  where "
                +field+" like '"+search+"';";
        System.out.println(sql);
        return sql;
    }
    public String searchMultiFieldQuery(String table , List<String> fields, List<String> search){
        String multiCondition="";
        Integer index=0;
        for(String i : fields){
            multiCondition=multiCondition+" "+i+" like '"+search.get(index)+"' and ";
            index++;
        }
        multiCondition=multiCondition.substring(0,multiCondition.length()-5);
        String sql="Select * from "+table+"  where "
                +multiCondition+";";
        System.out.println(sql);
        return sql;

    }
    public String searchMultiFieldQueryOr(String table , List<String> fields, List<String> search){
        String multiCondition="";
        Integer index=0;
        for(String i : fields){
            multiCondition=multiCondition+" "+i+" like '"+search.get(index)+"' or ";
            index++;
        }
        multiCondition=multiCondition.substring(0,multiCondition.length()-4);
        String sql="Select * from "+table+"  where "
                +multiCondition+";";
        System.out.println(sql);
        return sql;

    }

}
