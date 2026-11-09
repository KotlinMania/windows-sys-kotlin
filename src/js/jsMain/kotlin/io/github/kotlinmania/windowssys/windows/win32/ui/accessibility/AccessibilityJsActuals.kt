@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HMODULE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.LRESULT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM
import io.github.kotlinmania.windowssys.windows.win32.system.variant.VARIANT
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.POINTER_INPUT_TYPE

private val _windowsWin32UiAccessibilityNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AccNotifyTouchInteraction(hwndapp: HWND, hwndtarget: HWND, pttarget: POINT): HRESULT =
    0

public actual fun AccSetRunningUtilityState(hwndapp: HWND, dwutilitystatemask: UInt, dwutilitystate: ACC_UTILITY_STATE_FLAGS): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState(hwndapp.toString(), dwutilitystatemask.toInt(), dwutilitystate.toInt()) as Int) else 0

public actual fun AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_AccessibleChildren(pacccontainer.toString(), ichildstart, cchildren, rgvarchildren.toString(), pcobtained.toString()) as Int) else 0

public actual fun AccessibleObjectFromEvent(hwnd: HWND, dwid: UInt, dwchildid: UInt, ppacc: Long, pvarchild: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent(hwnd.toString(), dwid.toInt(), dwchildid.toInt(), ppacc.toString(), pvarchild.toString()) as Int) else 0

public actual fun AccessibleObjectFromPoint(ptscreen: POINT, ppacc: Long, pvarchild: Long): HRESULT =
    0

public actual fun AccessibleObjectFromWindow(hwnd: HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow(hwnd.toString(), dwid.toInt(), riid.toString(), ppvobject.toString()) as Int) else 0

public actual fun CreateStdAccessibleObject(hwnd: HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject(hwnd.toString(), idobject, riid.toString(), ppvobject.toString()) as Int) else 0

public actual fun CreateStdAccessibleProxyA(hwnd: HWND, pclassname: PCSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA(hwnd.toString(), pclassname.toString(), idobject, riid.toString(), ppvobject.toString()) as Int) else 0

public actual fun CreateStdAccessibleProxyW(hwnd: HWND, pclassname: PCWSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW(hwnd.toString(), pclassname.toString(), idobject, riid.toString(), ppvobject.toString()) as Int) else 0

public actual fun DockPattern_SetDockPosition(hobj: HUIAPATTERNOBJECT, dockposition: DockPosition): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition(hobj.toString(), dockposition) as Int) else 0

public actual fun ExpandCollapsePattern_Collapse(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse(hobj.toString()) as Int) else 0

public actual fun ExpandCollapsePattern_Expand(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand(hobj.toString()) as Int) else 0

public actual fun GetOleaccVersionInfo(pver: Long, pbuild: Long) {
    if (_windowsWin32UiAccessibilityNapiAddon != null) {
        _windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo(pver.toString(), pbuild.toString())
    }
}

public actual fun GetRoleTextA(lrole: UInt, lpszrole: PSTR, cchrolemax: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_GetRoleTextA(lrole.toInt(), lpszrole.toString(), cchrolemax.toInt()) as Int).toUInt() else 0u

public actual fun GetRoleTextW(lrole: UInt, lpszrole: PWSTR, cchrolemax: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_GetRoleTextW(lrole.toInt(), lpszrole.toString(), cchrolemax.toInt()) as Int).toUInt() else 0u

public actual fun GetStateTextA(lstatebit: UInt, lpszstate: PSTR, cchstate: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_GetStateTextA(lstatebit.toInt(), lpszstate.toString(), cchstate.toInt()) as Int).toUInt() else 0u

public actual fun GetStateTextW(lstatebit: UInt, lpszstate: PWSTR, cchstate: UInt): UInt =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_GetStateTextW(lstatebit.toInt(), lpszstate.toString(), cchstate.toInt()) as Int).toUInt() else 0u

public actual fun GridPattern_GetItem(hobj: HUIAPATTERNOBJECT, row: Int, column: Int, presult: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_GridPattern_GetItem(hobj.toString(), row, column, presult.toString()) as Int) else 0

