package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.DoctorT;
import zdfs.model.DoctorTExample;

public interface DoctorTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    long countByExample(DoctorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int deleteByExample(DoctorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int insert(DoctorT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int insertSelective(DoctorT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    List<DoctorT> selectByExample(DoctorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    DoctorT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") DoctorT record, @Param("example") DoctorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByExample(@Param("record") DoctorT record, @Param("example") DoctorTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByPrimaryKeySelective(DoctorT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doctor_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByPrimaryKey(DoctorT record);
}