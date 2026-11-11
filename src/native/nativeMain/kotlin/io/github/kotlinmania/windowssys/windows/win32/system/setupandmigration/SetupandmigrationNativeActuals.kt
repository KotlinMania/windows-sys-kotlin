@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssys_windows_win32_system_setupandmigration_oOBEComplete
import io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted
import io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun oOBEComplete(isoobecomplete: COpaquePointer?): Bool =
    windowssys_windows_win32_system_setupandmigration_oOBEComplete(isoobecomplete?.value?.toCPointer<ByteVar>())

public actual fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: COpaquePointer?, waithandle: COpaquePointer?): Bool =
    windowssys_windows_win32_system_setupandmigration_registerWaitUntilOOBECompleted(0L.toCPointer<ByteVar>(), callbackcontext?.value?.toCPointer<ByteVar>(), waithandle?.value?.toCPointer<ByteVar>())

public actual fun unregisterWaitUntilOOBECompleted(waithandle: COpaquePointer?): Bool =
    windowssys_windows_win32_system_setupandmigration_unregisterWaitUntilOOBECompleted(waithandle?.value?.toCPointer<ByteVar>())
