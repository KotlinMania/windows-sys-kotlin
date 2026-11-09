@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AddAtomA(lpstring: PCSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_AddAtomA(lpstring.toCPointer<ByteVar>())

public actual fun AddAtomW(lpstring: PCWSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_AddAtomW(lpstring.toCPointer<ByteVar>())

public actual fun AddClipboardFormatListener(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_AddClipboardFormatListener(hwnd.toCPointer<ByteVar>())

public actual fun ChangeClipboardChain(hwndremove: HWND, hwndnewnext: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ChangeClipboardChain(hwndremove.toCPointer<ByteVar>(), hwndnewnext.toCPointer<ByteVar>())

public actual fun CloseClipboard(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_CloseClipboard()

public actual fun CountClipboardFormats(): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_CountClipboardFormats()

public actual fun DdeAbandonTransaction(idinst: UInt, hconv: HCONV, idtransaction: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeAbandonTransaction(idinst, hconv.toCPointer<ByteVar>(), idtransaction)

public actual fun DdeAccessData(hdata: HDDEDATA, pcbdatasize: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeAccessData(hdata.toCPointer<ByteVar>(), pcbdatasize.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DdeAddData(hdata: HDDEDATA, psrc: Long, cb: UInt, cboff: UInt): HDDEDATA =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeAddData(hdata.toCPointer<ByteVar>(), psrc.toCPointer<ByteVar>(), cb, cboff)?.toLong() ?: 0L

public actual fun DdeClientTransaction(pdata: Long, cbdata: UInt, hconv: HCONV, hszitem: HSZ, wfmt: UInt, wtype: DDE_CLIENT_TRANSACTION_TYPE, dwtimeout: UInt, pdwresult: Long): HDDEDATA =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeClientTransaction(pdata.toCPointer<ByteVar>(), cbdata, hconv.toCPointer<ByteVar>(), hszitem.toCPointer<ByteVar>(), wfmt, wtype, dwtimeout, pdwresult.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DdeCmpStringHandles(hsz1: HSZ, hsz2: HSZ): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeCmpStringHandles(hsz1.toCPointer<ByteVar>(), hsz2.toCPointer<ByteVar>())

public actual fun DdeConnect(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, pcc: Long): HCONV =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeConnect(idinst, hszservice.toCPointer<ByteVar>(), hsztopic.toCPointer<ByteVar>(), pcc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DdeConnectList(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, hconvlist: HCONVLIST, pcc: Long): HCONVLIST =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeConnectList(idinst, hszservice.toCPointer<ByteVar>(), hsztopic.toCPointer<ByteVar>(), hconvlist.toCPointer<ByteVar>(), pcc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DdeCreateDataHandle(idinst: UInt, psrc: Long, cb: UInt, cboff: UInt, hszitem: HSZ, wfmt: UInt, afcmd: UInt): HDDEDATA =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeCreateDataHandle(idinst, psrc.toCPointer<ByteVar>(), cb, cboff, hszitem.toCPointer<ByteVar>(), wfmt, afcmd)?.toLong() ?: 0L

public actual fun DdeCreateStringHandleA(idinst: UInt, psz: PCSTR, icodepage: Int): HSZ =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleA(idinst, psz.toCPointer<ByteVar>(), icodepage)?.toLong() ?: 0L

public actual fun DdeCreateStringHandleW(idinst: UInt, psz: PCWSTR, icodepage: Int): HSZ =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeCreateStringHandleW(idinst, psz.toCPointer<ByteVar>(), icodepage)?.toLong() ?: 0L

public actual fun DdeDisconnect(hconv: HCONV): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeDisconnect(hconv.toCPointer<ByteVar>())

public actual fun DdeDisconnectList(hconvlist: HCONVLIST): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeDisconnectList(hconvlist.toCPointer<ByteVar>())

public actual fun DdeEnableCallback(idinst: UInt, hconv: HCONV, wcmd: DDE_ENABLE_CALLBACK_CMD): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeEnableCallback(idinst, hconv.toCPointer<ByteVar>(), wcmd)

public actual fun DdeFreeDataHandle(hdata: HDDEDATA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeFreeDataHandle(hdata.toCPointer<ByteVar>())

public actual fun DdeFreeStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeFreeStringHandle(idinst, hsz.toCPointer<ByteVar>())

public actual fun DdeGetData(hdata: HDDEDATA, pdst: Long, cbmax: UInt, cboff: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeGetData(hdata.toCPointer<ByteVar>(), pdst.toCPointer<ByteVar>(), cbmax, cboff)

public actual fun DdeGetLastError(idinst: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeGetLastError(idinst)

public actual fun DdeImpersonateClient(hconv: HCONV): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeImpersonateClient(hconv.toCPointer<ByteVar>())

public actual fun DdeInitializeA(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeInitializeA(pidinst.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), afcmd, ulres)

public actual fun DdeInitializeW(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeInitializeW(pidinst.toCPointer<ByteVar>(), pfncallback.toLong().toCPointer<ByteVar>(), afcmd, ulres)

public actual fun DdeKeepStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeKeepStringHandle(idinst, hsz.toCPointer<ByteVar>())

public actual fun DdeNameService(idinst: UInt, hsz1: HSZ, hsz2: HSZ, afcmd: DDE_NAME_SERVICE_CMD): HDDEDATA =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeNameService(idinst, hsz1.toCPointer<ByteVar>(), hsz2.toCPointer<ByteVar>(), afcmd)?.toLong() ?: 0L

public actual fun DdePostAdvise(idinst: UInt, hsztopic: HSZ, hszitem: HSZ): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdePostAdvise(idinst, hsztopic.toCPointer<ByteVar>(), hszitem.toCPointer<ByteVar>())

public actual fun DdeQueryConvInfo(hconv: HCONV, idtransaction: UInt, pconvinfo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeQueryConvInfo(hconv.toCPointer<ByteVar>(), idtransaction, pconvinfo.toCPointer<ByteVar>())

public actual fun DdeQueryNextServer(hconvlist: HCONVLIST, hconvprev: HCONV): HCONV =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeQueryNextServer(hconvlist.toCPointer<ByteVar>(), hconvprev.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DdeQueryStringA(idinst: UInt, hsz: HSZ, psz: PSTR, cchmax: UInt, icodepage: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeQueryStringA(idinst, hsz.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun DdeQueryStringW(idinst: UInt, hsz: HSZ, psz: PWSTR, cchmax: UInt, icodepage: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeQueryStringW(idinst, hsz.toCPointer<ByteVar>(), psz.toCPointer<ByteVar>(), cchmax, icodepage)

public actual fun DdeReconnect(hconv: HCONV): HCONV =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeReconnect(hconv.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun DdeSetQualityOfService(hwndclient: HWND, pqosnew: Long, pqosprev: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeSetQualityOfService(hwndclient.toCPointer<ByteVar>(), pqosnew.toCPointer<ByteVar>(), pqosprev.toCPointer<ByteVar>())

public actual fun DdeSetUserHandle(hconv: HCONV, id: UInt, huser: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeSetUserHandle(hconv.toCPointer<ByteVar>(), id, huser)

public actual fun DdeUnaccessData(hdata: HDDEDATA): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeUnaccessData(hdata.toCPointer<ByteVar>())

public actual fun DdeUninitialize(idinst: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DdeUninitialize(idinst)

public actual fun DeleteAtom(natom: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_DeleteAtom(natom)

public actual fun EmptyClipboard(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_EmptyClipboard()

public actual fun EnumClipboardFormats(format: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_EnumClipboardFormats(format)

public actual fun FindAtomA(lpstring: PCSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_FindAtomA(lpstring.toCPointer<ByteVar>())

public actual fun FindAtomW(lpstring: PCWSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_FindAtomW(lpstring.toCPointer<ByteVar>())

public actual fun FreeDDElParam(msg: UInt, lparam: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_FreeDDElParam(msg, lparam)

public actual fun GetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetAtomNameA(natom, lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetAtomNameW(natom, lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GetClipboardData(uformat: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetClipboardData(uformat)?.toLong() ?: 0L

public actual fun GetClipboardFormatNameA(format: UInt, lpszformatname: PSTR, cchmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameA(format, lpszformatname.toCPointer<ByteVar>(), cchmaxcount)

public actual fun GetClipboardFormatNameW(format: UInt, lpszformatname: PWSTR, cchmaxcount: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetClipboardFormatNameW(format, lpszformatname.toCPointer<ByteVar>(), cchmaxcount)

public actual fun GetClipboardOwner(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetClipboardOwner()?.toLong() ?: 0L

public actual fun GetClipboardSequenceNumber(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetClipboardSequenceNumber()

public actual fun GetClipboardViewer(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetClipboardViewer()?.toLong() ?: 0L

public actual fun GetOpenClipboardWindow(): HWND =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetOpenClipboardWindow()?.toLong() ?: 0L

public actual fun GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetPriorityClipboardFormat(paformatprioritylist.toCPointer<ByteVar>(), cformats)

public actual fun GetUpdatedClipboardFormats(lpuiformats: Long, cformats: UInt, pcformatsout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GetUpdatedClipboardFormats(lpuiformats.toCPointer<ByteVar>(), cformats, pcformatsout.toCPointer<ByteVar>())

public actual fun GlobalAddAtomA(lpstring: PCSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalAddAtomA(lpstring.toCPointer<ByteVar>())

public actual fun GlobalAddAtomExA(lpstring: PCSTR, flags: UInt): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalAddAtomExA(lpstring.toCPointer<ByteVar>(), flags)

public actual fun GlobalAddAtomExW(lpstring: PCWSTR, flags: UInt): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalAddAtomExW(lpstring.toCPointer<ByteVar>(), flags)

public actual fun GlobalAddAtomW(lpstring: PCWSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalAddAtomW(lpstring.toCPointer<ByteVar>())

public actual fun GlobalDeleteAtom(natom: UShort): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalDeleteAtom(natom)

public actual fun GlobalFindAtomA(lpstring: PCSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalFindAtomA(lpstring.toCPointer<ByteVar>())

public actual fun GlobalFindAtomW(lpstring: PCWSTR): UShort =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalFindAtomW(lpstring.toCPointer<ByteVar>())

public actual fun GlobalGetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameA(natom, lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun GlobalGetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_GlobalGetAtomNameW(natom, lpbuffer.toCPointer<ByteVar>(), nsize)

public actual fun ImpersonateDdeClientWindow(hwndclient: HWND, hwndserver: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ImpersonateDdeClientWindow(hwndclient.toCPointer<ByteVar>(), hwndserver.toCPointer<ByteVar>())

public actual fun InitAtomTable(nsize: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_InitAtomTable(nsize)

public actual fun IsClipboardFormatAvailable(format: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_IsClipboardFormatAvailable(format)

public actual fun OpenClipboard(hwndnewowner: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_OpenClipboard(hwndnewowner.toCPointer<ByteVar>())

public actual fun PackDDElParam(msg: UInt, uilo: ULong, uihi: ULong): LPARAM =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_PackDDElParam(msg, uilo, uihi)

public actual fun RegisterClipboardFormatA(lpszformat: PCSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatA(lpszformat.toCPointer<ByteVar>())

public actual fun RegisterClipboardFormatW(lpszformat: PCWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_RegisterClipboardFormatW(lpszformat.toCPointer<ByteVar>())

public actual fun RemoveClipboardFormatListener(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_RemoveClipboardFormatListener(hwnd.toCPointer<ByteVar>())

public actual fun ReuseDDElParam(lparam: LPARAM, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): LPARAM =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_ReuseDDElParam(lparam, msgin, msgout, uilo, uihi)

public actual fun SetClipboardData(uformat: UInt, hmem: HANDLE): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_SetClipboardData(uformat, hmem.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetClipboardViewer(hwndnewviewer: HWND): HWND =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_SetClipboardViewer(hwndnewviewer.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetWinMetaFileBits(nsize: UInt, lpmeta16data: Long, hdcref: HDC, lpmfp: Long): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_SetWinMetaFileBits(nsize, lpmeta16data.toCPointer<ByteVar>(), hdcref.toCPointer<ByteVar>(), lpmfp.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun UnpackDDElParam(msg: UInt, lparam: LPARAM, puilo: Long, puihi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.dataexchange.cinterop.windowssys_windows_win32_system_dataexchange_UnpackDDElParam(msg, lparam, puilo.toCPointer<ByteVar>(), puihi.toCPointer<ByteVar>())
