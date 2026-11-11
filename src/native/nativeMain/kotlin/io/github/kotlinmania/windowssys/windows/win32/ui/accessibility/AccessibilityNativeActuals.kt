@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_accessibleChildren
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_createStdAccessibleObject
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_getRoleTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_getRoleTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_getStateTextA
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_getStateTextW
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_gridPatternGetItem
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_invokePatternInvoke
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_lresultFromObject
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_notifyWinEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_objectFromLresult
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_registerPointerInputTarget
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_scrollPatternScroll
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_setWinEventHook
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textPatternGetSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeAddToSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeClone
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeCompare
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeFindText
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeGetChildren
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeGetText
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeMove
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_textRangeSelect
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_togglePatternToggle
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_transformPatternMove
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_transformPatternResize
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_transformPatternRotate
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaAddEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaClientsAreListening
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaEventAddWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaFind
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetRootNode
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaLookupId
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaNavigate
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaNodeRelease
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaPatternRelease
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaRemoveEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaSetFocus
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_unhookWinEvent
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_valuePatternSetValue
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_windowPatternClose
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState
import io.github.kotlinmania.windowssys.windows.win32.ui.accessibility.cinterop.windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    0

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    windowssys_windows_win32_ui_accessibility_accSetRunningUtilityState(hwndapp?.value?.toCPointer<ByteVar>(), dwutilitystatemask, dwutilitystate)

public actual fun accessibleChildren(pacccontainer: COpaquePointer?, ichildstart: Int, cchildren: Int, rgvarchildren: COpaquePointer?, pcobtained: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_accessibleChildren(pacccontainer?.value?.toCPointer<ByteVar>(), ichildstart, cchildren, rgvarchildren?.value?.toCPointer<ByteVar>(), pcobtained?.value?.toCPointer<ByteVar>())

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_accessibleObjectFromEvent(hwnd?.value?.toCPointer<ByteVar>(), dwid, dwchildid, ppacc?.value?.toCPointer<ByteVar>(), pvarchild?.value?.toCPointer<ByteVar>())

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    0

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_accessibleObjectFromWindow(hwnd?.value?.toCPointer<ByteVar>(), dwid, riid?.value?.toCPointer<ByteVar>(), ppvobject?.value?.toCPointer<ByteVar>())

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_createStdAccessibleObject(hwnd?.value?.toCPointer<ByteVar>(), idobject, riid?.value?.toCPointer<ByteVar>(), ppvobject?.value?.toCPointer<ByteVar>())

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyA(hwnd?.value?.toCPointer<ByteVar>(), pclassname?.value?.toCPointer<ByteVar>(), idobject, riid?.value?.toCPointer<ByteVar>(), ppvobject?.value?.toCPointer<ByteVar>())

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: COpaquePointer?, ppvobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_createStdAccessibleProxyW(hwnd?.value?.toCPointer<ByteVar>(), pclassname?.value?.toCPointer<ByteVar>(), idobject, riid?.value?.toCPointer<ByteVar>(), ppvobject?.value?.toCPointer<ByteVar>())

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    windowssys_windows_win32_ui_accessibility_dockPatternSetDockPosition(hobj?.value?.toCPointer<ByteVar>(), dockposition)

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_expandCollapsePatternCollapse(hobj?.value?.toCPointer<ByteVar>())

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_expandCollapsePatternExpand(hobj?.value?.toCPointer<ByteVar>())

public actual fun getOleaccVersionInfo(pver: COpaquePointer?, pbuild: COpaquePointer?) {
    windowssys_windows_win32_ui_accessibility_getOleaccVersionInfo(pver?.value?.toCPointer<ByteVar>(), pbuild?.value?.toCPointer<ByteVar>())
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    windowssys_windows_win32_ui_accessibility_getRoleTextA(lrole, lpszrole?.value?.toCPointer<ByteVar>(), cchrolemax)

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    windowssys_windows_win32_ui_accessibility_getRoleTextW(lrole, lpszrole?.value?.toCPointer<ByteVar>(), cchrolemax)

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    windowssys_windows_win32_ui_accessibility_getStateTextA(lstatebit, lpszstate?.value?.toCPointer<ByteVar>(), cchstate)

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    windowssys_windows_win32_ui_accessibility_getStateTextW(lstatebit, lpszstate?.value?.toCPointer<ByteVar>(), cchstate)

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_gridPatternGetItem(hobj?.value?.toCPointer<ByteVar>(), row, column, presult?.value?.toCPointer<ByteVar>())

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_invokePatternInvoke(hobj?.value?.toCPointer<ByteVar>())

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    windowssys_windows_win32_ui_accessibility_isWinEventHookInstalled(event)

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: COpaquePointer?): Hresult =
    0

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternDoDefaultAction(hobj?.value?.toCPointer<ByteVar>())

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternGetIaccessible(hobj?.value?.toCPointer<ByteVar>(), paccessible?.value?.toCPointer<ByteVar>())

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSelect(hobj?.value?.toCPointer<ByteVar>(), flagsselect)

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    windowssys_windows_win32_ui_accessibility_legacyIaccessiblePatternSetValue(hobj?.value?.toCPointer<ByteVar>(), szvalue?.value?.toCPointer<ByteVar>())

public actual fun lresultFromObject(riid: COpaquePointer?, wparam: Wparam, punk: COpaquePointer?): Lresult =
    windowssys_windows_win32_ui_accessibility_lresultFromObject(riid?.value?.toCPointer<ByteVar>(), wparam, punk?.value?.toCPointer<ByteVar>())

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_multipleViewPatternGetViewName(hobj?.value?.toCPointer<ByteVar>(), viewid, ppstr?.value?.toCPointer<ByteVar>())

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    windowssys_windows_win32_ui_accessibility_multipleViewPatternSetCurrentView(hobj?.value?.toCPointer<ByteVar>(), viewid)

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    windowssys_windows_win32_ui_accessibility_notifyWinEvent(event, hwnd?.value?.toCPointer<ByteVar>(), idobject, idchild)
}

