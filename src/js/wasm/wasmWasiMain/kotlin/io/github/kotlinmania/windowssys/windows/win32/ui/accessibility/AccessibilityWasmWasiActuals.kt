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

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accessibleChildren(pacccontainer: COpaquePointer?, ichildstart: Int, cchildren: Int, rgvarchildren: COpaquePointer?, pcobtained: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOleaccVersionInfo(pver: COpaquePointer?, pbuild: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lresultFromObject(riid: COpaquePointer?, wparam: Wparam, punk: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun objectFromLresult(lresult: Lresult, riid: COpaquePointer?, wparam: Wparam, ppvobject: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeClone(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: COpaquePointer?, scope: TreeScope, pproperties: COpaquePointer?, cproperties: Int, prequest: COpaquePointer?, phevent: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaClientsAreListening(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaDisconnectAllProviders(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaDisconnectProvider(pprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaFind(hnode: Huianode, pparams: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, ppoffsets: COpaquePointer?, pptreestructures: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetErrorDescription(pdescription: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetRootNode(phnode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: COpaquePointer?, normalizestate: NormalizeState, pnormalizecondition: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaHPatternObjectFromVariant(pvar: COpaquePointer?, phobj: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaHTextRangeFromVariant(pvar: COpaquePointer?, phtextrange: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaHUiaNodeFromVariant(pvar: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaIAccessibleFromProvider(pprovider: COpaquePointer?, dwflags: UInt, ppaccessible: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaNodeFromFocus(prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaNodeFromProvider(pprovider: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaProviderFromIAccessible(paccessible: COpaquePointer?, idchild: Int, dwflags: UInt, ppprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: COpaquePointer?, textrange: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: COpaquePointer?, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseAutomationEvent(pprovider: COpaquePointer?, id: UiaEventId): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: COpaquePointer?, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseChangesEvent(pprovider: COpaquePointer?, eventidcount: Int, puiachanges: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseNotificationEvent(provider: COpaquePointer?, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseStructureChangedEvent(pprovider: COpaquePointer?, structurechangetype: StructureChangeType, pruntimeid: COpaquePointer?, cruntimeidlen: Int): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: COpaquePointer?, texteditchangetype: TextEditChangeType, pchangeddata: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRegisterProviderCallback(pcallback: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: COpaquePointer?): Lresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowFromAccessibleObject(param0: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
