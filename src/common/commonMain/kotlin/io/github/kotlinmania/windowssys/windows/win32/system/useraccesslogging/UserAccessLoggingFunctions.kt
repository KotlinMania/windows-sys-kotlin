package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun ualInstrument(data: COpaquePointer?): Hresult

public expect fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult

public expect fun ualStart(data: COpaquePointer?): Hresult

public expect fun ualStop(data: COpaquePointer?): Hresult
