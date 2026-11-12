@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

private object WindowsWin32SystemAddressbookJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookBuildDisplayTable(lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpmalloc: Long, hinstance: Long, cpages: Int, lppage: Long, ulflags: Int, lpptable: Long, lpptbldata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(ftg: Long, lpfnidle: Long, lpvidleparam: Long, priidle: Short, csecidle: Int, iroidle: Short, ircidle: Short)

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookCreateIProp(lpinterface: Long, lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpvreserved: Long, lpppropdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookCreateTable(lpinterface: Long, lpallocatebuffer: Long, lpallocatemore: Long, lpfreebuffer: Long, lpvreserved: Long, ultabletype: Int, ulproptagindexcolumn: Int, lpsproptagarraycolumns: Long, lpptabledata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookDeinitMapiUtil()

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(ftg: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(ftg: Long, fenable: Int)

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFEqualNames(lpname1: Long, lpname2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFPropCompareProp(lpspropvalue1: Long, ulrelop: Int, lpspropvalue2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFPropContainsProp(lpspropvaluedst: Long, lpspropvaluesrc: Long, ulfuzzylevel: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFPropExists(lpmapiprop: Long, ulproptag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFreePadrlist(lpadrlist: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFreeProws(lprows: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(lpfnidle: Long, lpvidleparam: Long, priidle: Short, csecidle: Int, iroidle: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrAddColumns(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: Long, lpfreebuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(lptbl: Long, lpproptagcolumnsnew: Long, lpallocatebuffer: Long, lpfreebuffer: Long, lpfnfiltercolumns: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(lpfncallback: Long, lpvcontext: Long, lppadvisesink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrGetOneProp(lpmapiprop: Long, ulproptag: Int, lppprop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(lpunkin: Long, lpinterface: Long, ulflags: Int, lppstorageout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrQueryAllRows(lptable: Long, lpproptags: Long, lprestriction: Long, lpsortorderset: Long, crowsmax: Int, lpprows: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrSetOneProp(lpmapiprop: Long, lpprop: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(lpadvisesink: Long, lppadvisesink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookLPropCompareProp(lpspropvaluea: Long, lpspropvalueb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookLpValFindProp(ulproptag: Int, cvalues: Int, lpproparray: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc(): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookMAPIInitIdle(lpvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(lpallocatebuffer: Long, lpfreebuffer: Long, ulflags: Int, lpszfilename: Long, lpszprefix: Long, lppstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookPpropFindProp(lpproparray: Long, cvalues: Int, ulproptag: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookPropCopyMore(lpspropvaluedest: Long, lpspropvaluesrc: Long, lpfallocmore: Long, lpvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookRTFSync(lpmessage: Long, ulflags: Int, lpfmessageupdated: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScCopyNotifications(cnotification: Int, lpnotifications: Long, lpvdst: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScCopyProps(cvalues: Int, lpproparray: Long, lpvdst: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScCountNotifications(cnotifications: Int, lpnotifications: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScCountProps(cvalues: Int, lpproparray: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(cbparent: Int, lpbparent: Long, lpcbconvindex: Long, lppbconvindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScDupPropset(cvalues: Int, lpproparray: Long, lpallocatebuffer: Long, lppproparray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(lpszunc: Long, lpszlocal: Long, cchlocal: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScRelocNotifications(cnotification: Int, lpnotifications: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScRelocProps(cvalues: Int, lpproparray: Long, lpvbaseold: Long, lpvbasenew: Long, lpcb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(lpszlocal: Long, lpszunc: Long, cchunc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookSzFindCh(lpsz: Long, ch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookSzFindLastCh(lpsz: Long, ch: Short): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookSzFindSz(lpsz: Long, lpszkey: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookUFromSz(lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookUlAddRef(lpunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookUlPropSize(lpspropvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookUlRelease(lpunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(lpcompressedrtfstream: Long, ulflags: Int, lpuncompressedrtfstream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(ulflags: Int, lpszdllname: Long, cborigentry: Int, lporigentry: Long, lpcbwrappedentry: Long, lppwrappedentry: Long): Int
}

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, hinstance: Hinstance, cpages: UInt, lppage: MutPtr<Dtpage>, ulflags: UInt, lpptable: MutPtr<MutPtr<CVoid>>, lpptbldata: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookBuildDisplayTable(0L, 0L, 0L, lpmalloc.rawAddress, hinstance.rawAddress, cpages.toInt(), lppage.rawAddress, ulflags.toInt(), lpptable.rawAddress, lpptbldata.rawAddress)

public actual fun changeIdleRoutine(ftg: MutPtr<CVoid>, lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(ftg.rawAddress, 0L, lpvidleparam.rawAddress, priidle, csecidle.toInt(), iroidle.toShort(), ircidle.toShort())
}

public actual fun createIProp(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, lpppropdata: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookCreateIProp(lpinterface.rawAddress, 0L, 0L, 0L, lpvreserved.rawAddress, lpppropdata.rawAddress)

public actual fun createTable(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr<SPropTagArray>, lpptabledata: MutPtr<MutPtr<CVoid>>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookCreateTable(lpinterface.rawAddress, 0L, 0L, 0L, lpvreserved.rawAddress, ultabletype.toInt(), ulproptagindexcolumn.toInt(), lpsproptagarraycolumns.rawAddress, lpptabledata.rawAddress)

public actual fun deinitMapiUtil() {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookDeinitMapiUtil()
}

public actual fun deregisterIdleRoutine(ftg: MutPtr<CVoid>) {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(ftg.rawAddress)
}

public actual fun enableIdleRoutine(ftg: MutPtr<CVoid>, fenable: Bool) {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(ftg.rawAddress, fenable)
}

public actual fun fEqualNames(lpname1: MutPtr<Mapinameid>, lpname2: MutPtr<Mapinameid>): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFEqualNames(lpname1.rawAddress, lpname2.rawAddress)

public actual fun fPropCompareProp(lpspropvalue1: MutPtr<SPropValue>, ulrelop: UInt, lpspropvalue2: MutPtr<SPropValue>): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFPropCompareProp(lpspropvalue1.rawAddress, ulrelop.toInt(), lpspropvalue2.rawAddress)

public actual fun fPropContainsProp(lpspropvaluedst: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, ulfuzzylevel: UInt): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFPropContainsProp(lpspropvaluedst.rawAddress, lpspropvaluesrc.rawAddress, ulfuzzylevel.toInt())

public actual fun fPropExists(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt): Bool =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFPropExists(lpmapiprop.rawAddress, ulproptag.toInt())

public actual fun freePadrlist(lpadrlist: MutPtr<Adrlist>) {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFreePadrlist(lpadrlist.rawAddress)
}

public actual fun freeProws(lprows: MutPtr<SRowSet>) {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFreeProws(lprows.rawAddress)
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

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(0L, lpvidleparam.rawAddress, priidle, csecidle.toInt(), iroidle.toShort()))

public actual fun hrAddColumns(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrAddColumns(lptbl.rawAddress, lpproptagcolumnsnew.rawAddress, 0L, 0L)

public actual fun hrAddColumnsEx(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(lptbl.rawAddress, lpproptagcolumnsnew.rawAddress, 0L, 0L, lpfnfiltercolumns)

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(0L, lpvcontext.rawAddress, lppadvisesink.rawAddress)

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags.toInt())

public actual fun hrGetOneProp(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt, lppprop: MutPtr<MutPtr<SPropValue>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrGetOneProp(lpmapiprop.rawAddress, ulproptag.toInt(), lppprop.rawAddress)

public actual fun hrIStorageFromStream(lpunkin: MutPtr<CVoid>, lpinterface: MutPtr<Guid>, ulflags: UInt, lppstorageout: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(lpunkin.rawAddress, lpinterface.rawAddress, ulflags.toInt(), lppstorageout.rawAddress)

public actual fun hrQueryAllRows(lptable: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lprestriction: MutPtr<SRestriction>, lpsortorderset: MutPtr<SSortOrderSet>, crowsmax: Int, lpprows: MutPtr<MutPtr<SRowSet>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrQueryAllRows(lptable.rawAddress, lpproptags.rawAddress, lprestriction.rawAddress, lpsortorderset.rawAddress, crowsmax, lpprows.rawAddress)

public actual fun hrSetOneProp(lpmapiprop: MutPtr<CVoid>, lpprop: MutPtr<SPropValue>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrSetOneProp(lpmapiprop.rawAddress, lpprop.rawAddress)

public actual fun hrThisThreadAdviseSink(lpadvisesink: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(lpadvisesink.rawAddress, lppadvisesink.rawAddress)

public actual fun lPropCompareProp(lpspropvaluea: MutPtr<SPropValue>, lpspropvalueb: MutPtr<SPropValue>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookLPropCompareProp(lpspropvaluea.rawAddress, lpspropvalueb.rawAddress)

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr<SPropValue>): MutPtr<SPropValue> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookLpValFindProp(ulproptag.toInt(), cvalues.toInt(), lpproparray.rawAddress))

public actual fun mAPIDeinitIdle() {
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()
}

public actual fun mAPIGetDefaultMalloc(): MutPtr<CVoid> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc())

public actual fun mAPIInitIdle(lpvreserved: MutPtr<CVoid>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookMAPIInitIdle(lpvreserved.rawAddress)

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr<Byte>, lpszprefix: ConstPtr<Byte>, lppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(0L, 0L, ulflags.toInt(), lpszfilename.rawAddress, lpszprefix.rawAddress, lppstream.rawAddress)

public actual fun ppropFindProp(lpproparray: MutPtr<SPropValue>, cvalues: UInt, ulproptag: UInt): MutPtr<SPropValue> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookPpropFindProp(lpproparray.rawAddress, cvalues.toInt(), ulproptag.toInt()))

public actual fun propCopyMore(lpspropvaluedest: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, lpfallocmore: Lpallocatemore, lpvobject: MutPtr<CVoid>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookPropCopyMore(lpspropvaluedest.rawAddress, lpspropvaluesrc.rawAddress, 0L, lpvobject.rawAddress)

public actual fun rTFSync(lpmessage: MutPtr<CVoid>, ulflags: UInt, lpfmessageupdated: MutPtr<Bool>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookRTFSync(lpmessage.rawAddress, ulflags.toInt(), lpfmessageupdated.rawAddress)

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScCopyNotifications(cnotification, lpnotifications.rawAddress, lpvdst.rawAddress, lpcb.rawAddress)

public actual fun scCopyProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScCopyProps(cvalues, lpproparray.rawAddress, lpvdst.rawAddress, lpcb.rawAddress)

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr<Notification>, lpcb: MutPtr<UInt>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScCountNotifications(cnotifications, lpnotifications.rawAddress, lpcb.rawAddress)

public actual fun scCountProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpcb: MutPtr<UInt>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScCountProps(cvalues, lpproparray.rawAddress, lpcb.rawAddress)

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr<UByte>, lpcbconvindex: MutPtr<UInt>, lppbconvindex: MutPtr<MutPtr<UByte>>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(cbparent.toInt(), lpbparent.rawAddress, lpcbconvindex.rawAddress, lppbconvindex.rawAddress)

public actual fun scDupPropset(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr<MutPtr<SPropValue>>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScDupPropset(cvalues, lpproparray.rawAddress, 0L, lppproparray.rawAddress)

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags.toInt())

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(lpszunc.rawAddress, lpszlocal.rawAddress, cchlocal.toInt())

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScRelocNotifications(cnotification, lpnotifications.rawAddress, lpvbaseold.rawAddress, lpvbasenew.rawAddress, lpcb.rawAddress)

public actual fun scRelocProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScRelocProps(cvalues, lpproparray.rawAddress, lpvbaseold.rawAddress, lpvbasenew.rawAddress, lpcb.rawAddress)

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(lpszlocal.rawAddress, lpszunc.rawAddress, cchunc.toInt())

public actual fun szFindCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookSzFindCh(lpsz.rawAddress, ch.toShort()))

public actual fun szFindLastCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookSzFindLastCh(lpsz.rawAddress, ch.toShort()))

public actual fun szFindSz(lpsz: MutPtr<Byte>, lpszkey: MutPtr<Byte>): MutPtr<Byte> =
    MutPtr(WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookSzFindSz(lpsz.rawAddress, lpszkey.rawAddress))

public actual fun uFromSz(lpsz: MutPtr<Byte>): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookUFromSz(lpsz.rawAddress).toUInt()

public actual fun ulAddRef(lpunk: MutPtr<CVoid>): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookUlAddRef(lpunk.rawAddress).toUInt()

public actual fun ulPropSize(lpspropvalue: MutPtr<SPropValue>): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookUlPropSize(lpspropvalue.rawAddress).toUInt()

public actual fun ulRelease(lpunk: MutPtr<CVoid>): UInt =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookUlRelease(lpunk.rawAddress).toUInt()

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr<CVoid>, ulflags: UInt, lpuncompressedrtfstream: MutPtr<MutPtr<CVoid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(lpcompressedrtfstream.rawAddress, ulflags.toInt(), lpuncompressedrtfstream.rawAddress)

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr<Byte>, cborigentry: UInt, lporigentry: ConstPtr<Entryid>, lpcbwrappedentry: MutPtr<UInt>, lppwrappedentry: MutPtr<MutPtr<Entryid>>): Hresult =
    WindowsWin32SystemAddressbookJniBridge.windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(ulflags.toInt(), lpszdllname.rawAddress, cborigentry.toInt(), lporigentry.rawAddress, lpcbwrappedentry.rawAddress, lppwrappedentry.rawAddress)
