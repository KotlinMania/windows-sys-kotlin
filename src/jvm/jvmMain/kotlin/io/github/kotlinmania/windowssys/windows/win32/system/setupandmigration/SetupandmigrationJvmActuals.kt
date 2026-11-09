@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.core.BOOL

private object WindowsWin32SystemSetupandmigrationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_setupandmigration_OOBEComplete(isoobecomplete: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_setupandmigration_RegisterWaitUntilOOBECompleted(oobecompletedcallback: Long, callbackcontext: Long, waithandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_setupandmigration_UnregisterWaitUntilOOBECompleted(waithandle: Long): Int
}

public actual fun OOBEComplete(isoobecomplete: Long): BOOL =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssys_windows_win32_system_setupandmigration_OOBEComplete(isoobecomplete)

public actual fun RegisterWaitUntilOOBECompleted(oobecompletedcallback: OOBE_COMPLETED_CALLBACK, callbackcontext: Long, waithandle: Long): BOOL =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssys_windows_win32_system_setupandmigration_RegisterWaitUntilOOBECompleted(oobecompletedcallback.toLong(), callbackcontext, waithandle)

public actual fun UnregisterWaitUntilOOBECompleted(waithandle: Long): BOOL =
    WindowsWin32SystemSetupandmigrationJniBridge.windowssys_windows_win32_system_setupandmigration_UnregisterWaitUntilOOBECompleted(waithandle)