public actual fun InvokePattern_Invoke(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke(hobj.toString()) as Int) else 0

public actual fun IsWinEventHookInstalled(event: UInt): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled(event.toInt()) as Int) else 0

public actual fun ItemContainerPattern_FindItemByProperty(hobj: HUIAPATTERNOBJECT, hnodestartafter: HUIANODE, propertyid: Int, value: VARIANT, pfound: Long): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_DoDefaultAction(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction(hobj.toString()) as Int) else 0

public actual fun LegacyIAccessiblePattern_GetIAccessible(hobj: HUIAPATTERNOBJECT, paccessible: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible(hobj.toString(), paccessible.toString()) as Int) else 0

public actual fun LegacyIAccessiblePattern_Select(hobj: HUIAPATTERNOBJECT, flagsselect: Int): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select(hobj.toString(), flagsselect) as Int) else 0

public actual fun LegacyIAccessiblePattern_SetValue(hobj: HUIAPATTERNOBJECT, szvalue: PCWSTR): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue(hobj.toString(), szvalue.toString()) as Int) else 0

public actual fun LresultFromObject(riid: Long, wparam: WPARAM, punk: Long): LRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_LresultFromObject(riid.toString(), wparam.toString(), punk.toString()) as String).toLong() else 0L

public actual fun MultipleViewPattern_GetViewName(hobj: HUIAPATTERNOBJECT, viewid: Int, ppstr: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName(hobj.toString(), viewid, ppstr.toString()) as Int) else 0

public actual fun MultipleViewPattern_SetCurrentView(hobj: HUIAPATTERNOBJECT, viewid: Int): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView(hobj.toString(), viewid) as Int) else 0

public actual fun NotifyWinEvent(event: UInt, hwnd: HWND, idobject: Int, idchild: Int) {
    if (_windowsWin32UiAccessibilityNapiAddon != null) {
        _windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_NotifyWinEvent(event.toInt(), hwnd.toString(), idobject, idchild)
    }
}

public actual fun ObjectFromLresult(lresult: LRESULT, riid: Long, wparam: WPARAM, ppvobject: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ObjectFromLresult(lresult.toString(), riid.toString(), wparam.toString(), ppvobject.toString()) as Int) else 0

public actual fun RangeValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, value: Double): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue(hobj.toString(), value) as Int) else 0

public actual fun RegisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget(hwnd.toString(), pointertype) as Int) else 0

public actual fun RegisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE, fobserve: BOOL): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx(hwnd.toString(), pointertype, fobserve) as Int) else 0

public actual fun ScrollItemPattern_ScrollIntoView(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView(hobj.toString()) as Int) else 0

public actual fun ScrollPattern_Scroll(hobj: HUIAPATTERNOBJECT, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll(hobj.toString(), horizontalamount, verticalamount) as Int) else 0

public actual fun ScrollPattern_SetScrollPercent(hobj: HUIAPATTERNOBJECT, horizontalpercent: Double, verticalpercent: Double): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent(hobj.toString(), horizontalpercent, verticalpercent) as Int) else 0

public actual fun SelectionItemPattern_AddToSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection(hobj.toString()) as Int) else 0

public actual fun SelectionItemPattern_RemoveFromSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection(hobj.toString()) as Int) else 0

public actual fun SelectionItemPattern_Select(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select(hobj.toString()) as Int) else 0

public actual fun SetWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: HMODULE, pfnwineventproc: WINEVENTPROC, idprocess: UInt, idthread: UInt, dwflags: UInt): HWINEVENTHOOK =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_SetWinEventHook(eventmin.toInt(), eventmax.toInt(), hmodwineventproc.toString(), pfnwineventproc.toLong().toString(), idprocess.toInt(), idthread.toInt(), dwflags.toInt()) as String).toLong() else 0L

public actual fun SynchronizedInputPattern_Cancel(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel(hobj.toString()) as Int) else 0

