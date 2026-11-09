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

private object WindowsWin32UiAccessibilityJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState(hwndapp: Long, dwutilitystatemask: Int, dwutilitystate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent(hwnd: Long, dwid: Int, dwchildid: Int, ppacc: Long, pvarchild: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow(hwnd: Long, dwid: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject(hwnd: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA(hwnd: Long, pclassname: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW(hwnd: Long, pclassname: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition(hobj: Long, dockposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo(pver: Long, pbuild: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_GetRoleTextA(lrole: Int, lpszrole: Long, cchrolemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_GetRoleTextW(lrole: Int, lpszrole: Long, cchrolemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_GetStateTextA(lstatebit: Int, lpszstate: Long, cchstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_GetStateTextW(lstatebit: Int, lpszstate: Long, cchstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_GridPattern_GetItem(hobj: Long, row: Int, column: Int, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled(event: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible(hobj: Long, paccessible: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select(hobj: Long, flagsselect: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue(hobj: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_LresultFromObject(riid: Long, wparam: Long, punk: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName(hobj: Long, viewid: Int, ppstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView(hobj: Long, viewid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_NotifyWinEvent(event: Int, hwnd: Long, idobject: Int, idchild: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ObjectFromLresult(lresult: Long, riid: Long, wparam: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue(hobj: Long, value: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx(hwnd: Long, pointertype: Int, fobserve: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll(hobj: Long, horizontalamount: Int, verticalamount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent(hobj: Long, horizontalpercent: Double, verticalpercent: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_SetWinEventHook(eventmin: Int, eventmax: Int, hmodwineventproc: Long, pfnwineventproc: Long, idprocess: Int, idthread: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening(hobj: Long, inputtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild(hobj: Long, hnodechild: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_Clone(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_Compare(hobj: Long, range: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints(hobj: Long, endpoint: Int, targetrange: Long, targetendpoint: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit(hobj: Long, unit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_FindText(hobj: Long, text: Long, backward: Int, ignorecase: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue(hobj: Long, attributeid: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_GetChildren(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_GetText(hobj: Long, maxlength: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_Move(hobj: Long, unit: Int, count: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange(hobj: Long, endpoint: Int, targetrange: Long, targetendpoint: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit(hobj: Long, endpoint: Int, unit: Int, count: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView(hobj: Long, aligntotop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TextRange_Select(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TransformPattern_Move(hobj: Long, x: Double, y: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TransformPattern_Resize(hobj: Long, width: Double, height: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate(hobj: Long, degrees: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaAddEvent(hnode: Long, eventid: Int, pcallback: Long, scope: Int, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaClientsAreListening(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider(pprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaEventAddWindow(hevent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow(hevent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaFind(hnode: Long, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription(pdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider(hnode: Long, patternid: Int, phobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue(hnode: Long, propertyid: Int, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetRootNode(phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId(hnode: Long, pruntimeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache(hnode: Long, prequest: Long, normalizestate: Int, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd(hwnd: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider(pprovider: Long, dwflags: Int, ppaccessible: Long, pvarchild: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaLookupId(type: Int, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaNavigate(hnode: Long, direction: Int, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle(hwnd: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider(pprovider: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaNodeRelease(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaPatternRelease(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient(hwnd: Long, idobject: Int, idchild: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: Int, percentcomplete: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent(pprovider: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent(provider: Long, notificationkind: Int, notificationprocessing: Int, displaystring: Long, activityid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: Int, pruntimeid: Long, cruntimeidlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: Int, pchangeddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback(pcallback: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaRemoveEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider(hwnd: Long, wparam: Long, lparam: Long, el: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaSetFocus(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UnhookWinEvent(hwineventhook: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue(hobj: Long, pval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject(param0: Long, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_WindowPattern_Close(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState(hobj: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle(hobj: Long, milliseconds: Int, presult: Long): Int
}

public actual fun AccNotifyTouchInteraction(hwndapp: HWND, hwndtarget: HWND, pttarget: POINT): HRESULT =
    0

public actual fun AccSetRunningUtilityState(hwndapp: HWND, dwutilitystatemask: UInt, dwutilitystate: ACC_UTILITY_STATE_FLAGS): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_AccSetRunningUtilityState(hwndapp, dwutilitystatemask.toInt(), dwutilitystate.toInt())

public actual fun AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_AccessibleChildren(pacccontainer, ichildstart, cchildren, rgvarchildren, pcobtained)

public actual fun AccessibleObjectFromEvent(hwnd: HWND, dwid: UInt, dwchildid: UInt, ppacc: Long, pvarchild: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_AccessibleObjectFromEvent(hwnd, dwid.toInt(), dwchildid.toInt(), ppacc, pvarchild)

public actual fun AccessibleObjectFromPoint(ptscreen: POINT, ppacc: Long, pvarchild: Long): HRESULT =
    0

public actual fun AccessibleObjectFromWindow(hwnd: HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_AccessibleObjectFromWindow(hwnd, dwid.toInt(), riid, ppvobject)

public actual fun CreateStdAccessibleObject(hwnd: HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleObject(hwnd, idobject, riid, ppvobject)

public actual fun CreateStdAccessibleProxyA(hwnd: HWND, pclassname: PCSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyA(hwnd, pclassname, idobject, riid, ppvobject)

public actual fun CreateStdAccessibleProxyW(hwnd: HWND, pclassname: PCWSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_CreateStdAccessibleProxyW(hwnd, pclassname, idobject, riid, ppvobject)

public actual fun DockPattern_SetDockPosition(hobj: HUIAPATTERNOBJECT, dockposition: DockPosition): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_DockPattern_SetDockPosition(hobj, dockposition)

public actual fun ExpandCollapsePattern_Collapse(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Collapse(hobj)

public actual fun ExpandCollapsePattern_Expand(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ExpandCollapsePattern_Expand(hobj)

public actual fun GetOleaccVersionInfo(pver: Long, pbuild: Long) {
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_GetOleaccVersionInfo(pver, pbuild)
}

public actual fun GetRoleTextA(lrole: UInt, lpszrole: PSTR, cchrolemax: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_GetRoleTextA(lrole.toInt(), lpszrole, cchrolemax.toInt()).toUInt()

public actual fun GetRoleTextW(lrole: UInt, lpszrole: PWSTR, cchrolemax: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_GetRoleTextW(lrole.toInt(), lpszrole, cchrolemax.toInt()).toUInt()

public actual fun GetStateTextA(lstatebit: UInt, lpszstate: PSTR, cchstate: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_GetStateTextA(lstatebit.toInt(), lpszstate, cchstate.toInt()).toUInt()

public actual fun GetStateTextW(lstatebit: UInt, lpszstate: PWSTR, cchstate: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_GetStateTextW(lstatebit.toInt(), lpszstate, cchstate.toInt()).toUInt()

public actual fun GridPattern_GetItem(hobj: HUIAPATTERNOBJECT, row: Int, column: Int, presult: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_GridPattern_GetItem(hobj, row, column, presult)

public actual fun InvokePattern_Invoke(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_InvokePattern_Invoke(hobj)

public actual fun IsWinEventHookInstalled(event: UInt): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_IsWinEventHookInstalled(event.toInt())

public actual fun ItemContainerPattern_FindItemByProperty(hobj: HUIAPATTERNOBJECT, hnodestartafter: HUIANODE, propertyid: Int, value: VARIANT, pfound: Long): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_DoDefaultAction(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_DoDefaultAction(hobj)

public actual fun LegacyIAccessiblePattern_GetIAccessible(hobj: HUIAPATTERNOBJECT, paccessible: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_GetIAccessible(hobj, paccessible)

public actual fun LegacyIAccessiblePattern_Select(hobj: HUIAPATTERNOBJECT, flagsselect: Int): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_Select(hobj, flagsselect)

public actual fun LegacyIAccessiblePattern_SetValue(hobj: HUIAPATTERNOBJECT, szvalue: PCWSTR): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_LegacyIAccessiblePattern_SetValue(hobj, szvalue)

public actual fun LresultFromObject(riid: Long, wparam: WPARAM, punk: Long): LRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_LresultFromObject(riid, wparam.toLong(), punk)

public actual fun MultipleViewPattern_GetViewName(hobj: HUIAPATTERNOBJECT, viewid: Int, ppstr: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_MultipleViewPattern_GetViewName(hobj, viewid, ppstr)

public actual fun MultipleViewPattern_SetCurrentView(hobj: HUIAPATTERNOBJECT, viewid: Int): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_MultipleViewPattern_SetCurrentView(hobj, viewid)

public actual fun NotifyWinEvent(event: UInt, hwnd: HWND, idobject: Int, idchild: Int) {
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_NotifyWinEvent(event.toInt(), hwnd, idobject, idchild)
}

public actual fun ObjectFromLresult(lresult: LRESULT, riid: Long, wparam: WPARAM, ppvobject: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ObjectFromLresult(lresult, riid, wparam.toLong(), ppvobject)

public actual fun RangeValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, value: Double): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_RangeValuePattern_SetValue(hobj, value)

public actual fun RegisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_RegisterPointerInputTarget(hwnd, pointertype)

public actual fun RegisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE, fobserve: BOOL): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_RegisterPointerInputTargetEx(hwnd, pointertype, fobserve)

public actual fun ScrollItemPattern_ScrollIntoView(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ScrollItemPattern_ScrollIntoView(hobj)

public actual fun ScrollPattern_Scroll(hobj: HUIAPATTERNOBJECT, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ScrollPattern_Scroll(hobj, horizontalamount, verticalamount)

public actual fun ScrollPattern_SetScrollPercent(hobj: HUIAPATTERNOBJECT, horizontalpercent: Double, verticalpercent: Double): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ScrollPattern_SetScrollPercent(hobj, horizontalpercent, verticalpercent)

public actual fun SelectionItemPattern_AddToSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_AddToSelection(hobj)

public actual fun SelectionItemPattern_RemoveFromSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_RemoveFromSelection(hobj)

public actual fun SelectionItemPattern_Select(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_SelectionItemPattern_Select(hobj)

public actual fun SetWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: HMODULE, pfnwineventproc: WINEVENTPROC, idprocess: UInt, idthread: UInt, dwflags: UInt): HWINEVENTHOOK =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_SetWinEventHook(eventmin.toInt(), eventmax.toInt(), hmodwineventproc, pfnwineventproc.toLong(), idprocess.toInt(), idthread.toInt(), dwflags.toInt())

public actual fun SynchronizedInputPattern_Cancel(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_Cancel(hobj)

public actual fun SynchronizedInputPattern_StartListening(hobj: HUIAPATTERNOBJECT, inputtype: SynchronizedInputType): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_SynchronizedInputPattern_StartListening(hobj, inputtype)

public actual fun TextPattern_GetSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextPattern_GetSelection(hobj, pretval)

public actual fun TextPattern_GetVisibleRanges(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextPattern_GetVisibleRanges(hobj, pretval)

public actual fun TextPattern_RangeFromChild(hobj: HUIAPATTERNOBJECT, hnodechild: HUIANODE, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextPattern_RangeFromChild(hobj, hnodechild, pretval)

public actual fun TextPattern_RangeFromPoint(hobj: HUIAPATTERNOBJECT, point: UiaPoint, pretval: Long): HRESULT =
    0

public actual fun TextPattern_get_DocumentRange(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextPattern_get_DocumentRange(hobj, pretval)

public actual fun TextPattern_get_SupportedTextSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextPattern_get_SupportedTextSelection(hobj, pretval)

public actual fun TextRange_AddToSelection(hobj: HUIATEXTRANGE): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_AddToSelection(hobj)

public actual fun TextRange_Clone(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_Clone(hobj, pretval)

public actual fun TextRange_Compare(hobj: HUIATEXTRANGE, range: HUIATEXTRANGE, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_Compare(hobj, range, pretval)

public actual fun TextRange_CompareEndpoints(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_CompareEndpoints(hobj, endpoint, targetrange, targetendpoint, pretval)

public actual fun TextRange_ExpandToEnclosingUnit(hobj: HUIATEXTRANGE, unit: TextUnit): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_ExpandToEnclosingUnit(hobj, unit)

public actual fun TextRange_FindAttribute(hobj: HUIATEXTRANGE, attributeid: Int, value: VARIANT, backward: BOOL, pretval: Long): HRESULT =
    0

public actual fun TextRange_FindText(hobj: HUIATEXTRANGE, text: BSTR, backward: BOOL, ignorecase: BOOL, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_FindText(hobj, text, backward, ignorecase, pretval)

public actual fun TextRange_GetAttributeValue(hobj: HUIATEXTRANGE, attributeid: Int, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_GetAttributeValue(hobj, attributeid, pretval)

public actual fun TextRange_GetBoundingRectangles(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_GetBoundingRectangles(hobj, pretval)

public actual fun TextRange_GetChildren(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_GetChildren(hobj, pretval)

public actual fun TextRange_GetEnclosingElement(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_GetEnclosingElement(hobj, pretval)

public actual fun TextRange_GetText(hobj: HUIATEXTRANGE, maxlength: Int, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_GetText(hobj, maxlength, pretval)

public actual fun TextRange_Move(hobj: HUIATEXTRANGE, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_Move(hobj, unit, count, pretval)

public actual fun TextRange_MoveEndpointByRange(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByRange(hobj, endpoint, targetrange, targetendpoint)

public actual fun TextRange_MoveEndpointByUnit(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_MoveEndpointByUnit(hobj, endpoint, unit, count, pretval)

public actual fun TextRange_RemoveFromSelection(hobj: HUIATEXTRANGE): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_RemoveFromSelection(hobj)

public actual fun TextRange_ScrollIntoView(hobj: HUIATEXTRANGE, aligntotop: BOOL): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_ScrollIntoView(hobj, aligntotop)

public actual fun TextRange_Select(hobj: HUIATEXTRANGE): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TextRange_Select(hobj)

public actual fun TogglePattern_Toggle(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TogglePattern_Toggle(hobj)

public actual fun TransformPattern_Move(hobj: HUIAPATTERNOBJECT, x: Double, y: Double): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TransformPattern_Move(hobj, x, y)

public actual fun TransformPattern_Resize(hobj: HUIAPATTERNOBJECT, width: Double, height: Double): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TransformPattern_Resize(hobj, width, height)

public actual fun TransformPattern_Rotate(hobj: HUIAPATTERNOBJECT, degrees: Double): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_TransformPattern_Rotate(hobj, degrees)

public actual fun UiaAddEvent(hnode: HUIANODE, eventid: Int, pcallback: Long, scope: TreeScope, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaAddEvent(hnode, eventid, pcallback, scope, pproperties, cproperties, prequest, phevent)

public actual fun UiaClientsAreListening(): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaClientsAreListening()

public actual fun UiaDisconnectAllProviders(): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaDisconnectAllProviders()

public actual fun UiaDisconnectProvider(pprovider: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaDisconnectProvider(pprovider)

public actual fun UiaEventAddWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaEventAddWindow(hevent, hwnd)

public actual fun UiaEventRemoveWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaEventRemoveWindow(hevent, hwnd)

public actual fun UiaFind(hnode: HUIANODE, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaFind(hnode, pparams, prequest, pprequesteddata, ppoffsets, pptreestructures)

public actual fun UiaGetErrorDescription(pdescription: Long): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetErrorDescription(pdescription)

public actual fun UiaGetPatternProvider(hnode: HUIANODE, patternid: Int, phobj: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetPatternProvider(hnode, patternid, phobj)

public actual fun UiaGetPropertyValue(hnode: HUIANODE, propertyid: Int, pvalue: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetPropertyValue(hnode, propertyid, pvalue)

public actual fun UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetReservedMixedAttributeValue(punkmixedattributevalue)

public actual fun UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetReservedNotSupportedValue(punknotsupportedvalue)

public actual fun UiaGetRootNode(phnode: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetRootNode(phnode)

public actual fun UiaGetRuntimeId(hnode: HUIANODE, pruntimeid: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetRuntimeId(hnode, pruntimeid)

public actual fun UiaGetUpdatedCache(hnode: HUIANODE, prequest: Long, normalizestate: NormalizeState, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaGetUpdatedCache(hnode, prequest, normalizestate, pnormalizecondition, pprequesteddata, pptreestructure)

public actual fun UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaHPatternObjectFromVariant(pvar, phobj)

public actual fun UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaHTextRangeFromVariant(pvar, phtextrange)

public actual fun UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaHUiaNodeFromVariant(pvar, phnode)

public actual fun UiaHasServerSideProvider(hwnd: HWND): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaHasServerSideProvider(hwnd)

public actual fun UiaHostProviderFromHwnd(hwnd: HWND, ppprovider: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaHostProviderFromHwnd(hwnd, ppprovider)

public actual fun UiaIAccessibleFromProvider(pprovider: Long, dwflags: UInt, ppaccessible: Long, pvarchild: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaIAccessibleFromProvider(pprovider, dwflags.toInt(), ppaccessible, pvarchild)

public actual fun UiaLookupId(type: AutomationIdentifierType, pguid: Long): Int =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaLookupId(type, pguid)

public actual fun UiaNavigate(hnode: HUIANODE, direction: NavigateDirection, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaNavigate(hnode, direction, pcondition, prequest, pprequesteddata, pptreestructure)

public actual fun UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaNodeFromFocus(prequest, pprequesteddata, pptreestructure)

public actual fun UiaNodeFromHandle(hwnd: HWND, phnode: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaNodeFromHandle(hwnd, phnode)

public actual fun UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaNodeFromPoint(x, y, prequest, pprequesteddata, pptreestructure)

public actual fun UiaNodeFromProvider(pprovider: Long, phnode: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaNodeFromProvider(pprovider, phnode)

public actual fun UiaNodeRelease(hnode: HUIANODE): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaNodeRelease(hnode)

public actual fun UiaPatternRelease(hobj: HUIAPATTERNOBJECT): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaPatternRelease(hobj)

public actual fun UiaProviderForNonClient(hwnd: HWND, idobject: Int, idchild: Int, ppprovider: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaProviderForNonClient(hwnd, idobject, idchild, ppprovider)

public actual fun UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: UInt, ppprovider: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaProviderFromIAccessible(paccessible, idchild, dwflags.toInt(), ppprovider)

public actual fun UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseActiveTextPositionChangedEvent(provider, textrange)

public actual fun UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseAsyncContentLoadedEvent(pprovider, asynccontentloadedstate, percentcomplete)

public actual fun UiaRaiseAutomationEvent(pprovider: Long, id: UIA_EVENT_ID): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseAutomationEvent(pprovider, id)

public actual fun UiaRaiseAutomationPropertyChangedEvent(pprovider: Long, id: UIA_PROPERTY_ID, oldvalue: VARIANT, newvalue: VARIANT): HRESULT =
    0

public actual fun UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseChangesEvent(pprovider, eventidcount, puiachanges)

public actual fun UiaRaiseNotificationEvent(provider: Long, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: BSTR, activityid: BSTR): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseNotificationEvent(provider, notificationkind, notificationprocessing, displaystring, activityid)

public actual fun UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: StructureChangeType, pruntimeid: Long, cruntimeidlen: Int): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseStructureChangedEvent(pprovider, structurechangetype, pruntimeid, cruntimeidlen)

public actual fun UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: TextEditChangeType, pchangeddata: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRaiseTextEditTextChangedEvent(pprovider, texteditchangetype, pchangeddata)

public actual fun UiaRegisterProviderCallback(pcallback: Long) {
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRegisterProviderCallback(pcallback)
}

public actual fun UiaRemoveEvent(hevent: HUIAEVENT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaRemoveEvent(hevent)

public actual fun UiaReturnRawElementProvider(hwnd: HWND, wparam: WPARAM, lparam: LPARAM, el: Long): LRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaReturnRawElementProvider(hwnd, wparam.toLong(), lparam, el)

public actual fun UiaSetFocus(hnode: HUIANODE): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaSetFocus(hnode)

public actual fun UiaTextRangeRelease(hobj: HUIATEXTRANGE): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UiaTextRangeRelease(hobj)

public actual fun UnhookWinEvent(hwineventhook: HWINEVENTHOOK): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UnhookWinEvent(hwineventhook)

public actual fun UnregisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTarget(hwnd, pointertype)

public actual fun UnregisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_UnregisterPointerInputTargetEx(hwnd, pointertype)

public actual fun ValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, pval: PCWSTR): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_ValuePattern_SetValue(hobj, pval)

public actual fun VirtualizedItemPattern_Realize(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_VirtualizedItemPattern_Realize(hobj)

public actual fun WindowFromAccessibleObject(param0: Long, phwnd: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_WindowFromAccessibleObject(param0, phwnd)

public actual fun WindowPattern_Close(hobj: HUIAPATTERNOBJECT): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_WindowPattern_Close(hobj)

public actual fun WindowPattern_SetWindowVisualState(hobj: HUIAPATTERNOBJECT, state: WindowVisualState): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_WindowPattern_SetWindowVisualState(hobj, state)

public actual fun WindowPattern_WaitForInputIdle(hobj: HUIAPATTERNOBJECT, milliseconds: Int, presult: Long): HRESULT =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_WindowPattern_WaitForInputIdle(hobj, milliseconds, presult)
