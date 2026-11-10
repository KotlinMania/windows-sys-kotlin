@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
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
import io.github.kotlinmania.windowssys.windows.win32.system.variant.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

private val _windowsWin32UiAccessibilityNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState((hwndapp?.value ?: 0L).toString(), dwutilitystatemask.toInt(), dwutilitystate.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleChildren(pacccontainer: COpaquePointer?, ichildstart: Int, cchildren: Int, rgvarchildren: COpaquePointer?, pcobtained: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_accessibleChildren((pacccontainer?.value ?: 0L).toString(), ichildstart, cchildren, (rgvarchildren?.value ?: 0L).toString(), (pcobtained?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent((hwnd?.value ?: 0L).toString(), dwid.toInt(), dwchildid.toInt(), (ppacc?.value ?: 0L).toString(), (pvarchild?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow((hwnd?.value ?: 0L).toString(), dwid.toInt(), (riid?.value ?: 0L).toString(), (ppvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_createStdAccessibleObject((hwnd?.value ?: 0L).toString(), idobject, (riid?.value ?: 0L).toString(), (ppvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA((hwnd?.value ?: 0L).toString(), (pclassname?.value ?: 0L).toString(), idobject, (riid?.value ?: 0L).toString(), (ppvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW((hwnd?.value ?: 0L).toString(), (pclassname?.value ?: 0L).toString(), idobject, (riid?.value ?: 0L).toString(), (ppvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition((hobj?.value ?: 0L).toString(), dockposition) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOleaccVersionInfo(pver: COpaquePointer?, pbuild: COpaquePointer?) {
    if (_windowsWin32UiAccessibilityNapiAddon != null) {
        _windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo((pver?.value ?: 0L).toString(), (pbuild?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_getRoleTextA(lrole.toInt(), (lpszrole?.value ?: 0L).toString(), cchrolemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_getRoleTextW(lrole.toInt(), (lpszrole?.value ?: 0L).toString(), cchrolemax.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_getStateTextA(lstatebit.toInt(), (lpszstate?.value ?: 0L).toString(), cchstate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_getStateTextW(lstatebit.toInt(), (lpszstate?.value ?: 0L).toString(), cchstate.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_gridPatternGetItem((hobj?.value ?: 0L).toString(), row, column, (presult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_invokePatternInvoke((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled(event.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible((hobj?.value ?: 0L).toString(), (paccessible?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect((hobj?.value ?: 0L).toString(), flagsselect) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue((hobj?.value ?: 0L).toString(), (szvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lresultFromObject(riid: COpaquePointer?, wparam: Wparam, punk: COpaquePointer?): Lresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_lresultFromObject((riid?.value ?: 0L).toString(), wparam.toString(), (punk?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName((hobj?.value ?: 0L).toString(), viewid, (ppstr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView((hobj?.value ?: 0L).toString(), viewid) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    if (_windowsWin32UiAccessibilityNapiAddon != null) {
        _windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_notifyWinEvent(event.toInt(), (hwnd?.value ?: 0L).toString(), idobject, idchild)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun objectFromLresult(lresult: Lresult, riid: COpaquePointer?, wparam: Wparam, ppvobject: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_objectFromLresult(lresult.toString(), (riid?.value ?: 0L).toString(), wparam.toString(), (ppvobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue((hobj?.value ?: 0L).toString(), value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_registerPointerInputTarget((hwnd?.value ?: 0L).toString(), pointertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx((hwnd?.value ?: 0L).toString(), pointertype, fobserve) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_scrollPatternScroll((hobj?.value ?: 0L).toString(), horizontalamount, verticalamount) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent((hobj?.value ?: 0L).toString(), horizontalpercent, verticalpercent) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_setWinEventHook(eventmin.toInt(), eventmax.toInt(), (hmodwineventproc?.value ?: 0L).toString(), 0L.toString(), idprocess.toInt(), idthread.toInt(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening((hobj?.value ?: 0L).toString(), inputtype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textPatternGetSelection((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild((hobj?.value ?: 0L).toString(), (hnodechild?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeAddToSelection((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeClone(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeClone((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeCompare((hobj?.value ?: 0L).toString(), (range?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints((hobj?.value ?: 0L).toString(), endpoint, (targetrange?.value ?: 0L).toString(), targetendpoint, (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit((hobj?.value ?: 0L).toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeFindText((hobj?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), backward, ignorecase, (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue((hobj?.value ?: 0L).toString(), attributeid, (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeGetChildren((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement((hobj?.value ?: 0L).toString(), (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeGetText((hobj?.value ?: 0L).toString(), maxlength, (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeMove((hobj?.value ?: 0L).toString(), unit, count, (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange((hobj?.value ?: 0L).toString(), endpoint, (targetrange?.value ?: 0L).toString(), targetendpoint) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit((hobj?.value ?: 0L).toString(), endpoint, unit, count, (pretval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView((hobj?.value ?: 0L).toString(), aligntotop) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_textRangeSelect((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_togglePatternToggle((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_transformPatternMove((hobj?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_transformPatternResize((hobj?.value ?: 0L).toString(), width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_transformPatternRotate((hobj?.value ?: 0L).toString(), degrees) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: COpaquePointer?, scope: TreeScope, pproperties: COpaquePointer?, cproperties: Int, prequest: COpaquePointer?, phevent: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaAddEvent((hnode?.value ?: 0L).toString(), eventid, (pcallback?.value ?: 0L).toString(), scope, (pproperties?.value ?: 0L).toString(), cproperties, (prequest?.value ?: 0L).toString(), (phevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaClientsAreListening(): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaClientsAreListening() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaDisconnectAllProviders(): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaDisconnectProvider(pprovider: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider((pprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaEventAddWindow((hevent?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow((hevent?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaFind(hnode: Huianode, pparams: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, ppoffsets: COpaquePointer?, pptreestructures: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaFind((hnode?.value ?: 0L).toString(), (pparams?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), (pprequesteddata?.value ?: 0L).toString(), (ppoffsets?.value ?: 0L).toString(), (pptreestructures?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetErrorDescription(pdescription: COpaquePointer?): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription((pdescription?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider((hnode?.value ?: 0L).toString(), patternid, (phobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue((hnode?.value ?: 0L).toString(), propertyid, (pvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue((punkmixedattributevalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue((punknotsupportedvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetRootNode(phnode: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetRootNode((phnode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId((hnode?.value ?: 0L).toString(), (pruntimeid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: COpaquePointer?, normalizestate: NormalizeState, pnormalizecondition: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache((hnode?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), normalizestate, (pnormalizecondition?.value ?: 0L).toString(), (pprequesteddata?.value ?: 0L).toString(), (pptreestructure?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHPatternObjectFromVariant(pvar: COpaquePointer?, phobj: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant((pvar?.value ?: 0L).toString(), (phobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHTextRangeFromVariant(pvar: COpaquePointer?, phtextrange: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant((pvar?.value ?: 0L).toString(), (phtextrange?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHUiaNodeFromVariant(pvar: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant((pvar?.value ?: 0L).toString(), (phnode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd((hwnd?.value ?: 0L).toString(), (ppprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaIAccessibleFromProvider(pprovider: COpaquePointer?, dwflags: UInt, ppaccessible: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider((pprovider?.value ?: 0L).toString(), dwflags.toInt(), (ppaccessible?.value ?: 0L).toString(), (pvarchild?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: COpaquePointer?): Int =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaLookupId(type, (pguid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaNavigate((hnode?.value ?: 0L).toString(), direction, (pcondition?.value ?: 0L).toString(), (prequest?.value ?: 0L).toString(), (pprequesteddata?.value ?: 0L).toString(), (pptreestructure?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromFocus(prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus((prequest?.value ?: 0L).toString(), (pprequesteddata?.value ?: 0L).toString(), (pptreestructure?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle((hwnd?.value ?: 0L).toString(), (phnode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint(x, y, (prequest?.value ?: 0L).toString(), (pprequesteddata?.value ?: 0L).toString(), (pptreestructure?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromProvider(pprovider: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider((pprovider?.value ?: 0L).toString(), (phnode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaNodeRelease((hnode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaPatternRelease((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient((hwnd?.value ?: 0L).toString(), idobject, idchild, (ppprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaProviderFromIAccessible(paccessible: COpaquePointer?, idchild: Int, dwflags: UInt, ppprovider: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible((paccessible?.value ?: 0L).toString(), idchild, dwflags.toInt(), (ppprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: COpaquePointer?, textrange: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent((provider?.value ?: 0L).toString(), (textrange?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: COpaquePointer?, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent((pprovider?.value ?: 0L).toString(), asynccontentloadedstate, percentcomplete) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAutomationEvent(pprovider: COpaquePointer?, id: UiaEventId): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent((pprovider?.value ?: 0L).toString(), id) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: COpaquePointer?, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseChangesEvent(pprovider: COpaquePointer?, eventidcount: Int, puiachanges: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent((pprovider?.value ?: 0L).toString(), eventidcount, (puiachanges?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseNotificationEvent(provider: COpaquePointer?, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent((provider?.value ?: 0L).toString(), notificationkind, notificationprocessing, (displaystring?.value ?: 0L).toString(), (activityid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseStructureChangedEvent(pprovider: COpaquePointer?, structurechangetype: StructureChangeType, pruntimeid: COpaquePointer?, cruntimeidlen: Int): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent((pprovider?.value ?: 0L).toString(), structurechangetype, (pruntimeid?.value ?: 0L).toString(), cruntimeidlen) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: COpaquePointer?, texteditchangetype: TextEditChangeType, pchangeddata: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent((pprovider?.value ?: 0L).toString(), texteditchangetype, (pchangeddata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRegisterProviderCallback(pcallback: COpaquePointer?) {
    if (_windowsWin32UiAccessibilityNapiAddon != null) {
        _windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback((pcallback?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaRemoveEvent((hevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: COpaquePointer?): Lresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider((hwnd?.value ?: 0L).toString(), wparam.toString(), lparam.toString(), (el?.value ?: 0L).toString()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaSetFocus((hnode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_unhookWinEvent((hwineventhook?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget((hwnd?.value ?: 0L).toString(), pointertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx((hwnd?.value ?: 0L).toString(), pointertype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_valuePatternSetValue((hobj?.value ?: 0L).toString(), (pval?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromAccessibleObject(param0: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject((param0?.value ?: 0L).toString(), (phwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_windowPatternClose((hobj?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState((hobj?.value ?: 0L).toString(), state) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: COpaquePointer?): Hresult =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle((hobj?.value ?: 0L).toString(), milliseconds, (presult?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