public actual fun SynchronizedInputPattern_StartListening(hobj: HUIAPATTERNOBJECT, inputtype: SynchronizedInputType): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening(hobj.toString(), inputtype) as Int) else 0

public actual fun TextPattern_GetSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextPattern_GetVisibleRanges(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextPattern_RangeFromChild(hobj: HUIAPATTERNOBJECT, hnodechild: HUIANODE, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild(hobj.toString(), hnodechild.toString(), pretval.toString()) as Int) else 0

public actual fun TextPattern_RangeFromPoint(hobj: HUIAPATTERNOBJECT, point: UiaPoint, pretval: Long): HRESULT =
    0

public actual fun TextPattern_get_DocumentRange(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextPattern_get_SupportedTextSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextRange_AddToSelection(hobj: HUIATEXTRANGE): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection(hobj.toString()) as Int) else 0

public actual fun TextRange_Clone(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_Clone(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextRange_Compare(hobj: HUIATEXTRANGE, range: HUIATEXTRANGE, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_Compare(hobj.toString(), range.toString(), pretval.toString()) as Int) else 0

public actual fun TextRange_CompareEndpoints(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints(hobj.toString(), endpoint, targetrange.toString(), targetendpoint, pretval.toString()) as Int) else 0

public actual fun TextRange_ExpandToEnclosingUnit(hobj: HUIATEXTRANGE, unit: TextUnit): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit(hobj.toString(), unit) as Int) else 0

public actual fun TextRange_FindAttribute(hobj: HUIATEXTRANGE, attributeid: Int, value: VARIANT, backward: BOOL, pretval: Long): HRESULT =
    0

public actual fun TextRange_FindText(hobj: HUIATEXTRANGE, text: BSTR, backward: BOOL, ignorecase: BOOL, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_FindText(hobj.toString(), text.toString(), backward, ignorecase, pretval.toString()) as Int) else 0

public actual fun TextRange_GetAttributeValue(hobj: HUIATEXTRANGE, attributeid: Int, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue(hobj.toString(), attributeid, pretval.toString()) as Int) else 0

public actual fun TextRange_GetBoundingRectangles(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextRange_GetChildren(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_GetChildren(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextRange_GetEnclosingElement(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement(hobj.toString(), pretval.toString()) as Int) else 0

public actual fun TextRange_GetText(hobj: HUIATEXTRANGE, maxlength: Int, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_GetText(hobj.toString(), maxlength, pretval.toString()) as Int) else 0

public actual fun TextRange_Move(hobj: HUIATEXTRANGE, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_Move(hobj.toString(), unit, count, pretval.toString()) as Int) else 0

public actual fun TextRange_MoveEndpointByRange(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange(hobj.toString(), endpoint, targetrange.toString(), targetendpoint) as Int) else 0

public actual fun TextRange_MoveEndpointByUnit(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit(hobj.toString(), endpoint, unit, count, pretval.toString()) as Int) else 0

public actual fun TextRange_RemoveFromSelection(hobj: HUIATEXTRANGE): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection(hobj.toString()) as Int) else 0

public actual fun TextRange_ScrollIntoView(hobj: HUIATEXTRANGE, aligntotop: BOOL): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView(hobj.toString(), aligntotop) as Int) else 0

public actual fun TextRange_Select(hobj: HUIATEXTRANGE): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TextRange_Select(hobj.toString()) as Int) else 0

public actual fun TogglePattern_Toggle(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle(hobj.toString()) as Int) else 0

public actual fun TransformPattern_Move(hobj: HUIAPATTERNOBJECT, x: Double, y: Double): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TransformPattern_Move(hobj.toString(), x, y) as Int) else 0

public actual fun TransformPattern_Resize(hobj: HUIAPATTERNOBJECT, width: Double, height: Double): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TransformPattern_Resize(hobj.toString(), width, height) as Int) else 0

public actual fun TransformPattern_Rotate(hobj: HUIAPATTERNOBJECT, degrees: Double): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate(hobj.toString(), degrees) as Int) else 0

