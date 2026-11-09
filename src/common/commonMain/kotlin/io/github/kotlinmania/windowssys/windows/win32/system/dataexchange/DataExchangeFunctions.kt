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

public expect fun AddAtomA(lpstring: PCSTR): UShort

public expect fun AddAtomW(lpstring: PCWSTR): UShort

public expect fun AddClipboardFormatListener(hwnd: HWND): BOOL

public expect fun ChangeClipboardChain(hwndremove: HWND, hwndnewnext: HWND): BOOL

public expect fun CloseClipboard(): BOOL

public expect fun CountClipboardFormats(): Int

public expect fun DdeAbandonTransaction(idinst: UInt, hconv: HCONV, idtransaction: UInt): BOOL

public expect fun DdeAccessData(hdata: HDDEDATA, pcbdatasize: Long): Long

public expect fun DdeAddData(hdata: HDDEDATA, psrc: Long, cb: UInt, cboff: UInt): HDDEDATA

public expect fun DdeClientTransaction(pdata: Long, cbdata: UInt, hconv: HCONV, hszitem: HSZ, wfmt: UInt, wtype: DDE_CLIENT_TRANSACTION_TYPE, dwtimeout: UInt, pdwresult: Long): HDDEDATA

public expect fun DdeCmpStringHandles(hsz1: HSZ, hsz2: HSZ): Int

public expect fun DdeConnect(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, pcc: Long): HCONV

public expect fun DdeConnectList(idinst: UInt, hszservice: HSZ, hsztopic: HSZ, hconvlist: HCONVLIST, pcc: Long): HCONVLIST

public expect fun DdeCreateDataHandle(idinst: UInt, psrc: Long, cb: UInt, cboff: UInt, hszitem: HSZ, wfmt: UInt, afcmd: UInt): HDDEDATA

public expect fun DdeCreateStringHandleA(idinst: UInt, psz: PCSTR, icodepage: Int): HSZ

public expect fun DdeCreateStringHandleW(idinst: UInt, psz: PCWSTR, icodepage: Int): HSZ

public expect fun DdeDisconnect(hconv: HCONV): BOOL

public expect fun DdeDisconnectList(hconvlist: HCONVLIST): BOOL

public expect fun DdeEnableCallback(idinst: UInt, hconv: HCONV, wcmd: DDE_ENABLE_CALLBACK_CMD): BOOL

public expect fun DdeFreeDataHandle(hdata: HDDEDATA): BOOL

public expect fun DdeFreeStringHandle(idinst: UInt, hsz: HSZ): BOOL

public expect fun DdeGetData(hdata: HDDEDATA, pdst: Long, cbmax: UInt, cboff: UInt): UInt

public expect fun DdeGetLastError(idinst: UInt): UInt

public expect fun DdeImpersonateClient(hconv: HCONV): BOOL

