@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Systemtime
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityCryptographyNapiAddon(): Boolean

private val windowsWin32SecurityCryptographyNapiAvailable: Boolean = initWindowsWin32SecurityCryptographyNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptCreateContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptCreateContext(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptCreateHash(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptCreateHash(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDecrypt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDecrypt(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEncrypt(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEncrypt(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptExportKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptExportKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptFinishHash(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptFinishHash(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptGenRandom(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptGenRandom(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptGetProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptGetProperty(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptHash(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptHash(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptHashData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptHashData(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptImportKey(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptImportKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(p0: String, p1: Int, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptSetProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptSetProperty(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptSignHash(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptSignHash(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(p0: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(p0: String, p1: Int)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCloseStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCloseStore(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCompareCertificate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCompareCertificate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertControlStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertControlStore(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateContext(p0: Int, p1: Int, p2: String, p3: Int, p4: Int, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertDuplicateStore(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateStore(p0: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindAttribute(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindAttribute(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindChainInStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindChainInStore(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindExtension(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindExtension(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(p0: Int, p1: Int, p2: String, p3: String, p4: Int): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(p0: String)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(p0: String, p1: String, p2: String, p3: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetNameStringA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetNameStringA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetNameStringW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetNameStringW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertGetValidUsages(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertGetValidUsages(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertIsWeakHash(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertIsWeakHash(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertNameToStrA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertNameToStrA(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertNameToStrW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertNameToStrW(p0: Int, p1: String, p2: Int, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(p0: String, p1: Int, p2: String): String

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertOpenStore(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertOpenStore(p0: String, p1: Int, p2: String, p3: Int, p4: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(p0: String, p1: String): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(p0: String, p1: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(p0: Int, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(p0: String, p1: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSaveStore(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSaveStore(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertStrToNameA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertStrToNameA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertStrToNameW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertStrToNameW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(p0: Int, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptContextAddRef(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptContextAddRef(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptCreateHash(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptCreateHash(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDecodeObject(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDecodeObject(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(p0: Int, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDecrypt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDecrypt(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDeriveKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDeriveKey(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDestroyHash(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDestroyHash(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDestroyKey(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDestroyKey(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEncodeObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEncodeObject(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEncrypt(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEncrypt(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptExportKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptExportKey(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(p0: String): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(p0: Int, p1: String, p2: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptFormatObject(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptFormatObject(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGenKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGenKey(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGenRandom(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGenRandom(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetHashParam(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetHashParam(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(p0: Int, p1: String, p2: Int, p3: String, p4: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetProvParam(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetProvParam(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptGetUserKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptGetUserKey(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashCertificate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashCertificate(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashData(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashMessage(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashMessage(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptImportKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptImportKey(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMemAlloc(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMemAlloc(p0: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMemFree(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMemFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMemRealloc(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMemRealloc(p0: String, p1: Int): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgClose(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgControl(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgControl(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(p0: Int, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(p0: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(p0: String, p1: String, p2: Int, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: Int, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptProtectData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptProtectData(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptProtectMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptProtectMemory(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptQueryObject(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptQueryObject(p0: Int, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptReleaseContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptReleaseContext(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetHashParam(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetHashParam(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(p0: Int, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetProvParam(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProvParam(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetProviderA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderA(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSetProviderW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderW(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignCertificate(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignCertificate(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignHashA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignHashA(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignHashW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignHashW(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignMessage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignMessage(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUnprotectData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUnprotectData(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(p0: String, p1: Int, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: String, p8: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlEncode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlEncode(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(p0: Int, p1: String, p2: Int, p3: Int): String

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlSign(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlSign(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyDecrypt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyDecrypt(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyEncrypt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyEncrypt(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyFreeToken(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyFreeToken(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int, p6: Int, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetBrowserToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetBrowserToken(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetCipherInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetCipherInterface(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetHashInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetHashInterface(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetKeyedHash(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetKeyedHash(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetRngInterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetRngInterface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetSChannelInterface(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetSChannelInterface(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetSignatureInterface(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetSignatureInterface(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyGetToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyGetToken(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyHashCore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyHashCore(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyHashFinal(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyHashFinal(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyImportInformationCard(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyImportInformationCard(p0: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyManageCardSpace()")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyManageCardSpace(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptDecrypt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptDecrypt(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptEncrypt(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptEncrypt(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptExportKey(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptExportKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptFreeObject(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptFreeObject(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptGetProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptGetProperty(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptImportKey(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptImportKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int, p7: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(p0: String, p1: String, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptOpenKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptOpenKey(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptSetProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptSetProperty(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptSignHash(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptSignHash(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptStreamClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyPFXExportCertStore(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyPFXExportCertStore(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyPFXImportCertStore(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyPFXImportCertStore(p0: String, p1: String, p2: Int): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyProcessPrng(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyProcessPrng(p0: String, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignError()")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignError(): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignHash(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignHash(p0: String, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerSign(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerSign(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerSignEx(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerSignEx(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerSignEx2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerSignEx2(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerSignEx3(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerSignEx3(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String, p13: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerTimeStamp(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStamp(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStampEx(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslChangeNotify(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslChangeNotify(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslComputeSessionHash(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslComputeSessionHash(p0: String, p1: String, p2: Int, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(p0: String, p1: String, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(p0: String, p1: String, p2: Int, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(p0: String, p1: String, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslDecryptPacket(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslDecryptPacket(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslEncryptPacket(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslEncryptPacket(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslEnumEccCurves(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslEnumEccCurves(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExpandBinderKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExpandBinderKey(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExpandWriteKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExpandWriteKey(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExportKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExportKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslExtractMasterKey(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslExtractMasterKey(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslFreeBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslFreeBuffer(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslFreeObject(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslFreeObject(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: Int, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: String, p9: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslGetKeyProperty(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslGetKeyProperty(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslGetProviderProperty(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslGetProviderProperty(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslHashHandshake(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslHashHandshake(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslImportKey(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslImportKey(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslImportMasterKey(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslImportMasterKey(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: Int, p8: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(p0)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(p0: String, p1: Int, p2: Int, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslOpenProvider(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslOpenProvider(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslSignHash(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslSignHash(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySslVerifySignature(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySslVerifySignature(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographySystemPrng(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographySystemPrng(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyTransformBlock(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyTransformBlock(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyTransformFinalBlock(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyTransformFinalBlock(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityCryptographyVerifyHash(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityCryptographyVerifyHash(p0: String, p1: Int, p2: String, p3: String, p4: Int, p5: String, p6: String): Int

public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), dwposition.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszprovider.rawAddress.toString(), dwposition.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(halgorithm.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr<CryptContextConfig>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(dwtable.toInt(), pszcontext.rawAddress.toString(), pconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr<CryptContextFunctionConfig>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr<CryptContextConfig>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptCreateContext(dwtable.toInt(), pszcontext.rawAddress.toString(), pconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr<BcryptHashHandle>, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptCreateHash(halgorithm.rawAddress.toString(), phhash.rawAddress.toString(), pbhashobject.rawAddress.toString(), cbhashobject.toInt(), pbsecret.rawAddress.toString(), cbsecret.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr<BcryptHashHandle>, nhashes: UInt, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(halgorithm.rawAddress.toString(), phhash.rawAddress.toString(), nhashes.toInt(), pbhashobject.rawAddress.toString(), cbhashobject.toInt(), pbsecret.rawAddress.toString(), cbsecret.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pbiv: MutPtr<UByte>, cbiv: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDecrypt(hkey.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pbiv.rawAddress.toString(), cbiv.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(dwtable.toInt(), pszcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(hsharedsecret.rawAddress.toString(), pwszkdf.rawAddress.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(hhash.rawAddress.toString(), htargetalg.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr<UByte>, cbpassword: UInt, pbsalt: ConstPtr<UByte>, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(hprf.rawAddress.toString(), pbpassword.rawAddress.toString(), cbpassword.toInt(), pbsalt.rawAddress.toString(), cbsalt.toInt(), citerations.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(hhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(hkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(hsecret.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr<BcryptHashHandle>, pbhashobject: MutPtr<UByte>, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(hhash.rawAddress.toString(), phnewhash.rawAddress.toString(), pbhashobject.rawAddress.toString(), cbhashobject.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(hkey.rawAddress.toString(), phnewkey.rawAddress.toString(), pbkeyobject.rawAddress.toString(), cbkeyobject.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pbiv: MutPtr<UByte>, cbiv: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEncrypt(hkey.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pbiv.rawAddress.toString(), cbiv.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr<UInt>, ppalglist: MutPtr<MutPtr<BcryptAlgorithmIdentifier>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(dwalgoperations.toInt(), palgcount.rawAddress.toString(), ppalglist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctionProviders>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctions>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContexts>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(dwtable.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr<UInt>, ppimpllist: MutPtr<MutPtr<BcryptProviderName>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(pszalgid.rawAddress.toString(), pimplcount.rawAddress.toString(), ppimpllist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviders>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptExportKey(hkey.rawAddress.toString(), hexportkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(hkey.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptFinishHash(hhash.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFreeBuffer(pvbuffer: ConstPtr<CVoid>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(pvbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr<UByte>, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptGenRandom(halgorithm.rawAddress.toString(), pbbuffer.rawAddress.toString(), cbbuffer.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr<BcryptKeyHandle>, dwlength: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(halgorithm.rawAddress.toString(), phkey.rawAddress.toString(), dwlength.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, pbsecret: ConstPtr<UByte>, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(halgorithm.rawAddress.toString(), phkey.rawAddress.toString(), pbkeyobject.rawAddress.toString(), cbkeyobject.toInt(), pbsecret.rawAddress.toString(), cbsecret.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr<UByte>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(pfenabled.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptGetProperty(hobject.rawAddress.toString(), pszproperty.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr<UByte>, cbsecret: UInt, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptHash(halgorithm.rawAddress.toString(), pbsecret.rawAddress.toString(), cbsecret.toInt(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptHashData(hhash.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr<BcryptKeyHandle>, pbkeyobject: MutPtr<UByte>, cbkeyobject: UInt, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptImportKey(halgorithm.rawAddress.toString(), himportkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), phkey.rawAddress.toString(), pbkeyobject.rawAddress.toString(), cbkeyobject.toInt(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr<BcryptKeyHandle>, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(halgorithm.rawAddress.toString(), himportkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), phkey.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(hkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr<BcryptAlgHandle>, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(phalgorithm.rawAddress.toString(), pszalgid.rawAddress.toString(), pszimplementation.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr<CVoid>, cboperations: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(hobject.rawAddress.toString(), operationtype, poperations.rawAddress.toString(), cboperations.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextConfig>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(dwtable.toInt(), pszcontext.rawAddress.toString(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptContextFunctionConfig>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszproperty.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviderReg>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(pszprovider.rawAddress.toString(), dwmode.toInt(), dwinterface.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRegisterConfigChangeNotify(phevent: MutPtr<Handle>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(phevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr<CryptProviderReg>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(pszprovider.rawAddress.toString(), dwflags.toInt(), preg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr<UInt>, ppbuffer: MutPtr<MutPtr<CryptProviderRefs>>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszprovider.rawAddress.toString(), dwmode.toInt(), dwflags.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr<BcryptSecretHandle>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(hprivkey.rawAddress.toString(), hpubkey.rawAddress.toString(), phagreedsecret.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszproperty.rawAddress.toString(), cbvalue.toInt(), pbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptSetProperty(hobject.rawAddress.toString(), pszproperty.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptSignHash(hkey.rawAddress.toString(), ppaddinginfo.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(pszprovider.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhash: ConstPtr<UByte>, cbhash: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(hkey.rawAddress.toString(), ppaddinginfo.rawAddress.toString(), pbhash.rawAddress.toString(), cbhash.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr<CrlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CrlContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(hcertstore.rawAddress.toString(), pcrlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr<CrlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CrlContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(hcertstore.rawAddress.toString(), pcrlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr<CtlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CtlContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(hcertstore.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr<CtlContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CtlContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(hcertstore.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr<CertContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(hcertstore.rawAddress.toString(), pcertcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr<CertContext>, dwadddisposition: UInt, ppstorecontext: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(hcertstore.rawAddress.toString(), pcertcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr<UByte>, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr<MutPtr<CrlContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), pbcrlencoded.rawAddress.toString(), cbcrlencoded.toInt(), dwadddisposition.toInt(), ppcrlcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr<UByte>, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr<MutPtr<CtlContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(hcertstore.rawAddress.toString(), dwmsgandcertencodingtype.toInt(), pbctlencoded.rawAddress.toString(), cbctlencoded.toInt(), dwadddisposition.toInt(), ppctlcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt(), dwadddisposition.toInt(), ppcertcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(szcertstorename.rawAddress.toString(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(szcertstorename.rawAddress.toString(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr<CertContext>, pszusageidentifier: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(pcertcontext.rawAddress.toString(), pszusageidentifier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr<CVoid>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(hserverocspresponse.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr<CertServerOcspResponseContext>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(pserverocspresponsecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr<UByte>, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr<UInt>, ppvcontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(hcertstore.rawAddress.toString(), pbelement.rawAddress.toString(), cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), pdwcontexttype.rawAddress.toString(), ppvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(hcollectionstore.rawAddress.toString(), hsiblingstore.rawAddress.toString(), dwupdateflags.toInt(), dwpriority.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    if (windowsWin32SecurityCryptographyNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(dwalgid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr<CVoid>, dwflags: UInt) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(hserverocspresponse.rawAddress.toString(), dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertCloseStore(hcertstore.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr<CertInfo>, pcertid2: ConstPtr<CertInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertCompareCertificate(dwcertencodingtype.toInt(), pcertid1.rawAddress.toString(), pcertid2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr<CryptIntegerBlob>, pcertname2: ConstPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(dwcertencodingtype.toInt(), pcertname1.rawAddress.toString(), pcertname2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareIntegerBlob(pint1: ConstPtr<CryptIntegerBlob>, pint2: ConstPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(pint1.rawAddress.toString(), pint2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr<CertPublicKeyInfo>, ppublickey2: ConstPtr<CertPublicKeyInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(dwcertencodingtype.toInt(), ppublickey1.rawAddress.toString(), ppublickey2.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertControlStore(hcertstore.rawAddress.toString(), dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr<UByte>, cbcrlencoded: UInt): MutPtr<CrlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(dwcertencodingtype.toInt(), pbcrlencoded.rawAddress.toString(), cbcrlencoded.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr<UByte>, cbctlencoded: UInt): MutPtr<CtlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(dwmsgandcertencodingtype.toInt(), pbctlencoded.rawAddress.toString(), cbctlencoded.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr<CertContext>, coptattr: UInt, rgoptattr: ConstPtr<CryptAttribute>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pctlentry: MutPtr<CtlEntry>, pcbctlentry: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(pcertcontext.rawAddress.toString(), coptattr.toInt(), rgoptattr.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), pctlentry.rawAddress.toString(), pcbctlentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCertificateChainEngine(pconfig: ConstPtr<CertChainEngineConfig>, phchainengine: MutPtr<Hcertchainengine>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(pconfig.rawAddress.toString(), phchainengine.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr<UByte>, cbcertencoded: UInt): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(dwcertencodingtype.toInt(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr<CertCreateContextPara>): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), dwflags.toInt(), pcreatepara.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr<CryptIntegerBlob>, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr<CryptKeyProvInfo>, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pstarttime: ConstPtr<Systemtime>, pendtime: ConstPtr<Systemtime>, pextensions: ConstPtr<CertExtensions>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(hcryptprovorncryptkey.toString(), psubjectissuerblob.rawAddress.toString(), dwflags.toInt(), pkeyprovinfo.rawAddress.toString(), psignaturealgorithm.rawAddress.toString(), pstarttime.rawAddress.toString(), pendtime.rawAddress.toString(), pextensions.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCRLFromStore(pcrlcontext: ConstPtr<CrlContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(pcrlcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCTLFromStore(pctlcontext: ConstPtr<CtlContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(pctlcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCertificateFromStore(pcertcontext: ConstPtr<CertContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(pcertcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCRLContext(pcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(pcrlcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCTLContext(pctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(pctlcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCertificateChain(pchaincontext: ConstPtr<CertChainContext>): MutPtr<CertChainContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(pchaincontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCertificateContext(pcertcontext: ConstPtr<CertContext>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(pcertcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertDuplicateStore(hcertstore.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCRLContextProperties(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(pcrlcontext.rawAddress.toString(), dwpropid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(hcertstore.rawAddress.toString(), pprevcrlcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCTLContextProperties(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(pctlcontext.rawAddress.toString(), dwpropid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(hcertstore.rawAddress.toString(), pprevctlcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCertificateContextProperties(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(pcertcontext.rawAddress.toString(), dwpropid.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr<CertContext>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(hcertstore.rawAddress.toString(), pprevcertcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumPhysicalStore): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr<CtlContext>, ppvnextsubject: MutPtr<MutPtr<CVoid>>, psubjectidentifier: MutPtr<CryptIntegerBlob>, pencodedattributes: MutPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(pctlcontext.rawAddress.toString(), ppvnextsubject.rawAddress.toString(), psubjectidentifier.rawAddress.toString(), pencodedattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr<CVoid>, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumSystemStore): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(dwflags.toInt(), pvsystemstorelocationpara.rawAddress.toString(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr<CryptAttribute>): MutPtr<CryptAttribute> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindAttribute(pszobjid.rawAddress.toString(), cattr.toInt(), rgattr.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr<CVoid>, pprevcrlcontext: ConstPtr<CrlContext>): MutPtr<CrlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevcrlcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr<CVoid>, pprevctlcontext: ConstPtr<CtlContext>): MutPtr<CtlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(hcertstore.rawAddress.toString(), dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevctlcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCertificateInCRL(pcert: ConstPtr<CertContext>, pcrlcontext: ConstPtr<CrlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppcrlentry: MutPtr<MutPtr<CrlEntry>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(pcert.rawAddress.toString(), pcrlcontext.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), ppcrlentry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr<CVoid>, pprevcertcontext: ConstPtr<CertContext>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevcertcontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr<CVoid>, pprevchaincontext: ConstPtr<CertChainContext>): MutPtr<CertChainContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindChainInStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevchaincontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr<CertExtension>): MutPtr<CertExtension> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindExtension(pszobjid.rawAddress.toString(), cextensions.toInt(), rgextensions.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr<CertNameInfo>): MutPtr<CertRdnAttr> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(pszobjid.rawAddress.toString(), pname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, pctlcontext: ConstPtr<CtlContext>, dwflags: UInt): MutPtr<CtlEntry> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr<CryptIntegerBlob>, pctlcontext: ConstPtr<CtlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pencodedattributes: MutPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(psubjectidentifier.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), pencodedattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCRLContext(pcrlcontext: ConstPtr<CrlContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(pcrlcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCTLContext(pctlcontext: ConstPtr<CtlContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(pctlcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCertificateChain(pchaincontext: ConstPtr<CertChainContext>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(pchaincontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(hchainengine.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateChainList(prgpselection: ConstPtr<ConstPtr<CertChainContext>>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(prgpselection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateContext(pcertcontext: ConstPtr<CertContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(pcertcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr<CertServerOcspResponseContext>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(pserverocspresponsecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certGetCRLContextProperty(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(pcrlcontext.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr<CertContext>, pprevcrlcontext: ConstPtr<CrlContext>, pdwflags: MutPtr<UInt>): MutPtr<CrlContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(hcertstore.rawAddress.toString(), pissuercontext.rawAddress.toString(), pprevcrlcontext.rawAddress.toString(), pdwflags.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCTLContextProperty(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(pctlcontext.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr<CertContext>, ptime: ConstPtr<Filetime>, hadditionalstore: Hcertstore, pchainpara: ConstPtr<CertChainPara>, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppchaincontext: MutPtr<MutPtr<CertChainContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(hchainengine.rawAddress.toString(), pcertcontext.rawAddress.toString(), ptime.rawAddress.toString(), hadditionalstore.rawAddress.toString(), pchainpara.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), ppchaincontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCertificateContextProperty(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(pcertcontext.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr<CertContext>, dwflags: UInt, pusage: MutPtr<CtlUsage>, pcbusage: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(pcertcontext.rawAddress.toString(), dwflags.toInt(), pusage.rawAddress.toString(), pcbusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr<CertInfo>, pbkeyusage: MutPtr<UByte>, cbkeyusage: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(dwcertencodingtype.toInt(), pcertinfo.rawAddress.toString(), pbkeyusage.rawAddress.toString(), cbkeyusage.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr<CertContext>, pprevissuercontext: ConstPtr<CertContext>, pdwflags: MutPtr<UInt>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(hcertstore.rawAddress.toString(), psubjectcontext.rawAddress.toString(), pprevissuercontext.rawAddress.toString(), pdwflags.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetNameStringA(pcertcontext: ConstPtr<CertContext>, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr<CVoid>, psznamestring: Pstr, cchnamestring: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetNameStringA(pcertcontext.rawAddress.toString(), dwtype.toInt(), dwflags.toInt(), pvtypepara.rawAddress.toString(), psznamestring.rawAddress.toString(), cchnamestring.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetNameStringW(pcertcontext: ConstPtr<CertContext>, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr<CVoid>, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetNameStringW(pcertcontext.rawAddress.toString(), dwtype.toInt(), dwflags.toInt(), pvtypepara.rawAddress.toString(), psznamestring.rawAddress.toString(), cchnamestring.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr<CertPublicKeyInfo>): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(dwcertencodingtype.toInt(), ppublickey.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): MutPtr<CertServerOcspResponseContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(hserverocspresponse.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(hcertstore.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr<CertInfo>): MutPtr<CertContext> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), pcertid.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr<ConstPtr<CertContext>>, cnumoids: MutPtr<Int>, rghoids: MutPtr<Pstr>, pcboids: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertGetValidUsages(ccerts.toInt(), rghcerts.rawAddress.toString(), cnumoids.rawAddress.toString(), rghoids.rawAddress.toString(), pcboids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr<CryptIntegerBlob>, prdn: ConstPtr<CertRdn>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), pcertname.rawAddress.toString(), prdn.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsStrongHashToSign(pstrongsignpara: ConstPtr<CertStrongSignPara>, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr<CertContext>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(pstrongsignpara.rawAddress.toString(), pwszcnghashalgid.rawAddress.toString(), psigningcert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsValidCRLForCertificate(pcert: ConstPtr<CertContext>, pcrl: ConstPtr<CrlContext>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(pcert.rawAddress.toString(), pcrl.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr<CertChainContext>, ptimestamp: ConstPtr<Filetime>, pwszfilename: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertIsWeakHash(dwhashusetype.toInt(), pwszcnghashalgid.rawAddress.toString(), dwchainflags.toInt(), psignerchaincontext.rawAddress.toString(), ptimestamp.rawAddress.toString(), pwszfilename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr<CryptIntegerBlob>, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertNameToStrA(dwcertencodingtype.toInt(), pname.rawAddress.toString(), dwstrtype.toInt(), psz.rawAddress.toString(), csz.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr<CryptIntegerBlob>, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertNameToStrW(dwcertencodingtype.toInt(), pname.rawAddress.toString(), dwstrtype.toInt(), psz.rawAddress.toString(), csz.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(pszobjid.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenServerOcspResponse(pchaincontext: ConstPtr<CertChainContext>, dwflags: UInt, popenpara: ConstPtr<CertServerOcspResponseOpenPara>): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(pchaincontext.rawAddress.toString(), dwflags.toInt(), popenpara.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr<CVoid>): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertOpenStore(lpszstoreprovider.rawAddress.toString(), dwencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), pvpara.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(hprov.toString(), szsubsystemprotocol.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(hprov.toString(), szsubsystemprotocol.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr<CryptIntegerBlob>, psz: Pstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(dwvaluetype.toInt(), pvalue.rawAddress.toString(), psz.rawAddress.toString(), csz.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr<CryptIntegerBlob>, psz: Pwstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(dwvaluetype.toInt(), pvalue.rawAddress.toString(), psz.rawAddress.toString(), csz.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRegisterPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr<CertPhysicalStoreInfo>, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pwszstorename.rawAddress.toString(), pstoreinfo.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRegisterSystemStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pstoreinfo: ConstPtr<CertSystemStoreInfo>, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pstoreinfo.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr<CertContext>, pszusageidentifier: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(pcertcontext.rawAddress.toString(), pszusageidentifier.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(hcollectionstore.rawAddress.toString(), hsiblingstore.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(hchainengine.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr<CertContext>, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>, ppbdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>, ppwszmimetype: MutPtr<Pwstr>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(pcertcontext.rawAddress.toString(), lpszlogoorbiometrictype.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString(), ppbdata.rawAddress.toString(), pcbdata.rawAddress.toString(), ppwszmimetype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr<CVoid>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSaveStore(hcertstore.rawAddress.toString(), dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), pvsavetopara.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSelectCertificateChains(pselectioncontext: ConstPtr<Guid>, dwflags: UInt, pchainparameters: ConstPtr<CertSelectChainPara>, ccriteria: UInt, rgpcriteria: ConstPtr<CertSelectCriteria>, hstore: Hcertstore, pcselection: MutPtr<UInt>, pprgpselection: MutPtr<MutPtr<MutPtr<CertChainContext>>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(pselectioncontext.rawAddress.toString(), dwflags.toInt(), pchainparameters.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), hstore.rawAddress.toString(), pcselection.rawAddress.toString(), pprgpselection.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr<CrlContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(pcrlcontext.rawAddress.toString(), dwflags.toInt(), pbelement.rawAddress.toString(), pcbelement.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCTLStoreElement(pctlcontext: ConstPtr<CtlContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(pctlcontext.rawAddress.toString(), dwflags.toInt(), pbelement.rawAddress.toString(), pcbelement.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr<CertContext>, dwflags: UInt, pbelement: MutPtr<UByte>, pcbelement: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(pcertcontext.rawAddress.toString(), dwflags.toInt(), pbelement.rawAddress.toString(), pcbelement.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCRLContextProperty(pcrlcontext: ConstPtr<CrlContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(pcrlcontext.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCTLContextProperty(pctlcontext: ConstPtr<CtlContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(pctlcontext.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr<CertContext>, pctlentry: ConstPtr<CtlEntry>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(pcertcontext.rawAddress.toString(), pctlentry.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCertificateContextProperty(pcertcontext: ConstPtr<CertContext>, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(pcertcontext.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr<CertContext>, pusage: ConstPtr<CtlUsage>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(pcertcontext.rawAddress.toString(), pusage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(hcertstore.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>, ppszerror: MutPtr<Pcstr>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertStrToNameA(dwcertencodingtype.toInt(), pszx500.rawAddress.toString(), dwstrtype.toInt(), pvreserved.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString(), ppszerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>, ppszerror: MutPtr<Pcwstr>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertStrToNameW(dwcertencodingtype.toInt(), pszx500.rawAddress.toString(), dwstrtype.toInt(), pvreserved.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString(), ppszerror.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pwszstorename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certUnregisterSystemStore(pvsystemstore: ConstPtr<CVoid>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(pvsystemstore.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr<CertInfo>, ccrlinfo: UInt, rgpcrlinfo: ConstPtr<ConstPtr<CrlInfo>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(dwcertencodingtype.toInt(), pcertid.rawAddress.toString(), ccrlinfo.toInt(), rgpcrlinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr<Filetime>, pcrlinfo: ConstPtr<CrlInfo>): Int =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(ptimetoverify.rawAddress.toString(), pcrlinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, psubjectusage: ConstPtr<CtlUsage>, dwflags: UInt, pverifyusagepara: ConstPtr<CtlVerifyUsagePara>, pverifyusagestatus: MutPtr<CtlVerifyUsageStatus>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress.toString(), psubjectusage.rawAddress.toString(), dwflags.toInt(), pverifyusagepara.rawAddress.toString(), pverifyusagestatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr<CertChainContext>, ppolicypara: ConstPtr<CertChainPolicyPara>, ppolicystatus: MutPtr<CertChainPolicyStatus>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(pszpolicyoid.rawAddress.toString(), pchaincontext.rawAddress.toString(), ppolicypara.rawAddress.toString(), ppolicystatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr<ConstPtr<CVoid>>, dwflags: UInt, prevpara: ConstPtr<CertRevocationPara>, prevstatus: MutPtr<CertRevocationStatus>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), rgpvcontext.rawAddress.toString(), dwflags.toInt(), prevpara.rawAddress.toString(), prevstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifySubjectCertificateContext(psubject: ConstPtr<CertContext>, pissuer: ConstPtr<CertContext>, pdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(psubject.rawAddress.toString(), pissuer.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyTimeValidity(ptimetoverify: ConstPtr<Filetime>, pcertinfo: ConstPtr<CertInfo>): Int =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(ptimetoverify.rawAddress.toString(), pcertinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyValidityNesting(psubjectinfo: ConstPtr<CertInfo>, pissuerinfo: ConstPtr<CertInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(psubjectinfo.rawAddress.toString(), pissuerinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeCryptoHandle(hcrypto: ConstPtr<InformationcardCryptoHandle>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(hcrypto.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr<CertContext>, dwflags: CryptAcquireFlags, pvparameters: ConstPtr<CVoid>, phcryptprovorncryptkey: MutPtr<HcryptprovOrNcryptKeyHandle>, pdwkeyspec: MutPtr<CertKeySpec>, pfcallerfreeprovorncryptkey: MutPtr<Bool>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(pcert.rawAddress.toString(), dwflags.toInt(), pvparameters.rawAddress.toString(), phcryptprovorncryptkey.rawAddress.toString(), pdwkeyspec.rawAddress.toString(), pfcallerfreeprovorncryptkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireContextA(phprov: MutPtr<ULong>, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(phprov.rawAddress.toString(), szcontainer.rawAddress.toString(), szprovider.rawAddress.toString(), dwprovtype.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireContextW(phprov: MutPtr<ULong>, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(phprov.rawAddress.toString(), szcontainer.rawAddress.toString(), szprovider.rawAddress.toString(), dwprovtype.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptBinaryToStringA(pbbinary: ConstPtr<UByte>, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(pbbinary.rawAddress.toString(), cbbinary.toInt(), dwflags.toInt(), pszstring.rawAddress.toString(), pcchstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptBinaryToStringW(pbbinary: ConstPtr<UByte>, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(pbbinary.rawAddress.toString(), cbbinary.toInt(), dwflags.toInt(), pszstring.rawAddress.toString(), pcchstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptContextAddRef(hprov.toString(), pdwreserved.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr<Hcryptasync>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(dwflags.toInt(), phasync.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptCreateHash(hprov.toString(), algid.toInt(), hkey.toString(), dwflags.toInt(), phhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr<Publickeystruc>, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pbhash: MutPtr<UByte>, pcbhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), pszpubkeyoid.rawAddress.toString(), ppubkeystruc.rawAddress.toString(), cbpubkeystruc.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString(), pbhash.rawAddress.toString(), pcbhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbencodedblob: ConstPtr<UByte>, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr<UInt>, pdwinnercontenttype: MutPtr<UInt>, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(dwmsgtypeflags.toInt(), pdecryptpara.rawAddress.toString(), pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbencodedblob.rawAddress.toString(), cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), pdwmsgtype.rawAddress.toString(), pdwinnercontenttype.rawAddress.toString(), pbdecoded.rawAddress.toString(), pcbdecoded.rawAddress.toString(), ppxchgcert.rawAddress.toString(), ppsignercert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr<CVoid>, pcbstructinfo: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDecodeObject(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), dwflags.toInt(), pvstructinfo.rawAddress.toString(), pcbstructinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr<CryptDecodePara>, pvstructinfo: MutPtr<CVoid>, pcbstructinfo: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), dwflags.toInt(), pdecodepara.rawAddress.toString(), pvstructinfo.rawAddress.toString(), pcbstructinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDecrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbencryptedblob: ConstPtr<UByte>, cbencryptedblob: UInt, pbdecrypted: MutPtr<UByte>, pcbdecrypted: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(pdecryptpara.rawAddress.toString(), pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbencryptedblob.rawAddress.toString(), cbencryptedblob.toInt(), pbdecrypted.rawAddress.toString(), pcbdecrypted.rawAddress.toString(), ppxchgcert.rawAddress.toString(), ppsignercert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecryptMessage(pdecryptpara: ConstPtr<CryptDecryptMessagePara>, pbencryptedblob: ConstPtr<UByte>, cbencryptedblob: UInt, pbdecrypted: MutPtr<UByte>, pcbdecrypted: MutPtr<UInt>, ppxchgcert: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(pdecryptpara.rawAddress.toString(), pbencryptedblob.rawAddress.toString(), cbencryptedblob.toInt(), pbdecrypted.rawAddress.toString(), pcbdecrypted.rawAddress.toString(), ppxchgcert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDeriveKey(hprov.toString(), algid.toInt(), hbasedata.toString(), dwflags.toInt(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt, phhash: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(hhash.toString(), pdwreserved.rawAddress.toString(), dwflags.toInt(), phhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr<UInt>, dwflags: UInt, phkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(hkey.toString(), pdwreserved.rawAddress.toString(), dwflags.toInt(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEncodeObject(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pvstructinfo.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr<CryptEncodePara>, pvencoded: MutPtr<CVoid>, pcbencoded: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pvstructinfo.rawAddress.toString(), dwflags.toInt(), pencodepara.rawAddress.toString(), pvencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwbuflen: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEncrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwbuflen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncryptMessage(pencryptpara: ConstPtr<CryptEncryptMessagePara>, crecipientcert: UInt, rgprecipientcert: ConstPtr<ConstPtr<CertContext>>, pbtobeencrypted: ConstPtr<UByte>, cbtobeencrypted: UInt, pbencryptedblob: MutPtr<UByte>, pcbencryptedblob: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(pencryptpara.rawAddress.toString(), crecipientcert.toInt(), rgprecipientcert.rawAddress.toString(), pbtobeencrypted.rawAddress.toString(), cbtobeencrypted.toInt(), pbencryptedblob.rawAddress.toString(), pcbencryptedblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvarg: MutPtr<CVoid>, pfnenum: PfnCryptEnumKeyidProp): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(pkeyidentifier.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress.toString(), pvreserved.rawAddress.toString(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, sztypename: Pstr, pcbtypename: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), sztypename.rawAddress.toString(), pcbtypename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, sztypename: Pwstr, pcbtypename: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), sztypename.rawAddress.toString(), pcbtypename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, szprovname: Pstr, pcbprovname: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), szprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pdwprovtype: MutPtr<UInt>, szprovname: Pwstr, pcbprovname: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), szprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptExportKey(hkey.toString(), hexpkey.toString(), dwblobtype.toInt(), dwflags.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pbprivatekeyblob: MutPtr<UByte>, pcbprivatekeyblob: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(hcryptprov.toString(), dwkeyspec.toInt(), pszprivatekeyobjid.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), pbprivatekeyblob.rawAddress.toString(), pcbprivatekeyblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), pcbinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pszpublickeyobjid.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), pinfo.rawAddress.toString(), pcbinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, pinfo: MutPtr<CertPublicKeyInfo>, pcbinfo: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey.rawAddress.toString(), dwcertencodingtype.toInt(), pszpublickeyobjid.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), pinfo.rawAddress.toString(), pcbinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr<CertContext>, dwflags: CryptFindFlags, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(pcert.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    if (windowsWin32SecurityCryptographyNapiAvailable) ConstPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(pwszcryptname.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr<CVoid>, dwgroupid: UInt): MutPtr<CryptOidInfo> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(dwkeytype.toInt(), pvkey.rawAddress.toString(), dwgroupid.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr<CVoid>, lpszstructtype: Pcstr, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbformat: MutPtr<CVoid>, pcbformat: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), pformatstruct.rawAddress.toString(), lpszstructtype.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbformat.rawAddress.toString(), pcbformat.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr<CVoid>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(hfuncaddr.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGenKey(hprov.toString(), algid.toInt(), dwflags.toInt(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr<UByte>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGenRandom(hprov.toString(), dwlen.toInt(), pbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr<MutPtr<CVoid>>, ppfnfree: MutPtr<PfnCryptAsyncParamFreeFunc>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(hasync.toString(), pszparamoid.rawAddress.toString(), ppvparam.rawAddress.toString(), ppfnfree.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(hfuncset.rawAddress.toString(), dwencodingtype.toInt(), pwszdlllist.rawAddress.toString(), pcchdlllist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr<MutPtr<CVoid>>, phfuncaddr: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(hfuncset.rawAddress.toString(), dwencodingtype.toInt(), pwszdll.rawAddress.toString(), dwflags.toInt(), ppvfuncaddr.rawAddress.toString(), phfuncaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pszprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pszprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetHashParam(hhash.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(pkeyidentifier.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress.toString(), pvreserved.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(hkey.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt): Int =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(dwmsgencodingtype.toInt(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr<CVoid>, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr<MutPtr<CVoid>>, phfuncaddr: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(hfuncset.rawAddress.toString(), dwencodingtype.toInt(), pszoid.rawAddress.toString(), dwflags.toInt(), ppvfuncaddr.rawAddress.toString(), phfuncaddr.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr<UInt>, pbvaluedata: MutPtr<UByte>, pcbvaluedata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pdwvaluetype.rawAddress.toString(), pbvaluedata.rawAddress.toString(), pcbvaluedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr<CVoid>, dwflags: CryptGetUrlFlags, purlarray: MutPtr<CryptUrlArray>, pcburlarray: MutPtr<UInt>, purlinfo: MutPtr<CryptUrlInfo>, pcburlinfo: MutPtr<UInt>, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(pszurloid.rawAddress.toString(), pvpara.rawAddress.toString(), dwflags.toInt(), purlarray.rawAddress.toString(), pcburlarray.rawAddress.toString(), purlinfo.rawAddress.toString(), pcburlinfo.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr<UByte>, pdwdatalen: MutPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetProvParam(hprov.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptGetUserKey(hprov.toString(), dwkeyspec.toInt(), phuserkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashCertificate(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr<CVoid>, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(pwszcnghashalgid.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashData(hhash: ULong, pbdata: ConstPtr<UByte>, dwdatalen: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashData(hhash.toString(), pbdata.rawAddress.toString(), dwdatalen.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashMessage(phashpara: ConstPtr<CryptHashMessagePara>, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr<ConstPtr<UByte>>, rgcbtobehashed: ConstPtr<UInt>, pbhashedblob: MutPtr<UByte>, pcbhashedblob: MutPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashMessage(phashpara.rawAddress.toString(), fdetachedhash, ctobehashed.toInt(), rgpbtobehashed.rawAddress.toString(), rgcbtobehashed.rawAddress.toString(), pbhashedblob.rawAddress.toString(), pcbhashedblob.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash.toString(), hkey.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr<UByte>, cbencoded: UInt, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(hcryptprov.toString(), dwcertencodingtype.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportKey(hprov: ULong, pbdata: ConstPtr<UByte>, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptImportKey(hprov.toString(), pbdata.rawAddress.toString(), dwdatalen.toInt(), hpubkey.toString(), dwflags.toInt(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr<ULong>, pvauxinfo: ConstPtr<CVoid>): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, phkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(hcryptprov.toString(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr<CVoid>, phkey: MutPtr<ULong>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(hcryptprov.toString(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), aikeyalg.toInt(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr<CertPublicKeyInfo>, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr<CVoid>, phkey: MutPtr<BcryptKeyHandle>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(pszfuncname.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(0L.toString(), pvarg.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr<CVoid>, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr<CVoid>, phdefaultcontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(hcryptprov.toString(), dwdefaulttype.toInt(), pvdefaultpara.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), phdefaultcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr<CryptOidFuncEntry>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(hmodule.rawAddress.toString(), dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), cfuncentry.toInt(), rgfuncentry.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMemAlloc(cbsize: UInt): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptMemAlloc(cbsize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMemFree(pv: ConstPtr<CVoid>) {
    if (windowsWin32SecurityCryptographyNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityCryptographyCryptMemFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptMemRealloc(pv: ConstPtr<CVoid>, cbsize: UInt): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptMemRealloc(pv.rawAddress.toString(), cbsize.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr<CVoid>, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.rawAddress.toString(), pszinnercontentobjid.rawAddress.toString(), cbdata.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgClose(hcryptmsg: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgClose(hcryptmsg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgControl(hcryptmsg: ConstPtr<CVoid>, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgControl(hcryptmsg.rawAddress.toString(), dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCountersign(hcryptmsg: ConstPtr<CVoid>, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr<CmsgSignerEncodeInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(hcryptmsg.rawAddress.toString(), dwindex.toInt(), ccountersigners.toInt(), rgcountersigners.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr<CmsgSignerEncodeInfo>, pbcountersignature: MutPtr<UByte>, pcbcountersignature: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(dwencodingtype.toInt(), pbsignerinfo.rawAddress.toString(), cbsignerinfo.toInt(), ccountersigners.toInt(), rgcountersigners.rawAddress.toString(), pbcountersignature.rawAddress.toString(), pcbcountersignature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgDuplicate(hcryptmsg: ConstPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(hcryptmsg.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr<CtlInfo>, psigninfo: ConstPtr<CmsgSignedEncodeInfo>, dwflags: UInt, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), pctlinfo.rawAddress.toString(), psigninfo.rawAddress.toString(), dwflags.toInt(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr<CVoid>, csignerstore: UInt, rghsignerstore: ConstPtr<Hcertstore>, dwflags: UInt, ppsigner: MutPtr<MutPtr<CertContext>>, pdwsignerindex: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(hcryptmsg.rawAddress.toString(), csignerstore.toInt(), rghsignerstore.rawAddress.toString(), dwflags.toInt(), ppsigner.rawAddress.toString(), pdwsignerindex.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgGetParam(hcryptmsg: ConstPtr<CVoid>, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr<CVoid>, pcbdata: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(hcryptmsg.rawAddress.toString(), dwparamtype.toInt(), dwindex.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr<CertInfo>, pstreaminfo: ConstPtr<CmsgStreamInfo>): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toString(), precipientinfo.rawAddress.toString(), pstreaminfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr<CVoid>, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr<CmsgStreamInfo>): MutPtr<CVoid> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.rawAddress.toString(), pszinnercontentobjid.rawAddress.toString(), pstreaminfo.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr<UByte>, cbctlcontent: UInt, psigninfo: ConstPtr<CmsgSignedEncodeInfo>, dwflags: UInt, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(dwmsgencodingtype.toInt(), pbctlcontent.rawAddress.toString(), cbctlcontent.toInt(), psigninfo.rawAddress.toString(), dwflags.toInt(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgUpdate(hcryptmsg: ConstPtr<CVoid>, pbdata: ConstPtr<UByte>, cbdata: UInt, ffinal: Bool): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(hcryptmsg.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toInt(), ffinal) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr<UByte>, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr<CertInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(hcryptprov.toString(), dwencodingtype.toInt(), pbsignerinfo.rawAddress.toString(), cbsignerinfo.toInt(), pbsignerinfocountersignature.rawAddress.toString(), cbsignerinfocountersignature.toInt(), pcicountersigner.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr<UByte>, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr<UByte>, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr<CVoid>, dwflags: UInt, pvextra: MutPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toString(), dwencodingtype.toInt(), pbsignerinfo.rawAddress.toString(), cbsignerinfo.toInt(), pbsignerinfocountersignature.rawAddress.toString(), cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), pvsigner.rawAddress.toString(), dwflags.toInt(), pvextra.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptProtectData(pdatain: ConstPtr<CryptIntegerBlob>, szdatadescr: Pcwstr, poptionalentropy: ConstPtr<CryptIntegerBlob>, pvreserved: ConstPtr<CVoid>, ppromptstruct: ConstPtr<CryptprotectPromptstruct>, dwflags: UInt, pdataout: MutPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptProtectData(pdatain.rawAddress.toString(), szdatadescr.rawAddress.toString(), poptionalentropy.rawAddress.toString(), pvreserved.rawAddress.toString(), ppromptstruct.rawAddress.toString(), dwflags.toInt(), pdataout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptProtectMemory(pdatain: MutPtr<CVoid>, cbdatain: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptProtectMemory(pdatain.rawAddress.toString(), cbdatain.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr<CVoid>, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr<CertQueryEncodingType>, pdwcontenttype: MutPtr<CertQueryContentType>, pdwformattype: MutPtr<CertQueryFormatType>, phcertstore: MutPtr<Hcertstore>, phmsg: MutPtr<MutPtr<CVoid>>, ppvcontext: MutPtr<MutPtr<CVoid>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptQueryObject(dwobjecttype.toInt(), pvobject.rawAddress.toString(), dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), pdwmsgandcertencodingtype.rawAddress.toString(), pdwcontenttype.rawAddress.toString(), pdwformattype.rawAddress.toString(), phcertstore.rawAddress.toString(), phmsg.rawAddress.toString(), ppvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), dwindex.toInt(), pwszdll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), pwszdll.rawAddress.toString(), pszoverridefuncname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterOIDInfo(pinfo: ConstPtr<CryptOidInfo>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(pinfo.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr<MutPtr<CVoid>>, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr<CryptCredentials>, pvverify: ConstPtr<CVoid>, pauxinfo: MutPtr<CryptRetrieveAuxInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(pszurl.rawAddress.toString(), pszobjectoid.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.rawAddress.toString(), hasyncretrieve.toString(), pcredentials.rawAddress.toString(), pvverify.rawAddress.toString(), pauxinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr<MutPtr<CVoid>>, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr<CryptCredentials>, pvverify: ConstPtr<CVoid>, pauxinfo: MutPtr<CryptRetrieveAuxInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(pszurl.rawAddress.toString(), pszobjectoid.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.rawAddress.toString(), hasyncretrieve.toString(), pcredentials.rawAddress.toString(), pvverify.rawAddress.toString(), pauxinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr<CryptTimestampPara>, pbdata: ConstPtr<UByte>, cbdata: UInt, pptscontext: MutPtr<MutPtr<CryptTimestampContext>>, pptssigner: MutPtr<MutPtr<CertContext>>, phstore: MutPtr<Hcertstore>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(wszurl.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), pszhashid.rawAddress.toString(), ppara.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toInt(), pptscontext.rawAddress.toString(), pptssigner.rawAddress.toString(), phstore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr<CVoid>, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(hasync.toString(), pszparamoid.rawAddress.toString(), pvparam.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetHashParam(hhash.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr<CryptIntegerBlob>, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr<CVoid>, pvdata: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(pkeyidentifier.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress.toString(), pvreserved.rawAddress.toString(), pvdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(hkey.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr<UByte>, cbvaluedata: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), dwvaluetype.toInt(), pbvaluedata.rawAddress.toString(), cbvaluedata.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr<UByte>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProvParam(hprov.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderA(pszprovname.rawAddress.toString(), dwprovtype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(pszprovname.rawAddress.toString(), dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr<UInt>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(pszprovname.rawAddress.toString(), dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSetProviderW(pszprovname.rawAddress.toString(), dwprovtype.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr<CVoid>, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pvhashauxinfo: ConstPtr<CVoid>, pbencoded: MutPtr<UByte>, pcbencoded: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pvstructinfo.rawAddress.toString(), psignaturealgorithm.rawAddress.toString(), pvhashauxinfo.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignAndEncryptMessage(psignpara: ConstPtr<CryptSignMessagePara>, pencryptpara: ConstPtr<CryptEncryptMessagePara>, crecipientcert: UInt, rgprecipientcert: ConstPtr<ConstPtr<CertContext>>, pbtobesignedandencrypted: ConstPtr<UByte>, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr<UByte>, pcbsignedandencryptedblob: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(psignpara.rawAddress.toString(), pencryptpara.rawAddress.toString(), crecipientcert.toInt(), rgprecipientcert.rawAddress.toString(), pbtobesignedandencrypted.rawAddress.toString(), cbtobesignedandencrypted.toInt(), pbsignedandencryptedblob.rawAddress.toString(), pcbsignedandencryptedblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr<UByte>, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr<CryptAlgorithmIdentifier>, pvhashauxinfo: ConstPtr<CVoid>, pbsignature: MutPtr<UByte>, pcbsignature: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pbencodedtobesigned.rawAddress.toString(), cbencodedtobesigned.toInt(), psignaturealgorithm.rawAddress.toString(), pvhashauxinfo.rawAddress.toString(), pbsignature.rawAddress.toString(), pcbsignature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr<UByte>, pdwsiglen: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignHashA(hhash.toString(), dwkeyspec.toInt(), szdescription.rawAddress.toString(), dwflags.toInt(), pbsignature.rawAddress.toString(), pdwsiglen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr<UByte>, pdwsiglen: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignHashW(hhash.toString(), dwkeyspec.toInt(), szdescription.rawAddress.toString(), dwflags.toInt(), pbsignature.rawAddress.toString(), pdwsiglen.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignMessage(psignpara: ConstPtr<CryptSignMessagePara>, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr<ConstPtr<UByte>>, rgcbtobesigned: ConstPtr<UInt>, pbsignedblob: MutPtr<UByte>, pcbsignedblob: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignMessage(psignpara.rawAddress.toString(), fdetachedsignature, ctobesigned.toInt(), rgpbtobesigned.rawAddress.toString(), rgcbtobesigned.rawAddress.toString(), pbsignedblob.rawAddress.toString(), pcbsignedblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignMessageWithKey(psignpara: ConstPtr<CryptKeySignMessagePara>, pbtobesigned: ConstPtr<UByte>, cbtobesigned: UInt, pbsignedblob: MutPtr<UByte>, pcbsignedblob: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(psignpara.rawAddress.toString(), pbtobesigned.rawAddress.toString(), cbtobesigned.toInt(), pbsignedblob.rawAddress.toString(), pcbsignedblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr<UByte>, pcbbinary: MutPtr<UInt>, pdwskip: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(pszstring.rawAddress.toString(), cchstring.toInt(), dwflags.toInt(), pbbinary.rawAddress.toString(), pcbbinary.rawAddress.toString(), pdwskip.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr<UByte>, pcbbinary: MutPtr<UInt>, pdwskip: MutPtr<UInt>, pdwflags: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(pszstring.rawAddress.toString(), cchstring.toInt(), dwflags.toInt(), pbbinary.rawAddress.toString(), pcbbinary.rawAddress.toString(), pdwskip.rawAddress.toString(), pdwflags.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr<CVoid>, dwflags: UInt, pvreserved: ConstPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(hdefaultcontext.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnprotectData(pdatain: ConstPtr<CryptIntegerBlob>, ppszdatadescr: MutPtr<Pwstr>, poptionalentropy: ConstPtr<CryptIntegerBlob>, pvreserved: ConstPtr<CVoid>, ppromptstruct: ConstPtr<CryptprotectPromptstruct>, dwflags: UInt, pdataout: MutPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUnprotectData(pdatain.rawAddress.toString(), ppszdatadescr.rawAddress.toString(), poptionalentropy.rawAddress.toString(), pvreserved.rawAddress.toString(), ppromptstruct.rawAddress.toString(), dwflags.toInt(), pdataout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnprotectMemory(pdatain: MutPtr<CVoid>, cbdatain: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(pdatain.rawAddress.toString(), cbdatain.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pwszdll.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterOIDInfo(pinfo: ConstPtr<CryptOidInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(pinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr<UInt>, pdwfailurecount: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(poldsid.rawAddress.toString(), pwszoldpassword.rawAddress.toString(), dwflags.toInt(), pdwsuccesscount.rawAddress.toString(), pdwfailurecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr<UByte>, cbencoded: UInt, ppublickey: ConstPtr<CertPublicKeyInfo>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(hcryptprov.toString(), dwcertencodingtype.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), ppublickey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr<CVoid>, dwissuertype: UInt, pvissuer: ConstPtr<CVoid>, dwflags: CryptVerifyCertFlags, pvextra: MutPtr<CVoid>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(hcryptprov.toString(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress.toString(), dwissuertype.toInt(), pvissuer.rawAddress.toString(), dwflags.toInt(), pvextra.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr<CryptHashMessagePara>, pbdetachedhashblob: ConstPtr<UByte>, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr<ConstPtr<UByte>>, rgcbtobehashed: ConstPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(phashpara.rawAddress.toString(), pbdetachedhashblob.rawAddress.toString(), cbdetachedhashblob.toInt(), ctobehashed.toInt(), rgpbtobehashed.rawAddress.toString(), rgcbtobehashed.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr<UByte>, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr<ConstPtr<UByte>>, rgcbtobesigned: ConstPtr<UInt>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbdetachedsignblob.rawAddress.toString(), cbdetachedsignblob.toInt(), ctobesigned.toInt(), rgpbtobesigned.rawAddress.toString(), rgcbtobesigned.rawAddress.toString(), ppsignercert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageHash(phashpara: ConstPtr<CryptHashMessagePara>, pbhashedblob: ConstPtr<UByte>, cbhashedblob: UInt, pbtobehashed: MutPtr<UByte>, pcbtobehashed: MutPtr<UInt>, pbcomputedhash: MutPtr<UByte>, pcbcomputedhash: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(phashpara.rawAddress.toString(), pbhashedblob.rawAddress.toString(), cbhashedblob.toInt(), pbtobehashed.rawAddress.toString(), pcbtobehashed.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageSignature(pverifypara: ConstPtr<CryptVerifyMessagePara>, dwsignerindex: UInt, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>, ppsignercert: MutPtr<MutPtr<CertContext>>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt(), pbdecoded.rawAddress.toString(), pcbdecoded.rawAddress.toString(), ppsignercert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr<CryptKeyVerifyMessagePara>, ppublickeyinfo: ConstPtr<CertPublicKeyInfo>, pbsignedblob: ConstPtr<UByte>, cbsignedblob: UInt, pbdecoded: MutPtr<UByte>, pcbdecoded: MutPtr<UInt>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(pverifypara.rawAddress.toString(), ppublickeyinfo.rawAddress.toString(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt(), pbdecoded.rawAddress.toString(), pcbdecoded.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr<UByte>, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(hhash.toString(), pbsignature.rawAddress.toString(), dwsiglen.toInt(), hpubkey.toString(), szdescription.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr<UByte>, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(hhash.toString(), pbsignature.rawAddress.toString(), dwsiglen.toInt(), hpubkey.toString(), szdescription.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr<UByte>, cbtscontentinfo: UInt, pbdata: ConstPtr<UByte>, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr<MutPtr<CryptTimestampContext>>, pptssigner: MutPtr<MutPtr<CertContext>>, phstore: MutPtr<Hcertstore>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(pbtscontentinfo.rawAddress.toString(), cbtscontentinfo.toInt(), pbdata.rawAddress.toString(), cbdata.toInt(), hadditionalstore.rawAddress.toString(), pptscontext.rawAddress.toString(), pptssigner.rawAddress.toString(), phstore.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlAddObject(hsignatureorobject: ConstPtr<CVoid>, dwflags: UInt, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, ppobject: MutPtr<MutPtr<CryptXmlObject>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(hsignatureorobject.rawAddress.toString(), dwflags.toInt(), rgproperty.rawAddress.toString(), cproperty.toInt(), pencoded.rawAddress.toString(), ppobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlClose(hcryptxml: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlClose(hcryptxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlCreateReference(hcryptxml: ConstPtr<CVoid>, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr<CryptXmlAlgorithm>, ctransform: UInt, rgtransform: ConstPtr<CryptXmlAlgorithm>, phreference: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(hcryptxml.rawAddress.toString(), dwflags.toInt(), wszid.rawAddress.toString(), wszuri.rawAddress.toString(), wsztype.rawAddress.toString(), pdigestmethod.rawAddress.toString(), ctransform.toInt(), rgtransform.rawAddress.toString(), phreference.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlDigestReference(hreference: ConstPtr<CVoid>, dwflags: UInt, pdataproviderin: ConstPtr<CryptXmlDataProvider>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(hreference.rawAddress.toString(), dwflags.toInt(), pdataproviderin.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlEncode(hcryptxml: ConstPtr<CVoid>, dwcharset: CryptXmlCharset, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pvcallbackstate: MutPtr<CVoid>, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlEncode(hcryptxml.rawAddress.toString(), dwcharset, rgproperty.rawAddress.toString(), cproperty.toInt(), pvcallbackstate.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr<CVoid>, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr<CVoid>, dwgroupid: UInt, dwflags: UInt): MutPtr<CryptXmlAlgorithmInfo> =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), pvfindby.rawAddress.toString(), dwgroupid.toInt(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr<CryptXmlAlgorithm>, dwflags: CryptXmlFlags, ppalginfo: MutPtr<MutPtr<CryptXmlAlgorithmInfo>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(pxmlalgorithm.rawAddress.toString(), dwflags.toInt(), ppalginfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetDocContext(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlDocCtxt>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(hcryptxml.rawAddress.toString(), ppstruct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetReference(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlReference>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(hcryptxml.rawAddress.toString(), ppstruct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetSignature(hcryptxml: ConstPtr<CVoid>, ppstruct: MutPtr<MutPtr<CryptXmlSignature>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(hcryptxml.rawAddress.toString(), ppstruct.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetStatus(hcryptxml: ConstPtr<CVoid>, pstatus: MutPtr<CryptXmlStatus>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(hcryptxml.rawAddress.toString(), pstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetTransforms(ppconfig: MutPtr<MutPtr<CryptXmlTransformChainConfig>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(ppconfig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr<CryptXmlKeyValue>, phkey: MutPtr<BcryptKeyHandle>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(dwflags.toInt(), pkeyvalue.rawAddress.toString(), phkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlOpenToDecode(pconfig: ConstPtr<CryptXmlTransformChainConfig>, dwflags: CryptXmlFlags, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, phcryptxml: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(pconfig.rawAddress.toString(), dwflags.toInt(), rgproperty.rawAddress.toString(), cproperty.toInt(), pencoded.rawAddress.toString(), phcryptxml.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlOpenToEncode(pconfig: ConstPtr<CryptXmlTransformChainConfig>, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr<CryptXmlProperty>, cproperty: UInt, pencoded: ConstPtr<CryptXmlBlob>, phsignature: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(pconfig.rawAddress.toString(), dwflags.toInt(), wszid.rawAddress.toString(), rgproperty.rawAddress.toString(), cproperty.toInt(), pencoded.rawAddress.toString(), phsignature.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlSetHMACSecret(hsignature: ConstPtr<CVoid>, pbsecret: ConstPtr<UByte>, cbsecret: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(hsignature.rawAddress.toString(), pbsecret.rawAddress.toString(), cbsecret.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlSign(hsignature: ConstPtr<CVoid>, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr<CVoid>, psignaturemethod: ConstPtr<CryptXmlAlgorithm>, pcanonicalization: ConstPtr<CryptXmlAlgorithm>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlSign(hsignature.rawAddress.toString(), hkey.toString(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, pvkeyinfospec.rawAddress.toString(), psignaturemethod.rawAddress.toString(), pcanonicalization.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlVerifySignature(hsignature: ConstPtr<CVoid>, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(hsignature.rawAddress.toString(), hkey.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decrypt(hcrypto: ConstPtr<InformationcardCryptoHandle>, foaep: Bool, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyDecrypt(hcrypto.rawAddress.toString(), foaep, cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encrypt(hcrypto: ConstPtr<InformationcardCryptoHandle>, foaep: Bool, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyEncrypt(hcrypto.rawAddress.toString(), foaep, cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCertsByIssuer(pcertchains: MutPtr<CertChain>, pcbcertchains: MutPtr<UInt>, pccertchains: MutPtr<UInt>, pbencodedissuername: ConstPtr<UByte>, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(pcertchains.rawAddress.toString(), pcbcertchains.rawAddress.toString(), pccertchains.rawAddress.toString(), pbencodedissuername.rawAddress.toString(), cbencodedissuername.toInt(), pwszpurpose.rawAddress.toString(), dwkeyspec.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeToken(pallocmemory: ConstPtr<GenericXmlToken>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyFreeToken(pallocmemory.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateDerivedKey(hcrypto: ConstPtr<InformationcardCryptoHandle>, cblabel: UInt, plabel: ConstPtr<UByte>, cbnonce: UInt, pnonce: ConstPtr<UByte>, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr<UInt>, ppkey: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(hcrypto.rawAddress.toString(), cblabel.toInt(), plabel.rawAddress.toString(), cbnonce.toInt(), pnonce.rawAddress.toString(), derivedkeylength.toInt(), offset.toInt(), algid.rawAddress.toString(), pcbkey.rawAddress.toString(), ppkey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptAsymmetricEncryptionFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr<CVoid>, pcbtoken: MutPtr<UInt>, pptoken: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetBrowserToken(dwparamtype.toInt(), pparam.rawAddress.toString(), pcbtoken.rawAddress.toString(), pptoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptCipherFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetCipherInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCryptoTransform(hsymmetriccrypto: ConstPtr<InformationcardCryptoHandle>, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr<UByte>, pphtransform: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptHashFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetHashInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptKeyDerivationFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<NcryptKeyStorageFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(pszprovidername.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyedHash(hsymmetriccrypto: ConstPtr<InformationcardCryptoHandle>, pphhash: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetKeyedHash(hsymmetriccrypto.rawAddress.toString(), pphhash.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptRngFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetRngInterface(pszprovidername.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr<MutPtr<NcryptSslFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetSChannelInterface(pszprovidername.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptSecretAgreementFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr<MutPtr<BcryptSignatureFunctionTable>>, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetSignatureInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr<PolicyElement>, securitytoken: MutPtr<MutPtr<GenericXmlToken>>, phprooftokencrypto: MutPtr<MutPtr<InformationcardCryptoHandle>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyGetToken(cpolicychain.toInt(), ppolicychain.rawAddress.toString(), securitytoken.rawAddress.toString(), phprooftokencrypto.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashCore(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyHashCore(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashFinal(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyHashFinal(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyImportInformationCard(filename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun manageCardSpace(): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyManageCardSpace() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(hdescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbclaimblob: MutPtr<UByte>, cbclaimblob: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), pparameterlist.rawAddress.toString(), pbclaimblob.rawAddress.toString(), cbclaimblob.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(hprovider.toString(), phkey.rawAddress.toString(), pszalgid.rawAddress.toString(), pszkeyname.rawAddress.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr<NcryptDescriptorHandle>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(pwszdescriptorstring.rawAddress.toString(), dwflags.toInt(), phdescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptDecrypt(hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(hsharedsecret.toString(), pwszkdf.rawAddress.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, ppaddinginfo: ConstPtr<CVoid>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptEncrypt(hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr<UInt>, ppalglist: MutPtr<MutPtr<NCryptAlgorithmName>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(hprovider.toString(), dwalgoperations.toInt(), pdwalgcount.rawAddress.toString(), ppalglist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr<MutPtr<NCryptKeyName>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(hprovider.toString(), pszscope.rawAddress.toString(), ppkeyname.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr<UInt>, ppproviderlist: MutPtr<MutPtr<NCryptProviderName>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(pdwprovidercount.rawAddress.toString(), ppproviderlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptExportKey(hkey.toString(), hexportkey.toString(), pszblobtype.rawAddress.toString(), pparameterlist.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFreeBuffer(pvinput: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(pvinput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: ObjectSecurityInformation): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptGetProperty(hobject.toString(), pszproperty.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr<NcryptAllocPara>, dwinfotype: UInt, ppvinfo: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(hdescriptor.rawAddress.toString(), pmempara.rawAddress.toString(), dwinfotype.toInt(), ppvinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr<BCryptBufferDesc>, phkey: MutPtr<NcryptKeyHandle>, pbdata: ConstPtr<UByte>, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptImportKey(hprovider.toString(), himportkey.toString(), pszblobtype.rawAddress.toString(), pparameterlist.rawAddress.toString(), phkey.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(hprovider.toString(), pszalgid.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr<BCryptBufferDesc>, pbderivedkey: MutPtr<UByte>, cbderivedkey: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(hkey.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr<Handle>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(hprovider.toString(), phevent.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptOpenKey(hprovider.toString(), phkey.rawAddress.toString(), pszkeyname.rawAddress.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptOpenStorageProvider(phprovider: MutPtr<NcryptProvHandle>, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(phprovider.rawAddress.toString(), pszprovidername.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr<UByte>, cbdata: UInt, pmempara: ConstPtr<NcryptAllocPara>, hwnd: Hwnd, ppbprotectedblob: MutPtr<MutPtr<UByte>>, pcbprotectedblob: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(hdescriptor.rawAddress.toString(), dwflags.toInt(), pbdata.rawAddress.toString(), cbdata.toInt(), pmempara.rawAddress.toString(), hwnd.rawAddress.toString(), ppbprotectedblob.rawAddress.toString(), pcbprotectedblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr<ULong>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(pwszname.rawAddress.toString(), pwszdescriptorstring.rawAddress.toString(), pcdescriptorstring.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(pwszname.rawAddress.toString(), pwszdescriptorstring.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr<NcryptSecretHandle>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(hprivkey.toString(), hpubkey.toString(), phagreedsecret.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptSetProperty(hobject.toString(), pszproperty.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: MutPtr<UByte>, cbsignature: UInt, pcbresult: MutPtr<UInt>, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptSignHash(hkey.toString(), ppaddinginfo.rawAddress.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamClose(hstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr<NcryptProtectStreamInfo>, phstream: MutPtr<NcryptStreamHandle>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(hdescriptor.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), pstreaminfo.rawAddress.toString(), phstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr<NcryptProtectStreamInfo>, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr<NcryptStreamHandle>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(pstreaminfo.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), phstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr<NcryptProtectStreamInfoEx>, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr<NcryptStreamHandle>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(pstreaminfo.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), phstream.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr<UByte>, cbdata: ULong, ffinal: Bool): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(hstream.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toString(), ffinal) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptTranslateHandle(phprovider: MutPtr<NcryptProvHandle>, phkey: MutPtr<NcryptKeyHandle>, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(phprovider.rawAddress.toString(), phkey.rawAddress.toString(), hlegacyprov.toString(), hlegacykey.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptUnprotectSecret(phdescriptor: MutPtr<NcryptDescriptorHandle>, dwflags: NcryptFlags, pbprotectedblob: ConstPtr<UByte>, cbprotectedblob: UInt, pmempara: ConstPtr<NcryptAllocPara>, hwnd: Hwnd, ppbdata: MutPtr<MutPtr<UByte>>, pcbdata: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(phdescriptor.rawAddress.toString(), dwflags.toInt(), pbprotectedblob.rawAddress.toString(), cbprotectedblob.toInt(), pmempara.rawAddress.toString(), hwnd.rawAddress.toString(), ppbdata.rawAddress.toString(), pcbdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbclaimblob: ConstPtr<UByte>, cbclaimblob: UInt, poutput: MutPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), pparameterlist.rawAddress.toString(), pbclaimblob.rawAddress.toString(), cbclaimblob.toInt(), poutput.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr<CVoid>, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(hkey.toString(), ppaddinginfo.rawAddress.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyPFXExportCertStore(hstore.rawAddress.toString(), ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr<CryptIntegerBlob>, szpassword: Pcwstr, pvpara: ConstPtr<CVoid>, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(hstore.rawAddress.toString(), ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), pvpara.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXImportCertStore(ppfx: ConstPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityCryptographyPFXImportCertStore(ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), dwflags.toInt()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXIsPFXBlob(ppfx: ConstPtr<CryptIntegerBlob>): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(ppfx.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXVerifyPassword(ppfx: ConstPtr<CryptIntegerBlob>, szpassword: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPrng(pbdata: MutPtr<UByte>, cbdata: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyProcessPrng(pbdata.rawAddress.toString(), cbdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signError(): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignError() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signHash(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbhash: UInt, phash: ConstPtr<UByte>, hashalgoid: Pcwstr, pcbsig: MutPtr<UInt>, ppsig: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignHash(hcrypto.rawAddress.toString(), cbhash.toInt(), phash.rawAddress.toString(), hashalgoid.rawAddress.toString(), pcbsig.rawAddress.toString(), ppsig.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerFreeSignerContext(psignercontext: ConstPtr<SignerContext>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(psignercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSign(psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerSign(psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerSignEx(dwflags.toInt(), psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, preserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerSignEx2(dwflags.toInt(), psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), dwtimestampflags.toInt(), psztimestampalgorithmoid.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString(), pcryptopolicy.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, psignercert: ConstPtr<SignerCert>, psignatureinfo: ConstPtr<SignerSignatureInfo>, pproviderinfo: ConstPtr<SignerProviderInfo>, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, pdigestsigninfo: ConstPtr<SignerDigestSignInfo>, preserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerSignEx3(dwflags.toInt(), psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), dwtimestampflags.toInt(), psztimestampalgorithmoid.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString(), pcryptopolicy.rawAddress.toString(), pdigestsigninfo.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStamp(psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStamp(psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStampEx(dwflags.toInt(), psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(dwflags.toInt(), psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), dwalgid.toInt(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr<SignerSubjectInfo>, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr<CryptAttributes>, psipdata: ConstPtr<CVoid>, ppsignercontext: MutPtr<MutPtr<SignerContext>>, pcryptopolicy: ConstPtr<CertStrongSignPara>, preserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), pszalgorithmoid.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString(), pcryptopolicy.rawAddress.toString(), preserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslChangeNotify(hevent.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), pszalgid.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr<UByte>, cbrandoms: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(hsslprovider.toString(), hmasterkey.toString(), pbrandoms.rawAddress.toString(), cbrandoms.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslComputeSessionHash(hsslprovider.toString(), hhandshakehash.toString(), dwprotocol.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr<NcryptHashHandle>, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(hsslprovider.toString(), phhandshakehash.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pszhashalgid.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr<UByte>, cbparams: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(hsslprovider.toString(), phephemeralkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), pbparams.rawAddress.toString(), cbparams.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr<NcryptHashHandle>, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(hsslprovider.toString(), phhandshakehash.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, sequencenumber: ULong, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslDecryptPacket(hsslprovider.toString(), hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), sequencenumber.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr<NcryptHashHandle>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(hsslprovider.toString(), htranscripthash.toString(), phtranscripthash.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslEncryptPacket(hsslprovider.toString(), hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), sequencenumber.toString(), dwcontenttype.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr<MutPtr<NcryptSslCipherSuite>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(hsslprovider.toString(), hprivatekey.toString(), ppciphersuite.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr<MutPtr<NcryptSslCipherSuiteEx>>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(hsslprovider.toString(), hprivatekey.toString(), ppciphersuite.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr<UInt>, ppecccurve: MutPtr<MutPtr<NcryptSslEccCurve>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslEnumEccCurves(hsslprovider.toString(), pecccurvecount.rawAddress.toString(), ppecccurve.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumProtocolProviders(pdwprovidercount: MutPtr<UInt>, ppproviderlist: MutPtr<MutPtr<NCryptProviderName>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(pdwprovidercount.rawAddress.toString(), ppproviderlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExpandBinderKey(hsslprovider.toString(), hearlykey.toString(), phbinderkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), phexportermasterkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr<UByte>, cbticketnonce: UInt, phpresharedkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(hsslprovider.toString(), hresumptionmasterkey.toString(), pbticketnonce.rawAddress.toString(), cbticketnonce.toInt(), phpresharedkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(hsslprovider.toString(), hmasterkey.toString(), hhashvalue.toString(), phresumptionmasterkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr<NcryptKeyHandle>, phservertraffickey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), phclienttraffickey.rawAddress.toString(), phservertraffickey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExpandWriteKey(hsslprovider.toString(), hbasetraffickey.toString(), phwritekey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExportKey(hsslprovider.toString(), hkey.toString(), pszblobtype.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr<UByte>, cbrandoms: UInt, pbcontextvalue: ConstPtr<UByte>, cbcontextvalue: UShort, pboutput: MutPtr<UByte>, cboutput: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(hsslprovider.toString(), hmasterkey.toString(), slabel.rawAddress.toString(), pbrandoms.rawAddress.toString(), cbrandoms.toInt(), pbcontextvalue.rawAddress.toString(), cbcontextvalue.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(hsslprovider.toString(), hpresharedkey.toString(), phearlykey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), hearlykey.toString(), phhandshakekey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslExtractMasterKey(hsslprovider.toString(), hhandshakekey.toString(), phmasterkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeBuffer(pvinput: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslFreeBuffer(pvinput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslFreeObject(hobject.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), phmasterkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pboutput: MutPtr<UByte>, cboutput: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(hsslprovider.toString(), hpublickey.toString(), phpremasterkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr<NcryptKeyHandle>, phwritekey: MutPtr<NcryptKeyHandle>, pparameterlist: ConstPtr<BCryptBufferDesc>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(hsslprovider.toString(), hmasterkey.toString(), phreadkey.rawAddress.toString(), phwritekey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), szprfhash.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr<MutPtr<UByte>>, pcboutput: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslGetKeyProperty(hkey.toString(), pszproperty.rawAddress.toString(), ppboutput.rawAddress.toString(), pcboutput.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr<MutPtr<UByte>>, pcboutput: MutPtr<UInt>, ppenumstate: MutPtr<MutPtr<CVoid>>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslGetProviderProperty(hsslprovider.toString(), pszproperty.rawAddress.toString(), ppboutput.rawAddress.toString(), pcboutput.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr<UByte>, cbinput: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslHashHandshake(hsslprovider.toString(), hhandshakehash.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr<NcryptKeyHandle>, pszblobtype: Pcwstr, pbkeyblob: ConstPtr<UByte>, cbkeyblob: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslImportKey(hsslprovider.toString(), phkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), pbkeyblob.rawAddress.toString(), cbkeyblob.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr<NcryptKeyHandle>, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr<BCryptBufferDesc>, pbencryptedkey: ConstPtr<UByte>, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslImportMasterKey(hsslprovider.toString(), hprivatekey.toString(), phmasterkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), pbencryptedkey.rawAddress.toString(), cbencryptedkey.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr<NcryptSslCipherLengths>, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pcipherlengths.rawAddress.toString(), cbcipherlengths.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr<NcryptSslCipherSuite>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pciphersuite.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr<NcryptKeyHandle>, pcertcontext: ConstPtr<CertContext>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(hsslprovider.toString(), phprivatekey.rawAddress.toString(), pcertcontext.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslOpenProvider(phsslprovider: MutPtr<NcryptProvHandle>, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslOpenProvider(phsslprovider.rawAddress.toString(), pszprovidername.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: MutPtr<UByte>, cbsignature: UInt, pcbresult: MutPtr<UInt>, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslSignHash(hsslprovider.toString(), hprivatekey.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr<UByte>, cbhashvalue: UInt, pbsignature: ConstPtr<UByte>, cbsignature: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySslVerifySignature(hsslprovider.toString(), hpublickey.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPrng(pbrandomdata: MutPtr<UByte>, cbrandomdata: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographySystemPrng(pbrandomdata.rawAddress.toString(), cbrandomdata.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformBlock(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyTransformBlock(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformFinalBlock(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbindata: UInt, pindata: ConstPtr<UByte>, pcboutdata: MutPtr<UInt>, ppoutdata: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyTransformFinalBlock(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyHash(hcrypto: ConstPtr<InformationcardCryptoHandle>, cbhash: UInt, phash: ConstPtr<UByte>, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr<UByte>, pfverified: MutPtr<Bool>): Hresult =
    if (windowsWin32SecurityCryptographyNapiAvailable) wasmWindowssysWindowsWin32SecurityCryptographyVerifyHash(hcrypto.rawAddress.toString(), cbhash.toInt(), phash.rawAddress.toString(), hashalgoid.rawAddress.toString(), cbsig.toInt(), psig.rawAddress.toString(), pfverified.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
