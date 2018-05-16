package com.wangjubao.dolphin.mapper.ads;

import com.wangjubao.dolphin.pojo.ads.NbfBuyerSum;
import com.wangjubao.dolphin.pojo.ads.NbfBuyerSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbfBuyerSumMapper {
    int countByExample(NbfBuyerSumExample example);

    int deleteByExample(NbfBuyerSumExample example);

    int insert(NbfBuyerSum record);

    int insertSelective(NbfBuyerSum record);

    List<NbfBuyerSum> selectByExample(NbfBuyerSumExample example);

    int updateByExampleSelective(@Param("record") NbfBuyerSum record, @Param("example") NbfBuyerSumExample example);

    int updateByExample(@Param("record") NbfBuyerSum record, @Param("example") NbfBuyerSumExample example);
}