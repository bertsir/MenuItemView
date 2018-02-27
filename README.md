# MenuItemView
Android 设置菜单布局

## 预览图
![QQ截图20180227135711.jpg](http://upload-images.jianshu.io/upload_images/3029020-b7ce035b659bff61.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/310)

## 支持的设置项
<pre>
1.设置左侧图标</br>
2.设置图标宽高</br>
3.设置文本离左侧距离</br>
4.设置文本内容</br>
5.设置文本大小</br>
6.设置文本颜色</br>
7.设置小红点是否显示</br>
8.设置小红点大小</br>
9.设置小红点颜色</br>
10.设置右侧图标</br>
11.设置右侧图标大小</br>
12.设置右侧图标距离右侧距离</br>
13.设置分割线颜色</br>
14.设置分割线距离左面距离</br>
15.设置分割线距离右侧距离</br>
16.设置分割线粗细</br>
</pre>

## 引入方式

#### 方式一：
GitHub下载库，使用File -> new -> Import Module方式

#### 方式二：
<pre>
compile 'cn.bertsir.menuitemlibary:menuitemlibary:1.0.0'
</pre>

## 使用
````
<cn.bertsir.menuitemlibary.MenuItemView
   android:id="@+id/miv"
   android:layout_width="match_parent"
   android:layout_height="50dp"
   app:leftImgRes="@drawable/mine_xx"
   app:leftImgHeight="20dp"
   app:leftImgWidht="20dp"
   app:leftImgMarginLeft="15dp"
   app:content="我的消息"
   app:contentColor="@color/colorAccent"
   app:contentSize="16sp"
   app:showRedPoint="true"
   app:RedPointSize="10dp"
   app:rightImgRes="@drawable/mine_into"
   app:spliteLineHegiht="0.5dp"
   app:spliteLineMarginLeft="15dp"
   app:rightImgWidht="20dp"
   app:rightImgHeight="20dp"
   />
````

## 参数列表
| name |  description |
| ------------- | :-------------:|
| leftImgRes| 设置左侧图标，不设置为无图|
| leftImgWidht|  设置左侧图标宽 |
| leftImgHeight| 设置左侧图标高 |
| leftImgMarginLeft|  设置左侧图标距离左侧的距离 |
| contentMarginLeft|  设置文本距离左侧的距离 |
| content|  设置文本 |
| contentSize|  设置文本的大小 |
| contentColor| 设置文本的颜色 |
| showRedPoint|  设置是否显示提示小红点，默认不显示 |
| RedPointSize| 设置小红点大小 |
| RedPointColor|  设置小红点颜色，默认为红色 |
| rightImgRes|  设置右侧图标资源 |
| rightImgWidht| 设置右侧图标宽 |
| rightImgHeight| 设置右侧图标高 |
| rightImgMarginRight|  设置右侧图标距离右侧的距离 |
| spliteLineColor|  设置下方分割线的颜色 |
| spliteLineHegiht|  设置下方分割线的高 |
| spliteLineMarginLeft|  设置下方分割线距离左面的距离 |
| spliteLineMarginRight|  设置下方分割线距离右面的距离 |
| showSpliteLine|  设置是否显示下方分割线 |

