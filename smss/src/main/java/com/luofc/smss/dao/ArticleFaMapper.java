package com.luofc.smss.dao;

import com.luofc.smss.bean.ArticleFa;
import com.luofc.smss.bean.ArticleFaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleFaMapper {
    long countByExample(ArticleFaExample example);

    int deleteByExample(ArticleFaExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(ArticleFa record);

    int insertSelective(ArticleFa record);

    List<ArticleFa> selectByExampleWithBLOBs(ArticleFaExample example);

    List<ArticleFa> selectByExample(ArticleFaExample example);

    ArticleFa selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") ArticleFa record, @Param("example") ArticleFaExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleFa record, @Param("example") ArticleFaExample example);

    int updateByExample(@Param("record") ArticleFa record, @Param("example") ArticleFaExample example);

    int updateByPrimaryKeySelective(ArticleFa record);

    int updateByPrimaryKeyWithBLOBs(ArticleFa record);

    int updateByPrimaryKey(ArticleFa record);
}