public expect fun DdeInitializeA(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt

public expect fun DdeInitializeW(pidinst: Long, pfncallback: PFNCALLBACK, afcmd: DDE_INITIALIZE_COMMAND, ulres: UInt): UInt

public expect fun DdeKeepStringHandle(idinst: UInt, hsz: HSZ): BOOL

public expect fun DdeNameService(idinst: UInt, hsz1: HSZ, hsz2: HSZ, afcmd: DDE_NAME_SERVICE_CMD): HDDEDATA

public expect fun DdePostAdvise(idinst: UInt, hsztopic: HSZ, hszitem: HSZ): BOOL

public expect fun DdeQueryConvInfo(hconv: HCONV, idtransaction: UInt, pconvinfo: Long): UInt

public expect fun DdeQueryNextServer(hconvlist: HCONVLIST, hconvprev: HCONV): HCONV

public expect fun DdeQueryStringA(idinst: UInt, hsz: HSZ, psz: PSTR, cchmax: UInt, icodepage: Int): UInt

public expect fun DdeQueryStringW(idinst: UInt, hsz: HSZ, psz: PWSTR, cchmax: UInt, icodepage: Int): UInt

public expect fun DdeReconnect(hconv: HCONV): HCONV

public expect fun DdeSetQualityOfService(hwndclient: HWND, pqosnew: Long, pqosprev: Long): BOOL

public expect fun DdeSetUserHandle(hconv: HCONV, id: UInt, huser: ULong): BOOL

public expect fun DdeUnaccessData(hdata: HDDEDATA): BOOL

public expect fun DdeUninitialize(idinst: UInt): BOOL

public expect fun DeleteAtom(natom: UShort): UShort

public expect fun EmptyClipboard(): BOOL

public expect fun EnumClipboardFormats(format: UInt): UInt

public expect fun FindAtomA(lpstring: PCSTR): UShort

public expect fun FindAtomW(lpstring: PCWSTR): UShort

public expect fun FreeDDElParam(msg: UInt, lparam: LPARAM): BOOL

public expect fun GetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt

public expect fun GetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt

public expect fun GetClipboardData(uformat: UInt): HANDLE

public expect fun GetClipboardFormatNameA(format: UInt, lpszformatname: PSTR, cchmaxcount: Int): Int

public expect fun GetClipboardFormatNameW(format: UInt, lpszformatname: PWSTR, cchmaxcount: Int): Int

public expect fun GetClipboardOwner(): HWND

public expect fun GetClipboardSequenceNumber(): UInt

public expect fun GetClipboardViewer(): HWND

public expect fun GetOpenClipboardWindow(): HWND

public expect fun GetPriorityClipboardFormat(paformatprioritylist: Long, cformats: Int): Int

public expect fun GetUpdatedClipboardFormats(lpuiformats: Long, cformats: UInt, pcformatsout: Long): BOOL

public expect fun GlobalAddAtomA(lpstring: PCSTR): UShort

public expect fun GlobalAddAtomExA(lpstring: PCSTR, flags: UInt): UShort

public expect fun GlobalAddAtomExW(lpstring: PCWSTR, flags: UInt): UShort

public expect fun GlobalAddAtomW(lpstring: PCWSTR): UShort

public expect fun GlobalDeleteAtom(natom: UShort): UShort

public expect fun GlobalFindAtomA(lpstring: PCSTR): UShort

public expect fun GlobalFindAtomW(lpstring: PCWSTR): UShort

public expect fun GlobalGetAtomNameA(natom: UShort, lpbuffer: PSTR, nsize: Int): UInt

public expect fun GlobalGetAtomNameW(natom: UShort, lpbuffer: PWSTR, nsize: Int): UInt

public expect fun ImpersonateDdeClientWindow(hwndclient: HWND, hwndserver: HWND): BOOL

public expect fun InitAtomTable(nsize: UInt): BOOL

public expect fun IsClipboardFormatAvailable(format: UInt): BOOL

public expect fun OpenClipboard(hwndnewowner: HWND): BOOL

public expect fun PackDDElParam(msg: UInt, uilo: ULong, uihi: ULong): LPARAM

public expect fun RegisterClipboardFormatA(lpszformat: PCSTR): UInt

public expect fun RegisterClipboardFormatW(lpszformat: PCWSTR): UInt

public expect fun RemoveClipboardFormatListener(hwnd: HWND): BOOL

public expect fun ReuseDDElParam(lparam: LPARAM, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): LPARAM

public expect fun SetClipboardData(uformat: UInt, hmem: HANDLE): HANDLE

public expect fun SetClipboardViewer(hwndnewviewer: HWND): HWND

public expect fun SetWinMetaFileBits(nsize: UInt, lpmeta16data: Long, hdcref: HDC, lpmfp: Long): HENHMETAFILE

public expect fun UnpackDDElParam(msg: UInt, lparam: LPARAM, puilo: Long, puihi: Long): BOOL
