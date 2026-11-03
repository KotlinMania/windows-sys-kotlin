package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.BSTR
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(hwineventhook: HWINEVENTHOOK, event: UInt, hwnd: Foundation.HWND, idobject: Int, idchild: Int, ideventthread: UInt, dwmseventtime: UInt)
}

public fun AccNotifyTouchInteraction(hwndapp: Foundation.HWND, hwndtarget: Foundation.HWND, pttarget: Foundation.POINT): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "AccNotifyTouchInteraction", longArrayOf(Win32DynamicFfi.objectSlot(hwndapp), Win32DynamicFfi.objectSlot(hwndtarget), Win32DynamicFfi.objectSlot(pttarget))).toInt()
}

public fun AccSetRunningUtilityState(hwndapp: Foundation.HWND, dwutilitystatemask: UInt, dwutilitystate: ACC_UTILITY_STATE_FLAGS): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "AccSetRunningUtilityState", longArrayOf(Win32DynamicFfi.objectSlot(hwndapp), dwutilitystatemask.toLong(), dwutilitystate.toLong())).toInt()
}

public fun AccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "AccessibleChildren", longArrayOf(pacccontainer, ichildstart.toLong(), cchildren.toLong(), rgvarchildren, pcobtained)).toInt()
}

public fun AccessibleObjectFromEvent(hwnd: Foundation.HWND, dwid: UInt, dwchildid: UInt, ppacc: Long, pvarchild: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "AccessibleObjectFromEvent", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwid.toLong(), dwchildid.toLong(), ppacc, pvarchild)).toInt()
}

public fun AccessibleObjectFromPoint(ptscreen: Foundation.POINT, ppacc: Long, pvarchild: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "AccessibleObjectFromPoint", longArrayOf(Win32DynamicFfi.objectSlot(ptscreen), ppacc, pvarchild)).toInt()
}

public fun AccessibleObjectFromWindow(hwnd: Foundation.HWND, dwid: UInt, riid: Long, ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "AccessibleObjectFromWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), dwid.toLong(), riid, ppvobject)).toInt()
}

public fun CreateStdAccessibleObject(hwnd: Foundation.HWND, idobject: Int, riid: Long, ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "CreateStdAccessibleObject", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), idobject.toLong(), riid, ppvobject)).toInt()
}

public fun CreateStdAccessibleProxyA(hwnd: Foundation.HWND, pclassname: PCSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "CreateStdAccessibleProxyA", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pclassname, idobject.toLong(), riid, ppvobject)).toInt()
}

public fun CreateStdAccessibleProxyW(hwnd: Foundation.HWND, pclassname: PCWSTR, idobject: Int, riid: Long, ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "CreateStdAccessibleProxyW", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pclassname, idobject.toLong(), riid, ppvobject)).toInt()
}

public fun DockPattern_SetDockPosition(hobj: HUIAPATTERNOBJECT, dockposition: DockPosition): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "DockPattern_SetDockPosition", longArrayOf(hobj, dockposition.toLong())).toInt()
}

public fun ExpandCollapsePattern_Collapse(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "ExpandCollapsePattern_Collapse", longArrayOf(hobj)).toInt()
}

public fun ExpandCollapsePattern_Expand(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "ExpandCollapsePattern_Expand", longArrayOf(hobj)).toInt()
}

public fun GetOleaccVersionInfo(pver: Long, pbuild: Long) {
    Win32DynamicFfi.invoke("oleacc.dll", "GetOleaccVersionInfo", longArrayOf(pver, pbuild))
}

public fun GetRoleTextA(lrole: UInt, lpszrole: PSTR, cchrolemax: UInt): UInt {
    return Win32DynamicFfi.invoke("oleacc.dll", "GetRoleTextA", longArrayOf(lrole.toLong(), lpszrole, cchrolemax.toLong())).toUInt()
}

public fun GetRoleTextW(lrole: UInt, lpszrole: PWSTR, cchrolemax: UInt): UInt {
    return Win32DynamicFfi.invoke("oleacc.dll", "GetRoleTextW", longArrayOf(lrole.toLong(), lpszrole, cchrolemax.toLong())).toUInt()
}

public fun GetStateTextA(lstatebit: UInt, lpszstate: PSTR, cchstate: UInt): UInt {
    return Win32DynamicFfi.invoke("oleacc.dll", "GetStateTextA", longArrayOf(lstatebit.toLong(), lpszstate, cchstate.toLong())).toUInt()
}

