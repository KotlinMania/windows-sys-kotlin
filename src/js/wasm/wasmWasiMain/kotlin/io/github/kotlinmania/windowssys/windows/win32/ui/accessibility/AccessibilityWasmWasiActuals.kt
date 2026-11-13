@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityAccNotifyTouchInteraction")

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState")

public actual fun accessibleChildren(pacccontainer: MutPtr, ichildstart: Int, cchildren: Int, rgvarchildren: MutPtr, pcobtained: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityAccessibleChildren")

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: MutPtr, pvarchild: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent")

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: MutPtr, pvarchild: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityAccessibleObjectFromPoint")

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow")

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject")

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA")

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW")

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition")

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse")

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand")

public actual fun getOleaccVersionInfo(pver: MutPtr, pbuild: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo")

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityGetRoleTextA")

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityGetRoleTextW")

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityGetStateTextA")

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityGetStateTextW")

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityGridPatternGetItem")

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityInvokePatternInvoke")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled")
private external fun wasiWindowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event: Int): Int

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    wasiWindowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event.toInt())

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityItemContainerPatternFindItemByProperty")

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction")

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible")

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect")

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue")

public actual fun lresultFromObject(riid: ConstPtr, wparam: Wparam, punk: MutPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityLresultFromObject")

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName")

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView")

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityNotifyWinEvent")

public actual fun objectFromLresult(lresult: Lresult, riid: ConstPtr, wparam: Wparam, ppvobject: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityObjectFromLresult")

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue")

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget")

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx")

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView")

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityScrollPatternScroll")

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent")

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection")

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection")

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect")

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilitySetWinEventHook")

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel")

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening")

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextPatternGetSelection")

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges")

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild")

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextPatternRangeFromPoint")

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange")

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection")

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection")

public actual fun textRangeClone(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeClone")

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeCompare")

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints")

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit")

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeFindAttribute")

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeFindText")

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue")

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles")

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeGetChildren")

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement")

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeGetText")

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeMove")

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange")

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit")

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection")

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView")

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTextRangeSelect")

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTogglePatternToggle")

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTransformPatternMove")

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTransformPatternResize")

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityTransformPatternRotate")

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: MutPtr, scope: TreeScope, pproperties: MutPtr, cproperties: Int, prequest: MutPtr, phevent: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaAddEvent")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiAccessibilityUiaClientsAreListening")
private external fun wasiWindowssysWindowsWin32UiAccessibilityUiaClientsAreListening(): Int

public actual fun uiaClientsAreListening(): Bool =
    wasiWindowssysWindowsWin32UiAccessibilityUiaClientsAreListening()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders")
private external fun wasiWindowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders(): Int

public actual fun uiaDisconnectAllProviders(): Hresult =
    wasiWindowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders()

public actual fun uiaDisconnectProvider(pprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider")

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaEventAddWindow")

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow")

public actual fun uiaFind(hnode: Huianode, pparams: MutPtr, prequest: MutPtr, pprequesteddata: MutPtr, ppoffsets: MutPtr, pptreestructures: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaFind")

public actual fun uiaGetErrorDescription(pdescription: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription")

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider")

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue")

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue")

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue")

public actual fun uiaGetRootNode(phnode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetRootNode")

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId")

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: MutPtr, normalizestate: NormalizeState, pnormalizecondition: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache")

public actual fun uiaHPatternObjectFromVariant(pvar: MutPtr, phobj: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant")

public actual fun uiaHTextRangeFromVariant(pvar: MutPtr, phtextrange: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant")

public actual fun uiaHUiaNodeFromVariant(pvar: MutPtr, phnode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant")

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider")

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd")

public actual fun uiaIAccessibleFromProvider(pprovider: MutPtr, dwflags: UInt, ppaccessible: MutPtr, pvarchild: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider")

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaLookupId")

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: MutPtr, prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaNavigate")

public actual fun uiaNodeFromFocus(prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus")

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle")

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint")

public actual fun uiaNodeFromProvider(pprovider: MutPtr, phnode: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider")

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaNodeRelease")

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaPatternRelease")

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient")

public actual fun uiaProviderFromIAccessible(paccessible: MutPtr, idchild: Int, dwflags: UInt, ppprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible")

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: MutPtr, textrange: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent")

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: MutPtr, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent")

public actual fun uiaRaiseAutomationEvent(pprovider: MutPtr, id: UiaEventId): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent")

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: MutPtr, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationPropertyChangedEvent")

public actual fun uiaRaiseChangesEvent(pprovider: MutPtr, eventidcount: Int, puiachanges: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent")

public actual fun uiaRaiseNotificationEvent(provider: MutPtr, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent")

public actual fun uiaRaiseStructureChangedEvent(pprovider: MutPtr, structurechangetype: StructureChangeType, pruntimeid: MutPtr, cruntimeidlen: Int): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent")

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: MutPtr, texteditchangetype: TextEditChangeType, pchangeddata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent")

public actual fun uiaRegisterProviderCallback(pcallback: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback")

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaRemoveEvent")

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: MutPtr): Lresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider")

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaSetFocus")

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease")

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUnhookWinEvent")

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget")

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx")

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityValuePatternSetValue")

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize")

public actual fun windowFromAccessibleObject(param0: MutPtr, phwnd: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject")

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityWindowPatternClose")

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState")

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle")
