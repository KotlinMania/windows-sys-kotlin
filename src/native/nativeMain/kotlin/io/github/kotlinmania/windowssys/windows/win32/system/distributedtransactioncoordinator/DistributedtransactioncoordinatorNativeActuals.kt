@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun dtcGetTransactionManager(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManager(iPszhost?.value?.toCPointer<ByteVar>(), iPsztmname?.value?.toCPointer<ByteVar>(), iRiid?.value?.toCPointer<ByteVar>(), iDwreserved1, iWcbreserved2, iPvreserved2?.value?.toCPointer<ByteVar>(), oPpvobject?.value?.toCPointer<ByteVar>())

public actual fun dtcGetTransactionManagerC(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iDwreserved1: UInt, iWcbreserved2: UShort, iPvreserved2: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerC(iPszhost?.value?.toCPointer<ByteVar>(), iPsztmname?.value?.toCPointer<ByteVar>(), iRiid?.value?.toCPointer<ByteVar>(), iDwreserved1, iWcbreserved2, iPvreserved2?.value?.toCPointer<ByteVar>(), oPpvobject?.value?.toCPointer<ByteVar>())

public actual fun dtcGetTransactionManagerExA(iPszhost: Pcstr, iPsztmname: Pcstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExA(iPszhost?.value?.toCPointer<ByteVar>(), iPsztmname?.value?.toCPointer<ByteVar>(), iRiid?.value?.toCPointer<ByteVar>(), iGrfoptions, iPvconfigparams?.value?.toCPointer<ByteVar>(), oPpvobject?.value?.toCPointer<ByteVar>())

public actual fun dtcGetTransactionManagerExW(iPwszhost: Pcwstr, iPwsztmname: Pcwstr, iRiid: COpaquePointer?, iGrfoptions: UInt, iPvconfigparams: COpaquePointer?, oPpvobject: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator.cinterop.windowssys_windows_win32_system_distributedtransactioncoordinator_dtcGetTransactionManagerExW(iPwszhost?.value?.toCPointer<ByteVar>(), iPwsztmname?.value?.toCPointer<ByteVar>(), iRiid?.value?.toCPointer<ByteVar>(), iGrfoptions, iPvconfigparams?.value?.toCPointer<ByteVar>(), oPpvobject?.value?.toCPointer<ByteVar>())
