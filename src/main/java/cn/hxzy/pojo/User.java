package cn.hxzy.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;   //继承这个类可以使得分布式之间传数据不会出错
import java.util.Date;

@Data
@Table(name="tb_user")  //指定和数据库的哪个表格关联
public class User implements Serializable {

   @Id    //标注为主键
   @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增长
    private Long id;

    private String userName;
    private String password;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;  //导入数据包是用的是alt+enter 两个键
    private String note;
    private Date created;
    private Date updated;




}
