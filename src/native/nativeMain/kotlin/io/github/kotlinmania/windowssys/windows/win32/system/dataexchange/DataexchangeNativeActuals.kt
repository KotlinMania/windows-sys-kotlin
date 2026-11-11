@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_addAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_addAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_addClipboardFormatListener
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_changeClipboardChain
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_closeClipboard
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_countClipboardFormats
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeAccessData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeAddData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeClientTransaction
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeConnect
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeConnectList
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeDisconnect
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeDisconnectList
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeEnableCallback
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeGetData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeGetLastError
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeImpersonateClient
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeInitializeA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeInitializeW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeNameService
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddePostAdvise
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryNextServer
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryStringA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeQueryStringW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeReconnect
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeSetUserHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeUnaccessData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ddeUninitialize
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_deleteAtom
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_emptyClipboard
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_enumClipboardFormats
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_findAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_findAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_freeDDElParam
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getAtomNameA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getAtomNameW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardOwner
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getClipboardViewer
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomExA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomExW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalAddAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalDeleteAtom
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalFindAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalFindAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalGetAtomNameA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_globalGetAtomNameW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_initAtomTable
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_openClipboard
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_packDDElParam
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_registerClipboardFormatA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_registerClipboardFormatW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_reuseDDElParam
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_setClipboardData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_setClipboardViewer
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_setWinMetaFileBits
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_unpackDDElParam
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addAtomA(lpstring: Pcstr): UShort =
    windowssys_windows_win32_system_dataexchange_addAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    windowssys_windows_win32_system_dataexchange_addAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    windowssys_windows_win32_system_dataexchange_addClipboardFormatListener(hwnd?.value?.toCPointer<ByteVar>())

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    windowssys_windows_win32_system_dataexchange_changeClipboardChain(hwndremove?.value?.toCPointer<ByteVar>(), hwndnewnext?.value?.toCPointer<ByteVar>())

public actual fun closeClipboard(): Bool =
    windowssys_windows_win32_system_dataexchange_closeClipboard()

