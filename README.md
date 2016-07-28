# MemoryLeak
千里之堤， 毁于蚁穴。 -- 《韩非子·喻老》

一个简单的demo

Android Studio 内存泄漏track、分析、解决

    dependencies {
       debugCompile 'com.squareup.leakcanary:leakcanary-android:1.3'
       releaseCompile 'com.squareup.leakcanary:leakcanary-android-no-op:1.3'
     }


        public class ExampleApplication extends Application {
       
         @Override public void onCreate() {
           super.onCreate();
           LeakCanary.install(this);
         }
       }
