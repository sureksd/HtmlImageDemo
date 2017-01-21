# HtmlImage
HtmlImage is view in android. This view has various options of shape for image display like image circle, rounded and rectangle. In rounded using radius field for how many bit is round the corner of image. HtmlImage is capable to load image from network asynchronous, resource etc.

<!--![Thumbnail of slate](thumbnail.png)-->

## Integration

How integrate to HtmlImage?

1. Android Studio: Add the following to your modul level build.gradle file:

    ```yml
    compile 'com.om.html:htmlimage:1.0.0'
    ```

2. For Maven project using in pom.xml:

    ```ruby
    <dependency>
      <groupId>com.om.html</groupId>
      <artifactId>htmlimage</artifactId>
      <version>1.0.0</version>
      <type>pom</type>
    </dependency>
    ```

## Coding Part

### Add view in xml file

Add HtmlImage in xml file like


```yml
<com.om.html.htmlimage.HtmlImage
        android:id="@+id/img"
        android:layout_width="250dp"
        android:layout_height="250dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/image"
        app:shapeType="circle" />
```
1. The above code make a circle of image </br>
<img src="https://drive.google.com/uc?id=0B9Y_4cA1IvkgRDRMU2V1TzF6R1k" style="width:200px;height:200px;">
2. If width and height are not same then image look like as ovel.
```yml
<com.om.html.htmlimage.HtmlImage
        android:id="@+id/img"
        android:layout_width="250dp"
        android:layout_height="150dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/image"
        app:shapeType="circle" />
```
 </br>
<img src="https://drive.google.com/uc?id=0B9Y_4cA1IvkgZFVYc2VZakRLV2c" style="width:200px;height:200px;"></br>

    3. More attributes
    
```yml
<com.om.html.htmlimage.HtmlImage
        android:id="@+id/img"
        android:layout_width="250dp"
        android:layout_height="150dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/image"
        app:shapeType="circle"
        
        app:shapeType="circle"
        app:radius="20dp"
        app:radiusX="20dp"
        app:radiusY="20dp"
        app:startPointX="100dp"
        app:startPointY="100dp"
        app:ratio_tensility="height"/>
```
    4. Round Image
   
```yml
 <com.om.html.htmlimage.HtmlImage
        android:id="@+id/img"
        android:layout_width="250dp"
        android:layout_height="250dp"
        android:layout_centerInParent="true"
        android:scaleType="fitXY"
        android:src="@drawable/image"
        app:shapeType="round_rectangle"
        app:radius="50dp"
        />
```
<img src="https://drive.google.com/uc?id=0B9Y_4cA1IvkgS3NrWGI1NDZEcXc" style="width:200px;height:200px;">

### Load Image from server
Set image url then it's load asynchronouesly and set image.
```yml
    HtmlImage image = (HtmlImage) findViewById(R.id.img);
                image.setSrcUrl("https://github.com/full_image_2.jpg", new HtmlImage.LoadImageListener() {
            @Override
            public void post(Bitmap bitmap, String url) {
                if (bitmap == null) {
                    Log.e(TAG, "post: Bitmap null");
                } else {
                    Log.e(TAG, url + " = " + bitmap);
                }
            }
        });
```
### More Description 
<!--[Visit Hiberoid github page](https://sureksd.github.io/HiberoidDemo/)-->