public actual fun countClipboardFormats(): Int =
    windowssys_windows_win32_system_dataexchange_countClipboardFormats()

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    windowssys_windows_win32_system_dataexchange_ddeAbandonTransaction(idinst, hconv?.value?.toCPointer<ByteVar>(), idtransaction)

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_system_dataexchange_ddeAccessData(hdata?.value?.toCPointer<ByteVar>(), pcbdatasize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeAddData(hdata: Hddedata, psrc: COpaquePointer?, cb: UInt, cboff: UInt): Hddedata =
    windowssys_windows_win32_system_dataexchange_ddeAddData(hdata?.value?.toCPointer<ByteVar>(), psrc?.value?.toCPointer<ByteVar>(), cb, cboff)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeClientTransaction(pdata: COpaquePointer?, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: COpaquePointer?): Hddedata =
    windowssys_windows_win32_system_dataexchange_ddeClientTransaction(pdata?.value?.toCPointer<ByteVar>(), cbdata, hconv?.value?.toCPointer<ByteVar>(), hszitem?.value?.toCPointer<ByteVar>(), wfmt, wtype, dwtimeout, pdwresult?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    windowssys_windows_win32_system_dataexchange_ddeCmpStringHandles(hsz1?.value?.toCPointer<ByteVar>(), hsz2?.value?.toCPointer<ByteVar>())

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: COpaquePointer?): Hconv =
    windowssys_windows_win32_system_dataexchange_ddeConnect(idinst, hszservice?.value?.toCPointer<ByteVar>(), hsztopic?.value?.toCPointer<ByteVar>(), pcc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: COpaquePointer?): Hconvlist =
    windowssys_windows_win32_system_dataexchange_ddeConnectList(idinst, hszservice?.value?.toCPointer<ByteVar>(), hsztopic?.value?.toCPointer<ByteVar>(), hconvlist?.value?.toCPointer<ByteVar>(), pcc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: COpaquePointer?, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    windowssys_windows_win32_system_dataexchange_ddeCreateDataHandle(idinst, psrc?.value?.toCPointer<ByteVar>(), cb, cboff, hszitem?.value?.toCPointer<ByteVar>(), wfmt, afcmd)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleA(idinst, psz?.value?.toCPointer<ByteVar>(), icodepage)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    windowssys_windows_win32_system_dataexchange_ddeCreateStringHandleW(idinst, psz?.value?.toCPointer<ByteVar>(), icodepage)?.let { COpaquePointer(it.toLong()) }

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    windowssys_windows_win32_system_dataexchange_ddeDisconnect(hconv?.value?.toCPointer<ByteVar>())

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    windowssys_windows_win32_system_dataexchange_ddeDisconnectList(hconvlist?.value?.toCPointer<ByteVar>())

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    windowssys_windows_win32_system_dataexchange_ddeEnableCallback(idinst, hconv?.value?.toCPointer<ByteVar>(), wcmd)

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    windowssys_windows_win32_system_dataexchange_ddeFreeDataHandle(hdata?.value?.toCPointer<ByteVar>())

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    windowssys_windows_win32_system_dataexchange_ddeFreeStringHandle(idinst, hsz?.value?.toCPointer<ByteVar>())

public actual fun ddeGetData(hdata: Hddedata, pdst: COpaquePointer?, cbmax: UInt, cboff: UInt): UInt =
    windowssys_windows_win32_system_dataexchange_ddeGetData(hdata?.value?.toCPointer<ByteVar>(), pdst?.value?.toCPointer<ByteVar>(), cbmax, cboff)

public actual fun ddeGetLastError(idinst: UInt): UInt =
    windowssys_windows_win32_system_dataexchange_ddeGetLastError(idinst)

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    windowssys_windows_win32_system_dataexchange_ddeImpersonateClient(hconv?.value?.toCPointer<ByteVar>())

public actual fun ddeInitializeA(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    windowssys_windows_win32_system_dataexchange_ddeInitializeA(pidinst?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), afcmd, ulres)

public actual fun ddeInitializeW(pidinst: COpaquePointer?, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    windowssys_windows_win32_system_dataexchange_ddeInitializeW(pidinst?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), afcmd, ulres)

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    windowssys_windows_win32_system_dataexchange_ddeKeepStringHandle(idinst, hsz?.value?.toCPointer<ByteVar>())

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    windowssys_windows_win32_system_dataexchange_ddeNameService(idinst, hsz1?.value?.toCPointer<ByteVar>(), hsz2?.value?.toCPointer<ByteVar>(), afcmd)?.let { COpaquePointer(it.toLong()) }

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    windowssys_windows_win32_system_dataexchange_ddePostAdvise(idinst, hsztopic?.value?.toCPointer<ByteVar>(), hszitem?.value?.toCPointer<ByteVar>())

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: COpaquePointer?): UInt =
    windowssys_windows_win32_system_dataexchange_ddeQueryConvInfo(hconv?.value?.toCPointer<ByteVar>(), idtransaction, pconvinfo?.value?.toCPointer<ByteVar>())

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    windowssys_windows_win32_system_dataexchange_ddeQueryNextServer(hconvlist?.value?.toCPointer<ByteVar>(), hconvprev?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    windowssys_windows_win32_system_dataexchange_ddeQueryStringA(idinst, hsz?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    windowssys_windows_win32_system_dataexchange_ddeQueryStringW(idinst, hsz?.value?.toCPointer<ByteVar>(), psz?.value?.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    windowssys_windows_win32_system_dataexchange_ddeReconnect(hconv?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: COpaquePointer?, pqosprev: COpaquePointer?): Bool =
    windowssys_windows_win32_system_dataexchange_ddeSetQualityOfService(hwndclient?.value?.toCPointer<ByteVar>(), pqosnew?.value?.toCPointer<ByteVar>(), pqosprev?.value?.toCPointer<ByteVar>())

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    windowssys_windows_win32_system_dataexchange_ddeSetUserHandle(hconv?.value?.toCPointer<ByteVar>(), id, huser)

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    windowssys_windows_win32_system_dataexchange_ddeUnaccessData(hdata?.value?.toCPointer<ByteVar>())

public actual fun ddeUninitialize(idinst: UInt): Bool =
    windowssys_windows_win32_system_dataexchange_ddeUninitialize(idinst)

public actual fun deleteAtom(natom: UShort): UShort =
    windowssys_windows_win32_system_dataexchange_deleteAtom(natom)

public actual fun emptyClipboard(): Bool =
    windowssys_windows_win32_system_dataexchange_emptyClipboard()

public actual fun enumClipboardFormats(format: UInt): UInt =
    windowssys_windows_win32_system_dataexchange_enumClipboardFormats(format)

public actual fun findAtomA(lpstring: Pcstr): UShort =
    windowssys_windows_win32_system_dataexchange_findAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    windowssys_windows_win32_system_dataexchange_findAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    windowssys_windows_win32_system_dataexchange_freeDDElParam(msg, lparam)

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    windowssys_windows_win32_system_dataexchange_getAtomNameA(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    windowssys_windows_win32_system_dataexchange_getAtomNameW(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun getClipboardData(uformat: UInt): Handle =
    windowssys_windows_win32_system_dataexchange_getClipboardData(uformat)?.let { COpaquePointer(it.toLong()) }

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    windowssys_windows_win32_system_dataexchange_getClipboardFormatNameA(format, lpszformatname?.value?.toCPointer<ByteVar>(), cchmaxcount)

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    windowssys_windows_win32_system_dataexchange_getClipboardFormatNameW(format, lpszformatname?.value?.toCPointer<ByteVar>(), cchmaxcount)

public actual fun getClipboardOwner(): Hwnd =
    windowssys_windows_win32_system_dataexchange_getClipboardOwner()?.let { COpaquePointer(it.toLong()) }

public actual fun getClipboardSequenceNumber(): UInt =
    windowssys_windows_win32_system_dataexchange_getClipboardSequenceNumber()

public actual fun getClipboardViewer(): Hwnd =
    windowssys_windows_win32_system_dataexchange_getClipboardViewer()?.let { COpaquePointer(it.toLong()) }

public actual fun getOpenClipboardWindow(): Hwnd =
    windowssys_windows_win32_system_dataexchange_getOpenClipboardWindow()?.let { COpaquePointer(it.toLong()) }

public actual fun getPriorityClipboardFormat(paformatprioritylist: COpaquePointer?, cformats: Int): Int =
    windowssys_windows_win32_system_dataexchange_getPriorityClipboardFormat(paformatprioritylist?.value?.toCPointer<ByteVar>(), cformats)

public actual fun getUpdatedClipboardFormats(lpuiformats: COpaquePointer?, cformats: UInt, pcformatsout: COpaquePointer?): Bool =
    windowssys_windows_win32_system_dataexchange_getUpdatedClipboardFormats(lpuiformats?.value?.toCPointer<ByteVar>(), cformats, pcformatsout?.value?.toCPointer<ByteVar>())

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    windowssys_windows_win32_system_dataexchange_globalAddAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    windowssys_windows_win32_system_dataexchange_globalAddAtomExA(lpstring?.value?.toCPointer<ByteVar>(), flags)

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    windowssys_windows_win32_system_dataexchange_globalAddAtomExW(lpstring?.value?.toCPointer<ByteVar>(), flags)

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    windowssys_windows_win32_system_dataexchange_globalAddAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalDeleteAtom(natom: UShort): UShort =
    windowssys_windows_win32_system_dataexchange_globalDeleteAtom(natom)

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    windowssys_windows_win32_system_dataexchange_globalFindAtomA(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    windowssys_windows_win32_system_dataexchange_globalFindAtomW(lpstring?.value?.toCPointer<ByteVar>())

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    windowssys_windows_win32_system_dataexchange_globalGetAtomNameA(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    windowssys_windows_win32_system_dataexchange_globalGetAtomNameW(natom, lpbuffer?.value?.toCPointer<ByteVar>(), nsize)

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    windowssys_windows_win32_system_dataexchange_impersonateDdeClientWindow(hwndclient?.value?.toCPointer<ByteVar>(), hwndserver?.value?.toCPointer<ByteVar>())

public actual fun initAtomTable(nsize: UInt): Bool =
    windowssys_windows_win32_system_dataexchange_initAtomTable(nsize)

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    windowssys_windows_win32_system_dataexchange_isClipboardFormatAvailable(format)

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    windowssys_windows_win32_system_dataexchange_openClipboard(hwndnewowner?.value?.toCPointer<ByteVar>())

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    windowssys_windows_win32_system_dataexchange_packDDElParam(msg, uilo, uihi)

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    windowssys_windows_win32_system_dataexchange_registerClipboardFormatA(lpszformat?.value?.toCPointer<ByteVar>())

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    windowssys_windows_win32_system_dataexchange_registerClipboardFormatW(lpszformat?.value?.toCPointer<ByteVar>())

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    windowssys_windows_win32_system_dataexchange_removeClipboardFormatListener(hwnd?.value?.toCPointer<ByteVar>())

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    windowssys_windows_win32_system_dataexchange_reuseDDElParam(lparam, msgin, msgout, uilo, uihi)

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    windowssys_windows_win32_system_dataexchange_setClipboardData(uformat, hmem?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    windowssys_windows_win32_system_dataexchange_setClipboardViewer(hwndnewviewer?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: COpaquePointer?, hdcref: Hdc, lpmfp: COpaquePointer?): Henhmetafile =
    windowssys_windows_win32_system_dataexchange_setWinMetaFileBits(nsize, lpmeta16data?.value?.toCPointer<ByteVar>(), hdcref?.value?.toCPointer<ByteVar>(), lpmfp?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: COpaquePointer?, puihi: COpaquePointer?): Bool =
    windowssys_windows_win32_system_dataexchange_unpackDDElParam(msg, lparam, puilo?.value?.toCPointer<ByteVar>(), puihi?.value?.toCPointer<ByteVar>())
