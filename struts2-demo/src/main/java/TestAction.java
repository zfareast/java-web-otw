import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2018/12/3.
 */
public class TestAction extends ActionSupport {


    public String execute() throws Exception {
        System.out.println("test");
        return SUCCESS;
    }
}
