@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.wininet

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.networking.winhttp.WinHttpCreateUrlFlags
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.AlgId
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertChainContext
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataa
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.Win32FindDataw

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingWininetNapiAddon(): Boolean

private val windowsWin32NetworkingWininetNapiAvailable: Boolean = initWindowsWin32NetworkingWininetNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheFinalize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheFinalize(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheGetInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetInfo(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetAppCacheLookup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetAppCacheLookup(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(p0: Int, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteIE3Cache(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteIE3Cache(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(p0: String, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetDoConnectoidsExist()")
private external fun wasmWindowssysWindowsWin32NetworkingWininetDoConnectoidsExist(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetExportCookieFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetExportCookieFileA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetExportCookieFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetExportCookieFileW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindCloseUrlCache(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindCloseUrlCache(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(p0: String, p1: String, p2: String, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(p0: String, p1: String, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpCommandA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpCommandA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpCommandW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpCommandW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpDeleteFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpDeleteFileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpDeleteFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpDeleteFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpGetFileA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpGetFileEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileEx(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpGetFileSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpGetFileW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpOpenFileA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpOpenFileA(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpOpenFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpOpenFileW(p0: String, p1: String, p2: Int, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpPutFileA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpPutFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpPutFileEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpPutFileEx(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpPutFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpPutFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpRenameFileA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpRenameFileA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpRenameFileW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpRenameFileW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetDiskInfoA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetDiskInfoA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherGetAttributeA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherGetAttributeA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherGetAttributeW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherGetAttributeW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherOpenFileA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherOpenFileA(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetGopherOpenFileW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetGopherOpenFileW(p0: String, p1: String, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpEndRequestA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpEndRequestA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpEndRequestW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpEndRequestW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpOpenRequestA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpOpenRequestA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpOpenRequestW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpOpenRequestW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpPushClose(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpPushClose(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpPushEnable(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpPushEnable(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpPushWait(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpPushWait(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpQueryInfoA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpQueryInfoA(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpQueryInfoW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpQueryInfoW(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpSendRequestA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpSendRequestExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpSendRequestExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpSendRequestW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpWebSocketClose(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketClose(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpWebSocketSend(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketSend(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetImportCookieFileA(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetImportCookieFileA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetImportCookieFileW(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetImportCookieFileW(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetAttemptConnect(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetAttemptConnect(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetAutodial(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetAutodial(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetAutodialHangup(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetAutodialHangup(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(p0: String, p1: Int, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions()")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCloseHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCombineUrlA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCombineUrlA(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCombineUrlW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCombineUrlW(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetConnectA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetConnectA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetConnectW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetConnectW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: Int, p7: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: Int, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCrackUrlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCrackUrlA(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCrackUrlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCrackUrlW(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCreateUrlA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCreateUrlA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetCreateUrlW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetCreateUrlW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetDial(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetDial(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetDialA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetDialA(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetDialW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetDialW(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetErrorDlg(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetErrorDlg(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetFindNextFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetFindNextFileA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetFindNextFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetFindNextFileW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetFreeCookies(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetFreeCookies(p0: String, p1: Int)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetConnectedState(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedState(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetCookieA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetCookieExA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieExA(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetCookieExW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieExW(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetCookieW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGoOnline(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGoOnline(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGoOnlineA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGoOnlineA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetGoOnlineW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetGoOnlineW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetHangUp(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetHangUp(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetLockRequestFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetLockRequestFile(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetOpenA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetOpenA(p0: String, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetOpenUrlA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetOpenUrlA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetOpenUrlW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetOpenUrlW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetOpenW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetOpenW(p0: String, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetQueryOptionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetQueryOptionA(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetQueryOptionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetQueryOptionW(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetReadFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetReadFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetReadFileExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetReadFileExA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetReadFileExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetReadFileExW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetCookieA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieA(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetCookieExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieExA(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetCookieExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieExW(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetCookieW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieW(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetDialState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetDialState(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetDialStateA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetDialStateA(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetDialStateW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetDialStateW(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetFilePointer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetFilePointer(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetOptionA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetOptionExA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionExA(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetOptionExW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionExW(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetOptionW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetStatusCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetStatusCallback(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetSetStatusCallbackW(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetWriteFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetWriteFile(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetWriteFileExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetWriteFileExA(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetInternetWriteFileExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetInternetWriteFileExW(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(p0: Int, p1: String, p2: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIsProfilesEnabled()")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIsProfilesEnabled(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetLoadUrlCacheContent()")
private external fun wasmWindowssysWindowsWin32NetworkingWininetLoadUrlCacheContent(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(p0: String, p1: String, p2: String, p3: Int, p4: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetRunOnceUrlCache(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetRunOnceUrlCache(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetShowClientAuthCerts(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetShowClientAuthCerts(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetShowSecurityInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetShowSecurityInfo(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings()")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheServer()")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheServer(): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(p0: String, p1: String, p2: String, p3: Int): Int

public actual fun appCacheCheckManifest(pwszmasterurl: Pcwstr, pwszmanifesturl: Pcwstr, pbmanifestdata: ConstPtr<UByte>, dwmanifestdatasize: UInt, pbmanifestresponseheaders: ConstPtr<UByte>, dwmanifestresponseheaderssize: UInt, pestate: MutPtr<AppCacheState>, phnewappcache: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheCheckManifest(pwszmasterurl.rawAddress.toString(), pwszmanifesturl.rawAddress.toString(), pbmanifestdata.rawAddress.toString(), dwmanifestdatasize.toInt(), pbmanifestresponseheaders.rawAddress.toString(), dwmanifestresponseheaderssize.toInt(), pestate.rawAddress.toString(), phnewappcache.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheCloseHandle(happcache: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetAppCacheCloseHandle(happcache.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheCreateAndCommitFile(happcache: ConstPtr<CVoid>, pwszsourcefilepath: Pcwstr, pwszurl: Pcwstr, pbresponseheaders: ConstPtr<UByte>, dwresponseheaderssize: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheCreateAndCommitFile(happcache.rawAddress.toString(), pwszsourcefilepath.rawAddress.toString(), pwszurl.rawAddress.toString(), pbresponseheaders.rawAddress.toString(), dwresponseheaderssize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDeleteGroup(pwszmanifesturl: Pcwstr): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheDeleteGroup(pwszmanifesturl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDeleteIEGroup(pwszmanifesturl: Pcwstr): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheDeleteIEGroup(pwszmanifesturl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheDuplicateHandle(happcache: ConstPtr<CVoid>, phduplicatedappcache: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheDuplicateHandle(happcache.rawAddress.toString(), phduplicatedappcache.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFinalize(happcache: ConstPtr<CVoid>, pbmanifestdata: ConstPtr<UByte>, dwmanifestdatasize: UInt, pestate: MutPtr<AppCacheFinalizeState>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheFinalize(happcache.rawAddress.toString(), pbmanifestdata.rawAddress.toString(), dwmanifestdatasize.toInt(), pestate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFreeDownloadList(pdownloadlist: MutPtr<AppCacheDownloadList>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetAppCacheFreeDownloadList(pdownloadlist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheFreeGroupList(pappcachegrouplist: MutPtr<AppCacheGroupList>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetAppCacheFreeGroupList(pappcachegrouplist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun appCacheFreeIESpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheFreeSpace(ftcutoff: Filetime): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetDownloadList(happcache: ConstPtr<CVoid>, pdownloadlist: MutPtr<AppCacheDownloadList>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetDownloadList(happcache.rawAddress.toString(), pdownloadlist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetFallbackUrl(happcache: ConstPtr<CVoid>, pwszurl: Pcwstr, ppwszfallbackurl: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetFallbackUrl(happcache.rawAddress.toString(), pwszurl.rawAddress.toString(), ppwszfallbackurl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetGroupList(pappcachegrouplist: MutPtr<AppCacheGroupList>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetGroupList(pappcachegrouplist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetIEGroupList(pappcachegrouplist: MutPtr<AppCacheGroupList>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetIEGroupList(pappcachegrouplist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetInfo(happcache: ConstPtr<CVoid>, pappcacheinfo: MutPtr<AppCacheGroupInfo>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetInfo(happcache.rawAddress.toString(), pappcacheinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheGetManifestUrl(happcache: ConstPtr<CVoid>, ppwszmanifesturl: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheGetManifestUrl(happcache.rawAddress.toString(), ppwszmanifesturl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun appCacheLookup(pwszurl: Pcwstr, dwflags: UInt, phappcache: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetAppCacheLookup(pwszurl.rawAddress.toString(), dwflags.toInt(), phappcache.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryA(lpszurlname: Pcstr, lpszlocalfilename: Pcstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpheaderinfo: ConstPtr<UByte>, cchheaderinfo: UInt, lpszfileextension: Pcstr, lpszoriginalurl: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: UInt, ftexpiretime: Filetime, ftmodifiedtime: Filetime, pbblob: ConstPtr<UByte>, cbblob: UInt): UInt =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun commitUrlCacheEntryW(lpszurlname: Pcwstr, lpszlocalfilename: Pcwstr, expiretime: Filetime, lastmodifiedtime: Filetime, cacheentrytype: UInt, lpszheaderinfo: Pcwstr, cchheaderinfo: UInt, lpszfileextension: Pcwstr, lpszoriginalurl: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMD5SSOHash(pszchallengeinfo: Pcwstr, pwszrealm: Pcwstr, pwsztarget: Pcwstr, pbhexhash: MutPtr<UByte>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateMD5SSOHash(pszchallengeinfo.rawAddress.toString(), pwszrealm.rawAddress.toString(), pwsztarget.rawAddress.toString(), pbhexhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheContainerA(name: Pcstr, lpcacheprefix: Pcstr, lpszcachepath: Pcstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr<CVoid>, cbbuffer: ConstPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerA(name.rawAddress.toString(), lpcacheprefix.rawAddress.toString(), lpszcachepath.rawAddress.toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheContainerW(name: Pcwstr, lpcacheprefix: Pcwstr, lpszcachepath: Pcwstr, kbcachelimit: UInt, dwcontainertype: UInt, dwoptions: UInt, pvbuffer: ConstPtr<CVoid>, cbbuffer: ConstPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheContainerW(name.rawAddress.toString(), lpcacheprefix.rawAddress.toString(), lpszcachepath.rawAddress.toString(), kbcachelimit.toInt(), dwcontainertype.toInt(), dwoptions.toInt(), pvbuffer.rawAddress.toString(), cbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryA(lpszurlname: Pcstr, dwexpectedfilesize: UInt, lpszfileextension: Pcstr, lpszfilename: Pstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryA(lpszurlname.rawAddress.toString(), dwexpectedfilesize.toInt(), lpszfileextension.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryExW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt, fpreserveincomingfilename: Bool): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryExW(lpszurlname.rawAddress.toString(), dwexpectedfilesize.toInt(), lpszfileextension.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwreserved.toInt(), fpreserveincomingfilename) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheEntryW(lpszurlname: Pcwstr, dwexpectedfilesize: UInt, lpszfileextension: Pcwstr, lpszfilename: Pwstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheEntryW(lpszurlname.rawAddress.toString(), dwexpectedfilesize.toInt(), lpszfileextension.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createUrlCacheGroup(dwflags: UInt, lpreserved: ConstPtr<CVoid>): Long =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetCreateUrlCacheGroup(dwflags.toInt(), lpreserved.rawAddress.toString()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteIE3Cache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteIE3Cache(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), lpszcmd.rawAddress.toString(), ncmdshow).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheContainerA(name: Pcstr, dwoptions: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerA(name.rawAddress.toString(), dwoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheContainerW(name: Pcwstr, dwoptions: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheContainerW(name.rawAddress.toString(), dwoptions.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntry(lpszurlname: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntry(lpszurlname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntryA(lpszurlname: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryA(lpszurlname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheEntryW(lpszurlname: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheEntryW(lpszurlname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteUrlCacheGroup(groupid: Long, dwflags: UInt, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteUrlCacheGroup(groupid.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteWpadCacheForNetworks(param0: WpadCacheDelete): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDeleteWpadCacheForNetworks(param0) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun detectAutoProxyUrl(pszautoproxyurl: Pstr, cchautoproxyurl: UInt, dwdetectflags: ProxyAutoDetectType): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDetectAutoProxyUrl(pszautoproxyurl.rawAddress.toString(), cchautoproxyurl.toInt(), dwdetectflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun doConnectoidsExist(): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetDoConnectoidsExist() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportCookieFileA(szfilename: Pcstr, fappend: Bool): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetExportCookieFileA(szfilename.rawAddress.toString(), fappend) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportCookieFileW(szfilename: Pcwstr, fappend: Bool): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetExportCookieFileW(szfilename.rawAddress.toString(), fappend) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCloseUrlCache(henumhandle: Handle): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindCloseUrlCache(henumhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheContainerA(pdwmodified: MutPtr<UInt>, lpcontainerinfo: MutPtr<InternetCacheContainerInfoa>, lpcbcontainerinfo: MutPtr<UInt>, dwoptions: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerA(pdwmodified.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString(), dwoptions.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheContainerW(pdwmodified: MutPtr<UInt>, lpcontainerinfo: MutPtr<InternetCacheContainerInfow>, lpcbcontainerinfo: MutPtr<UInt>, dwoptions: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheContainerW(pdwmodified.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString(), dwoptions.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryA(lpszurlsearchpattern: Pcstr, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryA(lpszurlsearchpattern.rawAddress.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryExA(lpszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExA(lpszurlsearchpattern.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryExW(lpszurlsearchpattern: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryExW(lpszurlsearchpattern.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheEntryW(lpszurlsearchpattern: Pcwstr, lpfirstcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheEntryW(lpszurlsearchpattern.rawAddress.toString(), lpfirstcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findFirstUrlCacheGroup(dwflags: UInt, dwfilter: UInt, lpsearchcondition: ConstPtr<CVoid>, dwsearchcondition: UInt, lpgroupid: MutPtr<Long>, lpreserved: ConstPtr<CVoid>): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFindFirstUrlCacheGroup(dwflags.toInt(), dwfilter.toInt(), lpsearchcondition.rawAddress.toString(), dwsearchcondition.toInt(), lpgroupid.rawAddress.toString(), lpreserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheContainerA(henumhandle: Handle, lpcontainerinfo: MutPtr<InternetCacheContainerInfoa>, lpcbcontainerinfo: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerA(henumhandle.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheContainerW(henumhandle: Handle, lpcontainerinfo: MutPtr<InternetCacheContainerInfow>, lpcbcontainerinfo: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheContainerW(henumhandle.rawAddress.toString(), lpcontainerinfo.rawAddress.toString(), lpcbcontainerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryA(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryExA(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExA(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryExW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, lpgroupattributes: ConstPtr<CVoid>, lpcbgroupattributes: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryExW(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpgroupattributes.rawAddress.toString(), lpcbgroupattributes.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheEntryW(henumhandle: Handle, lpnextcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheEntryW(henumhandle.rawAddress.toString(), lpnextcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findNextUrlCacheGroup(hfind: Handle, lpgroupid: MutPtr<Long>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindNextUrlCacheGroup(hfind.rawAddress.toString(), lpgroupid.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findP3PPolicySymbol(pszsymbol: Pcstr): Int =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFindP3PPolicySymbol(pszsymbol.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUrlCacheSpaceA(lpszcachepath: Pcstr, dwsize: UInt, dwfilter: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceA(lpszcachepath.rawAddress.toString(), dwsize.toInt(), dwfilter.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeUrlCacheSpaceW(lpszcachepath: Pcwstr, dwsize: UInt, dwfilter: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFreeUrlCacheSpaceW(lpszcachepath.rawAddress.toString(), dwsize.toInt(), dwfilter.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCommandA(hconnect: ConstPtr<CVoid>, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcstr, dwcontext: ULong, phftpcommand: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpCommandA(hconnect.rawAddress.toString(), fexpectresponse, dwflags.toInt(), lpszcommand.rawAddress.toString(), dwcontext.toString(), phftpcommand.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCommandW(hconnect: ConstPtr<CVoid>, fexpectresponse: Bool, dwflags: FtpFlags, lpszcommand: Pcwstr, dwcontext: ULong, phftpcommand: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpCommandW(hconnect.rawAddress.toString(), fexpectresponse, dwflags.toInt(), lpszcommand.rawAddress.toString(), dwcontext.toString(), phftpcommand.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCreateDirectoryA(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpCreateDirectoryA(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpCreateDirectoryW(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpCreateDirectoryW(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpDeleteFileA(hconnect: ConstPtr<CVoid>, lpszfilename: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpDeleteFileA(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpDeleteFileW(hconnect: ConstPtr<CVoid>, lpszfilename: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpDeleteFileW(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpFindFirstFileA(hconnect: ConstPtr<CVoid>, lpszsearchfile: Pcstr, lpfindfiledata: MutPtr<Win32FindDataa>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFtpFindFirstFileA(hconnect.rawAddress.toString(), lpszsearchfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpFindFirstFileW(hconnect: ConstPtr<CVoid>, lpszsearchfile: Pcwstr, lpfindfiledata: MutPtr<Win32FindDataw>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFtpFindFirstFileW(hconnect.rawAddress.toString(), lpszsearchfile.rawAddress.toString(), lpfindfiledata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetCurrentDirectoryA(hconnect: ConstPtr<CVoid>, lpszcurrentdirectory: Pstr, lpdwcurrentdirectory: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryA(hconnect.rawAddress.toString(), lpszcurrentdirectory.rawAddress.toString(), lpdwcurrentdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetCurrentDirectoryW(hconnect: ConstPtr<CVoid>, lpszcurrentdirectory: Pwstr, lpdwcurrentdirectory: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpGetCurrentDirectoryW(hconnect.rawAddress.toString(), lpszcurrentdirectory.rawAddress.toString(), lpdwcurrentdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileA(hconnect: ConstPtr<CVoid>, lpszremotefile: Pcstr, lpsznewfile: Pcstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileA(hconnect.rawAddress.toString(), lpszremotefile.rawAddress.toString(), lpsznewfile.rawAddress.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileEx(hftpsession: ConstPtr<CVoid>, lpszremotefile: Pcstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileEx(hftpsession.rawAddress.toString(), lpszremotefile.rawAddress.toString(), lpsznewfile.rawAddress.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileSize(hfile: ConstPtr<CVoid>, lpdwfilesizehigh: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileSize(hfile.rawAddress.toString(), lpdwfilesizehigh.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpGetFileW(hconnect: ConstPtr<CVoid>, lpszremotefile: Pcwstr, lpsznewfile: Pcwstr, ffailifexists: Bool, dwflagsandattributes: UInt, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpGetFileW(hconnect.rawAddress.toString(), lpszremotefile.rawAddress.toString(), lpsznewfile.rawAddress.toString(), ffailifexists, dwflagsandattributes.toInt(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpOpenFileA(hconnect: ConstPtr<CVoid>, lpszfilename: Pcstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFtpOpenFileA(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpOpenFileW(hconnect: ConstPtr<CVoid>, lpszfilename: Pcwstr, dwaccess: UInt, dwflags: FtpFlags, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetFtpOpenFileW(hconnect.rawAddress.toString(), lpszfilename.rawAddress.toString(), dwaccess.toInt(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileA(hconnect: ConstPtr<CVoid>, lpszlocalfile: Pcstr, lpsznewremotefile: Pcstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpPutFileA(hconnect.rawAddress.toString(), lpszlocalfile.rawAddress.toString(), lpsznewremotefile.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileEx(hftpsession: ConstPtr<CVoid>, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcstr, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpPutFileEx(hftpsession.rawAddress.toString(), lpszlocalfile.rawAddress.toString(), lpsznewremotefile.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpPutFileW(hconnect: ConstPtr<CVoid>, lpszlocalfile: Pcwstr, lpsznewremotefile: Pcwstr, dwflags: FtpFlags, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpPutFileW(hconnect.rawAddress.toString(), lpszlocalfile.rawAddress.toString(), lpsznewremotefile.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRemoveDirectoryA(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryA(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRemoveDirectoryW(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpRemoveDirectoryW(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRenameFileA(hconnect: ConstPtr<CVoid>, lpszexisting: Pcstr, lpsznew: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpRenameFileA(hconnect.rawAddress.toString(), lpszexisting.rawAddress.toString(), lpsznew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpRenameFileW(hconnect: ConstPtr<CVoid>, lpszexisting: Pcwstr, lpsznew: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpRenameFileW(hconnect.rawAddress.toString(), lpszexisting.rawAddress.toString(), lpsznew.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpSetCurrentDirectoryA(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryA(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ftpSetCurrentDirectoryW(hconnect: ConstPtr<CVoid>, lpszdirectory: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetFtpSetCurrentDirectoryW(hconnect.rawAddress.toString(), lpszdirectory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDiskInfoA(pszpath: Pcstr, pdwclustersize: MutPtr<UInt>, pdlavail: MutPtr<ULong>, pdltotal: MutPtr<ULong>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetDiskInfoA(pszpath.rawAddress.toString(), pdwclustersize.rawAddress.toString(), pdlavail.rawAddress.toString(), pdltotal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheConfigInfoA(lpcacheconfiginfo: MutPtr<InternetCacheConfigInfoa>, lpcbcacheconfiginfo: ConstPtr<UInt>, dwfieldcontrol: CacheConfig): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoA(lpcacheconfiginfo.rawAddress.toString(), lpcbcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheConfigInfoW(lpcacheconfiginfo: MutPtr<InternetCacheConfigInfow>, lpcbcacheconfiginfo: ConstPtr<UInt>, dwfieldcontrol: CacheConfig): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheConfigInfoW(lpcacheconfiginfo.rawAddress.toString(), lpcbcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryBinaryBlob(pwszurlname: Pcwstr, dwtype: MutPtr<UInt>, pftexpiretime: MutPtr<Filetime>, pftaccesstime: MutPtr<Filetime>, pftmodifiedtime: MutPtr<Filetime>, ppbblob: MutPtr<MutPtr<UByte>>, pcbblob: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryBinaryBlob(pwszurlname.rawAddress.toString(), dwtype.rawAddress.toString(), pftexpiretime.rawAddress.toString(), pftaccesstime.rawAddress.toString(), pftmodifiedtime.rawAddress.toString(), ppbblob.rawAddress.toString(), pcbblob.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoExA(lpszurl: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, lpszredirecturl: Pcstr, lpcbredirecturl: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExA(lpszurl.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpszredirecturl.rawAddress.toString(), lpcbredirecturl.rawAddress.toString(), lpreserved.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoExW(lpszurl: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, lpszredirecturl: Pcwstr, lpcbredirecturl: ConstPtr<UInt>, lpreserved: ConstPtr<CVoid>, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoExW(lpszurl.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), lpszredirecturl.rawAddress.toString(), lpcbredirecturl.rawAddress.toString(), lpreserved.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheEntryInfoW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr<InternetCacheGroupInfoa>, lpcbgroupinfo: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpcbgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: MutPtr<InternetCacheGroupInfow>, lpcbgroupinfo: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpcbgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGetUrlCacheHeaderData(nidx.toInt(), lpdwdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherCreateLocatorA(lpszhost: Pcstr, nserverport: UShort, lpszdisplaystring: Pcstr, lpszselectorstring: Pcstr, dwgophertype: UInt, lpszlocator: Pstr, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGopherCreateLocatorA(lpszhost.rawAddress.toString(), nserverport.toInt(), lpszdisplaystring.rawAddress.toString(), lpszselectorstring.rawAddress.toString(), dwgophertype.toInt(), lpszlocator.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherCreateLocatorW(lpszhost: Pcwstr, nserverport: UShort, lpszdisplaystring: Pcwstr, lpszselectorstring: Pcwstr, dwgophertype: UInt, lpszlocator: Pwstr, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGopherCreateLocatorW(lpszhost.rawAddress.toString(), nserverport.toInt(), lpszdisplaystring.rawAddress.toString(), lpszselectorstring.rawAddress.toString(), dwgophertype.toInt(), lpszlocator.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherFindFirstFileA(hconnect: ConstPtr<CVoid>, lpszlocator: Pcstr, lpszsearchstring: Pcstr, lpfinddata: MutPtr<GopherFindDataa>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetGopherFindFirstFileA(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszsearchstring.rawAddress.toString(), lpfinddata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherFindFirstFileW(hconnect: ConstPtr<CVoid>, lpszlocator: Pcwstr, lpszsearchstring: Pcwstr, lpfinddata: MutPtr<GopherFindDataw>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetGopherFindFirstFileW(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszsearchstring.rawAddress.toString(), lpfinddata.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetAttributeA(hconnect: ConstPtr<CVoid>, lpszlocator: Pcstr, lpszattributename: Pcstr, lpbuffer: MutPtr<UByte>, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr<UInt>, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGopherGetAttributeA(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszattributename.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), lpdwcharactersreturned.rawAddress.toString(), 0L.toString(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetAttributeW(hconnect: ConstPtr<CVoid>, lpszlocator: Pcwstr, lpszattributename: Pcwstr, lpbuffer: MutPtr<UByte>, dwbufferlength: UInt, lpdwcharactersreturned: MutPtr<UInt>, lpfnenumerator: GopherAttributeEnumerator, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGopherGetAttributeW(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszattributename.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), lpdwcharactersreturned.rawAddress.toString(), 0L.toString(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetLocatorTypeA(lpszlocator: Pcstr, lpdwgophertype: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeA(lpszlocator.rawAddress.toString(), lpdwgophertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherGetLocatorTypeW(lpszlocator: Pcwstr, lpdwgophertype: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetGopherGetLocatorTypeW(lpszlocator.rawAddress.toString(), lpdwgophertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherOpenFileA(hconnect: ConstPtr<CVoid>, lpszlocator: Pcstr, lpszview: Pcstr, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetGopherOpenFileA(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszview.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gopherOpenFileW(hconnect: ConstPtr<CVoid>, lpszlocator: Pcwstr, lpszview: Pcwstr, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetGopherOpenFileW(hconnect.rawAddress.toString(), lpszlocator.rawAddress.toString(), lpszview.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddRequestHeadersA(hrequest: ConstPtr<CVoid>, lpszheaders: Pcstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersA(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpAddRequestHeadersW(hrequest: ConstPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, dwmodifiers: HttpAddreqFlag): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpAddRequestHeadersW(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwmodifiers.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCheckDavComplianceA(lpszurl: Pcstr, lpszcompliancetoken: Pcstr, lpffound: MutPtr<Bool>, hwnd: Hwnd, lpvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceA(lpszurl.rawAddress.toString(), lpszcompliancetoken.rawAddress.toString(), lpffound.rawAddress.toString(), hwnd.rawAddress.toString(), lpvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCheckDavComplianceW(lpszurl: Pcwstr, lpszcompliancetoken: Pcwstr, lpffound: MutPtr<Bool>, hwnd: Hwnd, lpvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpCheckDavComplianceW(lpszurl.rawAddress.toString(), lpszcompliancetoken.rawAddress.toString(), lpffound.rawAddress.toString(), hwnd.rawAddress.toString(), lpvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpCloseDependencyHandle(hdependencyhandle: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetHttpCloseDependencyHandle(hdependencyhandle.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun httpDuplicateDependencyHandle(hdependencyhandle: ConstPtr<CVoid>, phduplicateddependencyhandle: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpDuplicateDependencyHandle(hdependencyhandle.rawAddress.toString(), phduplicateddependencyhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpEndRequestA(hrequest: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpEndRequestA(hrequest.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpEndRequestW(hrequest: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpEndRequestW(hrequest.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpGetServerCredentials(pwszurl: Pcwstr, ppwszusername: MutPtr<Pwstr>, ppwszpassword: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpGetServerCredentials(pwszurl.rawAddress.toString(), ppwszusername.rawAddress.toString(), ppwszpassword.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIndicatePageLoadComplete(hdependencyhandle: ConstPtr<CVoid>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpIndicatePageLoadComplete(hdependencyhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpIsHostHstsEnabled(pcwszurl: Pcwstr, pfishsts: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpIsHostHstsEnabled(pcwszurl.rawAddress.toString(), pfishsts.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenDependencyHandle(hrequesthandle: ConstPtr<CVoid>, fbackground: Bool, phdependencyhandle: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpOpenDependencyHandle(hrequesthandle.rawAddress.toString(), fbackground, phdependencyhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenRequestA(hconnect: ConstPtr<CVoid>, lpszverb: Pcstr, lpszobjectname: Pcstr, lpszversion: Pcstr, lpszreferrer: Pcstr, lplpszaccepttypes: ConstPtr<Pcstr>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetHttpOpenRequestA(hconnect.rawAddress.toString(), lpszverb.rawAddress.toString(), lpszobjectname.rawAddress.toString(), lpszversion.rawAddress.toString(), lpszreferrer.rawAddress.toString(), lplpszaccepttypes.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpOpenRequestW(hconnect: ConstPtr<CVoid>, lpszverb: Pcwstr, lpszobjectname: Pcwstr, lpszversion: Pcwstr, lpszreferrer: Pcwstr, lplpszaccepttypes: ConstPtr<Pcwstr>, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetHttpOpenRequestW(hconnect.rawAddress.toString(), lpszverb.rawAddress.toString(), lpszobjectname.rawAddress.toString(), lpszversion.rawAddress.toString(), lpszreferrer.rawAddress.toString(), lplpszaccepttypes.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPushClose(hwait: HttpPushWaitHandle) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetHttpPushClose(hwait.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun httpPushEnable(hrequest: ConstPtr<CVoid>, ptransportsetting: ConstPtr<HttpPushTransportSetting>, phwait: MutPtr<HttpPushWaitHandle>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpPushEnable(hrequest.rawAddress.toString(), ptransportsetting.rawAddress.toString(), phwait.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpPushWait(hwait: HttpPushWaitHandle, etype: HttpPushWaitType, pnotificationstatus: MutPtr<HttpPushNotificationStatus>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpPushWait(hwait.rawAddress.toString(), etype, pnotificationstatus.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryInfoA(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpQueryInfoA(hrequest.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpQueryInfoW(hrequest: ConstPtr<CVoid>, dwinfolevel: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>, lpdwindex: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpQueryInfoW(hrequest.rawAddress.toString(), dwinfolevel.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), lpdwindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestA(hrequest: ConstPtr<CVoid>, lpszheaders: Pcstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestA(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestExA(hrequest: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersa>, lpbuffersout: MutPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestExA(hrequest.rawAddress.toString(), lpbuffersin.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestExW(hrequest: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersw>, lpbuffersout: MutPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestExW(hrequest.rawAddress.toString(), lpbuffersin.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpSendRequestW(hrequest: ConstPtr<CVoid>, lpszheaders: Pcwstr, dwheaderslength: UInt, lpoptional: ConstPtr<CVoid>, dwoptionallength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpSendRequestW(hrequest.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), lpoptional.rawAddress.toString(), dwoptionallength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketClose(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketClose(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketCompleteUpgrade(hrequest: ConstPtr<CVoid>, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketCompleteUpgrade(hrequest.rawAddress.toString(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketQueryCloseStatus(hwebsocket: ConstPtr<CVoid>, pusstatus: MutPtr<UShort>, pvreason: MutPtr<CVoid>, dwreasonlength: UInt, pdwreasonlengthconsumed: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketQueryCloseStatus(hwebsocket.rawAddress.toString(), pusstatus.rawAddress.toString(), pvreason.rawAddress.toString(), dwreasonlength.toInt(), pdwreasonlengthconsumed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketReceive(hwebsocket: ConstPtr<CVoid>, pvbuffer: MutPtr<CVoid>, dwbufferlength: UInt, pdwbytesread: MutPtr<UInt>, pbuffertype: MutPtr<HttpWebSocketBufferType>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketReceive(hwebsocket.rawAddress.toString(), pvbuffer.rawAddress.toString(), dwbufferlength.toInt(), pdwbytesread.rawAddress.toString(), pbuffertype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketSend(hwebsocket: ConstPtr<CVoid>, buffertype: HttpWebSocketBufferType, pvbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketSend(hwebsocket.rawAddress.toString(), buffertype, pvbuffer.rawAddress.toString(), dwbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun httpWebSocketShutdown(hwebsocket: ConstPtr<CVoid>, usstatus: UShort, pvreason: ConstPtr<CVoid>, dwreasonlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetHttpWebSocketShutdown(hwebsocket.rawAddress.toString(), usstatus.toInt(), pvreason.rawAddress.toString(), dwreasonlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importCookieFileA(szfilename: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetImportCookieFileA(szfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importCookieFileW(szfilename: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetImportCookieFileW(szfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun incrementUrlCacheHeaderData(nidx: UInt, lpdwdata: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIncrementUrlCacheHeaderData(nidx.toInt(), lpdwdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internalInternetGetCookie(lpszurl: Pcstr, lpszcookiedata: Pstr, lpdwdatasize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternalInternetGetCookie(lpszurl.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwdatasize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAlgIdToStringA(ai: AlgId, lpstr: Pstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetAlgIdToStringA(ai.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAlgIdToStringW(ai: AlgId, lpstr: Pwstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetAlgIdToStringW(ai.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAttemptConnect(dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetAttemptConnect(dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAutodial(dwflags: InternetAutodial, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetAutodial(dwflags.toInt(), hwndparent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetAutodialHangup(dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetAutodialHangup(dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCanonicalizeUrlA(lpszurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlA(lpszurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCanonicalizeUrlW(lpszurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCanonicalizeUrlW(lpszurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCheckConnectionA(lpszurl: Pcstr, dwflags: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCheckConnectionA(lpszurl.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCheckConnectionW(lpszurl: Pcwstr, dwflags: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCheckConnectionW(lpszurl.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetClearAllPerSiteCookieDecisions(): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetClearAllPerSiteCookieDecisions() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCloseHandle(hinternet: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCloseHandle(hinternet.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCombineUrlA(lpszbaseurl: Pcstr, lpszrelativeurl: Pcstr, lpszbuffer: Pstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCombineUrlA(lpszbaseurl.rawAddress.toString(), lpszrelativeurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCombineUrlW(lpszbaseurl: Pcwstr, lpszrelativeurl: Pcwstr, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCombineUrlW(lpszbaseurl.rawAddress.toString(), lpszrelativeurl.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossing(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossing(hwnd.rawAddress.toString(), szurlprev.rawAddress.toString(), szurlnew.rawAddress.toString(), bpost).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossingA(hwnd: Hwnd, szurlprev: Pcstr, szurlnew: Pcstr, bpost: Bool): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingA(hwnd.rawAddress.toString(), szurlprev.rawAddress.toString(), szurlnew.rawAddress.toString(), bpost).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConfirmZoneCrossingW(hwnd: Hwnd, szurlprev: Pcwstr, szurlnew: Pcwstr, bpost: Bool): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetConfirmZoneCrossingW(hwnd.rawAddress.toString(), szurlprev.rawAddress.toString(), szurlnew.rawAddress.toString(), bpost).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConnectA(hinternet: ConstPtr<CVoid>, lpszservername: Pcstr, nserverport: UShort, lpszusername: Pcstr, lpszpassword: Pcstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetInternetConnectA(hinternet.rawAddress.toString(), lpszservername.rawAddress.toString(), nserverport.toInt(), lpszusername.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConnectW(hinternet: ConstPtr<CVoid>, lpszservername: Pcwstr, nserverport: UShort, lpszusername: Pcwstr, lpszpassword: Pcwstr, dwservice: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetInternetConnectW(hinternet.rawAddress.toString(), lpszservername.rawAddress.toString(), nserverport.toInt(), lpszusername.rawAddress.toString(), lpszpassword.rawAddress.toString(), dwservice.toInt(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetConvertUrlFromWireToWideChar(pcszurl: Pcstr, cchurl: UInt, pcwszbaseurl: Pcwstr, dwcodepagehost: UInt, dwcodepagepath: UInt, fencodepathextra: Bool, dwcodepageextra: UInt, ppwszconvertedurl: MutPtr<Pwstr>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetConvertUrlFromWireToWideChar(pcszurl.rawAddress.toString(), cchurl.toInt(), pcwszbaseurl.rawAddress.toString(), dwcodepagehost.toInt(), dwcodepagepath.toInt(), fencodepathextra, dwcodepageextra.toInt(), ppwszconvertedurl.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCrackUrlA(lpszurl: Pcstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr<UrlComponentsa>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCrackUrlA(lpszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCrackUrlW(lpszurl: Pcwstr, dwurllength: UInt, dwflags: WinHttpCreateUrlFlags, lpurlcomponents: MutPtr<UrlComponentsw>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCrackUrlW(lpszurl.rawAddress.toString(), dwurllength.toInt(), dwflags.toInt(), lpurlcomponents.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCreateUrlA(lpurlcomponents: ConstPtr<UrlComponentsa>, dwflags: UInt, lpszurl: Pstr, lpdwurllength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCreateUrlA(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), lpszurl.rawAddress.toString(), lpdwurllength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetCreateUrlW(lpurlcomponents: ConstPtr<UrlComponentsw>, dwflags: UInt, lpszurl: Pwstr, lpdwurllength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetCreateUrlW(lpurlcomponents.rawAddress.toString(), dwflags.toInt(), lpszurl.rawAddress.toString(), lpdwurllength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDial(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr<UInt>, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetDial(hwndparent.rawAddress.toString(), lpszconnectoid.rawAddress.toString(), dwflags.toInt(), lpdwconnection.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDialA(hwndparent: Hwnd, lpszconnectoid: Pcstr, dwflags: UInt, lpdwconnection: MutPtr<ULong>, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetDialA(hwndparent.rawAddress.toString(), lpszconnectoid.rawAddress.toString(), dwflags.toInt(), lpdwconnection.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetDialW(hwndparent: Hwnd, lpszconnectoid: Pcwstr, dwflags: UInt, lpdwconnection: MutPtr<ULong>, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetDialW(hwndparent.rawAddress.toString(), lpszconnectoid.rawAddress.toString(), dwflags.toInt(), lpdwconnection.rawAddress.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetEnumPerSiteCookieDecisionA(pszsitename: Pstr, pcsitenamesize: MutPtr<UInt>, pdwdecision: MutPtr<UInt>, dwindex: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionA(pszsitename.rawAddress.toString(), pcsitenamesize.rawAddress.toString(), pdwdecision.rawAddress.toString(), dwindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetEnumPerSiteCookieDecisionW(pszsitename: Pwstr, pcsitenamesize: MutPtr<UInt>, pdwdecision: MutPtr<UInt>, dwindex: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetEnumPerSiteCookieDecisionW(pszsitename.rawAddress.toString(), pcsitenamesize.rawAddress.toString(), pdwdecision.rawAddress.toString(), dwindex.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetErrorDlg(hwnd: Hwnd, hrequest: MutPtr<CVoid>, dwerror: UInt, dwflags: UInt, lppvdata: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetErrorDlg(hwnd.rawAddress.toString(), hrequest.rawAddress.toString(), dwerror.toInt(), dwflags.toInt(), lppvdata.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFindNextFileA(hfind: ConstPtr<CVoid>, lpvfinddata: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetFindNextFileA(hfind.rawAddress.toString(), lpvfinddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFindNextFileW(hfind: ConstPtr<CVoid>, lpvfinddata: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetFindNextFileW(hfind.rawAddress.toString(), lpvfinddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFortezzaCommand(dwcommand: UInt, hwnd: Hwnd, dwreserved: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetFortezzaCommand(dwcommand.toInt(), hwnd.rawAddress.toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetFreeCookies(pcookies: MutPtr<InternetCookie2>, dwcookiecount: UInt) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetInternetFreeCookies(pcookies.rawAddress.toString(), dwcookiecount.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun internetFreeProxyInfoList(pproxyinfolist: MutPtr<WininetProxyInfoList>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetInternetFreeProxyInfoList(pproxyinfolist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun internetGetConnectedState(lpdwflags: MutPtr<InternetConnection>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedState(lpdwflags.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateEx(lpdwflags: MutPtr<InternetConnection>, lpszconnectionname: Pstr, dwnamelen: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedStateEx(lpdwflags.rawAddress.toString(), lpszconnectionname.rawAddress.toString(), dwnamelen.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateExA(lpdwflags: MutPtr<InternetConnection>, lpszconnectionname: Pstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExA(lpdwflags.rawAddress.toString(), lpszconnectionname.rawAddress.toString(), cchnamelen.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetConnectedStateExW(lpdwflags: MutPtr<InternetConnection>, lpszconnectionname: Pwstr, cchnamelen: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetConnectedStateExW(lpdwflags.rawAddress.toString(), lpszconnectionname.rawAddress.toString(), cchnamelen.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pstr, lpdwsize: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieEx2(pcwszurl: Pcwstr, pcwszcookiename: Pcwstr, dwflags: UInt, ppcookies: MutPtr<MutPtr<InternetCookie2>>, pdwcookiecount: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieEx2(pcwszurl.rawAddress.toString(), pcwszcookiename.rawAddress.toString(), dwflags.toInt(), ppcookies.rawAddress.toString(), pdwcookiecount.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, lpdwsize: MutPtr<UInt>, dwflags: InternetCookieFlags, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieExA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, lpdwsize: MutPtr<UInt>, dwflags: InternetCookieFlags, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieExW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString(), dwflags.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pwstr, lpdwsize: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetCookieW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), lpdwsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetLastResponseInfoA(lpdwerror: MutPtr<UInt>, lpszbuffer: Pstr, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoA(lpdwerror.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetLastResponseInfoW(lpdwerror: MutPtr<UInt>, lpszbuffer: Pwstr, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetLastResponseInfoW(lpdwerror.rawAddress.toString(), lpszbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetPerSiteCookieDecisionA(pchhostname: Pcstr, presult: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionA(pchhostname.rawAddress.toString(), presult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetPerSiteCookieDecisionW(pchhostname: Pcwstr, presult: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetPerSiteCookieDecisionW(pchhostname.rawAddress.toString(), presult.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetProxyForUrl(hinternet: ConstPtr<CVoid>, pcwszurl: Pcwstr, pproxyinfolist: MutPtr<WininetProxyInfoList>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetProxyForUrl(hinternet.rawAddress.toString(), pcwszurl.rawAddress.toString(), pproxyinfolist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURL(lpszurl: Pcstr, ppcertchain: MutPtr<MutPtr<CertChainContext>>, pdwsecureflags: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURL(lpszurl.rawAddress.toString(), ppcertchain.rawAddress.toString(), pdwsecureflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURLA(lpszurl: Pcstr, ppcertchain: MutPtr<MutPtr<CertChainContext>>, pdwsecureflags: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLA(lpszurl.rawAddress.toString(), ppcertchain.rawAddress.toString(), pdwsecureflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGetSecurityInfoByURLW(lpszurl: Pcwstr, ppcertchain: MutPtr<MutPtr<CertChainContext>>, pdwsecureflags: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGetSecurityInfoByURLW(lpszurl.rawAddress.toString(), ppcertchain.rawAddress.toString(), pdwsecureflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnline(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGoOnline(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnlineA(lpszurl: Pcstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGoOnlineA(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetGoOnlineW(lpszurl: Pcwstr, hwndparent: Hwnd, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetGoOnlineW(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetHangUp(dwconnection: ULong, dwreserved: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetHangUp(dwconnection.toString(), dwreserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetInitializeAutoProxyDll(dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetInitializeAutoProxyDll(dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetLockRequestFile(hinternet: ConstPtr<CVoid>, lphlockrequestinfo: MutPtr<Handle>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetLockRequestFile(hinternet.rawAddress.toString(), lphlockrequestinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenA(lpszagent: Pcstr, dwaccesstype: UInt, lpszproxy: Pcstr, lpszproxybypass: Pcstr, dwflags: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetInternetOpenA(lpszagent.rawAddress.toString(), dwaccesstype.toInt(), lpszproxy.rawAddress.toString(), lpszproxybypass.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenUrlA(hinternet: ConstPtr<CVoid>, lpszurl: Pcstr, lpszheaders: Pcstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetInternetOpenUrlA(hinternet.rawAddress.toString(), lpszurl.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenUrlW(hinternet: ConstPtr<CVoid>, lpszurl: Pcwstr, lpszheaders: Pcwstr, dwheaderslength: UInt, dwflags: UInt, dwcontext: ULong): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetInternetOpenUrlW(hinternet.rawAddress.toString(), lpszurl.rawAddress.toString(), lpszheaders.rawAddress.toString(), dwheaderslength.toInt(), dwflags.toInt(), dwcontext.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetOpenW(lpszagent: Pcwstr, dwaccesstype: UInt, lpszproxy: Pcwstr, lpszproxybypass: Pcwstr, dwflags: UInt): MutPtr<CVoid> =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetInternetOpenW(lpszagent.rawAddress.toString(), dwaccesstype.toInt(), lpszproxy.rawAddress.toString(), lpszproxybypass.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryDataAvailable(hfile: ConstPtr<CVoid>, lpdwnumberofbytesavailable: MutPtr<UInt>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetQueryDataAvailable(hfile.rawAddress.toString(), lpdwnumberofbytesavailable.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryFortezzaStatus(pdwstatus: MutPtr<UInt>, dwreserved: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetQueryFortezzaStatus(pdwstatus.rawAddress.toString(), dwreserved.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryOptionA(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetQueryOptionA(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetQueryOptionW(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: MutPtr<CVoid>, lpdwbufferlength: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetQueryOptionW(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), lpdwbufferlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFile(hfile: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, dwnumberofbytestoread: UInt, lpdwnumberofbytesread: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetReadFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestoread.toInt(), lpdwnumberofbytesread.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFileExA(hfile: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetReadFileExA(hfile.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetReadFileExW(hfile: ConstPtr<CVoid>, lpbuffersout: MutPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetReadFileExW(hfile.rawAddress.toString(), lpbuffersout.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSecurityProtocolToStringA(dwprotocol: UInt, lpstr: Pstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringA(dwprotocol.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSecurityProtocolToStringW(dwprotocol: UInt, lpstr: Pwstr, lpdwstrlength: MutPtr<UInt>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSecurityProtocolToStringW(dwprotocol.toInt(), lpstr.rawAddress.toString(), lpdwstrlength.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieEx2(pcwszurl: Pcwstr, pcookie: ConstPtr<InternetCookie2>, pcwszp3ppolicy: Pcwstr, dwflags: UInt, pdwcookiestate: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieEx2(pcwszurl.rawAddress.toString(), pcookie.rawAddress.toString(), pcwszp3ppolicy.rawAddress.toString(), dwflags.toInt(), pdwcookiestate.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieExA(lpszurl: Pcstr, lpszcookiename: Pcstr, lpszcookiedata: Pcstr, dwflags: UInt, dwreserved: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieExA(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), dwflags.toInt(), dwreserved.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieExW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr, dwflags: UInt, dwreserved: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieExW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString(), dwflags.toInt(), dwreserved.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetCookieW(lpszurl: Pcwstr, lpszcookiename: Pcwstr, lpszcookiedata: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetCookieW(lpszurl.rawAddress.toString(), lpszcookiename.rawAddress.toString(), lpszcookiedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialState(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetDialState(lpszconnectoid.rawAddress.toString(), dwstate.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialStateA(lpszconnectoid: Pcstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetDialStateA(lpszconnectoid.rawAddress.toString(), dwstate.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetDialStateW(lpszconnectoid: Pcwstr, dwstate: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetDialStateW(lpszconnectoid.rawAddress.toString(), dwstate.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetFilePointer(hfile: ConstPtr<CVoid>, ldistancetomove: Int, lpdistancetomovehigh: MutPtr<Int>, dwmovemethod: UInt, dwcontext: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetFilePointer(hfile.rawAddress.toString(), ldistancetomove, lpdistancetomovehigh.rawAddress.toString(), dwmovemethod.toInt(), dwcontext.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionA(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionA(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionExA(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionExA(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionExW(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt, dwflags: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionExW(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetOptionW(hinternet: ConstPtr<CVoid>, dwoption: UInt, lpbuffer: ConstPtr<CVoid>, dwbufferlength: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetOptionW(hinternet.rawAddress.toString(), dwoption.toInt(), lpbuffer.rawAddress.toString(), dwbufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetPerSiteCookieDecisionA(pchhostname: Pcstr, dwdecision: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionA(pchhostname.rawAddress.toString(), dwdecision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetPerSiteCookieDecisionW(pchhostname: Pcwstr, dwdecision: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetSetPerSiteCookieDecisionW(pchhostname.rawAddress.toString(), dwdecision.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallback(hinternet: ConstPtr<CVoid>, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (windowsWin32NetworkingWininetNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallbackA(hinternet: ConstPtr<CVoid>, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (windowsWin32NetworkingWininetNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetSetStatusCallbackW(hinternet: ConstPtr<CVoid>, lpfninternetcallback: LpinternetStatusCallback): LpinternetStatusCallback =
    if (windowsWin32NetworkingWininetNapiAvailable) null else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURL(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURL(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURLA(lpszurl: Pcstr, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLA(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetShowSecurityInfoByURLW(lpszurl: Pcwstr, hwndparent: Hwnd): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetShowSecurityInfoByURLW(lpszurl.rawAddress.toString(), hwndparent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTime(pst: ConstPtr<Systemtime>, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTime(pst.rawAddress.toString(), dwrfc.toInt(), lpsztime.rawAddress.toString(), cbtime.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTimeA(pst: ConstPtr<Systemtime>, dwrfc: UInt, lpsztime: Pstr, cbtime: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeA(pst.rawAddress.toString(), dwrfc.toInt(), lpsztime.rawAddress.toString(), cbtime.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeFromSystemTimeW(pst: ConstPtr<Systemtime>, dwrfc: UInt, lpsztime: Pwstr, cbtime: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetTimeFromSystemTimeW(pst.rawAddress.toString(), dwrfc.toInt(), lpsztime.rawAddress.toString(), cbtime.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTime(lpsztime: Pcstr, pst: MutPtr<Systemtime>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetTimeToSystemTime(lpsztime.rawAddress.toString(), pst.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTimeA(lpsztime: Pcstr, pst: MutPtr<Systemtime>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeA(lpsztime.rawAddress.toString(), pst.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetTimeToSystemTimeW(lpsztime: Pcwstr, pst: MutPtr<Systemtime>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetTimeToSystemTimeW(lpsztime.rawAddress.toString(), pst.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetUnlockRequestFile(hlockrequestinfo: Handle): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetUnlockRequestFile(hlockrequestinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFile(hfile: ConstPtr<CVoid>, lpbuffer: ConstPtr<CVoid>, dwnumberofbytestowrite: UInt, lpdwnumberofbyteswritten: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetWriteFile(hfile.rawAddress.toString(), lpbuffer.rawAddress.toString(), dwnumberofbytestowrite.toInt(), lpdwnumberofbyteswritten.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFileExA(hfile: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersa>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetWriteFileExA(hfile.rawAddress.toString(), lpbuffersin.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun internetWriteFileExW(hfile: ConstPtr<CVoid>, lpbuffersin: ConstPtr<InternetBuffersw>, dwflags: UInt, dwcontext: ULong): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetInternetWriteFileExW(hfile.rawAddress.toString(), lpbuffersin.rawAddress.toString(), dwflags.toInt(), dwcontext.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDomainLegalCookieDomainA(pchdomain: Pcstr, pchfulldomain: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainA(pchdomain.rawAddress.toString(), pchfulldomain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isDomainLegalCookieDomainW(pchdomain: Pcwstr, pchfulldomain: Pcwstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIsDomainLegalCookieDomainW(pchdomain.rawAddress.toString(), pchfulldomain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isHostInProxyBypassList(tscheme: InternetScheme, lpszhost: Pcstr, cchhost: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIsHostInProxyBypassList(tscheme, lpszhost.rawAddress.toString(), cchhost.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isProfilesEnabled(): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIsProfilesEnabled() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUrlCacheEntryExpiredA(lpszurlname: Pcstr, dwflags: UInt, pftlastmodified: MutPtr<Filetime>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredA(lpszurlname.rawAddress.toString(), dwflags.toInt(), pftlastmodified.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isUrlCacheEntryExpiredW(lpszurlname: Pcwstr, dwflags: UInt, pftlastmodified: MutPtr<Filetime>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetIsUrlCacheEntryExpiredW(lpszurlname.rawAddress.toString(), dwflags.toInt(), pftlastmodified.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadUrlCacheContent(): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetLoadUrlCacheContent() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun parseX509EncodedCertificateForListBoxEntry(lpcert: ConstPtr<UByte>, cbcert: UInt, lpszlistboxentry: Pstr, lpdwlistboxentry: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetParseX509EncodedCertificateForListBoxEntry(lpcert.rawAddress.toString(), cbcert.toInt(), lpszlistboxentry.rawAddress.toString(), lpdwlistboxentry.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun performOperationOverUrlCacheA(pszurlsearchpattern: Pcstr, dwflags: UInt, dwfilter: UInt, groupid: Long, preserved1: ConstPtr<CVoid>, pdwreserved2: ConstPtr<UInt>, preserved3: ConstPtr<CVoid>, op: CacheOperator, poperatordata: MutPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetPerformOperationOverUrlCacheA(pszurlsearchpattern.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), preserved1.rawAddress.toString(), pdwreserved2.rawAddress.toString(), preserved3.rawAddress.toString(), 0L.toString(), poperatordata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privacyGetZonePreferenceW(dwzone: UInt, dwtype: UInt, pdwtemplate: MutPtr<UInt>, pszbuffer: Pwstr, pdwbufferlength: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetPrivacyGetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), pdwtemplate.rawAddress.toString(), pszbuffer.rawAddress.toString(), pdwbufferlength.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun privacySetZonePreferenceW(dwzone: UInt, dwtype: UInt, dwtemplate: UInt, pszpreference: Pcwstr): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetPrivacySetZonePreferenceW(dwzone.toInt(), dwtype.toInt(), dwtemplate.toInt(), pszpreference.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readGuidsForConnectedNetworks(pcnetworks: MutPtr<UInt>, pppwsznetworkguids: MutPtr<MutPtr<Pwstr>>, pppbstrnetworknames: MutPtr<MutPtr<Bstr>>, pppwszgwmacs: MutPtr<MutPtr<Pwstr>>, pcgatewaymacs: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetReadGuidsForConnectedNetworks(pcnetworks.rawAddress.toString(), pppwsznetworkguids.rawAddress.toString(), pppbstrnetworknames.rawAddress.toString(), pppwszgwmacs.rawAddress.toString(), pcgatewaymacs.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readUrlCacheEntryStream(hurlcachestream: Handle, dwlocation: UInt, lpbuffer: MutPtr<CVoid>, lpdwlen: MutPtr<UInt>, reserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStream(hurlcachestream.rawAddress.toString(), dwlocation.toInt(), lpbuffer.rawAddress.toString(), lpdwlen.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun readUrlCacheEntryStreamEx(hurlcachestream: Handle, qwlocation: ULong, lpbuffer: MutPtr<CVoid>, lpdwlen: MutPtr<UInt>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetReadUrlCacheEntryStreamEx(hurlcachestream.rawAddress.toString(), qwlocation.toString(), lpbuffer.rawAddress.toString(), lpdwlen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun registerUrlCacheNotification(hwnd: Hwnd, umsg: UInt, gid: Long, dwopsfilter: UInt, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetRegisterUrlCacheNotification(hwnd.rawAddress.toString(), umsg.toInt(), gid.toString(), dwopsfilter.toInt(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resumeSuspendedDownload(hrequest: ConstPtr<CVoid>, dwresultcode: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetResumeSuspendedDownload(hrequest.rawAddress.toString(), dwresultcode.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryFileA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryFileW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryFileW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryStreamA(lpszurlname: Pcstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfoa>, lpcbcacheentryinfo: MutPtr<UInt>, frandomread: Bool, dwreserved: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), frandomread, dwreserved.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun retrieveUrlCacheEntryStreamW(lpszurlname: Pcwstr, lpcacheentryinfo: MutPtr<InternetCacheEntryInfow>, lpcbcacheentryinfo: MutPtr<UInt>, frandomread: Bool, dwreserved: UInt): Handle =
    if (windowsWin32NetworkingWininetNapiAvailable) MutPtr(wasmWindowssysWindowsWin32NetworkingWininetRetrieveUrlCacheEntryStreamW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), lpcbcacheentryinfo.rawAddress.toString(), frandomread, dwreserved.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun runOnceUrlCache(hwnd: Hwnd, hinst: Hinstance, lpszcmd: Pcstr, ncmdshow: Int): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetRunOnceUrlCache(hwnd.rawAddress.toString(), hinst.rawAddress.toString(), lpszcmd.rawAddress.toString(), ncmdshow).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheConfigInfoA(lpcacheconfiginfo: ConstPtr<InternetCacheConfigInfoa>, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoA(lpcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheConfigInfoW(lpcacheconfiginfo: ConstPtr<InternetCacheConfigInfow>, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheConfigInfoW(lpcacheconfiginfo.rawAddress.toString(), dwfieldcontrol.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroup(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr<UByte>, cbgroupattributes: UInt, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroup(lpszurlname.rawAddress.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.rawAddress.toString(), cbgroupattributes.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroupA(lpszurlname: Pcstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr<UByte>, cbgroupattributes: UInt, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupA(lpszurlname.rawAddress.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.rawAddress.toString(), cbgroupattributes.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryGroupW(lpszurlname: Pcwstr, dwflags: UInt, groupid: Long, pbgroupattributes: ConstPtr<UByte>, cbgroupattributes: UInt, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryGroupW(lpszurlname.rawAddress.toString(), dwflags.toInt(), groupid.toString(), pbgroupattributes.rawAddress.toString(), cbgroupattributes.toInt(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryInfoA(lpszurlname: Pcstr, lpcacheentryinfo: ConstPtr<InternetCacheEntryInfoa>, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoA(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), dwfieldcontrol.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheEntryInfoW(lpszurlname: Pcwstr, lpcacheentryinfo: ConstPtr<InternetCacheEntryInfow>, dwfieldcontrol: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheEntryInfoW(lpszurlname.rawAddress.toString(), lpcacheentryinfo.rawAddress.toString(), dwfieldcontrol.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheGroupAttributeA(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr<InternetCacheGroupInfoa>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeA(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheGroupAttributeW(gid: Long, dwflags: UInt, dwattributes: UInt, lpgroupinfo: ConstPtr<InternetCacheGroupInfow>, lpreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheGroupAttributeW(gid.toString(), dwflags.toInt(), dwattributes.toInt(), lpgroupinfo.rawAddress.toString(), lpreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setUrlCacheHeaderData(nidx: UInt, dwdata: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetSetUrlCacheHeaderData(nidx.toInt(), dwdata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showClientAuthCerts(hwndparent: Hwnd): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetShowClientAuthCerts(hwndparent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showSecurityInfo(hwndparent: Hwnd, psecurityinfo: ConstPtr<InternetSecurityInfo>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetShowSecurityInfo(hwndparent.rawAddress.toString(), psecurityinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun showX509EncodedCertificate(hwndparent: Hwnd, lpcert: ConstPtr<UByte>, cbcert: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetShowX509EncodedCertificate(hwndparent.rawAddress.toString(), lpcert.rawAddress.toString(), cbcert.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFile(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFile(lpszurlname.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFileA(lpszurlname: Pcstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileA(lpszurlname.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryFileW(lpszurlname: Pcwstr, dwreserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryFileW(lpszurlname.rawAddress.toString(), dwreserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unlockUrlCacheEntryStream(hurlcachestream: Handle, reserved: UInt): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUnlockUrlCacheEntryStream(hurlcachestream.rawAddress.toString(), reserved.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateUrlCacheContentPath(sznewpath: Pcstr): Bool =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUpdateUrlCacheContentPath(sznewpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCheckEntriesExist(rgpwszurls: ConstPtr<Pcwstr>, centries: UInt, rgfexist: MutPtr<Bool>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheCheckEntriesExist(rgpwszurls.rawAddress.toString(), centries.toInt(), rgfexist.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCloseEntryHandle(hentryfile: ConstPtr<CVoid>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetUrlCacheCloseEntryHandle(hentryfile.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun urlCacheContainerSetEntryMaximumAge(pwszprefix: Pcwstr, dwentrymaxage: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheContainerSetEntryMaximumAge(pwszprefix.rawAddress.toString(), dwentrymaxage.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheCreateContainer(pwszname: Pcwstr, pwszprefix: Pcwstr, pwszdirectory: Pcwstr, ulllimit: ULong, dwoptions: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheCreateContainer(pwszname.rawAddress.toString(), pwszprefix.rawAddress.toString(), pwszdirectory.rawAddress.toString(), ulllimit.toString(), dwoptions.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFindFirstEntry(pwszprefix: Pcwstr, dwflags: UInt, dwfilter: UInt, groupid: Long, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>, phfind: MutPtr<Handle>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFindFirstEntry(pwszprefix.rawAddress.toString(), dwflags.toInt(), dwfilter.toInt(), groupid.toString(), pcacheentryinfo.rawAddress.toString(), phfind.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFindNextEntry(hfind: Handle, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFindNextEntry(hfind.rawAddress.toString(), pcacheentryinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheFreeEntryInfo(pcacheentryinfo: MutPtr<UrlcacheEntryInfo>) {
    if (windowsWin32NetworkingWininetNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFreeEntryInfo(pcacheentryinfo.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun urlCacheFreeGlobalSpace(ulltargetsize: ULong, dwfilter: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheFreeGlobalSpace(ulltargetsize.toString(), dwfilter.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetContentPaths(pppwszdirectories: MutPtr<MutPtr<Pwstr>>, pcdirectories: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetContentPaths(pppwszdirectories.rawAddress.toString(), pcdirectories.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetEntryInfo(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetEntryInfo(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), pcacheentryinfo.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetGlobalCacheSize(dwfilter: UInt, pullsize: MutPtr<ULong>, pulllimit: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalCacheSize(dwfilter.toInt(), pullsize.rawAddress.toString(), pulllimit.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheGetGlobalLimit(limittype: UrlCacheLimitType, pulllimit: MutPtr<ULong>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheGetGlobalLimit(limittype, pulllimit.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheReadEntryStream(hurlcachestream: ConstPtr<CVoid>, ulllocation: ULong, pbuffer: MutPtr<CVoid>, dwbufferlen: UInt, pdwbufferlen: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheReadEntryStream(hurlcachestream.rawAddress.toString(), ulllocation.toString(), pbuffer.rawAddress.toString(), dwbufferlen.toInt(), pdwbufferlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheReloadSettings(): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheReloadSettings().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheRetrieveEntryFile(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>, phentryfile: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryFile(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), pcacheentryinfo.rawAddress.toString(), phentryfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheRetrieveEntryStream(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, frandomread: Bool, pcacheentryinfo: MutPtr<UrlcacheEntryInfo>, phentrystream: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheRetrieveEntryStream(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), frandomread, pcacheentryinfo.rawAddress.toString(), phentrystream.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheServer(): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheServer().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheSetGlobalLimit(limittype: UrlCacheLimitType, ulllimit: ULong): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheSetGlobalLimit(limittype, ulllimit.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun urlCacheUpdateEntryExtraData(happcache: ConstPtr<CVoid>, pcwszurl: Pcwstr, pbextradata: ConstPtr<UByte>, cbextradata: UInt): UInt =
    if (windowsWin32NetworkingWininetNapiAvailable) wasmWindowssysWindowsWin32NetworkingWininetUrlCacheUpdateEntryExtraData(happcache.rawAddress.toString(), pcwszurl.rawAddress.toString(), pbextradata.rawAddress.toString(), cbextradata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
