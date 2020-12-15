package com.example.group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.app.ActivityGroup;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.content.Intent;
import android.widget.TextView;

public class TabGroupActivity extends ActivityGroup implements OnClickListener {
    private static final String TAG = "TabGroupActivity";
    private Bundle mBundle = new Bundle(); // 声明一个包裹对象
    private LinearLayout ll_container;
    private TextView tv_first,tv_second, tv_third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_group);

        // 从布局文件中获取名叫ll_container的线性布局，用于存放内容视图
        ll_container = findViewById(R.id.ll_container);
        tv_first = findViewById(R.id.tv_first); // 获取第一个标签的线性布局
        tv_second = findViewById(R.id.tv_second); // 获取第二个标签的线性布局
        tv_third = findViewById(R.id.tv_third); // 获取第三个标签的线性布局
        tv_first.setOnClickListener(this); // 给第一个标签注册点击监听器
        tv_second.setOnClickListener(this); // 给第二个标签注册点击监听器
        tv_third.setOnClickListener(this); // 给第三个标签注册点击监听器
        mBundle.putString("tag", TAG); // 往包裹中存入名叫tag的标记串
        changeContainerView(tv_first); // 默认显示第一个标签的内容视图
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_first || v.getId() == R.id.tv_second || v.getId() == R.id.tv_third) {
            changeContainerView(v); // 点击了哪个标签，就切换到该标签对应的内容视图
        }
    }

    // 内容视图改为展示指定的视图
    private void changeContainerView(View v) {
        tv_first.setSelected(false); // 取消选中第一个标签
        tv_second.setSelected(false); // 取消选中第二个标签
        tv_third.setSelected(false); // 取消选中第三个标签
        v.setSelected(true); // 选中指定标签
        if (v == tv_first) {
            // 切换到第一个活动页面TabFirstActivity
            toActivity("first", TabFirstActivity.class);
        } else if (v == tv_second) {
            // 切换到第二个活动页面TabSecondActivity
            toActivity("second", TabSecondActivity.class);
        } else if (v == tv_third) {
            // 切换到第三个活动页面TabThirdActivity
            toActivity("third", TabThirdActivity.class);
        }
    }

    // 把内容视图切换到对应的Activity活动页面
    private void toActivity(String label, Class<?> cls) {
        // 创建一个意图，并存入指定包裹
        Intent intent = new Intent(this, cls).putExtras(mBundle);
        // 移除内容框架下面的所有下级视图
        ll_container.removeAllViews();
        // 启动意图指向的活动，并获取该活动页面的顶层视图
        View v = getLocalActivityManager().startActivity(label, intent).getDecorView();
        // 设置内容视图的布局参数
        v.setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        // 把活动页面的顶层视图（即内容视图）添加到内容框架上
        ll_container.addView(v);
    }
}