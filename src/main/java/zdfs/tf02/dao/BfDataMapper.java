package zdfs.tf02.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.tf02.model.BfData;
import zdfs.tf02.model.BfDataExample;

public interface BfDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    long countByExample(BfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int deleteByExample(BfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int insert(BfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int insertSelective(BfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    List<BfData> selectByExample(BfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    BfData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int updateByExampleSelective(@Param("record") BfData record, @Param("example") BfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int updateByExample(@Param("record") BfData record, @Param("example") BfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int updateByPrimaryKeySelective(BfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bf_data
     *
     * @mbg.generated Tue Jul 18 05:12:00 CST 2017
     */
    int updateByPrimaryKey(BfData record);
    
    BfData findLatest(int memberId);
    
}