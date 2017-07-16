package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.HospitalT;
import zdfs.model.HospitalTExample;

public interface HospitalTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    long countByExample(HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int deleteByExample(HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int insert(HospitalT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int insertSelective(HospitalT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    List<HospitalT> selectByExampleWithBLOBs(HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    List<HospitalT> selectByExample(HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    HospitalT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExampleSelective(@Param("record") HospitalT record, @Param("example") HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") HospitalT record, @Param("example") HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByExample(@Param("record") HospitalT record, @Param("example") HospitalTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKeySelective(HospitalT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(HospitalT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_t
     *
     * @mbg.generated Sun Jul 16 22:04:05 CST 2017
     */
    int updateByPrimaryKey(HospitalT record);
}