public actual fun UiaAddEvent(hnode: HUIANODE, eventid: Int, pcallback: Long, scope: TreeScope, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaAddEvent(hnode.toString(), eventid, pcallback.toString(), scope, pproperties.toString(), cproperties, prequest.toString(), phevent.toString()) as Int) else 0

public actual fun UiaClientsAreListening(): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaClientsAreListening() as Int) else 0

public actual fun UiaDisconnectAllProviders(): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders() as Int) else 0

public actual fun UiaDisconnectProvider(pprovider: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider(pprovider.toString()) as Int) else 0

public actual fun UiaEventAddWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaEventAddWindow(hevent.toString(), hwnd.toString()) as Int) else 0

public actual fun UiaEventRemoveWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow(hevent.toString(), hwnd.toString()) as Int) else 0

public actual fun UiaFind(hnode: HUIANODE, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaFind(hnode.toString(), pparams.toString(), prequest.toString(), pprequesteddata.toString(), ppoffsets.toString(), pptreestructures.toString()) as Int) else 0

public actual fun UiaGetErrorDescription(pdescription: Long): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription(pdescription.toString()) as Int) else 0

public actual fun UiaGetPatternProvider(hnode: HUIANODE, patternid: Int, phobj: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider(hnode.toString(), patternid, phobj.toString()) as Int) else 0

public actual fun UiaGetPropertyValue(hnode: HUIANODE, propertyid: Int, pvalue: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue(hnode.toString(), propertyid, pvalue.toString()) as Int) else 0

public actual fun UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue(punkmixedattributevalue.toString()) as Int) else 0

public actual fun UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue(punknotsupportedvalue.toString()) as Int) else 0

public actual fun UiaGetRootNode(phnode: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetRootNode(phnode.toString()) as Int) else 0

public actual fun UiaGetRuntimeId(hnode: HUIANODE, pruntimeid: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId(hnode.toString(), pruntimeid.toString()) as Int) else 0

public actual fun UiaGetUpdatedCache(hnode: HUIANODE, prequest: Long, normalizestate: NormalizeState, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache(hnode.toString(), prequest.toString(), normalizestate, pnormalizecondition.toString(), pprequesteddata.toString(), pptreestructure.toString()) as Int) else 0

public actual fun UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant(pvar.toString(), phobj.toString()) as Int) else 0

public actual fun UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant(pvar.toString(), phtextrange.toString()) as Int) else 0

public actual fun UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant(pvar.toString(), phnode.toString()) as Int) else 0

public actual fun UiaHasServerSideProvider(hwnd: HWND): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider(hwnd.toString()) as Int) else 0

public actual fun UiaHostProviderFromHwnd(hwnd: HWND, ppprovider: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd(hwnd.toString(), ppprovider.toString()) as Int) else 0

public actual fun UiaIAccessibleFromProvider(pprovider: Long, dwflags: UInt, ppaccessible: Long, pvarchild: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider(pprovider.toString(), dwflags.toInt(), ppaccessible.toString(), pvarchild.toString()) as Int) else 0

public actual fun UiaLookupId(type: AutomationIdentifierType, pguid: Long): Int =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaLookupId(type, pguid.toString()) as Int) else 0

public actual fun UiaNavigate(hnode: HUIANODE, direction: NavigateDirection, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaNavigate(hnode.toString(), direction, pcondition.toString(), prequest.toString(), pprequesteddata.toString(), pptreestructure.toString()) as Int) else 0

public actual fun UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus(prequest.toString(), pprequesteddata.toString(), pptreestructure.toString()) as Int) else 0

public actual fun UiaNodeFromHandle(hwnd: HWND, phnode: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle(hwnd.toString(), phnode.toString()) as Int) else 0

public actual fun UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint(x, y, prequest.toString(), pprequesteddata.toString(), pptreestructure.toString()) as Int) else 0

public actual fun UiaNodeFromProvider(pprovider: Long, phnode: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider(pprovider.toString(), phnode.toString()) as Int) else 0

public actual fun UiaNodeRelease(hnode: HUIANODE): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaNodeRelease(hnode.toString()) as Int) else 0

