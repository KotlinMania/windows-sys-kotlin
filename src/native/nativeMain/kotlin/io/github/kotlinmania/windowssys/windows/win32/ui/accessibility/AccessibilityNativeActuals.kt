@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityAccessibleChildren
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityGetRoleTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityGetRoleTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityGetStateTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityGetStateTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityGridPatternGetItem
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityInvokePatternInvoke
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityLresultFromObject
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityNotifyWinEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityObjectFromLresult
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityScrollPatternScroll
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilitySetWinEventHook
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextPatternGetSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeClone
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeCompare
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeFindText
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeGetChildren
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeGetText
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeMove
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTextRangeSelect
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTogglePatternToggle
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTransformPatternMove
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTransformPatternResize
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityTransformPatternRotate
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaAddEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaClientsAreListening
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaEventAddWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaFind
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetRootNode
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaLookupId
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaNavigate
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaNodeRelease
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaPatternRelease
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaRemoveEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaSetFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUnhookWinEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityValuePatternSetValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityWindowPatternClose
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    0

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(hwndapp.rawAddress.toCPointer<ByteVar>(), dwutilitystatemask, dwutilitystate)

public actual fun accessibleChildren(pacccontainer: MutPtr, ichildstart: Int, cchildren: Int, rgvarchildren: MutPtr, pcobtained: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityAccessibleChildren(pacccontainer.rawAddress.toCPointer<ByteVar>(), ichildstart, cchildren, rgvarchildren.rawAddress.toCPointer<ByteVar>(), pcobtained.rawAddress.toCPointer<ByteVar>())

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: MutPtr, pvarchild: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(hwnd.rawAddress.toCPointer<ByteVar>(), dwid, dwchildid, ppacc.rawAddress.toCPointer<ByteVar>(), pvarchild.rawAddress.toCPointer<ByteVar>())

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: MutPtr, pvarchild: MutPtr): Hresult =
    0

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(hwnd.rawAddress.toCPointer<ByteVar>(), dwid, riid.rawAddress.toCPointer<ByteVar>(), ppvobject.rawAddress.toCPointer<ByteVar>())

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(hwnd.rawAddress.toCPointer<ByteVar>(), idobject, riid.rawAddress.toCPointer<ByteVar>(), ppvobject.rawAddress.toCPointer<ByteVar>())

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(hwnd.rawAddress.toCPointer<ByteVar>(), pclassname.rawAddress.toCPointer<ByteVar>(), idobject, riid.rawAddress.toCPointer<ByteVar>(), ppvobject.rawAddress.toCPointer<ByteVar>())

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(hwnd.rawAddress.toCPointer<ByteVar>(), pclassname.rawAddress.toCPointer<ByteVar>(), idobject, riid.rawAddress.toCPointer<ByteVar>(), ppvobject.rawAddress.toCPointer<ByteVar>())

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(hobj.rawAddress.toCPointer<ByteVar>(), dockposition)

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun getOleaccVersionInfo(pver: MutPtr, pbuild: MutPtr) {
    windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(pver.rawAddress.toCPointer<ByteVar>(), pbuild.rawAddress.toCPointer<ByteVar>())
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    windowssysWindowsWin32UiAccessibilityGetRoleTextA(lrole, lpszrole.rawAddress.toCPointer<ByteVar>(), cchrolemax)

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    windowssysWindowsWin32UiAccessibilityGetRoleTextW(lrole, lpszrole.rawAddress.toCPointer<ByteVar>(), cchrolemax)

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    windowssysWindowsWin32UiAccessibilityGetStateTextA(lstatebit, lpszstate.rawAddress.toCPointer<ByteVar>(), cchstate)

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    windowssysWindowsWin32UiAccessibilityGetStateTextW(lstatebit, lpszstate.rawAddress.toCPointer<ByteVar>(), cchstate)

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityGridPatternGetItem(hobj.rawAddress.toCPointer<ByteVar>(), row, column, presult.rawAddress.toCPointer<ByteVar>())

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityInvokePatternInvoke(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event)

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: MutPtr): Hresult =
    0

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(hobj.rawAddress.toCPointer<ByteVar>(), paccessible.rawAddress.toCPointer<ByteVar>())

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(hobj.rawAddress.toCPointer<ByteVar>(), flagsselect)

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(hobj.rawAddress.toCPointer<ByteVar>(), szvalue.rawAddress.toCPointer<ByteVar>())

