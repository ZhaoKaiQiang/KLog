package com.socks.sample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.socks.library.KLog;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_MSG = "KLog is a so cool Log Tool!";
    private static final String JSON = "{\"menu\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"tag\":\"其他\"}";
    private static final String JSON_LONG = "[{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},{\"中国食谱\":[\"上海醉蟹\",\"北京锅烧鸡\",\"川式凉拌豇豆\",\"清真酱牛肉\"],\"国外食谱\":[\"泰式柠檬肉片\",\"鸡柳汉堡\",\"蒸桂鱼卷 \"],\"更多\":{\"中式\":[\"南\",\"北\",{\"地方\":[\"小吃\",\"大餐\"]},\"更多选择\"]}},{\"菜谱分类\":[\"上海菜\",\"贵州菜\",\"潮汕菜\",\"云南菜\",\"东北菜\",\"安徽菜\",\"广东菜\",\"浙江菜\",\"湖南菜\"]},\"其它\"]";
    private static final String TAG = "KLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void log(View view) {
        KLog.v();
        KLog.d();
        KLog.i();
        KLog.w();
        KLog.e();
        KLog.a();
    }

    public void logWithMsg(View view) {
        KLog.v(LOG_MSG);
        KLog.d(LOG_MSG);
        KLog.i(LOG_MSG);
        KLog.w(LOG_MSG);
        KLog.e(LOG_MSG);
        KLog.a(LOG_MSG);
    }

    public void logWithTag(View view) {
        KLog.v(TAG, LOG_MSG);
        KLog.d(TAG, LOG_MSG);
        KLog.i(TAG, LOG_MSG);
        KLog.w(TAG, LOG_MSG);
        KLog.e(TAG, LOG_MSG);
        KLog.a(TAG, LOG_MSG);
    }

    public void logWithNull(View view) {
        KLog.v(null);
        KLog.d(null);
        KLog.i(null);
        KLog.w(null);
        KLog.e(null);
        KLog.a(null);
    }

    public void logWithJson(View view) {
        KLog.json(JSON);
    }

    public void logWithLongJson(View view) {
        KLog.json(JSON_LONG);
    }

    public void logWithJsonTag(View view) {
        KLog.json(TAG, JSON);
    }

    public void logWithFile(View view) {
        KLog.file(Environment.getExternalStorageDirectory(), JSON_LONG);
        KLog.file(TAG, Environment.getExternalStorageDirectory(), JSON_LONG);
        KLog.file(TAG, Environment.getExternalStorageDirectory(), "test.txt", JSON_LONG);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_github:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ZhaoKaiQiang/KLog")));
                break;
            case R.id.action_csdn:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.csdn.net/zhaokaiqiang1992")));
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}
