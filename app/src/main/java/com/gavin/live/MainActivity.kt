package com.gavin.live

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStartButton.text = "AAAA"

      btnStartButton.setOnClickListener { v: View ->
          run {
              openActivity("com.starscape.starscape");
          }
      }

//        btnStartButton.setOnClickListener {
//            v ->
//            run {
//                val id = v.id
//                start();
//            }
//        }
    }


    private fun start(){
        val launchIntentForPackage = this.packageManager.getLaunchIntentForPackage("com.starscape.starscape")
        if(launchIntentForPackage == null){
            Toast.makeText(this, "null" , Toast.LENGTH_SHORT).show()
            return
        }
        launchIntentForPackage.flags = Intent.FLAG_ACTIVITY_NEW_TASK;
        this.startActivity(launchIntentForPackage);
    }


    private fun openActivity(appName: String) {
        // 获取包管理器
        val manager = packageManager
        // 指定入口,启动类型,包名
        val intent = Intent(Intent.ACTION_MAIN) //入口Main
        intent.addCategory(Intent.CATEGORY_LAUNCHER) // 启动LAUNCHER,跟MainActivity里面的配置类似
        intent.setPackage(appName) //包名
        //查询要启动的Activity
        val apps = manager.queryIntentActivities(intent, 0)
        if (apps.size > 0) { //如果包名存在
            val ri = apps[0]
            // //获取包名
            val packageName = ri.activityInfo.packageName
            //获取app启动类型
            val className = ri.activityInfo.name
            //组装包名和类名
            val cn = ComponentName(packageName, className)
            //设置给Intent
            intent.component = cn
            //根据包名类型打开Activity
            startActivity(intent)
        } else {
            Toast.makeText(this, "找不到包名;$appName", Toast.LENGTH_SHORT).show()
        }
    }
}