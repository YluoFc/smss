package com.luofc.smss.dao;

import com.luofc.smss.bean.ArticleWei;
import com.luofc.smss.bean.ArticleWeiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleWeiMapper {
    long countByExample(ArticleWeiExample example);

    int deleteByExample(ArticleWeiExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(ArticleWei record);

    int insertSelective(ArticleWei record);

    List<ArticleWei> selectByExampleWithBLOBs(ArticleWeiExample example);

    List<ArticleWei> selectByExample(ArticleWeiExample example);

    ArticleWei selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") ArticleWei record, @Param("example") ArticleWeiExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleWei record, @Param("example") ArticleWeiExample example);

    int updateByExample(@Param("record") ArticleWei record, @Param("example") ArticleWeiExample example);

    int updateByPrimaryKeySelective(ArticleWei record);

    int updateByPrimaryKeyWithBLOBs(ArticleWei record);

    int updateByPrimaryKey(ArticleWei record);
}