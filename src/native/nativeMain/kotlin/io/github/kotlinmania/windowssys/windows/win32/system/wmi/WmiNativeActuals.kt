@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.system.wmi.cinterop.windowssysWindowsWin32SystemWmiMiApplicationInitializeV1
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun miApplicationInitializeV1(flags: UInt, applicationid: ConstPtr, extendederror: MutPtr, application: MutPtr): MiResult =
    windowssysWindowsWin32SystemWmiMiApplicationInitializeV1(flags, applicationid.rawAddress.toCPointer<ByteVar>(), extendederror.rawAddress.toCPointer<ByteVar>(), application.rawAddress.toCPointer<ByteVar>())
