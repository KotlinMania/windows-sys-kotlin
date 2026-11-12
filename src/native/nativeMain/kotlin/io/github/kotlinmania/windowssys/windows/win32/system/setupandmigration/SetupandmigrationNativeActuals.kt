@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssysWindowsWin32SystemSetupandmigrationOOBEComplete
import io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssysWindowsWin32SystemSetupandmigrationRegisterWaitUntilOOBECompleted
import io.github.kotlinmania.windowssys.windows.win32.system.setupandmigration.cinterop.windowssysWindowsWin32SystemSetupandmigrationUnregisterWaitUntilOOBECompleted
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun oOBEComplete(isoobecomplete: MutPtr<Bool>): Bool =
    windowssysWindowsWin32SystemSetupandmigrationOOBEComplete(isoobecomplete.rawAddress.toCPointer<ByteVar>())

public actual fun registerWaitUntilOOBECompleted(oobecompletedcallback: OobeCompletedCallback, callbackcontext: ConstPtr<CVoid>, waithandle: MutPtr<MutPtr<CVoid>>): Bool =
    windowssysWindowsWin32SystemSetupandmigrationRegisterWaitUntilOOBECompleted(0L.toCPointer<ByteVar>(), callbackcontext.rawAddress.toCPointer<ByteVar>(), waithandle.rawAddress.toCPointer<ByteVar>())

public actual fun unregisterWaitUntilOOBECompleted(waithandle: ConstPtr<CVoid>): Bool =
    windowssysWindowsWin32SystemSetupandmigrationUnregisterWaitUntilOOBECompleted(waithandle.rawAddress.toCPointer<ByteVar>())