public fun GetStateTextW(lstatebit: UInt, lpszstate: PWSTR, cchstate: UInt): UInt {
    return Win32DynamicFfi.invoke("oleacc.dll", "GetStateTextW", longArrayOf(lstatebit.toLong(), lpszstate, cchstate.toLong())).toUInt()
}

public fun GridPattern_GetItem(hobj: HUIAPATTERNOBJECT, row: Int, column: Int, presult: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "GridPattern_GetItem", longArrayOf(hobj, row.toLong(), column.toLong(), presult)).toInt()
}

public fun InvokePattern_Invoke(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "InvokePattern_Invoke", longArrayOf(hobj)).toInt()
}

public fun IsWinEventHookInstalled(event: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsWinEventHookInstalled", longArrayOf(event.toLong())).toInt()
}

public fun ItemContainerPattern_FindItemByProperty(hobj: HUIAPATTERNOBJECT, hnodestartafter: HUIANODE, propertyid: Int, value: System.Variant.VARIANT, pfound: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "ItemContainerPattern_FindItemByProperty", longArrayOf(hobj, hnodestartafter, propertyid.toLong(), Win32DynamicFfi.objectSlot(value), pfound)).toInt()
}

public fun LegacyIAccessiblePattern_DoDefaultAction(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "LegacyIAccessiblePattern_DoDefaultAction", longArrayOf(hobj)).toInt()
}

public fun LegacyIAccessiblePattern_GetIAccessible(hobj: HUIAPATTERNOBJECT, paccessible: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "LegacyIAccessiblePattern_GetIAccessible", longArrayOf(hobj, paccessible)).toInt()
}

public fun LegacyIAccessiblePattern_Select(hobj: HUIAPATTERNOBJECT, flagsselect: Int): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "LegacyIAccessiblePattern_Select", longArrayOf(hobj, flagsselect.toLong())).toInt()
}

public fun LegacyIAccessiblePattern_SetValue(hobj: HUIAPATTERNOBJECT, szvalue: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "LegacyIAccessiblePattern_SetValue", longArrayOf(hobj, szvalue)).toInt()
}

public fun LresultFromObject(riid: Long, wparam: Foundation.WPARAM, punk: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("oleacc.dll", "LresultFromObject", longArrayOf(riid, Win32DynamicFfi.objectSlot(wparam), punk))
    return Foundation.LRESULT()
}

public fun MultipleViewPattern_GetViewName(hobj: HUIAPATTERNOBJECT, viewid: Int, ppstr: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "MultipleViewPattern_GetViewName", longArrayOf(hobj, viewid.toLong(), ppstr)).toInt()
}

public fun MultipleViewPattern_SetCurrentView(hobj: HUIAPATTERNOBJECT, viewid: Int): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "MultipleViewPattern_SetCurrentView", longArrayOf(hobj, viewid.toLong())).toInt()
}

public fun NotifyWinEvent(event: UInt, hwnd: Foundation.HWND, idobject: Int, idchild: Int) {
    Win32DynamicFfi.invoke("user32.dll", "NotifyWinEvent", longArrayOf(event.toLong(), Win32DynamicFfi.objectSlot(hwnd), idobject.toLong(), idchild.toLong()))
}

public fun ObjectFromLresult(lresult: Foundation.LRESULT, riid: Long, wparam: Foundation.WPARAM, ppvobject: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "ObjectFromLresult", longArrayOf(Win32DynamicFfi.objectSlot(lresult), riid, Win32DynamicFfi.objectSlot(wparam), ppvobject)).toInt()
}

public fun RangeValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, value: Double): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "RangeValuePattern_SetValue", 8, false, longArrayOf(hobj, value.toRawBits())).toLong().toInt()
}

public fun RegisterPointerInputTarget(hwnd: Foundation.HWND, pointertype: WindowsAndMessaging.POINTER_INPUT_TYPE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterPointerInputTarget", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(pointertype))).toInt()
}

public fun RegisterPointerInputTargetEx(hwnd: Foundation.HWND, pointertype: WindowsAndMessaging.POINTER_INPUT_TYPE, fobserve: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RegisterPointerInputTargetEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(pointertype), fobserve.toLong())).toInt()
}

public fun ScrollItemPattern_ScrollIntoView(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "ScrollItemPattern_ScrollIntoView", longArrayOf(hobj)).toInt()
}

