@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.shell

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Propertykey
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.security.SecurityAttributes
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FileFlagsAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.system.com.Formatetc
import io.github.kotlinmania.windowssys.windows.win32.system.com.structuredstorage.Propvariant
import io.github.kotlinmania.windowssys.windows.win32.system.com.urlmon.Softdistinfo
import io.github.kotlinmania.windowssys.windows.win32.system.ole.Dropeffect
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey
import io.github.kotlinmania.windowssys.windows.win32.system.threading.LpthreadStartRoutine
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Himagelist
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Lpfnsvaddpropsheetpage
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.DeviceScaleFactor
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Itemidlist
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Perceived
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Shitemid
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.common.Strret
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hmenu
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.MessageboxStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.ShowWindowCmd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiShellNapiAddon(): Boolean

private val windowsWin32UiShellNapiAvailable: Boolean = initWindowsWin32UiShellNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocCreateForClasses(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellAssocCreateForClasses(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocGetDetailsOfPropKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellAssocGetDetailsOfPropKey(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocGetPerceivedType(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellAssocGetPerceivedType(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocIsDangerous(p0)")
private external fun wasmWindowssysWindowsWin32UiShellAssocIsDangerous(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocQueryKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellAssocQueryKeyA(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocQueryKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellAssocQueryKeyW(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocQueryStringA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellAssocQueryStringA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocQueryStringByKeyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellAssocQueryStringByKeyA(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocQueryStringByKeyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellAssocQueryStringByKeyW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellAssocQueryStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellAssocQueryStringW(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellCdefFolderMenuCreate2(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiShellCdefFolderMenuCreate2(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellCidldataCreateFromIdarray(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellCidldataCreateFromIdarray(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellChrCmpIA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellChrCmpIA(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellChrCmpIW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellChrCmpIW(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellColorAdjustLuma(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellColorAdjustLuma(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellColorHLSToRGB(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellColorHLSToRGB(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellColorRGBToHLS(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellColorRGBToHLS(p0: Int, p1: String, p2: String, p3: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellCommandLineToArgvW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellCommandLineToArgvW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellConnectToConnectionPoint(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellConnectToConnectionPoint(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellCreateProfile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellCreateProfile(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDadAutoScroll(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellDadAutoScroll(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDadDragLeave()")
private external fun wasmWindowssysWindowsWin32UiShellDadDragLeave(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDadSetDragImage(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellDadSetDragImage(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDadShowDragImage(p0)")
private external fun wasmWindowssysWindowsWin32UiShellDadShowDragImage(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDefSubclassProc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellDefSubclassProc(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDeleteProfileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellDeleteProfileA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDeleteProfileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellDeleteProfileW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDoEnvironmentSubstA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellDoEnvironmentSubstA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDoEnvironmentSubstW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellDoEnvironmentSubstW(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDragAcceptFiles(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellDragAcceptFiles(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDragFinish(p0)")
private external fun wasmWindowssysWindowsWin32UiShellDragFinish(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDragQueryFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellDragQueryFileA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDragQueryFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellDragQueryFileW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDragQueryPoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellDragQueryPoint(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDriveType(p0)")
private external fun wasmWindowssysWindowsWin32UiShellDriveType(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellDuplicateIcon(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellDuplicateIcon(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractAssociatedIconA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellExtractAssociatedIconA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractAssociatedIconExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellExtractAssociatedIconExA(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractAssociatedIconExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellExtractAssociatedIconExW(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractAssociatedIconW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellExtractAssociatedIconW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractIconA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellExtractIconA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractIconExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellExtractIconExA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractIconExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellExtractIconExW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellExtractIconW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellExtractIconW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellFindExecutableA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellFindExecutableA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellFindExecutableW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellFindExecutableW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetAcceptLanguagesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetAcceptLanguagesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetAcceptLanguagesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetAcceptLanguagesW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID(p0)")
private external fun wasmWindowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetDpiForShellUIComponent(p0)")
private external fun wasmWindowssysWindowsWin32UiShellGetDpiForShellUIComponent(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetFileNameFromBrowse(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellGetFileNameFromBrowse(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetMenuContextHelpId(p0)")
private external fun wasmWindowssysWindowsWin32UiShellGetMenuContextHelpId(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetMenuPosFromID(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetMenuPosFromID(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetProfileType(p0)")
private external fun wasmWindowssysWindowsWin32UiShellGetProfileType(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetProfilesDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetProfilesDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetProfilesDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetProfilesDirectoryW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetScaleFactorForDevice(p0)")
private external fun wasmWindowssysWindowsWin32UiShellGetScaleFactorForDevice(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetScaleFactorForMonitor(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellGetScaleFactorForMonitor(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetUserProfileDirectoryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellGetUserProfileDirectoryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetUserProfileDirectoryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellGetUserProfileDirectoryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetWindowContextHelpId(p0)")
private external fun wasmWindowssysWindowsWin32UiShellGetWindowContextHelpId(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellGetWindowSubclass(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellGetWindowSubclass(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserFree(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserFree(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserFree64(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserFree64(p0: String, p1: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserMarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserMarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserMarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserMarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserSize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserSize64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserSize64(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserUnmarshal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserUnmarshal(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHmonitorUserUnmarshal64(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHmonitorUserUnmarshal64(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHashData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellHashData(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkClone(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkClone(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateBrowseContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateBrowseContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateExtensionServices(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateExtensionServices(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateFromData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateFromData(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateFromMoniker(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateFromMoniker(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateFromString(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateFromString(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateShortcut(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateShortcut(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkCreateShortcutFromString(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkCreateShortcutFromString(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkGetSpecialReference(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkGetSpecialReference(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkGetValueFromParams(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkGetValueFromParams(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkIsShortcut(p0)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkIsShortcut(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkNavigate(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkNavigate(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkNavigateToStringReference(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkNavigateToStringReference(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkOnNavigate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkOnNavigate(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkOnRenameDocument(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkOnRenameDocument(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkParseDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkParseDisplayName(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkPreprocessMoniker(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkPreprocessMoniker(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkQueryCreateFromData(p0)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkQueryCreateFromData(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkResolveMonikerForData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkResolveMonikerForData(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkResolveShortcut(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkResolveShortcut(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkResolveShortcutToString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkResolveShortcutToString(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkResolveStringForData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkResolveStringForData(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkSetSpecialReference(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkSetSpecialReference(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkTranslateURL(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkTranslateURL(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellHlinkUpdateStackItem(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellHlinkUpdateStackItem(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILAppendID(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellILAppendID(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILClone(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILClone(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILCloneFirst(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILCloneFirst(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILCombine(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellILCombine(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILCreateFromPathA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILCreateFromPathA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILCreateFromPathW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILCreateFromPathW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILFindChild(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellILFindChild(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILFindLastID(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILFindLastID(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILFree(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILGetNext(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILGetNext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILGetSize(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILGetSize(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILIsEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellILIsEqual(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILIsParent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellILIsParent(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILLoadFromStreamEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellILLoadFromStreamEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILRemoveLastID(p0)")
private external fun wasmWindowssysWindowsWin32UiShellILRemoveLastID(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellILSaveToStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellILSaveToStream(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamCopy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamCopy(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamRead(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamRead(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamReadPidl(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamReadPidl(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamReadStr(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamReadStr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamReset(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamReset(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamWrite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamWrite(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamWritePidl(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamWritePidl(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIstreamWriteStr(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIstreamWriteStr(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIunknownAtomicRelease(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIunknownAtomicRelease(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIunknownGetSite(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellIunknownGetSite(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIunknownGetWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIunknownGetWindow(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIunknownQueryService(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellIunknownQueryService(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIunknownSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIunknownSet(p0: String, p1: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIunknownSetSite(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellIunknownSetSite(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellImportPrivacySettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellImportPrivacySettings(p0: String, p1: String, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellInitNetworkAddressControl()")
private external fun wasmWindowssysWindowsWin32UiShellInitNetworkAddressControl(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellInitPropVariantFromStrRet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellInitPropVariantFromStrRet(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellInitVariantFromStrRet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellInitVariantFromStrRet(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIntlStrEqWorkerA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellIntlStrEqWorkerA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIntlStrEqWorkerW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellIntlStrEqWorkerW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsCharSpaceA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIsCharSpaceA(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsCharSpaceW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIsCharSpaceW(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsInternetESCEnabled()")
private external fun wasmWindowssysWindowsWin32UiShellIsInternetESCEnabled(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsLFNDriveA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIsLFNDriveA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsLFNDriveW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIsLFNDriveW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsNetDrive(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIsNetDrive(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsOS(p0)")
private external fun wasmWindowssysWindowsWin32UiShellIsOS(p0: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellIsUserAnAdmin()")
private external fun wasmWindowssysWindowsWin32UiShellIsUserAnAdmin(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellLoadUserProfileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellLoadUserProfileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellLoadUserProfileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellLoadUserProfileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellOleSaveToStreamEx(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellOleSaveToStreamEx(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellOpenRegStream(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellOpenRegStream(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellParseURLA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellParseURLA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellParseURLW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellParseURLW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAddBackslashA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathAddBackslashA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAddBackslashW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathAddBackslashW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAddExtensionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathAddExtensionA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAddExtensionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathAddExtensionW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAllocCanonicalize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathAllocCanonicalize(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAllocCombine(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathAllocCombine(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAppendA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathAppendA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathAppendW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathAppendW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathBuildRootA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathBuildRootA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathBuildRootW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathBuildRootW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCanonicalizeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCanonicalizeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCanonicalizeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCanonicalizeW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchAddBackslash(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchAddBackslash(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchAddBackslashEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchAddBackslashEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchAddExtension(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchAddExtension(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchAppend(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchAppend(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchAppendEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchAppendEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchCanonicalize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchCanonicalize(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchCanonicalizeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchCanonicalizeEx(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchCombine(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchCombine(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchCombineEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchCombineEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchFindExtension(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchFindExtension(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchIsRoot(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchIsRoot(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchRemoveBackslash(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchRemoveBackslash(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchRemoveBackslashEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchRemoveBackslashEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchRemoveExtension(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchRemoveExtension(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchRemoveFileSpec(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchRemoveFileSpec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchRenameExtension(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchRenameExtension(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchSkipRoot(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchSkipRoot(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchStripPrefix(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchStripPrefix(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCchStripToRoot(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCchStripToRoot(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCleanupSpec(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathCleanupSpec(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCombineA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCombineA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCombineW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCombineW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCommonPrefixA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCommonPrefixA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCommonPrefixW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCommonPrefixW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCompactPathA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCompactPathA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCompactPathExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCompactPathExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCompactPathExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCompactPathExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCompactPathW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCompactPathW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCreateFromUrlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCreateFromUrlA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCreateFromUrlAlloc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathCreateFromUrlAlloc(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathCreateFromUrlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathCreateFromUrlW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFileExistsA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFileExistsA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFileExistsW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFileExistsW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindExtensionA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindExtensionA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindExtensionW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindExtensionW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindFileNameA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindFileNameA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindFileNameW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindFileNameW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindNextComponentA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindNextComponentA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindNextComponentW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindNextComponentW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindOnPathA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindOnPathA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindOnPathW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindOnPathW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindSuffixArrayA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindSuffixArrayA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathFindSuffixArrayW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathFindSuffixArrayW(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetArgsA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetArgsA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetArgsW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetArgsW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetCharTypeA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetCharTypeA(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetCharTypeW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetCharTypeW(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetDriveNumberA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetDriveNumberA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetDriveNumberW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetDriveNumberW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathGetShortPath(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathGetShortPath(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsContentTypeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsContentTypeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsContentTypeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsContentTypeW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsDirectoryA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsDirectoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsDirectoryEmptyA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsDirectoryEmptyA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsDirectoryEmptyW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsDirectoryEmptyW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsDirectoryW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsDirectoryW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsExe(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsExe(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsFileSpecA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsFileSpecA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsFileSpecW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsFileSpecW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsLFNFileSpecA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsLFNFileSpecA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsLFNFileSpecW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsLFNFileSpecW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsNetworkPathA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsNetworkPathA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsNetworkPathW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsNetworkPathW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsPrefixA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsPrefixA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsPrefixW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsPrefixW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsRelativeA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsRelativeA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsRelativeW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsRelativeW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsRootA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsRootA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsRootW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsRootW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsSameRootA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsSameRootA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsSameRootW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsSameRootW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsSlowA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsSlowA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsSlowW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsSlowW(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsSystemFolderA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsSystemFolderA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsSystemFolderW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsSystemFolderW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCA(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCEx(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCServerA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCServerA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCServerShareA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCServerShareA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCServerShareW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCServerShareW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCServerW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCServerW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsUNCW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsUNCW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsURLA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsURLA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathIsURLW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathIsURLW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMakePrettyA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathMakePrettyA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMakePrettyW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathMakePrettyW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMakeSystemFolderA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathMakeSystemFolderA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMakeSystemFolderW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathMakeSystemFolderW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMakeUniqueName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPathMakeUniqueName(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMatchSpecA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathMatchSpecA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMatchSpecExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathMatchSpecExA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMatchSpecExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathMatchSpecExW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathMatchSpecW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathMatchSpecW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathParseIconLocationA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathParseIconLocationA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathParseIconLocationW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathParseIconLocationW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathQualify(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathQualify(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathQuoteSpacesA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathQuoteSpacesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathQuoteSpacesW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathQuoteSpacesW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRelativePathToA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPathRelativePathToA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRelativePathToW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellPathRelativePathToW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveArgsA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveArgsA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveArgsW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveArgsW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveBackslashA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveBackslashA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveBackslashW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveBackslashW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveBlanksA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveBlanksA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveBlanksW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveBlanksW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveExtensionA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveExtensionA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveExtensionW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveExtensionW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveFileSpecA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveFileSpecA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRemoveFileSpecW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathRemoveFileSpecW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRenameExtensionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathRenameExtensionA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathRenameExtensionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPathRenameExtensionW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathResolve(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathResolve(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathSearchAndQualifyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathSearchAndQualifyA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathSearchAndQualifyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathSearchAndQualifyW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathSetDlgItemPathA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathSetDlgItemPathA(p0: String, p1: Int, p2: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathSetDlgItemPathW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathSetDlgItemPathW(p0: String, p1: Int, p2: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathSkipRootA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathSkipRootA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathSkipRootW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathSkipRootW(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathStripPathA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathStripPathA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathStripPathW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathStripPathW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathStripToRootA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathStripToRootA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathStripToRootW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathStripToRootW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUnExpandEnvStringsA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathUnExpandEnvStringsA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUnExpandEnvStringsW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellPathUnExpandEnvStringsW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUndecorateA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathUndecorateA(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUndecorateW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathUndecorateW(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUnmakeSystemFolderA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathUnmakeSystemFolderA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUnmakeSystemFolderW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathUnmakeSystemFolderW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUnquoteSpacesA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathUnquoteSpacesA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathUnquoteSpacesW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellPathUnquoteSpacesW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPickIconDlg(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellPickIconDlg(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellPropVariantToStrRet(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellPropVariantToStrRet(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellQISearch(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellQISearch(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellReadCabinetState(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellReadCabinetState(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRealDriveType(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellRealDriveType(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRegisterAppStateChangeNotification(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellRegisterAppStateChangeNotification(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRegisterScaleChangeEvent(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellRegisterScaleChangeEvent(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRegisterScaleChangeNotifications(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellRegisterScaleChangeNotifications(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRemoveWindowSubclass(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellRemoveWindowSubclass(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRestartDialog(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellRestartDialog(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRestartDialogEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellRestartDialogEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellRevokeScaleChangeNotifications(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellRevokeScaleChangeNotifications(p0: Int, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAddToRecentDocs(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHAddToRecentDocs(p0: Int, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAlloc(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHAlloc(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAllocShared(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHAllocShared(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAnsiToAnsi(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHAnsiToAnsi(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAnsiToUnicode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHAnsiToUnicode(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAppBarMessage(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHAppBarMessage(p0: Int, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAssocEnumHandlers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHAssocEnumHandlers(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHAutoComplete(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHAutoComplete(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHBindToFolderIDListParent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHBindToFolderIDListParent(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHBindToFolderIDListParentEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHBindToFolderIDListParentEx(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHBindToObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHBindToObject(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHBindToParent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHBindToParent(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHBrowseForFolderA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHBrowseForFolderA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHBrowseForFolderW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHBrowseForFolderW(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCLSIDFromString(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCLSIDFromString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShchangeNotificationLock(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellShchangeNotificationLock(p0: String, p1: Int, p2: String, p3: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShchangeNotificationUnlock(p0)")
private external fun wasmWindowssysWindowsWin32UiShellShchangeNotificationUnlock(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHChangeNotify(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHChangeNotify(p0: Int, p1: Int, p2: String, p3: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHChangeNotifyDeregister(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHChangeNotifyDeregister(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHChangeNotifyRegister(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHChangeNotifyRegister(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(p0: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCloneSpecialIDList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCloneSpecialIDList(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCoCreateInstance(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHCoCreateInstance(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCopyKeyA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHCopyKeyA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCopyKeyW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHCopyKeyW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateAssociationRegistration(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateAssociationRegistration(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDataObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDataObject(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDefaultContextMenu(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDefaultContextMenu(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDefaultExtractIcon(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDefaultExtractIcon(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDirectory(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDirectory(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDirectoryExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDirectoryExA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateDirectoryExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateDirectoryExW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateFileExtractIconW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateFileExtractIconW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateItemFromIDList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateItemFromIDList(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateItemFromParsingName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateItemFromParsingName(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateItemFromRelativeName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateItemFromRelativeName(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateItemInKnownFolder(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateItemInKnownFolder(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateItemWithParent(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateItemWithParent(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateMemStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateMemStream(p0: String, p1: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateProcessAsUserW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateProcessAsUserW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreatePropSheetExtArray(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreatePropSheetExtArray(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellFolderView(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellFolderView(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellFolderViewEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellFolderViewEx(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellItem(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellItem(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellItemArray(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellItemArray(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateShellPalette(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateShellPalette(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateStreamOnFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateStreamOnFileA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateStreamOnFileEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateStreamOnFileEx(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateStreamOnFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateStreamOnFileW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateThread(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateThread(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateThreadRef(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateThreadRef(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHCreateThreadWithHandle(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHCreateThreadWithHandle(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDefExtractIconA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHDefExtractIconA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDefExtractIconW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHDefExtractIconW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDeleteEmptyKeyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHDeleteEmptyKeyA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDeleteEmptyKeyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHDeleteEmptyKeyW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDeleteKeyA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHDeleteKeyA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDeleteKeyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHDeleteKeyW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDeleteValueA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHDeleteValueA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDeleteValueW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHDeleteValueW(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDestroyPropSheetExtArray(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHDestroyPropSheetExtArray(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHDoDragDrop(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHDoDragDrop(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEmptyRecycleBinA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHEmptyRecycleBinA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEmptyRecycleBinW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHEmptyRecycleBinW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEnumKeyExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHEnumKeyExA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEnumKeyExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHEnumKeyExW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEnumValueA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellSHEnumValueA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEnumValueW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellSHEnumValueW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFileOperationA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHFileOperationA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFileOperationW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHFileOperationW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFindFiles(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHFindFiles(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShfindInitMenuPopup(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellShfindInitMenuPopup(p0: String, p1: String, p2: Int, p3: Int): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFlushSFCache()")
private external fun wasmWindowssysWindowsWin32UiShellSHFlushSFCache()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFormatDateTimeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHFormatDateTimeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFormatDateTimeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHFormatDateTimeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFormatDrive(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHFormatDrive(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFree(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHFree(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFreeNameMappings(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHFreeNameMappings(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHFreeShared(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHFreeShared(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetAttributesFromDataObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetAttributesFromDataObject(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetDataFromIDListA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetDataFromIDListA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetDataFromIDListW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetDataFromIDListW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetDesktopFolder(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetDesktopFolder(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetDriveMedia(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetDriveMedia(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFileInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFileInfoA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFileInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFileInfoW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFolderLocation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFolderLocation(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFolderPathA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFolderPathA(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetFolderPathW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetFolderPathW(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetIDListFromObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetIDListFromObject(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetIconOverlayIndexA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetIconOverlayIndexA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetIconOverlayIndexW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetIconOverlayIndexW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetImageList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetImageList(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetInstanceExplorer(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetInstanceExplorer(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetInverseCMAP(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetInverseCMAP(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetItemFromDataObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetItemFromDataObject(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetItemFromObject(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetItemFromObject(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetKnownFolderIDList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetKnownFolderIDList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetKnownFolderItem(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetKnownFolderItem(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetKnownFolderPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetKnownFolderPath(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetLocalizedName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetLocalizedName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetMalloc(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetMalloc(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetNameFromIDList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetNameFromIDList(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetNewLinkInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetNewLinkInfoA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetNewLinkInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetNewLinkInfoW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetPathFromIDListA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetPathFromIDListA(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetPathFromIDListEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetPathFromIDListEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetPathFromIDListW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetPathFromIDListW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetRealIDL(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetRealIDL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetSetFolderCustomSettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetSetFolderCustomSettings(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetSetSettings(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetSetSettings(p0: String, p1: Int, p2: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetSettings(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetSettings(p0: String, p1: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetSpecialFolderLocation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetSpecialFolderLocation(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetSpecialFolderPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetSpecialFolderPathA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetSpecialFolderPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetSpecialFolderPathW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetStockIconInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetStockIconInfo(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetThreadRef(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetThreadRef(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetUnreadMailCountW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetUnreadMailCountW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetValueA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetValueA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetValueW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetValueW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGetViewStatePropertyBag(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHGetViewStatePropertyBag(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGlobalCounterDecrement(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGlobalCounterDecrement(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGlobalCounterGetValue(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGlobalCounterGetValue(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHGlobalCounterIncrement(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHGlobalCounterIncrement(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHHandleUpdateImage(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHHandleUpdateImage(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHILCreateFromPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHILCreateFromPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHInvokePrinterCommandA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHInvokePrinterCommandA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHInvokePrinterCommandW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHInvokePrinterCommandW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHIsFileAvailableOffline(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHIsFileAvailableOffline(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHIsLowMemoryMachine(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHIsLowMemoryMachine(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHLimitInputEdit(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHLimitInputEdit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHLoadInProc(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHLoadInProc(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHLoadIndirectString(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHLoadIndirectString(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers()")
private external fun wasmWindowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHLockShared(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHLockShared(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHMessageBoxCheckA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHMessageBoxCheckA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHMessageBoxCheckW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHMessageBoxCheckW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHMultiFileProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHMultiFileProperties(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHObjectProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHObjectProperties(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenFolderAndSelectItems(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenFolderAndSelectItems(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenPropSheetW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenPropSheetW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenRegStream2A(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenRegStream2A(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenRegStream2W(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenRegStream2W(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenRegStreamA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenRegStreamA(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenRegStreamW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenRegStreamW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHOpenWithDialog(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHOpenWithDialog(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHParseDisplayName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHParseDisplayName(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHPathPrepareForWriteA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHPathPrepareForWriteA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHPathPrepareForWriteW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHPathPrepareForWriteW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryInfoKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryInfoKeyA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryInfoKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryInfoKeyW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryRecycleBinA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryRecycleBinA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryRecycleBinW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryRecycleBinW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryUserNotificationState(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryUserNotificationState(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryValueExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryValueExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHQueryValueExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHQueryValueExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegCloseUSKey(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegCloseUSKey(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegCreateUSKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegCreateUSKeyA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegCreateUSKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegCreateUSKeyW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegDeleteUSValueA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegDeleteUSValueA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegDeleteUSValueW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegDeleteUSValueW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegDuplicateHKey(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegDuplicateHKey(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegEnumUSKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegEnumUSKeyA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegEnumUSKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegEnumUSKeyW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegEnumUSValueA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegEnumUSValueA(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegEnumUSValueW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegEnumUSValueW(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetBoolUSValueA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetBoolUSValueA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetBoolUSValueW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetBoolUSValueW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetIntW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetIntW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetPathA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetPathA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetPathW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetPathW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetUSValueA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetUSValueA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetUSValueW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetUSValueW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetValueA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetValueA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegGetValueW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegGetValueW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegOpenUSKeyA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegOpenUSKeyA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegOpenUSKeyW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegOpenUSKeyW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegQueryUSValueA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegQueryUSValueA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegQueryUSValueW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegQueryUSValueW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegSetPathA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegSetPathA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegSetPathW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegSetPathW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegSetUSValueA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegSetUSValueA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegSetUSValueW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegSetUSValueW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegWriteUSValueA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegWriteUSValueA(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRegWriteUSValueW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHRegWriteUSValueW(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHReleaseThreadRef()")
private external fun wasmWindowssysWindowsWin32UiShellSHReleaseThreadRef(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRemoveLocalizedName(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHRemoveLocalizedName(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHResolveLibrary(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHResolveLibrary(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHRestricted(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHRestricted(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSendMessageBroadcastA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHSendMessageBroadcastA(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSendMessageBroadcastW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHSendMessageBroadcastW(p0: Int, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetDefaultProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetDefaultProperties(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetFolderPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetFolderPathA(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetFolderPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetFolderPathW(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetInstanceExplorer(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetInstanceExplorer(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetKnownFolderPath(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetKnownFolderPath(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetLocalizedName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetLocalizedName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetThreadRef(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetThreadRef(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetUnreadMailCountW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetUnreadMailCountW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetValueA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetValueA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSetValueW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellSHSetValueW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShshellFolderViewMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellShshellFolderViewMessage(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHShowManageLibraryUI(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellSHShowManageLibraryUI(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSimpleIDListFromPath(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHSimpleIDListFromPath(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHSkipJunction(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHSkipJunction(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHStartNetConnectionDialogW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHStartNetConnectionDialogW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHStrDupA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHStrDupA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHStrDupW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHStrDupW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHStripMneumonicA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHStripMneumonicA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHStripMneumonicW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHStripMneumonicW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHTestTokenMembership(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSHTestTokenMembership(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHUnicodeToAnsi(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHUnicodeToAnsi(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHUnicodeToUnicode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHUnicodeToUnicode(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHUnlockShared(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSHUnlockShared(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHUpdateImageA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHUpdateImageA(p0: String, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHUpdateImageW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSHUpdateImageW(p0: String, p1: Int, p2: Int, p3: Int)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSHValidateUNC(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellSHValidateUNC(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSetMenuContextHelpId(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSetMenuContextHelpId(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSetWindowContextHelpId(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellSetWindowContextHelpId(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSetWindowSubclass(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSetWindowSubclass(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellAboutA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellShellAboutA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellAboutW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellShellAboutW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellExecuteA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellShellExecuteA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellExecuteExA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellShellExecuteExA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellExecuteExW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellShellExecuteExW(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellExecuteW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellShellExecuteW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellMessageBoxA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32UiShellShellMessageBoxA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellMessageBoxW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32UiShellShellMessageBoxW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellGetCachedImageIndex(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellShellGetCachedImageIndex(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellGetCachedImageIndexA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellShellGetCachedImageIndexA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellGetCachedImageIndexW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellShellGetCachedImageIndexW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellGetImageLists(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellShellGetImageLists(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellMergeMenus(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32UiShellShellMergeMenus(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellNotifyIconA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellShellNotifyIconA(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellNotifyIconGetRect(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellShellNotifyIconGetRect(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellShellNotifyIconW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellShellNotifyIconW(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSignalFileOpen(p0)")
private external fun wasmWindowssysWindowsWin32UiShellSignalFileOpen(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellSoftwareUpdateMessageBox(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellSoftwareUpdateMessageBox(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStgMakeUniqueName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellStgMakeUniqueName(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCSpnA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCSpnA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCSpnIA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCSpnIA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCSpnIW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCSpnIW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCSpnW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCSpnW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCatBuffA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCatBuffA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCatBuffW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCatBuffW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCatChainW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrCatChainW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCatW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCatW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrChrA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrChrA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrChrIA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrChrIA(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrChrIW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrChrIW(p0: String, p1: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrChrNIW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrChrNIW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrChrNW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrChrNW(p0: String, p1: Int, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrChrW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrChrW(p0: String, p1: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpCA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpCA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpCW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpCW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpICA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpICA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpICW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpICW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpIW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpIW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpLogicalW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpLogicalW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNCA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNCA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNCW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNCW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNIA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNIA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNICA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNICA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNICW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNICW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNIW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNIW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpNW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpNW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCmpW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCmpW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCpyNW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrCpyNW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrCpyW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrCpyW(p0: String, p1: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrDupA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellStrDupA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrDupW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellStrDupW(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFormatByteSize64A(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrFormatByteSize64A(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFormatByteSizeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrFormatByteSizeA(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFormatByteSizeEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrFormatByteSizeEx(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFormatByteSizeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrFormatByteSizeW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFormatKBSizeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrFormatKBSizeA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFormatKBSizeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrFormatKBSizeW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFromTimeIntervalA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrFromTimeIntervalA(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrFromTimeIntervalW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrFromTimeIntervalW(p0: String, p1: Int, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrIsIntlEqualA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrIsIntlEqualA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrIsIntlEqualW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrIsIntlEqualW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrNCatA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrNCatA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrNCatW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrNCatW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrPBrkA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrPBrkA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrPBrkW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrPBrkW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRChrA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRChrA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRChrIA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRChrIA(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRChrIW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRChrIW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRChrW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRChrW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRStrIA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRStrIA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRStrIW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRStrIW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRetToBSTR(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRetToBSTR(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRetToBufA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrRetToBufA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRetToBufW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellStrRetToBufW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRetToStrA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRetToStrA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrRetToStrW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrRetToStrW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrSpnA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrSpnA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrSpnW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrSpnW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrStrA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrStrA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrStrIA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrStrIA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrStrIW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrStrIW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrStrNIW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrStrNIW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrStrNW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrStrNW(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrStrW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrStrW(p0: String, p1: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrToInt64ExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrToInt64ExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrToInt64ExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrToInt64ExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrToIntA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellStrToIntA(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrToIntExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrToIntExA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrToIntExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellStrToIntExW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrToIntW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellStrToIntW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrTrimA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrTrimA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellStrTrimW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellStrTrimW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUnloadUserProfile(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellUnloadUserProfile(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUnregisterScaleChangeEvent(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUnregisterScaleChangeEvent(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlApplySchemeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlApplySchemeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlApplySchemeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlApplySchemeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCanonicalizeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCanonicalizeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCanonicalizeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCanonicalizeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCombineA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCombineA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCombineW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCombineW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCompareA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCompareA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCompareW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCompareW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCreateFromPathA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCreateFromPathA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlCreateFromPathW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlCreateFromPathW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlEscapeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlEscapeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlEscapeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlEscapeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlFixupW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellUrlFixupW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlGetLocationA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUrlGetLocationA(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlGetLocationW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUrlGetLocationW(p0: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlGetPartA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellUrlGetPartA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlGetPartW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiShellUrlGetPartW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlHashA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellUrlHashA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlHashW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiShellUrlHashW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlIsA(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellUrlIsA(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlIsNoHistoryA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUrlIsNoHistoryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlIsNoHistoryW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUrlIsNoHistoryW(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlIsOpaqueA(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUrlIsOpaqueA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlIsOpaqueW(p0)")
private external fun wasmWindowssysWindowsWin32UiShellUrlIsOpaqueW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlIsW(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellUrlIsW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlUnescapeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlUnescapeA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellUrlUnescapeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellUrlUnescapeW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellVariantToStrRet(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiShellVariantToStrRet(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWhichPlatform()")
private external fun wasmWindowssysWindowsWin32UiShellWhichPlatform(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWin32DeleteFile(p0)")
private external fun wasmWindowssysWindowsWin32UiShellWin32DeleteFile(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWinHelpA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellWinHelpA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWinHelpW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellWinHelpW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWriteCabinetState(p0)")
private external fun wasmWindowssysWindowsWin32UiShellWriteCabinetState(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWnsprintfA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellWnsprintfA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWnsprintfW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32UiShellWnsprintfW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWvnsprintfA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellWvnsprintfA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiShellWvnsprintfW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiShellWvnsprintfW(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun assocCreate(clsid: Guid, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocCreateForClasses(rgclasses: ConstPtr<Associationelement>, cclasses: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocCreateForClasses(rgclasses.rawAddress.toString(), cclasses.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocGetDetailsOfPropKey(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, pkey: ConstPtr<Propertykey>, pv: MutPtr<Variant.Variant>, pffoundpropkey: MutPtr<Bool>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocGetDetailsOfPropKey(psf.rawAddress.toString(), pidl.rawAddress.toString(), pkey.rawAddress.toString(), pv.rawAddress.toString(), pffoundpropkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocGetPerceivedType(pszext: Pcwstr, ptype: MutPtr<Perceived>, pflag: MutPtr<UInt>, ppsztype: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocGetPerceivedType(pszext.rawAddress.toString(), ptype.rawAddress.toString(), pflag.rawAddress.toString(), ppsztype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocIsDangerous(pszassoc: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocIsDangerous(pszassoc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryKeyA(flags: Assocf, key: Assockey, pszassoc: Pcstr, pszextra: Pcstr, phkeyout: MutPtr<Hkey>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocQueryKeyA(flags.toInt(), key, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), phkeyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryKeyW(flags: Assocf, key: Assockey, pszassoc: Pcwstr, pszextra: Pcwstr, phkeyout: MutPtr<Hkey>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocQueryKeyW(flags.toInt(), key, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), phkeyout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringA(flags: Assocf, str: Assocstr, pszassoc: Pcstr, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocQueryStringA(flags.toInt(), str, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringByKeyA(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocQueryStringByKeyA(flags.toInt(), str, hkassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringByKeyW(flags: Assocf, str: Assocstr, hkassoc: Hkey, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocQueryStringByKeyW(flags.toInt(), str, hkassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun assocQueryStringW(flags: Assocf, str: Assocstr, pszassoc: Pcwstr, pszextra: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellAssocQueryStringW(flags.toInt(), str, pszassoc.rawAddress.toString(), pszextra.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cdefFolderMenuCreate2(pidlfolder: ConstPtr<Itemidlist>, hwnd: Hwnd, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, psf: MutPtr<CVoid>, pfn: Lpfndfmcallback, nkeys: UInt, ahkeys: ConstPtr<Hkey>, ppcm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellCdefFolderMenuCreate2(pidlfolder.rawAddress.toString(), hwnd.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), psf.rawAddress.toString(), 0L.toString(), nkeys.toInt(), ahkeys.rawAddress.toString(), ppcm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cidldataCreateFromIdarray(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, ppdtobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellCidldataCreateFromIdarray(pidlfolder.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), ppdtobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chrCmpIA(w1: UShort, w2: UShort): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellChrCmpIA(w1.toInt(), w2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chrCmpIW(w1: UShort, w2: UShort): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellChrCmpIW(w1.toInt(), w2.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorAdjustLuma(clrrgb: Colorref, n: Int, fscale: Bool): Colorref =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellColorAdjustLuma(clrrgb.toInt(), n, fscale).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorHLSToRGB(whue: UShort, wluminance: UShort, wsaturation: UShort): Colorref =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellColorHLSToRGB(whue.toInt(), wluminance.toInt(), wsaturation.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun colorRGBToHLS(clrrgb: Colorref, pwhue: MutPtr<UShort>, pwluminance: MutPtr<UShort>, pwsaturation: MutPtr<UShort>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellColorRGBToHLS(clrrgb.toInt(), pwhue.rawAddress.toString(), pwluminance.rawAddress.toString(), pwsaturation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun commandLineToArgvW(lpcmdline: Pcwstr, pnumargs: MutPtr<Int>): MutPtr<Pwstr> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellCommandLineToArgvW(lpcmdline.rawAddress.toString(), pnumargs.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun connectToConnectionPoint(punk: MutPtr<CVoid>, riidevent: ConstPtr<Guid>, fconnect: Bool, punktarget: MutPtr<CVoid>, pdwcookie: MutPtr<UInt>, ppcpout: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellConnectToConnectionPoint(punk.rawAddress.toString(), riidevent.rawAddress.toString(), fconnect, punktarget.rawAddress.toString(), pdwcookie.rawAddress.toString(), ppcpout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createProfile(pszusersid: Pcwstr, pszusername: Pcwstr, pszprofilepath: Pwstr, cchprofilepath: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellCreateProfile(pszusersid.rawAddress.toString(), pszusername.rawAddress.toString(), pszprofilepath.rawAddress.toString(), cchprofilepath.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadAutoScroll(hwnd: Hwnd, pad: MutPtr<AutoScrollData>, pptnow: ConstPtr<Point>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDadAutoScroll(hwnd.rawAddress.toString(), pad.rawAddress.toString(), pptnow.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragEnterEx(hwndtarget: Hwnd, ptstart: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragEnterEx2(hwndtarget: Hwnd, ptstart: Point, pdtobject: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragLeave(): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDadDragLeave() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadDragMove(pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadSetDragImage(him: Himagelist, pptoffset: MutPtr<Point>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDadSetDragImage(him.toString(), pptoffset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dadShowDragImage(fshow: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDadShowDragImage(fshow) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun defSubclassProc(hwnd: Hwnd, umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDefSubclassProc(hwnd.rawAddress.toString(), umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProfileA(lpsidstring: Pcstr, lpprofilepath: Pcstr, lpcomputername: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDeleteProfileA(lpsidstring.rawAddress.toString(), lpprofilepath.rawAddress.toString(), lpcomputername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteProfileW(lpsidstring: Pcwstr, lpprofilepath: Pcwstr, lpcomputername: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDeleteProfileW(lpsidstring.rawAddress.toString(), lpprofilepath.rawAddress.toString(), lpcomputername.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doEnvironmentSubstA(pszsrc: Pstr, cchsrc: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDoEnvironmentSubstA(pszsrc.rawAddress.toString(), cchsrc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doEnvironmentSubstW(pszsrc: Pwstr, cchsrc: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDoEnvironmentSubstW(pszsrc.rawAddress.toString(), cchsrc.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragAcceptFiles(hwnd: Hwnd, faccept: Bool) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellDragAcceptFiles(hwnd.rawAddress.toString(), faccept)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dragFinish(hdrop: Hdrop) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellDragFinish(hdrop.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun dragQueryFileA(hdrop: Hdrop, ifile: UInt, lpszfile: Pstr, cch: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDragQueryFileA(hdrop.rawAddress.toString(), ifile.toInt(), lpszfile.rawAddress.toString(), cch.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragQueryFileW(hdrop: Hdrop, ifile: UInt, lpszfile: Pwstr, cch: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDragQueryFileW(hdrop.rawAddress.toString(), ifile.toInt(), lpszfile.rawAddress.toString(), cch.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dragQueryPoint(hdrop: Hdrop, ppt: MutPtr<Point>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDragQueryPoint(hdrop.rawAddress.toString(), ppt.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun driveType(idrive: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellDriveType(idrive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun duplicateIcon(hinst: Hinstance, hicon: Hicon): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellDuplicateIcon(hinst.rawAddress.toString(), hicon.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconA(hinst: Hinstance, psziconpath: Pstr, piicon: MutPtr<UShort>): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellExtractAssociatedIconA(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piicon.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconExA(hinst: Hinstance, psziconpath: Pstr, piiconindex: MutPtr<UShort>, piiconid: MutPtr<UShort>): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellExtractAssociatedIconExA(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piiconindex.rawAddress.toString(), piiconid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconExW(hinst: Hinstance, psziconpath: Pwstr, piiconindex: MutPtr<UShort>, piiconid: MutPtr<UShort>): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellExtractAssociatedIconExW(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piiconindex.rawAddress.toString(), piiconid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractAssociatedIconW(hinst: Hinstance, psziconpath: Pwstr, piicon: MutPtr<UShort>): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellExtractAssociatedIconW(hinst.rawAddress.toString(), psziconpath.rawAddress.toString(), piicon.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconA(hinst: Hinstance, pszexefilename: Pcstr, niconindex: UInt): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellExtractIconA(hinst.rawAddress.toString(), pszexefilename.rawAddress.toString(), niconindex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconExA(lpszfile: Pcstr, niconindex: Int, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, nicons: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellExtractIconExA(lpszfile.rawAddress.toString(), niconindex, phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), nicons.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconExW(lpszfile: Pcwstr, niconindex: Int, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, nicons: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellExtractIconExW(lpszfile.rawAddress.toString(), niconindex, phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), nicons.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extractIconW(hinst: Hinstance, pszexefilename: Pcwstr, niconindex: UInt): Hicon =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellExtractIconW(hinst.rawAddress.toString(), pszexefilename.rawAddress.toString(), niconindex.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableA(lpfile: Pcstr, lpdirectory: Pcstr, lpresult: Pstr): Hinstance =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellFindExecutableA(lpfile.rawAddress.toString(), lpdirectory.rawAddress.toString(), lpresult.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findExecutableW(lpfile: Pcwstr, lpdirectory: Pcwstr, lpresult: Pwstr): Hinstance =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellFindExecutableW(lpfile.rawAddress.toString(), lpdirectory.rawAddress.toString(), lpresult.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAcceptLanguagesA(pszlanguages: Pstr, pcchlanguages: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetAcceptLanguagesA(pszlanguages.rawAddress.toString(), pcchlanguages.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAcceptLanguagesW(pszlanguages: Pwstr, pcchlanguages: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetAcceptLanguagesW(pszlanguages.rawAddress.toString(), pcchlanguages.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllUsersProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetAllUsersProfileDirectoryA(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAllUsersProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetAllUsersProfileDirectoryW(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentProcessExplicitAppUserModelID(appid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetCurrentProcessExplicitAppUserModelID(appid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultUserProfileDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryA(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDefaultUserProfileDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetDefaultUserProfileDirectoryW(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForShellUIComponent(param0: ShellUiComponent): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetDpiForShellUIComponent(param0).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFileNameFromBrowse(hwnd: Hwnd, pszfilepath: Pwstr, cchfilepath: UInt, pszworkingdir: Pcwstr, pszdefext: Pcwstr, pszfilters: Pcwstr, psztitle: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetFileNameFromBrowse(hwnd.rawAddress.toString(), pszfilepath.rawAddress.toString(), cchfilepath.toInt(), pszworkingdir.rawAddress.toString(), pszdefext.rawAddress.toString(), pszfilters.rawAddress.toString(), psztitle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuContextHelpId(param0: Hmenu): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetMenuContextHelpId(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMenuPosFromID(hmenu: Hmenu, id: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetMenuPosFromID(hmenu.rawAddress.toString(), id.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfileType(dwflags: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetProfileType(dwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfilesDirectoryA(lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetProfilesDirectoryA(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProfilesDirectoryW(lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetProfilesDirectoryW(lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScaleFactorForDevice(devicetype: DisplayDeviceType): DeviceScaleFactor =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetScaleFactorForDevice(devicetype) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getScaleFactorForMonitor(hmon: Hmonitor, pscale: MutPtr<DeviceScaleFactor>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetScaleFactorForMonitor(hmon.rawAddress.toString(), pscale.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserProfileDirectoryA(htoken: Handle, lpprofiledir: Pstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetUserProfileDirectoryA(htoken.rawAddress.toString(), lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserProfileDirectoryW(htoken: Handle, lpprofiledir: Pwstr, lpcchsize: MutPtr<UInt>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetUserProfileDirectoryW(htoken.rawAddress.toString(), lpprofiledir.rawAddress.toString(), lpcchsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowContextHelpId(param0: Hwnd): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetWindowContextHelpId(param0.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, pdwrefdata: MutPtr<ULong>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellGetWindowSubclass(hwnd.rawAddress.toString(), 0L.toString(), uidsubclass.toString(), pdwrefdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserFree(param0: ConstPtr<UInt>, param1: ConstPtr<Hmonitor>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellHmonitorUserFree(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmonitorUserFree64(param0: ConstPtr<UInt>, param1: ConstPtr<Hmonitor>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellHmonitorUserFree64(param0.rawAddress.toString(), param1.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hmonitorUserMarshal(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmonitor>): MutPtr<UByte> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellHmonitorUserMarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserMarshal64(param0: ConstPtr<UInt>, param1: MutPtr<UByte>, param2: ConstPtr<Hmonitor>): MutPtr<UByte> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellHmonitorUserMarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserSize(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmonitor>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHmonitorUserSize(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserSize64(param0: ConstPtr<UInt>, param1: UInt, param2: ConstPtr<Hmonitor>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHmonitorUserSize64(param0.rawAddress.toString(), param1.toInt(), param2.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserUnmarshal(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmonitor>): MutPtr<UByte> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellHmonitorUserUnmarshal(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hmonitorUserUnmarshal64(param0: ConstPtr<UInt>, param1: ConstPtr<UByte>, param2: MutPtr<Hmonitor>): MutPtr<UByte> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellHmonitorUserUnmarshal64(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashData(pbdata: ConstPtr<UByte>, cbdata: UInt, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHashData(pbdata.rawAddress.toString(), cbdata.toInt(), pbhash.rawAddress.toString(), cbhash.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkClone(pihl: MutPtr<CVoid>, riid: ConstPtr<Guid>, pihlsiteforclone: MutPtr<CVoid>, dwsitedata: UInt, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkClone(pihl.rawAddress.toString(), riid.rawAddress.toString(), pihlsiteforclone.rawAddress.toString(), dwsitedata.toInt(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateBrowseContext(piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateBrowseContext(piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateExtensionServices(pwzadditionalheaders: Pcwstr, phwnd: Hwnd, pszusername: Pcwstr, pszpassword: Pcwstr, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateExtensionServices(pwzadditionalheaders.rawAddress.toString(), phwnd.rawAddress.toString(), pszusername.rawAddress.toString(), pszpassword.rawAddress.toString(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromData(pidataobj: MutPtr<CVoid>, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateFromData(pidataobj.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromMoniker(pimktrgt: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateFromMoniker(pimktrgt.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateFromString(pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateFromString(pwztarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcut(grfhlshortcutf: UInt, pihl: MutPtr<CVoid>, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateShortcut(grfhlshortcutf.toInt(), pihl.rawAddress.toString(), pwzdir.rawAddress.toString(), pwzfilename.rawAddress.toString(), ppwzshortcutfile.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcutFromMoniker(grfhlshortcutf: UInt, pimktarget: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateShortcutFromMoniker(grfhlshortcutf.toInt(), pimktarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzdir.rawAddress.toString(), pwzfilename.rawAddress.toString(), ppwzshortcutfile.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkCreateShortcutFromString(grfhlshortcutf: UInt, pwztarget: Pcwstr, pwzlocation: Pcwstr, pwzdir: Pcwstr, pwzfilename: Pcwstr, ppwzshortcutfile: MutPtr<Pwstr>, dwreserved: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkCreateShortcutFromString(grfhlshortcutf.toInt(), pwztarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzdir.rawAddress.toString(), pwzfilename.rawAddress.toString(), ppwzshortcutfile.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGetSpecialReference(ureference: UInt, ppwzreference: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkGetSpecialReference(ureference.toInt(), ppwzreference.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkGetValueFromParams(pwzparams: Pcwstr, pwzname: Pcwstr, ppwzvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkGetValueFromParams(pwzparams.rawAddress.toString(), pwzname.rawAddress.toString(), ppwzvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkIsShortcut(pwzfilename: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkIsShortcut(pwzfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigate(pihl: MutPtr<CVoid>, pihlframe: MutPtr<CVoid>, grfhlnf: UInt, pbc: MutPtr<CVoid>, pibsc: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkNavigate(pihl.rawAddress.toString(), pihlframe.rawAddress.toString(), grfhlnf.toInt(), pbc.rawAddress.toString(), pibsc.rawAddress.toString(), pihlbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkNavigateToStringReference(pwztarget: Pcwstr, pwzlocation: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, pihlframe: MutPtr<CVoid>, grfhlnf: UInt, pibc: MutPtr<CVoid>, pibsc: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkNavigateToStringReference(pwztarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), pihlframe.rawAddress.toString(), grfhlnf.toInt(), pibc.rawAddress.toString(), pibsc.rawAddress.toString(), pihlbc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkOnNavigate(pihlframe: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>, grfhlnf: UInt, pimktarget: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr, puhlid: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkOnNavigate(pihlframe.rawAddress.toString(), pihlbc.rawAddress.toString(), grfhlnf.toInt(), pimktarget.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString(), puhlid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkOnRenameDocument(dwreserved: UInt, pihlbc: MutPtr<CVoid>, pimkold: MutPtr<CVoid>, pimknew: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkOnRenameDocument(dwreserved.toInt(), pihlbc.rawAddress.toString(), pimkold.rawAddress.toString(), pimknew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkParseDisplayName(pibc: MutPtr<CVoid>, pwzdisplayname: Pcwstr, fnoforceabs: Bool, pccheaten: MutPtr<UInt>, ppimk: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkParseDisplayName(pibc.rawAddress.toString(), pwzdisplayname.rawAddress.toString(), fnoforceabs, pccheaten.rawAddress.toString(), ppimk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkPreprocessMoniker(pibc: MutPtr<CVoid>, pimkin: MutPtr<CVoid>, ppimkout: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkPreprocessMoniker(pibc.rawAddress.toString(), pimkin.rawAddress.toString(), ppimkout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkQueryCreateFromData(pidataobj: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkQueryCreateFromData(pidataobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveMonikerForData(pimkreference: MutPtr<CVoid>, reserved: UInt, pibc: MutPtr<CVoid>, cfmtetc: UInt, rgfmtetc: MutPtr<Formatetc>, pibsc: MutPtr<CVoid>, pimkbase: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkResolveMonikerForData(pimkreference.rawAddress.toString(), reserved.toInt(), pibc.rawAddress.toString(), cfmtetc.toInt(), rgfmtetc.rawAddress.toString(), pibsc.rawAddress.toString(), pimkbase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcut(pwzshortcutfilename: Pcwstr, pihlsite: MutPtr<CVoid>, dwsitedata: UInt, piunkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkResolveShortcut(pwzshortcutfilename.rawAddress.toString(), pihlsite.rawAddress.toString(), dwsitedata.toInt(), piunkouter.rawAddress.toString(), riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcutToMoniker(pwzshortcutfilename: Pcwstr, ppimktarget: MutPtr<MutPtr<CVoid>>, ppwzlocation: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkResolveShortcutToMoniker(pwzshortcutfilename.rawAddress.toString(), ppimktarget.rawAddress.toString(), ppwzlocation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveShortcutToString(pwzshortcutfilename: Pcwstr, ppwztarget: MutPtr<Pwstr>, ppwzlocation: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkResolveShortcutToString(pwzshortcutfilename.rawAddress.toString(), ppwztarget.rawAddress.toString(), ppwzlocation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkResolveStringForData(pwzreference: Pcwstr, reserved: UInt, pibc: MutPtr<CVoid>, cfmtetc: UInt, rgfmtetc: MutPtr<Formatetc>, pibsc: MutPtr<CVoid>, pimkbase: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkResolveStringForData(pwzreference.rawAddress.toString(), reserved.toInt(), pibc.rawAddress.toString(), cfmtetc.toInt(), rgfmtetc.rawAddress.toString(), pibsc.rawAddress.toString(), pimkbase.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkSetSpecialReference(ureference: UInt, pwzreference: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkSetSpecialReference(ureference.toInt(), pwzreference.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkTranslateURL(pwzurl: Pcwstr, grfflags: UInt, ppwztranslatedurl: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkTranslateURL(pwzurl.rawAddress.toString(), grfflags.toInt(), ppwztranslatedurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hlinkUpdateStackItem(pihlframe: MutPtr<CVoid>, pihlbc: MutPtr<CVoid>, uhlid: UInt, pimktrgt: MutPtr<CVoid>, pwzlocation: Pcwstr, pwzfriendlyname: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellHlinkUpdateStackItem(pihlframe.rawAddress.toString(), pihlbc.rawAddress.toString(), uhlid.toInt(), pimktrgt.rawAddress.toString(), pwzlocation.rawAddress.toString(), pwzfriendlyname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLAppendID(pidl: ConstPtr<Itemidlist>, pmkid: ConstPtr<Shitemid>, fappend: Bool): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILAppendID(pidl.rawAddress.toString(), pmkid.rawAddress.toString(), fappend).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLClone(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILClone(pidl.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCloneFirst(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILCloneFirst(pidl.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCombine(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILCombine(pidl1.rawAddress.toString(), pidl2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCreateFromPathA(pszpath: Pcstr): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILCreateFromPathA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLCreateFromPathW(pszpath: Pcwstr): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILCreateFromPathW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFindChild(pidlparent: ConstPtr<Itemidlist>, pidlchild: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILFindChild(pidlparent.rawAddress.toString(), pidlchild.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFindLastID(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILFindLastID(pidl.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLFree(pidl: ConstPtr<Itemidlist>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellILFree(pidl.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iLGetNext(pidl: ConstPtr<Itemidlist>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellILGetNext(pidl.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLGetSize(pidl: ConstPtr<Itemidlist>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellILGetSize(pidl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLIsEqual(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellILIsEqual(pidl1.rawAddress.toString(), pidl2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLIsParent(pidl1: ConstPtr<Itemidlist>, pidl2: ConstPtr<Itemidlist>, fimmediate: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellILIsParent(pidl1.rawAddress.toString(), pidl2.rawAddress.toString(), fimmediate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLLoadFromStreamEx(pstm: MutPtr<CVoid>, pidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellILLoadFromStreamEx(pstm.rawAddress.toString(), pidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLRemoveLastID(pidl: MutPtr<Itemidlist>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellILRemoveLastID(pidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iLSaveToStream(pstm: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellILSaveToStream(pstm.rawAddress.toString(), pidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamCopy(pstmfrom: MutPtr<CVoid>, pstmto: MutPtr<CVoid>, cb: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamCopy(pstmfrom.rawAddress.toString(), pstmto.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamRead(pstm: MutPtr<CVoid>, pv: MutPtr<CVoid>, cb: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamRead(pstm.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReadPidl(pstm: MutPtr<CVoid>, ppidlout: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamReadPidl(pstm.rawAddress.toString(), ppidlout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReadStr(pstm: MutPtr<CVoid>, ppsz: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamReadStr(pstm.rawAddress.toString(), ppsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamReset(pstm: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamReset(pstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamSize(pstm: MutPtr<CVoid>, pui: MutPtr<ULong>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamSize(pstm.rawAddress.toString(), pui.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWrite(pstm: MutPtr<CVoid>, pv: ConstPtr<CVoid>, cb: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamWrite(pstm.rawAddress.toString(), pv.rawAddress.toString(), cb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWritePidl(pstm: MutPtr<CVoid>, pidlwrite: ConstPtr<Itemidlist>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamWritePidl(pstm.rawAddress.toString(), pidlwrite.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun istreamWriteStr(pstm: MutPtr<CVoid>, psz: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIstreamWriteStr(pstm.rawAddress.toString(), psz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownAtomicRelease(ppunk: MutPtr<MutPtr<CVoid>>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellIunknownAtomicRelease(ppunk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iunknownGetSite(punk: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIunknownGetSite(punk.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownGetWindow(punk: MutPtr<CVoid>, phwnd: MutPtr<Hwnd>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIunknownGetWindow(punk.rawAddress.toString(), phwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownQueryService(punk: MutPtr<CVoid>, guidservice: ConstPtr<Guid>, riid: ConstPtr<Guid>, ppvout: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIunknownQueryService(punk.rawAddress.toString(), guidservice.rawAddress.toString(), riid.rawAddress.toString(), ppvout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun iunknownSet(ppunk: MutPtr<MutPtr<CVoid>>, punk: MutPtr<CVoid>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellIunknownSet(ppunk.rawAddress.toString(), punk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun iunknownSetSite(punk: MutPtr<CVoid>, punksite: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIunknownSetSite(punk.rawAddress.toString(), punksite.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importPrivacySettings(pszfilename: Pcwstr, pfparseprivacypreferences: MutPtr<Bool>, pfparsepersiterules: MutPtr<Bool>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellImportPrivacySettings(pszfilename.rawAddress.toString(), pfparseprivacypreferences.rawAddress.toString(), pfparsepersiterules.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initNetworkAddressControl(): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellInitNetworkAddressControl() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initPropVariantFromStrRet(pstrret: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellInitPropVariantFromStrRet(pstrret.rawAddress.toString(), pidl.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initVariantFromStrRet(pstrret: ConstPtr<Strret>, pidl: ConstPtr<Itemidlist>, pvar: MutPtr<Variant.Variant>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellInitVariantFromStrRet(pstrret.rawAddress.toString(), pidl.rawAddress.toString(), pvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intlStrEqWorkerA(fcasesens: Bool, lpstring1: Pcstr, lpstring2: Pcstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIntlStrEqWorkerA(fcasesens, lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intlStrEqWorkerW(fcasesens: Bool, lpstring1: Pcwstr, lpstring2: Pcwstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIntlStrEqWorkerW(fcasesens, lpstring1.rawAddress.toString(), lpstring2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharSpaceA(wch: Byte): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsCharSpaceA(wch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isCharSpaceW(wch: UShort): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsCharSpaceW(wch.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isInternetESCEnabled(): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsInternetESCEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLFNDriveA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsLFNDriveA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isLFNDriveW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsLFNDriveW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isNetDrive(idrive: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsNetDrive(idrive) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isOS(dwos: OS): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsOS(dwos.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUserAnAdmin(): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellIsUserAnAdmin() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUserProfileA(htoken: Handle, lpprofileinfo: MutPtr<Profileinfoa>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellLoadUserProfileA(htoken.rawAddress.toString(), lpprofileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUserProfileW(htoken: Handle, lpprofileinfo: MutPtr<Profileinfow>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellLoadUserProfileW(htoken.rawAddress.toString(), lpprofileinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun oleSaveToStreamEx(piunk: MutPtr<CVoid>, pistm: MutPtr<CVoid>, fcleardirty: Bool): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellOleSaveToStreamEx(piunk.rawAddress.toString(), pistm.rawAddress.toString(), fcleardirty) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openRegStream(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellOpenRegStream(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseURLA(pcszurl: Pcstr, ppu: MutPtr<Parsedurla>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellParseURLA(pcszurl.rawAddress.toString(), ppu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseURLW(pcszurl: Pcwstr, ppu: MutPtr<Parsedurlw>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellParseURLW(pcszurl.rawAddress.toString(), ppu.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddBackslashA(pszpath: Pstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathAddBackslashA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddBackslashW(pszpath: Pwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathAddBackslashW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathAddExtensionA(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAddExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathAddExtensionW(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAllocCanonicalize(pszpathin: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathAllocCanonicalize(pszpathin.rawAddress.toString(), dwflags.toInt(), ppszpathout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAllocCombine(pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions, ppszpathout: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathAllocCombine(pszpathin.rawAddress.toString(), pszmore.rawAddress.toString(), dwflags.toInt(), ppszpathout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAppendA(pszpath: Pstr, pszmore: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathAppendA(pszpath.rawAddress.toString(), pszmore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathAppendW(pszpath: Pwstr, pszmore: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathAppendW(pszpath.rawAddress.toString(), pszmore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathBuildRootA(pszroot: Pstr, idrive: Int): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathBuildRootA(pszroot.rawAddress.toString(), idrive).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathBuildRootW(pszroot: Pwstr, idrive: Int): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathBuildRootW(pszroot.rawAddress.toString(), idrive).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCanonicalizeA(pszbuf: Pstr, pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCanonicalizeA(pszbuf.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCanonicalizeW(pszbuf: Pwstr, pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCanonicalizeW(pszbuf.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchAddBackslash(pszpath.rawAddress.toString(), cchpath.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr<Pwstr>, pcchremaining: MutPtr<ULong>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchAddBackslashEx(pszpath.rawAddress.toString(), cchpath.toString(), ppszend.rawAddress.toString(), pcchremaining.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAddExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchAddExtension(pszpath.rawAddress.toString(), cchpath.toString(), pszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAppend(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchAppend(pszpath.rawAddress.toString(), cchpath.toString(), pszmore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchAppendEx(pszpath: Pwstr, cchpath: ULong, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchAppendEx(pszpath.rawAddress.toString(), cchpath.toString(), pszmore.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCanonicalize(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchCanonicalize(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCanonicalizeEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchCanonicalizeEx(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCombine(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchCombine(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString(), pszmore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchCombineEx(pszpathout: Pwstr, cchpathout: ULong, pszpathin: Pcwstr, pszmore: Pcwstr, dwflags: PathcchOptions): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchCombineEx(pszpathout.rawAddress.toString(), cchpathout.toString(), pszpathin.rawAddress.toString(), pszmore.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchFindExtension(pszpath: Pcwstr, cchpath: ULong, ppszext: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchFindExtension(pszpath.rawAddress.toString(), cchpath.toString(), ppszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchIsRoot(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchIsRoot(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveBackslash(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchRemoveBackslash(pszpath.rawAddress.toString(), cchpath.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveBackslashEx(pszpath: Pwstr, cchpath: ULong, ppszend: MutPtr<Pwstr>, pcchremaining: MutPtr<ULong>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchRemoveBackslashEx(pszpath.rawAddress.toString(), cchpath.toString(), ppszend.rawAddress.toString(), pcchremaining.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveExtension(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchRemoveExtension(pszpath.rawAddress.toString(), cchpath.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRemoveFileSpec(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchRemoveFileSpec(pszpath.rawAddress.toString(), cchpath.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchRenameExtension(pszpath: Pwstr, cchpath: ULong, pszext: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchRenameExtension(pszpath.rawAddress.toString(), cchpath.toString(), pszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchSkipRoot(pszpath: Pcwstr, ppszrootend: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchSkipRoot(pszpath.rawAddress.toString(), ppszrootend.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchStripPrefix(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchStripPrefix(pszpath.rawAddress.toString(), cchpath.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCchStripToRoot(pszpath: Pwstr, cchpath: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCchStripToRoot(pszpath.rawAddress.toString(), cchpath.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCleanupSpec(pszdir: Pcwstr, pszspec: Pwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCleanupSpec(pszdir.rawAddress.toString(), pszspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCombineA(pszdest: Pstr, pszdir: Pcstr, pszfile: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathCombineA(pszdest.rawAddress.toString(), pszdir.rawAddress.toString(), pszfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCombineW(pszdest: Pwstr, pszdir: Pcwstr, pszfile: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathCombineW(pszdest.rawAddress.toString(), pszdir.rawAddress.toString(), pszfile.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCommonPrefixA(pszfile1: Pcstr, pszfile2: Pcstr, achpath: Pstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCommonPrefixA(pszfile1.rawAddress.toString(), pszfile2.rawAddress.toString(), achpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCommonPrefixW(pszfile1: Pcwstr, pszfile2: Pcwstr, achpath: Pwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCommonPrefixW(pszfile1.rawAddress.toString(), pszfile2.rawAddress.toString(), achpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathA(hdc: Hdc, pszpath: Pstr, dx: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCompactPathA(hdc.rawAddress.toString(), pszpath.rawAddress.toString(), dx.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathExA(pszout: Pstr, pszsrc: Pcstr, cchmax: UInt, dwflags: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCompactPathExA(pszout.rawAddress.toString(), pszsrc.rawAddress.toString(), cchmax.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathExW(pszout: Pwstr, pszsrc: Pcwstr, cchmax: UInt, dwflags: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCompactPathExW(pszout.rawAddress.toString(), pszsrc.rawAddress.toString(), cchmax.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCompactPathW(hdc: Hdc, pszpath: Pwstr, dx: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCompactPathW(hdc.rawAddress.toString(), pszpath.rawAddress.toString(), dx.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlA(pszurl: Pcstr, pszpath: Pstr, pcchpath: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCreateFromUrlA(pszurl.rawAddress.toString(), pszpath.rawAddress.toString(), pcchpath.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlAlloc(pszin: Pcwstr, ppszout: MutPtr<Pwstr>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCreateFromUrlAlloc(pszin.rawAddress.toString(), ppszout.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathCreateFromUrlW(pszurl: Pcwstr, pszpath: Pwstr, pcchpath: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathCreateFromUrlW(pszurl.rawAddress.toString(), pszpath.rawAddress.toString(), pcchpath.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFileExistsA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathFileExistsA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFileExistsW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathFileExistsW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindExtensionA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathFindExtensionA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindExtensionW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathFindExtensionW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindFileNameA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathFindFileNameA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindFileNameW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathFindFileNameW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindNextComponentA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathFindNextComponentA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindNextComponentW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathFindNextComponentW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindOnPathA(pszpath: Pstr, ppszotherdirs: ConstPtr<ConstPtr<Byte>>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathFindOnPathA(pszpath.rawAddress.toString(), ppszotherdirs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindOnPathW(pszpath: Pwstr, ppszotherdirs: ConstPtr<ConstPtr<UShort>>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathFindOnPathW(pszpath.rawAddress.toString(), ppszotherdirs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindSuffixArrayA(pszpath: Pcstr, apszsuffix: ConstPtr<Pcstr>, iarraysize: Int): Pcstr =
    if (windowsWin32UiShellNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32UiShellPathFindSuffixArrayA(pszpath.rawAddress.toString(), apszsuffix.rawAddress.toString(), iarraysize).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathFindSuffixArrayW(pszpath: Pcwstr, apszsuffix: ConstPtr<Pcwstr>, iarraysize: Int): Pcwstr =
    if (windowsWin32UiShellNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32UiShellPathFindSuffixArrayW(pszpath.rawAddress.toString(), apszsuffix.rawAddress.toString(), iarraysize).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetArgsA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathGetArgsA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetArgsW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathGetArgsW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetCharTypeA(ch: UByte): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathGetCharTypeA(ch.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetCharTypeW(ch: UShort): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathGetCharTypeW(ch.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetDriveNumberA(pszpath: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathGetDriveNumberA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetDriveNumberW(pszpath: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathGetDriveNumberW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathGetShortPath(pszlongpath: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathGetShortPath(pszlongpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathIsContentTypeA(pszpath: Pcstr, pszcontenttype: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsContentTypeA(pszpath.rawAddress.toString(), pszcontenttype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsContentTypeW(pszpath: Pcwstr, pszcontenttype: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsContentTypeW(pszpath.rawAddress.toString(), pszcontenttype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsDirectoryA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryEmptyA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsDirectoryEmptyA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryEmptyW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsDirectoryEmptyW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsDirectoryW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsDirectoryW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsExe(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsExe(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsFileSpecA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsFileSpecA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsFileSpecW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsFileSpecW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsLFNFileSpecA(pszname: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsLFNFileSpecA(pszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsLFNFileSpecW(pszname: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsLFNFileSpecW(pszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsNetworkPathA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsNetworkPathA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsNetworkPathW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsNetworkPathW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsPrefixA(pszprefix: Pcstr, pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsPrefixA(pszprefix.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsPrefixW(pszprefix: Pcwstr, pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsPrefixW(pszprefix.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRelativeA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsRelativeA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRelativeW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsRelativeW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRootA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsRootA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsRootW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsRootW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSameRootA(pszpath1: Pcstr, pszpath2: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsSameRootA(pszpath1.rawAddress.toString(), pszpath2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSameRootW(pszpath1: Pcwstr, pszpath2: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsSameRootW(pszpath1.rawAddress.toString(), pszpath2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSlowA(pszfile: Pcstr, dwattr: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsSlowA(pszfile.rawAddress.toString(), dwattr.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSlowW(pszfile: Pcwstr, dwattr: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsSlowW(pszfile.rawAddress.toString(), dwattr.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSystemFolderA(pszpath: Pcstr, dwattrb: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsSystemFolderA(pszpath.rawAddress.toString(), dwattrb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsSystemFolderW(pszpath: Pcwstr, dwattrb: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsSystemFolderW(pszpath.rawAddress.toString(), dwattrb.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCEx(pszpath: Pcwstr, ppszserver: MutPtr<Pcwstr>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCEx(pszpath.rawAddress.toString(), ppszserver.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCServerA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerShareA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCServerShareA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerShareW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCServerShareW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCServerW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCServerW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsUNCW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsUNCW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsURLA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsURLA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathIsURLW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathIsURLW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakePrettyA(pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMakePrettyA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakePrettyW(pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMakePrettyW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeSystemFolderA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMakeSystemFolderA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeSystemFolderW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMakeSystemFolderW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMakeUniqueName(pszuniquename: Pwstr, cchmax: UInt, psztemplate: Pcwstr, pszlongplate: Pcwstr, pszdir: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMakeUniqueName(pszuniquename.rawAddress.toString(), cchmax.toInt(), psztemplate.rawAddress.toString(), pszlongplate.rawAddress.toString(), pszdir.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecA(pszfile: Pcstr, pszspec: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMatchSpecA(pszfile.rawAddress.toString(), pszspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecExA(pszfile: Pcstr, pszspec: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMatchSpecExA(pszfile.rawAddress.toString(), pszspec.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecExW(pszfile: Pcwstr, pszspec: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMatchSpecExW(pszfile.rawAddress.toString(), pszspec.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathMatchSpecW(pszfile: Pcwstr, pszspec: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathMatchSpecW(pszfile.rawAddress.toString(), pszspec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathParseIconLocationA(psziconfile: Pstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathParseIconLocationA(psziconfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathParseIconLocationW(psziconfile: Pwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathParseIconLocationW(psziconfile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathQualify(psz: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathQualify(psz.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathQuoteSpacesA(lpsz: Pstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathQuoteSpacesA(lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathQuoteSpacesW(lpsz: Pwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathQuoteSpacesW(lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRelativePathToA(pszpath: Pstr, pszfrom: Pcstr, dwattrfrom: UInt, pszto: Pcstr, dwattrto: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathRelativePathToA(pszpath.rawAddress.toString(), pszfrom.rawAddress.toString(), dwattrfrom.toInt(), pszto.rawAddress.toString(), dwattrto.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRelativePathToW(pszpath: Pwstr, pszfrom: Pcwstr, dwattrfrom: UInt, pszto: Pcwstr, dwattrto: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathRelativePathToW(pszpath.rawAddress.toString(), pszfrom.rawAddress.toString(), dwattrfrom.toInt(), pszto.rawAddress.toString(), dwattrto.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveArgsA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathRemoveArgsA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveArgsW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathRemoveArgsW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveBackslashA(pszpath: Pstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathRemoveBackslashA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveBackslashW(pszpath: Pwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathRemoveBackslashW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveBlanksA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathRemoveBlanksA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveBlanksW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathRemoveBlanksW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveExtensionA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathRemoveExtensionA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveExtensionW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathRemoveExtensionW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathRemoveFileSpecA(pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathRemoveFileSpecA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRemoveFileSpecW(pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathRemoveFileSpecW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRenameExtensionA(pszpath: Pstr, pszext: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathRenameExtensionA(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathRenameExtensionW(pszpath: Pwstr, pszext: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathRenameExtensionW(pszpath.rawAddress.toString(), pszext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathResolve(pszpath: Pwstr, dirs: ConstPtr<ConstPtr<UShort>>, fflags: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathResolve(pszpath.rawAddress.toString(), dirs.rawAddress.toString(), fflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSearchAndQualifyA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathSearchAndQualifyA(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSearchAndQualifyW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathSearchAndQualifyW(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSetDlgItemPathA(hdlg: Hwnd, id: Int, pszpath: Pcstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathSetDlgItemPathA(hdlg.rawAddress.toString(), id, pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathSetDlgItemPathW(hdlg: Hwnd, id: Int, pszpath: Pcwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathSetDlgItemPathW(hdlg.rawAddress.toString(), id, pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathSkipRootA(pszpath: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathSkipRootA(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathSkipRootW(pszpath: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellPathSkipRootW(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathStripPathA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathStripPathA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathStripPathW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathStripPathW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathStripToRootA(pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathStripToRootA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathStripToRootW(pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathStripToRootW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnExpandEnvStringsA(pszpath: Pcstr, pszbuf: Pstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathUnExpandEnvStringsA(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnExpandEnvStringsW(pszpath: Pcwstr, pszbuf: Pwstr, cchbuf: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathUnExpandEnvStringsW(pszpath.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUndecorateA(pszpath: Pstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathUndecorateA(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathUndecorateW(pszpath: Pwstr) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellPathUndecorateW(pszpath.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun pathUnmakeSystemFolderA(pszpath: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathUnmakeSystemFolderA(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnmakeSystemFolderW(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathUnmakeSystemFolderW(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnquoteSpacesA(lpsz: Pstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathUnquoteSpacesA(lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathUnquoteSpacesW(lpsz: Pwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathUnquoteSpacesW(lpsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathYetAnotherMakeUniqueName(pszuniquename: Pwstr, pszpath: Pcwstr, pszshort: Pcwstr, pszfilespec: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPathYetAnotherMakeUniqueName(pszuniquename.rawAddress.toString(), pszpath.rawAddress.toString(), pszshort.rawAddress.toString(), pszfilespec.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pickIconDlg(hwnd: Hwnd, psziconpath: Pwstr, cchiconpath: UInt, piiconindex: MutPtr<Int>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPickIconDlg(hwnd.rawAddress.toString(), psziconpath.rawAddress.toString(), cchiconpath.toInt(), piiconindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun propVariantToStrRet(propvar: ConstPtr<Propvariant>, pstrret: MutPtr<Strret>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellPropVariantToStrRet(propvar.rawAddress.toString(), pstrret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun qISearch(that: MutPtr<CVoid>, pqit: ConstPtr<Qitab>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellQISearch(that.rawAddress.toString(), pqit.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readCabinetState(pcs: MutPtr<Cabinetstate>, clength: Int): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellReadCabinetState(pcs.rawAddress.toString(), clength) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realDriveType(idrive: Int, foktohitnet: Bool): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRealDriveType(idrive, foktohitnet) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppConstrainedChangeNotification(routine: PappconstrainChangeRoutine, context: ConstPtr<CVoid>, registration: MutPtr<PappconstrainRegistration>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRegisterAppConstrainedChangeNotification(0L.toString(), context.rawAddress.toString(), registration.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerAppStateChangeNotification(routine: PappstateChangeRoutine, context: ConstPtr<CVoid>, registration: MutPtr<PappstateRegistration>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRegisterAppStateChangeNotification(0L.toString(), context.rawAddress.toString(), registration.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerScaleChangeEvent(hevent: Handle, pdwcookie: MutPtr<ULong>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRegisterScaleChangeEvent(hevent.rawAddress.toString(), pdwcookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerScaleChangeNotifications(displaydevice: DisplayDeviceType, hwndnotify: Hwnd, umsgnotify: UInt, pdwcookie: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRegisterScaleChangeNotifications(displaydevice, hwndnotify.rawAddress.toString(), umsgnotify.toInt(), pdwcookie.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRemoveWindowSubclass(hwnd.rawAddress.toString(), 0L.toString(), uidsubclass.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartDialog(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRestartDialog(hwnd.rawAddress.toString(), pszprompt.rawAddress.toString(), dwreturn.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restartDialogEx(hwnd: Hwnd, pszprompt: Pcwstr, dwreturn: UInt, dwreasoncode: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRestartDialogEx(hwnd.rawAddress.toString(), pszprompt.rawAddress.toString(), dwreturn.toInt(), dwreasoncode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revokeScaleChangeNotifications(displaydevice: DisplayDeviceType, dwcookie: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellRevokeScaleChangeNotifications(displaydevice, dwcookie.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddFromPropSheetExtArray(hpsxa: Hpsxa, lpfnaddpage: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAddToRecentDocs(uflags: UInt, pv: ConstPtr<CVoid>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHAddToRecentDocs(uflags.toInt(), pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHAlloc(cb: ULong): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHAlloc(cb.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAllocShared(pvdata: ConstPtr<CVoid>, dwsize: UInt, dwprocessid: UInt): Handle =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHAllocShared(pvdata.rawAddress.toString(), dwsize.toInt(), dwprocessid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAnsiToAnsi(pszsrc: Pcstr, pszdst: Pstr, cchbuf: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHAnsiToAnsi(pszsrc.rawAddress.toString(), pszdst.rawAddress.toString(), cchbuf) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAnsiToUnicode(pszsrc: Pcstr, pwszdst: Pwstr, cwchbuf: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHAnsiToUnicode(pszsrc.rawAddress.toString(), pwszdst.rawAddress.toString(), cwchbuf) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAppBarMessage(dwmessage: UInt, pdata: MutPtr<Appbardata>): ULong =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHAppBarMessage(dwmessage.toInt(), pdata.rawAddress.toString()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAssocEnumHandlers(pszextra: Pcwstr, affilter: AssocFilter, ppenumhandler: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHAssocEnumHandlers(pszextra.rawAddress.toString(), affilter, ppenumhandler.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAssocEnumHandlersForProtocolByApplication(protocol: Pcwstr, riid: ConstPtr<Guid>, enumhandlers: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHAssocEnumHandlersForProtocolByApplication(protocol.rawAddress.toString(), riid.rawAddress.toString(), enumhandlers.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHAutoComplete(hwndedit: Hwnd, dwflags: ShellAutocompleteFlags): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHAutoComplete(hwndedit.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToFolderIDListParent(psfroot: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHBindToFolderIDListParent(psfroot.rawAddress.toString(), pidl.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString(), ppidllast.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToFolderIDListParentEx(psfroot: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, ppbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHBindToFolderIDListParentEx(psfroot.rawAddress.toString(), pidl.rawAddress.toString(), ppbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString(), ppidllast.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToObject(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHBindToObject(psf.rawAddress.toString(), pidl.rawAddress.toString(), pbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBindToParent(pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>, ppidllast: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHBindToParent(pidl.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString(), ppidllast.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBrowseForFolderA(lpbi: ConstPtr<Browseinfoa>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHBrowseForFolderA(lpbi.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHBrowseForFolderW(lpbi: ConstPtr<Browseinfow>): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHBrowseForFolderW(lpbi.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCLSIDFromString(psz: Pcwstr, pclsid: MutPtr<Guid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCLSIDFromString(psz.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shchangeNotificationLock(hchange: Handle, dwprocid: UInt, pppidl: MutPtr<MutPtr<MutPtr<Itemidlist>>>, plevent: MutPtr<Int>): Handle =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellShchangeNotificationLock(hchange.rawAddress.toString(), dwprocid.toInt(), pppidl.rawAddress.toString(), plevent.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shchangeNotificationUnlock(hlock: Handle): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShchangeNotificationUnlock(hlock.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotify(weventid: Int, uflags: ShcnfFlags, dwitem1: ConstPtr<CVoid>, dwitem2: ConstPtr<CVoid>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHChangeNotify(weventid, uflags.toInt(), dwitem1.rawAddress.toString(), dwitem2.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHChangeNotifyDeregister(ulid: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHChangeNotifyDeregister(ulid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotifyRegister(hwnd: Hwnd, fsources: ShcnrfSource, fevents: Int, wmsg: UInt, centries: Int, pshcne: ConstPtr<SHChangeNotifyEntry>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHChangeNotifyRegister(hwnd.rawAddress.toString(), fsources, fevents, wmsg.toInt(), centries, pshcne.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHChangeNotifyRegisterThread(status: ScnrtStatus) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHChangeNotifyRegisterThread(status)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHCloneSpecialIDList(hwnd: Hwnd, csidl: Int, fcreate: Bool): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHCloneSpecialIDList(hwnd.rawAddress.toString(), csidl, fcreate).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCoCreateInstance(pszclsid: Pcwstr, pclsid: ConstPtr<Guid>, punkouter: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCoCreateInstance(pszclsid.rawAddress.toString(), pclsid.rawAddress.toString(), punkouter.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCopyKeyA(hkeysrc: Hkey, pszsrcsubkey: Pcstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCopyKeyA(hkeysrc.rawAddress.toString(), pszsrcsubkey.rawAddress.toString(), hkeydest.rawAddress.toString(), freserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCopyKeyW(hkeysrc: Hkey, pszsrcsubkey: Pcwstr, hkeydest: Hkey, freserved: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCopyKeyW(hkeysrc.rawAddress.toString(), pszsrcsubkey.rawAddress.toString(), hkeydest.rawAddress.toString(), freserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateAssociationRegistration(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateAssociationRegistration(riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDataObject(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, pdtinner: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDataObject(pidlfolder.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), pdtinner.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultContextMenu(pdcm: ConstPtr<Defcontextmenu>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDefaultContextMenu(pdcm.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultExtractIcon(riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDefaultExtractIcon(riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDefaultPropertiesOp(psi: MutPtr<CVoid>, ppfileop: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDefaultPropertiesOp(psi.rawAddress.toString(), ppfileop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectory(hwnd: Hwnd, pszpath: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDirectory(hwnd.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectoryExA(hwnd: Hwnd, pszpath: Pcstr, psa: ConstPtr<SecurityAttributes>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDirectoryExA(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateDirectoryExW(hwnd: Hwnd, pszpath: Pcwstr, psa: ConstPtr<SecurityAttributes>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateDirectoryExW(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), psa.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateFileExtractIconW(pszfile: Pcwstr, dwfileattributes: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateFileExtractIconW(pszfile.rawAddress.toString(), dwfileattributes.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromIDList(pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateItemFromIDList(pidl.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromParsingName(pszpath: Pcwstr, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateItemFromParsingName(pszpath.rawAddress.toString(), pbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemFromRelativeName(psiparent: MutPtr<CVoid>, pszname: Pcwstr, pbc: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateItemFromRelativeName(psiparent.rawAddress.toString(), pszname.rawAddress.toString(), pbc.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemInKnownFolder(kfid: ConstPtr<Guid>, dwkfflags: UInt, pszitem: Pcwstr, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateItemInKnownFolder(kfid.rawAddress.toString(), dwkfflags.toInt(), pszitem.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateItemWithParent(pidlparent: ConstPtr<Itemidlist>, psfparent: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, riid: ConstPtr<Guid>, ppvitem: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateItemWithParent(pidlparent.rawAddress.toString(), psfparent.rawAddress.toString(), pidl.rawAddress.toString(), riid.rawAddress.toString(), ppvitem.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateMemStream(pinit: ConstPtr<UByte>, cbinit: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHCreateMemStream(pinit.rawAddress.toString(), cbinit.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateProcessAsUserW(pscpi: MutPtr<Shcreateprocessinfow>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateProcessAsUserW(pscpi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreatePropSheetExtArray(hkey: Hkey, pszsubkey: Pcwstr, maxIface: UInt): Hpsxa =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHCreatePropSheetExtArray(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), maxIface.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateQueryCancelAutoPlayMoniker(ppmoniker: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateQueryCancelAutoPlayMoniker(ppmoniker.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellFolderView(pcsfv: ConstPtr<SfvCreate>, ppsv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellFolderView(pcsfv.rawAddress.toString(), ppsv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellFolderViewEx(pcsfv: ConstPtr<Csfv>, ppsv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellFolderViewEx(pcsfv.rawAddress.toString(), ppsv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItem(pidlparent: ConstPtr<Itemidlist>, psfparent: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, ppsi: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellItem(pidlparent.rawAddress.toString(), psfparent.rawAddress.toString(), pidl.rawAddress.toString(), ppsi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArray(pidlparent: ConstPtr<Itemidlist>, psf: MutPtr<CVoid>, cidl: UInt, ppidl: ConstPtr<ConstPtr<Itemidlist>>, ppsiitemarray: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellItemArray(pidlparent.rawAddress.toString(), psf.rawAddress.toString(), cidl.toInt(), ppidl.rawAddress.toString(), ppsiitemarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromDataObject(pdo: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellItemArrayFromDataObject(pdo.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromIDLists(cidl: UInt, rgpidl: ConstPtr<ConstPtr<Itemidlist>>, ppsiitemarray: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellItemArrayFromIDLists(cidl.toInt(), rgpidl.rawAddress.toString(), ppsiitemarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellItemArrayFromShellItem(psi: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateShellItemArrayFromShellItem(psi.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateShellPalette(hdc: Hdc): Hpalette =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHCreateShellPalette(hdc.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStdEnumFmtEtc(cfmt: UInt, afmt: ConstPtr<Formatetc>, ppenumformatetc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateStdEnumFmtEtc(cfmt.toInt(), afmt.rawAddress.toString(), ppenumformatetc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileA(pszfile: Pcstr, grfmode: UInt, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateStreamOnFileA(pszfile.rawAddress.toString(), grfmode.toInt(), ppstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileEx(pszfile: Pcwstr, grfmode: UInt, dwattributes: UInt, fcreate: Bool, pstmtemplate: MutPtr<CVoid>, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateStreamOnFileEx(pszfile.rawAddress.toString(), grfmode.toInt(), dwattributes.toInt(), fcreate, pstmtemplate.rawAddress.toString(), ppstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateStreamOnFileW(pszfile: Pcwstr, grfmode: UInt, ppstm: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateStreamOnFileW(pszfile.rawAddress.toString(), grfmode.toInt(), ppstm.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThread(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr<CVoid>, flags: UInt, pfncallback: LpthreadStartRoutine): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateThread(0L.toString(), pdata.rawAddress.toString(), flags.toInt(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThreadRef(pcref: MutPtr<Int>, ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateThreadRef(pcref.rawAddress.toString(), ppunk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHCreateThreadWithHandle(pfnthreadproc: LpthreadStartRoutine, pdata: ConstPtr<CVoid>, flags: UInt, pfncallback: LpthreadStartRoutine, phandle: MutPtr<Handle>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHCreateThreadWithHandle(0L.toString(), pdata.rawAddress.toString(), flags.toInt(), 0L.toString(), phandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDefExtractIconA(psziconfile: Pcstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, niconsize: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDefExtractIconA(psziconfile.rawAddress.toString(), iindex, uflags.toInt(), phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), niconsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDefExtractIconW(psziconfile: Pcwstr, iindex: Int, uflags: UInt, phiconlarge: MutPtr<Hicon>, phiconsmall: MutPtr<Hicon>, niconsize: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDefExtractIconW(psziconfile.rawAddress.toString(), iindex, uflags.toInt(), phiconlarge.rawAddress.toString(), phiconsmall.rawAddress.toString(), niconsize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteEmptyKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDeleteEmptyKeyA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteEmptyKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDeleteEmptyKeyW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteKeyA(hkey: Hkey, pszsubkey: Pcstr): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDeleteKeyA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteKeyW(hkey: Hkey, pszsubkey: Pcwstr): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDeleteKeyW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDeleteValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDeleteValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDeleteValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHDestroyPropSheetExtArray(hpsxa: Hpsxa) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHDestroyPropSheetExtArray(hpsxa.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHDoDragDrop(hwnd: Hwnd, pdata: MutPtr<CVoid>, pdsrc: MutPtr<CVoid>, dweffect: Dropeffect, pdweffect: MutPtr<Dropeffect>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHDoDragDrop(hwnd.rawAddress.toString(), pdata.rawAddress.toString(), pdsrc.rawAddress.toString(), dweffect.toInt(), pdweffect.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEmptyRecycleBinA(hwnd: Hwnd, pszrootpath: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEmptyRecycleBinA(hwnd.rawAddress.toString(), pszrootpath.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEmptyRecycleBinW(hwnd: Hwnd, pszrootpath: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEmptyRecycleBinW(hwnd.rawAddress.toString(), pszrootpath.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumKeyExA(hkey: Hkey, dwindex: UInt, pszname: Pstr, pcchname: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEnumKeyExA(hkey.rawAddress.toString(), dwindex.toInt(), pszname.rawAddress.toString(), pcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumKeyExW(hkey: Hkey, dwindex: UInt, pszname: Pwstr, pcchname: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEnumKeyExW(hkey.rawAddress.toString(), dwindex.toInt(), pszname.rawAddress.toString(), pcchname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumValueA(hkey: Hkey, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEnumValueA(hkey.rawAddress.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumValueW(hkey: Hkey, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEnumValueW(hkey.rawAddress.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEnumerateUnreadMailAccountsW(hkeyuser: Hkey, dwindex: UInt, pszmailaddress: Pwstr, cchmailaddress: Int): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEnumerateUnreadMailAccountsW(hkeyuser.rawAddress.toString(), dwindex.toInt(), pszmailaddress.rawAddress.toString(), cchmailaddress) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHEvaluateSystemCommandTemplate(pszcmdtemplate: Pcwstr, ppszapplication: MutPtr<Pwstr>, ppszcommandline: MutPtr<Pwstr>, ppszparameters: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHEvaluateSystemCommandTemplate(pszcmdtemplate.rawAddress.toString(), ppszapplication.rawAddress.toString(), ppszcommandline.rawAddress.toString(), ppszparameters.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFileOperationA(lpfileop: MutPtr<Shfileopstructa>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFileOperationA(lpfileop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFileOperationW(lpfileop: MutPtr<Shfileopstructw>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFileOperationW(lpfileop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFindFiles(pidlfolder: ConstPtr<Itemidlist>, pidlsavefile: ConstPtr<Itemidlist>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFindFiles(pidlfolder.rawAddress.toString(), pidlsavefile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shfindInitMenuPopup(hmenu: Hmenu, hwndowner: Hwnd, idcmdfirst: UInt, idcmdlast: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellShfindInitMenuPopup(hmenu.rawAddress.toString(), hwndowner.rawAddress.toString(), idcmdfirst.toInt(), idcmdlast.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFlushSFCache() {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHFlushSFCache()
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFormatDateTimeA(pft: ConstPtr<Filetime>, pdwflags: MutPtr<UInt>, pszbuf: Pstr, cchbuf: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFormatDateTimeA(pft.rawAddress.toString(), pdwflags.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFormatDateTimeW(pft: ConstPtr<Filetime>, pdwflags: MutPtr<UInt>, pszbuf: Pwstr, cchbuf: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFormatDateTimeW(pft.rawAddress.toString(), pdwflags.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFormatDrive(hwnd: Hwnd, drive: UInt, fmtid: ShfmtId, options: UInt): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFormatDrive(hwnd.rawAddress.toString(), drive.toInt(), fmtid.toInt(), options.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHFree(pv: ConstPtr<CVoid>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFreeNameMappings(hnamemappings: Handle) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHFreeNameMappings(hnamemappings.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHFreeShared(hdata: Handle, dwprocessid: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHFreeShared(hdata.rawAddress.toString(), dwprocessid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetAttributesFromDataObject(pdo: MutPtr<CVoid>, dwattributemask: UInt, pdwattributes: MutPtr<UInt>, pcitems: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetAttributesFromDataObject(pdo.rawAddress.toString(), dwattributemask.toInt(), pdwattributes.rawAddress.toString(), pcitems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDataFromIDListA(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, nformat: ShgdfilFormat, pv: MutPtr<CVoid>, cb: Int): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetDataFromIDListA(psf.rawAddress.toString(), pidl.rawAddress.toString(), nformat, pv.rawAddress.toString(), cb) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDataFromIDListW(psf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, nformat: ShgdfilFormat, pv: MutPtr<CVoid>, cb: Int): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetDataFromIDListW(psf.rawAddress.toString(), pidl.rawAddress.toString(), nformat, pv.rawAddress.toString(), cb) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDesktopFolder(ppshf: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetDesktopFolder(ppshf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDiskFreeSpaceExA(pszdirectoryname: Pcstr, pulfreebytesavailabletocaller: MutPtr<ULong>, pultotalnumberofbytes: MutPtr<ULong>, pultotalnumberoffreebytes: MutPtr<ULong>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetDiskFreeSpaceExA(pszdirectoryname.rawAddress.toString(), pulfreebytesavailabletocaller.rawAddress.toString(), pultotalnumberofbytes.rawAddress.toString(), pultotalnumberoffreebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDiskFreeSpaceExW(pszdirectoryname: Pcwstr, pulfreebytesavailabletocaller: MutPtr<ULong>, pultotalnumberofbytes: MutPtr<ULong>, pultotalnumberoffreebytes: MutPtr<ULong>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetDiskFreeSpaceExW(pszdirectoryname.rawAddress.toString(), pulfreebytesavailabletocaller.rawAddress.toString(), pultotalnumberofbytes.rawAddress.toString(), pultotalnumberoffreebytes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetDriveMedia(pszdrive: Pcwstr, pdwmediacontent: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetDriveMedia(pszdrive.rawAddress.toString(), pdwmediacontent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFileInfoA(pszpath: Pcstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr<Shfileinfoa>, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFileInfoA(pszpath.rawAddress.toString(), dwfileattributes.toInt(), psfi.rawAddress.toString(), cbfileinfo.toInt(), uflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFileInfoW(pszpath: Pcwstr, dwfileattributes: FileFlagsAndAttributes, psfi: MutPtr<Shfileinfow>, cbfileinfo: UInt, uflags: ShgfiFlags): ULong =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFileInfoW(pszpath.rawAddress.toString(), dwfileattributes.toInt(), psfi.rawAddress.toString(), cbfileinfo.toInt(), uflags.toInt()).toULong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderLocation(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFolderLocation(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), ppidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFolderPathA(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathAndSubDirA(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcstr, pszpath: Pstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFolderPathAndSubDirA(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszsubdir.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathAndSubDirW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszsubdir: Pcwstr, pszpath: Pwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFolderPathAndSubDirW(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszsubdir.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetFolderPathW(hwnd: Hwnd, csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetFolderPathW(hwnd.rawAddress.toString(), csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIDListFromObject(punk: MutPtr<CVoid>, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetIDListFromObject(punk.rawAddress.toString(), ppidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIconOverlayIndexA(psziconpath: Pcstr, iiconindex: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetIconOverlayIndexA(psziconpath.rawAddress.toString(), iiconindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetIconOverlayIndexW(psziconpath: Pcwstr, iiconindex: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetIconOverlayIndexW(psziconpath.rawAddress.toString(), iiconindex) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetImageList(iimagelist: Int, riid: ConstPtr<Guid>, ppvobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetImageList(iimagelist, riid.rawAddress.toString(), ppvobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetInstanceExplorer(ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetInstanceExplorer(ppunk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetInverseCMAP(pbmap: MutPtr<UByte>, cbmap: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetInverseCMAP(pbmap.rawAddress.toString(), cbmap.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetItemFromDataObject(pdtobj: MutPtr<CVoid>, dwflags: DataobjGetItemFlags, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetItemFromDataObject(pdtobj.rawAddress.toString(), dwflags, riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetItemFromObject(punk: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetItemFromObject(punk.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderIDList(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetKnownFolderIDList(rfid.rawAddress.toString(), dwflags.toInt(), htoken.rawAddress.toString(), ppidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderItem(rfid: ConstPtr<Guid>, flags: KnownFolderFlag, htoken: Handle, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetKnownFolderItem(rfid.rawAddress.toString(), flags, htoken.rawAddress.toString(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetKnownFolderPath(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, ppszpath: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetKnownFolderPath(rfid.rawAddress.toString(), dwflags.toInt(), htoken.rawAddress.toString(), ppszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetLocalizedName(pszpath: Pcwstr, pszresmodule: Pwstr, cch: UInt, pidsres: MutPtr<Int>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetLocalizedName(pszpath.rawAddress.toString(), pszresmodule.rawAddress.toString(), cch.toInt(), pidsres.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetMalloc(ppmalloc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetMalloc(ppmalloc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNameFromIDList(pidl: ConstPtr<Itemidlist>, sigdnname: Sigdn, ppszname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetNameFromIDList(pidl.rawAddress.toString(), sigdnname, ppszname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNewLinkInfoA(pszlinkto: Pcstr, pszdir: Pcstr, pszname: Pstr, pfmustcopy: MutPtr<Bool>, uflags: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetNewLinkInfoA(pszlinkto.rawAddress.toString(), pszdir.rawAddress.toString(), pszname.rawAddress.toString(), pfmustcopy.rawAddress.toString(), uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetNewLinkInfoW(pszlinkto: Pcwstr, pszdir: Pcwstr, pszname: Pwstr, pfmustcopy: MutPtr<Bool>, uflags: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetNewLinkInfoW(pszlinkto.rawAddress.toString(), pszdir.rawAddress.toString(), pszname.rawAddress.toString(), pfmustcopy.rawAddress.toString(), uflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListA(pidl: ConstPtr<Itemidlist>, pszpath: Pstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetPathFromIDListA(pidl.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListEx(pidl: ConstPtr<Itemidlist>, pszpath: Pwstr, cchpath: UInt, uopts: GpfidlFlags): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetPathFromIDListEx(pidl.rawAddress.toString(), pszpath.rawAddress.toString(), cchpath.toInt(), uopts.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetPathFromIDListW(pidl: ConstPtr<Itemidlist>, pszpath: Pwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetPathFromIDListW(pidl.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetRealIDL(psf: MutPtr<CVoid>, pidlsimple: ConstPtr<Itemidlist>, ppidlreal: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetRealIDL(psf.rawAddress.toString(), pidlsimple.rawAddress.toString(), ppidlreal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSetFolderCustomSettings(pfcs: MutPtr<Shfoldercustomsettings>, pszpath: Pcwstr, dwreadwrite: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetSetFolderCustomSettings(pfcs.rawAddress.toString(), pszpath.rawAddress.toString(), dwreadwrite.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSetSettings(lpss: MutPtr<Shellstatea>, dwmask: SsfMask, bset: Bool) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHGetSetSettings(lpss.rawAddress.toString(), dwmask.toInt(), bset)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHGetSettings(psfs: MutPtr<Shellflagstate>, dwmask: UInt) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHGetSettings(psfs.rawAddress.toString(), dwmask.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHGetSpecialFolderLocation(hwnd: Hwnd, csidl: Int, ppidl: MutPtr<MutPtr<Itemidlist>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetSpecialFolderLocation(hwnd.rawAddress.toString(), csidl, ppidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSpecialFolderPathA(hwnd: Hwnd, pszpath: Pstr, csidl: Int, fcreate: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetSpecialFolderPathA(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), csidl, fcreate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetSpecialFolderPathW(hwnd: Hwnd, pszpath: Pwstr, csidl: Int, fcreate: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetSpecialFolderPathW(hwnd.rawAddress.toString(), pszpath.rawAddress.toString(), csidl, fcreate) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetStockIconInfo(siid: Shstockiconid, uflags: ShgsiFlags, psii: MutPtr<Shstockiconinfo>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetStockIconInfo(siid, uflags.toInt(), psii.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetTemporaryPropertyForItem(psi: MutPtr<CVoid>, propkey: ConstPtr<Propertykey>, ppropvar: MutPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetTemporaryPropertyForItem(psi.rawAddress.toString(), propkey.rawAddress.toString(), ppropvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetThreadRef(ppunk: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetThreadRef(ppunk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetUnreadMailCountW(hkeyuser: Hkey, pszmailaddress: Pcwstr, pdwcount: MutPtr<UInt>, pfiletime: MutPtr<Filetime>, pszshellexecutecommand: Pwstr, cchshellexecutecommand: Int): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetUnreadMailCountW(hkeyuser.rawAddress.toString(), pszmailaddress.rawAddress.toString(), pdwcount.rawAddress.toString(), pfiletime.rawAddress.toString(), pszshellexecutecommand.rawAddress.toString(), cchshellexecutecommand) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGetViewStatePropertyBag(pidl: ConstPtr<Itemidlist>, pszbagname: Pcwstr, dwflags: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGetViewStatePropertyBag(pidl.rawAddress.toString(), pszbagname.rawAddress.toString(), dwflags.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterDecrement(id: Shglobalcounter): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGlobalCounterDecrement(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterGetValue(id: Shglobalcounter): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGlobalCounterGetValue(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHGlobalCounterIncrement(id: Shglobalcounter): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHGlobalCounterIncrement(id) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHHandleUpdateImage(pidlextra: ConstPtr<Itemidlist>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHHandleUpdateImage(pidlextra.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHILCreateFromPath(pszpath: Pcwstr, ppidl: MutPtr<MutPtr<Itemidlist>>, rgfinout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHILCreateFromPath(pszpath.rawAddress.toString(), ppidl.rawAddress.toString(), rgfinout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHInvokePrinterCommandA(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcstr, lpbuf2: Pcstr, fmodal: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHInvokePrinterCommandA(hwnd.rawAddress.toString(), uaction.toInt(), lpbuf1.rawAddress.toString(), lpbuf2.rawAddress.toString(), fmodal) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHInvokePrinterCommandW(hwnd: Hwnd, uaction: UInt, lpbuf1: Pcwstr, lpbuf2: Pcwstr, fmodal: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHInvokePrinterCommandW(hwnd.rawAddress.toString(), uaction.toInt(), lpbuf1.rawAddress.toString(), lpbuf2.rawAddress.toString(), fmodal) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHIsFileAvailableOffline(pwszpath: Pcwstr, pdwstatus: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHIsFileAvailableOffline(pwszpath.rawAddress.toString(), pdwstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHIsLowMemoryMachine(dwtype: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHIsLowMemoryMachine(dwtype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLimitInputEdit(hwndedit: Hwnd, psf: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHLimitInputEdit(hwndedit.rawAddress.toString(), psf.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadInProc(rclsid: ConstPtr<Guid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHLoadInProc(rclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadIndirectString(pszsource: Pcwstr, pszoutbuf: Pwstr, cchoutbuf: UInt, ppvreserved: ConstPtr<ConstPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHLoadIndirectString(pszsource.rawAddress.toString(), pszoutbuf.rawAddress.toString(), cchoutbuf.toInt(), ppvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLoadNonloadedIconOverlayIdentifiers(): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHLoadNonloadedIconOverlayIdentifiers() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHLockShared(hdata: Handle, dwprocessid: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHLockShared(hdata.rawAddress.toString(), dwprocessid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMapPIDLToSystemImageListIndex(pshf: MutPtr<CVoid>, pidl: ConstPtr<Itemidlist>, piindexsel: MutPtr<Int>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHMapPIDLToSystemImageListIndex(pshf.rawAddress.toString(), pidl.rawAddress.toString(), piindexsel.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMessageBoxCheckA(hwnd: Hwnd, psztext: Pcstr, pszcaption: Pcstr, utype: UInt, idefault: Int, pszregval: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHMessageBoxCheckA(hwnd.rawAddress.toString(), psztext.rawAddress.toString(), pszcaption.rawAddress.toString(), utype.toInt(), idefault, pszregval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMessageBoxCheckW(hwnd: Hwnd, psztext: Pcwstr, pszcaption: Pcwstr, utype: UInt, idefault: Int, pszregval: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHMessageBoxCheckW(hwnd.rawAddress.toString(), psztext.rawAddress.toString(), pszcaption.rawAddress.toString(), utype.toInt(), idefault, pszregval.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHMultiFileProperties(pdtobj: MutPtr<CVoid>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHMultiFileProperties(pdtobj.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHObjectProperties(hwnd: Hwnd, shopobjecttype: UInt, pszobjectname: Pcwstr, pszpropertypage: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHObjectProperties(hwnd.rawAddress.toString(), shopobjecttype.toInt(), pszobjectname.rawAddress.toString(), pszpropertypage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenFolderAndSelectItems(pidlfolder: ConstPtr<Itemidlist>, cidl: UInt, apidl: ConstPtr<ConstPtr<Itemidlist>>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHOpenFolderAndSelectItems(pidlfolder.rawAddress.toString(), cidl.toInt(), apidl.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenPropSheetW(pszcaption: Pcwstr, ahkeys: ConstPtr<Hkey>, ckeys: UInt, pclsiddefault: ConstPtr<Guid>, pdtobj: MutPtr<CVoid>, psb: MutPtr<CVoid>, pstartpage: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHOpenPropSheetW(pszcaption.rawAddress.toString(), ahkeys.rawAddress.toString(), ckeys.toInt(), pclsiddefault.rawAddress.toString(), pdtobj.rawAddress.toString(), psb.rawAddress.toString(), pstartpage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStream2A(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHOpenRegStream2A(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStream2W(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHOpenRegStream2W(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStreamA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, grfmode: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHOpenRegStreamA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenRegStreamW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, grfmode: UInt): MutPtr<CVoid> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHOpenRegStreamW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), grfmode.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHOpenWithDialog(hwndparent: Hwnd, poainfo: ConstPtr<Openasinfo>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHOpenWithDialog(hwndparent.rawAddress.toString(), poainfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHParseDisplayName(pszname: Pcwstr, pbc: MutPtr<CVoid>, ppidl: MutPtr<MutPtr<Itemidlist>>, sfgaoin: UInt, psfgaoout: MutPtr<UInt>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHParseDisplayName(pszname.rawAddress.toString(), pbc.rawAddress.toString(), ppidl.rawAddress.toString(), sfgaoin.toInt(), psfgaoout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPathPrepareForWriteA(hwnd: Hwnd, punkenablemodless: MutPtr<CVoid>, pszpath: Pcstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHPathPrepareForWriteA(hwnd.rawAddress.toString(), punkenablemodless.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHPathPrepareForWriteW(hwnd: Hwnd, punkenablemodless: MutPtr<CVoid>, pszpath: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHPathPrepareForWriteW(hwnd.rawAddress.toString(), punkenablemodless.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryInfoKeyA(hkey: Hkey, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryInfoKeyA(hkey.rawAddress.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryInfoKeyW(hkey: Hkey, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryInfoKeyW(hkey.rawAddress.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryRecycleBinA(pszrootpath: Pcstr, pshqueryrbinfo: MutPtr<Shqueryrbinfo>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryRecycleBinA(pszrootpath.rawAddress.toString(), pshqueryrbinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryRecycleBinW(pszrootpath: Pcwstr, pshqueryrbinfo: MutPtr<Shqueryrbinfo>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryRecycleBinW(pszrootpath.rawAddress.toString(), pshqueryrbinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryUserNotificationState(pquns: MutPtr<QueryUserNotificationState>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryUserNotificationState(pquns.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryValueExA(hkey: Hkey, pszvalue: Pcstr, pdwreserved: ConstPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryValueExA(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwreserved.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHQueryValueExW(hkey: Hkey, pszvalue: Pcwstr, pdwreserved: ConstPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHQueryValueExW(hkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwreserved.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCloseUSKey(huskey: Long): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegCloseUSKey(huskey.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCreateUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegCreateUSKeyA(pszpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegCreateUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegCreateUSKeyW(pwzpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteEmptyUSKeyA(huskey: Long, pszsubkey: Pcstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyA(huskey.toString(), pszsubkey.rawAddress.toString(), delregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteEmptyUSKeyW(huskey: Long, pwzsubkey: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegDeleteEmptyUSKeyW(huskey.toString(), pwzsubkey.rawAddress.toString(), delregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteUSValueA(huskey: Long, pszvalue: Pcstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegDeleteUSValueA(huskey.toString(), pszvalue.rawAddress.toString(), delregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDeleteUSValueW(huskey: Long, pwzvalue: Pcwstr, delregflags: ShregdelFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegDeleteUSValueW(huskey.toString(), pwzvalue.rawAddress.toString(), delregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegDuplicateHKey(hkey: Hkey): Hkey =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHRegDuplicateHKey(hkey.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSKeyA(huskey: Long, dwindex: UInt, pszname: Pstr, pcchname: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegEnumUSKeyA(huskey.toString(), dwindex.toInt(), pszname.rawAddress.toString(), pcchname.rawAddress.toString(), enumregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSKeyW(huskey: Long, dwindex: UInt, pwzname: Pwstr, pcchname: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegEnumUSKeyW(huskey.toString(), dwindex.toInt(), pwzname.rawAddress.toString(), pcchname.rawAddress.toString(), enumregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSValueA(huskey: Long, dwindex: UInt, pszvaluename: Pstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegEnumUSValueA(huskey.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), enumregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegEnumUSValueW(huskey: Long, dwindex: UInt, pszvaluename: Pwstr, pcchvaluename: MutPtr<UInt>, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegEnumUSValueW(huskey.toString(), dwindex.toInt(), pszvaluename.rawAddress.toString(), pcchvaluename.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), enumregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetBoolUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetBoolUSValueA(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), fignorehkcu, fdefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetBoolUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, fignorehkcu: Bool, fdefault: Bool): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetBoolUSValueW(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), fignorehkcu, fdefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetIntW(hk: Hkey, pwzkey: Pcwstr, idefault: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetIntW(hk.rawAddress.toString(), pwzkey.rawAddress.toString(), idefault) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pszpath: Pstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetPathA(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pszpath: Pwstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetPathW(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pszpath.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetUSValueA(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetUSValueW(pszsubkey: Pcwstr, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetUSValueW(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, srrfflags: Int, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), srrfflags, pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueFromHKCUHKLM(pwszkey: Pcwstr, pwszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetValueFromHKCUHKLM(pwszkey.rawAddress.toString(), pwszvalue.rawAddress.toString(), srrfflags, pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegGetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, srrfflags: Int, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegGetValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), srrfflags, pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegOpenUSKeyA(pszpath: Pcstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, fignorehkcu: Bool): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegOpenUSKeyA(pszpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), fignorehkcu).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegOpenUSKeyW(pwzpath: Pcwstr, samdesired: UInt, hrelativeuskey: Long, phnewuskey: MutPtr<Long>, fignorehkcu: Bool): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegOpenUSKeyW(pwzpath.rawAddress.toString(), samdesired.toInt(), hrelativeuskey.toString(), phnewuskey.rawAddress.toString(), fignorehkcu).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryInfoUSKeyA(huskey: Long, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegQueryInfoUSKeyA(huskey.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString(), enumregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryInfoUSKeyW(huskey: Long, pcsubkeys: MutPtr<UInt>, pcchmaxsubkeylen: MutPtr<UInt>, pcvalues: MutPtr<UInt>, pcchmaxvaluenamelen: MutPtr<UInt>, enumregflags: ShregenumFlags): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegQueryInfoUSKeyW(huskey.toString(), pcsubkeys.rawAddress.toString(), pcchmaxsubkeylen.rawAddress.toString(), pcvalues.rawAddress.toString(), pcchmaxvaluenamelen.rawAddress.toString(), enumregflags).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryUSValueA(huskey: Long, pszvalue: Pcstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegQueryUSValueA(huskey.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegQueryUSValueW(huskey: Long, pszvalue: Pcwstr, pdwtype: MutPtr<UInt>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>, fignorehkcu: Bool, pvdefaultdata: ConstPtr<CVoid>, dwdefaultdatasize: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegQueryUSValueW(huskey.toString(), pszvalue.rawAddress.toString(), pdwtype.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString(), fignorehkcu, pvdefaultdata.rawAddress.toString(), dwdefaultdatasize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetPathA(hkey: Hkey, pcszsubkey: Pcstr, pcszvalue: Pcstr, pcszpath: Pcstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegSetPathA(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pcszpath.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetPathW(hkey: Hkey, pcszsubkey: Pcwstr, pcszvalue: Pcwstr, pcszpath: Pcwstr, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegSetPathW(hkey.rawAddress.toString(), pcszsubkey.rawAddress.toString(), pcszvalue.rawAddress.toString(), pcszpath.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetUSValueA(pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegSetUSValueA(pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegSetUSValueW(pwzsubkey: Pcwstr, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegSetUSValueW(pwzsubkey.rawAddress.toString(), pwzvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegWriteUSValueA(huskey: Long, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegWriteUSValueA(huskey.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRegWriteUSValueW(huskey: Long, pwzvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt, dwflags: UInt): Win32Error =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRegWriteUSValueW(huskey.toString(), pwzvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHReleaseThreadRef(): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHReleaseThreadRef() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRemoveLocalizedName(pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRemoveLocalizedName(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHReplaceFromPropSheetExtArray(hpsxa: Hpsxa, upageid: UInt, lpfnreplacewith: Lpfnsvaddpropsheetpage, lparam: Lparam): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHResolveLibrary(psilibrary: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHResolveLibrary(psilibrary.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHRestricted(rest: Restrictions): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHRestricted(rest).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSendMessageBroadcastA(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSendMessageBroadcastA(umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSendMessageBroadcastW(umsg: UInt, wparam: Wparam, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSendMessageBroadcastW(umsg.toInt(), wparam.toString(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetDefaultProperties(hwnd: Hwnd, psi: MutPtr<CVoid>, dwfileopflags: UInt, pfops: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetDefaultProperties(hwnd.rawAddress.toString(), psi.rawAddress.toString(), dwfileopflags.toInt(), pfops.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetFolderPathA(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetFolderPathA(csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetFolderPathW(csidl: Int, htoken: Handle, dwflags: UInt, pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetFolderPathW(csidl, htoken.rawAddress.toString(), dwflags.toInt(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetInstanceExplorer(punk: MutPtr<CVoid>) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHSetInstanceExplorer(punk.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHSetKnownFolderPath(rfid: ConstPtr<Guid>, dwflags: UInt, htoken: Handle, pszpath: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetKnownFolderPath(rfid.rawAddress.toString(), dwflags.toInt(), htoken.rawAddress.toString(), pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetLocalizedName(pszpath: Pcwstr, pszresmodule: Pcwstr, idsres: Int): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetLocalizedName(pszpath.rawAddress.toString(), pszresmodule.rawAddress.toString(), idsres) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetTemporaryPropertyForItem(psi: MutPtr<CVoid>, propkey: ConstPtr<Propertykey>, propvar: ConstPtr<Propvariant>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetTemporaryPropertyForItem(psi.rawAddress.toString(), propkey.rawAddress.toString(), propvar.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetThreadRef(punk: MutPtr<CVoid>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetThreadRef(punk.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetUnreadMailCountW(pszmailaddress: Pcwstr, dwcount: UInt, pszshellexecutecommand: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetUnreadMailCountW(pszmailaddress.rawAddress.toString(), dwcount.toInt(), pszshellexecutecommand.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetValueA(hkey: Hkey, pszsubkey: Pcstr, pszvalue: Pcstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetValueA(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSetValueW(hkey: Hkey, pszsubkey: Pcwstr, pszvalue: Pcwstr, dwtype: UInt, pvdata: ConstPtr<CVoid>, cbdata: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSetValueW(hkey.rawAddress.toString(), pszsubkey.rawAddress.toString(), pszvalue.rawAddress.toString(), dwtype.toInt(), pvdata.rawAddress.toString(), cbdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shshellFolderViewMessage(hwndmain: Hwnd, umsg: UInt, lparam: Lparam): Lresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShshellFolderViewMessage(hwndmain.rawAddress.toString(), umsg.toInt(), lparam.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHShowManageLibraryUI(psilibrary: MutPtr<CVoid>, hwndowner: Hwnd, psztitle: Pcwstr, pszinstruction: Pcwstr, lmdoptions: Librarymanagedialogoptions): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHShowManageLibraryUI(psilibrary.rawAddress.toString(), hwndowner.rawAddress.toString(), psztitle.rawAddress.toString(), pszinstruction.rawAddress.toString(), lmdoptions) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSimpleIDListFromPath(pszpath: Pcwstr): MutPtr<Itemidlist> =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellSHSimpleIDListFromPath(pszpath.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHSkipJunction(pbc: MutPtr<CVoid>, pclsid: ConstPtr<Guid>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHSkipJunction(pbc.rawAddress.toString(), pclsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStartNetConnectionDialogW(hwnd: Hwnd, pszremotename: Pcwstr, dwtype: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHStartNetConnectionDialogW(hwnd.rawAddress.toString(), pszremotename.rawAddress.toString(), dwtype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStrDupA(psz: Pcstr, ppwsz: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHStrDupA(psz.rawAddress.toString(), ppwsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStrDupW(psz: Pcwstr, ppwsz: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHStrDupW(psz.rawAddress.toString(), ppwsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStripMneumonicA(pszmenu: Pstr): Byte =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHStripMneumonicA(pszmenu.rawAddress.toString()).toByte() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHStripMneumonicW(pszmenu: Pwstr): UShort =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHStripMneumonicW(pszmenu.rawAddress.toString()).toUShort() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHTestTokenMembership(htoken: Handle, ulrid: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHTestTokenMembership(htoken.rawAddress.toString(), ulrid.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnicodeToAnsi(pwszsrc: Pcwstr, pszdst: Pstr, cchbuf: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHUnicodeToAnsi(pwszsrc.rawAddress.toString(), pszdst.rawAddress.toString(), cchbuf) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnicodeToUnicode(pwzsrc: Pcwstr, pwzdst: Pwstr, cwchbuf: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHUnicodeToUnicode(pwzsrc.rawAddress.toString(), pwzdst.rawAddress.toString(), cwchbuf) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUnlockShared(pvdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHUnlockShared(pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sHUpdateImageA(pszhashitem: Pcstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHUpdateImageA(pszhashitem.rawAddress.toString(), iindex, uflags.toInt(), iimageindex)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHUpdateImageW(pszhashitem: Pcwstr, iindex: Int, uflags: UInt, iimageindex: Int) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellSHUpdateImageW(pszhashitem.rawAddress.toString(), iindex, uflags.toInt(), iimageindex)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sHValidateUNC(hwndowner: Hwnd, pszfile: Pwstr, fconnect: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSHValidateUNC(hwndowner.rawAddress.toString(), pszfile.rawAddress.toString(), fconnect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCurrentProcessExplicitAppUserModelID(appid: Pcwstr): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSetCurrentProcessExplicitAppUserModelID(appid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMenuContextHelpId(param0: Hmenu, param1: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSetMenuContextHelpId(param0.rawAddress.toString(), param1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowContextHelpId(param0: Hwnd, param1: UInt): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSetWindowContextHelpId(param0.rawAddress.toString(), param1.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowSubclass(hwnd: Hwnd, pfnsubclass: Subclassproc, uidsubclass: ULong, dwrefdata: ULong): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSetWindowSubclass(hwnd.rawAddress.toString(), 0L.toString(), uidsubclass.toString(), dwrefdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellAboutA(hwnd: Hwnd, szapp: Pcstr, szotherstuff: Pcstr, hicon: Hicon): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellAboutA(hwnd.rawAddress.toString(), szapp.rawAddress.toString(), szotherstuff.rawAddress.toString(), hicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellAboutW(hwnd: Hwnd, szapp: Pcwstr, szotherstuff: Pcwstr, hicon: Hicon): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellAboutW(hwnd.rawAddress.toString(), szapp.rawAddress.toString(), szotherstuff.rawAddress.toString(), hicon.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteA(hwnd: Hwnd, lpoperation: Pcstr, lpfile: Pcstr, lpparameters: Pcstr, lpdirectory: Pcstr, nshowcmd: ShowWindowCmd): Hinstance =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellShellExecuteA(hwnd.rawAddress.toString(), lpoperation.rawAddress.toString(), lpfile.rawAddress.toString(), lpparameters.rawAddress.toString(), lpdirectory.rawAddress.toString(), nshowcmd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteExA(pexecinfo: MutPtr<Shellexecuteinfoa>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellExecuteExA(pexecinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteExW(pexecinfo: MutPtr<Shellexecuteinfow>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellExecuteExW(pexecinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellExecuteW(hwnd: Hwnd, lpoperation: Pcwstr, lpfile: Pcwstr, lpparameters: Pcwstr, lpdirectory: Pcwstr, nshowcmd: ShowWindowCmd): Hinstance =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellShellExecuteW(hwnd.rawAddress.toString(), lpoperation.rawAddress.toString(), lpfile.rawAddress.toString(), lpparameters.rawAddress.toString(), lpdirectory.rawAddress.toString(), nshowcmd).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMessageBoxA(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcstr, lpctitle: Pcstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellMessageBoxA(happinst.rawAddress.toString(), hwnd.rawAddress.toString(), lpctext.rawAddress.toString(), lpctitle.rawAddress.toString(), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMessageBoxW(happinst: Hinstance, hwnd: Hwnd, lpctext: Pcwstr, lpctitle: Pcwstr, fustyle: MessageboxStyle, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellMessageBoxW(happinst.rawAddress.toString(), hwnd.rawAddress.toString(), lpctext.rawAddress.toString(), lpctitle.rawAddress.toString(), fustyle.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndex(pwsziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellGetCachedImageIndex(pwsziconpath.rawAddress.toString(), iiconindex, uiconflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndexA(psziconpath: Pcstr, iiconindex: Int, uiconflags: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellGetCachedImageIndexA(psziconpath.rawAddress.toString(), iiconindex, uiconflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetCachedImageIndexW(psziconpath: Pcwstr, iiconindex: Int, uiconflags: UInt): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellGetCachedImageIndexW(psziconpath.rawAddress.toString(), iiconindex, uiconflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellGetImageLists(phiml: MutPtr<Himagelist>, phimlsmall: MutPtr<Himagelist>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellGetImageLists(phiml.rawAddress.toString(), phimlsmall.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellMergeMenus(hmdst: Hmenu, hmsrc: Hmenu, uinsert: UInt, uidadjust: UInt, uidadjustmax: UInt, uflags: MmFlags): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellMergeMenus(hmdst.rawAddress.toString(), hmsrc.rawAddress.toString(), uinsert.toInt(), uidadjust.toInt(), uidadjustmax.toInt(), uflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconA(dwmessage: NotifyIconMessage, lpdata: ConstPtr<Notifyicondataa>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellNotifyIconA(dwmessage.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconGetRect(identifier: ConstPtr<Notifyiconidentifier>, iconlocation: MutPtr<Rect>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellNotifyIconGetRect(identifier.rawAddress.toString(), iconlocation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun shellNotifyIconW(dwmessage: NotifyIconMessage, lpdata: ConstPtr<Notifyicondataw>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellShellNotifyIconW(dwmessage.toInt(), lpdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signalFileOpen(pidl: ConstPtr<Itemidlist>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSignalFileOpen(pidl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun softwareUpdateMessageBox(hwnd: Hwnd, pszdistunit: Pcwstr, dwflags: UInt, psdi: MutPtr<Softdistinfo>): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellSoftwareUpdateMessageBox(hwnd.rawAddress.toString(), pszdistunit.rawAddress.toString(), dwflags.toInt(), psdi.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stgMakeUniqueName(pstgparent: MutPtr<CVoid>, pszfilespec: Pcwstr, grfmode: UInt, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStgMakeUniqueName(pstgparent.rawAddress.toString(), pszfilespec.rawAddress.toString(), grfmode.toInt(), riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnA(pszstr: Pcstr, pszset: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCSpnA(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnIA(pszstr: Pcstr, pszset: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCSpnIA(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnIW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCSpnIW(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCSpnW(pszstr: Pcwstr, pszset: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCSpnW(pszstr.rawAddress.toString(), pszset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatBuffA(pszdest: Pstr, pszsrc: Pcstr, cchdestbuffsize: Int): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrCatBuffA(pszdest.rawAddress.toString(), pszsrc.rawAddress.toString(), cchdestbuffsize).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatBuffW(pszdest: Pwstr, pszsrc: Pcwstr, cchdestbuffsize: Int): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrCatBuffW(pszdest.rawAddress.toString(), pszsrc.rawAddress.toString(), cchdestbuffsize).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatChainW(pszdst: Pwstr, cchdst: UInt, ichat: UInt, pszsrc: Pcwstr): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCatChainW(pszdst.rawAddress.toString(), cchdst.toInt(), ichat.toInt(), pszsrc.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCatW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrCatW(psz1.rawAddress.toString(), psz2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrA(pszstart: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrChrA(pszstart.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrIA(pszstart: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrChrIA(pszstart.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrIW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrChrIW(pszstart.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrNIW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrChrNIW(pszstart.rawAddress.toString(), wmatch.toInt(), cchmax.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrNW(pszstart: Pcwstr, wmatch: UShort, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrChrNW(pszstart.rawAddress.toString(), wmatch.toInt(), cchmax.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strChrW(pszstart: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrChrW(pszstart.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpCA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpCA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpCW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpCW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpICA(pszstr1: Pcstr, pszstr2: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpICA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpICW(pszstr1: Pcwstr, pszstr2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpICW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpIW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpIW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpLogicalW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpLogicalW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNCA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNCA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNCW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNCW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNIA(psz1: Pcstr, psz2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNIA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNICA(pszstr1: Pcstr, pszstr2: Pcstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNICA(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNICW(pszstr1: Pcwstr, pszstr2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNICW(pszstr1.rawAddress.toString(), pszstr2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNIW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNIW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpNW(psz1: Pcwstr, psz2: Pcwstr, nchar: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpNW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCmpW(psz1: Pcwstr, psz2: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrCmpW(psz1.rawAddress.toString(), psz2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCpyNW(pszdst: Pwstr, pszsrc: Pcwstr, cchmax: Int): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrCpyNW(pszdst.rawAddress.toString(), pszsrc.rawAddress.toString(), cchmax).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strCpyW(psz1: Pwstr, psz2: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrCpyW(psz1.rawAddress.toString(), psz2.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strDupA(pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrDupA(pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strDupW(pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrDupW(pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSize64A(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrFormatByteSize64A(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeA(dw: UInt, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrFormatByteSizeA(dw.toInt(), pszbuf.rawAddress.toString(), cchbuf.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeEx(ull: ULong, flags: SfbsFlags, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrFormatByteSizeEx(ull.toString(), flags, pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatByteSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrFormatByteSizeW(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatKBSizeA(qdw: Long, pszbuf: Pstr, cchbuf: UInt): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrFormatKBSizeA(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFormatKBSizeW(qdw: Long, pszbuf: Pwstr, cchbuf: UInt): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrFormatKBSizeW(qdw.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFromTimeIntervalA(pszout: Pstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrFromTimeIntervalA(pszout.rawAddress.toString(), cchmax.toInt(), dwtimems.toInt(), digits) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strFromTimeIntervalW(pszout: Pwstr, cchmax: UInt, dwtimems: UInt, digits: Int): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrFromTimeIntervalW(pszout.rawAddress.toString(), cchmax.toInt(), dwtimems.toInt(), digits) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strIsIntlEqualA(fcasesens: Bool, pszstring1: Pcstr, pszstring2: Pcstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrIsIntlEqualA(fcasesens, pszstring1.rawAddress.toString(), pszstring2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strIsIntlEqualW(fcasesens: Bool, pszstring1: Pcwstr, pszstring2: Pcwstr, nchar: Int): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrIsIntlEqualW(fcasesens, pszstring1.rawAddress.toString(), pszstring2.rawAddress.toString(), nchar) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strNCatA(psz1: Pstr, psz2: Pcstr, cchmax: Int): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrNCatA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), cchmax).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strNCatW(psz1: Pwstr, psz2: Pcwstr, cchmax: Int): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrNCatW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), cchmax).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strPBrkA(psz: Pcstr, pszset: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrPBrkA(psz.rawAddress.toString(), pszset.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strPBrkW(psz: Pcwstr, pszset: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrPBrkW(psz.rawAddress.toString(), pszset.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrRChrA(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrIA(pszstart: Pcstr, pszend: Pcstr, wmatch: UShort): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrRChrIA(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrIW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrRChrIW(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRChrW(pszstart: Pcwstr, pszend: Pcwstr, wmatch: UShort): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrRChrW(pszstart.rawAddress.toString(), pszend.rawAddress.toString(), wmatch.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRStrIA(pszsource: Pcstr, pszlast: Pcstr, pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrRStrIA(pszsource.rawAddress.toString(), pszlast.rawAddress.toString(), pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRStrIW(pszsource: Pcwstr, pszlast: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrRStrIW(pszsource.rawAddress.toString(), pszlast.rawAddress.toString(), pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBSTR(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, pbstr: MutPtr<Bstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrRetToBSTR(pstr.rawAddress.toString(), pidl.rawAddress.toString(), pbstr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBufA(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, pszbuf: Pstr, cchbuf: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrRetToBufA(pstr.rawAddress.toString(), pidl.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToBufW(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, pszbuf: Pwstr, cchbuf: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrRetToBufW(pstr.rawAddress.toString(), pidl.rawAddress.toString(), pszbuf.rawAddress.toString(), cchbuf.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToStrA(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppsz: MutPtr<Pstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrRetToStrA(pstr.rawAddress.toString(), pidl.rawAddress.toString(), ppsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strRetToStrW(pstr: MutPtr<Strret>, pidl: ConstPtr<Itemidlist>, ppsz: MutPtr<Pwstr>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrRetToStrW(pstr.rawAddress.toString(), pidl.rawAddress.toString(), ppsz.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSpnA(psz: Pcstr, pszset: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrSpnA(psz.rawAddress.toString(), pszset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strSpnW(psz: Pcwstr, pszset: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrSpnW(psz.rawAddress.toString(), pszset.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrStrA(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrIA(pszfirst: Pcstr, pszsrch: Pcstr): Pstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrStrIA(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrIW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrStrIW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrNIW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrStrNIW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString(), cchmax.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrNW(pszfirst: Pcwstr, pszsrch: Pcwstr, cchmax: UInt): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrStrNW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString(), cchmax.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strStrW(pszfirst: Pcwstr, pszsrch: Pcwstr): Pwstr =
    if (windowsWin32UiShellNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiShellStrStrW(pszfirst.rawAddress.toString(), pszsrch.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToInt64ExA(pszstring: Pcstr, dwflags: Int, pllret: MutPtr<Long>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrToInt64ExA(pszstring.rawAddress.toString(), dwflags, pllret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToInt64ExW(pszstring: Pcwstr, dwflags: Int, pllret: MutPtr<Long>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrToInt64ExW(pszstring.rawAddress.toString(), dwflags, pllret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntA(pszsrc: Pcstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrToIntA(pszsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntExA(pszstring: Pcstr, dwflags: Int, piret: MutPtr<Int>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrToIntExA(pszstring.rawAddress.toString(), dwflags, piret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntExW(pszstring: Pcwstr, dwflags: Int, piret: MutPtr<Int>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrToIntExW(pszstring.rawAddress.toString(), dwflags, piret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strToIntW(pszsrc: Pcwstr): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrToIntW(pszsrc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strTrimA(psz: Pstr, psztrimchars: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrTrimA(psz.rawAddress.toString(), psztrimchars.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strTrimW(psz: Pwstr, psztrimchars: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellStrTrimW(psz.rawAddress.toString(), psztrimchars.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unloadUserProfile(htoken: Handle, hprofile: Handle): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUnloadUserProfile(htoken.rawAddress.toString(), hprofile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unregisterAppConstrainedChangeNotification(registration: PappconstrainRegistration) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellUnregisterAppConstrainedChangeNotification(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unregisterAppStateChangeNotification(registration: PappstateRegistration) {
    if (windowsWin32UiShellNapiAvailable) {
        wasmWindowssysWindowsWin32UiShellUnregisterAppStateChangeNotification(registration.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun unregisterScaleChangeEvent(dwcookie: ULong): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUnregisterScaleChangeEvent(dwcookie.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlApplySchemeA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlApplySchemeA(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlApplySchemeW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlApplySchemeW(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCanonicalizeA(pszurl: Pcstr, pszcanonicalized: Pstr, pcchcanonicalized: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCanonicalizeA(pszurl.rawAddress.toString(), pszcanonicalized.rawAddress.toString(), pcchcanonicalized.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCanonicalizeW(pszurl: Pcwstr, pszcanonicalized: Pwstr, pcchcanonicalized: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCanonicalizeW(pszurl.rawAddress.toString(), pszcanonicalized.rawAddress.toString(), pcchcanonicalized.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCombineA(pszbase: Pcstr, pszrelative: Pcstr, pszcombined: Pstr, pcchcombined: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCombineA(pszbase.rawAddress.toString(), pszrelative.rawAddress.toString(), pszcombined.rawAddress.toString(), pcchcombined.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCombineW(pszbase: Pcwstr, pszrelative: Pcwstr, pszcombined: Pwstr, pcchcombined: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCombineW(pszbase.rawAddress.toString(), pszrelative.rawAddress.toString(), pszcombined.rawAddress.toString(), pcchcombined.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCompareA(psz1: Pcstr, psz2: Pcstr, fignoreslash: Bool): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCompareA(psz1.rawAddress.toString(), psz2.rawAddress.toString(), fignoreslash) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCompareW(psz1: Pcwstr, psz2: Pcwstr, fignoreslash: Bool): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCompareW(psz1.rawAddress.toString(), psz2.rawAddress.toString(), fignoreslash) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCreateFromPathA(pszpath: Pcstr, pszurl: Pstr, pcchurl: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCreateFromPathA(pszpath.rawAddress.toString(), pszurl.rawAddress.toString(), pcchurl.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCreateFromPathW(pszpath: Pcwstr, pszurl: Pwstr, pcchurl: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlCreateFromPathW(pszpath.rawAddress.toString(), pszurl.rawAddress.toString(), pcchurl.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlEscapeA(pszurl: Pcstr, pszescaped: Pstr, pcchescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlEscapeA(pszurl.rawAddress.toString(), pszescaped.rawAddress.toString(), pcchescaped.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlEscapeW(pszurl: Pcwstr, pszescaped: Pwstr, pcchescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlEscapeW(pszurl.rawAddress.toString(), pszescaped.rawAddress.toString(), pcchescaped.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlFixupW(pcszurl: Pcwstr, psztranslatedurl: Pwstr, cchmax: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlFixupW(pcszurl.rawAddress.toString(), psztranslatedurl.rawAddress.toString(), cchmax.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetLocationA(pszurl: Pcstr): Pcstr =
    if (windowsWin32UiShellNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32UiShellUrlGetLocationA(pszurl.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetLocationW(pszurl: Pcwstr): Pcwstr =
    if (windowsWin32UiShellNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32UiShellUrlGetLocationW(pszurl.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetPartA(pszin: Pcstr, pszout: Pstr, pcchout: MutPtr<UInt>, dwpart: UInt, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlGetPartA(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwpart.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlGetPartW(pszin: Pcwstr, pszout: Pwstr, pcchout: MutPtr<UInt>, dwpart: UInt, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlGetPartW(pszin.rawAddress.toString(), pszout.rawAddress.toString(), pcchout.rawAddress.toString(), dwpart.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlHashA(pszurl: Pcstr, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlHashA(pszurl.rawAddress.toString(), pbhash.rawAddress.toString(), cbhash.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlHashW(pszurl: Pcwstr, pbhash: MutPtr<UByte>, cbhash: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlHashW(pszurl.rawAddress.toString(), pbhash.rawAddress.toString(), cbhash.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsA(pszurl: Pcstr, urlis: Urlis): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlIsA(pszurl.rawAddress.toString(), urlis) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsNoHistoryA(pszurl: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlIsNoHistoryA(pszurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsNoHistoryW(pszurl: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlIsNoHistoryW(pszurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsOpaqueA(pszurl: Pcstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlIsOpaqueA(pszurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsOpaqueW(pszurl: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlIsOpaqueW(pszurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlIsW(pszurl: Pcwstr, urlis: Urlis): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlIsW(pszurl.rawAddress.toString(), urlis) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlUnescapeA(pszurl: Pstr, pszunescaped: Pstr, pcchunescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlUnescapeA(pszurl.rawAddress.toString(), pszunescaped.rawAddress.toString(), pcchunescaped.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlUnescapeW(pszurl: Pwstr, pszunescaped: Pwstr, pcchunescaped: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellUrlUnescapeW(pszurl.rawAddress.toString(), pszunescaped.rawAddress.toString(), pcchunescaped.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun variantToStrRet(varin: ConstPtr<Variant.Variant>, pstrret: MutPtr<Strret>): Hresult =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellVariantToStrRet(varin.rawAddress.toString(), pstrret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun whichPlatform(): UInt =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWhichPlatform().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun win32DeleteFile(pszpath: Pcwstr): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWin32DeleteFile(pszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHelpA(hwndmain: Hwnd, lpszhelp: Pcstr, ucommand: UInt, dwdata: ULong): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWinHelpA(hwndmain.rawAddress.toString(), lpszhelp.rawAddress.toString(), ucommand.toInt(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun winHelpW(hwndmain: Hwnd, lpszhelp: Pcwstr, ucommand: UInt, dwdata: ULong): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWinHelpW(hwndmain.rawAddress.toString(), lpszhelp.rawAddress.toString(), ucommand.toInt(), dwdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun writeCabinetState(pcs: ConstPtr<Cabinetstate>): Bool =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWriteCabinetState(pcs.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWnsprintfA(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, vararg variadicArgs: Long): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWnsprintfW(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvnsprintfA(pszdest: Pstr, cchdest: Int, pszfmt: Pcstr, arglist: ConstPtr<Byte>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWvnsprintfA(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), arglist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wvnsprintfW(pszdest: Pwstr, cchdest: Int, pszfmt: Pcwstr, arglist: ConstPtr<Byte>): Int =
    if (windowsWin32UiShellNapiAvailable) wasmWindowssysWindowsWin32UiShellWvnsprintfW(pszdest.rawAddress.toString(), cchdest, pszfmt.rawAddress.toString(), arglist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
