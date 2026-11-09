@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.windowssys.core.BOOL
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun OOBEComplete(isoobecomplete: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssys_windows_win32_system_setupandmigration_OOBEComplete(isoobecomplete.toCPointer<ByteVar>())

public actual fun RegisterWaitUntilOOBECompleted(oobecompletedcallback: OOBE_COMPLETED_CALLBACK, callbackcontext: Long, waithandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssys_windows_win32_system_setupandmigration_RegisterWaitUntilOOBECompleted(oobecompletedcallback.toLong().toCPointer<ByteVar>(), callbackcontext.toCPointer<ByteVar>(), waithandle.toCPointer<ByteVar>())

public actual fun UnregisterWaitUntilOOBECompleted(waithandle: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssys_windows_win32_system_setupandmigration_UnregisterWaitUntilOOBECompleted(waithandle.toCPointer<ByteVar>())
