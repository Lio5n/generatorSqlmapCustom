package com.wangjubao.dolphin.mapper.ads;

import com.wangjubao.dolphin.pojo.ads.NbfTrade;
import com.wangjubao.dolphin.pojo.ads.NbfTradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbfTradeMapper {
    int countByExample(NbfTradeExample example);

    int deleteByExample(NbfTradeExample example);

    int insert(NbfTrade record);

    int insertSelective(NbfTrade record);

    List<NbfTrade> selectByExample(NbfTradeExample example);

    int updateByExampleSelective(@Param("record") NbfTrade record, @Param("example") NbfTradeExample example);

    int updateByExample(@Param("record") NbfTrade record, @Param("example") NbfTradeExample example);
}