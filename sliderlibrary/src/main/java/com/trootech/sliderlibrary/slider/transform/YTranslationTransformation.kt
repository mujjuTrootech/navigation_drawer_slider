package com.trootech.sliderlibrary.slider.transform

import android.view.View
import com.trootech.sliderlibrary.slider.utils.SideNavUtils


/**
 * Created by TrooTech solution on 26.08.2022.
 */
class YTranslationTransformation(private val endTranslation: Float) : RootTransformation {
    override fun transform(dragProgress: Float, rootView: View?) {
        val translation = SideNavUtils.evaluate(dragProgress, START_TRANSLATION, endTranslation)
        rootView!!.translationY = translation
    }

    companion object {
        private const val START_TRANSLATION = 0f
    }
}