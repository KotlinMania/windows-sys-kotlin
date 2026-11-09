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

public expect fun AccNotifyTouchInteraction(hwndapp: HWND, hwndtarget: HWND, pttarget: POINT): HRESULT

public expect fun AccSetRunningUtilityState(hwndapp: HWND, dwutilitystatemask: UInt, dwutilitystate: ACC_UTILITY_STATE_FLAGS): HRESULT

public expect fun AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT

public expect fun AccessibleObjectFromEvent(hwnd: HWND, dwid: UInt, dwchildid: UInt, ppacc: Long, pvarchild: Long): HRESULT

public expect fun AccessibleObjectFromPoint(ptscreen: POINT, ppacc: Long, pvarchild: Long): HRESULT

public expect fun AccessibleObjectFromWindow(hwnd: HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT

public expect fun CreateStdAccessibleObject(hwnd: HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT

public expect fun CreateStdAccessibleProxyA(hwnd: HWND, pclassname: PCSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT

public expect fun CreateStdAccessibleProxyW(hwnd: HWND, pclassname: PCWSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT

public expect fun DockPattern_SetDockPosition(hobj: HUIAPATTERNOBJECT, dockposition: DockPosition): HRESULT

public expect fun ExpandCollapsePattern_Collapse(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun ExpandCollapsePattern_Expand(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun GetOleaccVersionInfo(pver: Long, pbuild: Long)

public expect fun GetRoleTextA(lrole: UInt, lpszrole: PSTR, cchrolemax: UInt): UInt

public expect fun GetRoleTextW(lrole: UInt, lpszrole: PWSTR, cchrolemax: UInt): UInt

public expect fun GetStateTextA(lstatebit: UInt, lpszstate: PSTR, cchstate: UInt): UInt

public expect fun GetStateTextW(lstatebit: UInt, lpszstate: PWSTR, cchstate: UInt): UInt

public expect fun GridPattern_GetItem(hobj: HUIAPATTERNOBJECT, row: Int, column: Int, presult: Long): HRESULT

public expect fun InvokePattern_Invoke(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun IsWinEventHookInstalled(event: UInt): BOOL

public expect fun ItemContainerPattern_FindItemByProperty(hobj: HUIAPATTERNOBJECT, hnodestartafter: HUIANODE, propertyid: Int, value: VARIANT, pfound: Long): HRESULT

public expect fun LegacyIAccessiblePattern_DoDefaultAction(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun LegacyIAccessiblePattern_GetIAccessible(hobj: HUIAPATTERNOBJECT, paccessible: Long): HRESULT

public expect fun LegacyIAccessiblePattern_Select(hobj: HUIAPATTERNOBJECT, flagsselect: Int): HRESULT

public expect fun LegacyIAccessiblePattern_SetValue(hobj: HUIAPATTERNOBJECT, szvalue: PCWSTR): HRESULT

public expect fun LresultFromObject(riid: Long, wparam: WPARAM, punk: Long): LRESULT

public expect fun MultipleViewPattern_GetViewName(hobj: HUIAPATTERNOBJECT, viewid: Int, ppstr: Long): HRESULT

public expect fun MultipleViewPattern_SetCurrentView(hobj: HUIAPATTERNOBJECT, viewid: Int): HRESULT

public expect fun NotifyWinEvent(event: UInt, hwnd: HWND, idobject: Int, idchild: Int)

public expect fun ObjectFromLresult(lresult: LRESULT, riid: Long, wparam: WPARAM, ppvobject: Long): HRESULT

public expect fun RangeValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, value: Double): HRESULT

public expect fun RegisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL

public expect fun RegisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE, fobserve: BOOL): BOOL

public expect fun ScrollItemPattern_ScrollIntoView(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun ScrollPattern_Scroll(hobj: HUIAPATTERNOBJECT, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): HRESULT

public expect fun ScrollPattern_SetScrollPercent(hobj: HUIAPATTERNOBJECT, horizontalpercent: Double, verticalpercent: Double): HRESULT

public expect fun SelectionItemPattern_AddToSelection(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun SelectionItemPattern_RemoveFromSelection(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun SelectionItemPattern_Select(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun SetWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: HMODULE, pfnwineventproc: WINEVENTPROC, idprocess: UInt, idthread: UInt, dwflags: UInt): HWINEVENTHOOK

public expect fun SynchronizedInputPattern_Cancel(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun SynchronizedInputPattern_StartListening(hobj: HUIAPATTERNOBJECT, inputtype: SynchronizedInputType): HRESULT

public expect fun TextPattern_GetSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT

public expect fun TextPattern_GetVisibleRanges(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT

public expect fun TextPattern_RangeFromChild(hobj: HUIAPATTERNOBJECT, hnodechild: HUIANODE, pretval: Long): HRESULT

public expect fun TextPattern_RangeFromPoint(hobj: HUIAPATTERNOBJECT, point: UiaPoint, pretval: Long): HRESULT

public expect fun TextPattern_get_DocumentRange(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT

public expect fun TextPattern_get_SupportedTextSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT

public expect fun TextRange_AddToSelection(hobj: HUIATEXTRANGE): HRESULT

public expect fun TextRange_Clone(hobj: HUIATEXTRANGE, pretval: Long): HRESULT

public expect fun TextRange_Compare(hobj: HUIATEXTRANGE, range: HUIATEXTRANGE, pretval: Long): HRESULT

public expect fun TextRange_CompareEndpoints(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint, pretval: Long): HRESULT

public expect fun TextRange_ExpandToEnclosingUnit(hobj: HUIATEXTRANGE, unit: TextUnit): HRESULT

public expect fun TextRange_FindAttribute(hobj: HUIATEXTRANGE, attributeid: Int, value: VARIANT, backward: BOOL, pretval: Long): HRESULT

public expect fun TextRange_FindText(hobj: HUIATEXTRANGE, text: BSTR, backward: BOOL, ignorecase: BOOL, pretval: Long): HRESULT

public expect fun TextRange_GetAttributeValue(hobj: HUIATEXTRANGE, attributeid: Int, pretval: Long): HRESULT

public expect fun TextRange_GetBoundingRectangles(hobj: HUIATEXTRANGE, pretval: Long): HRESULT

public expect fun TextRange_GetChildren(hobj: HUIATEXTRANGE, pretval: Long): HRESULT

public expect fun TextRange_GetEnclosingElement(hobj: HUIATEXTRANGE, pretval: Long): HRESULT

public expect fun TextRange_GetText(hobj: HUIATEXTRANGE, maxlength: Int, pretval: Long): HRESULT

public expect fun TextRange_Move(hobj: HUIATEXTRANGE, unit: TextUnit, count: Int, pretval: Long): HRESULT

public expect fun TextRange_MoveEndpointByRange(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint): HRESULT

public expect fun TextRange_MoveEndpointByUnit(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: Long): HRESULT

public expect fun TextRange_RemoveFromSelection(hobj: HUIATEXTRANGE): HRESULT

public expect fun TextRange_ScrollIntoView(hobj: HUIATEXTRANGE, aligntotop: BOOL): HRESULT

public expect fun TextRange_Select(hobj: HUIATEXTRANGE): HRESULT

public expect fun TogglePattern_Toggle(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun TransformPattern_Move(hobj: HUIAPATTERNOBJECT, x: Double, y: Double): HRESULT

public expect fun TransformPattern_Resize(hobj: HUIAPATTERNOBJECT, width: Double, height: Double): HRESULT

public expect fun TransformPattern_Rotate(hobj: HUIAPATTERNOBJECT, degrees: Double): HRESULT

public expect fun UiaAddEvent(hnode: HUIANODE, eventid: Int, pcallback: Long, scope: TreeScope, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): HRESULT

public expect fun UiaClientsAreListening(): BOOL

public expect fun UiaDisconnectAllProviders(): HRESULT

public expect fun UiaDisconnectProvider(pprovider: Long): HRESULT

public expect fun UiaEventAddWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT

public expect fun UiaEventRemoveWindow(hevent: HUIAEVENT, hwnd: HWND): HRESULT

public expect fun UiaFind(hnode: HUIANODE, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): HRESULT

public expect fun UiaGetErrorDescription(pdescription: Long): BOOL

public expect fun UiaGetPatternProvider(hnode: HUIANODE, patternid: Int, phobj: Long): HRESULT

public expect fun UiaGetPropertyValue(hnode: HUIANODE, propertyid: Int, pvalue: Long): HRESULT

public expect fun UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): HRESULT

public expect fun UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): HRESULT

public expect fun UiaGetRootNode(phnode: Long): HRESULT

public expect fun UiaGetRuntimeId(hnode: HUIANODE, pruntimeid: Long): HRESULT

public expect fun UiaGetUpdatedCache(hnode: HUIANODE, prequest: Long, normalizestate: NormalizeState, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT

public expect fun UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): HRESULT

public expect fun UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): HRESULT

public expect fun UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): HRESULT

public expect fun UiaHasServerSideProvider(hwnd: HWND): BOOL

public expect fun UiaHostProviderFromHwnd(hwnd: HWND, ppprovider: Long): HRESULT

public expect fun UiaIAccessibleFromProvider(pprovider: Long, dwflags: UInt, ppaccessible: Long, pvarchild: Long): HRESULT

public expect fun UiaLookupId(type: AutomationIdentifierType, pguid: Long): Int

public expect fun UiaNavigate(hnode: HUIANODE, direction: NavigateDirection, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT

public expect fun UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT

public expect fun UiaNodeFromHandle(hwnd: HWND, phnode: Long): HRESULT

public expect fun UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT

public expect fun UiaNodeFromProvider(pprovider: Long, phnode: Long): HRESULT

public expect fun UiaNodeRelease(hnode: HUIANODE): BOOL

public expect fun UiaPatternRelease(hobj: HUIAPATTERNOBJECT): BOOL

public expect fun UiaProviderForNonClient(hwnd: HWND, idobject: Int, idchild: Int, ppprovider: Long): HRESULT

public expect fun UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: UInt, ppprovider: Long): HRESULT

public expect fun UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): HRESULT

public expect fun UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): HRESULT

public expect fun UiaRaiseAutomationEvent(pprovider: Long, id: UIA_EVENT_ID): HRESULT

public expect fun UiaRaiseAutomationPropertyChangedEvent(pprovider: Long, id: UIA_PROPERTY_ID, oldvalue: VARIANT, newvalue: VARIANT): HRESULT

public expect fun UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): HRESULT

public expect fun UiaRaiseNotificationEvent(provider: Long, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: BSTR, activityid: BSTR): HRESULT

public expect fun UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: StructureChangeType, pruntimeid: Long, cruntimeidlen: Int): HRESULT

public expect fun UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: TextEditChangeType, pchangeddata: Long): HRESULT

public expect fun UiaRegisterProviderCallback(pcallback: Long)

public expect fun UiaRemoveEvent(hevent: HUIAEVENT): HRESULT

public expect fun UiaReturnRawElementProvider(hwnd: HWND, wparam: WPARAM, lparam: LPARAM, el: Long): LRESULT

public expect fun UiaSetFocus(hnode: HUIANODE): HRESULT

public expect fun UiaTextRangeRelease(hobj: HUIATEXTRANGE): BOOL

public expect fun UnhookWinEvent(hwineventhook: HWINEVENTHOOK): BOOL

public expect fun UnregisterPointerInputTarget(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL

public expect fun UnregisterPointerInputTargetEx(hwnd: HWND, pointertype: POINTER_INPUT_TYPE): BOOL

public expect fun ValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, pval: PCWSTR): HRESULT

public expect fun VirtualizedItemPattern_Realize(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun WindowFromAccessibleObject(param0: Long, phwnd: Long): HRESULT

public expect fun WindowPattern_Close(hobj: HUIAPATTERNOBJECT): HRESULT

public expect fun WindowPattern_SetWindowVisualState(hobj: HUIAPATTERNOBJECT, state: WindowVisualState): HRESULT

public expect fun WindowPattern_WaitForInputIdle(hobj: HUIAPATTERNOBJECT, milliseconds: Int, presult: Long): HRESULT
