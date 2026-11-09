package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public expect fun UalInstrument(data: Long): HRESULT

public expect fun UalRegisterProduct(wszproductname: PCWSTR, wszrolename: PCWSTR, wszguid: PCWSTR): HRESULT

public expect fun UalStart(data: Long): HRESULT

public expect fun UalStop(data: Long): HRESULT
