
package com.twoflashlight.test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.KeyEvent;

import com.robotium.solo.Solo;
import com.twoflashlight.main.CameraActivity;
import com.tylerfoxx.twoflash.R;

public class UnitTest extends ActivityInstrumentationTestCase2<CameraActivity>
{
    private static final int MOVE_STEP_ON_SCREEN = 20;
    private Solo mMainActivity;

    public UnitTest() {
        super(CameraActivity.class);
    }

    @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        mMainActivity = new Solo(getInstrumentation(), getActivity());
    }

    public void testChangeLightFunction()
    {
        testChangeBackLightToMin();
        testChangeFrontLightToMax();
        testChangeBackLightToMax();
        testChangeFrontLightToMin();
    }

    public void testChangeBackLightToMax()
    {
        float startX = 0;
        float endX = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getWidth();
        float startY = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getHeight() / 2;
        float endY = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getHeight() / 2;
        mMainActivity.drag(startX, endX, startY, endY, MOVE_STEP_ON_SCREEN);
    }

    public void testChangeBackLightToMin()
    {
        float startX = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getWidth();
        float endX = 0;
        float startY = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getHeight() / 2;
        float endY = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getHeight() / 2;
        mMainActivity.drag(startX, endX, startY, endY, MOVE_STEP_ON_SCREEN);
    }

    public void testChangeFrontLightToMax()
    {
        float startY = 0;
        float endY = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getHeight();
        float startX = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getWidth() / 2;
        float endX = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getWidth() / 2;
        mMainActivity.drag(startX, endX, startY, endY, MOVE_STEP_ON_SCREEN);
    }

    public void testChangeFrontLightToMin()
    {
        float endY = 0;
        float startY = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getHeight();
        float startX = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getWidth() / 2;
        float endX = mMainActivity.getCurrentActivity().getWindowManager().getDefaultDisplay()
                .getWidth() / 2;
        mMainActivity.drag(startX, endX, startY, endY, MOVE_STEP_ON_SCREEN);
    }

    public void testExitDialogFunction()
    {
        mMainActivity.sendKey(KeyEvent.KEYCODE_BACK);
        mMainActivity.searchText(mMainActivity.getString(R.string.exit_dialog_title));
        mMainActivity.clickLongOnText(mMainActivity.getString(R.string.exit_dialog_no));
        mMainActivity.sendKey(KeyEvent.KEYCODE_BACK);
        mMainActivity.searchText(mMainActivity.getString(R.string.exit_dialog_title));
        mMainActivity.clickLongOnText(mMainActivity.getString(R.string.exit_dialog_yes));
    }

    public void testMainActivityFunction()
    {
        testChangeLightFunction();
        testExitDialogFunction();
        assertNotNull(mMainActivity);
    }

}
