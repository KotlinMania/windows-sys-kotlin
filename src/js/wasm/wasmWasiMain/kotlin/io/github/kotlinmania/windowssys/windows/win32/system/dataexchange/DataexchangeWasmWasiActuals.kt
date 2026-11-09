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

public actual fun AddAtomA(lpstring: PCSTR): UShort =
    0u

public actual fun AddAtomW(lpstring: PCWSTR): UShort =
    0u

public actual fun AddClipboardFormatListener(hwnd: HWND): BOOL =
    0

public actual fun ChangeClipboardChain(hwndremove: HWND, hwndnewnext: HWND): BOOL =
    0

public actual fun CloseClipboard(): BOOL =
    0

public actual fun CountClipboardFormats(): Int =
    0

public actual fun DdeAbandonTransaction(idinst: UInt, hconv: HCONV, idtransaction: UInt): BOOL =
    0

public actual fun DdeAccessData(hdata: HDDEDATA, pcbdatasize: Long): Long =
    0L

public actual fun DdeAddData(hdata: HDDEDATA, psrc: Long, cb: UInt, cboff: UInt): HDDEDATA =
    0L

public actual fun DdeClientTransaction(pdata: Long, cbdata: UInt, hconv: HCONV, hszitem: HSZ, wfmt: UInt, wtype: DDE_CLIENT_TRANSACTION_TYPE, dwtimeout: UInt, pdwresult: Long): HDDEDATA =
    0L

public actual fun DdeCmpStringHandles(hsz1: HSZ, hsz2: HSZ): Int =
    0

public actual fun DdeConnect(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, pcc: Long): HCONV =
    0L

public actual fun DdeConnectList(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, hconvlist: HCONVLIST, pcc: Long): HCONVLIST =
    0L

public actual fun DdeCreateDataHandle(idinst: UInt, psrc: Long, cb: UInt, cboff: UInt, hszitem: HSZ, wfmt: UInt, afcmd: UInt): HDDEDATA =
    0L

public actual fun DdeCreateStringHandleA(idinst: UInt, psz: PCSTR, icodepage: Int): HSZ =
    0L

public actual fun DdeCreateStringHandleW(idinst: UInt, psz: PCWSTR, icodepage: Int): HSZ =
    0L

public actual fun DdeDisconnect(hconv: HCONV): BOOL =
    0

public actual fun DdeDisconnectList(hconvlist: HCONVLIST): BOOL =
    0

public actual fun DdeEnableCallback(idinst: UInt, hconv: HCONV, wcmd: DDE_ENABLE_CALLBACK_CMD): BOOL =
    0

public actual fun DdeFreeDataHandle(hdata: HDDEDATA): BOOL =
    0

public actual fun DdeFreeStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    0

public actual fun DdeGetData(hdata: HDDEDATA, pdst: Long, cbmax: UInt, cboff: UInt): UInt =
    0u

public actual fun DdeGetLastError(idinst: UInt): UInt =
    0u

public actual fun DdeImpersonateClient(hconv: HCONV): BOOL =
    0

