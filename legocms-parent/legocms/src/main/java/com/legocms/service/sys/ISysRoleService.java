package com.legocms.service.sys;

import java.util.List;

import com.legocms.core.dto.Page;
import com.legocms.core.dto.TypeCheckInfo;
import com.legocms.core.dto.sys.SysRoleInfo;

public interface ISysRoleService {

    List<TypeCheckInfo> findSimple(String userCode);

    Page<SysRoleInfo> findBy(String code, String name, int pageIndex, int pageSize);

    void authorize(String roleCode, List<String> permissionCodes);

    void save(String code, String name);

    void delete(String code);

    SysRoleInfo findByCode(String code);
}
