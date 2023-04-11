package com.assys.assys;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class TokenTest {
    @Test
    public static void main(String[] args) throws IOException {

        String name[] = {"张吉惟","林国瑞","林玫书","林雅南","江奕云","刘柏宏","阮建安","林子帆","夏志豪","吉茹定","李中冰",
        "黄文隆","谢彦文","傅智翔","洪振霞","刘姿婷","荣姿康","吕致盈","方一强","黎芸贵","郑伊雯","雷进宝","吴美",
        "吴心真","王美珠","郭芳天","李雅惠","陈文婷","曹敏侑","王依婷","陈婉璇","吴美玉","蔡依婷","郑昌梦","林家纶","黄丽昆","李育泉","黄芸欢",
        "吴韵如","李肇芬","卢木仲","李成白","方兆玉","刘翊惠","丁汉臻","吴佳瑞","舒绿珮","周白芷","张姿妤","张虹伦","周琼玫","倪怡芳","郭贵妃",
        "杨佩芳","黄文旺","黄盛玫","郑丽青","许智云","张孟涵","李小爱","王恩龙","朱政廷","邓诗涵","陈政倩","吴俊伯","阮馨学","翁惠珠","吴思翰",
        "林佩玲","邓海来","陈翊依","李建智","武淑芬","金雅琪","赖怡宜","黄育霖","张仪湖","王俊民","张诗刚","林慧颖","沈俊君","陈淑妤","李姿伶",
        "高咏钰","黄彦宜","周孟儒","潘欣臻","李祯韵","叶洁启","梁哲宇","黄晓萍","杨雅萍","卢志铭","张茂以","林婉婷","蔡宜芸","林珮瑜","黄柏"};

        String end = "insert into user(username,password,balance,phone,address,birthDate,role) \n" +
                "VALUES";
        String gender[] = {"男","女"};

        String city [] ={"新疆维吾尔自治区","上海市","云南省大理市","河南省郑州市","江西省南昌市","江西省南昌市","辽宁省大连市","内蒙古自治区"};

        for (int i = 0; i < 1000; i++) {
            String temp = "(";
            Random ran = new Random();
            int name_i = ran.nextInt(name.length-1);
            temp += "\""+name[name_i]+"\",";

            temp += "\"123456\",";

            double balance = ran.nextInt(500);
            temp += "\""+balance+"\",";

            temp += "\""+random()+"\",";

            temp += "\""+gender[ran.nextInt(2)]+"\",";

            int city_i = ran.nextInt(city.length-1);
            temp += "\""+city[city_i]+"\",";

            temp += "\"2001-9-4\",";

            temp +="3";

            temp +="),\n";
            end += temp;


        }

        fileWriterMethod("C:\\Users\\曹旸华\\Desktop\\数据.txt",end);
    }

    @Test
    public static String random() {
        Random random = new Random();
        String res = "1";
        for (int i = 0; i < 10; i++) {
            res += random.nextInt(9);
        }
        return res;
    }

    @Test
    public static void fileWriterMethod(String filepath, String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filepath)) {
            fileWriter.append(content);
        }
    }

    @Test
    public void jwtGet() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("name", "lisu");
        String jwt = Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, "test")//签名算法
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis()))//设置令牌有效期为一个小时
                .compact();
        System.out.println(jwt);
    }

    @Test
    public void testParseJwt() {
        Claims claims = Jwts.parser()
                .setSigningKey("test")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoibGlzdSIsImlkIjoxLCJleHAiOjE2ODA2NzE5OTJ9.9JelY-XHbkRNZm4L0jcuS7oYFP6A7__ml6HxsKj2Rv4")
                .getBody();
        System.out.println(claims);
    }
}
