@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun UalInstrument(data: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_UalInstrument(data.toCPointer<ByteVar>())

public actual fun UalRegisterProduct(wszproductname: PCWSTR, wszrolename: PCWSTR, wszguid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_UalRegisterProduct(wszproductname.toCPointer<ByteVar>(), wszrolename.toCPointer<ByteVar>(), wszguid.toCPointer<ByteVar>())

public actual fun UalStart(data: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_UalStart(data.toCPointer<ByteVar>())

public actual fun UalStop(data: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_UalStop(data.toCPointer<ByteVar>())