public fun ScrollPattern_Scroll(hobj: HUIAPATTERNOBJECT, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "ScrollPattern_Scroll", longArrayOf(hobj, horizontalamount.toLong(), verticalamount.toLong())).toInt()
}

public fun ScrollPattern_SetScrollPercent(hobj: HUIAPATTERNOBJECT, horizontalpercent: Double, verticalpercent: Double): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "ScrollPattern_SetScrollPercent", 40, false, longArrayOf(hobj, horizontalpercent.toRawBits(), verticalpercent.toRawBits())).toLong().toInt()
}

public fun SelectionItemPattern_AddToSelection(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "SelectionItemPattern_AddToSelection", longArrayOf(hobj)).toInt()
}

public fun SelectionItemPattern_RemoveFromSelection(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "SelectionItemPattern_RemoveFromSelection", longArrayOf(hobj)).toInt()
}

public fun SelectionItemPattern_Select(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "SelectionItemPattern_Select", longArrayOf(hobj)).toInt()
}

public fun SetWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Foundation.HMODULE, pfnwineventproc: WINEVENTPROC, idprocess: UInt, idthread: UInt, dwflags: UInt): HWINEVENTHOOK {
    return Win32DynamicFfi.invoke("user32.dll", "SetWinEventHook", longArrayOf(eventmin.toLong(), eventmax.toLong(), Win32DynamicFfi.objectSlot(hmodwineventproc), Win32DynamicFfi.objectSlot(pfnwineventproc), idprocess.toLong(), idthread.toLong(), dwflags.toLong()))
}

public fun SynchronizedInputPattern_Cancel(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "SynchronizedInputPattern_Cancel", longArrayOf(hobj)).toInt()
}

public fun SynchronizedInputPattern_StartListening(hobj: HUIAPATTERNOBJECT, inputtype: SynchronizedInputType): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "SynchronizedInputPattern_StartListening", longArrayOf(hobj, inputtype.toLong())).toInt()
}

public fun TextPattern_GetSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextPattern_GetSelection", longArrayOf(hobj, pretval)).toInt()
}

public fun TextPattern_GetVisibleRanges(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextPattern_GetVisibleRanges", longArrayOf(hobj, pretval)).toInt()
}

public fun TextPattern_RangeFromChild(hobj: HUIAPATTERNOBJECT, hnodechild: HUIANODE, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextPattern_RangeFromChild", longArrayOf(hobj, hnodechild, pretval)).toInt()
}

public fun TextPattern_RangeFromPoint(hobj: HUIAPATTERNOBJECT, point: UiaPoint, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextPattern_RangeFromPoint", longArrayOf(hobj, Win32DynamicFfi.objectSlot(point), pretval)).toInt()
}

public fun TextPattern_get_DocumentRange(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextPattern_get_DocumentRange", longArrayOf(hobj, pretval)).toInt()
}

public fun TextPattern_get_SupportedTextSelection(hobj: HUIAPATTERNOBJECT, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextPattern_get_SupportedTextSelection", longArrayOf(hobj, pretval)).toInt()
}

public fun TextRange_AddToSelection(hobj: HUIATEXTRANGE): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_AddToSelection", longArrayOf(hobj)).toInt()
}

public fun TextRange_Clone(hobj: HUIATEXTRANGE, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_Clone", longArrayOf(hobj, pretval)).toInt()
}

public fun TextRange_Compare(hobj: HUIATEXTRANGE, range: HUIATEXTRANGE, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_Compare", longArrayOf(hobj, range, pretval)).toInt()
}

public fun TextRange_CompareEndpoints(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_CompareEndpoints", longArrayOf(hobj, endpoint.toLong(), targetrange, targetendpoint.toLong(), pretval)).toInt()
}

public fun TextRange_ExpandToEnclosingUnit(hobj: HUIATEXTRANGE, unit: TextUnit): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_ExpandToEnclosingUnit", longArrayOf(hobj, unit.toLong())).toInt()
}

public fun TextRange_FindAttribute(hobj: HUIATEXTRANGE, attributeid: Int, value: System.Variant.VARIANT, backward: BOOL, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_FindAttribute", longArrayOf(hobj, attributeid.toLong(), Win32DynamicFfi.objectSlot(value), backward.toLong(), pretval)).toInt()
}