public actual fun lresultFromObject(riid: ConstPtr, wparam: Wparam, punk: MutPtr): Lresult =
    windowssysWindowsWin32UiAccessibilityLresultFromObject(riid.rawAddress.toCPointer<ByteVar>(), wparam, punk.rawAddress.toCPointer<ByteVar>())

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(hobj.rawAddress.toCPointer<ByteVar>(), viewid, ppstr.rawAddress.toCPointer<ByteVar>())

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(hobj.rawAddress.toCPointer<ByteVar>(), viewid)

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    windowssysWindowsWin32UiAccessibilityNotifyWinEvent(event, hwnd.rawAddress.toCPointer<ByteVar>(), idobject, idchild)
}

public actual fun objectFromLresult(lresult: Lresult, riid: ConstPtr, wparam: Wparam, ppvobject: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityObjectFromLresult(lresult, riid.rawAddress.toCPointer<ByteVar>(), wparam, ppvobject.rawAddress.toCPointer<ByteVar>())

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(hobj.rawAddress.toCPointer<ByteVar>(), value)

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(hwnd.rawAddress.toCPointer<ByteVar>(), pointertype)

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(hwnd.rawAddress.toCPointer<ByteVar>(), pointertype, fobserve)

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    windowssysWindowsWin32UiAccessibilityScrollPatternScroll(hobj.rawAddress.toCPointer<ByteVar>(), horizontalamount, verticalamount)

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(hobj.rawAddress.toCPointer<ByteVar>(), horizontalpercent, verticalpercent)

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    MutPtr(windowssysWindowsWin32UiAccessibilitySetWinEventHook(eventmin, eventmax, hmodwineventproc.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), idprocess, idthread, dwflags)?.toLong() ?: 0L)

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(hobj.rawAddress.toCPointer<ByteVar>(), inputtype)

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextPatternGetSelection(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(hobj.rawAddress.toCPointer<ByteVar>(), hnodechild.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: MutPtr): Hresult =
    0

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeClone(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeClone(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeCompare(hobj.rawAddress.toCPointer<ByteVar>(), range.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(hobj.rawAddress.toCPointer<ByteVar>(), endpoint, targetrange.rawAddress.toCPointer<ByteVar>(), targetendpoint, pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(hobj.rawAddress.toCPointer<ByteVar>(), unit)

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: MutPtr): Hresult =
    0

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeFindText(hobj.rawAddress.toCPointer<ByteVar>(), text.rawAddress.toCPointer<ByteVar>(), backward, ignorecase, pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(hobj.rawAddress.toCPointer<ByteVar>(), attributeid, pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeGetChildren(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(hobj.rawAddress.toCPointer<ByteVar>(), pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeGetText(hobj.rawAddress.toCPointer<ByteVar>(), maxlength, pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeMove(hobj.rawAddress.toCPointer<ByteVar>(), unit, count, pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(hobj.rawAddress.toCPointer<ByteVar>(), endpoint, targetrange.rawAddress.toCPointer<ByteVar>(), targetendpoint)

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(hobj.rawAddress.toCPointer<ByteVar>(), endpoint, unit, count, pretval.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(hobj.rawAddress.toCPointer<ByteVar>(), aligntotop)

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    windowssysWindowsWin32UiAccessibilityTextRangeSelect(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityTogglePatternToggle(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    windowssysWindowsWin32UiAccessibilityTransformPatternMove(hobj.rawAddress.toCPointer<ByteVar>(), x, y)

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    windowssysWindowsWin32UiAccessibilityTransformPatternResize(hobj.rawAddress.toCPointer<ByteVar>(), width, height)

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    windowssysWindowsWin32UiAccessibilityTransformPatternRotate(hobj.rawAddress.toCPointer<ByteVar>(), degrees)

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: MutPtr, scope: TreeScope, pproperties: MutPtr, cproperties: Int, prequest: MutPtr, phevent: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaAddEvent(hnode.rawAddress.toCPointer<ByteVar>(), eventid, pcallback.rawAddress.toCPointer<ByteVar>(), scope, pproperties.rawAddress.toCPointer<ByteVar>(), cproperties, prequest.rawAddress.toCPointer<ByteVar>(), phevent.rawAddress.toCPointer<ByteVar>())

public actual fun uiaClientsAreListening(): Bool =
    windowssysWindowsWin32UiAccessibilityUiaClientsAreListening()

public actual fun uiaDisconnectAllProviders(): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders()

public actual fun uiaDisconnectProvider(pprovider: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(pprovider.rawAddress.toCPointer<ByteVar>())

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaEventAddWindow(hevent.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(hevent.rawAddress.toCPointer<ByteVar>(), hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun uiaFind(hnode: Huianode, pparams: MutPtr, prequest: MutPtr, pprequesteddata: MutPtr, ppoffsets: MutPtr, pptreestructures: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaFind(hnode.rawAddress.toCPointer<ByteVar>(), pparams.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), pprequesteddata.rawAddress.toCPointer<ByteVar>(), ppoffsets.rawAddress.toCPointer<ByteVar>(), pptreestructures.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetErrorDescription(pdescription: MutPtr): Bool =
    windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(pdescription.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(hnode.rawAddress.toCPointer<ByteVar>(), patternid, phobj.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(hnode.rawAddress.toCPointer<ByteVar>(), propertyid, pvalue.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(punkmixedattributevalue.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(punknotsupportedvalue.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetRootNode(phnode: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetRootNode(phnode.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(hnode.rawAddress.toCPointer<ByteVar>(), pruntimeid.rawAddress.toCPointer<ByteVar>())

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: MutPtr, normalizestate: NormalizeState, pnormalizecondition: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(hnode.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), normalizestate, pnormalizecondition.rawAddress.toCPointer<ByteVar>(), pprequesteddata.rawAddress.toCPointer<ByteVar>(), pptreestructure.rawAddress.toCPointer<ByteVar>())

public actual fun uiaHPatternObjectFromVariant(pvar: MutPtr, phobj: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(pvar.rawAddress.toCPointer<ByteVar>(), phobj.rawAddress.toCPointer<ByteVar>())

public actual fun uiaHTextRangeFromVariant(pvar: MutPtr, phtextrange: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(pvar.rawAddress.toCPointer<ByteVar>(), phtextrange.rawAddress.toCPointer<ByteVar>())

public actual fun uiaHUiaNodeFromVariant(pvar: MutPtr, phnode: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(pvar.rawAddress.toCPointer<ByteVar>(), phnode.rawAddress.toCPointer<ByteVar>())

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(hwnd.rawAddress.toCPointer<ByteVar>(), ppprovider.rawAddress.toCPointer<ByteVar>())

public actual fun uiaIAccessibleFromProvider(pprovider: MutPtr, dwflags: UInt, ppaccessible: MutPtr, pvarchild: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(pprovider.rawAddress.toCPointer<ByteVar>(), dwflags, ppaccessible.rawAddress.toCPointer<ByteVar>(), pvarchild.rawAddress.toCPointer<ByteVar>())

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: ConstPtr): Int =
    windowssysWindowsWin32UiAccessibilityUiaLookupId(type, pguid.rawAddress.toCPointer<ByteVar>())

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: MutPtr, prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaNavigate(hnode.rawAddress.toCPointer<ByteVar>(), direction, pcondition.rawAddress.toCPointer<ByteVar>(), prequest.rawAddress.toCPointer<ByteVar>(), pprequesteddata.rawAddress.toCPointer<ByteVar>(), pptreestructure.rawAddress.toCPointer<ByteVar>())

public actual fun uiaNodeFromFocus(prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(prequest.rawAddress.toCPointer<ByteVar>(), pprequesteddata.rawAddress.toCPointer<ByteVar>(), pptreestructure.rawAddress.toCPointer<ByteVar>())

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(hwnd.rawAddress.toCPointer<ByteVar>(), phnode.rawAddress.toCPointer<ByteVar>())

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(x, y, prequest.rawAddress.toCPointer<ByteVar>(), pprequesteddata.rawAddress.toCPointer<ByteVar>(), pptreestructure.rawAddress.toCPointer<ByteVar>())

public actual fun uiaNodeFromProvider(pprovider: MutPtr, phnode: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(pprovider.rawAddress.toCPointer<ByteVar>(), phnode.rawAddress.toCPointer<ByteVar>())

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    windowssysWindowsWin32UiAccessibilityUiaNodeRelease(hnode.rawAddress.toCPointer<ByteVar>())

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    windowssysWindowsWin32UiAccessibilityUiaPatternRelease(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(hwnd.rawAddress.toCPointer<ByteVar>(), idobject, idchild, ppprovider.rawAddress.toCPointer<ByteVar>())

public actual fun uiaProviderFromIAccessible(paccessible: MutPtr, idchild: Int, dwflags: UInt, ppprovider: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(paccessible.rawAddress.toCPointer<ByteVar>(), idchild, dwflags, ppprovider.rawAddress.toCPointer<ByteVar>())

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: MutPtr, textrange: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(provider.rawAddress.toCPointer<ByteVar>(), textrange.rawAddress.toCPointer<ByteVar>())

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: MutPtr, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(pprovider.rawAddress.toCPointer<ByteVar>(), asynccontentloadedstate, percentcomplete)

public actual fun uiaRaiseAutomationEvent(pprovider: MutPtr, id: UiaEventId): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(pprovider.rawAddress.toCPointer<ByteVar>(), id)

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: MutPtr, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    0

public actual fun uiaRaiseChangesEvent(pprovider: MutPtr, eventidcount: Int, puiachanges: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(pprovider.rawAddress.toCPointer<ByteVar>(), eventidcount, puiachanges.rawAddress.toCPointer<ByteVar>())

public actual fun uiaRaiseNotificationEvent(provider: MutPtr, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(provider.rawAddress.toCPointer<ByteVar>(), notificationkind, notificationprocessing, displaystring.rawAddress.toCPointer<ByteVar>(), activityid.rawAddress.toCPointer<ByteVar>())

public actual fun uiaRaiseStructureChangedEvent(pprovider: MutPtr, structurechangetype: StructureChangeType, pruntimeid: MutPtr, cruntimeidlen: Int): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(pprovider.rawAddress.toCPointer<ByteVar>(), structurechangetype, pruntimeid.rawAddress.toCPointer<ByteVar>(), cruntimeidlen)

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: MutPtr, texteditchangetype: TextEditChangeType, pchangeddata: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(pprovider.rawAddress.toCPointer<ByteVar>(), texteditchangetype, pchangeddata.rawAddress.toCPointer<ByteVar>())

public actual fun uiaRegisterProviderCallback(pcallback: MutPtr) {
    windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(pcallback.rawAddress.toCPointer<ByteVar>())
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaRemoveEvent(hevent.rawAddress.toCPointer<ByteVar>())

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: MutPtr): Lresult =
    windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(hwnd.rawAddress.toCPointer<ByteVar>(), wparam, lparam, el.rawAddress.toCPointer<ByteVar>())

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    windowssysWindowsWin32UiAccessibilityUiaSetFocus(hnode.rawAddress.toCPointer<ByteVar>())

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    windowssysWindowsWin32UiAccessibilityUnhookWinEvent(hwineventhook.rawAddress.toCPointer<ByteVar>())

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(hwnd.rawAddress.toCPointer<ByteVar>(), pointertype)

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(hwnd.rawAddress.toCPointer<ByteVar>(), pointertype)

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    windowssysWindowsWin32UiAccessibilityValuePatternSetValue(hobj.rawAddress.toCPointer<ByteVar>(), pval.rawAddress.toCPointer<ByteVar>())

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun windowFromAccessibleObject(param0: MutPtr, phwnd: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(param0.rawAddress.toCPointer<ByteVar>(), phwnd.rawAddress.toCPointer<ByteVar>())

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    windowssysWindowsWin32UiAccessibilityWindowPatternClose(hobj.rawAddress.toCPointer<ByteVar>())

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(hobj.rawAddress.toCPointer<ByteVar>(), state)

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: MutPtr): Hresult =
    windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(hobj.rawAddress.toCPointer<ByteVar>(), milliseconds, presult.rawAddress.toCPointer<ByteVar>())
