package com.wangjubao.dolphin.mapper.ads;

import com.wangjubao.dolphin.pojo.ads.NbfBuyerRate;
import com.wangjubao.dolphin.pojo.ads.NbfBuyerRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbfBuyerRateMapper {
    int countByExample(NbfBuyerRateExample example);

    int deleteByExample(NbfBuyerRateExample example);

    int insert(NbfBuyerRate record);

    int insertSelective(NbfBuyerRate record);

    List<NbfBuyerRate> selectByExample(NbfBuyerRateExample example);

    int updateByExampleSelective(@Param("record") NbfBuyerRate record, @Param("example") NbfBuyerRateExample example);

    int updateByExample(@Param("record") NbfBuyerRate record, @Param("example") NbfBuyerRateExample example);
}