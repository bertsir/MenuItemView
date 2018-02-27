package cn.bertsir.menuitem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import cn.bertsir.menuitemlibary.MenuItemView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MenuItemView miv;
    private Button bt_show_point;
    private Button bt_hide_point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        miv = (MenuItemView) findViewById(R.id.miv);
        bt_show_point = (Button) findViewById(R.id.bt_show_point);
        bt_hide_point = (Button) findViewById(R.id.bt_hide_point);

        bt_show_point.setOnClickListener(this);
        bt_hide_point.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_show_point:
                miv.setShowRedPoint(true);
                break;
            case R.id.bt_hide_point:
                miv.setShowRedPoint(false);
                break;
        }
    }
}
