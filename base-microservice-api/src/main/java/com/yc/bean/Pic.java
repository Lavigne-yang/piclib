package com.yc.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table()
public class Pic {

    @Id
    Integer id;
    String path;
    String description;
}
