package print.with.sunmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.sunmi.printerhelper.utils.AidlUtil;
import com.sunmi.printerhelper.utils.ESCUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printText(View view) {
        AidlUtil.getInstance().printText("Lorem Ipsum", 24, true, false);
        AidlUtil.getInstance().sendRawData(ESCUtil.nextLine(1));
    }

    public void printQR(View view) {
        AidlUtil.getInstance().printQr("Lorem Ipsum", 4, 3);
        AidlUtil.getInstance().sendRawData(ESCUtil.nextLine(1));
    }
}