public fun TextRange_FindText(hobj: HUIATEXTRANGE, text: BSTR, backward: BOOL, ignorecase: BOOL, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_FindText", longArrayOf(hobj, text, backward.toLong(), ignorecase.toLong(), pretval)).toInt()
}

public fun TextRange_GetAttributeValue(hobj: HUIATEXTRANGE, attributeid: Int, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_GetAttributeValue", longArrayOf(hobj, attributeid.toLong(), pretval)).toInt()
}

public fun TextRange_GetBoundingRectangles(hobj: HUIATEXTRANGE, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_GetBoundingRectangles", longArrayOf(hobj, pretval)).toInt()
}

public fun TextRange_GetChildren(hobj: HUIATEXTRANGE, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_GetChildren", longArrayOf(hobj, pretval)).toInt()
}

public fun TextRange_GetEnclosingElement(hobj: HUIATEXTRANGE, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_GetEnclosingElement", longArrayOf(hobj, pretval)).toInt()
}

public fun TextRange_GetText(hobj: HUIATEXTRANGE, maxlength: Int, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_GetText", longArrayOf(hobj, maxlength.toLong(), pretval)).toInt()
}

public fun TextRange_Move(hobj: HUIATEXTRANGE, unit: TextUnit, count: Int, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_Move", longArrayOf(hobj, unit.toLong(), count.toLong(), pretval)).toInt()
}

public fun TextRange_MoveEndpointByRange(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, targetrange: HUIATEXTRANGE, targetendpoint: TextPatternRangeEndpoint): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_MoveEndpointByRange", longArrayOf(hobj, endpoint.toLong(), targetrange, targetendpoint.toLong())).toInt()
}

public fun TextRange_MoveEndpointByUnit(hobj: HUIATEXTRANGE, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_MoveEndpointByUnit", longArrayOf(hobj, endpoint.toLong(), unit.toLong(), count.toLong(), pretval)).toInt()
}

public fun TextRange_RemoveFromSelection(hobj: HUIATEXTRANGE): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_RemoveFromSelection", longArrayOf(hobj)).toInt()
}

public fun TextRange_ScrollIntoView(hobj: HUIATEXTRANGE, aligntotop: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_ScrollIntoView", longArrayOf(hobj, aligntotop.toLong())).toInt()
}

public fun TextRange_Select(hobj: HUIATEXTRANGE): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TextRange_Select", longArrayOf(hobj)).toInt()
}

public fun TogglePattern_Toggle(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "TogglePattern_Toggle", longArrayOf(hobj)).toInt()
}

public fun TransformPattern_Move(hobj: HUIAPATTERNOBJECT, x: Double, y: Double): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "TransformPattern_Move", 40, false, longArrayOf(hobj, x.toRawBits(), y.toRawBits())).toLong().toInt()
}

public fun TransformPattern_Resize(hobj: HUIAPATTERNOBJECT, width: Double, height: Double): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "TransformPattern_Resize", 40, false, longArrayOf(hobj, width.toRawBits(), height.toRawBits())).toLong().toInt()
}

public fun TransformPattern_Rotate(hobj: HUIAPATTERNOBJECT, degrees: Double): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "TransformPattern_Rotate", 8, false, longArrayOf(hobj, degrees.toRawBits())).toLong().toInt()
}

public fun UiaAddEvent(hnode: HUIANODE, eventid: Int, pcallback: Long, scope: TreeScope, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaAddEvent", longArrayOf(hnode, eventid.toLong(), pcallback, scope.toLong(), pproperties, cproperties.toLong(), prequest, phevent)).toInt()
}

public fun UiaClientsAreListening(): BOOL {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaClientsAreListening", longArrayOf()).toInt()
}

public fun UiaDisconnectAllProviders(): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaDisconnectAllProviders", longArrayOf()).toInt()
}

public fun UiaDisconnectProvider(pprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaDisconnectProvider", longArrayOf(pprovider)).toInt()
}

