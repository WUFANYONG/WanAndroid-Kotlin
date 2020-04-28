package com.lengjiye.code.me.activity

import android.os.Bundle
import com.lengjiye.base.activity.ParentActivity
import com.lengjiye.code.R
import com.lengjiye.code.databinding.ActivityMyShareBinding
import com.lengjiye.code.me.viewmodel.MeShareViewModel
import com.lengjiye.code.utils.AccountUtil
import com.lengjiye.code.utils.ActivityUtil
import com.lengjiye.code.utils.ToolBarUtil

/**
 * 我的分享
 */
class MyShareActivity : ParentActivity<ActivityMyShareBinding, MeShareViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_my_share
    }

    override fun initToolBar() {
        super.initToolBar()
        ToolBarUtil.Builder(findViewById(R.id.toolbar)).setType(ToolBarUtil.NORMAL_TYPE)
            .setBackRes(R.drawable.ic_back_ffffff_24dp).setNormalTitleColor(R.color.c_ff)
            .setNormalTitle(R.string.s_17)
            .setBackListener {
                finish()
            }.builder()
    }

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)

        mBinding.hnArticleList.setOnClickListener {
            ActivityUtil.startShareArticleListActivity(this, AccountUtil.getUserId())
        }

        mBinding.hnProjectList.setOnClickListener {
            ActivityUtil.startCollectWebsiteListActivity(this)
        }
    }
}