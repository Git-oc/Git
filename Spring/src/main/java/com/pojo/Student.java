package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Scope("singleton")         //singleton 单例模式(默认)   prototype 非单例模式
@Lazy(false)                //false 饿汉模式(默认)    true 懒汉模式
public class Student {

    private String stuNum;//学号
    private String stuName;//姓名
    private String stuGender;//性别
    private Integer stuAge;//年龄
    private Date stuTime;//入学时间

    private Clazz clazz;
    private List<String> hobbies;
    private Set<Clazz> sets;
    private Map<String,Object> maps;

    public Student(String stuName, String stuGender, int stuAge) {
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuAge = stuAge;
    }

}
