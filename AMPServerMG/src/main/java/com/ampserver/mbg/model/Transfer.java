/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ampserver.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Transfer implements Serializable {
    @ApiModelProperty(value = "用户ID")
    private Integer fk_usr_id;

    @ApiModelProperty(value = "角色ID")
    private Integer fk_rol_id;

    @ApiModelProperty(value = "调动时间")
    private Date transfer_tim;

    private static final long serialVersionUID = 1L;

    public Integer getFk_usr_id() {
        return fk_usr_id;
    }

    public void setFk_usr_id(Integer fk_usr_id) {
        this.fk_usr_id = fk_usr_id;
    }

    public Integer getFk_rol_id() {
        return fk_rol_id;
    }

    public void setFk_rol_id(Integer fk_rol_id) {
        this.fk_rol_id = fk_rol_id;
    }

    public Date getTransfer_tim() {
        return transfer_tim;
    }

    public void setTransfer_tim(Date transfer_tim) {
        this.transfer_tim = transfer_tim;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fk_usr_id=").append(fk_usr_id);
        sb.append(", fk_rol_id=").append(fk_rol_id);
        sb.append(", transfer_tim=").append(transfer_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}