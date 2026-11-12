@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

private val windowsWin32UiAccessibilityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(hwndapp.rawAddress.toString(), dwutilitystatemask.toInt(), dwutilitystate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleChildren(pacccontainer: MutPtr<CVoid>, ichildstart: Int, cchildren: Int, rgvarchildren: MutPtr<Variant.Variant>, pcobtained: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityAccessibleChildren(pacccontainer.rawAddress.toString(), ichildstart, cchildren, rgvarchildren.rawAddress.toString(), pcobtained.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: MutPtr<MutPtr<CVoid>>, pvarchild: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(hwnd.rawAddress.toString(), dwid.toInt(), dwchildid.toInt(), ppacc.rawAddress.toString(), pvarchild.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: MutPtr<MutPtr<CVoid>>, pvarchild: MutPtr<Variant.Variant>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(hwnd.rawAddress.toString(), dwid.toInt(), riid.rawAddress.toString(), ppvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(hwnd.rawAddress.toString(), idobject, riid.rawAddress.toString(), ppvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(hwnd.rawAddress.toString(), pclassname.rawAddress.toString(), idobject, riid.rawAddress.toString(), ppvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(hwnd.rawAddress.toString(), pclassname.rawAddress.toString(), idobject, riid.rawAddress.toString(), ppvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(hobj.rawAddress.toString(), dockposition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOleaccVersionInfo(pver: MutPtr<UInt>, pbuild: MutPtr<UInt>) {
    if (windowsWin32UiAccessibilityNapiAddon != null) {
        windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(pver.rawAddress.toString(), pbuild.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityGetRoleTextA(lrole.toInt(), lpszrole.rawAddress.toString(), cchrolemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityGetRoleTextW(lrole.toInt(), lpszrole.rawAddress.toString(), cchrolemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityGetStateTextA(lstatebit.toInt(), lpszstate.rawAddress.toString(), cchstate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityGetStateTextW(lstatebit.toInt(), lpszstate.rawAddress.toString(), cchstate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityGridPatternGetItem(hobj.rawAddress.toString(), row, column, presult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityInvokePatternInvoke(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant.Variant, pfound: MutPtr<Huianode>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(hobj.rawAddress.toString(), paccessible.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(hobj.rawAddress.toString(), flagsselect) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(hobj.rawAddress.toString(), szvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lresultFromObject(riid: ConstPtr<Guid>, wparam: Wparam, punk: MutPtr<CVoid>): Lresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityLresultFromObject(riid.rawAddress.toString(), wparam.toString(), punk.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(hobj.rawAddress.toString(), viewid, ppstr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(hobj.rawAddress.toString(), viewid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    if (windowsWin32UiAccessibilityNapiAddon != null) {
        windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityNotifyWinEvent(event.toInt(), hwnd.rawAddress.toString(), idobject, idchild)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun objectFromLresult(lresult: Lresult, riid: ConstPtr<Guid>, wparam: Wparam, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityObjectFromLresult(lresult.toString(), riid.rawAddress.toString(), wparam.toString(), ppvobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(hobj.rawAddress.toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(hwnd.rawAddress.toString(), pointertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(hwnd.rawAddress.toString(), pointertype, fobserve) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityScrollPatternScroll(hobj.rawAddress.toString(), horizontalamount, verticalamount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(hobj.rawAddress.toString(), horizontalpercent, verticalpercent) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    if (windowsWin32UiAccessibilityNapiAddon != null) MutPtr((windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilitySetWinEventHook(eventmin.toInt(), eventmax.toInt(), hmodwineventproc.rawAddress.toString(), 0L.toString(), idprocess.toInt(), idthread.toInt(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(hobj.rawAddress.toString(), inputtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextPatternGetSelection(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(hobj.rawAddress.toString(), hnodechild.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: MutPtr<Huiatextrange>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: MutPtr<SupportedTextSelection>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeClone(hobj: Huiatextrange, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeClone(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: MutPtr<Bool>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeCompare(hobj.rawAddress.toString(), range.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(hobj.rawAddress.toString(), endpoint, targetrange.rawAddress.toString(), targetendpoint, pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(hobj.rawAddress.toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant.Variant, backward: Bool, pretval: MutPtr<Huiatextrange>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeFindText(hobj.rawAddress.toString(), text.rawAddress.toString(), backward, ignorecase, pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(hobj.rawAddress.toString(), attributeid, pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeGetChildren(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(hobj.rawAddress.toString(), pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeGetText(hobj.rawAddress.toString(), maxlength, pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeMove(hobj.rawAddress.toString(), unit, count, pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(hobj.rawAddress.toString(), endpoint, targetrange.rawAddress.toString(), targetendpoint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(hobj.rawAddress.toString(), endpoint, unit, count, pretval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(hobj.rawAddress.toString(), aligntotop) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTextRangeSelect(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTogglePatternToggle(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTransformPatternMove(hobj.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTransformPatternResize(hobj.rawAddress.toString(), width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityTransformPatternRotate(hobj.rawAddress.toString(), degrees) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: MutPtr<UiaEventCallback>, scope: TreeScope, pproperties: MutPtr<Int>, cproperties: Int, prequest: MutPtr<UiaCacheRequest>, phevent: MutPtr<Huiaevent>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaAddEvent(hnode.rawAddress.toString(), eventid, pcallback.rawAddress.toString(), scope, pproperties.rawAddress.toString(), cproperties, prequest.rawAddress.toString(), phevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaClientsAreListening(): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaClientsAreListening() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaDisconnectAllProviders(): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaDisconnectProvider(pprovider: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(pprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaEventAddWindow(hevent.rawAddress.toString(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(hevent.rawAddress.toString(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaFind(hnode: Huianode, pparams: MutPtr<UiaFindParams>, prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, ppoffsets: MutPtr<MutPtr<Safearray>>, pptreestructures: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaFind(hnode.rawAddress.toString(), pparams.rawAddress.toString(), prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), ppoffsets.rawAddress.toString(), pptreestructures.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetErrorDescription(pdescription: MutPtr<Bstr>): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(pdescription.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: MutPtr<Huiapatternobject>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(hnode.rawAddress.toString(), patternid, phobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(hnode.rawAddress.toString(), propertyid, pvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(punkmixedattributevalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(punknotsupportedvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetRootNode(phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetRootNode(phnode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(hnode.rawAddress.toString(), pruntimeid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: MutPtr<UiaCacheRequest>, normalizestate: NormalizeState, pnormalizecondition: MutPtr<UiaCondition>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(hnode.rawAddress.toString(), prequest.rawAddress.toString(), normalizestate, pnormalizecondition.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHPatternObjectFromVariant(pvar: MutPtr<Variant.Variant>, phobj: MutPtr<Huiapatternobject>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(pvar.rawAddress.toString(), phobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHTextRangeFromVariant(pvar: MutPtr<Variant.Variant>, phtextrange: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(pvar.rawAddress.toString(), phtextrange.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHUiaNodeFromVariant(pvar: MutPtr<Variant.Variant>, phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(pvar.rawAddress.toString(), phnode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(hwnd.rawAddress.toString(), ppprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaIAccessibleFromProvider(pprovider: MutPtr<CVoid>, dwflags: UInt, ppaccessible: MutPtr<MutPtr<CVoid>>, pvarchild: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(pprovider.rawAddress.toString(), dwflags.toInt(), ppaccessible.rawAddress.toString(), pvarchild.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: ConstPtr<Guid>): Int =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaLookupId(type, pguid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: MutPtr<UiaCondition>, prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaNavigate(hnode.rawAddress.toString(), direction, pcondition.rawAddress.toString(), prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromFocus(prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(hwnd.rawAddress.toString(), phnode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(x, y, prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromProvider(pprovider: MutPtr<CVoid>, phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(pprovider.rawAddress.toString(), phnode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaNodeRelease(hnode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaPatternRelease(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(hwnd.rawAddress.toString(), idobject, idchild, ppprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaProviderFromIAccessible(paccessible: MutPtr<CVoid>, idchild: Int, dwflags: UInt, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(paccessible.rawAddress.toString(), idchild, dwflags.toInt(), ppprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: MutPtr<CVoid>, textrange: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(provider.rawAddress.toString(), textrange.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: MutPtr<CVoid>, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(pprovider.rawAddress.toString(), asynccontentloadedstate, percentcomplete) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAutomationEvent(pprovider: MutPtr<CVoid>, id: UiaEventId): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(pprovider.rawAddress.toString(), id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: MutPtr<CVoid>, id: UiaPropertyId, oldvalue: Variant.Variant, newvalue: Variant.Variant): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseChangesEvent(pprovider: MutPtr<CVoid>, eventidcount: Int, puiachanges: MutPtr<UiaChangeInfo>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(pprovider.rawAddress.toString(), eventidcount, puiachanges.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseNotificationEvent(provider: MutPtr<CVoid>, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(provider.rawAddress.toString(), notificationkind, notificationprocessing, displaystring.rawAddress.toString(), activityid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseStructureChangedEvent(pprovider: MutPtr<CVoid>, structurechangetype: StructureChangeType, pruntimeid: MutPtr<Int>, cruntimeidlen: Int): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(pprovider.rawAddress.toString(), structurechangetype, pruntimeid.rawAddress.toString(), cruntimeidlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: MutPtr<CVoid>, texteditchangetype: TextEditChangeType, pchangeddata: MutPtr<Safearray>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(pprovider.rawAddress.toString(), texteditchangetype, pchangeddata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRegisterProviderCallback(pcallback: MutPtr<UiaProviderCallback>) {
    if (windowsWin32UiAccessibilityNapiAddon != null) {
        windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(pcallback.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaRemoveEvent(hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: MutPtr<CVoid>): Lresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(hwnd.rawAddress.toString(), wparam.toString(), lparam.toString(), el.rawAddress.toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaSetFocus(hnode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUnhookWinEvent(hwineventhook.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(hwnd.rawAddress.toString(), pointertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(hwnd.rawAddress.toString(), pointertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityValuePatternSetValue(hobj.rawAddress.toString(), pval.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromAccessibleObject(param0: MutPtr<CVoid>, phwnd: MutPtr<Hwnd>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(param0.rawAddress.toString(), phwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityWindowPatternClose(hobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(hobj.rawAddress.toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: MutPtr<Bool>): Hresult =
    if (windowsWin32UiAccessibilityNapiAddon != null) (windowsWin32UiAccessibilityNapiAddon.windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(hobj.rawAddress.toString(), milliseconds, presult.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
