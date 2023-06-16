package com.ampserver.service.impl;

import com.ampserver.mbg.model.Permission;
import com.ampserver.mbg.mapper.PermissionMapper;
import com.ampserver.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限 服务实现类
 * </p>
 *
 * @author nnn
 * @since 2023-06-15
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
