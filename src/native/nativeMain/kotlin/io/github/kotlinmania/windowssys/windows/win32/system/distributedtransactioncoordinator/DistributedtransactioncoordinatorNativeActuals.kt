@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager
import io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC
import io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA
import io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr<Guid>, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManager(iPszhost.rawAddress.toCPointer<ByteVar>(), iPsztmname.rawAddress.toCPointer<ByteVar>(), iRiid.rawAddress.toCPointer<ByteVar>(), iDwreserved1, iWcbreserved2, iPvreserved2.rawAddress.toCPointer<ByteVar>(), oPpvobject.rawAddress.toCPointer<ByteVar>())

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr<Guid>, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: ConstPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerC(iPszhost.rawAddress.toCPointer<ByteVar>(), iPsztmname.rawAddress.toCPointer<ByteVar>(), iRiid.rawAddress.toCPointer<ByteVar>(), iDwreserved1, iWcbreserved2, iPvreserved2.rawAddress.toCPointer<ByteVar>(), oPpvobject.rawAddress.toCPointer<ByteVar>())

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: ConstPtr<Guid>, iGrfoptions: UInt, iPvconfigparams: MutPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExA(iPszhost.rawAddress.toCPointer<ByteVar>(), iPsztmname.rawAddress.toCPointer<ByteVar>(), iRiid.rawAddress.toCPointer<ByteVar>(), iGrfoptions, iPvconfigparams.rawAddress.toCPointer<ByteVar>(), oPpvobject.rawAddress.toCPointer<ByteVar>())

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: ConstPtr<Guid>, iGrfoptions: UInt, iPvconfigparams: MutPtr<CVoid>, oPpvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    windowssysWindowsWin32SystemDistributedtransactioncoordinatorDtcGetTransactionManagerExW(iPwszhost.rawAddress.toCPointer<ByteVar>(), iPwsztmname.rawAddress.toCPointer<ByteVar>(), iRiid.rawAddress.toCPointer<ByteVar>(), iGrfoptions, iPvconfigparams.rawAddress.toCPointer<ByteVar>(), oPpvobject.rawAddress.toCPointer<ByteVar>())