public actual fun DdeInitializeA(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    0u

public actual fun DdeInitializeW(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt =
    0u

public actual fun DdeKeepStringHandle(idinst: UInt, hsz: HSZ): BOOL =
    0

public actual fun DdeNameService(idinst: UInt, hsz1: HSZ, hsz2: HSZ, afcmd: DDE_NAME_SERVICE_CMD): HDDEDATA =
    0L

public actual fun DdePostAdvise(idinst: UInt, hsztopic: HSZ, hszitem: HSZ): BOOL =
    0

public actual fun DdeQueryConvInfo(hconv: HCONV, idtransaction: UInt, pconvinfo: Long): UInt =
    0u

public actual fun DdeQueryNextServer(hconvlist: HCONVLIST, hconvprev: HCONV): HCONV =
    0L

public actual fun DdeQueryStringA(idinst: UInt, hsz: HSZ, psz: PSTR, cchmax: UInt, icodepage: Int): UInt =
    0u

public actual fun DdeQueryStringW(idinst: UInt, hsz: HSZ, psz: PWSTR, cchmax: UInt, icodepage: Int): UInt =
    0u

public actual fun DdeReconnect(hconv: HCONV): HCONV =
    0L

public actual fun DdeSetQualityOfService(hwndclient: HWND, pqosnew: Long, pqosprev: Long): BOOL =
    0

public actual fun DdeSetUserHandle(hconv: HCONV, id: UInt, huser: ULong): BOOL =
    0

public actual fun DdeUnaccessData(hdata: HDDEDATA): BOOL =
    0

public actual fun DdeUninitialize(idinst: UInt): BOOL =
    0

public actual fun DeleteAtom(natom: UShort): UShort =
    0u

public actual fun EmptyClipboard(): BOOL =
    0

public actual fun EnumClipboardFormats(format: UInt): UInt =
    0u

public actual fun FindAtomA(lpstring: PCSTR): UShort =
    0u

public actual fun FindAtomW(lpstring: PCWSTR): UShort =
    0u

public actual fun FreeDDElParam(msg: UInt, lparam: LPARAM): BOOL =
    0

public actual fun GetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    0u

public actual fun GetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    0u

public actual fun GetClipboardData(uformat: UInt): HANDLE =
    0L

public actual fun GetClipboardFormatNameA(format: UInt, lpszformatname: PSTR, cchmaxcount: Int): Int =
    0

public actual fun GetClipboardFormatNameW(format: UInt, lpszformatname: PWSTR, cchmaxcount: Int): Int =
    0

public actual fun GetClipboardOwner(): HWND =
    0L

public actual fun GetClipboardSequenceNumber(): UInt =
    0u

public actual fun GetClipboardViewer(): HWND =
    0L

public actual fun GetOpenClipboardWindow(): HWND =
    0L

public actual fun GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int =
    0

public actual fun GetUpdatedClipboardFormats(lpuiformats: Long, cformats: UInt, pcformatsout: Long): BOOL =
    0

public actual fun GlobalAddAtomA(lpstring: PCSTR): UShort =
    0u

public actual fun GlobalAddAtomExA(lpstring: PCSTR, flags: UInt): UShort =
    0u

public actual fun GlobalAddAtomExW(lpstring: PCWSTR, flags: UInt): UShort =
    0u

public actual fun GlobalAddAtomW(lpstring: PCWSTR): UShort =
    0u

public actual fun GlobalDeleteAtom(natom: UShort): UShort =
    0u

public actual fun GlobalFindAtomA(lpstring: PCSTR): UShort =
    0u

public actual fun GlobalFindAtomW(lpstring: PCWSTR): UShort =
    0u

public actual fun GlobalGetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt =
    0u

public actual fun GlobalGetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt =
    0u

public actual fun ImpersonateDdeClientWindow(hwndclient: HWND, hwndserver: HWND): BOOL =
    0

public actual fun InitAtomTable(nsize: UInt): BOOL =
    0

public actual fun IsClipboardFormatAvailable(format: UInt): BOOL =
    0

public actual fun OpenClipboard(hwndnewowner: HWND): BOOL =
    0

public actual fun PackDDElParam(msg: UInt, uilo: ULong, uihi: ULong): LPARAM =
    0L

public actual fun RegisterClipboardFormatA(lpszformat: PCSTR): UInt =
    0u

public actual fun RegisterClipboardFormatW(lpszformat: PCWSTR): UInt =
    0u

public actual fun RemoveClipboardFormatListener(hwnd: HWND): BOOL =
    0

public actual fun ReuseDDElParam(lparam: LPARAM, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): LPARAM =
    0L

public actual fun SetClipboardData(uformat: UInt, hmem: HANDLE): HANDLE =
    0L

public actual fun SetClipboardViewer(hwndnewviewer: HWND): HWND =
    0L

public actual fun SetWinMetaFileBits(nsize: UInt, lpmeta16data: Long, hdcref: HDC, lpmfp: Long): HENHMETAFILE =
    0L

public actual fun UnpackDDElParam(msg: UInt, lparam: LPARAM, puilo: Long, puihi: Long): BOOL =
    0
