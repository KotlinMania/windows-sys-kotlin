@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AccNotifyTouchInteraction(hwndapp: HWND, hwndtarget: HWND, pttarget: POINT): HRESULT =
    0

public actual fun AccSetRunningUtilityState(hwndapp: HWND, dwutilitystatemask: UInt, dwutilitystate: ACC_UTILITY_STATE_FLAGS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState(hwndapp.toCPointer<ByteVar>(), dwutilitystatemask, dwutilitystate)

public actual fun AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_AccessibleChildren(pacccontainer.toCPointer<ByteVar>(), ichildstart, cchildren, rgvarchildren.toCPointer<ByteVar>(), pcobtained.toCPointer<ByteVar>())

public actual fun AccessibleObjectFromEvent(hwnd: HWND, dwid: UInt, dwchildid: UInt, ppacc: Long, pvarchild: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent(hwnd.toCPointer<ByteVar>(), dwid, dwchildid, ppacc.toCPointer<ByteVar>(), pvarchild.toCPointer<ByteVar>())

public actual fun AccessibleObjectFromPoint(ptscreen: POINT, ppacc: Long, pvarchild: Long): HRESULT =
    0

public actual fun AccessibleObjectFromWindow(hwnd: HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow(hwnd.toCPointer<ByteVar>(), dwid, riid.toCPointer<ByteVar>(), ppvobject.toCPointer<ByteVar>())

public actual fun CreateStdAccessibleObject(hwnd: HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject(hwnd.toCPointer<ByteVar>(), idobject, riid.toCPointer<ByteVar>(), ppvobject.toCPointer<ByteVar>())

public actual fun CreateStdAccessibleProxyA(hwnd: HWND, pclassname: PCSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA(hwnd.toCPointer<ByteVar>(), pclassname.toCPointer<ByteVar>(), idobject, riid.toCPointer<ByteVar>(), ppvobject.toCPointer<ByteVar>())

public actual fun CreateStdAccessibleProxyW(hwnd: HWND, pclassname: PCWSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW(hwnd.toCPointer<ByteVar>(), pclassname.toCPointer<ByteVar>(), idobject, riid.toCPointer<ByteVar>(), ppvobject.toCPointer<ByteVar>())

public actual fun DockPattern_SetDockPosition(hobj: HUIAPATTERNOBJECT, dockposition: DockPosition): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition(hobj.toCPointer<ByteVar>(), dockposition)

public actual fun ExpandCollapsePattern_Collapse(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse(hobj.toCPointer<ByteVar>())

public actual fun ExpandCollapsePattern_Expand(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand(hobj.toCPointer<ByteVar>())

public actual fun GetOleaccVersionInfo(pver: Long, pbuild: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo(pver.toCPointer<ByteVar>(), pbuild.toCPointer<ByteVar>())
}

public actual fun GetRoleTextA(lrole: UInt, lpszrole: PSTR, cchrolemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_GetRoleTextA(lrole, lpszrole.toCPointer<ByteVar>(), cchrolemax)

public actual fun GetRoleTextW(lrole: UInt, lpszrole: PWSTR, cchrolemax: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_GetRoleTextW(lrole, lpszrole.toCPointer<ByteVar>(), cchrolemax)

public actual fun GetStateTextA(lstatebit: UInt, lpszstate: PSTR, cchstate: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_GetStateTextA(lstatebit, lpszstate.toCPointer<ByteVar>(), cchstate)

public actual fun GetStateTextW(lstatebit: UInt, lpszstate: PWSTR, cchstate: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_GetStateTextW(lstatebit, lpszstate.toCPointer<ByteVar>(), cchstate)

public actual fun GridPattern_GetItem(hobj: HUIAPATTERNOBJECT, row: Int, column: Int, presult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_GridPattern_GetItem(hobj.toCPointer<ByteVar>(), row, column, presult.toCPointer<ByteVar>())

public actual fun InvokePattern_Invoke(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke(hobj.toCPointer<ByteVar>())

public actual fun IsWinEventHookInstalled(event: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled(event)

public actual fun ItemContainerPattern_FindItemByProperty(hobj: HUIAPATTERNOBJECT, hnodestartafter: HUIANODE, propertyid: Int, value: VARIANT, pfound: Long): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_DoDefaultAction(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction(hobj.toCPointer<ByteVar>())

public actual fun LegacyIAccessiblePattern_GetIAccessible(hobj: HUIAPATTERNOBJECT, paccessible: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible(hobj.toCPointer<ByteVar>(), paccessible.toCPointer<ByteVar>())

public actual fun LegacyIAccessiblePattern_Select(hobj: HUIAPATTERNOBJECT, flagsselect: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select(hobj.toCPointer<ByteVar>(), flagsselect)

public actual fun LegacyIAccessiblePattern_SetValue(hobj: HUIAPATTERNOBJECT, szvalue: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue(hobj.toCPointer<ByteVar>(), szvalue.toCPointer<ByteVar>())

public actual fun LresultFromObject(riid: Long, wparam: WPARAM, punk: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_LresultFromObject(riid.toCPointer<ByteVar>(), wparam, punk.toCPointer<ByteVar>())

public actual fun MultipleViewPattern_GetViewName(hobj: HUIAPATTERNOBJECT, viewid: Int, ppstr: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName(hobj.toCPointer<ByteVar>(), viewid, ppstr.toCPointer<ByteVar>())

public actual fun MultipleViewPattern_SetCurrentView(hobj: HUIAPATTERNOBJECT, viewid: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView(hobj.toCPointer<ByteVar>(), viewid)

public actual fun NotifyWinEvent(event: UInt, hwnd: HWND, idobject: Int, idchild: Int) {
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_NotifyWinEvent(event, hwnd.toCPointer<ByteVar>(), idobject, idchild)
}

public actual fun ObjectFromLresult(lresult: LRESULT, riid: Long, wparam: WPARAM, ppvobject: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ObjectFromLresult(lresult, riid.toCPointer<ByteVar>(), wparam, ppvobject.toCPointer<ByteVar>())

public actual fun RangeValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, value: Double): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue(hobj.toCPointer<ByteVar>(), value)

public actual fun RegisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget(hwnd.toCPointer<ByteVar>(), pointertype)

public actual fun RegisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE, fobserve: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx(hwnd.toCPointer<ByteVar>(), pointertype, fobserve)

public actual fun ScrollItemPattern_ScrollIntoView(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView(hobj.toCPointer<ByteVar>())

public actual fun ScrollPattern_Scroll(hobj: HUIAPATTERNOBJECT, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll(hobj.toCPointer<ByteVar>(), horizontalamount, verticalamount)

public actual fun ScrollPattern_SetScrollPercent(hobj: HUIAPATTERNOBJECT, horizontalpercent: Double, verticalpercent: Double): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent(hobj.toCPointer<ByteVar>(), horizontalpercent, verticalpercent)

public actual fun SelectionItemPattern_AddToSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection(hobj.toCPointer<ByteVar>())

public actual fun SelectionItemPattern_RemoveFromSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection(hobj.toCPointer<ByteVar>())

public actual fun SelectionItemPattern_Select(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select(hobj.toCPointer<ByteVar>())

public actual fun SetWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: HMODULE, pfnwineventproc: WINEVENTPROC, idprocess: UInt, idthread: UInt, dwflags: UInt): HWINEVENTHOOK =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_SetWinEventHook(eventmin, eventmax, hmodwineventproc.toCPointer<ByteVar>(), pfnwineventproc.toLong().toCPointer<ByteVar>(), idprocess, idthread, dwflags)?.toLong() ?: 0L

public actual fun SynchronizedInputPattern_Cancel(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel(hobj.toCPointer<ByteVar>())

public actual fun SynchronizedInputPattern_StartListening(hobj: HUIAPATTERNOBJECT, inputtype: SynchronizedInputType): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening(hobj.toCPointer<ByteVar>(), inputtype)

public actual fun TextPattern_GetSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextPattern_GetVisibleRanges(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextPattern_RangeFromChild(hobj: HUIAPATTERNOBJECT, hnodechild: HUIANODE, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild(hobj.toCPointer<ByteVar>(), hnodechild.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextPattern_RangeFromPoint(hobj: HUIAPATTERNOBJECT, point: UiaPoint, pretval: Long): HRESULT =
    0

public actual fun TextPattern_get_DocumentRange(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextPattern_get_SupportedTextSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextRange_AddToSelection(hobj: HUIATEXTRANGE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection(hobj.toCPointer<ByteVar>())

public actual fun TextRange_Clone(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_Clone(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextRange_Compare(hobj: HUIATEXTRANGE, range: HUIATEXTRANGE, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_Compare(hobj.toCPointer<ByteVar>(), range.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextRange_CompareEndpoints(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints(hobj.toCPointer<ByteVar>(), endpoint, targetrange.toCPointer<ByteVar>(), targetendpoint, pretval.toCPointer<ByteVar>())

public actual fun TextRange_ExpandToEnclosingUnit(hobj: HUIATEXTRANGE, unit: TextUnit): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit(hobj.toCPointer<ByteVar>(), unit)

public actual fun TextRange_FindAttribute(hobj: HUIATEXTRANGE, attributeid: Int, value: VARIANT, backward: BOOL, pretval: Long): HRESULT =
    0

public actual fun TextRange_FindText(hobj: HUIATEXTRANGE, text: BSTR, backward: BOOL, ignorecase: BOOL, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_FindText(hobj.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), backward, ignorecase, pretval.toCPointer<ByteVar>())

public actual fun TextRange_GetAttributeValue(hobj: HUIATEXTRANGE, attributeid: Int, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue(hobj.toCPointer<ByteVar>(), attributeid, pretval.toCPointer<ByteVar>())

public actual fun TextRange_GetBoundingRectangles(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextRange_GetChildren(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_GetChildren(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextRange_GetEnclosingElement(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement(hobj.toCPointer<ByteVar>(), pretval.toCPointer<ByteVar>())

public actual fun TextRange_GetText(hobj: HUIATEXTRANGE, maxlength: Int, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_GetText(hobj.toCPointer<ByteVar>(), maxlength, pretval.toCPointer<ByteVar>())

public actual fun TextRange_Move(hobj: HUIATEXTRANGE, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_Move(hobj.toCPointer<ByteVar>(), unit, count, pretval.toCPointer<ByteVar>())

public actual fun TextRange_MoveEndpointByRange(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange(hobj.toCPointer<ByteVar>(), endpoint, targetrange.toCPointer<ByteVar>(), targetendpoint)

public actual fun TextRange_MoveEndpointByUnit(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit(hobj.toCPointer<ByteVar>(), endpoint, unit, count, pretval.toCPointer<ByteVar>())

public actual fun TextRange_RemoveFromSelection(hobj: HUIATEXTRANGE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection(hobj.toCPointer<ByteVar>())

public actual fun TextRange_ScrollIntoView(hobj: HUIATEXTRANGE, aligntotop: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView(hobj.toCPointer<ByteVar>(), aligntotop)

public actual fun TextRange_Select(hobj: HUIATEXTRANGE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TextRange_Select(hobj.toCPointer<ByteVar>())

public actual fun TogglePattern_Toggle(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle(hobj.toCPointer<ByteVar>())

public actual fun TransformPattern_Move(hobj: HUIAPATTERNOBJECT, x: Double, y: Double): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TransformPattern_Move(hobj.toCPointer<ByteVar>(), x, y)

public actual fun TransformPattern_Resize(hobj: HUIAPATTERNOBJECT, width: Double, height: Double): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TransformPattern_Resize(hobj.toCPointer<ByteVar>(), width, height)

public actual fun TransformPattern_Rotate(hobj: HUIAPATTERNOBJECT, degrees: Double): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate(hobj.toCPointer<ByteVar>(), degrees)

public actual fun UiaAddEvent(hnode: HUIANODE, eventid: Int, pcallback: Long, scope: TreeScope, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaAddEvent(hnode.toCPointer<ByteVar>(), eventid, pcallback.toCPointer<ByteVar>(), scope, pproperties.toCPointer<ByteVar>(), cproperties, prequest.toCPointer<ByteVar>(), phevent.toCPointer<ByteVar>())

public actual fun UiaClientsAreListening(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaClientsAreListening()

public actual fun UiaDisconnectAllProviders(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders()

public actual fun UiaDisconnectProvider(pprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider(pprovider.toCPointer<ByteVar>())

public actual fun UiaEventAddWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaEventAddWindow(hevent.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>())

public actual fun UiaEventRemoveWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow(hevent.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>())

public actual fun UiaFind(hnode: HUIANODE, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaFind(hnode.toCPointer<ByteVar>(), pparams.toCPointer<ByteVar>(), prequest.toCPointer<ByteVar>(), pprequesteddata.toCPointer<ByteVar>(), ppoffsets.toCPointer<ByteVar>(), pptreestructures.toCPointer<ByteVar>())

public actual fun UiaGetErrorDescription(pdescription: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription(pdescription.toCPointer<ByteVar>())

public actual fun UiaGetPatternProvider(hnode: HUIANODE, patternid: Int, phobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider(hnode.toCPointer<ByteVar>(), patternid, phobj.toCPointer<ByteVar>())

public actual fun UiaGetPropertyValue(hnode: HUIANODE, propertyid: Int, pvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue(hnode.toCPointer<ByteVar>(), propertyid, pvalue.toCPointer<ByteVar>())

public actual fun UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue(punkmixedattributevalue.toCPointer<ByteVar>())

public actual fun UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue(punknotsupportedvalue.toCPointer<ByteVar>())

public actual fun UiaGetRootNode(phnode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetRootNode(phnode.toCPointer<ByteVar>())

public actual fun UiaGetRuntimeId(hnode: HUIANODE, pruntimeid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId(hnode.toCPointer<ByteVar>(), pruntimeid.toCPointer<ByteVar>())

public actual fun UiaGetUpdatedCache(hnode: HUIANODE, prequest: Long, normalizestate: NormalizeState, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache(hnode.toCPointer<ByteVar>(), prequest.toCPointer<ByteVar>(), normalizestate, pnormalizecondition.toCPointer<ByteVar>(), pprequesteddata.toCPointer<ByteVar>(), pptreestructure.toCPointer<ByteVar>())

public actual fun UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant(pvar.toCPointer<ByteVar>(), phobj.toCPointer<ByteVar>())

public actual fun UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant(pvar.toCPointer<ByteVar>(), phtextrange.toCPointer<ByteVar>())

public actual fun UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant(pvar.toCPointer<ByteVar>(), phnode.toCPointer<ByteVar>())

public actual fun UiaHasServerSideProvider(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider(hwnd.toCPointer<ByteVar>())

public actual fun UiaHostProviderFromHwnd(hwnd: HWND, ppprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd(hwnd.toCPointer<ByteVar>(), ppprovider.toCPointer<ByteVar>())

public actual fun UiaIAccessibleFromProvider(pprovider: Long, dwflags: UInt, ppaccessible: Long, pvarchild: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider(pprovider.toCPointer<ByteVar>(), dwflags, ppaccessible.toCPointer<ByteVar>(), pvarchild.toCPointer<ByteVar>())

public actual fun UiaLookupId(type: AutomationIdentifierType, pguid: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaLookupId(type, pguid.toCPointer<ByteVar>())

public actual fun UiaNavigate(hnode: HUIANODE, direction: NavigateDirection, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaNavigate(hnode.toCPointer<ByteVar>(), direction, pcondition.toCPointer<ByteVar>(), prequest.toCPointer<ByteVar>(), pprequesteddata.toCPointer<ByteVar>(), pptreestructure.toCPointer<ByteVar>())

public actual fun UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus(prequest.toCPointer<ByteVar>(), pprequesteddata.toCPointer<ByteVar>(), pptreestructure.toCPointer<ByteVar>())

public actual fun UiaNodeFromHandle(hwnd: HWND, phnode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle(hwnd.toCPointer<ByteVar>(), phnode.toCPointer<ByteVar>())

public actual fun UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint(x, y, prequest.toCPointer<ByteVar>(), pprequesteddata.toCPointer<ByteVar>(), pptreestructure.toCPointer<ByteVar>())

public actual fun UiaNodeFromProvider(pprovider: Long, phnode: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider(pprovider.toCPointer<ByteVar>(), phnode.toCPointer<ByteVar>())

public actual fun UiaNodeRelease(hnode: HUIANODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaNodeRelease(hnode.toCPointer<ByteVar>())

public actual fun UiaPatternRelease(hobj: HUIAPATTERNOBJECT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaPatternRelease(hobj.toCPointer<ByteVar>())

public actual fun UiaProviderForNonClient(hwnd: HWND, idobject: Int, idchild: Int, ppprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient(hwnd.toCPointer<ByteVar>(), idobject, idchild, ppprovider.toCPointer<ByteVar>())

public actual fun UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: UInt, ppprovider: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible(paccessible.toCPointer<ByteVar>(), idchild, dwflags, ppprovider.toCPointer<ByteVar>())

public actual fun UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent(provider.toCPointer<ByteVar>(), textrange.toCPointer<ByteVar>())

public actual fun UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent(pprovider.toCPointer<ByteVar>(), asynccontentloadedstate, percentcomplete)

public actual fun UiaRaiseAutomationEvent(pprovider: Long, id: UIA_EVENT_ID): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent(pprovider.toCPointer<ByteVar>(), id)

public actual fun UiaRaiseAutomationPropertyChangedEvent(pprovider: Long, id: UIA_PROPERTY_ID, oldvalue: VARIANT, newvalue: VARIANT): HRESULT =
    0

public actual fun UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent(pprovider.toCPointer<ByteVar>(), eventidcount, puiachanges.toCPointer<ByteVar>())

public actual fun UiaRaiseNotificationEvent(provider: Long, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: BSTR, activityid: BSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent(provider.toCPointer<ByteVar>(), notificationkind, notificationprocessing, displaystring.toCPointer<ByteVar>(), activityid.toCPointer<ByteVar>())

public actual fun UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: StructureChangeType, pruntimeid: Long, cruntimeidlen: Int): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent(pprovider.toCPointer<ByteVar>(), structurechangetype, pruntimeid.toCPointer<ByteVar>(), cruntimeidlen)

public actual fun UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: TextEditChangeType, pchangeddata: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent(pprovider.toCPointer<ByteVar>(), texteditchangetype, pchangeddata.toCPointer<ByteVar>())

public actual fun UiaRegisterProviderCallback(pcallback: Long) {
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback(pcallback.toCPointer<ByteVar>())
}

public actual fun UiaRemoveEvent(hevent: HUIAEVENT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaRemoveEvent(hevent.toCPointer<ByteVar>())

public actual fun UiaReturnRawElementProvider(hwnd: HWND, wparam: WPARAM, lparam: LPARAM, el: Long): LRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider(hwnd.toCPointer<ByteVar>(), wparam, lparam, el.toCPointer<ByteVar>())

public actual fun UiaSetFocus(hnode: HUIANODE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaSetFocus(hnode.toCPointer<ByteVar>())

public actual fun UiaTextRangeRelease(hobj: HUIATEXTRANGE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease(hobj.toCPointer<ByteVar>())

public actual fun UnhookWinEvent(hwineventhook: HWINEVENTHOOK): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UnhookWinEvent(hwineventhook.toCPointer<ByteVar>())

public actual fun UnregisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget(hwnd.toCPointer<ByteVar>(), pointertype)

public actual fun UnregisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx(hwnd.toCPointer<ByteVar>(), pointertype)

public actual fun ValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, pval: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue(hobj.toCPointer<ByteVar>(), pval.toCPointer<ByteVar>())

public actual fun VirtualizedItemPattern_Realize(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize(hobj.toCPointer<ByteVar>())

public actual fun WindowFromAccessibleObject(param0: Long, phwnd: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject(param0.toCPointer<ByteVar>(), phwnd.toCPointer<ByteVar>())

public actual fun WindowPattern_Close(hobj: HUIAPATTERNOBJECT): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_WindowPattern_Close(hobj.toCPointer<ByteVar>())

public actual fun WindowPattern_SetWindowVisualState(hobj: HUIAPATTERNOBJECT, state: WindowVisualState): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState(hobj.toCPointer<ByteVar>(), state)

public actual fun WindowPattern_WaitForInputIdle(hobj: HUIAPATTERNOBJECT, milliseconds: Int, presult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle(hobj.toCPointer<ByteVar>(), milliseconds, presult.toCPointer<ByteVar>())
