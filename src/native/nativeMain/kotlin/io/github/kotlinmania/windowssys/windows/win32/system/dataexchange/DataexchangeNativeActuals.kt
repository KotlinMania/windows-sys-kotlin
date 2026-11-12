@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeAddAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeAddAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeChangeClipboardChain
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeCloseClipboard
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeCountClipboardFormats
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeAccessData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeAddData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeClientTransaction
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeConnect
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeConnectList
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeDisconnect
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeDisconnectList
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeEnableCallback
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeGetData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeGetLastError
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeInitializeA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeInitializeW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeNameService
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdePostAdvise
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeQueryStringA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeQueryStringW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeReconnect
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeUnaccessData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDdeUninitialize
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeDeleteAtom
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeEmptyClipboard
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeFindAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeFindAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeFreeDDElParam
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetAtomNameA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetAtomNameW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetClipboardData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetClipboardOwner
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetClipboardViewer
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeInitAtomTable
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeOpenClipboard
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangePackDDElParam
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeReuseDDElParam
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeSetClipboardData
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeSetClipboardViewer
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits
import io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssysWindowsWin32SystemDataexchangeUnpackDDElParam
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun addAtomA(lpstring: Pcstr): UShort =
    windowssysWindowsWin32SystemDataexchangeAddAtomA(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    windowssysWindowsWin32SystemDataexchangeAddAtomW(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    windowssysWindowsWin32SystemDataexchangeChangeClipboardChain(hwndremove.rawAddress.toCPointer<ByteVar>(), hwndnewnext.rawAddress.toCPointer<ByteVar>())

public actual fun closeClipboard(): Bool =
    windowssysWindowsWin32SystemDataexchangeCloseClipboard()

public actual fun countClipboardFormats(): Int =
    windowssysWindowsWin32SystemDataexchangeCountClipboardFormats()

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(idinst, hconv.rawAddress.toCPointer<ByteVar>(), idtransaction)

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeAccessData(hdata.rawAddress.toCPointer<ByteVar>(), pcbdatasize.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ddeAddData(hdata: Hddedata, psrc: ConstPtr, cb: UInt, cboff: UInt): Hddedata =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeAddData(hdata.rawAddress.toCPointer<ByteVar>(), psrc.rawAddress.toCPointer<ByteVar>(), cb, cboff)?.toLong() ?: 0L)

public actual fun ddeClientTransaction(pdata: ConstPtr, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: MutPtr): Hddedata =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeClientTransaction(pdata.rawAddress.toCPointer<ByteVar>(), cbdata, hconv.rawAddress.toCPointer<ByteVar>(), hszitem.rawAddress.toCPointer<ByteVar>(), wfmt, wtype, dwtimeout, pdwresult.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(hsz1.rawAddress.toCPointer<ByteVar>(), hsz2.rawAddress.toCPointer<ByteVar>())

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: ConstPtr): Hconv =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeConnect(idinst, hszservice.rawAddress.toCPointer<ByteVar>(), hsztopic.rawAddress.toCPointer<ByteVar>(), pcc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: ConstPtr): Hconvlist =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeConnectList(idinst, hszservice.rawAddress.toCPointer<ByteVar>(), hsztopic.rawAddress.toCPointer<ByteVar>(), hconvlist.rawAddress.toCPointer<ByteVar>(), pcc.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: ConstPtr, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(idinst, psrc.rawAddress.toCPointer<ByteVar>(), cb, cboff, hszitem.rawAddress.toCPointer<ByteVar>(), wfmt, afcmd)?.toLong() ?: 0L)

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(idinst, psz.rawAddress.toCPointer<ByteVar>(), icodepage)?.toLong() ?: 0L)

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(idinst, psz.rawAddress.toCPointer<ByteVar>(), icodepage)?.toLong() ?: 0L)

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeDisconnect(hconv.rawAddress.toCPointer<ByteVar>())

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeDisconnectList(hconvlist.rawAddress.toCPointer<ByteVar>())

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeEnableCallback(idinst, hconv.rawAddress.toCPointer<ByteVar>(), wcmd)

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(hdata.rawAddress.toCPointer<ByteVar>())

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(idinst, hsz.rawAddress.toCPointer<ByteVar>())

public actual fun ddeGetData(hdata: Hddedata, pdst: MutPtr, cbmax: UInt, cboff: UInt): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeGetData(hdata.rawAddress.toCPointer<ByteVar>(), pdst.rawAddress.toCPointer<ByteVar>(), cbmax, cboff)

public actual fun ddeGetLastError(idinst: UInt): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst)

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(hconv.rawAddress.toCPointer<ByteVar>())

public actual fun ddeInitializeA(pidinst: MutPtr, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeInitializeA(pidinst.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), afcmd, ulres)

