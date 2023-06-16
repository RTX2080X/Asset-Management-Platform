package com.ampserver.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Authorization implements Serializable {
    private Integer fk_rol_id;

    private Integer fk_per_id;

    @ApiModelProperty(value = "授权时间")
    private Date authorize_tim;

    private static final long serialVersionUID = 1L;

    public Integer getFk_rol_id() {
        return fk_rol_id;
    }

    public void setFk_rol_id(Integer fk_rol_id) {
        this.fk_rol_id = fk_rol_id;
    }

    public Integer getFk_per_id() {
        return fk_per_id;
    }

    public void setFk_per_id(Integer fk_per_id) {
        this.fk_per_id = fk_per_id;
    }

    public Date getAuthorize_tim() {
        return authorize_tim;
    }

    public void setAuthorize_tim(Date authorize_tim) {
        this.authorize_tim = authorize_tim;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fk_rol_id=").append(fk_rol_id);
        sb.append(", fk_per_id=").append(fk_per_id);
        sb.append(", authorize_tim=").append(authorize_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}