@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssysWindowsWin32SystemUseraccessloggingUalInstrument
import io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssysWindowsWin32SystemUseraccessloggingUalRegisterProduct
import io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssysWindowsWin32SystemUseraccessloggingUalStart
import io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging.cinterop.windowssysWindowsWin32SystemUseraccessloggingUalStop
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ualInstrument(data: ConstPtr): Hresult =
    windowssysWindowsWin32SystemUseraccessloggingUalInstrument(data.rawAddress.toCPointer<ByteVar>())

public actual fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult =
    windowssysWindowsWin32SystemUseraccessloggingUalRegisterProduct(wszproductname.rawAddress.toCPointer<ByteVar>(), wszrolename.rawAddress.toCPointer<ByteVar>(), wszguid.rawAddress.toCPointer<ByteVar>())

public actual fun ualStart(data: ConstPtr): Hresult =
    windowssysWindowsWin32SystemUseraccessloggingUalStart(data.rawAddress.toCPointer<ByteVar>())

public actual fun ualStop(data: ConstPtr): Hresult =
    windowssysWindowsWin32SystemUseraccessloggingUalStop(data.rawAddress.toCPointer<ByteVar>())
