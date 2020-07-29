package com.well.studio.util.util2;

import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

@Data
public abstract class AbstractHistoryVo implements Serializable {

    private static final long serialVersionUID = 1993072186482038252L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 关联Id
     */
    private Long refId;

    /**
     * 操作时间
     */
    private Date operationTime;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 操作人ID
     */
    private Long operatorId;

    /**
     * 操作类型
     */
    private OperatorTypeEnum operatorType;

    /**
     * 乐观锁
     */
    private Integer lockVersion = 0;

    /**
     * 域
     */
    private Long domainId;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
