package com.wangjubao.dolphin.mapper.ads;

import com.wangjubao.dolphin.pojo.ads.NbfItem;
import com.wangjubao.dolphin.pojo.ads.NbfItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbfItemMapper {
    int countByExample(NbfItemExample example);

    int deleteByExample(NbfItemExample example);

    int insert(NbfItem record);

    int insertSelective(NbfItem record);

    List<NbfItem> selectByExample(NbfItemExample example);

    int updateByExampleSelective(@Param("record") NbfItem record, @Param("example") NbfItemExample example);

    int updateByExample(@Param("record") NbfItem record, @Param("example") NbfItemExample example);
}