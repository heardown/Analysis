package com.sayweee.track.log;

import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;

import com.sayweee.logger.LogAdapter;
import com.sayweee.logger.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author:  winds
 * Email:   heardown@163.com
 * Date:    20120/7/16.
 * Desc:
 */
public class TrackLogAdapter implements LogAdapter {

    public final static String TAG = "TrackLogAdapter";

    protected static final String FORMAT = "yyyy-MM-dd HH:mm:ss"; //设置时间的格式
    protected static final String FORMAT_NAME = "yyyy-MM-dd"; //设置时间的格式

    private ExecutorService executor;

    public static LogAdapter getInstance() {
      return Builder.adapter;
    }

    protected static class Builder {
        private static LogAdapter adapter = new TrackLogAdapter();
    }

    private TrackLogAdapter(){
        executor = Executors.newSingleThreadExecutor();
    }

    @Override
    public boolean isLoggable(int priority, String tag) {
        return Logger.sWritable;
    }

    @Override
    public void log(int priority, final String tag, final String extraTag, final String message, final String extraMessage) {
        Log.println(priority, TAG, message == null ? "" : message);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                write(createFile(Logger.sPath, extraTag), Logger.sPath + "/" + extraTag, TextUtils.isEmpty(tag) ? TAG : tag, message, extraMessage);
            }
        });
    }

    protected String createFile(String path, String namePrefix) {
        try {
            String s = path + "/" + namePrefix + "-" + DateFormat.format(FORMAT_NAME, System.currentTimeMillis()) + ".log";
            int i = s.lastIndexOf("/");
            String folder = s.substring(0, i);
            String fileName = s.substring(i + 1);
            File folderFile = new File(folder);
            if (!folderFile.exists()) {
                try {
                    folderFile.mkdirs();
                } catch (Exception e) { //文件夹未创建成功

                }
            }
            File file = new File(folderFile, fileName);
            if (!file.exists()) {
                try {
                    boolean newFile = file.createNewFile();
                    if (newFile) {
                        logDefaultInfo(file.getAbsolutePath(), path, namePrefix);
                    }
                } catch (IOException e) {

                }
            }
            if (file != null && file.exists()) {
                return file.getAbsolutePath();
            }
        } catch (Exception e) {

        }
        return null;
    }

    protected void logDefaultInfo(String path, String name, String namePrefix) {
        write(path, name + "/" + namePrefix, TrackLogAdapter.class.getSimpleName(),
                "生产厂商：" + android.os.Build.BRAND
                        + "\r\n手机型号：" + android.os.Build.MODEL
                        + "\r\n系统版本：" + android.os.Build.VERSION.RELEASE
                        + "\r\n版本号：" + android.os.Build.VERSION.SDK_INT
                        + "\r\n\r\n"
                , null);
    }

    protected void write(final String path, String namePrefix, final String tag, final String message, final String extraMessage) {
        if (!TextUtils.isEmpty(path)) {
            write(path,
                    DateFormat.format(FORMAT, System.currentTimeMillis())
                            + "  >>  "
                            + message + "\r\n",
                    true);
        } else {
            Log.e(TAG, "log file create failed，path：" + namePrefix);
        }
    }

    public void write(String path, String text, boolean append) {
        BufferedWriter bw = null;
        try {
            //1.创建流对象
            bw = new BufferedWriter(new FileWriter(path, append));
            //2.写入文件
            bw.write(text);
            //换行刷新
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "file write failed!");
        } finally {
            //4.关闭流资源
            if (bw != null) {
                try {
                    bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
