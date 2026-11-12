@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityQualityOfService

private object WindowsWin32SystemDataexchangeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeAddAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeAddAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeChangeClipboardChain(hwndremove: Long, hwndnewnext: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeCloseClipboard(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeCountClipboardFormats(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(idinst: Int, hconv: Long, idtransaction: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeAccessData(hdata: Long, pcbdatasize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeAddData(hdata: Long, psrc: Long, cb: Int, cboff: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeClientTransaction(pdata: Long, cbdata: Int, hconv: Long, hszitem: Long, wfmt: Int, wtype: Int, dwtimeout: Int, pdwresult: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(hsz1: Long, hsz2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeConnect(idinst: Int, hszservice: Long, hsztopic: Long, pcc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeConnectList(idinst: Int, hszservice: Long, hsztopic: Long, hconvlist: Long, pcc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(idinst: Int, psrc: Long, cb: Int, cboff: Int, hszitem: Long, wfmt: Int, afcmd: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(idinst: Int, psz: Long, icodepage: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(idinst: Int, psz: Long, icodepage: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeDisconnect(hconv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeDisconnectList(hconvlist: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeEnableCallback(idinst: Int, hconv: Long, wcmd: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(hdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(idinst: Int, hsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeGetData(hdata: Long, pdst: Long, cbmax: Int, cboff: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(hconv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeInitializeA(pidinst: Long, pfncallback: Long, afcmd: Int, ulres: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeInitializeW(pidinst: Long, pfncallback: Long, afcmd: Int, ulres: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(idinst: Int, hsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeNameService(idinst: Int, hsz1: Long, hsz2: Long, afcmd: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdePostAdvise(idinst: Int, hsztopic: Long, hszitem: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(hconv: Long, idtransaction: Int, pconvinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(hconvlist: Long, hconvprev: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeQueryStringA(idinst: Int, hsz: Long, psz: Long, cchmax: Int, icodepage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeQueryStringW(idinst: Int, hsz: Long, psz: Long, cchmax: Int, icodepage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeReconnect(hconv: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(hwndclient: Long, pqosnew: Long, pqosprev: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(hconv: Long, id: Int, huser: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeUnaccessData(hdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeDeleteAtom(natom: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeEmptyClipboard(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeFindAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeFindAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetAtomNameA(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetAtomNameW(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetClipboardData(uformat: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(format: Int, lpszformatname: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(format: Int, lpszformatname: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetClipboardOwner(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber(): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetClipboardViewer(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(lpuiformats: Long, cformats: Int, pcformatsout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(lpstring: Long, flags: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(lpstring: Long, flags: Int): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom: Short): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(hwndclient: Long, hwndserver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeOpenClipboard(hwndnewowner: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangePackDDElParam(msg: Int, uilo: Long, uihi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(lpszformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(lpszformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam: Long, msgin: Int, msgout: Int, uilo: Long, uihi: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeSetClipboardData(uformat: Int, hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeSetClipboardViewer(hwndnewviewer: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(nsize: Int, lpmeta16data: Long, hdcref: Long, lpmfp: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDataexchangeUnpackDDElParam(msg: Int, lparam: Long, puilo: Long, puihi: Long): Int
}

public actual fun addAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeAddAtomA(lpstring.rawAddress).toUShort()

public actual fun addAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeAddAtomW(lpstring.rawAddress).toUShort()

public actual fun addClipboardFormatListener(hwnd: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeAddClipboardFormatListener(hwnd.rawAddress)

public actual fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeChangeClipboardChain(hwndremove.rawAddress, hwndnewnext.rawAddress)

public actual fun closeClipboard(): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeCloseClipboard()

public actual fun countClipboardFormats(): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeCountClipboardFormats()

public actual fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeAbandonTransaction(idinst.toInt(), hconv.rawAddress, idtransaction.toInt())

public actual fun ddeAccessData(hdata: Hddedata, pcbdatasize: MutPtr<UInt>): MutPtr<UByte> =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeAccessData(hdata.rawAddress, pcbdatasize.rawAddress))

public actual fun ddeAddData(hdata: Hddedata, psrc: ConstPtr<UByte>, cb: UInt, cboff: UInt): Hddedata =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeAddData(hdata.rawAddress, psrc.rawAddress, cb.toInt(), cboff.toInt()))

public actual fun ddeClientTransaction(pdata: ConstPtr<UByte>, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: MutPtr<UInt>): Hddedata =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeClientTransaction(pdata.rawAddress, cbdata.toInt(), hconv.rawAddress, hszitem.rawAddress, wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), pdwresult.rawAddress))

public actual fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeCmpStringHandles(hsz1.rawAddress, hsz2.rawAddress)

public actual fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: ConstPtr<Convcontext>): Hconv =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeConnect(idinst.toInt(), hszservice.rawAddress, hsztopic.rawAddress, pcc.rawAddress))

public actual fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: ConstPtr<Convcontext>): Hconvlist =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeConnectList(idinst.toInt(), hszservice.rawAddress, hsztopic.rawAddress, hconvlist.rawAddress, pcc.rawAddress))

public actual fun ddeCreateDataHandle(idinst: UInt, psrc: ConstPtr<UByte>, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeCreateDataHandle(idinst.toInt(), psrc.rawAddress, cb.toInt(), cboff.toInt(), hszitem.rawAddress, wfmt.toInt(), afcmd.toInt()))

public actual fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleA(idinst.toInt(), psz.rawAddress, icodepage))

public actual fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeCreateStringHandleW(idinst.toInt(), psz.rawAddress, icodepage))

public actual fun ddeDisconnect(hconv: Hconv): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeDisconnect(hconv.rawAddress)

public actual fun ddeDisconnectList(hconvlist: Hconvlist): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeDisconnectList(hconvlist.rawAddress)

public actual fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeEnableCallback(idinst.toInt(), hconv.rawAddress, wcmd.toInt())

public actual fun ddeFreeDataHandle(hdata: Hddedata): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeFreeDataHandle(hdata.rawAddress)

public actual fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeFreeStringHandle(idinst.toInt(), hsz.rawAddress)

public actual fun ddeGetData(hdata: Hddedata, pdst: MutPtr<UByte>, cbmax: UInt, cboff: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeGetData(hdata.rawAddress, pdst.rawAddress, cbmax.toInt(), cboff.toInt()).toUInt()

public actual fun ddeGetLastError(idinst: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeGetLastError(idinst.toInt()).toUInt()

public actual fun ddeImpersonateClient(hconv: Hconv): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeImpersonateClient(hconv.rawAddress)

public actual fun ddeInitializeA(pidinst: MutPtr<UInt>, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeInitializeA(pidinst.rawAddress, 0L, afcmd.toInt(), ulres.toInt()).toUInt()

public actual fun ddeInitializeW(pidinst: MutPtr<UInt>, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeInitializeW(pidinst.rawAddress, 0L, afcmd.toInt(), ulres.toInt()).toUInt()

public actual fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeKeepStringHandle(idinst.toInt(), hsz.rawAddress)

public actual fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeNameService(idinst.toInt(), hsz1.rawAddress, hsz2.rawAddress, afcmd.toInt()))

public actual fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdePostAdvise(idinst.toInt(), hsztopic.rawAddress, hszitem.rawAddress)

public actual fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: MutPtr<Convinfo>): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeQueryConvInfo(hconv.rawAddress, idtransaction.toInt(), pconvinfo.rawAddress).toUInt()

public actual fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeQueryNextServer(hconvlist.rawAddress, hconvprev.rawAddress))

public actual fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeQueryStringA(idinst.toInt(), hsz.rawAddress, psz.rawAddress, cchmax.toInt(), icodepage).toUInt()

public actual fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeQueryStringW(idinst.toInt(), hsz.rawAddress, psz.rawAddress, cchmax.toInt(), icodepage).toUInt()

public actual fun ddeReconnect(hconv: Hconv): Hconv =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeReconnect(hconv.rawAddress))

public actual fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: ConstPtr<SecurityQualityOfService>, pqosprev: MutPtr<SecurityQualityOfService>): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeSetQualityOfService(hwndclient.rawAddress, pqosnew.rawAddress, pqosprev.rawAddress)

public actual fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeSetUserHandle(hconv.rawAddress, id.toInt(), huser.toLong())

public actual fun ddeUnaccessData(hdata: Hddedata): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeUnaccessData(hdata.rawAddress)

public actual fun ddeUninitialize(idinst: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDdeUninitialize(idinst.toInt())

public actual fun deleteAtom(natom: UShort): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeDeleteAtom(natom.toShort()).toUShort()

public actual fun emptyClipboard(): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeEmptyClipboard()

public actual fun enumClipboardFormats(format: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeEnumClipboardFormats(format.toInt()).toUInt()

public actual fun findAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeFindAtomA(lpstring.rawAddress).toUShort()

public actual fun findAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeFindAtomW(lpstring.rawAddress).toUShort()

public actual fun freeDDElParam(msg: UInt, lparam: Lparam): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeFreeDDElParam(msg.toInt(), lparam)

public actual fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetAtomNameA(natom.toShort(), lpbuffer.rawAddress, nsize).toUInt()

public actual fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetAtomNameW(natom.toShort(), lpbuffer.rawAddress, nsize).toUInt()

public actual fun getClipboardData(uformat: UInt): Handle =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetClipboardData(uformat.toInt()))

public actual fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameA(format.toInt(), lpszformatname.rawAddress, cchmaxcount)

public actual fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetClipboardFormatNameW(format.toInt(), lpszformatname.rawAddress, cchmaxcount)

public actual fun getClipboardOwner(): Hwnd =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetClipboardOwner())

public actual fun getClipboardSequenceNumber(): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetClipboardSequenceNumber().toUInt()

public actual fun getClipboardViewer(): Hwnd =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetClipboardViewer())

public actual fun getOpenClipboardWindow(): Hwnd =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetOpenClipboardWindow())

public actual fun getPriorityClipboardFormat(paformatprioritylist: ConstPtr<UInt>, cformats: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetPriorityClipboardFormat(paformatprioritylist.rawAddress, cformats)

public actual fun getUpdatedClipboardFormats(lpuiformats: MutPtr<UInt>, cformats: UInt, pcformatsout: MutPtr<UInt>): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGetUpdatedClipboardFormats(lpuiformats.rawAddress, cformats.toInt(), pcformatsout.rawAddress)

public actual fun globalAddAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomA(lpstring.rawAddress).toUShort()

public actual fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExA(lpstring.rawAddress, flags.toInt()).toUShort()

public actual fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomExW(lpstring.rawAddress, flags.toInt()).toUShort()

public actual fun globalAddAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalAddAtomW(lpstring.rawAddress).toUShort()

public actual fun globalDeleteAtom(natom: UShort): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalDeleteAtom(natom.toShort()).toUShort()

public actual fun globalFindAtomA(lpstring: Pcstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomA(lpstring.rawAddress).toUShort()

public actual fun globalFindAtomW(lpstring: Pcwstr): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalFindAtomW(lpstring.rawAddress).toUShort()

public actual fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameA(natom.toShort(), lpbuffer.rawAddress, nsize).toUInt()

public actual fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeGlobalGetAtomNameW(natom.toShort(), lpbuffer.rawAddress, nsize).toUInt()

public actual fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeImpersonateDdeClientWindow(hwndclient.rawAddress, hwndserver.rawAddress)

public actual fun initAtomTable(nsize: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeInitAtomTable(nsize.toInt())

public actual fun isClipboardFormatAvailable(format: UInt): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeIsClipboardFormatAvailable(format.toInt())

public actual fun openClipboard(hwndnewowner: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeOpenClipboard(hwndnewowner.rawAddress)

public actual fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangePackDDElParam(msg.toInt(), uilo.toLong(), uihi.toLong())

public actual fun registerClipboardFormatA(lpszformat: Pcstr): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatA(lpszformat.rawAddress).toUInt()

public actual fun registerClipboardFormatW(lpszformat: Pcwstr): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeRegisterClipboardFormatW(lpszformat.rawAddress).toUInt()

public actual fun removeClipboardFormatListener(hwnd: Hwnd): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeRemoveClipboardFormatListener(hwnd.rawAddress)

public actual fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeReuseDDElParam(lparam, msgin.toInt(), msgout.toInt(), uilo.toLong(), uihi.toLong())

public actual fun setClipboardData(uformat: UInt, hmem: Handle): Handle =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeSetClipboardData(uformat.toInt(), hmem.rawAddress))

public actual fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeSetClipboardViewer(hwndnewviewer.rawAddress))

public actual fun setWinMetaFileBits(nsize: UInt, lpmeta16data: ConstPtr<UByte>, hdcref: Hdc, lpmfp: ConstPtr<Metafilepict>): Henhmetafile =
    MutPtr(WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeSetWinMetaFileBits(nsize.toInt(), lpmeta16data.rawAddress, hdcref.rawAddress, lpmfp.rawAddress))

public actual fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: MutPtr<ULong>, puihi: MutPtr<ULong>): Bool =
    WindowsWin32SystemDataexchangeJniBridge.windowssysWindowsWin32SystemDataexchangeUnpackDDElParam(msg.toInt(), lparam, puilo.rawAddress, puihi.rawAddress)
