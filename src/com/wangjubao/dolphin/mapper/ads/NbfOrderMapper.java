package com.wangjubao.dolphin.mapper.ads;

import com.wangjubao.dolphin.pojo.ads.NbfOrder;
import com.wangjubao.dolphin.pojo.ads.NbfOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbfOrderMapper {
    int countByExample(NbfOrderExample example);

    int deleteByExample(NbfOrderExample example);

    int insert(NbfOrder record);

    int insertSelective(NbfOrder record);

    List<NbfOrder> selectByExample(NbfOrderExample example);

    int updateByExampleSelective(@Param("record") NbfOrder record, @Param("example") NbfOrderExample example);

    int updateByExample(@Param("record") NbfOrder record, @Param("example") NbfOrderExample example);
}