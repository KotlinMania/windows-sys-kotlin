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

public expect fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult

public expect fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult

public expect fun accessibleChildren(pacccontainer: COpaquePointer?, ichildstart: Int, cchildren: Int, rgvarchildren: COpaquePointer?, pcobtained: COpaquePointer?): Hresult

public expect fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult

public expect fun accessibleObjectFromPoint(ptscreen: Point, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult

public expect fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult

public expect fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult

public expect fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult

public expect fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult

public expect fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult

public expect fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult

public expect fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult

public expect fun getOleaccVersionInfo(pver: COpaquePointer?, pbuild: COpaquePointer?)

public expect fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt

public expect fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt

public expect fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt

public expect fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt

public expect fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: COpaquePointer?): Hresult

public expect fun invokePatternInvoke(hobj: Huiapatternobject): Hresult

public expect fun isWinEventHookInstalled(event: UInt): Bool

public expect fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: COpaquePointer?): Hresult

public expect fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult

public expect fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: COpaquePointer?): Hresult

public expect fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult

public expect fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult

public expect fun lresultFromObject(riid: COpaquePointer?, wparam: Wparam, punk: COpaquePointer?): Lresult

public expect fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: COpaquePointer?): Hresult

public expect fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult

public expect fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int)

public expect fun objectFromLresult(lresult: Lresult, riid: COpaquePointer?, wparam: Wparam, ppvobject: COpaquePointer?): Hresult

public expect fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult

public expect fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool

public expect fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool

public expect fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult

public expect fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult

public expect fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult

public expect fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult

public expect fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult

public expect fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult

public expect fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook

public expect fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult

public expect fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult

public expect fun textPatternGetSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult

public expect fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult

public expect fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: COpaquePointer?): Hresult

public expect fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: COpaquePointer?): Hresult

public expect fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult

public expect fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult

public expect fun textRangeAddToSelection(hobj: Huiatextrange): Hresult

public expect fun textRangeClone(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult

public expect fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: COpaquePointer?): Hresult

public expect fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: COpaquePointer?): Hresult

public expect fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult

public expect fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: COpaquePointer?): Hresult

public expect fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: COpaquePointer?): Hresult

public expect fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: COpaquePointer?): Hresult

public expect fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult

public expect fun textRangeGetChildren(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult

public expect fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult

public expect fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: COpaquePointer?): Hresult

public expect fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult

public expect fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult

public expect fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult

public expect fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult

public expect fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult

public expect fun textRangeSelect(hobj: Huiatextrange): Hresult

public expect fun togglePatternToggle(hobj: Huiapatternobject): Hresult

public expect fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult

public expect fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult

public expect fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult

public expect fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: COpaquePointer?, scope: TreeScope, pproperties: COpaquePointer?, cproperties: Int, prequest: COpaquePointer?, phevent: COpaquePointer?): Hresult

public expect fun uiaClientsAreListening(): Bool

public expect fun uiaDisconnectAllProviders(): Hresult

public expect fun uiaDisconnectProvider(pprovider: COpaquePointer?): Hresult

public expect fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult

public expect fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult

public expect fun uiaFind(hnode: Huianode, pparams: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, ppoffsets: COpaquePointer?, pptreestructures: COpaquePointer?): Hresult

public expect fun uiaGetErrorDescription(pdescription: COpaquePointer?): Bool

public expect fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: COpaquePointer?): Hresult

public expect fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: COpaquePointer?): Hresult

public expect fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: COpaquePointer?): Hresult

public expect fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: COpaquePointer?): Hresult

public expect fun uiaGetRootNode(phnode: COpaquePointer?): Hresult

public expect fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: COpaquePointer?): Hresult

public expect fun uiaGetUpdatedCache(hnode: Huianode, prequest: COpaquePointer?, normalizestate: NormalizeState, pnormalizecondition: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult

public expect fun uiaHPatternObjectFromVariant(pvar: COpaquePointer?, phobj: COpaquePointer?): Hresult

public expect fun uiaHTextRangeFromVariant(pvar: COpaquePointer?, phtextrange: COpaquePointer?): Hresult

public expect fun uiaHUiaNodeFromVariant(pvar: COpaquePointer?, phnode: COpaquePointer?): Hresult

public expect fun uiaHasServerSideProvider(hwnd: Hwnd): Bool

public expect fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: COpaquePointer?): Hresult

public expect fun uiaIAccessibleFromProvider(pprovider: COpaquePointer?, dwflags: UInt, ppaccessible: COpaquePointer?, pvarchild: COpaquePointer?): Hresult

public expect fun uiaLookupId(type: AutomationIdentifierType, pguid: COpaquePointer?): Int

public expect fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult

public expect fun uiaNodeFromFocus(prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult

public expect fun uiaNodeFromHandle(hwnd: Hwnd, phnode: COpaquePointer?): Hresult

public expect fun uiaNodeFromPoint(x: Double, y: Double, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult

public expect fun uiaNodeFromProvider(pprovider: COpaquePointer?, phnode: COpaquePointer?): Hresult

public expect fun uiaNodeRelease(hnode: Huianode): Bool

public expect fun uiaPatternRelease(hobj: Huiapatternobject): Bool

public expect fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: COpaquePointer?): Hresult

public expect fun uiaProviderFromIAccessible(paccessible: COpaquePointer?, idchild: Int, dwflags: UInt, ppprovider: COpaquePointer?): Hresult

public expect fun uiaRaiseActiveTextPositionChangedEvent(provider: COpaquePointer?, textrange: COpaquePointer?): Hresult

public expect fun uiaRaiseAsyncContentLoadedEvent(pprovider: COpaquePointer?, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult

public expect fun uiaRaiseAutomationEvent(pprovider: COpaquePointer?, id: UiaEventId): Hresult

public expect fun uiaRaiseAutomationPropertyChangedEvent(pprovider: COpaquePointer?, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult

public expect fun uiaRaiseChangesEvent(pprovider: COpaquePointer?, eventidcount: Int, puiachanges: COpaquePointer?): Hresult

public expect fun uiaRaiseNotificationEvent(provider: COpaquePointer?, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult

public expect fun uiaRaiseStructureChangedEvent(pprovider: COpaquePointer?, structurechangetype: StructureChangeType, pruntimeid: COpaquePointer?, cruntimeidlen: Int): Hresult

public expect fun uiaRaiseTextEditTextChangedEvent(pprovider: COpaquePointer?, texteditchangetype: TextEditChangeType, pchangeddata: COpaquePointer?): Hresult

public expect fun uiaRegisterProviderCallback(pcallback: COpaquePointer?)

public expect fun uiaRemoveEvent(hevent: Huiaevent): Hresult

public expect fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: COpaquePointer?): Lresult

public expect fun uiaSetFocus(hnode: Huianode): Hresult

public expect fun uiaTextRangeRelease(hobj: Huiatextrange): Bool

public expect fun unhookWinEvent(hwineventhook: Hwineventhook): Bool

public expect fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool

public expect fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool

public expect fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult

public expect fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult

public expect fun windowFromAccessibleObject(param0: COpaquePointer?, phwnd: COpaquePointer?): Hresult

public expect fun windowPatternClose(hobj: Huiapatternobject): Hresult

public expect fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult

public expect fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: COpaquePointer?): Hresult
