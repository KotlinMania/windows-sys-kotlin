@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookBuildDisplayTable
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookChangeIdleRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookCreateIProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookCreateTable
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookDeinitMapiUtil
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookEnableIdleRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFEqualNames
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFPropCompareProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFPropContainsProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFPropExists
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFreePadrlist
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFreeProws
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrAddColumns
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrAddColumnsEx
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrDispatchNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrGetOneProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrIStorageFromStream
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrQueryAllRows
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrSetOneProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookLPropCompareProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookLpValFindProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookMAPIInitIdle
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookOpenStreamOnFile
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookPpropFindProp
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookPropCopyMore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookRTFSync
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScCopyNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScCopyProps
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScCountNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScCountProps
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScCreateConversationIndex
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScDupPropset
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScInitMapiUtil
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScRelocNotifications
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScRelocProps
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookSzFindCh
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookSzFindLastCh
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookSzFindSz
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookUFromSz
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookUlAddRef
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookUlPropSize
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookUlRelease
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.cinterop.windowssysWindowsWin32SystemAddressbookWrapStoreEntryID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, hinstance: Hinstance, cpages: UInt, lppage: MutPtr, ulflags: UInt, lpptable: MutPtr, lpptbldata: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookBuildDisplayTable(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpmalloc.rawAddress.toCPointer<ByteVar>(), hinstance.rawAddress.toCPointer<ByteVar>(), cpages, lppage.rawAddress.toCPointer<ByteVar>(), ulflags, lpptable.rawAddress.toCPointer<ByteVar>(), lpptbldata.rawAddress.toCPointer<ByteVar>())

public actual fun changeIdleRoutine(ftg: MutPtr, lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(ftg.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvidleparam.rawAddress.toCPointer<ByteVar>(), priidle, csecidle, iroidle, ircidle)
}

