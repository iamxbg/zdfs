package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.PatientT;
import zdfs.model.PatientTExample;

public interface PatientTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    long countByExample(PatientTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int deleteByExample(PatientTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int deleteByPrimaryKey(Integer p_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int insert(PatientT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int insertSelective(PatientT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    List<PatientT> selectByExample(PatientTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    PatientT selectByPrimaryKey(Integer p_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int updateByExampleSelective(@Param("record") PatientT record, @Param("example") PatientTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int updateByExample(@Param("record") PatientT record, @Param("example") PatientTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int updateByPrimaryKeySelective(PatientT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patient_t
     *
     * @mbg.generated Fri Jul 21 10:18:19 CST 2017
     */
    int updateByPrimaryKey(PatientT record);
}