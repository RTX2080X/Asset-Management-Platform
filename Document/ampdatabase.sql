/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

create DATABASE amp_database;
USE amp_database;
create table if not exists usr
(
    pk_id          int auto_increment comment 'id'
        primary key,
    user_name      varchar(20)                         not null comment '用户名',
    pwd            varchar(20)                         not null comment '密码',
    remark         varchar(50)                         null comment '备注',
    register_tim   timestamp default CURRENT_TIMESTAMP not null comment '注册时间',
    correction_tim timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '用户' charset = utf8;

create table if not exists role
(
    pk_id          int auto_increment comment 'id'
        primary key,
    nam            varchar(20)                         not null comment '角色名',
    create_tim     timestamp default CURRENT_TIMESTAMP not null comment '创建时间',
    correction_tim timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '角色' charset = utf8;

create table if not exists permission
(
    pk_id          int auto_increment comment 'id'
        primary key,
    str            varchar(50)                         not null comment '权限名称',
    remake         varchar(50)                         null comment '备注',
    create_tim     timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    correction_tim timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '权限' charset = utf8;

create table if not exists permission
(
    pk_id          int auto_increment comment 'id'
        primary key,
    str            varchar(50)                         not null comment '权限名称',
    remake         varchar(50)                         null comment '备注',
    create_tim     timestamp default CURRENT_TIMESTAMP null comment '创建时间',
    correction_tim timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '权限' charset = utf8;

create table if not exists transfer
(
    fk_usr_id    int                                 not null comment '用户ID',
    fk_rol_id    int                                 null comment '角色ID',
    transfer_tim timestamp default CURRENT_TIMESTAMP not null comment '调动时间',
    constraint transfer_role_pk_id_fk
        foreign key (fk_rol_id) references role (pk_id),
    constraint transfer_usr_pk_id_fk
        foreign key (fk_usr_id) references usr (pk_id)
)
    comment '调动' charset = utf8;

create table if not exists authorization
(
    fk_rol_id     int                                 not null comment '角色ID',
    fk_per_id     int                                 not null comment '权限ID',
    authorize_tim timestamp default CURRENT_TIMESTAMP not null comment '授权时间',
    constraint authorization_permission_pk_id_fk
        foreign key (fk_per_id) references permission (pk_id),
    constraint authorization_role_pk_id_fk
        foreign key (fk_rol_id) references role (pk_id)
)
    comment '授权' charset = utf8;

create table if not exists amp_database.assets
(
    pk_Id          int auto_increment comment 'ID'
        primary key,
    location       varchar(20)                         null comment '位号',
    tpe            varchar(30)                         null comment '型号',
    pump_head      int                                 null comment '扬程(m)',
    flow           float                               null comment '流量(m3/h)',
    rpm            int                                 null comment '转速(r/min)',
    quality        int                                 null comment '重量',
    spare_part     varchar(20)                         null comment '备件',
    powr           float                               null comment '功率(kw)',
    factory_tim    timestamp                           null comment '出厂日期',
    factory_num    varchar(20)                         null comment '出厂编号',
    factory_nam    varchar(20)                         null comment '厂家',
    category       varchar(20)                         null comment '泵型',
    remake         varchar(50)                         null comment '备注',
    create_tim     timestamp default CURRENT_TIMESTAMP null comment '建档时间',
    correction_tim timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '资产信息' charset = utf8;


create table if not exists assets_state
(
    fk_ast_id      int                                 not null comment '资产类型ID',
    current_state  int                                 not null comment '状态代码',
    pk_id          int auto_increment comment 'id'
        primary key,
    location       varchar(10)                         null comment '框架',
    create_tim     timestamp default CURRENT_TIMESTAMP not null comment '登机时间',
    correction_tim timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    constraint assets_state_assets_pk_Id_fk
        foreign key (fk_ast_id) references assets (pk_Id)
)
    comment '资产状态' charset = utf8;

create table if not exists assets_record
(
    fk_ast_st_id int                                 not null comment '资产状态ID',
    tpe          int                                 null comment '操作类型',
    fk_rol_id    int                                 not null comment '操作角色',
    operate_tim  timestamp default CURRENT_TIMESTAMP null comment '操作时间',
    constraint assets_record_assets_state_pk_id_fk
        foreign key (fk_ast_st_id) references assets_state (pk_id),
    constraint assets_record_role_pk_id_fk
        foreign key (fk_rol_id) references role (pk_id)
)
    comment '资产变动信息' charset = utf8;



insert into usr(user_name, pwd, remark)
values ('qwer', '123456', '测试用(SystemALlAccess)');
insert into usr(user_name, pwd, remark)
values ('testuser1', 'qweqwe12rtgha', '测试用户1');
insert into usr(user_name, pwd, remark)
values ('testuser2', 'qweqwe12rtgha', '测试用户2');
insert into usr(user_name, pwd, remark)
values ('tesyuser3', 'qweqwe12rtgha', '测试用户3');

insert into role(nam)
values ('超级管理员');
insert into role(nam)
values ('测试角色1');
insert into role(nam)
values ('测试角色2');
insert into role(nam)
values ('测试角色3');
insert into role(nam)
values ('测试角色4');
insert into role(nam)
values ('测试角色5');


insert into permission(str, remake)
values ('SystemAllAccess', '访问系统全部权限');
insert into permission(str, remake)
values ('SystemReadOnlyAccess', '系统只读');
insert into permission(str, remake)
values ('LoginAccess', '登陆');
insert into permission(str, remake)
values ('RegisterAccess', '注册');
insert into permission(str, remake)
values ('BackstageAllAccess', '后台管理');
insert into permission(str, remake)
values ('BackstageReadOnlyAccess', '后台只读');
insert into permission(str, remake)
values ('TestAccess', '测试用');

insert into transfer(fk_usr_id, fk_rol_id)
VALUES (1, 1);

insert into authorization(fk_rol_id, fk_per_id)
VALUES (1, 7);