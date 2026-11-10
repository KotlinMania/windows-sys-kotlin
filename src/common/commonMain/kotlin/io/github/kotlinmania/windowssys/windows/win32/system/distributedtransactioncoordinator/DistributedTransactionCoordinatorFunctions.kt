package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult

public expect fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult

public expect fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult

public expect fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult
