@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.wmi

import io.github.kotlinmania.windowssys.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun miApplicationInitializeV1(flags: UInt, applicationid: COpaquePointer?, extendederror: COpaquePointer?, application: COpaquePointer?): MiResult =
    io.github.kotlinmania.windowssys.windows.win32.system.wmi.cinterop.windowssys_windows_win32_system_wmi_miApplicationInitializeV1(flags, applicationid?.value?.toCPointer<ByteVar>(), extendederror?.value?.toCPointer<ByteVar>(), application?.value?.toCPointer<ByteVar>())
