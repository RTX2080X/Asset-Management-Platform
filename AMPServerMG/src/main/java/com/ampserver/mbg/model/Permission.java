package com.ampserver.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer pk_id;

    @ApiModelProperty(value = "权限名称")
    private String str;

    @ApiModelProperty(value = "备注")
    private String remake;

    @ApiModelProperty(value = "创建时间")
    private Date create_tim;

    @ApiModelProperty(value = "更新时间")
    private Date correction_tim;

    private static final long serialVersionUID = 1L;

    public Integer getPk_id() {
        return pk_id;
    }

    public void setPk_id(Integer pk_id) {
        this.pk_id = pk_id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public Date getCreate_tim() {
        return create_tim;
    }

    public void setCreate_tim(Date create_tim) {
        this.create_tim = create_tim;
    }

    public Date getCorrection_tim() {
        return correction_tim;
    }

    public void setCorrection_tim(Date correction_tim) {
        this.correction_tim = correction_tim;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pk_id=").append(pk_id);
        sb.append(", str=").append(str);
        sb.append(", remake=").append(remake);
        sb.append(", create_tim=").append(create_tim);
        sb.append(", correction_tim=").append(correction_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}