package com.winside.edu.castle.activity;

import android.os.Bundle;

import com.winside.edu.castle.R;
import com.winside.edu.castle.base.BaseActivity;


/**
 * Created by WDW on 2016/4/21.
 * Des 用户中心-记录界面
 */
public class UserCenterRecordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showUserCenterTitle();
        mUserCenterRecord.setChecked(true);
        mUserCenterRecord.setFocusable(false);
    }

    @Override
    public int getLayout() {
        return R.layout.activity_user_center_record;
    }
}