public actual fun UiaPatternRelease(hobj: HUIAPATTERNOBJECT): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaPatternRelease(hobj.toString()) as Int) else 0

public actual fun UiaProviderForNonClient(hwnd: HWND, idobject: Int, idchild: Int, ppprovider: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient(hwnd.toString(), idobject, idchild, ppprovider.toString()) as Int) else 0

public actual fun UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: UInt, ppprovider: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible(paccessible.toString(), idchild, dwflags.toInt(), ppprovider.toString()) as Int) else 0

public actual fun UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent(provider.toString(), textrange.toString()) as Int) else 0

public actual fun UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent(pprovider.toString(), asynccontentloadedstate, percentcomplete) as Int) else 0

public actual fun UiaRaiseAutomationEvent(pprovider: Long, id: UIA_EVENT_ID): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent(pprovider.toString(), id) as Int) else 0

public actual fun UiaRaiseAutomationPropertyChangedEvent(pprovider: Long, id: UIA_PROPERTY_ID, oldvalue: VARIANT, newvalue: VARIANT): HRESULT =
    0

public actual fun UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent(pprovider.toString(), eventidcount, puiachanges.toString()) as Int) else 0

public actual fun UiaRaiseNotificationEvent(provider: Long, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: BSTR, activityid: BSTR): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent(provider.toString(), notificationkind, notificationprocessing, displaystring.toString(), activityid.toString()) as Int) else 0

public actual fun UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: StructureChangeType, pruntimeid: Long, cruntimeidlen: Int): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent(pprovider.toString(), structurechangetype, pruntimeid.toString(), cruntimeidlen) as Int) else 0

public actual fun UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: TextEditChangeType, pchangeddata: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent(pprovider.toString(), texteditchangetype, pchangeddata.toString()) as Int) else 0

public actual fun UiaRegisterProviderCallback(pcallback: Long) {
    if (_windowsWin32UiAccessibilityNapiAddon != null) {
        _windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback(pcallback.toString())
    }
}

public actual fun UiaRemoveEvent(hevent: HUIAEVENT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaRemoveEvent(hevent.toString()) as Int) else 0

public actual fun UiaReturnRawElementProvider(hwnd: HWND, wparam: WPARAM, lparam: LPARAM, el: Long): LRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider(hwnd.toString(), wparam.toString(), lparam.toString(), el.toString()) as String).toLong() else 0L

public actual fun UiaSetFocus(hnode: HUIANODE): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaSetFocus(hnode.toString()) as Int) else 0

public actual fun UiaTextRangeRelease(hobj: HUIATEXTRANGE): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease(hobj.toString()) as Int) else 0

public actual fun UnhookWinEvent(hwineventhook: HWINEVENTHOOK): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UnhookWinEvent(hwineventhook.toString()) as Int) else 0

public actual fun UnregisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget(hwnd.toString(), pointertype) as Int) else 0

public actual fun UnregisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx(hwnd.toString(), pointertype) as Int) else 0

public actual fun ValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, pval: PCWSTR): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue(hobj.toString(), pval.toString()) as Int) else 0

public actual fun VirtualizedItemPattern_Realize(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize(hobj.toString()) as Int) else 0

public actual fun WindowFromAccessibleObject(param0: Long, phwnd: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject(param0.toString(), phwnd.toString()) as Int) else 0

public actual fun WindowPattern_Close(hobj: HUIAPATTERNOBJECT): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_WindowPattern_Close(hobj.toString()) as Int) else 0

public actual fun WindowPattern_SetWindowVisualState(hobj: HUIAPATTERNOBJECT, state: WindowVisualState): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState(hobj.toString(), state) as Int) else 0

public actual fun WindowPattern_WaitForInputIdle(hobj: HUIAPATTERNOBJECT, milliseconds: Int, presult: Long): HRESULT =
    if (_windowsWin32UiAccessibilityNapiAddon != null) (_windowsWin32UiAccessibilityNapiAddon.windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle(hobj.toString(), milliseconds, presult.toString()) as Int) else 0
