package com.baomidou.mybatisplus.samples.logic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.logic.entity.Common;

import java.util.List;

public interface CommonMapper extends BaseMapper<Common> {

    /**
     * @return java.util.List<com.baomidou.mybatisplus.samples.logic.entity.Common>
     */
    public List<Common> customXmlTableLogic();

}
