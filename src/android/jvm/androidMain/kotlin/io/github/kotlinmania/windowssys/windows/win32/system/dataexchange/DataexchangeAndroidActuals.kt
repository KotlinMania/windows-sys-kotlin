@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.dataexchange

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE

private object WindowsWin32SystemDataexchangeJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_AddAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_AddAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_AddClipboardFormatListener(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ChangeClipboardChain(hwndremove: Long, hwndnewnext: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_CloseClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_CountClipboardFormats(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeAbandonTransaction(idinst: Int, hconv: Long, idtransaction: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeAccessData(hdata: Long, pcbdatasize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeAddData(hdata: Long, psrc: Long, cb: Int, cboff: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeClientTransaction(pdata: Long, cbdata: Int, hconv: Long, hszitem: Long, wfmt: Int, wtype: Int, dwtimeout: Int, pdwresult: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeCmpStringHandles(hsz1: Long, hsz2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeConnect(idinst: Int, hszservice: Long, hsztopic: Long, pcc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeConnectList(idinst: Int, hszservice: Long, hsztopic: Long, hconvlist: Long, pcc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeCreateDataHandle(idinst: Int, psrc: Long, cb: Int, cboff: Int, hszitem: Long, wfmt: Int, afcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleA(idinst: Int, psz: Long, icodepage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleW(idinst: Int, psz: Long, icodepage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeDisconnect(hconv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeDisconnectList(hconvlist: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeEnableCallback(idinst: Int, hconv: Long, wcmd: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeFreeDataHandle(hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeFreeStringHandle(idinst: Int, hsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeGetData(hdata: Long, pdst: Long, cbmax: Int, cboff: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeGetLastError(idinst: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeImpersonateClient(hconv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeInitializeA(pidinst: Long, pfncallback: Long, afcmd: Int, ulres: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeInitializeW(pidinst: Long, pfncallback: Long, afcmd: Int, ulres: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeKeepStringHandle(idinst: Int, hsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeNameService(idinst: Int, hsz1: Long, hsz2: Long, afcmd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdePostAdvise(idinst: Int, hsztopic: Long, hszitem: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeQueryConvInfo(hconv: Long, idtransaction: Int, pconvinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeQueryNextServer(hconvlist: Long, hconvprev: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeQueryStringA(idinst: Int, hsz: Long, psz: Long, cchmax: Int, icodepage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeQueryStringW(idinst: Int, hsz: Long, psz: Long, cchmax: Int, icodepage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeReconnect(hconv: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeSetQualityOfService(hwndclient: Long, pqosnew: Long, pqosprev: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeSetUserHandle(hconv: Long, id: Int, huser: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeUnaccessData(hdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DdeUninitialize(idinst: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_DeleteAtom(natom: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_EmptyClipboard(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_EnumClipboardFormats(format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_FindAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_FindAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_FreeDDElParam(msg: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetAtomNameA(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetAtomNameW(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetClipboardData(uformat: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameA(format: Int, lpszformatname: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameW(format: Int, lpszformatname: Long, cchmaxcount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetClipboardOwner(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetClipboardSequenceNumber(): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetClipboardViewer(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetOpenClipboardWindow(): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GetUpdatedClipboardFormats(lpuiformats: Long, cformats: Int, pcformatsout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalAddAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalAddAtomExA(lpstring: Long, flags: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalAddAtomExW(lpstring: Long, flags: Int): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalAddAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalDeleteAtom(natom: Short): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalFindAtomA(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalFindAtomW(lpstring: Long): Short

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameA(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameW(natom: Short, lpbuffer: Long, nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ImpersonateDdeClientWindow(hwndclient: Long, hwndserver: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_InitAtomTable(nsize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_IsClipboardFormatAvailable(format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_OpenClipboard(hwndnewowner: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_PackDDElParam(msg: Int, uilo: Long, uihi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatA(lpszformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatW(lpszformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_RemoveClipboardFormatListener(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_ReuseDDElParam(lparam: Long, msgin: Int, msgout: Int, uilo: Long, uihi: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_SetClipboardData(uformat: Int, hmem: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_SetClipboardViewer(hwndnewviewer: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_SetWinMetaFileBits(nsize: Int, lpmeta16data: Long, hdcref: Long, lpmfp: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_dataexchange_UnpackDDElParam(msg: Int, lparam: Long, puilo: Long, puihi: Long): Int
}

public actual fun AddAtomA(lpstring: PCSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_AddAtomA(lpstring).toUShort()

public actual fun AddAtomW(lpstring: PCWSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_AddAtomW(lpstring).toUShort()

public actual fun AddClipboardFormatListener(hwnd: HWND): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_AddClipboardFormatListener(hwnd)

public actual fun ChangeClipboardChain(hwndremove: HWND, hwndnewnext: HWND): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ChangeClipboardChain(hwndremove, hwndnewnext)

public actual fun CloseClipboard(): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_CloseClipboard()

public actual fun CountClipboardFormats(): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_CountClipboardFormats()

public actual fun DdeAbandonTransaction(idinst: UInt, hconv: HCONV, idtransaction: UInt): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeAbandonTransaction(idinst.toInt(), hconv, idtransaction.toInt())

public actual fun DdeAccessData(hdata: HDDEDATA, pcbdatasize: Long): Long =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeAccessData(hdata, pcbdatasize)

public actual fun DdeAddData(hdata: HDDEDATA, psrc: Long, cb: UInt, cboff: UInt): HDDEDATA =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeAddData(hdata, psrc, cb.toInt(), cboff.toInt())

public actual fun DdeClientTransaction(pdata: Long, cbdata: UInt, hconv: HCONV, hszitem: HSZ, wfmt: UInt, wtype: DDE_CLIENT_TRANSACTION_TYPE, dwtimeout: UInt, pdwresult: Long): HDDEDATA =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeClientTransaction(pdata, cbdata.toInt(), hconv, hszitem, wfmt.toInt(), wtype.toInt(), dwtimeout.toInt(), pdwresult)

public actual fun DdeCmpStringHandles(hsz1: HSZ, hsz2: HSZ): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeCmpStringHandles(hsz1, hsz2)

public actual fun DdeConnect(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, pcc: Long): HCONV =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeConnect(idinst.toInt(), hszservice, hsztopic, pcc)

public actual fun DdeConnectList(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, hconvlist: HCONVLIST, pcc: Long): HCONVLIST =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeConnectList(idinst.toInt(), hszservice, hsztopic, hconvlist, pcc)

public actual fun DdeCreateDataHandle(idinst: UInt, psrc: Long, cb: UInt, cboff: UInt, hszitem: HSZ, wfmt: UInt, afcmd: UInt): HDDEDATA =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeCreateDataHandle(idinst.toInt(), psrc, cb.toInt(), cboff.toInt(), hszitem, wfmt.toInt(), afcmd.toInt())

public actual fun DdeCreateStringHandleA(idinst: UInt, psz: PCSTR, icodepage: Int): HSZ =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleA(idinst.toInt(), psz, icodepage)

public actual fun DdeCreateStringHandleW(idinst: UInt, psz: PCWSTR, icodepage: Int): HSZ =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleW(idinst.toInt(), psz, icodepage)

public actual fun DdeDisconnect(hconv: HCONV): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeDisconnect(hconv)

public actual fun DdeDisconnectList(hconvlist: HCONVLIST): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeDisconnectList(hconvlist)

public actual fun DdeEnableCallback(idinst: UInt, hconv: HCONV, wcmd: DDE_ENABLE_CALLBACK_CMD): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeEnableCallback(idinst.toInt(), hconv, wcmd.toInt())

public actual fun DdeFreeDataHandle(hdata: HDDEDATA): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeFreeDataHandle(hdata)

public actual fun DdeFreeStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeFreeStringHandle(idinst.toInt(), hsz)

public actual fun DdeGetData(hdata: HDDEDATA, pdst: Long, cbmax: UInt, cboff: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeGetData(hdata, pdst, cbmax.toInt(), cboff.toInt()).toUInt()

public actual fun DdeGetLastError(idinst: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeGetLastError(idinst.toInt()).toUInt()

public actual fun DdeImpersonateClient(hconv: HCONV): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeImpersonateClient(hconv)

public actual fun DdeInitializeA(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeInitializeA(pidinst, pfncallback.toLong(), afcmd.toInt(), ulres.toInt()).toUInt()

public actual fun DdeInitializeW(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeInitializeW(pidinst, pfncallback.toLong(), afcmd.toInt(), ulres.toInt()).toUInt()

public actual fun DdeKeepStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeKeepStringHandle(idinst.toInt(), hsz)

public actual fun DdeNameService(idinst: UInt, hsz1: HSZ, hsz2: HSZ, afcmd: DDE_NAME_SERVICE_CMD): HDDEDATA =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeNameService(idinst.toInt(), hsz1, hsz2, afcmd.toInt())

public actual fun DdePostAdvise(idinst: UInt, hsztopic: HSZ, hszitem: HSZ): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdePostAdvise(idinst.toInt(), hsztopic, hszitem)

public actual fun DdeQueryConvInfo(hconv: HCONV, idtransaction: UInt, pconvinfo: Long): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeQueryConvInfo(hconv, idtransaction.toInt(), pconvinfo).toUInt()

public actual fun DdeQueryNextServer(hconvlist: HCONVLIST, hconvprev: HCONV): HCONV =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeQueryNextServer(hconvlist, hconvprev)

public actual fun DdeQueryStringA(idinst: UInt, hsz: HSZ, psz: PSTR, cchmax: UInt, icodepage: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeQueryStringA(idinst.toInt(), hsz, psz, cchmax.toInt(), icodepage).toUInt()

public actual fun DdeQueryStringW(idinst: UInt, hsz: HSZ, psz: PWSTR, cchmax: UInt, icodepage: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeQueryStringW(idinst.toInt(), hsz, psz, cchmax.toInt(), icodepage).toUInt()

public actual fun DdeReconnect(hconv: HCONV): HCONV =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeReconnect(hconv)

public actual fun DdeSetQualityOfService(hwndclient: HWND, pqosnew: Long, pqosprev: Long): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeSetQualityOfService(hwndclient, pqosnew, pqosprev)

public actual fun DdeSetUserHandle(hconv: HCONV, id: UInt, huser: ULong): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeSetUserHandle(hconv, id.toInt(), huser.toLong())

public actual fun DdeUnaccessData(hdata: HDDEDATA): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeUnaccessData(hdata)

public actual fun DdeUninitialize(idinst: UInt): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DdeUninitialize(idinst.toInt())

public actual fun DeleteAtom(natom: UShort): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_DeleteAtom(natom.toShort()).toUShort()

public actual fun EmptyClipboard(): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_EmptyClipboard()

public actual fun EnumClipboardFormats(format: UInt): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_EnumClipboardFormats(format.toInt()).toUInt()

public actual fun FindAtomA(lpstring: PCSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_FindAtomA(lpstring).toUShort()

public actual fun FindAtomW(lpstring: PCWSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_FindAtomW(lpstring).toUShort()

public actual fun FreeDDElParam(msg: UInt, lparam: LPARAM): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_FreeDDElParam(msg.toInt(), lparam)

public actual fun GetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetAtomNameA(natom.toShort(), lpbuffer, nsize).toUInt()

public actual fun GetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetAtomNameW(natom.toShort(), lpbuffer, nsize).toUInt()

public actual fun GetClipboardData(uformat: UInt): HANDLE =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetClipboardData(uformat.toInt())

public actual fun GetClipboardFormatNameA(format: UInt, lpszformatname: PSTR, cchmaxcount: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameA(format.toInt(), lpszformatname, cchmaxcount)

public actual fun GetClipboardFormatNameW(format: UInt, lpszformatname: PWSTR, cchmaxcount: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameW(format.toInt(), lpszformatname, cchmaxcount)

public actual fun GetClipboardOwner(): HWND =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetClipboardOwner()

public actual fun GetClipboardSequenceNumber(): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetClipboardSequenceNumber().toUInt()

public actual fun GetClipboardViewer(): HWND =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetClipboardViewer()

public actual fun GetOpenClipboardWindow(): HWND =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetOpenClipboardWindow()

public actual fun GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetPriorityClipboardFormat(paformatprioritylist, cformats)

public actual fun GetUpdatedClipboardFormats(lpuiformats: Long, cformats: UInt, pcformatsout: Long): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GetUpdatedClipboardFormats(lpuiformats, cformats.toInt(), pcformatsout)

public actual fun GlobalAddAtomA(lpstring: PCSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalAddAtomA(lpstring).toUShort()

public actual fun GlobalAddAtomExA(lpstring: PCSTR, flags: UInt): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalAddAtomExA(lpstring, flags.toInt()).toUShort()

public actual fun GlobalAddAtomExW(lpstring: PCWSTR, flags: UInt): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalAddAtomExW(lpstring, flags.toInt()).toUShort()

public actual fun GlobalAddAtomW(lpstring: PCWSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalAddAtomW(lpstring).toUShort()

public actual fun GlobalDeleteAtom(natom: UShort): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalDeleteAtom(natom.toShort()).toUShort()

public actual fun GlobalFindAtomA(lpstring: PCSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalFindAtomA(lpstring).toUShort()

public actual fun GlobalFindAtomW(lpstring: PCWSTR): UShort =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalFindAtomW(lpstring).toUShort()

public actual fun GlobalGetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameA(natom.toShort(), lpbuffer, nsize).toUInt()

public actual fun GlobalGetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameW(natom.toShort(), lpbuffer, nsize).toUInt()

public actual fun ImpersonateDdeClientWindow(hwndclient: HWND, hwndserver: HWND): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ImpersonateDdeClientWindow(hwndclient, hwndserver)

public actual fun InitAtomTable(nsize: UInt): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_InitAtomTable(nsize.toInt())

public actual fun IsClipboardFormatAvailable(format: UInt): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_IsClipboardFormatAvailable(format.toInt())

public actual fun OpenClipboard(hwndnewowner: HWND): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_OpenClipboard(hwndnewowner)

public actual fun PackDDElParam(msg: UInt, uilo: ULong, uihi: ULong): LPARAM =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_PackDDElParam(msg.toInt(), uilo.toLong(), uihi.toLong())

public actual fun RegisterClipboardFormatA(lpszformat: PCSTR): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatA(lpszformat).toUInt()

public actual fun RegisterClipboardFormatW(lpszformat: PCWSTR): UInt =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatW(lpszformat).toUInt()

public actual fun RemoveClipboardFormatListener(hwnd: HWND): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_RemoveClipboardFormatListener(hwnd)

public actual fun ReuseDDElParam(lparam: LPARAM, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): LPARAM =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_ReuseDDElParam(lparam, msgin.toInt(), msgout.toInt(), uilo.toLong(), uihi.toLong())

public actual fun SetClipboardData(uformat: UInt, hmem: HANDLE): HANDLE =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_SetClipboardData(uformat.toInt(), hmem)

public actual fun SetClipboardViewer(hwndnewviewer: HWND): HWND =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_SetClipboardViewer(hwndnewviewer)

public actual fun SetWinMetaFileBits(nsize: UInt, lpmeta16data: Long, hdcref: HDC, lpmfp: Long): HENHMETAFILE =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_SetWinMetaFileBits(nsize.toInt(), lpmeta16data, hdcref, lpmfp)

public actual fun UnpackDDElParam(msg: UInt, lparam: LPARAM, puilo: Long, puihi: Long): BOOL =
    WindowsWin32SystemDataexchangeJniBridge.windowssys_windows_win32_system_dataexchange_UnpackDDElParam(msg.toInt(), lparam, puilo, puihi)
