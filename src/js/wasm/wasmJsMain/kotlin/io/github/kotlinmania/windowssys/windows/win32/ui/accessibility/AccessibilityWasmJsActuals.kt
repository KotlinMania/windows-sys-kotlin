@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.accessibility

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Guid
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
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.com.Safearray
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.PointerInputType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiAccessibilityNapiAddon(): Boolean

private val windowsWin32UiAccessibilityNapiAvailable: Boolean = initWindowsWin32UiAccessibilityNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityAccessibleChildren(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityAccessibleChildren(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityGetRoleTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityGetRoleTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityGetRoleTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityGetRoleTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityGetStateTextA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityGetStateTextA(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityGetStateTextW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityGetStateTextW(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityGridPatternGetItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityGridPatternGetItem(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityInvokePatternInvoke(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityInvokePatternInvoke(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityLresultFromObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityLresultFromObject(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityNotifyWinEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityNotifyWinEvent(p0: Int, p1: String, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityObjectFromLresult(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityObjectFromLresult(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(p0: String, p1: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityScrollPatternScroll(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityScrollPatternScroll(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilitySetWinEventHook(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiAccessibilitySetWinEventHook(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextPatternGetSelection(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetSelection(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeClone(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeClone(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeCompare(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeCompare(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeFindText(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeFindText(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeGetChildren(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetChildren(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeGetText(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetText(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeMove(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeMove(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTextRangeSelect(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTextRangeSelect(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTogglePatternToggle(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTogglePatternToggle(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTransformPatternMove(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTransformPatternMove(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTransformPatternResize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTransformPatternResize(p0: String, p1: Double, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityTransformPatternRotate(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityTransformPatternRotate(p0: String, p1: Double): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaAddEvent(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaAddEvent(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaClientsAreListening()")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaClientsAreListening(): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders()")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaEventAddWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaEventAddWindow(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaFind(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaFind(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetRootNode(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetRootNode(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaLookupId(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaLookupId(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaNavigate(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaNavigate(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(p0: Double, p1: Double, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaNodeRelease(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaNodeRelease(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaPatternRelease(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaPatternRelease(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(p0: String, p1: Int, p2: Double): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaRemoveEvent(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaRemoveEvent(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaSetFocus(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaSetFocus(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUnhookWinEvent(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUnhookWinEvent(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityValuePatternSetValue(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityValuePatternSetValue(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityWindowPatternClose(p0)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityWindowPatternClose(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(p0: String, p1: Int, p2: String): Int

public actual fun accNotifyTouchInteraction(hwndapp: Hwnd, hwndtarget: Hwnd, pttarget: Point): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accSetRunningUtilityState(hwndapp: Hwnd, dwutilitystatemask: UInt, dwutilitystate: AccUtilityStateFlags): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityAccSetRunningUtilityState(hwndapp.rawAddress.toString(), dwutilitystatemask.toInt(), dwutilitystate.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleChildren(pacccontainer: MutPtr<CVoid>, ichildstart: Int, cchildren: Int, rgvarchildren: MutPtr<Variant.Variant>, pcobtained: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityAccessibleChildren(pacccontainer.rawAddress.toString(), ichildstart, cchildren, rgvarchildren.rawAddress.toString(), pcobtained.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromEvent(hwnd: Hwnd, dwid: UInt, dwchildid: UInt, ppacc: MutPtr<MutPtr<CVoid>>, pvarchild: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityAccessibleObjectFromEvent(hwnd.rawAddress.toString(), dwid.toInt(), dwchildid.toInt(), ppacc.rawAddress.toString(), pvarchild.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromPoint(ptscreen: Point, ppacc: MutPtr<MutPtr<CVoid>>, pvarchild: MutPtr<Variant.Variant>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun accessibleObjectFromWindow(hwnd: Hwnd, dwid: UInt, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityAccessibleObjectFromWindow(hwnd.rawAddress.toString(), dwid.toInt(), riid.rawAddress.toString(), ppvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleObject(hwnd: Hwnd, idobject: Int, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityCreateStdAccessibleObject(hwnd.rawAddress.toString(), idobject, riid.rawAddress.toString(), ppvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleProxyA(hwnd: Hwnd, pclassname: Pcstr, idobject: Int, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyA(hwnd.rawAddress.toString(), pclassname.rawAddress.toString(), idobject, riid.rawAddress.toString(), ppvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createStdAccessibleProxyW(hwnd: Hwnd, pclassname: Pcwstr, idobject: Int, riid: ConstPtr<Guid>, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityCreateStdAccessibleProxyW(hwnd.rawAddress.toString(), pclassname.rawAddress.toString(), idobject, riid.rawAddress.toString(), ppvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dockPatternSetDockPosition(hobj: Huiapatternobject, dockposition: DockPosition): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityDockPatternSetDockPosition(hobj.rawAddress.toString(), dockposition) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandCollapsePatternCollapse(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityExpandCollapsePatternCollapse(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun expandCollapsePatternExpand(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityExpandCollapsePatternExpand(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOleaccVersionInfo(pver: MutPtr<UInt>, pbuild: MutPtr<UInt>) {
    if (windowsWin32UiAccessibilityNapiAvailable) {
        wasmWindowssysWindowsWin32UiAccessibilityGetOleaccVersionInfo(pver.rawAddress.toString(), pbuild.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getRoleTextA(lrole: UInt, lpszrole: Pstr, cchrolemax: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityGetRoleTextA(lrole.toInt(), lpszrole.rawAddress.toString(), cchrolemax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRoleTextW(lrole: UInt, lpszrole: Pwstr, cchrolemax: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityGetRoleTextW(lrole.toInt(), lpszrole.rawAddress.toString(), cchrolemax.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateTextA(lstatebit: UInt, lpszstate: Pstr, cchstate: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityGetStateTextA(lstatebit.toInt(), lpszstate.rawAddress.toString(), cchstate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStateTextW(lstatebit: UInt, lpszstate: Pwstr, cchstate: UInt): UInt =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityGetStateTextW(lstatebit.toInt(), lpszstate.rawAddress.toString(), cchstate.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gridPatternGetItem(hobj: Huiapatternobject, row: Int, column: Int, presult: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityGridPatternGetItem(hobj.rawAddress.toString(), row, column, presult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invokePatternInvoke(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityInvokePatternInvoke(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isWinEventHookInstalled(event: UInt): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityIsWinEventHookInstalled(event.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun itemContainerPatternFindItemByProperty(hobj: Huiapatternobject, hnodestartafter: Huianode, propertyid: Int, value: Variant.Variant, pfound: MutPtr<Huianode>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternDoDefaultAction(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternDoDefaultAction(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternGetIaccessible(hobj: Huiapatternobject, paccessible: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternGetIaccessible(hobj.rawAddress.toString(), paccessible.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternSelect(hobj: Huiapatternobject, flagsselect: Int): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSelect(hobj.rawAddress.toString(), flagsselect) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun legacyIaccessiblePatternSetValue(hobj: Huiapatternobject, szvalue: Pcwstr): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityLegacyIaccessiblePatternSetValue(hobj.rawAddress.toString(), szvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lresultFromObject(riid: ConstPtr<Guid>, wparam: Wparam, punk: MutPtr<CVoid>): Lresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityLresultFromObject(riid.rawAddress.toString(), wparam.toString(), punk.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multipleViewPatternGetViewName(hobj: Huiapatternobject, viewid: Int, ppstr: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityMultipleViewPatternGetViewName(hobj.rawAddress.toString(), viewid, ppstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun multipleViewPatternSetCurrentView(hobj: Huiapatternobject, viewid: Int): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityMultipleViewPatternSetCurrentView(hobj.rawAddress.toString(), viewid) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun notifyWinEvent(event: UInt, hwnd: Hwnd, idobject: Int, idchild: Int) {
    if (windowsWin32UiAccessibilityNapiAvailable) {
        wasmWindowssysWindowsWin32UiAccessibilityNotifyWinEvent(event.toInt(), hwnd.rawAddress.toString(), idobject, idchild)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun objectFromLresult(lresult: Lresult, riid: ConstPtr<Guid>, wparam: Wparam, ppvobject: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityObjectFromLresult(lresult.toString(), riid.rawAddress.toString(), wparam.toString(), ppvobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rangeValuePatternSetValue(hobj: Huiapatternobject, value: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityRangeValuePatternSetValue(hobj.rawAddress.toString(), value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityRegisterPointerInputTarget(hwnd.rawAddress.toString(), pointertype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType, fobserve: Bool): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityRegisterPointerInputTargetEx(hwnd.rawAddress.toString(), pointertype, fobserve) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollItemPatternScrollIntoView(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityScrollItemPatternScrollIntoView(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollPatternScroll(hobj: Huiapatternobject, horizontalamount: ScrollAmount, verticalamount: ScrollAmount): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityScrollPatternScroll(hobj.rawAddress.toString(), horizontalamount, verticalamount) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scrollPatternSetScrollPercent(hobj: Huiapatternobject, horizontalpercent: Double, verticalpercent: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityScrollPatternSetScrollPercent(hobj.rawAddress.toString(), horizontalpercent, verticalpercent) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternAddToSelection(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilitySelectionItemPatternAddToSelection(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternRemoveFromSelection(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilitySelectionItemPatternRemoveFromSelection(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectionItemPatternSelect(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilitySelectionItemPatternSelect(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWinEventHook(eventmin: UInt, eventmax: UInt, hmodwineventproc: Hmodule, pfnwineventproc: Wineventproc, idprocess: UInt, idthread: UInt, dwflags: UInt): Hwineventhook =
    if (windowsWin32UiAccessibilityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiAccessibilitySetWinEventHook(eventmin.toInt(), eventmax.toInt(), hmodwineventproc.rawAddress.toString(), 0L.toString(), idprocess.toInt(), idthread.toInt(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun synchronizedInputPatternCancel(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilitySynchronizedInputPatternCancel(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun synchronizedInputPatternStartListening(hobj: Huiapatternobject, inputtype: SynchronizedInputType): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilitySynchronizedInputPatternStartListening(hobj.rawAddress.toString(), inputtype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetSelection(hobj: Huiapatternobject, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetSelection(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetVisibleRanges(hobj: Huiapatternobject, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetVisibleRanges(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternRangeFromChild(hobj: Huiapatternobject, hnodechild: Huianode, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextPatternRangeFromChild(hobj.rawAddress.toString(), hnodechild.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternRangeFromPoint(hobj: Huiapatternobject, point: UiaPoint, pretval: MutPtr<Huiatextrange>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetDocumentRange(hobj: Huiapatternobject, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetDocumentRange(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textPatternGetSupportedTextSelection(hobj: Huiapatternobject, pretval: MutPtr<SupportedTextSelection>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextPatternGetSupportedTextSelection(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeAddToSelection(hobj: Huiatextrange): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeAddToSelection(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeClone(hobj: Huiatextrange, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeClone(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeCompare(hobj: Huiatextrange, range: Huiatextrange, pretval: MutPtr<Bool>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeCompare(hobj.rawAddress.toString(), range.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeCompareEndpoints(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint, pretval: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeCompareEndpoints(hobj.rawAddress.toString(), endpoint, targetrange.rawAddress.toString(), targetendpoint, pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeExpandToEnclosingUnit(hobj: Huiatextrange, unit: TextUnit): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeExpandToEnclosingUnit(hobj.rawAddress.toString(), unit) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeFindAttribute(hobj: Huiatextrange, attributeid: Int, value: Variant.Variant, backward: Bool, pretval: MutPtr<Huiatextrange>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeFindText(hobj: Huiatextrange, text: Bstr, backward: Bool, ignorecase: Bool, pretval: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeFindText(hobj.rawAddress.toString(), text.rawAddress.toString(), backward, ignorecase, pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetAttributeValue(hobj: Huiatextrange, attributeid: Int, pretval: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetAttributeValue(hobj.rawAddress.toString(), attributeid, pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetBoundingRectangles(hobj: Huiatextrange, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetBoundingRectangles(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetChildren(hobj: Huiatextrange, pretval: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetChildren(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetEnclosingElement(hobj: Huiatextrange, pretval: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetEnclosingElement(hobj.rawAddress.toString(), pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeGetText(hobj: Huiatextrange, maxlength: Int, pretval: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeGetText(hobj.rawAddress.toString(), maxlength, pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMove(hobj: Huiatextrange, unit: TextUnit, count: Int, pretval: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeMove(hobj.rawAddress.toString(), unit, count, pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMoveEndpointByRange(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, targetrange: Huiatextrange, targetendpoint: TextPatternRangeEndpoint): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByRange(hobj.rawAddress.toString(), endpoint, targetrange.rawAddress.toString(), targetendpoint) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeMoveEndpointByUnit(hobj: Huiatextrange, endpoint: TextPatternRangeEndpoint, unit: TextUnit, count: Int, pretval: MutPtr<Int>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeMoveEndpointByUnit(hobj.rawAddress.toString(), endpoint, unit, count, pretval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeRemoveFromSelection(hobj: Huiatextrange): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeRemoveFromSelection(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeScrollIntoView(hobj: Huiatextrange, aligntotop: Bool): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeScrollIntoView(hobj.rawAddress.toString(), aligntotop) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textRangeSelect(hobj: Huiatextrange): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTextRangeSelect(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun togglePatternToggle(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTogglePatternToggle(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternMove(hobj: Huiapatternobject, x: Double, y: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTransformPatternMove(hobj.rawAddress.toString(), x, y) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternResize(hobj: Huiapatternobject, width: Double, height: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTransformPatternResize(hobj.rawAddress.toString(), width, height) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformPatternRotate(hobj: Huiapatternobject, degrees: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityTransformPatternRotate(hobj.rawAddress.toString(), degrees) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaAddEvent(hnode: Huianode, eventid: Int, pcallback: MutPtr<UiaEventCallback>, scope: TreeScope, pproperties: MutPtr<Int>, cproperties: Int, prequest: MutPtr<UiaCacheRequest>, phevent: MutPtr<Huiaevent>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaAddEvent(hnode.rawAddress.toString(), eventid, pcallback.rawAddress.toString(), scope, pproperties.rawAddress.toString(), cproperties, prequest.rawAddress.toString(), phevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaClientsAreListening(): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaClientsAreListening() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaDisconnectAllProviders(): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaDisconnectAllProviders() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaDisconnectProvider(pprovider: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaDisconnectProvider(pprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaEventAddWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaEventAddWindow(hevent.rawAddress.toString(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaEventRemoveWindow(hevent: Huiaevent, hwnd: Hwnd): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaEventRemoveWindow(hevent.rawAddress.toString(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaFind(hnode: Huianode, pparams: MutPtr<UiaFindParams>, prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, ppoffsets: MutPtr<MutPtr<Safearray>>, pptreestructures: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaFind(hnode.rawAddress.toString(), pparams.rawAddress.toString(), prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), ppoffsets.rawAddress.toString(), pptreestructures.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetErrorDescription(pdescription: MutPtr<Bstr>): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetErrorDescription(pdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetPatternProvider(hnode: Huianode, patternid: Int, phobj: MutPtr<Huiapatternobject>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetPatternProvider(hnode.rawAddress.toString(), patternid, phobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetPropertyValue(hnode: Huianode, propertyid: Int, pvalue: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetPropertyValue(hnode.rawAddress.toString(), propertyid, pvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetReservedMixedAttributeValue(punkmixedattributevalue: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetReservedMixedAttributeValue(punkmixedattributevalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetReservedNotSupportedValue(punknotsupportedvalue: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetReservedNotSupportedValue(punknotsupportedvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetRootNode(phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetRootNode(phnode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetRuntimeId(hnode: Huianode, pruntimeid: MutPtr<MutPtr<Safearray>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetRuntimeId(hnode.rawAddress.toString(), pruntimeid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaGetUpdatedCache(hnode: Huianode, prequest: MutPtr<UiaCacheRequest>, normalizestate: NormalizeState, pnormalizecondition: MutPtr<UiaCondition>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaGetUpdatedCache(hnode.rawAddress.toString(), prequest.rawAddress.toString(), normalizestate, pnormalizecondition.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHPatternObjectFromVariant(pvar: MutPtr<Variant.Variant>, phobj: MutPtr<Huiapatternobject>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaHPatternObjectFromVariant(pvar.rawAddress.toString(), phobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHTextRangeFromVariant(pvar: MutPtr<Variant.Variant>, phtextrange: MutPtr<Huiatextrange>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaHTextRangeFromVariant(pvar.rawAddress.toString(), phtextrange.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHUiaNodeFromVariant(pvar: MutPtr<Variant.Variant>, phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaHUiaNodeFromVariant(pvar.rawAddress.toString(), phnode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHasServerSideProvider(hwnd: Hwnd): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaHasServerSideProvider(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaHostProviderFromHwnd(hwnd: Hwnd, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaHostProviderFromHwnd(hwnd.rawAddress.toString(), ppprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaIAccessibleFromProvider(pprovider: MutPtr<CVoid>, dwflags: UInt, ppaccessible: MutPtr<MutPtr<CVoid>>, pvarchild: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaIAccessibleFromProvider(pprovider.rawAddress.toString(), dwflags.toInt(), ppaccessible.rawAddress.toString(), pvarchild.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaLookupId(type: AutomationIdentifierType, pguid: ConstPtr<Guid>): Int =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaLookupId(type, pguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNavigate(hnode: Huianode, direction: NavigateDirection, pcondition: MutPtr<UiaCondition>, prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaNavigate(hnode.rawAddress.toString(), direction, pcondition.rawAddress.toString(), prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromFocus(prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromFocus(prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromHandle(hwnd: Hwnd, phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromHandle(hwnd.rawAddress.toString(), phnode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromPoint(x: Double, y: Double, prequest: MutPtr<UiaCacheRequest>, pprequesteddata: MutPtr<MutPtr<Safearray>>, pptreestructure: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromPoint(x, y, prequest.rawAddress.toString(), pprequesteddata.rawAddress.toString(), pptreestructure.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeFromProvider(pprovider: MutPtr<CVoid>, phnode: MutPtr<Huianode>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaNodeFromProvider(pprovider.rawAddress.toString(), phnode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaNodeRelease(hnode: Huianode): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaNodeRelease(hnode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaPatternRelease(hobj: Huiapatternobject): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaPatternRelease(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaProviderForNonClient(hwnd: Hwnd, idobject: Int, idchild: Int, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaProviderForNonClient(hwnd.rawAddress.toString(), idobject, idchild, ppprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaProviderFromIAccessible(paccessible: MutPtr<CVoid>, idchild: Int, dwflags: UInt, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaProviderFromIAccessible(paccessible.rawAddress.toString(), idchild, dwflags.toInt(), ppprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseActiveTextPositionChangedEvent(provider: MutPtr<CVoid>, textrange: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseActiveTextPositionChangedEvent(provider.rawAddress.toString(), textrange.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAsyncContentLoadedEvent(pprovider: MutPtr<CVoid>, asynccontentloadedstate: AsyncContentLoadedState, percentcomplete: Double): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseAsyncContentLoadedEvent(pprovider.rawAddress.toString(), asynccontentloadedstate, percentcomplete) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAutomationEvent(pprovider: MutPtr<CVoid>, id: UiaEventId): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseAutomationEvent(pprovider.rawAddress.toString(), id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseAutomationPropertyChangedEvent(pprovider: MutPtr<CVoid>, id: UiaPropertyId, oldvalue: Variant.Variant, newvalue: Variant.Variant): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseChangesEvent(pprovider: MutPtr<CVoid>, eventidcount: Int, puiachanges: MutPtr<UiaChangeInfo>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseChangesEvent(pprovider.rawAddress.toString(), eventidcount, puiachanges.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseNotificationEvent(provider: MutPtr<CVoid>, notificationkind: NotificationKind, notificationprocessing: NotificationProcessing, displaystring: Bstr, activityid: Bstr): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseNotificationEvent(provider.rawAddress.toString(), notificationkind, notificationprocessing, displaystring.rawAddress.toString(), activityid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseStructureChangedEvent(pprovider: MutPtr<CVoid>, structurechangetype: StructureChangeType, pruntimeid: MutPtr<Int>, cruntimeidlen: Int): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseStructureChangedEvent(pprovider.rawAddress.toString(), structurechangetype, pruntimeid.rawAddress.toString(), cruntimeidlen) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRaiseTextEditTextChangedEvent(pprovider: MutPtr<CVoid>, texteditchangetype: TextEditChangeType, pchangeddata: MutPtr<Safearray>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRaiseTextEditTextChangedEvent(pprovider.rawAddress.toString(), texteditchangetype, pchangeddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaRegisterProviderCallback(pcallback: MutPtr<UiaProviderCallback>) {
    if (windowsWin32UiAccessibilityNapiAvailable) {
        wasmWindowssysWindowsWin32UiAccessibilityUiaRegisterProviderCallback(pcallback.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun uiaRemoveEvent(hevent: Huiaevent): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaRemoveEvent(hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaReturnRawElementProvider(hwnd: Hwnd, wparam: Wparam, lparam: Lparam, el: MutPtr<CVoid>): Lresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaReturnRawElementProvider(hwnd.rawAddress.toString(), wparam.toString(), lparam.toString(), el.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaSetFocus(hnode: Huianode): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaSetFocus(hnode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun uiaTextRangeRelease(hobj: Huiatextrange): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUiaTextRangeRelease(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unhookWinEvent(hwineventhook: Hwineventhook): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUnhookWinEvent(hwineventhook.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPointerInputTarget(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUnregisterPointerInputTarget(hwnd.rawAddress.toString(), pointertype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterPointerInputTargetEx(hwnd: Hwnd, pointertype: PointerInputType): Bool =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityUnregisterPointerInputTargetEx(hwnd.rawAddress.toString(), pointertype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun valuePatternSetValue(hobj: Huiapatternobject, pval: Pcwstr): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityValuePatternSetValue(hobj.rawAddress.toString(), pval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun virtualizedItemPatternRealize(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityVirtualizedItemPatternRealize(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromAccessibleObject(param0: MutPtr<CVoid>, phwnd: MutPtr<Hwnd>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityWindowFromAccessibleObject(param0.rawAddress.toString(), phwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternClose(hobj: Huiapatternobject): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityWindowPatternClose(hobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternSetWindowVisualState(hobj: Huiapatternobject, state: WindowVisualState): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityWindowPatternSetWindowVisualState(hobj.rawAddress.toString(), state) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowPatternWaitForInputIdle(hobj: Huiapatternobject, milliseconds: Int, presult: MutPtr<Bool>): Hresult =
    if (windowsWin32UiAccessibilityNapiAvailable) wasmWindowssysWindowsWin32UiAccessibilityWindowPatternWaitForInputIdle(hobj.rawAddress.toString(), milliseconds, presult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
