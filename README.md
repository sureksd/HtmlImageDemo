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
<img src="https://drive.google.com/uc?id=0B9Y_4cA1IvkgZFVYc2VZakRLV2c" style="width:200px;height:200px;">

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
    

### Bean Class and Database Table

Hiberoid mapping your bean class to database table. Hiberoid using some annotations like @Entity, @Id, @Column for direct fast and simple implementation.
```yml
@Entity(name = "Students")
public class Student implements Serializable {
    
    private int id;
    private String name;
    private String class_name;
    private String grade;
    .....
}
```
In above code, bean class name is 'Student' but table name 'Students'. Here using @Entity annotation on bean class (@Entity is class level Annotation) for make this bean class(Student) to table of database, if you’re not set @Entity on any bean class that mean class not a table for database mapping. Hiberoid make mapping on only those class have @Entity annotation, without annotation classes are normal class.
```yml
@Entity
public class Student implements Serializable {
    .....
}
```
Here Bean class name 'Student' and table name also 'Student'.
### Mapping between Instance Variable of Class and Database Table Columns
Instance variable of your entity class directly it's columns in table without any annotations. If you want to change name of column in table then using @column annotation with name of custome column name on particuler instance variable. if you want to make a primary key in table then using @Id annotation on particuler instance variable in entity class.Ex
```yml
@Entity(name = "Students")
public class Student implements Serializable {
    @Id
    private int id;
    
    @Column(name="Student_name")
    private String name;
    
    @Column
    private String class_name;
    private String grade;
    .......   
}
 ```
 
 1. In this code @Id annotation on 'id' variable, Now this is a primary key in table.
 2. If @column without any parameter apply on variable then this behave as default(variable Without @Column Annotation)
 3. Also you can change of data type, default value and nullable in table using parameter.
 
 ```yml
  @Column(name="Student_name",dataType ="varchar(50)",defaultValue ="Surendra",nullable = Column.NULLABLE.NOTNULL)
 ```
  
  Default Value of nullable parameter is Column.NULLABLE.NULL
### Insert object(Record) in table
Using Hiberoid object to operation on table. When insert a record in table then return value of row id as long type. Ex..

 ```yml
   Student student = new Student(name.getText().toString(), class_name.getText().toString(), grade.getText().toString());
   long rowId = hiberoid.insert(student);
 ```
### Get Record from table
Get all records from table Students. Here using only class name not table name. see below code..
 ```yml
List<Student> students = hiberoid.fetchAll(Student.class);
 ```
### More Description 
[Visit Hiberoid github page](https://sureksd.github.io/HiberoidDemo/)
