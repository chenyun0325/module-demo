import com.huigujia.platform.dao.mybatis3.interceptor.ISqlplaceholdReplace;

/**
 * Created by chenyun on 16/3/24.
 */
public class SqlplaceholdReplace implements ISqlplaceholdReplace {

  public String getReplacedSql() {
    return "where 1=1";
  }
}
