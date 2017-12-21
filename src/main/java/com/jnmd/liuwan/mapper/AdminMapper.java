package com.jnmd.liuwan.mapper;

import java.sql.SQLException;
import java.util.Map;

import com.jnmd.liuwan.domain.Admin;

public interface AdminMapper {

	public Admin findByAdminnameAndAdminpwd(Map<String,Object> map) throws SQLException;
}
