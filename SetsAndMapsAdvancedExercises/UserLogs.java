package SetsAndMapsAdvancedExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //username ip    messagesCount
        Map<String,Map<String,Integer>>userinfo = new TreeMap<>();

        String line="";

        while (!"end".equals(line=scanner.nextLine())){
            String[]tokens = line.split("\\s+");
            String ip = tokens[0].split("=")[1];
            String username = tokens[2].split("=")[1];

            userinfo.putIfAbsent(username,new LinkedHashMap<>());
            userinfo.get(username).putIfAbsent(ip,0);
            userinfo.get(username).put(ip,userinfo.get(username).get(ip)+1);
        }
        for (Map.Entry<String,Map<String,Integer>>entry:userinfo.entrySet()){
            System.out.println(entry.getKey()+":");
            Map<String,Integer>integerMap = entry.getValue();
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String,Integer>innerEntry: integerMap.entrySet()) {
                String ipInfo = String.format("%s => %d", innerEntry.getKey(), innerEntry.getValue());
                sb.append(ipInfo);
                sb.append(", ");
            }
            String res = sb.substring(0,sb.length()-2);
            System.out.println(res+ ".");

        }
    }
}



