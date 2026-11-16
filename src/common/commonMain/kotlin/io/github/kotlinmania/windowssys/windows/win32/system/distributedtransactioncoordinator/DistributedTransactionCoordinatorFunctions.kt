package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult

public expect fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr, oPpvobject: MutPtr): Hresult

public expect fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult

public expect fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr, iGrfoptions: UInt, iPvconfigparams: MutPtr, oPpvobject: MutPtr): Hresult
