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

public class Assets implements Serializable {
    @ApiModelProperty(value = "ID")
    private Integer pk_Id;

    @ApiModelProperty(value = "位号")
    private String location;

    @ApiModelProperty(value = "型号")
    private String tpe;

    @ApiModelProperty(value = "扬程(m)")
    private Integer pump_head;

    @ApiModelProperty(value = "流量(m3/h)")
    private Float flow;

    @ApiModelProperty(value = "转速(r/min)")
    private Integer rpm;

    @ApiModelProperty(value = "重量")
    private Integer quality;

    @ApiModelProperty(value = "备件")
    private String spare_part;

    @ApiModelProperty(value = "功率(kw)")
    private Float powr;

    @ApiModelProperty(value = "出厂日期")
    private Date factory_tim;

    @ApiModelProperty(value = "出厂编号")
    private String factory_num;

    @ApiModelProperty(value = "厂家")
    private String factory_nam;

    @ApiModelProperty(value = "泵型")
    private String category;

    @ApiModelProperty(value = "备注")
    private String remake;

    @ApiModelProperty(value = "建档时间")
    private Date create_tim;

    @ApiModelProperty(value = "更新时间")
    private Date correction_tim;

    private static final long serialVersionUID = 1L;

    public Integer getPk_Id() {
        return pk_Id;
    }

    public void setPk_Id(Integer pk_Id) {
        this.pk_Id = pk_Id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTpe() {
        return tpe;
    }

    public void setTpe(String tpe) {
        this.tpe = tpe;
    }

    public Integer getPump_head() {
        return pump_head;
    }

    public void setPump_head(Integer pump_head) {
        this.pump_head = pump_head;
    }

    public Float getFlow() {
        return flow;
    }

    public void setFlow(Float flow) {
        this.flow = flow;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public String getSpare_part() {
        return spare_part;
    }

    public void setSpare_part(String spare_part) {
        this.spare_part = spare_part;
    }

    public Float getPowr() {
        return powr;
    }

    public void setPowr(Float powr) {
        this.powr = powr;
    }

    public Date getFactory_tim() {
        return factory_tim;
    }

    public void setFactory_tim(Date factory_tim) {
        this.factory_tim = factory_tim;
    }

    public String getFactory_num() {
        return factory_num;
    }

    public void setFactory_num(String factory_num) {
        this.factory_num = factory_num;
    }

    public String getFactory_nam() {
        return factory_nam;
    }

    public void setFactory_nam(String factory_nam) {
        this.factory_nam = factory_nam;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        sb.append(", pk_Id=").append(pk_Id);
        sb.append(", location=").append(location);
        sb.append(", tpe=").append(tpe);
        sb.append(", pump_head=").append(pump_head);
        sb.append(", flow=").append(flow);
        sb.append(", rpm=").append(rpm);
        sb.append(", quality=").append(quality);
        sb.append(", spare_part=").append(spare_part);
        sb.append(", powr=").append(powr);
        sb.append(", factory_tim=").append(factory_tim);
        sb.append(", factory_num=").append(factory_num);
        sb.append(", factory_nam=").append(factory_nam);
        sb.append(", category=").append(category);
        sb.append(", remake=").append(remake);
        sb.append(", create_tim=").append(create_tim);
        sb.append(", correction_tim=").append(correction_tim);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}