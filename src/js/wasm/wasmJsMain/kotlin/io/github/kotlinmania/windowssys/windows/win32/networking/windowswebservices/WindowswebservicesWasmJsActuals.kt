@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networking.windowswebservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkingWindowswebservicesNapiAddon(): Boolean

private val windowsWin32NetworkingWindowswebservicesNapiAvailable: Boolean = initWindowsWin32NetworkingWindowswebservicesNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential(p0: Int, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber()")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAlloc(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAlloc(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCall(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCall(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCopyError(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCopyError(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateError(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateError(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: String, p9: Int, p10: String, p11: Int, p12: String, p13: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFillBody(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFillBody(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFillReader(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFillReader(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeError(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeError(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter(p0: String)

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadArray(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadArray(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadBody(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadBody(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadChars(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadChars(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadElement(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadElement(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadType(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadType(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadValue(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: String, p8: Int, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: String, p10: String, p11: Int, p12: String, p13: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetError(p0)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetError(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetListener(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetListener(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail(p0: String, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetInput(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetInput(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: Int, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteText(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteText(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteType(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteType(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals(p0: String, p1: String, p2: String): Int

public actual fun webAuthNAuthenticatorGetAssertion(hwnd: Hwnd, pwszrpid: Pcwstr, pwebauthnclientdata: ConstPtr, pwebauthngetassertionoptions: ConstPtr, ppwebauthnassertion: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorGetAssertion(hwnd.rawAddress.toString(), pwszrpid.rawAddress.toString(), pwebauthnclientdata.rawAddress.toString(), pwebauthngetassertionoptions.rawAddress.toString(), ppwebauthnassertion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNAuthenticatorMakeCredential(hwnd: Hwnd, prpinformation: ConstPtr, puserinformation: ConstPtr, ppubkeycredparams: ConstPtr, pwebauthnclientdata: ConstPtr, pwebauthnmakecredentialoptions: ConstPtr, ppwebauthncredentialattestation: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNAuthenticatorMakeCredential(hwnd.rawAddress.toString(), prpinformation.rawAddress.toString(), puserinformation.rawAddress.toString(), ppubkeycredparams.rawAddress.toString(), pwebauthnclientdata.rawAddress.toString(), pwebauthnmakecredentialoptions.rawAddress.toString(), ppwebauthncredentialattestation.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNCancelCurrentOperation(pcancellationid: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNCancelCurrentOperation(pcancellationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNDeletePlatformCredential(cbcredentialid: UInt, pbcredentialid: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNDeletePlatformCredential(cbcredentialid.toInt(), pbcredentialid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNFreeAssertion(pwebauthnassertion: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeAssertion(pwebauthnassertion.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNFreeCredentialAttestation(pwebauthncredentialattestation: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreeCredentialAttestation(pwebauthncredentialattestation.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNFreePlatformCredentialList(pcredentialdetailslist: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNFreePlatformCredentialList(pcredentialdetailslist.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun webAuthNGetApiVersionNumber(): UInt =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetApiVersionNumber().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetCancellationId(pcancellationid: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetCancellationId(pcancellationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetErrorName(hr: Hresult): Pcwstr =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetErrorName(hr).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetPlatformCredentialList(pgetcredentialsoptions: ConstPtr, ppcredentialdetailslist: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetPlatformCredentialList(pgetcredentialsoptions.rawAddress.toString(), ppcredentialdetailslist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNGetW3CExceptionDOMError(hr: Hresult): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNGetW3CExceptionDOMError(hr) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun webAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWebAuthNIsUserVerifyingPlatformAuthenticatorAvailable(pbisuserverifyingplatformauthenticatoravailable.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbandonCall(serviceproxy: ConstPtr, callid: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbandonCall(serviceproxy.rawAddress.toString(), callid.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbandonMessage(channel: ConstPtr, message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbandonMessage(channel.rawAddress.toString(), message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortChannel(channel: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortChannel(channel.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortListener(listener: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortListener(listener.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceHost(servicehost.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAbortServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAbortServiceProxy(serviceproxy.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAcceptChannel(listener: ConstPtr, channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAcceptChannel(listener.rawAddress.toString(), channel.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddCustomHeader(message: ConstPtr, headerdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, headerattributes: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddCustomHeader(message.rawAddress.toString(), headerdescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), headerattributes.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddErrorString(error: ConstPtr, string: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddErrorString(error.rawAddress.toString(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddMappedHeader(message: ConstPtr, headername: ConstPtr, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddMappedHeader(message.rawAddress.toString(), headername.rawAddress.toString(), valuetype, writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAddressMessage(message: ConstPtr, address: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAddressMessage(message.rawAddress.toString(), address.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAlloc(heap: ConstPtr, size: ULong, ptr: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAlloc(heap.rawAddress.toString(), size.toString(), ptr.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsAsyncExecute(asyncstate: ConstPtr, operation: WsAsyncFunction, callbackmodel: WsCallbackModel, callbackstate: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsAsyncExecute(asyncstate.rawAddress.toString(), 0L.toString(), callbackmodel, callbackstate.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCall(serviceproxy: ConstPtr, operation: ConstPtr, arguments: ConstPtr, heap: ConstPtr, callproperties: ConstPtr, callpropertycount: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCall(serviceproxy.rawAddress.toString(), operation.rawAddress.toString(), arguments.rawAddress.toString(), heap.rawAddress.toString(), callproperties.rawAddress.toString(), callpropertycount.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCheckMustUnderstandHeaders(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCheckMustUnderstandHeaders(message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseChannel(channel.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseListener(listener: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseListener(listener.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceHost(servicehost.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCloseServiceProxy(serviceproxy: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCloseServiceProxy(serviceproxy.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCombineUrl(baseurl: ConstPtr, referenceurl: ConstPtr, flags: UInt, heap: ConstPtr, resulturl: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCombineUrl(baseurl.rawAddress.toString(), referenceurl.rawAddress.toString(), flags.toInt(), heap.rawAddress.toString(), resulturl.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCopyError(source: ConstPtr, destination: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCopyError(source.rawAddress.toString(), destination.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCopyNode(writer: ConstPtr, reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCopyNode(writer.rawAddress.toString(), reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateChannel(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, channel: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannel(channeltype, channelbinding, properties.rawAddress.toString(), propertycount.toInt(), securitydescription.rawAddress.toString(), channel.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateChannelForListener(listener: ConstPtr, properties: ConstPtr, propertycount: UInt, channel: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateChannelForListener(listener.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), channel.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateError(properties: ConstPtr, propertycount: UInt, error: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateError(properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateFaultFromError(error: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, heap: ConstPtr, fault: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateFaultFromError(error.rawAddress.toString(), faulterrorcode, faultdisclosure, heap.rawAddress.toString(), fault.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateHeap(maxsize: ULong, trimsize: ULong, properties: ConstPtr, propertycount: UInt, heap: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateHeap(maxsize.toString(), trimsize.toString(), properties.rawAddress.toString(), propertycount.toInt(), heap.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateListener(channeltype: WsChannelType, channelbinding: WsChannelBinding, properties: ConstPtr, propertycount: UInt, securitydescription: ConstPtr, listener: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateListener(channeltype, channelbinding, properties.rawAddress.toString(), propertycount.toInt(), securitydescription.rawAddress.toString(), listener.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMessage(envelopeversion: WsEnvelopeVersion, addressingversion: WsAddressingVersion, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessage(envelopeversion, addressingversion, properties.rawAddress.toString(), propertycount.toInt(), message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMessageForChannel(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, message: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateMessageForChannel(channel.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateMetadata(properties: ConstPtr, propertycount: UInt, metadata: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateMetadata(properties.rawAddress.toString(), propertycount.toInt(), metadata.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateReader(properties: ConstPtr, propertycount: UInt, reader: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateReader(properties.rawAddress.toString(), propertycount.toInt(), reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceEndpointFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, addressurl: ConstPtr, contract: ConstPtr, authorizationcallback: WsServiceSecurityCallback, heap: ConstPtr, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceendpoint: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceEndpointFromTemplate(channeltype, properties.rawAddress.toString(), propertycount.toInt(), addressurl.rawAddress.toString(), contract.rawAddress.toString(), 0L.toString(), heap.rawAddress.toString(), templatetype, templatevalue.rawAddress.toString(), templatesize.toInt(), templatedescription.rawAddress.toString(), templatedescriptionsize.toInt(), serviceendpoint.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceHost(endpoints: ConstPtr, endpointcount: UShort, serviceproperties: ConstPtr, servicepropertycount: UInt, servicehost: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceHost(endpoints.rawAddress.toString(), endpointcount.toInt(), serviceproperties.rawAddress.toString(), servicepropertycount.toInt(), servicehost.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceProxy(channeltype: WsChannelType, channelbinding: WsChannelBinding, securitydescription: ConstPtr, properties: ConstPtr, propertycount: UInt, channelproperties: ConstPtr, channelpropertycount: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxy(channeltype, channelbinding, securitydescription.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), channelproperties.rawAddress.toString(), channelpropertycount.toInt(), serviceproxy.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateServiceProxyFromTemplate(channeltype: WsChannelType, properties: ConstPtr, propertycount: UInt, templatetype: WsBindingTemplateType, templatevalue: ConstPtr, templatesize: UInt, templatedescription: ConstPtr, templatedescriptionsize: UInt, serviceproxy: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateServiceProxyFromTemplate(channeltype, properties.rawAddress.toString(), propertycount.toInt(), templatetype, templatevalue.rawAddress.toString(), templatesize.toInt(), templatedescription.rawAddress.toString(), templatedescriptionsize.toInt(), serviceproxy.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateWriter(properties: ConstPtr, propertycount: UInt, writer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateWriter(properties.rawAddress.toString(), propertycount.toInt(), writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateXmlBuffer(heap: ConstPtr, properties: ConstPtr, propertycount: UInt, buffer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlBuffer(heap.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), buffer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsCreateXmlSecurityToken(tokenxml: ConstPtr, tokenkey: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsCreateXmlSecurityToken(tokenxml.rawAddress.toString(), tokenkey.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), token.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsDateTimeToFileTime(datetime: ConstPtr, filetime: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsDateTimeToFileTime(datetime.rawAddress.toString(), filetime.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsDecodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsDecodeUrl(url.rawAddress.toString(), flags.toInt(), heap.rawAddress.toString(), outurl.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEncodeUrl(url: ConstPtr, flags: UInt, heap: ConstPtr, outurl: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsEncodeUrl(url.rawAddress.toString(), flags.toInt(), heap.rawAddress.toString(), outurl.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEndReaderCanonicalization(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsEndReaderCanonicalization(reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsEndWriterCanonicalization(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsEndWriterCanonicalization(writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFileTimeToDateTime(filetime: ConstPtr, datetime: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFileTimeToDateTime(filetime.rawAddress.toString(), datetime.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFillBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFillBody(message.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFillReader(reader: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFillReader(reader.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFindAttribute(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, required: Bool, attributeindex: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFindAttribute(reader.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), required, attributeindex.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFlushBody(message: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFlushBody(message.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFlushWriter(writer: ConstPtr, minsize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFlushWriter(writer.rawAddress.toString(), minsize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsFreeChannel(channel: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeChannel(channel.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeError(error: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeError(error.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeHeap(heap: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeHeap(heap.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeListener(listener: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeListener(listener.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeMessage(message: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeMessage(message.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeMetadata(metadata: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeMetadata(metadata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeReader(reader: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeReader(reader.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeSecurityToken(token: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeSecurityToken(token.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeServiceHost(servicehost: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceHost(servicehost.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeServiceProxy(serviceproxy: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeServiceProxy(serviceproxy.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsFreeWriter(writer: ConstPtr) {
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsFreeWriter(writer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun wsGetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetChannelProperty(channel.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetCustomHeader(message: ConstPtr, customheaderdescription: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, headerattributes: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetCustomHeader(message.rawAddress.toString(), customheaderdescription.rawAddress.toString(), repeatingoption, headerindex.toInt(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), headerattributes.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetDictionary(encoding: WsEncoding, dictionary: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetDictionary(encoding, dictionary.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorProperty(error.rawAddress.toString(), id, buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetErrorString(error: ConstPtr, index: UInt, string: MutPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetErrorString(error.rawAddress.toString(), index.toInt(), string.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorDetail(error.rawAddress.toString(), faultdetaildescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, buffer: MutPtr, buffersize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetFaultErrorProperty(error.rawAddress.toString(), id, buffer.rawAddress.toString(), buffersize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetHeader(message.rawAddress.toString(), headertype, valuetype, readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeaderAttributes(message: ConstPtr, reader: ConstPtr, headerattributes: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetHeaderAttributes(message.rawAddress.toString(), reader.rawAddress.toString(), headerattributes.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetHeapProperty(heap: ConstPtr, id: WsHeapPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetHeapProperty(heap.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetListenerProperty(listener.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMappedHeader(message: ConstPtr, headername: ConstPtr, repeatingoption: WsRepeatingHeaderOption, headerindex: UInt, valuetype: WsType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMappedHeader(message.rawAddress.toString(), headername.rawAddress.toString(), repeatingoption, headerindex.toInt(), valuetype, readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMessageProperty(message.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMetadataEndpoints(metadata: ConstPtr, endpoints: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataEndpoints(metadata.rawAddress.toString(), endpoints.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMetadataProperty(metadata: ConstPtr, id: WsMetadataPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMetadataProperty(metadata.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetMissingMetadataDocumentAddress(metadata: ConstPtr, address: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetMissingMetadataDocumentAddress(metadata.rawAddress.toString(), address.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetNamespaceFromPrefix(reader: ConstPtr, prefix: ConstPtr, required: Bool, ns: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetNamespaceFromPrefix(reader.rawAddress.toString(), prefix.rawAddress.toString(), required, ns.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetOperationContextProperty(context: ConstPtr, id: WsOperationContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetOperationContextProperty(context.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPolicyAlternativeCount(policy: ConstPtr, count: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyAlternativeCount(policy.rawAddress.toString(), count.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPolicyProperty(policy: ConstPtr, id: WsPolicyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetPolicyProperty(policy.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetPrefixFromNamespace(writer: ConstPtr, ns: ConstPtr, required: Bool, prefix: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetPrefixFromNamespace(writer.rawAddress.toString(), ns.rawAddress.toString(), required, prefix.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderNode(xmlreader: ConstPtr, node: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderNode(xmlreader.rawAddress.toString(), node.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderPosition(reader: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderPosition(reader.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetReaderProperty(reader: ConstPtr, id: WsXmlReaderPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetReaderProperty(reader.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetSecurityContextProperty(securitycontext: ConstPtr, id: WsSecurityContextPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityContextProperty(securitycontext.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetSecurityTokenProperty(securitytoken: ConstPtr, id: WsSecurityTokenPropertyId, value: MutPtr, valuesize: UInt, heap: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetSecurityTokenProperty(securitytoken.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), heap.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetServiceHostProperty(servicehost: ConstPtr, id: WsServicePropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceHostProperty(servicehost.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetServiceProxyProperty(serviceproxy: ConstPtr, id: WsProxyPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetServiceProxyProperty(serviceproxy.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetWriterPosition(writer: ConstPtr, nodeposition: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterPosition(writer.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetWriterProperty(writer: ConstPtr, id: WsXmlWriterPropertyId, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetWriterProperty(writer.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsGetXmlAttribute(reader: ConstPtr, localname: ConstPtr, heap: ConstPtr, valuechars: MutPtr, valuecharcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsGetXmlAttribute(reader.rawAddress.toString(), localname.rawAddress.toString(), heap.rawAddress.toString(), valuechars.rawAddress.toString(), valuecharcount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsInitializeMessage(message: ConstPtr, initialization: WsMessageInitialization, sourcemessage: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsInitializeMessage(message.rawAddress.toString(), initialization, sourcemessage.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMarkHeaderAsUnderstood(message: ConstPtr, headerposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMarkHeaderAsUnderstood(message.rawAddress.toString(), headerposition.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMatchPolicyAlternative(policy: ConstPtr, alternativeindex: UInt, policyconstraints: ConstPtr, matchrequired: Bool, heap: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMatchPolicyAlternative(policy.rawAddress.toString(), alternativeindex.toInt(), policyconstraints.rawAddress.toString(), matchrequired, heap.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMoveReader(reader: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMoveReader(reader.rawAddress.toString(), moveto, found.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsMoveWriter(writer: ConstPtr, moveto: WsMoveTo, found: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsMoveWriter(writer.rawAddress.toString(), moveto, found.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenChannel(channel: ConstPtr, endpointaddress: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenChannel(channel.rawAddress.toString(), endpointaddress.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenListener(listener: ConstPtr, url: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenListener(listener.rawAddress.toString(), url.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenServiceHost(servicehost: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceHost(servicehost.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsOpenServiceProxy(serviceproxy: ConstPtr, address: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsOpenServiceProxy(serviceproxy.rawAddress.toString(), address.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsPullBytes(writer: ConstPtr, callback: WsPullBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsPullBytes(writer.rawAddress.toString(), 0L.toString(), callbackstate.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsPushBytes(writer: ConstPtr, callback: WsPushBytesCallback, callbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsPushBytes(writer.rawAddress.toString(), 0L.toString(), callbackstate.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadArray(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: MutPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, actualitemcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadArray(reader.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), valuetype, array.rawAddress.toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), actualitemcount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadAttribute(reader: ConstPtr, attributedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadAttribute(reader.rawAddress.toString(), attributedescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadBody(message: ConstPtr, bodydescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadBody(message.rawAddress.toString(), bodydescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadBytes(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadBytes(reader.rawAddress.toString(), bytes.rawAddress.toString(), maxbytecount.toInt(), actualbytecount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadChars(reader: ConstPtr, chars: Pwstr, maxcharcount: UInt, actualcharcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadChars(reader.rawAddress.toString(), chars.rawAddress.toString(), maxcharcount.toInt(), actualcharcount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadCharsUtf8(reader: ConstPtr, bytes: MutPtr, maxbytecount: UInt, actualbytecount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadCharsUtf8(reader.rawAddress.toString(), bytes.rawAddress.toString(), maxbytecount.toInt(), actualbytecount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadElement(reader: ConstPtr, elementdescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadElement(reader.rawAddress.toString(), elementdescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndAttribute(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEndAttribute(reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndElement(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEndElement(reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEndpointAddressExtension(reader: ConstPtr, endpointaddress: ConstPtr, extensiontype: WsEndpointAddressExtensionType, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEndpointAddressExtension(reader.rawAddress.toString(), endpointaddress.rawAddress.toString(), extensiontype, readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeEnd(message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadEnvelopeStart(message: ConstPtr, reader: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadEnvelopeStart(message.rawAddress.toString(), reader.rawAddress.toString(), 0L.toString(), donecallbackstate.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageEnd(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadMessageStart(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadMetadata(metadata: ConstPtr, reader: ConstPtr, url: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadMetadata(metadata.rawAddress.toString(), reader.rawAddress.toString(), url.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadNode(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadNode(reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadQualifiedName(reader: ConstPtr, heap: ConstPtr, prefix: MutPtr, localname: MutPtr, ns: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadQualifiedName(reader.rawAddress.toString(), heap.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadStartAttribute(reader: ConstPtr, attributeindex: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadStartAttribute(reader.rawAddress.toString(), attributeindex.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadStartElement(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadStartElement(reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadToStartElement(reader: ConstPtr, localname: ConstPtr, ns: ConstPtr, found: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadToStartElement(reader.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), found.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadType(reader: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadType(reader.rawAddress.toString(), typemapping, type, typedescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadValue(reader: ConstPtr, valuetype: WsValueType, value: MutPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadValue(reader.rawAddress.toString(), valuetype, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadXmlBuffer(reader: ConstPtr, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBuffer(reader.rawAddress.toString(), heap.rawAddress.toString(), xmlbuffer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReadXmlBufferFromBytes(reader: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, bytes: ConstPtr, bytecount: UInt, heap: ConstPtr, xmlbuffer: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReadXmlBufferFromBytes(reader.rawAddress.toString(), encoding.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), bytes.rawAddress.toString(), bytecount.toInt(), heap.rawAddress.toString(), xmlbuffer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsReceiveMessage(channel: ConstPtr, message: ConstPtr, messagedescriptions: ConstPtr, messagedescriptioncount: UInt, receiveoption: WsReceiveOption, readbodyoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, index: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsReceiveMessage(channel.rawAddress.toString(), message.rawAddress.toString(), messagedescriptions.rawAddress.toString(), messagedescriptioncount.toInt(), receiveoption, readbodyoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), index.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRegisterOperationForCancel(context: ConstPtr, cancelcallback: WsOperationCancelCallback, freestatecallback: WsOperationFreeStateCallback, userstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRegisterOperationForCancel(context.rawAddress.toString(), 0L.toString(), 0L.toString(), userstate.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveCustomHeader(message: ConstPtr, headername: ConstPtr, headerns: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveCustomHeader(message.rawAddress.toString(), headername.rawAddress.toString(), headerns.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveHeader(message: ConstPtr, headertype: WsHeaderType, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveHeader(message.rawAddress.toString(), headertype, error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveMappedHeader(message: ConstPtr, headername: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveMappedHeader(message.rawAddress.toString(), headername.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRemoveNode(nodeposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRemoveNode(nodeposition.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRequestReply(channel: ConstPtr, requestmessage: ConstPtr, requestmessagedescription: ConstPtr, writeoption: WsWriteOption, requestbodyvalue: ConstPtr, requestbodyvaluesize: UInt, replymessage: ConstPtr, replymessagedescription: ConstPtr, readoption: WsReadOption, heap: ConstPtr, value: MutPtr, valuesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRequestReply(channel.rawAddress.toString(), requestmessage.rawAddress.toString(), requestmessagedescription.rawAddress.toString(), writeoption, requestbodyvalue.rawAddress.toString(), requestbodyvaluesize.toInt(), replymessage.rawAddress.toString(), replymessagedescription.rawAddress.toString(), readoption, heap.rawAddress.toString(), value.rawAddress.toString(), valuesize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRequestSecurityToken(channel: ConstPtr, properties: ConstPtr, propertycount: UInt, token: MutPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRequestSecurityToken(channel.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), token.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetChannel(channel: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetChannel(channel.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetError(error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetError(error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetHeap(heap: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetHeap(heap.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetListener(listener: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetListener(listener.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetMessage(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetMessage(message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetMetadata(metadata: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetMetadata(metadata.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetServiceHost(servicehost: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceHost(servicehost.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsResetServiceProxy(serviceproxy: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsResetServiceProxy(serviceproxy.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsRevokeSecurityContext(securitycontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsRevokeSecurityContext(securitycontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendFaultMessageForError(channel: ConstPtr, replymessage: ConstPtr, faulterror: ConstPtr, faulterrorcode: Hresult, faultdisclosure: WsFaultDisclosure, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSendFaultMessageForError(channel.rawAddress.toString(), replymessage.rawAddress.toString(), faulterror.rawAddress.toString(), faulterrorcode, faultdisclosure, requestmessage.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendMessage(channel: ConstPtr, message: ConstPtr, messagedescription: ConstPtr, writeoption: WsWriteOption, bodyvalue: ConstPtr, bodyvaluesize: UInt, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSendMessage(channel.rawAddress.toString(), message.rawAddress.toString(), messagedescription.rawAddress.toString(), writeoption, bodyvalue.rawAddress.toString(), bodyvaluesize.toInt(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSendReplyMessage(channel: ConstPtr, replymessage: ConstPtr, replymessagedescription: ConstPtr, writeoption: WsWriteOption, replybodyvalue: ConstPtr, replybodyvaluesize: UInt, requestmessage: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSendReplyMessage(channel.rawAddress.toString(), replymessage.rawAddress.toString(), replymessagedescription.rawAddress.toString(), writeoption, replybodyvalue.rawAddress.toString(), replybodyvaluesize.toInt(), requestmessage.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetChannelProperty(channel: ConstPtr, id: WsChannelPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetChannelProperty(channel.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetErrorProperty(error: ConstPtr, id: WsErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetErrorProperty(error.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetFaultErrorDetail(error: ConstPtr, faultdetaildescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorDetail(error.rawAddress.toString(), faultdetaildescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetFaultErrorProperty(error: ConstPtr, id: WsFaultErrorPropertyId, value: ConstPtr, valuesize: UInt): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetFaultErrorProperty(error.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetHeader(message: ConstPtr, headertype: WsHeaderType, valuetype: WsType, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetHeader(message.rawAddress.toString(), headertype, valuetype, writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetInput(reader: ConstPtr, encoding: ConstPtr, input: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetInput(reader.rawAddress.toString(), encoding.rawAddress.toString(), input.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetInputToBuffer(reader: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetInputToBuffer(reader.rawAddress.toString(), buffer.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetListenerProperty(listener: ConstPtr, id: WsListenerPropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetListenerProperty(listener.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetMessageProperty(message: ConstPtr, id: WsMessagePropertyId, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetMessageProperty(message.rawAddress.toString(), id, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetOutput(writer: ConstPtr, encoding: ConstPtr, output: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetOutput(writer.rawAddress.toString(), encoding.rawAddress.toString(), output.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetOutputToBuffer(writer: ConstPtr, buffer: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetOutputToBuffer(writer.rawAddress.toString(), buffer.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetReaderPosition(reader: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetReaderPosition(reader.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSetWriterPosition(writer: ConstPtr, nodeposition: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSetWriterPosition(writer.rawAddress.toString(), nodeposition.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsShutdownSessionChannel(channel: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsShutdownSessionChannel(channel.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsSkipNode(reader: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsSkipNode(reader.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsStartReaderCanonicalization(reader: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsStartReaderCanonicalization(reader.rawAddress.toString(), 0L.toString(), writecallbackstate.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsStartWriterCanonicalization(writer: ConstPtr, writecallback: WsWriteCallback, writecallbackstate: ConstPtr, properties: ConstPtr, propertycount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsStartWriterCanonicalization(writer.rawAddress.toString(), 0L.toString(), writecallbackstate.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsTrimXmlWhitespace(chars: Pcwstr, charcount: UInt, trimmedchars: MutPtr, trimmedcount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsTrimXmlWhitespace(chars.rawAddress.toString(), charcount.toInt(), trimmedchars.rawAddress.toString(), trimmedcount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsVerifyXmlNCName(ncnamechars: Pcwstr, ncnamecharcount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsVerifyXmlNCName(ncnamechars.rawAddress.toString(), ncnamecharcount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteArray(writer: ConstPtr, localname: ConstPtr, ns: ConstPtr, valuetype: WsValueType, array: ConstPtr, arraysize: UInt, itemoffset: UInt, itemcount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteArray(writer.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), valuetype, array.rawAddress.toString(), arraysize.toInt(), itemoffset.toInt(), itemcount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteAttribute(writer: ConstPtr, attributedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteAttribute(writer.rawAddress.toString(), attributedescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteBody(message: ConstPtr, bodydescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteBody(message.rawAddress.toString(), bodydescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteBytes(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteBytes(writer.rawAddress.toString(), bytes.rawAddress.toString(), bytecount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteChars(writer: ConstPtr, chars: Pcwstr, charcount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteChars(writer.rawAddress.toString(), chars.rawAddress.toString(), charcount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteCharsUtf8(writer: ConstPtr, bytes: ConstPtr, bytecount: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteCharsUtf8(writer.rawAddress.toString(), bytes.rawAddress.toString(), bytecount.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteElement(writer: ConstPtr, elementdescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteElement(writer.rawAddress.toString(), elementdescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndAttribute(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndAttribute(writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndCData(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndCData(writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndElement(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndElement(writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEndStartElement(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEndStartElement(writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEnvelopeEnd(message: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeEnd(message.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteEnvelopeStart(message: ConstPtr, writer: ConstPtr, donecallback: WsMessageDoneCallback, donecallbackstate: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteEnvelopeStart(message.rawAddress.toString(), writer.rawAddress.toString(), 0L.toString(), donecallbackstate.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteMessageEnd(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageEnd(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteMessageStart(channel: ConstPtr, message: ConstPtr, asynccontext: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteMessageStart(channel.rawAddress.toString(), message.rawAddress.toString(), asynccontext.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteNode(writer: ConstPtr, node: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteNode(writer.rawAddress.toString(), node.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteQualifiedName(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteQualifiedName(writer.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartAttribute(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartAttribute(writer.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), singlequote, error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartCData(writer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartCData(writer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteStartElement(writer: ConstPtr, prefix: ConstPtr, localname: ConstPtr, ns: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteStartElement(writer.rawAddress.toString(), prefix.rawAddress.toString(), localname.rawAddress.toString(), ns.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteText(writer: ConstPtr, text: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteText(writer.rawAddress.toString(), text.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteType(writer: ConstPtr, typemapping: WsTypeMapping, type: WsType, typedescription: ConstPtr, writeoption: WsWriteOption, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteType(writer.rawAddress.toString(), typemapping, type, typedescription.rawAddress.toString(), writeoption, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteValue(writer: ConstPtr, valuetype: WsValueType, value: ConstPtr, valuesize: UInt, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteValue(writer.rawAddress.toString(), valuetype, value.rawAddress.toString(), valuesize.toInt(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlBuffer(writer: ConstPtr, xmlbuffer: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBuffer(writer.rawAddress.toString(), xmlbuffer.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlBufferToBytes(writer: ConstPtr, xmlbuffer: ConstPtr, encoding: ConstPtr, properties: ConstPtr, propertycount: UInt, heap: ConstPtr, bytes: MutPtr, bytecount: MutPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlBufferToBytes(writer.rawAddress.toString(), xmlbuffer.rawAddress.toString(), encoding.rawAddress.toString(), properties.rawAddress.toString(), propertycount.toInt(), heap.rawAddress.toString(), bytes.rawAddress.toString(), bytecount.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsWriteXmlnsAttribute(writer: ConstPtr, prefix: ConstPtr, ns: ConstPtr, singlequote: Bool, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsWriteXmlnsAttribute(writer.rawAddress.toString(), prefix.rawAddress.toString(), ns.rawAddress.toString(), singlequote, error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wsXmlStringEquals(string1: ConstPtr, string2: ConstPtr, error: ConstPtr): Hresult =
    if (windowsWin32NetworkingWindowswebservicesNapiAvailable) wasmWindowssysWindowsWin32NetworkingWindowswebservicesWsXmlStringEquals(string1.rawAddress.toString(), string2.rawAddress.toString(), error.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
