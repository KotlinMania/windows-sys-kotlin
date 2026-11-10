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

private object WindowsWin32UiAccessibilityJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState(hwndapp: Long, dwutilitystatemask: Int, dwutilitystate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_accessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent(hwnd: Long, dwid: Int, dwchildid: Int, ppacc: Long, pvarchild: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow(hwnd: Long, dwid: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_createStdAccessibleObject(hwnd: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA(hwnd: Long, pclassname: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW(hwnd: Long, pclassname: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition(hobj: Long, dockposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo(pver: Long, pbuild: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_getRoleTextA(lrole: Int, lpszrole: Long, cchrolemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_getRoleTextW(lrole: Int, lpszrole: Long, cchrolemax: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_getStateTextA(lstatebit: Int, lpszstate: Long, cchstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_getStateTextW(lstatebit: Int, lpszstate: Long, cchstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_gridPatternGetItem(hobj: Long, row: Int, column: Int, presult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_invokePatternInvoke(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled(event: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible(hobj: Long, paccessible: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect(hobj: Long, flagsselect: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue(hobj: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_lresultFromObject(riid: Long, wparam: Long, punk: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName(hobj: Long, viewid: Int, ppstr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView(hobj: Long, viewid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_notifyWinEvent(event: Int, hwnd: Long, idobject: Int, idchild: Int)

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_objectFromLresult(lresult: Long, riid: Long, wparam: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue(hobj: Long, value: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_registerPointerInputTarget(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx(hwnd: Long, pointertype: Int, fobserve: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_scrollPatternScroll(hobj: Long, horizontalamount: Int, verticalamount: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent(hobj: Long, horizontalpercent: Double, verticalpercent: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_setWinEventHook(eventmin: Int, eventmax: Int, hmodwineventproc: Long, pfnwineventproc: Long, idprocess: Int, idthread: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening(hobj: Long, inputtype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textPatternGetSelection(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild(hobj: Long, hnodechild: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeAddToSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeClone(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeCompare(hobj: Long, range: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints(hobj: Long, endpoint: Int, targetrange: Long, targetendpoint: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit(hobj: Long, unit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeFindText(hobj: Long, text: Long, backward: Int, ignorecase: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue(hobj: Long, attributeid: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeGetChildren(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeGetText(hobj: Long, maxlength: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeMove(hobj: Long, unit: Int, count: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange(hobj: Long, endpoint: Int, targetrange: Long, targetendpoint: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit(hobj: Long, endpoint: Int, unit: Int, count: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView(hobj: Long, aligntotop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_textRangeSelect(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_togglePatternToggle(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_transformPatternMove(hobj: Long, x: Double, y: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_transformPatternResize(hobj: Long, width: Double, height: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_transformPatternRotate(hobj: Long, degrees: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaAddEvent(hnode: Long, eventid: Int, pcallback: Long, scope: Int, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaClientsAreListening(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider(pprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaEventAddWindow(hevent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow(hevent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaFind(hnode: Long, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription(pdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider(hnode: Long, patternid: Int, phobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue(hnode: Long, propertyid: Int, pvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetRootNode(phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId(hnode: Long, pruntimeid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache(hnode: Long, prequest: Long, normalizestate: Int, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant(pvar: Long, phobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant(pvar: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd(hwnd: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider(pprovider: Long, dwflags: Int, ppaccessible: Long, pvarchild: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaLookupId(type: Int, pguid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaNavigate(hnode: Long, direction: Int, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle(hwnd: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider(pprovider: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaNodeRelease(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaPatternRelease(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient(hwnd: Long, idobject: Int, idchild: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: Int, percentcomplete: Double): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent(pprovider: Long, id: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent(provider: Long, notificationkind: Int, notificationprocessing: Int, displaystring: Long, activityid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: Int, pruntimeid: Long, cruntimeidlen: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: Int, pchangeddata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback(pcallback: Long)

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaRemoveEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider(hwnd: Long, wparam: Long, lparam: Long, el: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaSetFocus(hnode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_unhookWinEvent(hwineventhook: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_valuePatternSetValue(hobj: Long, pval: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject(param0: Long, phwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_windowPatternClose(hobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState(hobj: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle(hobj: Long, milliseconds: Int, presult: Long): Int
}

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    0

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState((hwndapp?.value ?: 0L), dwutilitystatemask.toInt(), dwutilitystate.toInt())

public actual fun accessibleChildren(pacccontainer: COpaquePointer?, ichildstart: Int, cchildren: Int, rgvarchildren: COpaquePointer?, pcobtained: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_accessibleChildren((pacccontainer?.value ?: 0L), ichildstart, cchildren, (rgvarchildren?.value ?: 0L), (pcobtained?.value ?: 0L))

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent((hwnd?.value ?: 0L), dwid.toInt(), dwchildid.toInt(), (ppacc?.value ?: 0L), (pvarchild?.value ?: 0L))

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    0

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow((hwnd?.value ?: 0L), dwid.toInt(), (riid?.value ?: 0L), (ppvobject?.value ?: 0L))

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_createStdAccessibleObject((hwnd?.value ?: 0L), idobject, (riid?.value ?: 0L), (ppvobject?.value ?: 0L))

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA((hwnd?.value ?: 0L), (pclassname?.value ?: 0L), idobject, (riid?.value ?: 0L), (ppvobject?.value ?: 0L))

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW((hwnd?.value ?: 0L), (pclassname?.value ?: 0L), idobject, (riid?.value ?: 0L), (ppvobject?.value ?: 0L))

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition((hobj?.value ?: 0L), dockposition)

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse((hobj?.value ?: 0L))

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand((hobj?.value ?: 0L))

public actual fun getOleaccVersionInfo(pver: COpaquePointer?, pbuild: COpaquePointer?) {
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo((pver?.value ?: 0L), (pbuild?.value ?: 0L))
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_getRoleTextA(lrole.toInt(), (lpszrole?.value ?: 0L), cchrolemax.toInt()).toUInt()

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_getRoleTextW(lrole.toInt(), (lpszrole?.value ?: 0L), cchrolemax.toInt()).toUInt()

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_getStateTextA(lstatebit.toInt(), (lpszstate?.value ?: 0L), cchstate.toInt()).toUInt()

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_getStateTextW(lstatebit.toInt(), (lpszstate?.value ?: 0L), cchstate.toInt()).toUInt()

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_gridPatternGetItem((hobj?.value ?: 0L), row, column, (presult?.value ?: 0L))

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_invokePatternInvoke((hobj?.value ?: 0L))

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled(event.toInt())

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: COpaquePointer?): Hresult =
    0

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction((hobj?.value ?: 0L))

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible((hobj?.value ?: 0L), (paccessible?.value ?: 0L))

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect((hobj?.value ?: 0L), flagsselect)

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue((hobj?.value ?: 0L), (szvalue?.value ?: 0L))

public actual fun lresultFromObject(riid: COpaquePointer?, wparam: Wparam, punk: COpaquePointer?): Lresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_lresultFromObject((riid?.value ?: 0L), wparam.toLong(), (punk?.value ?: 0L))

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName((hobj?.value ?: 0L), viewid, (ppstr?.value ?: 0L))

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView((hobj?.value ?: 0L), viewid)

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_notifyWinEvent(event.toInt(), (hwnd?.value ?: 0L), idobject, idchild)
}

public actual fun objectFromLresult(lresult: Lresult, riid: COpaquePointer?, wparam: Wparam, ppvobject: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_objectFromLresult(lresult, (riid?.value ?: 0L), wparam.toLong(), (ppvobject?.value ?: 0L))

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue((hobj?.value ?: 0L), value)

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_registerPointerInputTarget((hwnd?.value ?: 0L), pointertype)

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx((hwnd?.value ?: 0L), pointertype, fobserve)

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView((hobj?.value ?: 0L))

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_scrollPatternScroll((hobj?.value ?: 0L), horizontalamount, verticalamount)

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent((hobj?.value ?: 0L), horizontalpercent, verticalpercent)

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection((hobj?.value ?: 0L))

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection((hobj?.value ?: 0L))

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect((hobj?.value ?: 0L))

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_setWinEventHook(eventmin.toInt(), eventmax.toInt(), (hmodwineventproc?.value ?: 0L), 0L, idprocess.toInt(), idthread.toInt(), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel((hobj?.value ?: 0L))

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening((hobj?.value ?: 0L), inputtype)

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textPatternGetSelection((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild((hobj?.value ?: 0L), (hnodechild?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: COpaquePointer?): Hresult =
    0

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeAddToSelection((hobj?.value ?: 0L))

public actual fun textRangeClone(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeClone((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeCompare((hobj?.value ?: 0L), (range?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints((hobj?.value ?: 0L), endpoint, (targetrange?.value ?: 0L), targetendpoint, (pretval?.value ?: 0L))

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit((hobj?.value ?: 0L), unit)

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: COpaquePointer?): Hresult =
    0

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeFindText((hobj?.value ?: 0L), (text?.value ?: 0L), backward, ignorecase, (pretval?.value ?: 0L))

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue((hobj?.value ?: 0L), attributeid, (pretval?.value ?: 0L))

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeGetChildren((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement((hobj?.value ?: 0L), (pretval?.value ?: 0L))

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeGetText((hobj?.value ?: 0L), maxlength, (pretval?.value ?: 0L))

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeMove((hobj?.value ?: 0L), unit, count, (pretval?.value ?: 0L))

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange((hobj?.value ?: 0L), endpoint, (targetrange?.value ?: 0L), targetendpoint)

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit((hobj?.value ?: 0L), endpoint, unit, count, (pretval?.value ?: 0L))

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection((hobj?.value ?: 0L))

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView((hobj?.value ?: 0L), aligntotop)

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_textRangeSelect((hobj?.value ?: 0L))

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_togglePatternToggle((hobj?.value ?: 0L))

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_transformPatternMove((hobj?.value ?: 0L), x, y)

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_transformPatternResize((hobj?.value ?: 0L), width, height)

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_transformPatternRotate((hobj?.value ?: 0L), degrees)

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: COpaquePointer?, scope: TreeScope, pproperties: COpaquePointer?, cproperties: Int, prequest: COpaquePointer?, phevent: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaAddEvent((hnode?.value ?: 0L), eventid, (pcallback?.value ?: 0L), scope, (pproperties?.value ?: 0L), cproperties, (prequest?.value ?: 0L), (phevent?.value ?: 0L))

public actual fun uiaClientsAreListening(): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaClientsAreListening()

public actual fun uiaDisconnectAllProviders(): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders()

public actual fun uiaDisconnectProvider(pprovider: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider((pprovider?.value ?: 0L))

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaEventAddWindow((hevent?.value ?: 0L), (hwnd?.value ?: 0L))

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow((hevent?.value ?: 0L), (hwnd?.value ?: 0L))

public actual fun uiaFind(hnode: Huianode, pparams: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, ppoffsets: COpaquePointer?, pptreestructures: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaFind((hnode?.value ?: 0L), (pparams?.value ?: 0L), (prequest?.value ?: 0L), (pprequesteddata?.value ?: 0L), (ppoffsets?.value ?: 0L), (pptreestructures?.value ?: 0L))

public actual fun uiaGetErrorDescription(pdescription: COpaquePointer?): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription((pdescription?.value ?: 0L))

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider((hnode?.value ?: 0L), patternid, (phobj?.value ?: 0L))

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue((hnode?.value ?: 0L), propertyid, (pvalue?.value ?: 0L))

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue((punkmixedattributevalue?.value ?: 0L))

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue((punknotsupportedvalue?.value ?: 0L))

public actual fun uiaGetRootNode(phnode: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetRootNode((phnode?.value ?: 0L))

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId((hnode?.value ?: 0L), (pruntimeid?.value ?: 0L))

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: COpaquePointer?, normalizestate: NormalizeState, pnormalizecondition: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache((hnode?.value ?: 0L), (prequest?.value ?: 0L), normalizestate, (pnormalizecondition?.value ?: 0L), (pprequesteddata?.value ?: 0L), (pptreestructure?.value ?: 0L))

public actual fun uiaHPatternObjectFromVariant(pvar: COpaquePointer?, phobj: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant((pvar?.value ?: 0L), (phobj?.value ?: 0L))

public actual fun uiaHTextRangeFromVariant(pvar: COpaquePointer?, phtextrange: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant((pvar?.value ?: 0L), (phtextrange?.value ?: 0L))

public actual fun uiaHUiaNodeFromVariant(pvar: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant((pvar?.value ?: 0L), (phnode?.value ?: 0L))

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider((hwnd?.value ?: 0L))

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd((hwnd?.value ?: 0L), (ppprovider?.value ?: 0L))

public actual fun uiaIAccessibleFromProvider(pprovider: COpaquePointer?, dwflags: UInt, ppaccessible: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider((pprovider?.value ?: 0L), dwflags.toInt(), (ppaccessible?.value ?: 0L), (pvarchild?.value ?: 0L))

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: COpaquePointer?): Int =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaLookupId(type, (pguid?.value ?: 0L))

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaNavigate((hnode?.value ?: 0L), direction, (pcondition?.value ?: 0L), (prequest?.value ?: 0L), (pprequesteddata?.value ?: 0L), (pptreestructure?.value ?: 0L))

public actual fun uiaNodeFromFocus(prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus((prequest?.value ?: 0L), (pprequesteddata?.value ?: 0L), (pptreestructure?.value ?: 0L))

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle((hwnd?.value ?: 0L), (phnode?.value ?: 0L))

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint(x, y, (prequest?.value ?: 0L), (pprequesteddata?.value ?: 0L), (pptreestructure?.value ?: 0L))

public actual fun uiaNodeFromProvider(pprovider: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider((pprovider?.value ?: 0L), (phnode?.value ?: 0L))

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaNodeRelease((hnode?.value ?: 0L))

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaPatternRelease((hobj?.value ?: 0L))

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient((hwnd?.value ?: 0L), idobject, idchild, (ppprovider?.value ?: 0L))

public actual fun uiaProviderFromIAccessible(paccessible: COpaquePointer?, idchild: Int, dwflags: UInt, ppprovider: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible((paccessible?.value ?: 0L), idchild, dwflags.toInt(), (ppprovider?.value ?: 0L))

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: COpaquePointer?, textrange: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent((provider?.value ?: 0L), (textrange?.value ?: 0L))

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: COpaquePointer?, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent((pprovider?.value ?: 0L), asynccontentloadedstate, percentcomplete)

public actual fun uiaRaiseAutomationEvent(pprovider: COpaquePointer?, id: UiaEventId): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent((pprovider?.value ?: 0L), id)

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: COpaquePointer?, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    0

public actual fun uiaRaiseChangesEvent(pprovider: COpaquePointer?, eventidcount: Int, puiachanges: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent((pprovider?.value ?: 0L), eventidcount, (puiachanges?.value ?: 0L))

public actual fun uiaRaiseNotificationEvent(provider: COpaquePointer?, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent((provider?.value ?: 0L), notificationkind, notificationprocessing, (displaystring?.value ?: 0L), (activityid?.value ?: 0L))

public actual fun uiaRaiseStructureChangedEvent(pprovider: COpaquePointer?, structurechangetype: StructureChangeType, pruntimeid: COpaquePointer?, cruntimeidlen: Int): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent((pprovider?.value ?: 0L), structurechangetype, (pruntimeid?.value ?: 0L), cruntimeidlen)

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: COpaquePointer?, texteditchangetype: TextEditChangeType, pchangeddata: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent((pprovider?.value ?: 0L), texteditchangetype, (pchangeddata?.value ?: 0L))

public actual fun uiaRegisterProviderCallback(pcallback: COpaquePointer?) {
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback((pcallback?.value ?: 0L))
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaRemoveEvent((hevent?.value ?: 0L))

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: COpaquePointer?): Lresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider((hwnd?.value ?: 0L), wparam.toLong(), lparam, (el?.value ?: 0L))

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaSetFocus((hnode?.value ?: 0L))

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease((hobj?.value ?: 0L))

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_unhookWinEvent((hwineventhook?.value ?: 0L))

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget((hwnd?.value ?: 0L), pointertype)

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx((hwnd?.value ?: 0L), pointertype)

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_valuePatternSetValue((hobj?.value ?: 0L), (pval?.value ?: 0L))

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize((hobj?.value ?: 0L))

public actual fun windowFromAccessibleObject(param0: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject((param0?.value ?: 0L), (phwnd?.value ?: 0L))

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_windowPatternClose((hobj?.value ?: 0L))

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState((hobj?.value ?: 0L), state)

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: COpaquePointer?): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle((hobj?.value ?: 0L), milliseconds, (presult?.value ?: 0L))
