package com.wangjubao.dolphin.mapper.ads;

import com.wangjubao.dolphin.pojo.ads.NbfBuyer;
import com.wangjubao.dolphin.pojo.ads.NbfBuyerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbfBuyerMapper {
    int countByExample(NbfBuyerExample example);

    int deleteByExample(NbfBuyerExample example);

    int insert(NbfBuyer record);

    int insertSelective(NbfBuyer record);

    List<NbfBuyer> selectByExample(NbfBuyerExample example);

    int updateByExampleSelective(@Param("record") NbfBuyer record, @Param("example") NbfBuyerExample example);

    int updateByExample(@Param("record") NbfBuyer record, @Param("example") NbfBuyerExample example);
}