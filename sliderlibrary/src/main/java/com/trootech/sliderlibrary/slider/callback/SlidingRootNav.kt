package com.trootech.sliderlibrary.slider.callback

import com.trootech.sliderlibrary.slider.SlidingRootNavLayout


/**
 * Created by TrooTech solution on 26.08.2022.
 */
interface SlidingRootNav {
    val isMenuClosed: Boolean
    val isMenuOpened: Boolean
    val layout: SlidingRootNavLayout

    //SlidingRootNavLayout getLayout();
    var isMenuLocked: Boolean
    fun closeMenu()
    fun closeMenu(animated: Boolean)
    fun openMenu()
    fun openMenu(animated: Boolean)
}