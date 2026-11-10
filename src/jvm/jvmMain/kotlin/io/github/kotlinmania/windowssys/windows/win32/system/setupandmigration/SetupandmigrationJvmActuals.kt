@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemSetupandmigrationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_setupandmigration_oOBEComplete(isoobecomplete: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(oobecompletedcallback: Long, callbackcontext: Long, waithandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted(waithandle: Long): Int
}

public actual fun oOBEComplete(isoobecomplete: COpaquePointer?): Bool =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssys_windows_win32_system_setupandmigration_oOBEComplete((isoobecomplete?.value ?: 0L))

public actual fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: COpaquePointer?, waithandle: COpaquePointer?): Bool =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(0L, (callbackcontext?.value ?: 0L), (waithandle?.value ?: 0L))

public actual fun unregisterWaitUntilOOBECompleted(waithandle: COpaquePointer?): Bool =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted((waithandle?.value ?: 0L))