public fun UiaEventAddWindow(hevent: HUIAEVENT, hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaEventAddWindow", longArrayOf(hevent, Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun UiaEventRemoveWindow(hevent: HUIAEVENT, hwnd: Foundation.HWND): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaEventRemoveWindow", longArrayOf(hevent, Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun UiaFind(hnode: HUIANODE, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaFind", longArrayOf(hnode, pparams, prequest, pprequesteddata, ppoffsets, pptreestructures)).toInt()
}

public fun UiaGetErrorDescription(pdescription: Long): BOOL {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetErrorDescription", longArrayOf(pdescription)).toInt()
}

public fun UiaGetPatternProvider(hnode: HUIANODE, patternid: Int, phobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetPatternProvider", longArrayOf(hnode, patternid.toLong(), phobj)).toInt()
}

public fun UiaGetPropertyValue(hnode: HUIANODE, propertyid: Int, pvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetPropertyValue", longArrayOf(hnode, propertyid.toLong(), pvalue)).toInt()
}

public fun UiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetReservedMixedAttributeValue", longArrayOf(punkmixedattributevalue)).toInt()
}

public fun UiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetReservedNotSupportedValue", longArrayOf(punknotsupportedvalue)).toInt()
}

public fun UiaGetRootNode(phnode: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetRootNode", longArrayOf(phnode)).toInt()
}

public fun UiaGetRuntimeId(hnode: HUIANODE, pruntimeid: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetRuntimeId", longArrayOf(hnode, pruntimeid)).toInt()
}

public fun UiaGetUpdatedCache(hnode: HUIANODE, prequest: Long, normalizestate: NormalizeState, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaGetUpdatedCache", longArrayOf(hnode, prequest, normalizestate.toLong(), pnormalizecondition, pprequesteddata, pptreestructure)).toInt()
}

public fun UiaHPatternObjectFromVariant(pvar: Long, phobj: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaHPatternObjectFromVariant", longArrayOf(pvar, phobj)).toInt()
}

public fun UiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaHTextRangeFromVariant", longArrayOf(pvar, phtextrange)).toInt()
}

public fun UiaHUiaNodeFromVariant(pvar: Long, phnode: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaHUiaNodeFromVariant", longArrayOf(pvar, phnode)).toInt()
}

public fun UiaHasServerSideProvider(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaHasServerSideProvider", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun UiaHostProviderFromHwnd(hwnd: Foundation.HWND, ppprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaHostProviderFromHwnd", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), ppprovider)).toInt()
}

public fun UiaIAccessibleFromProvider(pprovider: Long, dwflags: UInt, ppaccessible: Long, pvarchild: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaIAccessibleFromProvider", longArrayOf(pprovider, dwflags.toLong(), ppaccessible, pvarchild)).toInt()
}

public fun UiaLookupId(type: AutomationIdentifierType, pguid: Long): Int {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaLookupId", longArrayOf(type.toLong(), pguid)).toInt()
}

public fun UiaNavigate(hnode: HUIANODE, direction: NavigateDirection, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaNavigate", longArrayOf(hnode, direction.toLong(), pcondition, prequest, pprequesteddata, pptreestructure)).toInt()
}

public fun UiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaNodeFromFocus", longArrayOf(prequest, pprequesteddata, pptreestructure)).toInt()
}

public fun UiaNodeFromHandle(hwnd: Foundation.HWND, phnode: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaNodeFromHandle", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), phnode)).toInt()
}

public fun UiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "UiaNodeFromPoint", 10, false, longArrayOf(x.toRawBits(), y.toRawBits(), prequest, pprequesteddata, pptreestructure)).toLong().toInt()
}

public fun UiaNodeFromProvider(pprovider: Long, phnode: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaNodeFromProvider", longArrayOf(pprovider, phnode)).toInt()
}

public fun UiaNodeRelease(hnode: HUIANODE): BOOL {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaNodeRelease", longArrayOf(hnode)).toInt()
}

public fun UiaPatternRelease(hobj: HUIAPATTERNOBJECT): BOOL {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaPatternRelease", longArrayOf(hobj)).toInt()
}

public fun UiaProviderForNonClient(hwnd: Foundation.HWND, idobject: Int, idchild: Int, ppprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaProviderForNonClient", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), idobject.toLong(), idchild.toLong(), ppprovider)).toInt()
}

public fun UiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: UInt, ppprovider: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaProviderFromIAccessible", longArrayOf(paccessible, idchild.toLong(), dwflags.toLong(), ppprovider)).toInt()
}

public fun UiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseActiveTextPositionChangedEvent", longArrayOf(provider, textrange)).toInt()
}

public fun UiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): HRESULT {
    return Win32DynamicFfi.invokeFp("uiautomationcore.dll", "UiaRaiseAsyncContentLoadedEvent", 32, false, longArrayOf(pprovider, asynccontentloadedstate.toLong(), percentcomplete.toRawBits())).toLong().toInt()
}

