@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32UiAccessibilityJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32UiAccessibilityJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(hwndapp: Long, dwutilitystatemask: Int, dwutilitystate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityAccessibleChildren(pacccontainer: Long, ichildstart: Int, cchildren: Int, rgvarchildren: Long, pcobtained: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(hwnd: Long, dwid: Int, dwchildid: Int, ppacc: Long, pvarchild: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(hwnd: Long, dwid: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(hwnd: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(hwnd: Long, pclassname: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(hwnd: Long, pclassname: Long, idobject: Int, riid: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(hobj: Long, dockposition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(pver: Long, pbuild: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityGetRoleTextA(lrole: Int, lpszrole: Long, cchrolemax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityGetRoleTextW(lrole: Int, lpszrole: Long, cchrolemax: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityGetStateTextA(lstatebit: Int, lpszstate: Long, cchstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityGetStateTextW(lstatebit: Int, lpszstate: Long, cchstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityGridPatternGetItem(hobj: Long, row: Int, column: Int, presult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityInvokePatternInvoke(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(hobj: Long, paccessible: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(hobj: Long, flagsselect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(hobj: Long, szvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityLresultFromObject(riid: Long, wparam: Long, punk: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(hobj: Long, viewid: Int, ppstr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(hobj: Long, viewid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityNotifyWinEvent(event: Int, hwnd: Long, idobject: Int, idchild: Int)

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityObjectFromLresult(lresult: Long, riid: Long, wparam: Long, ppvobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(hobj: Long, value: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(hwnd: Long, pointertype: Int, fobserve: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityScrollPatternScroll(hobj: Long, horizontalamount: Int, verticalamount: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(hobj: Long, horizontalpercent: Double, verticalpercent: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilitySetWinEventHook(eventmin: Int, eventmax: Int, hmodwineventproc: Long, pfnwineventproc: Long, idprocess: Int, idthread: Int, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(hobj: Long, inputtype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextPatternGetSelection(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(hobj: Long, hnodechild: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeClone(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeCompare(hobj: Long, range: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(hobj: Long, endpoint: Int, targetrange: Long, targetendpoint: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(hobj: Long, unit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeFindText(hobj: Long, text: Long, backward: Int, ignorecase: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(hobj: Long, attributeid: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeGetChildren(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(hobj: Long, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeGetText(hobj: Long, maxlength: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeMove(hobj: Long, unit: Int, count: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(hobj: Long, endpoint: Int, targetrange: Long, targetendpoint: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(hobj: Long, endpoint: Int, unit: Int, count: Int, pretval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(hobj: Long, aligntotop: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTextRangeSelect(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTogglePatternToggle(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTransformPatternMove(hobj: Long, x: Double, y: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTransformPatternResize(hobj: Long, width: Double, height: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityTransformPatternRotate(hobj: Long, degrees: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaAddEvent(hnode: Long, eventid: Int, pcallback: Long, scope: Int, pproperties: Long, cproperties: Int, prequest: Long, phevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaClientsAreListening(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(pprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaEventAddWindow(hevent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(hevent: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaFind(hnode: Long, pparams: Long, prequest: Long, pprequesteddata: Long, ppoffsets: Long, pptreestructures: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(pdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(hnode: Long, patternid: Int, phobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(hnode: Long, propertyid: Int, pvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(punkmixedattributevalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(punknotsupportedvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetRootNode(phnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(hnode: Long, pruntimeid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(hnode: Long, prequest: Long, normalizestate: Int, pnormalizecondition: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(pvar: Long, phobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(pvar: Long, phtextrange: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(pvar: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(hwnd: Long, ppprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(pprovider: Long, dwflags: Int, ppaccessible: Long, pvarchild: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaLookupId(type: Int, pguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaNavigate(hnode: Long, direction: Int, pcondition: Long, prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(hwnd: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(x: Double, y: Double, prequest: Long, pprequesteddata: Long, pptreestructure: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(pprovider: Long, phnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaNodeRelease(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaPatternRelease(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(hwnd: Long, idobject: Int, idchild: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(paccessible: Long, idchild: Int, dwflags: Int, ppprovider: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(provider: Long, textrange: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(pprovider: Long, asynccontentloadedstate: Int, percentcomplete: Double): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(pprovider: Long, id: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(pprovider: Long, eventidcount: Int, puiachanges: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(provider: Long, notificationkind: Int, notificationprocessing: Int, displaystring: Long, activityid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(pprovider: Long, structurechangetype: Int, pruntimeid: Long, cruntimeidlen: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(pprovider: Long, texteditchangetype: Int, pchangeddata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(pcallback: Long)

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaRemoveEvent(hevent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(hwnd: Long, wparam: Long, lparam: Long, el: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaSetFocus(hnode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUnhookWinEvent(hwineventhook: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(hwnd: Long, pointertype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityValuePatternSetValue(hobj: Long, pval: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(param0: Long, phwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityWindowPatternClose(hobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(hobj: Long, state: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(hobj: Long, milliseconds: Int, presult: Long): Int
}

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    0

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(hwndapp.rawAddress, dwutilitystatemask.toInt(), dwutilitystate.toInt())

public actual fun accessibleChildren(pacccontainer: MutPtr, ichildstart: Int, cchildren: Int, rgvarchildren: MutPtr, pcobtained: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityAccessibleChildren(pacccontainer.rawAddress, ichildstart, cchildren, rgvarchildren.rawAddress, pcobtained.rawAddress)

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: MutPtr, pvarchild: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(hwnd.rawAddress, dwid.toInt(), dwchildid.toInt(), ppacc.rawAddress, pvarchild.rawAddress)

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: MutPtr, pvarchild: MutPtr): Hresult =
    0

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(hwnd.rawAddress, dwid.toInt(), riid.rawAddress, ppvobject.rawAddress)

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(hwnd.rawAddress, idobject, riid.rawAddress, ppvobject.rawAddress)

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(hwnd.rawAddress, pclassname.rawAddress, idobject, riid.rawAddress, ppvobject.rawAddress)

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: ConstPtr, ppvobject: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(hwnd.rawAddress, pclassname.rawAddress, idobject, riid.rawAddress, ppvobject.rawAddress)

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(hobj.rawAddress, dockposition)

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(hobj.rawAddress)

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(hobj.rawAddress)

public actual fun getOleaccVersionInfo(pver: MutPtr, pbuild: MutPtr) {
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(pver.rawAddress, pbuild.rawAddress)
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityGetRoleTextA(lrole.toInt(), lpszrole.rawAddress, cchrolemax.toInt()).toUInt()

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityGetRoleTextW(lrole.toInt(), lpszrole.rawAddress, cchrolemax.toInt()).toUInt()

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityGetStateTextA(lstatebit.toInt(), lpszstate.rawAddress, cchstate.toInt()).toUInt()

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityGetStateTextW(lstatebit.toInt(), lpszstate.rawAddress, cchstate.toInt()).toUInt()

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityGridPatternGetItem(hobj.rawAddress, row, column, presult.rawAddress)

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityInvokePatternInvoke(hobj.rawAddress)

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event.toInt())

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant, pfound: MutPtr): Hresult =
    0

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(hobj.rawAddress)

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(hobj.rawAddress, paccessible.rawAddress)

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(hobj.rawAddress, flagsselect)

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(hobj.rawAddress, szvalue.rawAddress)

public actual fun lresultFromObject(riid: ConstPtr, wparam: Wparam, punk: MutPtr): Lresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityLresultFromObject(riid.rawAddress, wparam.toLong(), punk.rawAddress)

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(hobj.rawAddress, viewid, ppstr.rawAddress)

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(hobj.rawAddress, viewid)

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityNotifyWinEvent(event.toInt(), hwnd.rawAddress, idobject, idchild)
}

public actual fun objectFromLresult(lresult: Lresult, riid: ConstPtr, wparam: Wparam, ppvobject: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityObjectFromLresult(lresult, riid.rawAddress, wparam.toLong(), ppvobject.rawAddress)

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(hobj.rawAddress, value)

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(hwnd.rawAddress, pointertype)

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(hwnd.rawAddress, pointertype, fobserve)

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(hobj.rawAddress)

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityScrollPatternScroll(hobj.rawAddress, horizontalamount, verticalamount)

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(hobj.rawAddress, horizontalpercent, verticalpercent)

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(hobj.rawAddress)

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(hobj.rawAddress)

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(hobj.rawAddress)

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    MutPtr(WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilitySetWinEventHook(eventmin.toInt(), eventmax.toInt(), hmodwineventproc.rawAddress, 0L, idprocess.toInt(), idthread.toInt(), dwflags.toInt()))

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(hobj.rawAddress)

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(hobj.rawAddress, inputtype)

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextPatternGetSelection(hobj.rawAddress, pretval.rawAddress)

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(hobj.rawAddress, pretval.rawAddress)

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(hobj.rawAddress, hnodechild.rawAddress, pretval.rawAddress)

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: MutPtr): Hresult =
    0

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(hobj.rawAddress, pretval.rawAddress)

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(hobj.rawAddress, pretval.rawAddress)

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(hobj.rawAddress)

public actual fun textRangeClone(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeClone(hobj.rawAddress, pretval.rawAddress)

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeCompare(hobj.rawAddress, range.rawAddress, pretval.rawAddress)

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(hobj.rawAddress, endpoint, targetrange.rawAddress, targetendpoint, pretval.rawAddress)

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(hobj.rawAddress, unit)

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant, backward: Bool, pretval: MutPtr): Hresult =
    0

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeFindText(hobj.rawAddress, text.rawAddress, backward, ignorecase, pretval.rawAddress)

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(hobj.rawAddress, attributeid, pretval.rawAddress)

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(hobj.rawAddress, pretval.rawAddress)

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeGetChildren(hobj.rawAddress, pretval.rawAddress)

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(hobj.rawAddress, pretval.rawAddress)

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeGetText(hobj.rawAddress, maxlength, pretval.rawAddress)

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeMove(hobj.rawAddress, unit, count, pretval.rawAddress)

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(hobj.rawAddress, endpoint, targetrange.rawAddress, targetendpoint)

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(hobj.rawAddress, endpoint, unit, count, pretval.rawAddress)

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(hobj.rawAddress)

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(hobj.rawAddress, aligntotop)

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTextRangeSelect(hobj.rawAddress)

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTogglePatternToggle(hobj.rawAddress)

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTransformPatternMove(hobj.rawAddress, x, y)

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTransformPatternResize(hobj.rawAddress, width, height)

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityTransformPatternRotate(hobj.rawAddress, degrees)

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: MutPtr, scope: TreeScope, pproperties: MutPtr, cproperties: Int, prequest: MutPtr, phevent: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaAddEvent(hnode.rawAddress, eventid, pcallback.rawAddress, scope, pproperties.rawAddress, cproperties, prequest.rawAddress, phevent.rawAddress)

public actual fun uiaClientsAreListening(): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaClientsAreListening()

public actual fun uiaDisconnectAllProviders(): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders()

public actual fun uiaDisconnectProvider(pprovider: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(pprovider.rawAddress)

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaEventAddWindow(hevent.rawAddress, hwnd.rawAddress)

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(hevent.rawAddress, hwnd.rawAddress)

public actual fun uiaFind(hnode: Huianode, pparams: MutPtr, prequest: MutPtr, pprequesteddata: MutPtr, ppoffsets: MutPtr, pptreestructures: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaFind(hnode.rawAddress, pparams.rawAddress, prequest.rawAddress, pprequesteddata.rawAddress, ppoffsets.rawAddress, pptreestructures.rawAddress)

public actual fun uiaGetErrorDescription(pdescription: MutPtr): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(pdescription.rawAddress)

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(hnode.rawAddress, patternid, phobj.rawAddress)

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(hnode.rawAddress, propertyid, pvalue.rawAddress)

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(punkmixedattributevalue.rawAddress)

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(punknotsupportedvalue.rawAddress)

public actual fun uiaGetRootNode(phnode: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetRootNode(phnode.rawAddress)

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(hnode.rawAddress, pruntimeid.rawAddress)

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: MutPtr, normalizestate: NormalizeState, pnormalizecondition: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(hnode.rawAddress, prequest.rawAddress, normalizestate, pnormalizecondition.rawAddress, pprequesteddata.rawAddress, pptreestructure.rawAddress)

public actual fun uiaHPatternObjectFromVariant(pvar: MutPtr, phobj: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(pvar.rawAddress, phobj.rawAddress)

public actual fun uiaHTextRangeFromVariant(pvar: MutPtr, phtextrange: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(pvar.rawAddress, phtextrange.rawAddress)

public actual fun uiaHUiaNodeFromVariant(pvar: MutPtr, phnode: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(pvar.rawAddress, phnode.rawAddress)

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(hwnd.rawAddress)

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(hwnd.rawAddress, ppprovider.rawAddress)

public actual fun uiaIAccessibleFromProvider(pprovider: MutPtr, dwflags: UInt, ppaccessible: MutPtr, pvarchild: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(pprovider.rawAddress, dwflags.toInt(), ppaccessible.rawAddress, pvarchild.rawAddress)

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: ConstPtr): Int =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaLookupId(type, pguid.rawAddress)

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: MutPtr, prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaNavigate(hnode.rawAddress, direction, pcondition.rawAddress, prequest.rawAddress, pprequesteddata.rawAddress, pptreestructure.rawAddress)

public actual fun uiaNodeFromFocus(prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(prequest.rawAddress, pprequesteddata.rawAddress, pptreestructure.rawAddress)

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(hwnd.rawAddress, phnode.rawAddress)

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: MutPtr, pprequesteddata: MutPtr, pptreestructure: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(x, y, prequest.rawAddress, pprequesteddata.rawAddress, pptreestructure.rawAddress)

public actual fun uiaNodeFromProvider(pprovider: MutPtr, phnode: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(pprovider.rawAddress, phnode.rawAddress)

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaNodeRelease(hnode.rawAddress)

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaPatternRelease(hobj.rawAddress)

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(hwnd.rawAddress, idobject, idchild, ppprovider.rawAddress)

public actual fun uiaProviderFromIAccessible(paccessible: MutPtr, idchild: Int, dwflags: UInt, ppprovider: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(paccessible.rawAddress, idchild, dwflags.toInt(), ppprovider.rawAddress)

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: MutPtr, textrange: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(provider.rawAddress, textrange.rawAddress)

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: MutPtr, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(pprovider.rawAddress, asynccontentloadedstate, percentcomplete)

public actual fun uiaRaiseAutomationEvent(pprovider: MutPtr, id: UiaEventId): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(pprovider.rawAddress, id)

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: MutPtr, id: UiaPropertyId, oldvalue: Variant, newvalue: Variant): Hresult =
    0

public actual fun uiaRaiseChangesEvent(pprovider: MutPtr, eventidcount: Int, puiachanges: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(pprovider.rawAddress, eventidcount, puiachanges.rawAddress)

public actual fun uiaRaiseNotificationEvent(provider: MutPtr, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(provider.rawAddress, notificationkind, notificationprocessing, displaystring.rawAddress, activityid.rawAddress)

public actual fun uiaRaiseStructureChangedEvent(pprovider: MutPtr, structurechangetype: StructureChangeType, pruntimeid: MutPtr, cruntimeidlen: Int): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(pprovider.rawAddress, structurechangetype, pruntimeid.rawAddress, cruntimeidlen)

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: MutPtr, texteditchangetype: TextEditChangeType, pchangeddata: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(pprovider.rawAddress, texteditchangetype, pchangeddata.rawAddress)

public actual fun uiaRegisterProviderCallback(pcallback: MutPtr) {
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(pcallback.rawAddress)
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaRemoveEvent(hevent.rawAddress)

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: MutPtr): Lresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(hwnd.rawAddress, wparam.toLong(), lparam, el.rawAddress)

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaSetFocus(hnode.rawAddress)

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(hobj.rawAddress)

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUnhookWinEvent(hwineventhook.rawAddress)

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(hwnd.rawAddress, pointertype)

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(hwnd.rawAddress, pointertype)

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityValuePatternSetValue(hobj.rawAddress, pval.rawAddress)

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(hobj.rawAddress)

public actual fun windowFromAccessibleObject(param0: MutPtr, phwnd: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(param0.rawAddress, phwnd.rawAddress)

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityWindowPatternClose(hobj.rawAddress)

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(hobj.rawAddress, state)

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: MutPtr): Hresult =
    WindowsWin32UiAccessibilityJniBridge.windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(hobj.rawAddress, milliseconds, presult.rawAddress)
