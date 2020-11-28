package print.with.sunmi;
import android.app.Application;
import com.sunmi.printerhelper.utils.AidlUtil;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AidlUtil.getInstance().connectPrinterService(this);
    }
}