public actual fun objectFromLresult(lresult: Lresult, riid: COpaquePointer?, wparam: Wparam, ppvobject: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_objectFromLresult(lresult, riid?.value?.toCPointer<ByteVar>(), wparam, ppvobject?.value?.toCPointer<ByteVar>())

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    windowssys_windows_win32_ui_accessibility_rangeValuePatternSetValue(hobj?.value?.toCPointer<ByteVar>(), value)

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    windowssys_windows_win32_ui_accessibility_registerPointerInputTarget(hwnd?.value?.toCPointer<ByteVar>(), pointertype)

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    windowssys_windows_win32_ui_accessibility_registerPointerInputTargetEx(hwnd?.value?.toCPointer<ByteVar>(), pointertype, fobserve)

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_scrollItemPatternScrollIntoView(hobj?.value?.toCPointer<ByteVar>())

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    windowssys_windows_win32_ui_accessibility_scrollPatternScroll(hobj?.value?.toCPointer<ByteVar>(), horizontalamount, verticalamount)

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    windowssys_windows_win32_ui_accessibility_scrollPatternSetScrollPercent(hobj?.value?.toCPointer<ByteVar>(), horizontalpercent, verticalpercent)

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_selectionItemPatternAddToSelection(hobj?.value?.toCPointer<ByteVar>())

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_selectionItemPatternRemoveFromSelection(hobj?.value?.toCPointer<ByteVar>())

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_selectionItemPatternSelect(hobj?.value?.toCPointer<ByteVar>())

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    windowssys_windows_win32_ui_accessibility_setWinEventHook(eventmin, eventmax, hmodwineventproc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), idprocess, idthread, dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_synchronizedInputPatternCancel(hobj?.value?.toCPointer<ByteVar>())

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    windowssys_windows_win32_ui_accessibility_synchronizedInputPatternStartListening(hobj?.value?.toCPointer<ByteVar>(), inputtype)

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textPatternGetSelection(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textPatternGetVisibleRanges(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textPatternRangeFromChild(hobj?.value?.toCPointer<ByteVar>(), hnodechild?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: COpaquePointer?): Hresult =
    0

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textPatternGetDocumentRange(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textPatternGetSupportedTextSelection(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeAddToSelection(hobj?.value?.toCPointer<ByteVar>())

public actual fun textRangeClone(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeClone(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeCompare(hobj?.value?.toCPointer<ByteVar>(), range?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeCompareEndpoints(hobj?.value?.toCPointer<ByteVar>(), endpoint, targetrange?.value?.toCPointer<ByteVar>(), targetendpoint, pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeExpandToEnclosingUnit(hobj?.value?.toCPointer<ByteVar>(), unit)

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: COpaquePointer?): Hresult =
    0

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeFindText(hobj?.value?.toCPointer<ByteVar>(), text?.value?.toCPointer<ByteVar>(), backward, ignorecase, pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeGetAttributeValue(hobj?.value?.toCPointer<ByteVar>(), attributeid, pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeGetBoundingRectangles(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeGetChildren(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeGetEnclosingElement(hobj?.value?.toCPointer<ByteVar>(), pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeGetText(hobj?.value?.toCPointer<ByteVar>(), maxlength, pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeMove(hobj?.value?.toCPointer<ByteVar>(), unit, count, pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByRange(hobj?.value?.toCPointer<ByteVar>(), endpoint, targetrange?.value?.toCPointer<ByteVar>(), targetendpoint)

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeMoveEndpointByUnit(hobj?.value?.toCPointer<ByteVar>(), endpoint, unit, count, pretval?.value?.toCPointer<ByteVar>())

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeRemoveFromSelection(hobj?.value?.toCPointer<ByteVar>())

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeScrollIntoView(hobj?.value?.toCPointer<ByteVar>(), aligntotop)

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    windowssys_windows_win32_ui_accessibility_textRangeSelect(hobj?.value?.toCPointer<ByteVar>())

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_togglePatternToggle(hobj?.value?.toCPointer<ByteVar>())

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    windowssys_windows_win32_ui_accessibility_transformPatternMove(hobj?.value?.toCPointer<ByteVar>(), x, y)

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    windowssys_windows_win32_ui_accessibility_transformPatternResize(hobj?.value?.toCPointer<ByteVar>(), width, height)

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    windowssys_windows_win32_ui_accessibility_transformPatternRotate(hobj?.value?.toCPointer<ByteVar>(), degrees)

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: COpaquePointer?, scope: TreeScope, pproperties: COpaquePointer?, cproperties: Int, prequest: COpaquePointer?, phevent: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaAddEvent(hnode?.value?.toCPointer<ByteVar>(), eventid, pcallback?.value?.toCPointer<ByteVar>(), scope, pproperties?.value?.toCPointer<ByteVar>(), cproperties, prequest?.value?.toCPointer<ByteVar>(), phevent?.value?.toCPointer<ByteVar>())

public actual fun uiaClientsAreListening(): Bool =
    windowssys_windows_win32_ui_accessibility_uiaClientsAreListening()

public actual fun uiaDisconnectAllProviders(): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaDisconnectAllProviders()

public actual fun uiaDisconnectProvider(pprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaDisconnectProvider(pprovider?.value?.toCPointer<ByteVar>())

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaEventAddWindow(hevent?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>())

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaEventRemoveWindow(hevent?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>())

public actual fun uiaFind(hnode: Huianode, pparams: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, ppoffsets: COpaquePointer?, pptreestructures: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaFind(hnode?.value?.toCPointer<ByteVar>(), pparams?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), pprequesteddata?.value?.toCPointer<ByteVar>(), ppoffsets?.value?.toCPointer<ByteVar>(), pptreestructures?.value?.toCPointer<ByteVar>())

public actual fun uiaGetErrorDescription(pdescription: COpaquePointer?): Bool =
    windowssys_windows_win32_ui_accessibility_uiaGetErrorDescription(pdescription?.value?.toCPointer<ByteVar>())

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetPatternProvider(hnode?.value?.toCPointer<ByteVar>(), patternid, phobj?.value?.toCPointer<ByteVar>())

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetPropertyValue(hnode?.value?.toCPointer<ByteVar>(), propertyid, pvalue?.value?.toCPointer<ByteVar>())

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetReservedMixedAttributeValue(punkmixedattributevalue?.value?.toCPointer<ByteVar>())

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetReservedNotSupportedValue(punknotsupportedvalue?.value?.toCPointer<ByteVar>())

public actual fun uiaGetRootNode(phnode: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetRootNode(phnode?.value?.toCPointer<ByteVar>())

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetRuntimeId(hnode?.value?.toCPointer<ByteVar>(), pruntimeid?.value?.toCPointer<ByteVar>())

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: COpaquePointer?, normalizestate: NormalizeState, pnormalizecondition: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaGetUpdatedCache(hnode?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), normalizestate, pnormalizecondition?.value?.toCPointer<ByteVar>(), pprequesteddata?.value?.toCPointer<ByteVar>(), pptreestructure?.value?.toCPointer<ByteVar>())

public actual fun uiaHPatternObjectFromVariant(pvar: COpaquePointer?, phobj: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaHPatternObjectFromVariant(pvar?.value?.toCPointer<ByteVar>(), phobj?.value?.toCPointer<ByteVar>())

public actual fun uiaHTextRangeFromVariant(pvar: COpaquePointer?, phtextrange: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaHTextRangeFromVariant(pvar?.value?.toCPointer<ByteVar>(), phtextrange?.value?.toCPointer<ByteVar>())

public actual fun uiaHUiaNodeFromVariant(pvar: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaHUiaNodeFromVariant(pvar?.value?.toCPointer<ByteVar>(), phnode?.value?.toCPointer<ByteVar>())

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    windowssys_windows_win32_ui_accessibility_uiaHasServerSideProvider(hwnd?.value?.toCPointer<ByteVar>())

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaHostProviderFromHwnd(hwnd?.value?.toCPointer<ByteVar>(), ppprovider?.value?.toCPointer<ByteVar>())

public actual fun uiaIAccessibleFromProvider(pprovider: COpaquePointer?, dwflags: UInt, ppaccessible: COpaquePointer?, pvarchild: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaIAccessibleFromProvider(pprovider?.value?.toCPointer<ByteVar>(), dwflags, ppaccessible?.value?.toCPointer<ByteVar>(), pvarchild?.value?.toCPointer<ByteVar>())

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: COpaquePointer?): Int =
    windowssys_windows_win32_ui_accessibility_uiaLookupId(type, pguid?.value?.toCPointer<ByteVar>())

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: COpaquePointer?, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaNavigate(hnode?.value?.toCPointer<ByteVar>(), direction, pcondition?.value?.toCPointer<ByteVar>(), prequest?.value?.toCPointer<ByteVar>(), pprequesteddata?.value?.toCPointer<ByteVar>(), pptreestructure?.value?.toCPointer<ByteVar>())

public actual fun uiaNodeFromFocus(prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaNodeFromFocus(prequest?.value?.toCPointer<ByteVar>(), pprequesteddata?.value?.toCPointer<ByteVar>(), pptreestructure?.value?.toCPointer<ByteVar>())

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaNodeFromHandle(hwnd?.value?.toCPointer<ByteVar>(), phnode?.value?.toCPointer<ByteVar>())

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: COpaquePointer?, pprequesteddata: COpaquePointer?, pptreestructure: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaNodeFromPoint(x, y, prequest?.value?.toCPointer<ByteVar>(), pprequesteddata?.value?.toCPointer<ByteVar>(), pptreestructure?.value?.toCPointer<ByteVar>())

public actual fun uiaNodeFromProvider(pprovider: COpaquePointer?, phnode: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaNodeFromProvider(pprovider?.value?.toCPointer<ByteVar>(), phnode?.value?.toCPointer<ByteVar>())

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    windowssys_windows_win32_ui_accessibility_uiaNodeRelease(hnode?.value?.toCPointer<ByteVar>())

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    windowssys_windows_win32_ui_accessibility_uiaPatternRelease(hobj?.value?.toCPointer<ByteVar>())

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaProviderForNonClient(hwnd?.value?.toCPointer<ByteVar>(), idobject, idchild, ppprovider?.value?.toCPointer<ByteVar>())

public actual fun uiaProviderFromIAccessible(paccessible: COpaquePointer?, idchild: Int, dwflags: UInt, ppprovider: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaProviderFromIAccessible(paccessible?.value?.toCPointer<ByteVar>(), idchild, dwflags, ppprovider?.value?.toCPointer<ByteVar>())

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: COpaquePointer?, textrange: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseActiveTextPositionChangedEvent(provider?.value?.toCPointer<ByteVar>(), textrange?.value?.toCPointer<ByteVar>())

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: COpaquePointer?, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseAsyncContentLoadedEvent(pprovider?.value?.toCPointer<ByteVar>(), asynccontentloadedstate, percentcomplete)

public actual fun uiaRaiseAutomationEvent(pprovider: COpaquePointer?, id: UiaEventId): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseAutomationEvent(pprovider?.value?.toCPointer<ByteVar>(), id)

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: COpaquePointer?, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    0

public actual fun uiaRaiseChangesEvent(pprovider: COpaquePointer?, eventidcount: Int, puiachanges: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseChangesEvent(pprovider?.value?.toCPointer<ByteVar>(), eventidcount, puiachanges?.value?.toCPointer<ByteVar>())

public actual fun uiaRaiseNotificationEvent(provider: COpaquePointer?, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseNotificationEvent(provider?.value?.toCPointer<ByteVar>(), notificationkind, notificationprocessing, displaystring?.value?.toCPointer<ByteVar>(), activityid?.value?.toCPointer<ByteVar>())

public actual fun uiaRaiseStructureChangedEvent(pprovider: COpaquePointer?, structurechangetype: StructureChangeType, pruntimeid: COpaquePointer?, cruntimeidlen: Int): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseStructureChangedEvent(pprovider?.value?.toCPointer<ByteVar>(), structurechangetype, pruntimeid?.value?.toCPointer<ByteVar>(), cruntimeidlen)

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: COpaquePointer?, texteditchangetype: TextEditChangeType, pchangeddata: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRaiseTextEditTextChangedEvent(pprovider?.value?.toCPointer<ByteVar>(), texteditchangetype, pchangeddata?.value?.toCPointer<ByteVar>())

public actual fun uiaRegisterProviderCallback(pcallback: COpaquePointer?) {
    windowssys_windows_win32_ui_accessibility_uiaRegisterProviderCallback(pcallback?.value?.toCPointer<ByteVar>())
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaRemoveEvent(hevent?.value?.toCPointer<ByteVar>())

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: COpaquePointer?): Lresult =
    windowssys_windows_win32_ui_accessibility_uiaReturnRawElementProvider(hwnd?.value?.toCPointer<ByteVar>(), wparam, lparam, el?.value?.toCPointer<ByteVar>())

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    windowssys_windows_win32_ui_accessibility_uiaSetFocus(hnode?.value?.toCPointer<ByteVar>())

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    windowssys_windows_win32_ui_accessibility_uiaTextRangeRelease(hobj?.value?.toCPointer<ByteVar>())

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    windowssys_windows_win32_ui_accessibility_unhookWinEvent(hwineventhook?.value?.toCPointer<ByteVar>())

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    windowssys_windows_win32_ui_accessibility_unregisterPointerInputTarget(hwnd?.value?.toCPointer<ByteVar>(), pointertype)

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    windowssys_windows_win32_ui_accessibility_unregisterPointerInputTargetEx(hwnd?.value?.toCPointer<ByteVar>(), pointertype)

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    windowssys_windows_win32_ui_accessibility_valuePatternSetValue(hobj?.value?.toCPointer<ByteVar>(), pval?.value?.toCPointer<ByteVar>())

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_virtualizedItemPatternRealize(hobj?.value?.toCPointer<ByteVar>())

public actual fun windowFromAccessibleObject(param0: COpaquePointer?, phwnd: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_windowFromAccessibleObject(param0?.value?.toCPointer<ByteVar>(), phwnd?.value?.toCPointer<ByteVar>())

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    windowssys_windows_win32_ui_accessibility_windowPatternClose(hobj?.value?.toCPointer<ByteVar>())

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    windowssys_windows_win32_ui_accessibility_windowPatternSetWindowVisualState(hobj?.value?.toCPointer<ByteVar>(), state)

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: COpaquePointer?): Hresult =
    windowssys_windows_win32_ui_accessibility_windowPatternWaitForInputIdle(hobj?.value?.toCPointer<ByteVar>(), milliseconds, presult?.value?.toCPointer<ByteVar>())
