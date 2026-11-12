@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemDeploymentservicesNapiAddon(): Boolean

private val windowsWin32SystemDeploymentservicesNapiAvailable: Boolean = initWindowsWin32SystemDeploymentservicesNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(p0: String, p1: Int, p2: Int, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxePacketFree(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxePacketFree(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeSendReply(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeSendReply(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeTrace(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeTrace(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesPxeTraceV(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesPxeTraceV(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliClose(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliClose(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliLog(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliLog(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(p0: Int)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(p0: String, p1: Int, p2: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize()")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize(): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown()")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(p0)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(p0: String, p1: Int, p2: String, p3: String): Int

public actual fun pxeAsyncRecvDone(hclientrequest: Handle, action: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeAsyncRecvDone(hclientrequest.rawAddress.toString(), action.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpAppendOption(preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr, boption: UByte, boptionlen: UByte, pvalue: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOption(preplypacket.rawAddress.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress.toString(), boption.toInt(), boptionlen.toInt(), pvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpAppendOptionRaw(preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr, ubufferlen: UShort, pbuffer: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpAppendOptionRaw(preplypacket.rawAddress.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress.toString(), ubufferlen.toInt(), pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpGetOptionValue(ppacket: ConstPtr, upacketlen: UInt, uinstance: UInt, boption: UByte, pboptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), uinstance.toInt(), boption.toInt(), pboptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpGetVendorOptionValue(ppacket: ConstPtr, upacketlen: UInt, boption: UByte, uinstance: UInt, pboptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpGetVendorOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), boption.toInt(), uinstance.toInt(), pboptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpInitialize(precvpacket: ConstPtr, urecvpacketlen: UInt, preplypacket: MutPtr, umaxreplypacketlen: UInt, pureplypacketlen: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpInitialize(precvpacket.rawAddress.toString(), urecvpacketlen.toInt(), preplypacket.rawAddress.toString(), umaxreplypacketlen.toInt(), pureplypacketlen.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpIsValid(ppacket: ConstPtr, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpIsValid(ppacket.rawAddress.toString(), upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6AppendOption(preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr, woptiontype: UShort, cboption: UShort, poption: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOption(preply.rawAddress.toString(), cbreply.toInt(), pcbreplyused.rawAddress.toString(), woptiontype.toInt(), cboption.toInt(), poption.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6AppendOptionRaw(preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr, cbbuffer: UShort, pbuffer: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6AppendOptionRaw(preply.rawAddress.toString(), cbreply.toInt(), pcbreplyused.rawAddress.toString(), cbbuffer.toInt(), pbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6CreateRelayRepl(prelaymessages: ConstPtr, nrelaymessages: UInt, pinnerpacket: ConstPtr, cbinnerpacket: UInt, preplybuffer: MutPtr, cbreplybuffer: UInt, pcbreplybuffer: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6CreateRelayRepl(prelaymessages.rawAddress.toString(), nrelaymessages.toInt(), pinnerpacket.rawAddress.toString(), cbinnerpacket.toInt(), preplybuffer.rawAddress.toString(), cbreplybuffer.toInt(), pcbreplybuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6GetOptionValue(ppacket: ConstPtr, upacketlen: UInt, uinstance: UInt, woption: UShort, pwoptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), uinstance.toInt(), woption.toInt(), pwoptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6GetVendorOptionValue(ppacket: ConstPtr, upacketlen: UInt, dwenterprisenumber: UInt, woption: UShort, uinstance: UInt, pwoptionlen: MutPtr, ppoptionvalue: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6GetVendorOptionValue(ppacket.rawAddress.toString(), upacketlen.toInt(), dwenterprisenumber.toInt(), woption.toInt(), uinstance.toInt(), pwoptionlen.rawAddress.toString(), ppoptionvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6Initialize(prequest: ConstPtr, cbrequest: UInt, preply: MutPtr, cbreply: UInt, pcbreplyused: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6Initialize(prequest.rawAddress.toString(), cbrequest.toInt(), preply.rawAddress.toString(), cbreply.toInt(), pcbreplyused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6IsValid(ppacket: ConstPtr, upacketlen: UInt, brequestpacket: Bool, pbpxeoptionpresent: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6IsValid(ppacket.rawAddress.toString(), upacketlen.toInt(), brequestpacket, pbpxeoptionpresent.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeDhcpv6ParseRelayForw(prelayforwpacket: ConstPtr, urelayforwpacketlen: UInt, prelaymessages: MutPtr, nrelaymessages: UInt, pnrelaymessages: MutPtr, ppinnerpacket: MutPtr, pcbinnerpacket: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeDhcpv6ParseRelayForw(prelayforwpacket.rawAddress.toString(), urelayforwpacketlen.toInt(), prelaymessages.rawAddress.toString(), nrelaymessages.toInt(), pnrelaymessages.rawAddress.toString(), ppinnerpacket.rawAddress.toString(), pcbinnerpacket.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeGetServerInfo(uinfotype: UInt, pbuffer: MutPtr, ubufferlen: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfo(uinfotype.toInt(), pbuffer.rawAddress.toString(), ubufferlen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeGetServerInfoEx(uinfotype: UInt, pbuffer: MutPtr, ubufferlen: UInt, pubufferused: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeGetServerInfoEx(uinfotype.toInt(), pbuffer.rawAddress.toString(), ubufferlen.toInt(), pubufferused.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxePacketAllocate(hprovider: Handle, hclientrequest: Handle, usize: UInt): MutPtr =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDeploymentservicesPxePacketAllocate(hprovider.rawAddress.toString(), hclientrequest.rawAddress.toString(), usize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxePacketFree(hprovider: Handle, hclientrequest: Handle, ppacket: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxePacketFree(hprovider.rawAddress.toString(), hclientrequest.rawAddress.toString(), ppacket.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumClose(henum: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumClose(henum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumFirst(phenum: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumFirst(phenum.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderEnumNext(henum: Handle, ppprovider: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderEnumNext(henum.rawAddress.toString(), ppprovider.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderFreeInfo(pprovider: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderFreeInfo(pprovider.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderQueryIndex(pszprovidername: Pcwstr, puindex: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderQueryIndex(pszprovidername.rawAddress.toString(), puindex.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderRegister(pszprovidername: Pcwstr, pszmodulepath: Pcwstr, index: UInt, biscritical: Bool, phproviderkey: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderRegister(pszprovidername.rawAddress.toString(), pszmodulepath.rawAddress.toString(), index.toInt(), biscritical, phproviderkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderSetAttribute(hprovider: Handle, attribute: UInt, pparameterbuffer: ConstPtr, uparamlen: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderSetAttribute(hprovider.rawAddress.toString(), attribute.toInt(), pparameterbuffer.rawAddress.toString(), uparamlen.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeProviderUnRegister(pszprovidername: Pcwstr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeProviderUnRegister(pszprovidername.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeRegisterCallback(hprovider: Handle, callbacktype: UInt, pcallbackfunction: ConstPtr, pcontext: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeRegisterCallback(hprovider.rawAddress.toString(), callbacktype.toInt(), pcallbackfunction.rawAddress.toString(), pcontext.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeSendReply(hclientrequest: Handle, ppacket: ConstPtr, upacketlen: UInt, paddress: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeSendReply(hclientrequest.rawAddress.toString(), ppacket.rawAddress.toString(), upacketlen.toInt(), paddress.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeTrace(hprovider: Handle, severity: UInt, pszformat: Pcwstr, vararg variadicArgs: Long): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeTrace(hprovider.rawAddress.toString(), severity.toInt(), pszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pxeTraceV(hprovider: Handle, severity: UInt, pszformat: Pcwstr, params: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesPxeTraceV(hprovider.rawAddress.toString(), severity.toInt(), pszformat.rawAddress.toString(), params.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpAddOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpAddOption(hhandle.rawAddress.toString(), uoption.toInt(), uvaluelen.toInt(), pvalue.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpCloseHandle(hhandle: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpCloseHandle(hhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpGetOptionBuffer(hhandle: Handle, ubufferlen: UInt, pbuffer: MutPtr, pubytes: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpGetOptionBuffer(hhandle.rawAddress.toString(), ubufferlen.toInt(), pbuffer.rawAddress.toString(), pubytes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpInitialize(bpackettype: UByte, phhandle: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpInitialize(bpackettype.toInt(), phhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpParseInitialize(ppacket: ConstPtr, upacketlen: UInt, pbpackettype: MutPtr, phhandle: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitialize(ppacket.rawAddress.toString(), upacketlen.toInt(), pbpackettype.rawAddress.toString(), phhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpParseInitializev6(ppacket: ConstPtr, upacketlen: UInt, pbpackettype: MutPtr, phhandle: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpParseInitializev6(ppacket.rawAddress.toString(), upacketlen.toInt(), pbpackettype.rawAddress.toString(), phhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsBpQueryOption(hhandle: Handle, uoption: UInt, uvaluelen: UInt, pvalue: MutPtr, pubytes: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsBpQueryOption(hhandle.rawAddress.toString(), uoption.toInt(), uvaluelen.toInt(), pvalue.rawAddress.toString(), pubytes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliAuthorizeSession(hsession: Handle, pcred: ConstPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliAuthorizeSession(hsession.rawAddress.toString(), pcred.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliCancelTransfer(htransfer: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliCancelTransfer(htransfer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliClose(handle: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliClose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliCreateSession(pwszserver: Pcwstr, pcred: ConstPtr, phsession: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliCreateSession(pwszserver.rawAddress.toString(), pcred.rawAddress.toString(), phsession.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFindFirstImage(hsession: Handle, phfindhandle: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliFindFirstImage(hsession.rawAddress.toString(), phfindhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFindNextImage(handle: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliFindNextImage(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliFreeStringArray(ppwszarray: MutPtr, ulcount: UInt): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliFreeStringArray(ppwszarray.rawAddress.toString(), ulcount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetDriverQueryXml(pwszwindirpath: Pcwstr, ppwszdriverquery: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetDriverQueryXml(pwszwindirpath.rawAddress.toString(), ppwszdriverquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetEnumerationFlags(handle: Handle, pdwflags: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetEnumerationFlags(handle.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageArchitecture(hifh: Handle, pdwvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageArchitecture(hifh.rawAddress.toString(), pdwvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageDescription(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageDescription(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageFiles(hifh: Handle, pppwszfiles: MutPtr, pdwcount: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageFiles(hifh.rawAddress.toString(), pppwszfiles.rawAddress.toString(), pdwcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageGroup(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageGroup(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHalName(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHalName(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHandleFromFindHandle(findhandle: Handle, phimagehandle: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromFindHandle(findhandle.rawAddress.toString(), phimagehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageHandleFromTransferHandle(htransfer: Handle, phimagehandle: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageHandleFromTransferHandle(htransfer.rawAddress.toString(), phimagehandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageIndex(hifh: Handle, pdwvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageIndex(hifh.rawAddress.toString(), pdwvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLanguage(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguage(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLanguages(hifh: Handle, pppszvalues: MutPtr, pdwnumvalues: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLanguages(hifh.rawAddress.toString(), pppszvalues.rawAddress.toString(), pdwnumvalues.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageLastModifiedTime(hifh: Handle, ppsystimevalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageLastModifiedTime(hifh.rawAddress.toString(), ppsystimevalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageName(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageName(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageNamespace(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageNamespace(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageParameter(hifh: Handle, paramtype: WdsCliImageParamType, presponse: MutPtr, uresponselen: UInt): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageParameter(hifh.rawAddress.toString(), paramtype, presponse.rawAddress.toString(), uresponselen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImagePath(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImagePath(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageSize(hifh: Handle, pullvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageSize(hifh.rawAddress.toString(), pullvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageType(hifh: Handle, pimagetype: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageType(hifh.rawAddress.toString(), pimagetype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetImageVersion(hifh: Handle, ppwszvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetImageVersion(hifh.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliGetTransferSize(hifh: Handle, pullvalue: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliGetTransferSize(hifh.rawAddress.toString(), pullvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliInitializeLog(hsession: Handle, ulclientarchitecture: CpuArchitecture, pwszclientid: Pcwstr, pwszclientaddress: Pcwstr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliInitializeLog(hsession.rawAddress.toString(), ulclientarchitecture.toInt(), pwszclientid.rawAddress.toString(), pwszclientaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliLog(hsession: Handle, ulloglevel: UInt, ulmessagecode: UInt, vararg variadicArgs: Long): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliLog(hsession.rawAddress.toString(), ulloglevel.toInt(), ulmessagecode.toInt(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliObtainDriverPackages(himage: Handle, ppwszservername: MutPtr, pppwszdriverpackages: MutPtr, pulcount: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackages(himage.rawAddress.toString(), ppwszservername.rawAddress.toString(), pppwszdriverpackages.rawAddress.toString(), pulcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliObtainDriverPackagesEx(hsession: Handle, pwszmachineinfo: Pcwstr, ppwszservername: MutPtr, pppwszdriverpackages: MutPtr, pulcount: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliObtainDriverPackagesEx(hsession.rawAddress.toString(), pwszmachineinfo.rawAddress.toString(), ppwszservername.rawAddress.toString(), pppwszdriverpackages.rawAddress.toString(), pulcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliRegisterTrace(pfn: PfnWdsCliTraceFunction): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliRegisterTrace(0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliSetTransferBufferSize(ulsizeinbytes: UInt) {
    if (windowsWin32SystemDeploymentservicesNapiAvailable) {
        wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliSetTransferBufferSize(ulsizeinbytes.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wdsCliTransferFile(pwszserver: Pcwstr, pwsznamespace: Pcwstr, pwszremotefilepath: Pcwstr, pwszlocalfilepath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr, phtransfer: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliTransferFile(pwszserver.rawAddress.toString(), pwsznamespace.rawAddress.toString(), pwszremotefilepath.rawAddress.toString(), pwszlocalfilepath.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt(), 0L.toString(), pvuserdata.rawAddress.toString(), phtransfer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliTransferImage(himage: Handle, pwszlocalpath: Pcwstr, dwflags: UInt, dwreserved: UInt, pfnwdsclicallback: PfnWdsCliCallback, pvuserdata: ConstPtr, phtransfer: MutPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliTransferImage(himage.rawAddress.toString(), pwszlocalpath.rawAddress.toString(), dwflags.toInt(), dwreserved.toInt(), 0L.toString(), pvuserdata.rawAddress.toString(), phtransfer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsCliWaitForTransfer(htransfer: Handle): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsCliWaitForTransfer(htransfer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientAddRefBuffer(pvbuffer: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientAddRefBuffer(pvbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCancelSession(hsessionkey: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSession(hsessionkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCancelSessionEx(hsessionkey: Handle, dwerrorcode: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCancelSessionEx(hsessionkey.rawAddress.toString(), dwerrorcode.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCloseSession(hsessionkey: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCloseSession(hsessionkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientCompleteReceive(hsessionkey: Handle, ulsize: UInt, pulloffset: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientCompleteReceive(hsessionkey.rawAddress.toString(), ulsize.toInt(), pulloffset.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientInitialize(): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitialize().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientInitializeSession(psessionrequest: ConstPtr, pcallerdata: ConstPtr, hsessionkey: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientInitializeSession(psessionrequest.rawAddress.toString(), pcallerdata.rawAddress.toString(), hsessionkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientQueryStatus(hsessionkey: Handle, pustatus: MutPtr, puerrorcode: MutPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientQueryStatus(hsessionkey.rawAddress.toString(), pustatus.rawAddress.toString(), puerrorcode.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientRegisterCallback(hsessionkey: Handle, callbackid: TransportclientCallbackId, pfncallback: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientRegisterCallback(hsessionkey.rawAddress.toString(), callbackid, pfncallback.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientReleaseBuffer(pvbuffer: ConstPtr): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientReleaseBuffer(pvbuffer.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientShutdown(): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientShutdown().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientStartSession(hsessionkey: Handle): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientStartSession(hsessionkey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportClientWaitForCompletion(hsessionkey: Handle, utimeout: UInt): UInt =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportClientWaitForCompletion(hsessionkey.rawAddress.toString(), utimeout.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerAllocateBuffer(hprovider: Handle, ulbuffersize: UInt): MutPtr =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerAllocateBuffer(hprovider.rawAddress.toString(), ulbuffersize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerCompleteRead(hprovider: Handle, ulbytesread: UInt, pvuserdata: ConstPtr, hreadresult: Hresult): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerCompleteRead(hprovider.rawAddress.toString(), ulbytesread.toInt(), pvuserdata.rawAddress.toString(), hreadresult) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerFreeBuffer(hprovider: Handle, pvbuffer: ConstPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerFreeBuffer(hprovider.rawAddress.toString(), pvbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerRegisterCallback(hprovider: Handle, callbackid: TransportproviderCallbackId, pfncallback: ConstPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerRegisterCallback(hprovider.rawAddress.toString(), callbackid, pfncallback.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerTrace(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, vararg variadicArgs: Long): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTrace(hprovider.rawAddress.toString(), severity.toInt(), pwszformat.rawAddress.toString(), variadicArgs.size.coerceAtMost(4), (if (variadicArgs.size > 0) variadicArgs[0] else 0L).toString(), (if (variadicArgs.size > 1) variadicArgs[1] else 0L).toString(), (if (variadicArgs.size > 2) variadicArgs[2] else 0L).toString(), (if (variadicArgs.size > 3) variadicArgs[3] else 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wdsTransportServerTraceV(hprovider: Handle, severity: UInt, pwszformat: Pcwstr, params: ConstPtr): Hresult =
    if (windowsWin32SystemDeploymentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemDeploymentservicesWdsTransportServerTraceV(hprovider.rawAddress.toString(), severity.toInt(), pwszformat.rawAddress.toString(), params.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