public fun UiaRaiseAutomationEvent(pprovider: Long, id: UIA_EVENT_ID): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseAutomationEvent", longArrayOf(pprovider, id.toLong())).toInt()
}

public fun UiaRaiseAutomationPropertyChangedEvent(pprovider: Long, id: UIA_PROPERTY_ID, oldvalue: System.Variant.VARIANT, newvalue: System.Variant.VARIANT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseAutomationPropertyChangedEvent", longArrayOf(pprovider, id.toLong(), Win32DynamicFfi.objectSlot(oldvalue), Win32DynamicFfi.objectSlot(newvalue))).toInt()
}

public fun UiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseChangesEvent", longArrayOf(pprovider, eventidcount.toLong(), puiachanges)).toInt()
}

public fun UiaRaiseNotificationEvent(provider: Long, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: BSTR, activityid: BSTR): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseNotificationEvent", longArrayOf(provider, notificationkind.toLong(), notificationprocessing.toLong(), displaystring, activityid)).toInt()
}

public fun UiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: StructureChangeType, pruntimeid: Long, cruntimeidlen: Int): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseStructureChangedEvent", longArrayOf(pprovider, structurechangetype.toLong(), pruntimeid, cruntimeidlen.toLong())).toInt()
}

public fun UiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: TextEditChangeType, pchangeddata: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRaiseTextEditTextChangedEvent", longArrayOf(pprovider, texteditchangetype.toLong(), pchangeddata)).toInt()
}

public fun UiaRegisterProviderCallback(pcallback: Long) {
    Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRegisterProviderCallback", longArrayOf(pcallback))
}

public fun UiaRemoveEvent(hevent: HUIAEVENT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaRemoveEvent", longArrayOf(hevent)).toInt()
}

public fun UiaReturnRawElementProvider(hwnd: Foundation.HWND, wparam: Foundation.WPARAM, lparam: Foundation.LPARAM, el: Long): Foundation.LRESULT {
    Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaReturnRawElementProvider", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(wparam), Win32DynamicFfi.objectSlot(lparam), el))
    return Foundation.LRESULT()
}

public fun UiaSetFocus(hnode: HUIANODE): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaSetFocus", longArrayOf(hnode)).toInt()
}

public fun UiaTextRangeRelease(hobj: HUIATEXTRANGE): BOOL {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "UiaTextRangeRelease", longArrayOf(hobj)).toInt()
}

public fun UnhookWinEvent(hwineventhook: HWINEVENTHOOK): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnhookWinEvent", longArrayOf(hwineventhook)).toInt()
}

public fun UnregisterPointerInputTarget(hwnd: Foundation.HWND, pointertype: WindowsAndMessaging.POINTER_INPUT_TYPE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterPointerInputTarget", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(pointertype))).toInt()
}

public fun UnregisterPointerInputTargetEx(hwnd: Foundation.HWND, pointertype: WindowsAndMessaging.POINTER_INPUT_TYPE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnregisterPointerInputTargetEx", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(pointertype))).toInt()
}

public fun ValuePattern_SetValue(hobj: HUIAPATTERNOBJECT, pval: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "ValuePattern_SetValue", longArrayOf(hobj, pval)).toInt()
}

public fun VirtualizedItemPattern_Realize(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "VirtualizedItemPattern_Realize", longArrayOf(hobj)).toInt()
}

public fun WindowFromAccessibleObject(param0: Long, phwnd: Long): HRESULT {
    return Win32DynamicFfi.invoke("oleacc.dll", "WindowFromAccessibleObject", longArrayOf(param0, phwnd)).toInt()
}

public fun WindowPattern_Close(hobj: HUIAPATTERNOBJECT): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "WindowPattern_Close", longArrayOf(hobj)).toInt()
}

public fun WindowPattern_SetWindowVisualState(hobj: HUIAPATTERNOBJECT, state: WindowVisualState): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "WindowPattern_SetWindowVisualState", longArrayOf(hobj, state.toLong())).toInt()
}

public fun WindowPattern_WaitForInputIdle(hobj: HUIAPATTERNOBJECT, milliseconds: Int, presult: Long): HRESULT {
    return Win32DynamicFfi.invoke("uiautomationcore.dll", "WindowPattern_WaitForInputIdle", longArrayOf(hobj, milliseconds.toLong(), presult)).toInt()
}