public actual fun ddeInitializeW(pidinst: MutPtr, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeInitializeW(pidinst.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), afcmd, ulres)

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(idinst, hsz.rawAddress.toCPointer<ByteVar>())

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeNameService(idinst, hsz1.rawAddress.toCPointer<ByteVar>(), hsz2.rawAddress.toCPointer<ByteVar>(), afcmd)?.toLong() ?: 0L)

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    windowssysWindowsWin32SystemDataexchangeDdePostAdvise(idinst, hsztopic.rawAddress.toCPointer<ByteVar>(), hszitem.rawAddress.toCPointer<ByteVar>())

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: MutPtr): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(hconv.rawAddress.toCPointer<ByteVar>(), idtransaction, pconvinfo.rawAddress.toCPointer<ByteVar>())

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(hconvlist.rawAddress.toCPointer<ByteVar>(), hconvprev.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeQueryStringA(idinst, hsz.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    windowssysWindowsWin32SystemDataexchangeDdeQueryStringW(idinst, hsz.rawAddress.toCPointer<ByteVar>(), psz.rawAddress.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    MutPtr(windowssysWindowsWin32SystemDataexchangeDdeReconnect(hconv.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: ConstPtr, pqosprev: MutPtr): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(hwndclient.rawAddress.toCPointer<ByteVar>(), pqosnew.rawAddress.toCPointer<ByteVar>(), pqosprev.rawAddress.toCPointer<ByteVar>())

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(hconv.rawAddress.toCPointer<ByteVar>(), id, huser)

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeUnaccessData(hdata.rawAddress.toCPointer<ByteVar>())

public actual fun ddeUninitialize(idinst: UInt): Bool =
    windowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst)

public actual fun deleteAtom(natom: UShort): UShort =
    windowssysWindowsWin32SystemDataexchangeDeleteAtom(natom)

public actual fun emptyClipboard(): Bool =
    windowssysWindowsWin32SystemDataexchangeEmptyClipboard()

public actual fun enumClipboardFormats(format: UInt): UInt =
    windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format)

public actual fun findAtomA(lpstring: Pcstr): UShort =
    windowssysWindowsWin32SystemDataexchangeFindAtomA(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    windowssysWindowsWin32SystemDataexchangeFindAtomW(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    windowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg, lparam)

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    windowssysWindowsWin32SystemDataexchangeGetAtomNameA(natom, lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    windowssysWindowsWin32SystemDataexchangeGetAtomNameW(natom, lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun getClipboardData(uformat: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemDataexchangeGetClipboardData(uformat)?.toLong() ?: 0L)

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(format, lpszformatname.rawAddress.toCPointer<ByteVar>(), cchmaxcount)

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(format, lpszformatname.rawAddress.toCPointer<ByteVar>(), cchmaxcount)

public actual fun getClipboardOwner(): Hwnd =
    MutPtr(windowssysWindowsWin32SystemDataexchangeGetClipboardOwner()?.toLong() ?: 0L)

public actual fun getClipboardSequenceNumber(): UInt =
    windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber()

public actual fun getClipboardViewer(): Hwnd =
    MutPtr(windowssysWindowsWin32SystemDataexchangeGetClipboardViewer()?.toLong() ?: 0L)

public actual fun getOpenClipboardWindow(): Hwnd =
    MutPtr(windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow()?.toLong() ?: 0L)

public actual fun getPriorityClipboardFormat(paformatprioritylist: ConstPtr, cformats: Int): Int =
    windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(paformatprioritylist.rawAddress.toCPointer<ByteVar>(), cformats)

public actual fun getUpdatedClipboardFormats(lpuiformats: MutPtr, cformats: UInt, pcformatsout: MutPtr): Bool =
    windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(lpuiformats.rawAddress.toCPointer<ByteVar>(), cformats, pcformatsout.rawAddress.toCPointer<ByteVar>())

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(lpstring.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(lpstring.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun globalDeleteAtom(natom: UShort): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom)

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(lpstring.rawAddress.toCPointer<ByteVar>())

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(natom, lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(natom, lpbuffer.rawAddress.toCPointer<ByteVar>(), nsize)

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(hwndclient.rawAddress.toCPointer<ByteVar>(), hwndserver.rawAddress.toCPointer<ByteVar>())

public actual fun initAtomTable(nsize: UInt): Bool =
    windowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize)

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format)

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    windowssysWindowsWin32SystemDataexchangeOpenClipboard(hwndnewowner.rawAddress.toCPointer<ByteVar>())

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    windowssysWindowsWin32SystemDataexchangePackDDElParam(msg, uilo, uihi)

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(lpszformat.rawAddress.toCPointer<ByteVar>())

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(lpszformat.rawAddress.toCPointer<ByteVar>())

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    windowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam, msgin, msgout, uilo, uihi)

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    MutPtr(windowssysWindowsWin32SystemDataexchangeSetClipboardData(uformat, hmem.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    MutPtr(windowssysWindowsWin32SystemDataexchangeSetClipboardViewer(hwndnewviewer.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: ConstPtr, hdcref: Hdc, lpmfp: ConstPtr): Henhmetafile =
    MutPtr(windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(nsize, lpmeta16data.rawAddress.toCPointer<ByteVar>(), hdcref.rawAddress.toCPointer<ByteVar>(), lpmfp.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: MutPtr, puihi: MutPtr): Bool =
    windowssysWindowsWin32SystemDataexchangeUnpackDDElParam(msg, lparam, puilo.rawAddress.toCPointer<ByteVar>(), puihi.rawAddress.toCPointer<ByteVar>())
