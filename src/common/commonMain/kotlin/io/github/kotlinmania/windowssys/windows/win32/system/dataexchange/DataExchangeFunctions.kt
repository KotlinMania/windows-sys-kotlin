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

public expect fun addAtomA(lpstring: Pcstr): UShort

public expect fun addAtomW(lpstring: Pcwstr): UShort

public expect fun addClipboardFormatListener(hwnd: Hwnd): Bool

public expect fun changeClipboardChain(hwndremove: Hwnd, hwndnewnext: Hwnd): Bool

public expect fun closeClipboard(): Bool

public expect fun countClipboardFormats(): Int

public expect fun ddeAbandonTransaction(idinst: UInt, hconv: Hconv, idtransaction: UInt): Bool

public expect fun ddeAccessData(hdata: Hddedata, pcbdatasize: MutPtr): MutPtr

public expect fun ddeAddData(hdata: Hddedata, psrc: ConstPtr, cb: UInt, cboff: UInt): Hddedata

public expect fun ddeClientTransaction(pdata: ConstPtr, cbdata: UInt, hconv: Hconv, hszitem: Hsz, wfmt: UInt, wtype: DdeClientTransactionType, dwtimeout: UInt, pdwresult: MutPtr): Hddedata

public expect fun ddeCmpStringHandles(hsz1: Hsz, hsz2: Hsz): Int

public expect fun ddeConnect(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, pcc: ConstPtr): Hconv

public expect fun ddeConnectList(idinst: UInt, hszservice: Hsz, hsztopic: Hsz, hconvlist: Hconvlist, pcc: ConstPtr): Hconvlist

public expect fun ddeCreateDataHandle(idinst: UInt, psrc: ConstPtr, cb: UInt, cboff: UInt, hszitem: Hsz, wfmt: UInt, afcmd: UInt): Hddedata

public expect fun ddeCreateStringHandleA(idinst: UInt, psz: Pcstr, icodepage: Int): Hsz

public expect fun ddeCreateStringHandleW(idinst: UInt, psz: Pcwstr, icodepage: Int): Hsz

public expect fun ddeDisconnect(hconv: Hconv): Bool

public expect fun ddeDisconnectList(hconvlist: Hconvlist): Bool

public expect fun ddeEnableCallback(idinst: UInt, hconv: Hconv, wcmd: DdeEnableCallbackCmd): Bool

public expect fun ddeFreeDataHandle(hdata: Hddedata): Bool

public expect fun ddeFreeStringHandle(idinst: UInt, hsz: Hsz): Bool

public expect fun ddeGetData(hdata: Hddedata, pdst: MutPtr, cbmax: UInt, cboff: UInt): UInt

public expect fun ddeGetLastError(idinst: UInt): UInt

public expect fun ddeImpersonateClient(hconv: Hconv): Bool

public expect fun ddeInitializeA(pidinst: MutPtr, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt

public expect fun ddeInitializeW(pidinst: MutPtr, pfncallback: Pfncallback, afcmd: DdeInitializeCommand, ulres: UInt): UInt

public expect fun ddeKeepStringHandle(idinst: UInt, hsz: Hsz): Bool

public expect fun ddeNameService(idinst: UInt, hsz1: Hsz, hsz2: Hsz, afcmd: DdeNameServiceCmd): Hddedata

public expect fun ddePostAdvise(idinst: UInt, hsztopic: Hsz, hszitem: Hsz): Bool

public expect fun ddeQueryConvInfo(hconv: Hconv, idtransaction: UInt, pconvinfo: MutPtr): UInt

public expect fun ddeQueryNextServer(hconvlist: Hconvlist, hconvprev: Hconv): Hconv

public expect fun ddeQueryStringA(idinst: UInt, hsz: Hsz, psz: Pstr, cchmax: UInt, icodepage: Int): UInt

public expect fun ddeQueryStringW(idinst: UInt, hsz: Hsz, psz: Pwstr, cchmax: UInt, icodepage: Int): UInt

public expect fun ddeReconnect(hconv: Hconv): Hconv

public expect fun ddeSetQualityOfService(hwndclient: Hwnd, pqosnew: ConstPtr, pqosprev: MutPtr): Bool

public expect fun ddeSetUserHandle(hconv: Hconv, id: UInt, huser: ULong): Bool

public expect fun ddeUnaccessData(hdata: Hddedata): Bool

public expect fun ddeUninitialize(idinst: UInt): Bool

public expect fun deleteAtom(natom: UShort): UShort

public expect fun emptyClipboard(): Bool

public expect fun enumClipboardFormats(format: UInt): UInt

public expect fun findAtomA(lpstring: Pcstr): UShort

public expect fun findAtomW(lpstring: Pcwstr): UShort

public expect fun freeDDElParam(msg: UInt, lparam: Lparam): Bool

public expect fun getAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt

public expect fun getAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt

public expect fun getClipboardData(uformat: UInt): Handle

public expect fun getClipboardFormatNameA(format: UInt, lpszformatname: Pstr, cchmaxcount: Int): Int

public expect fun getClipboardFormatNameW(format: UInt, lpszformatname: Pwstr, cchmaxcount: Int): Int

public expect fun getClipboardOwner(): Hwnd

public expect fun getClipboardSequenceNumber(): UInt

public expect fun getClipboardViewer(): Hwnd

public expect fun getOpenClipboardWindow(): Hwnd

public expect fun getPriorityClipboardFormat(paformatprioritylist: ConstPtr, cformats: Int): Int

public expect fun getUpdatedClipboardFormats(lpuiformats: MutPtr, cformats: UInt, pcformatsout: MutPtr): Bool

public expect fun globalAddAtomA(lpstring: Pcstr): UShort

public expect fun globalAddAtomExA(lpstring: Pcstr, flags: UInt): UShort

public expect fun globalAddAtomExW(lpstring: Pcwstr, flags: UInt): UShort

public expect fun globalAddAtomW(lpstring: Pcwstr): UShort

public expect fun globalDeleteAtom(natom: UShort): UShort

public expect fun globalFindAtomA(lpstring: Pcstr): UShort

public expect fun globalFindAtomW(lpstring: Pcwstr): UShort

public expect fun globalGetAtomNameA(natom: UShort, lpbuffer: Pstr, nsize: Int): UInt

public expect fun globalGetAtomNameW(natom: UShort, lpbuffer: Pwstr, nsize: Int): UInt

public expect fun impersonateDdeClientWindow(hwndclient: Hwnd, hwndserver: Hwnd): Bool

public expect fun initAtomTable(nsize: UInt): Bool

public expect fun isClipboardFormatAvailable(format: UInt): Bool

public expect fun openClipboard(hwndnewowner: Hwnd): Bool

public expect fun packDDElParam(msg: UInt, uilo: ULong, uihi: ULong): Lparam

public expect fun registerClipboardFormatA(lpszformat: Pcstr): UInt

public expect fun registerClipboardFormatW(lpszformat: Pcwstr): UInt

public expect fun removeClipboardFormatListener(hwnd: Hwnd): Bool

public expect fun reuseDDElParam(lparam: Lparam, msgin: UInt, msgout: UInt, uilo: ULong, uihi: ULong): Lparam

public expect fun setClipboardData(uformat: UInt, hmem: Handle): Handle

public expect fun setClipboardViewer(hwndnewviewer: Hwnd): Hwnd

public expect fun setWinMetaFileBits(nsize: UInt, lpmeta16data: ConstPtr, hdcref: Hdc, lpmfp: ConstPtr): Henhmetafile

public expect fun unpackDDElParam(msg: UInt, lparam: Lparam, puilo: MutPtr, puihi: MutPtr): Bool
