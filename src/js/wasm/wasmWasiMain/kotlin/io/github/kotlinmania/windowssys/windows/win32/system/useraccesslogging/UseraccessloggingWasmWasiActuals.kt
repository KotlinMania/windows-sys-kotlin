@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public actual fun UalInstrument(data: Long): HRESULT =
    0

public actual fun UalRegisterProduct(wszproductname: PCWSTR, wszrolename: PCWSTR, wszguid: PCWSTR): HRESULT =
    0

public actual fun UalStart(data: Long): HRESULT =
    0

public actual fun UalStop(data: Long): HRESULT =
    0
