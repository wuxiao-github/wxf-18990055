package com.example.shopping.bean;

import com.example.shopping.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "运动衫", "运动卫衣", "运动卫衣", "休闲裤", "工装裤", "运动长裤","帆布鞋","高帮帆布鞋"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "CONVERSE匡威官方 连帽套头运动衫 男款",
            "CONVERSE匡威官方 连帽运动卫衣男款",
            "CONVERSE匡威官方 字母印花套头连帽衫男子运动卫衣",
            "CONVERSE匡威官方 运动慢跑裤休闲裤 男款",
            "CONVERSE匡威官方潮流拼接慢跑男子运动裤工装风休闲裤",
            "CONVERSE匡威官方 Star Chevron 运动长裤 男款",
            "CONVERSE匡威官方 经典款 休闲男女帆布鞋 ",
            "CONVERSE匡威官方 Chuck 70高帮休闲百搭帆布鞋 湖水蓝"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {888, 999, 999, 899, 698, 688,655,888};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.yifu1_s, R.drawable.yifu2_s, R.drawable.yifu3_s,
            R.drawable.kuzi1_s, R.drawable.kuzi2_s, R.drawable.kuzi3_s,
            R.drawable.xiezi1_s, R.drawable.xiezi2_s,
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.yifu1, R.drawable.yifu2, R.drawable.yifu3,
            R.drawable.kuzi1, R.drawable.kuzi2, R.drawable.kuzi3,
            R.drawable.xiezi1, R.drawable.xiezi2,
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