public actual fun createIProp(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, lpppropdata: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookCreateIProp(lpinterface.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreserved.rawAddress.toCPointer<ByteVar>(), lpppropdata.rawAddress.toCPointer<ByteVar>())

public actual fun createTable(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr, lpptabledata: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookCreateTable(lpinterface.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreserved.rawAddress.toCPointer<ByteVar>(), ultabletype, ulproptagindexcolumn, lpsproptagarraycolumns.rawAddress.toCPointer<ByteVar>(), lpptabledata.rawAddress.toCPointer<ByteVar>())

public actual fun deinitMapiUtil() {
    windowssysWindowsWin32SystemAddressbookDeinitMapiUtil()
}

public actual fun deregisterIdleRoutine(ftg: MutPtr) {
    windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(ftg.rawAddress.toCPointer<ByteVar>())
}

public actual fun enableIdleRoutine(ftg: MutPtr, fenable: Bool) {
    windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(ftg.rawAddress.toCPointer<ByteVar>(), fenable)
}

public actual fun fEqualNames(lpname1: MutPtr, lpname2: MutPtr): Bool =
    windowssysWindowsWin32SystemAddressbookFEqualNames(lpname1.rawAddress.toCPointer<ByteVar>(), lpname2.rawAddress.toCPointer<ByteVar>())

public actual fun fPropCompareProp(lpspropvalue1: MutPtr, ulrelop: UInt, lpspropvalue2: MutPtr): Bool =
    windowssysWindowsWin32SystemAddressbookFPropCompareProp(lpspropvalue1.rawAddress.toCPointer<ByteVar>(), ulrelop, lpspropvalue2.rawAddress.toCPointer<ByteVar>())

public actual fun fPropContainsProp(lpspropvaluedst: MutPtr, lpspropvaluesrc: MutPtr, ulfuzzylevel: UInt): Bool =
    windowssysWindowsWin32SystemAddressbookFPropContainsProp(lpspropvaluedst.rawAddress.toCPointer<ByteVar>(), lpspropvaluesrc.rawAddress.toCPointer<ByteVar>(), ulfuzzylevel)

public actual fun fPropExists(lpmapiprop: MutPtr, ulproptag: UInt): Bool =
    windowssysWindowsWin32SystemAddressbookFPropExists(lpmapiprop.rawAddress.toCPointer<ByteVar>(), ulproptag)

public actual fun freePadrlist(lpadrlist: MutPtr) {
    windowssysWindowsWin32SystemAddressbookFreePadrlist(lpadrlist.rawAddress.toCPointer<ByteVar>())
}

public actual fun freeProws(lprows: MutPtr) {
    windowssysWindowsWin32SystemAddressbookFreeProws(lprows.rawAddress.toCPointer<ByteVar>())
}

public actual fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime =
    Filetime()

public actual fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime =
    Filetime()

public actual fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime =
    Filetime()

public actual fun ftNegFt(ft: Filetime): Filetime =
    Filetime()

public actual fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime =
    Filetime()

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(0L.toCPointer<ByteVar>(), lpvidleparam.rawAddress.toCPointer<ByteVar>(), priidle, csecidle, iroidle)?.toLong() ?: 0L)

public actual fun hrAddColumns(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    windowssysWindowsWin32SystemAddressbookHrAddColumns(lptbl.rawAddress.toCPointer<ByteVar>(), lpproptagcolumnsnew.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun hrAddColumnsEx(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(lptbl.rawAddress.toCPointer<ByteVar>(), lpproptagcolumnsnew.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpfnfiltercolumns)

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr, lppadvisesink: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(0L.toCPointer<ByteVar>(), lpvcontext.rawAddress.toCPointer<ByteVar>(), lppadvisesink.rawAddress.toCPointer<ByteVar>())

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags)

public actual fun hrGetOneProp(lpmapiprop: MutPtr, ulproptag: UInt, lppprop: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookHrGetOneProp(lpmapiprop.rawAddress.toCPointer<ByteVar>(), ulproptag, lppprop.rawAddress.toCPointer<ByteVar>())

public actual fun hrIStorageFromStream(lpunkin: MutPtr, lpinterface: MutPtr, ulflags: UInt, lppstorageout: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(lpunkin.rawAddress.toCPointer<ByteVar>(), lpinterface.rawAddress.toCPointer<ByteVar>(), ulflags, lppstorageout.rawAddress.toCPointer<ByteVar>())

public actual fun hrQueryAllRows(lptable: MutPtr, lpproptags: MutPtr, lprestriction: MutPtr, lpsortorderset: MutPtr, crowsmax: Int, lpprows: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookHrQueryAllRows(lptable.rawAddress.toCPointer<ByteVar>(), lpproptags.rawAddress.toCPointer<ByteVar>(), lprestriction.rawAddress.toCPointer<ByteVar>(), lpsortorderset.rawAddress.toCPointer<ByteVar>(), crowsmax, lpprows.rawAddress.toCPointer<ByteVar>())

public actual fun hrSetOneProp(lpmapiprop: MutPtr, lpprop: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookHrSetOneProp(lpmapiprop.rawAddress.toCPointer<ByteVar>(), lpprop.rawAddress.toCPointer<ByteVar>())

public actual fun hrThisThreadAdviseSink(lpadvisesink: MutPtr, lppadvisesink: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(lpadvisesink.rawAddress.toCPointer<ByteVar>(), lppadvisesink.rawAddress.toCPointer<ByteVar>())

public actual fun lPropCompareProp(lpspropvaluea: MutPtr, lpspropvalueb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookLPropCompareProp(lpspropvaluea.rawAddress.toCPointer<ByteVar>(), lpspropvalueb.rawAddress.toCPointer<ByteVar>())

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookLpValFindProp(ulproptag, cvalues, lpproparray.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mAPIDeinitIdle() {
    windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()
}

public actual fun mAPIGetDefaultMalloc(): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc()?.toLong() ?: 0L)

public actual fun mAPIInitIdle(lpvreserved: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookMAPIInitIdle(lpvreserved.rawAddress.toCPointer<ByteVar>())

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr, lpszprefix: ConstPtr, lppstream: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ulflags, lpszfilename.rawAddress.toCPointer<ByteVar>(), lpszprefix.rawAddress.toCPointer<ByteVar>(), lppstream.rawAddress.toCPointer<ByteVar>())

public actual fun ppropFindProp(lpproparray: MutPtr, cvalues: UInt, ulproptag: UInt): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookPpropFindProp(lpproparray.rawAddress.toCPointer<ByteVar>(), cvalues, ulproptag)?.toLong() ?: 0L)

public actual fun propCopyMore(lpspropvaluedest: MutPtr, lpspropvaluesrc: MutPtr, lpfallocmore: Lpallocatemore, lpvobject: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookPropCopyMore(lpspropvaluedest.rawAddress.toCPointer<ByteVar>(), lpspropvaluesrc.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvobject.rawAddress.toCPointer<ByteVar>())

public actual fun rTFSync(lpmessage: MutPtr, ulflags: UInt, lpfmessageupdated: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookRTFSync(lpmessage.rawAddress.toCPointer<ByteVar>(), ulflags, lpfmessageupdated.rawAddress.toCPointer<ByteVar>())

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScCopyNotifications(cnotification, lpnotifications.rawAddress.toCPointer<ByteVar>(), lpvdst.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun scCopyProps(cvalues: Int, lpproparray: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScCopyProps(cvalues, lpproparray.rawAddress.toCPointer<ByteVar>(), lpvdst.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr, lpcb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScCountNotifications(cnotifications, lpnotifications.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun scCountProps(cvalues: Int, lpproparray: MutPtr, lpcb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScCountProps(cvalues, lpproparray.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr, lpcbconvindex: MutPtr, lppbconvindex: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(cbparent, lpbparent.rawAddress.toCPointer<ByteVar>(), lpcbconvindex.rawAddress.toCPointer<ByteVar>(), lppbconvindex.rawAddress.toCPointer<ByteVar>())

public actual fun scDupPropset(cvalues: Int, lpproparray: MutPtr, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScDupPropset(cvalues, lpproparray.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lppproparray.rawAddress.toCPointer<ByteVar>())

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    windowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags)

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(lpszunc.rawAddress.toCPointer<ByteVar>(), lpszlocal.rawAddress.toCPointer<ByteVar>(), cchlocal)

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScRelocNotifications(cnotification, lpnotifications.rawAddress.toCPointer<ByteVar>(), lpvbaseold.rawAddress.toCPointer<ByteVar>(), lpvbasenew.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun scRelocProps(cvalues: Int, lpproparray: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int =
    windowssysWindowsWin32SystemAddressbookScRelocProps(cvalues, lpproparray.rawAddress.toCPointer<ByteVar>(), lpvbaseold.rawAddress.toCPointer<ByteVar>(), lpvbasenew.rawAddress.toCPointer<ByteVar>(), lpcb.rawAddress.toCPointer<ByteVar>())

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(lpszlocal.rawAddress.toCPointer<ByteVar>(), lpszunc.rawAddress.toCPointer<ByteVar>(), cchunc)

public actual fun szFindCh(lpsz: MutPtr, ch: UShort): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookSzFindCh(lpsz.rawAddress.toCPointer<ByteVar>(), ch)?.toLong() ?: 0L)

public actual fun szFindLastCh(lpsz: MutPtr, ch: UShort): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookSzFindLastCh(lpsz.rawAddress.toCPointer<ByteVar>(), ch)?.toLong() ?: 0L)

public actual fun szFindSz(lpsz: MutPtr, lpszkey: MutPtr): MutPtr =
    MutPtr(windowssysWindowsWin32SystemAddressbookSzFindSz(lpsz.rawAddress.toCPointer<ByteVar>(), lpszkey.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun uFromSz(lpsz: MutPtr): UInt =
    windowssysWindowsWin32SystemAddressbookUFromSz(lpsz.rawAddress.toCPointer<ByteVar>())

public actual fun ulAddRef(lpunk: MutPtr): UInt =
    windowssysWindowsWin32SystemAddressbookUlAddRef(lpunk.rawAddress.toCPointer<ByteVar>())

public actual fun ulPropSize(lpspropvalue: MutPtr): UInt =
    windowssysWindowsWin32SystemAddressbookUlPropSize(lpspropvalue.rawAddress.toCPointer<ByteVar>())

public actual fun ulRelease(lpunk: MutPtr): UInt =
    windowssysWindowsWin32SystemAddressbookUlRelease(lpunk.rawAddress.toCPointer<ByteVar>())

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr, ulflags: UInt, lpuncompressedrtfstream: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(lpcompressedrtfstream.rawAddress.toCPointer<ByteVar>(), ulflags, lpuncompressedrtfstream.rawAddress.toCPointer<ByteVar>())

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr, cborigentry: UInt, lporigentry: ConstPtr, lpcbwrappedentry: MutPtr, lppwrappedentry: MutPtr): Hresult =
    windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(ulflags, lpszdllname.rawAddress.toCPointer<ByteVar>(), cborigentry, lporigentry.rawAddress.toCPointer<ByteVar>(), lpcbwrappedentry.rawAddress.toCPointer<ByteVar>(), lppwrappedentry.rawAddress.toCPointer<ByteVar>())
