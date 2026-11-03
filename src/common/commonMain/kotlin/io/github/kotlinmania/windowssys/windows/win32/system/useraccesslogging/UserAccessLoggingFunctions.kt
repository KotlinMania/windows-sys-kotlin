package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun UalInstrument(data: Long): HRESULT {
    return Win32DynamicFfi.invoke("ualapi.dll", "UalInstrument", longArrayOf(data)).toInt()
}

public fun UalRegisterProduct(wszproductname: PCWSTR, wszrolename: PCWSTR, wszguid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("ualapi.dll", "UalRegisterProduct", longArrayOf(wszproductname, wszrolename, wszguid)).toInt()
}

public fun UalStart(data: Long): HRESULT {
    return Win32DynamicFfi.invoke("ualapi.dll", "UalStart", longArrayOf(data)).toInt()
}

public fun UalStop(data: Long): HRESULT {
    return Win32DynamicFfi.invoke("ualapi.dll", "UalStop", longArrayOf(data)).toInt()
}
