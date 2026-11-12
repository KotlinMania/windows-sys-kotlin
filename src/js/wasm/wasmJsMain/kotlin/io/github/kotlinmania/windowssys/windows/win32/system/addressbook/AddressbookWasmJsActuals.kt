@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.addressbook

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemAddressbookNapiAddon(): Boolean

private val windowsWin32SystemAddressbookNapiAvailable: Boolean = initWindowsWin32SystemAddressbookNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookBuildDisplayTable(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookBuildDisplayTable(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookChangeIdleRoutine(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookChangeIdleRoutine(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookCreateIProp(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookCreateIProp(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookCreateTable(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookCreateTable(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int, p7: String, p8: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookDeinitMapiUtil()")
private external fun wasmWindowssysWindowsWin32SystemAddressbookDeinitMapiUtil()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookEnableIdleRoutine(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookEnableIdleRoutine(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFEqualNames(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFEqualNames(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFPropCompareProp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFPropCompareProp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFPropContainsProp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFPropContainsProp(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFPropExists(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFPropExists(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFreePadrlist(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFreePadrlist(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFreeProws(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFreeProws(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(p0: String, p1: String, p2: Int, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrAddColumns(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrAddColumns(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrAddColumnsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrAddColumnsEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrDispatchNotifications(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrDispatchNotifications(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrGetOneProp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrGetOneProp(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrIStorageFromStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrIStorageFromStream(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrQueryAllRows(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrQueryAllRows(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrSetOneProp(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrSetOneProp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookLPropCompareProp(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookLPropCompareProp(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookLpValFindProp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookLpValFindProp(p0: Int, p1: Int, p2: String): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()")
private external fun wasmWindowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc()")
private external fun wasmWindowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc(): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookMAPIInitIdle(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookMAPIInitIdle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookOpenStreamOnFile(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookOpenStreamOnFile(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookPpropFindProp(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookPpropFindProp(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookPropCopyMore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookPropCopyMore(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookRTFSync(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookRTFSync(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScCopyNotifications(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScCopyNotifications(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScCopyProps(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScCopyProps(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScCountNotifications(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScCountNotifications(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScCountProps(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScCountProps(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScCreateConversationIndex(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScCreateConversationIndex(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScDupPropset(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScDupPropset(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScInitMapiUtil(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScInitMapiUtil(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScRelocNotifications(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScRelocNotifications(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScRelocProps(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScRelocProps(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookSzFindCh(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookSzFindCh(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookSzFindLastCh(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookSzFindLastCh(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookSzFindSz(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookSzFindSz(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookUFromSz(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookUFromSz(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookUlAddRef(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookUlAddRef(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookUlPropSize(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookUlPropSize(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookUlRelease(p0)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookUlRelease(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemAddressbookWrapStoreEntryID(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemAddressbookWrapStoreEntryID(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

public actual fun buildDisplayTable(lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, hinstance: Hinstance, cpages: UInt, lppage: MutPtr, ulflags: UInt, lpptable: MutPtr, lpptbldata: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookBuildDisplayTable(0L.toString(), 0L.toString(), 0L.toString(), lpmalloc.rawAddress.toString(), hinstance.rawAddress.toString(), cpages.toInt(), lppage.rawAddress.toString(), ulflags.toInt(), lpptable.rawAddress.toString(), lpptbldata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeIdleRoutine(ftg: MutPtr, lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort, ircidle: UShort) {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookChangeIdleRoutine(ftg.rawAddress.toString(), 0L.toString(), lpvidleparam.rawAddress.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt(), ircidle.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun createIProp(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, lpppropdata: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookCreateIProp(lpinterface.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString(), lpppropdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createTable(lpinterface: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpvreserved: MutPtr, ultabletype: UInt, ulproptagindexcolumn: UInt, lpsproptagarraycolumns: MutPtr, lpptabledata: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookCreateTable(lpinterface.rawAddress.toString(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString(), ultabletype.toInt(), ulproptagindexcolumn.toInt(), lpsproptagarraycolumns.rawAddress.toString(), lpptabledata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deinitMapiUtil() {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookDeinitMapiUtil()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun deregisterIdleRoutine(ftg: MutPtr) {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookDeregisterIdleRoutine(ftg.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun enableIdleRoutine(ftg: MutPtr, fenable: Bool) {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookEnableIdleRoutine(ftg.rawAddress.toString(), fenable)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun fEqualNames(lpname1: MutPtr, lpname2: MutPtr): Bool =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookFEqualNames(lpname1.rawAddress.toString(), lpname2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropCompareProp(lpspropvalue1: MutPtr, ulrelop: UInt, lpspropvalue2: MutPtr): Bool =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookFPropCompareProp(lpspropvalue1.rawAddress.toString(), ulrelop.toInt(), lpspropvalue2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropContainsProp(lpspropvaluedst: MutPtr, lpspropvaluesrc: MutPtr, ulfuzzylevel: UInt): Bool =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookFPropContainsProp(lpspropvaluedst.rawAddress.toString(), lpspropvaluesrc.rawAddress.toString(), ulfuzzylevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fPropExists(lpmapiprop: MutPtr, ulproptag: UInt): Bool =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookFPropExists(lpmapiprop.rawAddress.toString(), ulproptag.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freePadrlist(lpadrlist: MutPtr) {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookFreePadrlist(lpadrlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun freeProws(lprows: MutPtr) {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookFreeProws(lprows.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun ftAddFt(ftaddend1: Filetime, ftaddend2: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftMulDw(ftmultiplier: UInt, ftmultiplicand: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftMulDwDw(ftmultiplicand: UInt, ftmultiplier: UInt): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftNegFt(ft: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftSubFt(ftminuend: Filetime, ftsubtrahend: Filetime): Filetime =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftgRegisterIdleRoutine(lpfnidle: Pfnidle, lpvidleparam: MutPtr, priidle: Short, csecidle: UInt, iroidle: UShort): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookFtgRegisterIdleRoutine(0L.toString(), lpvidleparam.rawAddress.toString(), priidle.toInt(), csecidle.toInt(), iroidle.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumns(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrAddColumns(lptbl.rawAddress.toString(), lpproptagcolumnsnew.rawAddress.toString(), 0L.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAddColumnsEx(lptbl: MutPtr, lpproptagcolumnsnew: MutPtr, lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, lpfnfiltercolumns: Long): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrAddColumnsEx(lptbl.rawAddress.toString(), lpproptagcolumnsnew.rawAddress.toString(), 0L.toString(), 0L.toString(), lpfnfiltercolumns.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrAllocAdviseSink(lpfncallback: Lpnotifcallback, lpvcontext: MutPtr, lppadvisesink: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrAllocAdviseSink(0L.toString(), lpvcontext.rawAddress.toString(), lppadvisesink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrDispatchNotifications(ulflags: UInt): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrDispatchNotifications(ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrGetOneProp(lpmapiprop: MutPtr, ulproptag: UInt, lppprop: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrGetOneProp(lpmapiprop.rawAddress.toString(), ulproptag.toInt(), lppprop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrIStorageFromStream(lpunkin: MutPtr, lpinterface: MutPtr, ulflags: UInt, lppstorageout: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrIStorageFromStream(lpunkin.rawAddress.toString(), lpinterface.rawAddress.toString(), ulflags.toInt(), lppstorageout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrQueryAllRows(lptable: MutPtr, lpproptags: MutPtr, lprestriction: MutPtr, lpsortorderset: MutPtr, crowsmax: Int, lpprows: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrQueryAllRows(lptable.rawAddress.toString(), lpproptags.rawAddress.toString(), lprestriction.rawAddress.toString(), lpsortorderset.rawAddress.toString(), crowsmax, lpprows.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrSetOneProp(lpmapiprop: MutPtr, lpprop: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrSetOneProp(lpmapiprop.rawAddress.toString(), lpprop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hrThisThreadAdviseSink(lpadvisesink: MutPtr, lppadvisesink: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookHrThisThreadAdviseSink(lpadvisesink.rawAddress.toString(), lppadvisesink.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPropCompareProp(lpspropvaluea: MutPtr, lpspropvalueb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookLPropCompareProp(lpspropvaluea.rawAddress.toString(), lpspropvalueb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lpValFindProp(ulproptag: UInt, cvalues: UInt, lpproparray: MutPtr): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookLpValFindProp(ulproptag.toInt(), cvalues.toInt(), lpproparray.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIDeinitIdle() {
    if (windowsWin32SystemAddressbookNapiAvailable) {
        wasmWindowssysWindowsWin32SystemAddressbookMAPIDeinitIdle()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun mAPIGetDefaultMalloc(): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookMAPIGetDefaultMalloc().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mAPIInitIdle(lpvreserved: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookMAPIInitIdle(lpvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openStreamOnFile(lpallocatebuffer: Lpallocatebuffer, lpfreebuffer: Lpfreebuffer, ulflags: UInt, lpszfilename: ConstPtr, lpszprefix: ConstPtr, lppstream: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookOpenStreamOnFile(0L.toString(), 0L.toString(), ulflags.toInt(), lpszfilename.rawAddress.toString(), lpszprefix.rawAddress.toString(), lppstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ppropFindProp(lpproparray: MutPtr, cvalues: UInt, ulproptag: UInt): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookPpropFindProp(lpproparray.rawAddress.toString(), cvalues.toInt(), ulproptag.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propCopyMore(lpspropvaluedest: MutPtr, lpspropvaluesrc: MutPtr, lpfallocmore: Lpallocatemore, lpvobject: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookPropCopyMore(lpspropvaluedest.rawAddress.toString(), lpspropvaluesrc.rawAddress.toString(), 0L.toString(), lpvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rTFSync(lpmessage: MutPtr, ulflags: UInt, lpfmessageupdated: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookRTFSync(lpmessage.rawAddress.toString(), ulflags.toInt(), lpfmessageupdated.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyNotifications(cnotification: Int, lpnotifications: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScCopyNotifications(cnotification, lpnotifications.rawAddress.toString(), lpvdst.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCopyProps(cvalues: Int, lpproparray: MutPtr, lpvdst: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScCopyProps(cvalues, lpproparray.rawAddress.toString(), lpvdst.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountNotifications(cnotifications: Int, lpnotifications: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScCountNotifications(cnotifications, lpnotifications.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCountProps(cvalues: Int, lpproparray: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScCountProps(cvalues, lpproparray.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scCreateConversationIndex(cbparent: UInt, lpbparent: MutPtr, lpcbconvindex: MutPtr, lppbconvindex: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScCreateConversationIndex(cbparent.toInt(), lpbparent.rawAddress.toString(), lpcbconvindex.rawAddress.toString(), lppbconvindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scDupPropset(cvalues: Int, lpproparray: MutPtr, lpallocatebuffer: Lpallocatebuffer, lppproparray: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScDupPropset(cvalues, lpproparray.rawAddress.toString(), 0L.toString(), lppproparray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scInitMapiUtil(ulflags: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScInitMapiUtil(ulflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scLocalPathFromUNC(lpszunc: Pcstr, lpszlocal: Pcstr, cchlocal: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScLocalPathFromUNC(lpszunc.rawAddress.toString(), lpszlocal.rawAddress.toString(), cchlocal.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocNotifications(cnotification: Int, lpnotifications: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScRelocNotifications(cnotification, lpnotifications.rawAddress.toString(), lpvbaseold.rawAddress.toString(), lpvbasenew.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scRelocProps(cvalues: Int, lpproparray: MutPtr, lpvbaseold: MutPtr, lpvbasenew: MutPtr, lpcb: MutPtr): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScRelocProps(cvalues, lpproparray.rawAddress.toString(), lpvbaseold.rawAddress.toString(), lpvbasenew.rawAddress.toString(), lpcb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scUNCFromLocalPath(lpszlocal: Pcstr, lpszunc: Pcstr, cchunc: UInt): Int =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookScUNCFromLocalPath(lpszlocal.rawAddress.toString(), lpszunc.rawAddress.toString(), cchunc.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindCh(lpsz: MutPtr, ch: UShort): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookSzFindCh(lpsz.rawAddress.toString(), ch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindLastCh(lpsz: MutPtr, ch: UShort): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookSzFindLastCh(lpsz.rawAddress.toString(), ch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun szFindSz(lpsz: MutPtr, lpszkey: MutPtr): MutPtr =
    if (windowsWin32SystemAddressbookNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemAddressbookSzFindSz(lpsz.rawAddress.toString(), lpszkey.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uFromSz(lpsz: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookUFromSz(lpsz.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulAddRef(lpunk: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookUlAddRef(lpunk.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulPropSize(lpspropvalue: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookUlPropSize(lpspropvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ulRelease(lpunk: MutPtr): UInt =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookUlRelease(lpunk.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapCompressedRTFStream(lpcompressedrtfstream: MutPtr, ulflags: UInt, lpuncompressedrtfstream: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookWrapCompressedRTFStream(lpcompressedrtfstream.rawAddress.toString(), ulflags.toInt(), lpuncompressedrtfstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wrapStoreEntryID(ulflags: UInt, lpszdllname: ConstPtr, cborigentry: UInt, lporigentry: ConstPtr, lpcbwrappedentry: MutPtr, lppwrappedentry: MutPtr): Hresult =
    if (windowsWin32SystemAddressbookNapiAvailable) wasmWindowssysWindowsWin32SystemAddressbookWrapStoreEntryID(ulflags.toInt(), lpszdllname.rawAddress.toString(), cborigentry.toInt(), lporigentry.rawAddress.toString(), lpcbwrappedentry.rawAddress.toString(), lppwrappedentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
