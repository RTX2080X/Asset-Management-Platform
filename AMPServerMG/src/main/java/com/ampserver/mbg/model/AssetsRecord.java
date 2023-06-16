package com.ampserver.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class AssetsRecord implements Serializable {
    @ApiModelProperty(value = "资产状态ID")
    private Integer fk_ast_st_id;

    @ApiModelProperty(value = "操作类型")
    private Integer tpe;

    @ApiModelProperty(value = "操作角色")
    private Integer fk_rol_id;

    @ApiModelProperty(value = "操作时间")
    private Date operate_tim;

    private static final long serialVersionUID = 1L;

    public Integer getFk_ast_st_id() {
        return fk_ast_st_id;
    }

    public void setFk_ast_st_id(Integer fk_ast_st_id) {
        this.fk_ast_st_id = fk_ast_st_id;
    }

    public Integer getTpe() {
        return tpe;
    }

    public void setTpe(Integer tpe) {
        this.tpe = tpe;
    }

    public Integer getFk_rol_id() {
        return fk_rol_id;
    }

    public void setFk_rol_id(Integer fk_rol_id) {
        this.fk_rol_id = fk_rol_id;
    }

    public Date getOperate_tim() {
        return operate_tim;
    }

    public void setOperate_tim(Date operate_tim) {
        this.operate_tim = operate_tim;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fk_ast_st_id=").append(fk_ast_st_id);
        sb.append(", tpe=").append(tpe);
        sb.append(", fk_rol_id=").append(fk_rol_id);
        sb.append(", operate_tim=").append(operate_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}