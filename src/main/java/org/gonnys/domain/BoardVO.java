package org.gonnys.domain;

import lombok.Data;

import java.sql.Date;

@Data

public class BoardVO {

    private Integer bno;
    private String title, content, writer;
    private Date regdate, updatedate;
    private int viewcnt;
}
