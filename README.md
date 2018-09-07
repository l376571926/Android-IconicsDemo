# Android-IconicsDemo
This is a Demo for Android-Iconics.

本项目运行环境特殊

    compileSdkVersion 'android-P'
    targetSdkVersion 28

详情运行参考

    https://www.loongwind.com/archives/368.html（运行参考）

    https://github.com/Czuaphe/Android-IconicsDemo（巨人肩膀）

    https://github.com/mikepenz/Android-Iconics（图标库作者）

    https://developer.android.com/topic/libraries/support-library/refactor（谷歌官方参考）

注：如果只想以最简单方式引用，并且不想改编译版本，那么在引入图标库时要排除androidx库，否则不能正常编译

    implementation ("com.mikepenz:iconics-core:3.1.0-rc01",{
        exclude group: 'androidx.appcompat'
    })

