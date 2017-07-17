package zdfs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import zdfs.model.AppointmentT;
import zdfs.model.AppointmentTExample;

public interface AppointmentTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    long countByExample(AppointmentTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int deleteByExample(AppointmentTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int insert(AppointmentT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int insertSelective(AppointmentT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    List<AppointmentT> selectByExample(AppointmentTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    AppointmentT selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByExampleSelective(@Param("record") AppointmentT record, @Param("example") AppointmentTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByExample(@Param("record") AppointmentT record, @Param("example") AppointmentTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByPrimaryKeySelective(AppointmentT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment_t
     *
     * @mbg.generated Mon Jul 17 17:25:09 CST 2017
     */
    int updateByPrimaryKey(AppointmentT record);
}