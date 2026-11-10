@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ualInstrument(data: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_ualInstrument(data?.value?.toCPointer<ByteVar>())

public actual fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_ualRegisterProduct(wszproductname?.value?.toCPointer<ByteVar>(), wszrolename?.value?.toCPointer<ByteVar>(), wszguid?.value?.toCPointer<ByteVar>())

public actual fun ualStart(data: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_ualStart(data?.value?.toCPointer<ByteVar>())

public actual fun ualStop(data: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssys_windows_win32_system_useraccesslogging_ualStop(data?.value?.toCPointer<ByteVar>())
