package com.wuying.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * user对象
 * @author wuying
 * @since 1.0.0
 * @date 2021-09-24
 */
@Data
@TableName("user")
public class User {
    private Integer userId;

    private String name;

    private Integer age;
}
