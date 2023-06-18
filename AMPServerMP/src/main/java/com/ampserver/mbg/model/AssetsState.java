package com.ampserver.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class AssetsState implements Serializable {
    @ApiModelProperty(value = "id")
    private Integer pk_id;

    @ApiModelProperty(value = "资产类型ID")
    private Integer fk_ast_id;

    @ApiModelProperty(value = "状态代码")
    private Integer current_state;

    @ApiModelProperty(value = "框架")
    private String location;

    @ApiModelProperty(value = "登机时间")
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

    public Integer getFk_ast_id() {
        return fk_ast_id;
    }

    public void setFk_ast_id(Integer fk_ast_id) {
        this.fk_ast_id = fk_ast_id;
    }

    public Integer getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(Integer current_state) {
        this.current_state = current_state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        sb.append(", fk_ast_id=").append(fk_ast_id);
        sb.append(", current_state=").append(current_state);
        sb.append(", location=").append(location);
        sb.append(", create_tim=").append(create_tim);
        sb.append(", correction_tim=").append(correction_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}