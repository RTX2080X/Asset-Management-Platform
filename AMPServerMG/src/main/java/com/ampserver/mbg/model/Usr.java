package com.ampserver.mbg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

public class Usr implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "id")
    private Integer pk_id;
    @ApiModelProperty(value = "用户名")
    private String user_name;
    @ApiModelProperty(value = "密码")
    private String pwd;
    @ApiModelProperty(value = "备注")
    private String remark;
    @ApiModelProperty(value = "注册时间")
    private Date register_tim;
    @ApiModelProperty(value = "更新时间")
    private Date correction_tim;

    public Integer getPk_id() {
        return pk_id;
    }

    public void setPk_id(Integer pk_id) {
        this.pk_id = pk_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getRegister_tim() {
        return register_tim;
    }

    public void setRegister_tim(Date register_tim) {
        this.register_tim = register_tim;
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
        sb.append(", user_name=").append(user_name);
        sb.append(", pwd=").append(pwd);
        sb.append(", remark=").append(remark);
        sb.append(", register_tim=").append(register_tim);
        sb.append(", correction_tim=").append(correction_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}