package example.sangcv.b3_42separateclass;

import android.view.View;

public class showText implements View.OnClickListener {
    private String message;
    private MainActivity main;

    public showText(String message, MainActivity main) {
        this.message = message;
        this.main = main;
    }
    @Override
    public void onClick(View v) {
        main.showMessage(message);
    }
}
