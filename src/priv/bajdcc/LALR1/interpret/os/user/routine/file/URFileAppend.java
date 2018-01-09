package priv.bajdcc.LALR1.interpret.os.user.routine.file;

import priv.bajdcc.LALR1.interpret.os.IOSCodePage;
import priv.bajdcc.util.ResourceLoader;

/**
 * 【用户态】追加文件
 *
 * @author bajdcc
 */
public class URFileAppend implements IOSCodePage {
    @Override
    public String getName() {
        return "/usr/p/>>";
    }

    @Override
    public String getCode() {
        return ResourceLoader.load(getClass());
    }
}
