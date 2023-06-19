function ObjTableStr(cId) {
    let tabUrl;
    let tabCols;
    switch (cId) {
        // info
        case '10':
            tabUrl = '/aInf/page'
            tabCols = [[
                {field: 'location', title: '框架ID'},
                {field: 'tpe', title: '类型'},
                {field: 'pump_head', title: '扬程'},
                {field: 'flow', title: 'flow'},
                {field: 'rpm', title: '转速'},
                {field: 'quality', title: '重量'},
                {field: 'spare_part', title: '备件'},
                {field: 'powr', title: '功率'},
                {field: 'factory_tim', title: '出厂日期'},
                {field: 'factory_num', title: '出场数量'},
                {field: 'factory_nam', title: '厂家名称'},
                {field: 'category', title: '泵型'},
                {field: 'remake1', title: '备注'}
            ]]
            break;
        // state
        case '11':
            tabUrl = '/aSta/page'
            tabCols = [[
                {field: 'fk_ast_id', title: '类型ID'},
                {field: 'current_state', title: '状态代码'},
                {field: 'location', title: '框架'},
                {field: 'create_tim', title: '登机时间'},
                {field: 'correction_tim', title: '更新时间'}
            ]]
            break;
        // record
        case '12':
            tabUrl = '/aRco/page'
            tabCols = [[
                {field:'fk_ast_st_id',title:'资产状态ID'},
                {field:'tpe',title:'操作类型'},
                {field:'fk_rol_id',title:'施工角色'},
                {field:'operate_tim',title:'操作时间'},

            ]]
            break;
        // User
        case '20':
            tabUrl = '/usr/page'
            tabCols = [[
                {field:'user_name',title:'用户名'},
                {field:'pwd',title:'密码'},
                {field:'remark',title:'备注'},
                {field:'register_tim',title:'注册时间'},
                {field:'correction_tim',title:'修改日期'}
            ]]
            break;
        default:
            tabUrl = 'xxx'
            tabCols = 'XXX'
    }
    this.tabUrl = tabUrl;
    this.tabCols = tabCols;
}
