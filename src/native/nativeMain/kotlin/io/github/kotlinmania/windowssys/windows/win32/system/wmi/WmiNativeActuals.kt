@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun MI_Application_InitializeV1(flags: UInt, applicationid: Long, extendederror: Long, application: Long): MI_Result =
    io.github.kotlinmania.windowssys.windows.win32.system.wmi.cinterop.windowssys_windows_win32_system_wmi_MI_Application_InitializeV1(flags, applicationid.toCPointer<ByteVar>(), extendederror.toCPointer<ByteVar>(), application.toCPointer<ByteVar>())
