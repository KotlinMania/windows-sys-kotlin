@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemSetupandmigrationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemSetupandmigrationOOBEComplete(isoobecomplete: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSetupandmigrationRegisterWaitUntilOOBECompleted(oobecompletedcallback: Long, callbackcontext: Long, waithandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemSetupandmigrationUnregisterWaitUntilOOBECompleted(waithandle: Long): Int
}

public actual fun oOBEComplete(isoobecomplete: MutPtr): Bool =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssysWindowsWin32SystemSetupandmigrationOOBEComplete(isoobecomplete.rawAddress)

public actual fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: ConstPtr, waithandle: MutPtr): Bool =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssysWindowsWin32SystemSetupandmigrationRegisterWaitUntilOOBECompleted(0L, callbackcontext.rawAddress, waithandle.rawAddress)

public actual fun unregisterWaitUntilOOBECompleted(waithandle: ConstPtr): Bool =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssysWindowsWin32SystemSetupandmigrationUnregisterWaitUntilOOBECompleted(waithandle.rawAddress)
