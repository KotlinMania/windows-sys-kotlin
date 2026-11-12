package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

public expect fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr<Guid>, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr<Guid>, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr<Guid>, iGrfoptions: UInt, iPvconfigparams: MutPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr<Guid>, iGrfoptions: UInt, iPvconfigparams: MutPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult
