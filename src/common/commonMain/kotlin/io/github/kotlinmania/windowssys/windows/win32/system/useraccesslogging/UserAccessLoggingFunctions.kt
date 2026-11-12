package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun ualInstrument(data: ConstPtr<UalDataBlob>): Hresult

public expect fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult

public expect fun ualStart(data: ConstPtr<UalDataBlob>): Hresult

public expect fun ualStop(data: ConstPtr<UalDataBlob>): Hresult
