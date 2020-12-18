package com.example.a18990129.bean;

import com.example.a18990129.R;

import java.util.ArrayList;

public class GoodsInfo2 {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo2() {
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
            "小米10", "Redmi ", "荣耀","OPPO","HUWEI P30 Pro ", "魅族","realme ","iphone"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "小米10 8G+512GB 零度白 SA|NSA双模(5G)",
            "Redmi 256G 黑色 全网通5G手机",
            "荣耀  16GB+512GB 亮白色 SA|NSA双模(5G)",
            "OPPO 8+256GB 星露白 SA|NSA双模(5G)",
            "HUWEI P30 Pro 30S 8+256GB 蝶羽红 SA|NSA双模(5G)",
            "魅族 8+128GB 星砖蓝  65w快充",
            "realme 8+256GB 幻梦白 65w快充",
            "iphone 8+256GB 松深入墨 4500mA"

    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {7388, 7599, 6999, 2399,2699, 3188,3199,3999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.xiaomi_s, R.drawable.hongmi_s, R.drawable.ronyao_s,R.drawable.oppo_s,
            R.drawable.huawei_s, R.drawable.meizu_s, R.drawable.realme_s,R.drawable.iphone_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.xiaomi, R.drawable.hongmi, R.drawable.ronyao,R.drawable.oppo,
            R.drawable.huawei, R.drawable.meizu, R.drawable.realme,R.drawable.iphone
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo2> getDefaultList() {
        ArrayList<GoodsInfo2> goodsList = new ArrayList<GoodsInfo2>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo2 info = new GoodsInfo2();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}//These codes are from Peter Pang.