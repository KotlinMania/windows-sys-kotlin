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

public actual fun AccNotifyTouchInteraction(hwndapp: HWND, hwndtarget: HWND, pttarget: POINT): HRESULT =
    0

public actual fun AccSetRunningUtilityState(hwndapp: HWND, dwutilitystatemask: UInt, dwutilitystate: ACC_UTILITY_STATE_FLAGS): HRESULT =
    0

public actual fun AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT =
    0

public actual fun AccessibleObjectFromEvent(hwnd: HWND, dwid: UInt, dwchildid: UInt, ppacc: Long, pvarchild: Long): HRESULT =
    0

public actual fun AccessibleObjectFromPoint(ptscreen: POINT, ppacc: Long, pvarchild: Long): HRESULT =
    0

public actual fun AccessibleObjectFromWindow(hwnd: HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT =
    0

public actual fun CreateStdAccessibleObject(hwnd: HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    0

public actual fun CreateStdAccessibleProxyA(hwnd: HWND, pclassname: PCSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    0

public actual fun CreateStdAccessibleProxyW(hwnd: HWND, pclassname: PCWSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT =
    0

public actual fun DockPattern_SetDockPosition(hobj: HUIAPATTERNOBJECT, dockposition: DockPosition): HRESULT =
    0

public actual fun ExpandCollapsePattern_Collapse(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun ExpandCollapsePattern_Expand(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun GetOleaccVersionInfo(pver: Long, pbuild: Long) {
}

public actual fun GetRoleTextA(lrole: UInt, lpszrole: PSTR, cchrolemax: UInt): UInt =
    0u

public actual fun GetRoleTextW(lrole: UInt, lpszrole: PWSTR, cchrolemax: UInt): UInt =
    0u

public actual fun GetStateTextA(lstatebit: UInt, lpszstate: PSTR, cchstate: UInt): UInt =
    0u

public actual fun GetStateTextW(lstatebit: UInt, lpszstate: PWSTR, cchstate: UInt): UInt =
    0u

public actual fun GridPattern_GetItem(hobj: HUIAPATTERNOBJECT, row: Int, column: Int, presult: Long): HRESULT =
    0

public actual fun InvokePattern_Invoke(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun IsWinEventHookInstalled(event: UInt): BOOL =
    0

public actual fun ItemContainerPattern_FindItemByProperty(hobj: HUIAPATTERNOBJECT, hnodestartafter: HUIANODE, propertyid: Int, value: VARIANT, pfound: Long): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_DoDefaultAction(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_GetIAccessible(hobj: HUIAPATTERNOBJECT, paccessible: Long): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_Select(hobj: HUIAPATTERNOBJECT, flagsselect: Int): HRESULT =
    0

public actual fun LegacyIAccessiblePattern_SetValue(hobj: HUIAPATTERNOBJECT, szvalue: PCWSTR): HRESULT =
    0

public actual fun LresultFromObject(riid: Long, wparam: WPARAM, punk: Long): LRESULT =
    0L

public actual fun MultipleViewPattern_GetViewName(hobj: HUIAPATTERNOBJECT, viewid: Int, ppstr: Long): HRESULT =
    0

public actual fun MultipleViewPattern_SetCurrentView(hobj: HUIAPATTERNOBJECT, viewid: Int): HRESULT =
    0

public actual fun NotifyWinEvent(event: UInt, hwnd: HWND, idobject: Int, idchild: Int) {
}

public actual fun ObjectFromLresult(lresult: LRESULT, riid: Long, wparam: WPARAM, ppvobject: Long): HRESULT =
    0

public actual fun RangeValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, value: Double): HRESULT =
    0

public actual fun RegisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    0

public actual fun RegisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE, fobserve: BOOL): BOOL =
    0

public actual fun ScrollItemPattern_ScrollIntoView(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun ScrollPattern_Scroll(hobj: HUIAPATTERNOBJECT, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): HRESULT =
    0

public actual fun ScrollPattern_SetScrollPercent(hobj: HUIAPATTERNOBJECT, horizontalpercent: Double, verticalpercent: Double): HRESULT =
    0

public actual fun SelectionItemPattern_AddToSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun SelectionItemPattern_RemoveFromSelection(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun SelectionItemPattern_Select(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun SetWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: HMODULE, pfnwineventproc: WINEVENTPROC, idprocess: UInt, idthread: UInt, dwflags: UInt): HWINEVENTHOOK =
    0L

public actual fun SynchronizedInputPattern_Cancel(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun SynchronizedInputPattern_StartListening(hobj: HUIAPATTERNOBJECT, inputtype: SynchronizedInputType): HRESULT =
    0

public actual fun TextPattern_GetSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    0

public actual fun TextPattern_GetVisibleRanges(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    0

public actual fun TextPattern_RangeFromChild(hobj: HUIAPATTERNOBJECT, hnodechild: HUIANODE, pretval: Long): HRESULT =
    0

public actual fun TextPattern_RangeFromPoint(hobj: HUIAPATTERNOBJECT, point: UiaPoint, pretval: Long): HRESULT =
    0

public actual fun TextPattern_get_DocumentRange(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    0

public actual fun TextPattern_get_SupportedTextSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT =
    0

public actual fun TextRange_AddToSelection(hobj: HUIATEXTRANGE): HRESULT =
    0

public actual fun TextRange_Clone(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    0

public actual fun TextRange_Compare(hobj: HUIATEXTRANGE, range: HUIATEXTRANGE, pretval: Long): HRESULT =
    0

public actual fun TextRange_CompareEndpoints(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint, pretval: Long): HRESULT =
    0

public actual fun TextRange_ExpandToEnclosingUnit(hobj: HUIATEXTRANGE, unit: TextUnit): HRESULT =
    0

public actual fun TextRange_FindAttribute(hobj: HUIATEXTRANGE, attributeid: Int, value: VARIANT, backward: BOOL, pretval: Long): HRESULT =
    0

public actual fun TextRange_FindText(hobj: HUIATEXTRANGE, text: BSTR, backward: BOOL, ignorecase: BOOL, pretval: Long): HRESULT =
    0

public actual fun TextRange_GetAttributeValue(hobj: HUIATEXTRANGE, attributeid: Int, pretval: Long): HRESULT =
    0

public actual fun TextRange_GetBoundingRectangles(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    0

public actual fun TextRange_GetChildren(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    0

public actual fun TextRange_GetEnclosingElement(hobj: HUIATEXTRANGE, pretval: Long): HRESULT =
    0

public actual fun TextRange_GetText(hobj: HUIATEXTRANGE, maxlength: Int, pretval: Long): HRESULT =
    0

public actual fun TextRange_Move(hobj: HUIATEXTRANGE, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    0

public actual fun TextRange_MoveEndpointByRange(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint): HRESULT =
    0

public actual fun TextRange_MoveEndpointByUnit(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: Long): HRESULT =
    0

public actual fun TextRange_RemoveFromSelection(hobj: HUIATEXTRANGE): HRESULT =
    0

public actual fun TextRange_ScrollIntoView(hobj: HUIATEXTRANGE, aligntotop: BOOL): HRESULT =
    0

public actual fun TextRange_Select(hobj: HUIATEXTRANGE): HRESULT =
    0

public actual fun TogglePattern_Toggle(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun TransformPattern_Move(hobj: HUIAPATTERNOBJECT, x: Double, y: Double): HRESULT =
    0

public actual fun TransformPattern_Resize(hobj: HUIAPATTERNOBJECT, width: Double, height: Double): HRESULT =
    0

public actual fun TransformPattern_Rotate(hobj: HUIAPATTERNOBJECT, degrees: Double): HRESULT =
    0

public actual fun UiaAddEvent(hnode: HUIANODE, eventid: Int, pcallback: Long, scope: TreeScope, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): HRESULT =
    0

public actual fun UiaClientsAreListening(): BOOL =
    0

public actual fun UiaDisconnectAllProviders(): HRESULT =
    0

public actual fun UiaDisconnectProvider(pprovider: Long): HRESULT =
    0

public actual fun UiaEventAddWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    0

public actual fun UiaEventRemoveWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT =
    0

public actual fun UiaFind(hnode: HUIANODE, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): HRESULT =
    0

public actual fun UiaGetErrorDescription(pdescription: Long): BOOL =
    0

public actual fun UiaGetPatternProvider(hnode: HUIANODE, patternid: Int, phobj: Long): HRESULT =
    0

public actual fun UiaGetPropertyValue(hnode: HUIANODE, propertyid: Int, pvalue: Long): HRESULT =
    0

public actual fun UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): HRESULT =
    0

public actual fun UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): HRESULT =
    0

public actual fun UiaGetRootNode(phnode: Long): HRESULT =
    0

public actual fun UiaGetRuntimeId(hnode: HUIANODE, pruntimeid: Long): HRESULT =
    0

public actual fun UiaGetUpdatedCache(hnode: HUIANODE, prequest: Long, normalizestate: NormalizeState, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    0

public actual fun UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): HRESULT =
    0

public actual fun UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): HRESULT =
    0

public actual fun UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): HRESULT =
    0

public actual fun UiaHasServerSideProvider(hwnd: HWND): BOOL =
    0

public actual fun UiaHostProviderFromHwnd(hwnd: HWND, ppprovider: Long): HRESULT =
    0

public actual fun UiaIAccessibleFromProvider(pprovider: Long, dwflags: UInt, ppaccessible: Long, pvarchild: Long): HRESULT =
    0

public actual fun UiaLookupId(type: AutomationIdentifierType, pguid: Long): Int =
    0

public actual fun UiaNavigate(hnode: HUIANODE, direction: NavigateDirection, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    0

public actual fun UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    0

public actual fun UiaNodeFromHandle(hwnd: HWND, phnode: Long): HRESULT =
    0

public actual fun UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT =
    0

public actual fun UiaNodeFromProvider(pprovider: Long, phnode: Long): HRESULT =
    0

public actual fun UiaNodeRelease(hnode: HUIANODE): BOOL =
    0

public actual fun UiaPatternRelease(hobj: HUIAPATTERNOBJECT): BOOL =
    0

public actual fun UiaProviderForNonClient(hwnd: HWND, idobject: Int, idchild: Int, ppprovider: Long): HRESULT =
    0

public actual fun UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: UInt, ppprovider: Long): HRESULT =
    0

public actual fun UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): HRESULT =
    0

public actual fun UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): HRESULT =
    0

public actual fun UiaRaiseAutomationEvent(pprovider: Long, id: UIA_EVENT_ID): HRESULT =
    0

public actual fun UiaRaiseAutomationPropertyChangedEvent(pprovider: Long, id: UIA_PROPERTY_ID, oldvalue: VARIANT, newvalue: VARIANT): HRESULT =
    0

public actual fun UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): HRESULT =
    0

public actual fun UiaRaiseNotificationEvent(provider: Long, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: BSTR, activityid: BSTR): HRESULT =
    0

public actual fun UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: StructureChangeType, pruntimeid: Long, cruntimeidlen: Int): HRESULT =
    0

public actual fun UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: TextEditChangeType, pchangeddata: Long): HRESULT =
    0

public actual fun UiaRegisterProviderCallback(pcallback: Long) {
}

public actual fun UiaRemoveEvent(hevent: HUIAEVENT): HRESULT =
    0

public actual fun UiaReturnRawElementProvider(hwnd: HWND, wparam: WPARAM, lparam: LPARAM, el: Long): LRESULT =
    0L

public actual fun UiaSetFocus(hnode: HUIANODE): HRESULT =
    0

public actual fun UiaTextRangeRelease(hobj: HUIATEXTRANGE): BOOL =
    0

public actual fun UnhookWinEvent(hwineventhook: HWINEVENTHOOK): BOOL =
    0

public actual fun UnregisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    0

public actual fun UnregisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL =
    0

public actual fun ValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, pval: PCWSTR): HRESULT =
    0

public actual fun VirtualizedItemPattern_Realize(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun WindowFromAccessibleObject(param0: Long, phwnd: Long): HRESULT =
    0

public actual fun WindowPattern_Close(hobj: HUIAPATTERNOBJECT): HRESULT =
    0

public actual fun WindowPattern_SetWindowVisualState(hobj: HUIAPATTERNOBJECT, state: WindowVisualState): HRESULT =
    0

public actual fun WindowPattern_WaitForInputIdle(hobj: HUIAPATTERNOBJECT, milliseconds: Int, presult: Long): HRESULT =
    0
