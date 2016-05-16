package com.winside.edu.castle.activity;

import android.os.Bundle;

import com.winside.edu.castle.R;
import com.winside.edu.castle.base.BaseActivity;


/**
 * Created by WDW on 2016/4/21.
 * Des 用户中心-反馈界面
 */
public class UserCenterResponseActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showUserCenterTitle();
        initFocus();
    }
    /*处理焦点的状态*/
    private void initFocus() {
        mUserCenterResponse.setChecked(true);
        mUserCenterResponse.setFocusable(false);
        mUserCenterAchievement.setNextFocusLeftId(R.id.iv_user_center_record);
        mUserCenterRecord.setNextFocusRightId(R.id.iv_user_center_achievement);
        mUserCenterBack.setNextFocusDownId(R.id.iv_user_center_record);

    }

    @Override
    public int getLayout() {
        return R.layout.activity_user_center_response;
    }


}
