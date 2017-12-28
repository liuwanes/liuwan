package com.jnmd.liuwan.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.jnmd.liuwan.domain.Admin;
import com.jnmd.liuwan.domain.Admininsert;
import com.jnmd.liuwan.domain.PlaneAirport;
import com.jnmd.liuwan.domain.PlaneCompany;
import com.jnmd.liuwan.domain.PlaneOil;
import com.jnmd.liuwan.domain.Province;
import com.jnmd.liuwan.domain.User;

public interface AdminMapper {
	public Admin findByAdminnameAndAdminpwd(Map<String,Object> map) throws SQLException;
	
	public List<PlaneAirport> getairport();
        public List<Province> getprovince();
        public List<PlaneCompany> getplanecompany();
        public List<PlaneOil> getplaneoil();
        public void insertPlane(Admininsert admininsert);
        
        public List<Admininsert> getredact(int pmid);
        public List<Admininsert> getAdmininserts(Map<String,Object> mapd);
        public void getDeletes(int pmid);
        public int maxNum();
        public List<Admininsert> getAllTimes(Map<String,Object> map);

        public void updateplane(Admininsert admininsert);
}
