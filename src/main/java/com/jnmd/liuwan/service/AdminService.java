package com.jnmd.liuwan.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.liuwan.domain.Admininsert;
import com.jnmd.liuwan.domain.PlaneAirport;
import com.jnmd.liuwan.domain.PlaneCompany;
import com.jnmd.liuwan.domain.PlaneOil;
import com.jnmd.liuwan.domain.Province;
import com.jnmd.liuwan.domain.User;
import com.jnmd.liuwan.exception.AdminException;
import com.jnmd.liuwan.mapper.AdminMapper;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class AdminService {
    @Resource
    private AdminMapper planeairportmapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<PlaneAirport> getairport() {
        return planeairportmapper.getairport();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Province> getprovince() {
        return planeairportmapper.getprovince();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<PlaneCompany> getplanecompany() {
        return planeairportmapper.getplanecompany();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<PlaneOil> getplaneoil() {
        return planeairportmapper.getplaneoil();
    }

    @Transactional(rollbackFor = AdminException.class)
    public void insertPlane(Admininsert admininsert) {
        planeairportmapper.insertPlane(admininsert);

    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Admininsert> getAdmininserts(Map<String, Object> mapd) {
        return planeairportmapper.getAdmininserts(mapd);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public void getDeletes(int pmid) {
        planeairportmapper.getDeletes(pmid);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public int maxNum() {
        return planeairportmapper.maxNum();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Admininsert> getAllTime(Map<String, Object> map) {
        return planeairportmapper.getAllTimes(map);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Admininsert> getredact(int pmid) {

        return planeairportmapper.getredact(pmid);
    }

    @Transactional(rollbackFor = AdminException.class)
    public void updateplane(Admininsert admininsert) {
        planeairportmapper.updateplane(admininsert);

    }

}
