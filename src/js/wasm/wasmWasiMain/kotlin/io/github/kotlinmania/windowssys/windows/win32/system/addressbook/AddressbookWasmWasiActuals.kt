@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, hinstance: Hinstance, cpages: UInt, lppage: MutPtr<Dtpage>, ulflags: UInt, lpptable: MutPtr<MutPtr<CVoid>>, lpptbldata: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookBuildDisplayTable")

public actual fun changeIdleRoutine(ftg: MutPtr<CVoid>, lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookChangeIdleRoutine")

public actual fun createIProp(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, lpppropdata: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookCreateIProp")

public actual fun createTable(lpinterface: MutPtr<Guid>, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr<CVoid>, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr<SPropTagArray>, lpptabledata: MutPtr<MutPtr<CVoid>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookCreateTable")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemAddressbookDeinitMapiUtil")
private external fun wasiWindowssysWindowsWin32SystemAddressbookDeinitMapiUtil(): Unit

public actual fun deinitMapiUtil(): Unit =
    wasiWindowssysWindowsWin32SystemAddressbookDeinitMapiUtil()

public actual fun deregisterIdleRoutine(ftg: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine")

public actual fun enableIdleRoutine(ftg: MutPtr<CVoid>, fenable: Bool): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookEnableIdleRoutine")

public actual fun fEqualNames(lpname1: MutPtr<Mapinameid>, lpname2: MutPtr<Mapinameid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFEqualNames")

public actual fun fPropCompareProp(lpspropvalue1: MutPtr<SPropValue>, ulrelop: UInt, lpspropvalue2: MutPtr<SPropValue>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFPropCompareProp")

public actual fun fPropContainsProp(lpspropvaluedst: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, ulfuzzylevel: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFPropContainsProp")

public actual fun fPropExists(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFPropExists")

public actual fun freePadrlist(lpadrlist: MutPtr<Adrlist>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFreePadrlist")

public actual fun freeProws(lprows: MutPtr<SRowSet>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFreeProws")

public actual fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFtAddFt")

public actual fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFtMulDw")

public actual fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFtMulDwDw")

public actual fun ftNegFt(ft: Filetime): Filetime =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFtNegFt")

public actual fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFtSubFt")

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr<CVoid>, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine")

public actual fun hrAddColumns(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrAddColumns")

public actual fun hrAddColumnsEx(lptbl: MutPtr<CVoid>, lpproptagcolumnsnew: MutPtr<SPropTagArray>, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrAddColumnsEx")

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemAddressbookHrDispatchNotifications")
private external fun wasiWindowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags: Int): Int

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    wasiWindowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags.toInt()).toInt()

public actual fun hrGetOneProp(lpmapiprop: MutPtr<CVoid>, ulproptag: UInt, lppprop: MutPtr<MutPtr<SPropValue>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrGetOneProp")

public actual fun hrIStorageFromStream(lpunkin: MutPtr<CVoid>, lpinterface: MutPtr<Guid>, ulflags: UInt, lppstorageout: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrIStorageFromStream")

public actual fun hrQueryAllRows(lptable: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lprestriction: MutPtr<SRestriction>, lpsortorderset: MutPtr<SSortOrderSet>, crowsmax: Int, lpprows: MutPtr<MutPtr<SRowSet>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrQueryAllRows")

public actual fun hrSetOneProp(lpmapiprop: MutPtr<CVoid>, lpprop: MutPtr<SPropValue>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrSetOneProp")

public actual fun hrThisThreadAdviseSink(lpadvisesink: MutPtr<CVoid>, lppadvisesink: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink")

public actual fun lPropCompareProp(lpspropvaluea: MutPtr<SPropValue>, lpspropvalueb: MutPtr<SPropValue>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookLPropCompareProp")

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr<SPropValue>): MutPtr<SPropValue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookLpValFindProp")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle")
private external fun wasiWindowssysWindowsWin32SystemAddressbookMAPIDeinitIdle(): Unit

public actual fun mAPIDeinitIdle(): Unit =
    wasiWindowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()

public actual fun mAPIGetDefaultMalloc(): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc")

public actual fun mAPIInitIdle(lpvreserved: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookMAPIInitIdle")

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr<Byte>, lpszprefix: ConstPtr<Byte>, lppstream: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookOpenStreamOnFile")

public actual fun ppropFindProp(lpproparray: MutPtr<SPropValue>, cvalues: UInt, ulproptag: UInt): MutPtr<SPropValue> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookPpropFindProp")

public actual fun propCopyMore(lpspropvaluedest: MutPtr<SPropValue>, lpspropvaluesrc: MutPtr<SPropValue>, lpfallocmore: Lpallocatemore, lpvobject: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookPropCopyMore")

public actual fun rTFSync(lpmessage: MutPtr<CVoid>, ulflags: UInt, lpfmessageupdated: MutPtr<Bool>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookRTFSync")

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScCopyNotifications")

public actual fun scCopyProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvdst: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScCopyProps")

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr<Notification>, lpcb: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScCountNotifications")

public actual fun scCountProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpcb: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScCountProps")

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr<UByte>, lpcbconvindex: MutPtr<UInt>, lppbconvindex: MutPtr<MutPtr<UByte>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScCreateConversationIndex")

public actual fun scDupPropset(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr<MutPtr<SPropValue>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScDupPropset")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemAddressbookScInitMapiUtil")
private external fun wasiWindowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags: Int): Int

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    wasiWindowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags.toInt()).toInt()

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC")

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr<Notification>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScRelocNotifications")

public actual fun scRelocProps(cvalues: Int, lpproparray: MutPtr<SPropValue>, lpvbaseold: MutPtr<CVoid>, lpvbasenew: MutPtr<CVoid>, lpcb: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScRelocProps")

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath")

public actual fun szFindCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookSzFindCh")

public actual fun szFindLastCh(lpsz: MutPtr<Byte>, ch: UShort): MutPtr<Byte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookSzFindLastCh")

public actual fun szFindSz(lpsz: MutPtr<Byte>, lpszkey: MutPtr<Byte>): MutPtr<Byte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookSzFindSz")

public actual fun uFromSz(lpsz: MutPtr<Byte>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookUFromSz")

public actual fun ulAddRef(lpunk: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookUlAddRef")

public actual fun ulPropSize(lpspropvalue: MutPtr<SPropValue>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookUlPropSize")

public actual fun ulRelease(lpunk: MutPtr<CVoid>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookUlRelease")

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr<CVoid>, ulflags: UInt, lpuncompressedrtfstream: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream")

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr<Byte>, cborigentry: UInt, lporigentry: ConstPtr<Entryid>, lpcbwrappedentry: MutPtr<UInt>, lppwrappedentry: MutPtr<MutPtr<Entryid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemAddressbookWrapStoreEntryID")
