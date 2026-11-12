@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.data.rightsmanagement

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DataRightsmanagementNapiAddon(): Boolean

private val windowsWin32DataRightsmanagementNapiAvailable: Boolean = initWindowsWin32DataRightsmanagementNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(p0: Int, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMActivate(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMActivate(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMAddLicense(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMAddLicense(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(p0: Int, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMAttest(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMAttest(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(p0: Int, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMClearAllRights(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMClearAllRights(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCloseHandle(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseHandle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCloseSession(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseSession(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(p0: Int, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(p0: Int, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(p0: String, p1: String, p2: String, p3: String, p4: Int, p5: String, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateRight(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateRight(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMCreateUser(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateUser(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDecode(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDecode(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDecrypt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDecrypt(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMEncode(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMEncode(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMEncrypt(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMEncrypt(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetInfo(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(p0: Int, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetMetaData(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetMetaData(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(p0: Int, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(p0: Int, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(p0: Int, p1: Int, p2: Int, p3: String, p4: Int, p5: String, p6: String, p7: Int, p8: Int, p9: String, p10: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetTime(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetTime(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(p0: Int, p1: String, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: String, p11: String, p12: String, p13: String, p14: String, p15: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUserRights(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUserRights(p0: Int, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMGetUsers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUsers(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMIsActivated(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMIsActivated(p0: Int, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(p0: Int, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMRegisterContent(p0)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMRegisterContent(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(p0: Int, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(p0: Int, p1: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMRepair()")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMRepair(): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(p0: Int, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(p0: Int, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(p0, p1)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(p0: Int, p1: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetMetaData(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetMetaData(p0: Int, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(p0: Int, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(p0: Int, p1: Int, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(p0: Int, p1: Int, p2: Int, p3: Int, p4: String, p5: String, p6: String, p7: String, p8: String, p9: String, p10: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DataRightsmanagementDRMVerify(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DataRightsmanagementDRMVerify(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: String): Int

public actual fun dRMAcquireAdvisories(hlicensestorage: UInt, wszlicense: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMAcquireAdvisories(hlicensestorage.toInt(), wszlicense.rawAddress.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAcquireIssuanceLicenseTemplate(hclient: UInt, uflags: UInt, pvreserved: MutPtr, ctemplates: UInt, pwsztemplateids: ConstPtr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMAcquireIssuanceLicenseTemplate(hclient.toInt(), uflags.toInt(), pvreserved.rawAddress.toString(), ctemplates.toInt(), pwsztemplateids.rawAddress.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAcquireLicense(hsession: UInt, uflags: UInt, wszgroupidentitycredential: Pcwstr, wszrequestedrights: Pcwstr, wszcustomdata: Pcwstr, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMAcquireLicense(hsession.toInt(), uflags.toInt(), wszgroupidentitycredential.rawAddress.toString(), wszrequestedrights.rawAddress.toString(), wszcustomdata.rawAddress.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMActivate(hclient: UInt, uflags: UInt, ulangid: UInt, pactservinfo: MutPtr, pvcontext: MutPtr, hparentwnd: Hwnd): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMActivate(hclient.toInt(), uflags.toInt(), ulangid.toInt(), pactservinfo.rawAddress.toString(), pvcontext.rawAddress.toString(), hparentwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAddLicense(hlicensestorage: UInt, uflags: UInt, wszlicense: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMAddLicense(hlicensestorage.toInt(), uflags.toInt(), wszlicense.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAddRightWithUser(hissuancelicense: UInt, hright: UInt, huser: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMAddRightWithUser(hissuancelicense.toInt(), hright.toInt(), huser.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMAttest(henablingprincipal: UInt, wszdata: Pcwstr, etype: Drmattesttype, pcattestedblob: MutPtr, wszattestedblob: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMAttest(henablingprincipal.toInt(), wszdata.rawAddress.toString(), etype, pcattestedblob.rawAddress.toString(), wszattestedblob.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCheckSecurity(henv: UInt, clevel: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCheckSecurity(henv.toInt(), clevel.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMClearAllRights(hissuancelicense: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMClearAllRights(hissuancelicense.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseEnvironmentHandle(henv: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseEnvironmentHandle(henv.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseHandle(handle: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseHandle(handle.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMClosePubHandle(hpub: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMClosePubHandle(hpub.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseQueryHandle(hquery: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseQueryHandle(hquery.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCloseSession(hsession: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCloseSession(hsession.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMConstructCertificateChain(ccertificates: UInt, rgwszcertificates: ConstPtr, pcchain: MutPtr, wszchain: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMConstructCertificateChain(ccertificates.toInt(), rgwszcertificates.rawAddress.toString(), pcchain.rawAddress.toString(), wszchain.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateBoundLicense(henv: UInt, pparams: MutPtr, wszlicensechain: Pcwstr, phboundlicense: MutPtr, pherrorlog: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateBoundLicense(henv.toInt(), pparams.rawAddress.toString(), wszlicensechain.rawAddress.toString(), phboundlicense.rawAddress.toString(), pherrorlog.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateClientSession(pfncallback: Drmcallback, ucallbackversion: UInt, wszgroupidprovidertype: Pcwstr, wszgroupid: Pcwstr, phclient: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateClientSession(0L.toString(), ucallbackversion.toInt(), wszgroupidprovidertype.rawAddress.toString(), wszgroupid.rawAddress.toString(), phclient.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingBitsDecryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phdecryptor: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsDecryptor(hboundlicense.toInt(), wszright.rawAddress.toString(), hauxlib.toInt(), wszauxplug.rawAddress.toString(), phdecryptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingBitsEncryptor(hboundlicense: UInt, wszright: Pcwstr, hauxlib: UInt, wszauxplug: Pcwstr, phencryptor: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateEnablingBitsEncryptor(hboundlicense.toInt(), wszright.rawAddress.toString(), hauxlib.toInt(), wszauxplug.rawAddress.toString(), phencryptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateEnablingPrincipal(henv: UInt, hlibrary: UInt, wszobject: Pcwstr, pidprincipal: MutPtr, wszcredentials: Pcwstr, phenablingprincipal: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateEnablingPrincipal(henv.toInt(), hlibrary.toInt(), wszobject.rawAddress.toString(), pidprincipal.rawAddress.toString(), wszcredentials.rawAddress.toString(), phenablingprincipal.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateIssuanceLicense(psttimefrom: MutPtr, psttimeuntil: MutPtr, wszreferralinfoname: Pcwstr, wszreferralinfourl: Pcwstr, howner: UInt, wszissuancelicense: Pcwstr, hboundlicense: UInt, phissuancelicense: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateIssuanceLicense(psttimefrom.rawAddress.toString(), psttimeuntil.rawAddress.toString(), wszreferralinfoname.rawAddress.toString(), wszreferralinfourl.rawAddress.toString(), howner.toInt(), wszissuancelicense.rawAddress.toString(), hboundlicense.toInt(), phissuancelicense.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateLicenseStorageSession(henv: UInt, hdefaultlibrary: UInt, hclient: UInt, uflags: UInt, wszissuancelicense: Pcwstr, phlicensestorage: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateLicenseStorageSession(henv.toInt(), hdefaultlibrary.toInt(), hclient.toInt(), uflags.toInt(), wszissuancelicense.rawAddress.toString(), phlicensestorage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateRight(wszrightname: Pcwstr, pstfrom: MutPtr, pstuntil: MutPtr, cextendedinfo: UInt, pwszextendedinfoname: ConstPtr, pwszextendedinfovalue: ConstPtr, phright: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateRight(wszrightname.rawAddress.toString(), pstfrom.rawAddress.toString(), pstuntil.rawAddress.toString(), cextendedinfo.toInt(), pwszextendedinfoname.rawAddress.toString(), pwszextendedinfovalue.rawAddress.toString(), phright.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMCreateUser(wszusername: Pcwstr, wszuserid: Pcwstr, wszuseridtype: Pcwstr, phuser: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMCreateUser(wszusername.rawAddress.toString(), wszuserid.rawAddress.toString(), wszuseridtype.rawAddress.toString(), phuser.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDecode(wszalgid: Pcwstr, wszencodedstring: Pcwstr, pudecodeddatalen: MutPtr, pbdecodeddata: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDecode(wszalgid.rawAddress.toString(), wszencodedstring.rawAddress.toString(), pudecodeddatalen.rawAddress.toString(), pbdecodeddata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDeconstructCertificateChain(wszchain: Pcwstr, iwhich: UInt, pccert: MutPtr, wszcert: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDeconstructCertificateChain(wszchain.rawAddress.toString(), iwhich.toInt(), pccert.rawAddress.toString(), wszcert.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDecrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr, pcnumoutbytes: MutPtr, pboutdata: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDecrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.rawAddress.toString(), pcnumoutbytes.rawAddress.toString(), pboutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDeleteLicense(hsession: UInt, wszlicenseid: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDeleteLicense(hsession.toInt(), wszlicenseid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateEnvironmentHandle(htocopy: UInt, phcopy: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicateEnvironmentHandle(htocopy.toInt(), phcopy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateHandle(htocopy: UInt, phcopy: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicateHandle(htocopy.toInt(), phcopy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicatePubHandle(hpubin: UInt, phpubout: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicatePubHandle(hpubin.toInt(), phpubout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMDuplicateSession(hsessionin: UInt, phsessionout: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMDuplicateSession(hsessionin.toInt(), phsessionout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEncode(wszalgid: Pcwstr, udatalen: UInt, pbdecodeddata: MutPtr, puencodedstringlen: MutPtr, wszencodedstring: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMEncode(wszalgid.rawAddress.toString(), udatalen.toInt(), pbdecodeddata.rawAddress.toString(), puencodedstringlen.rawAddress.toString(), wszencodedstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEncrypt(hcryptoprovider: UInt, iposition: UInt, cnuminbytes: UInt, pbindata: MutPtr, pcnumoutbytes: MutPtr, pboutdata: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMEncrypt(hcryptoprovider.toInt(), iposition.toInt(), cnuminbytes.toInt(), pbindata.rawAddress.toString(), pcnumoutbytes.rawAddress.toString(), pboutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMEnumerateLicense(hsession: UInt, uflags: UInt, uindex: UInt, pfsharedflag: MutPtr, pucertificatedatalen: MutPtr, wszcertificatedata: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMEnumerateLicense(hsession.toInt(), uflags.toInt(), uindex.toInt(), pfsharedflag.rawAddress.toString(), pucertificatedatalen.rawAddress.toString(), wszcertificatedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetApplicationSpecificData(hissuancelicense: UInt, uindex: UInt, punamelength: MutPtr, wszname: Pwstr, puvaluelength: MutPtr, wszvalue: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetApplicationSpecificData(hissuancelicense.toInt(), uindex.toInt(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), puvaluelength.rawAddress.toString(), wszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseAttribute(hqueryroot: UInt, wszattribute: Pcwstr, iwhich: UInt, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttribute(hqueryroot.toInt(), wszattribute.rawAddress.toString(), iwhich.toInt(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseAttributeCount(hqueryroot: UInt, wszattribute: Pcwstr, pcattributes: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseAttributeCount(hqueryroot.toInt(), wszattribute.rawAddress.toString(), pcattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iwhich: UInt, phsubobject: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), iwhich.toInt(), phsubobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetBoundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetBoundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), pcsubobjects.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetCertificateChainCount(wszchain: Pcwstr, pccertcount: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetCertificateChainCount(wszchain.rawAddress.toString(), pccertcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetClientVersion(pdrmclientversioninfo: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetClientVersion(pdrmclientversioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetEnvironmentInfo(handle: UInt, wszattribute: Pcwstr, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetEnvironmentInfo(handle.toInt(), wszattribute.rawAddress.toString(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetInfo(handle: UInt, wszattribute: Pcwstr, peencoding: ConstPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetInfo(handle.toInt(), wszattribute.rawAddress.toString(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIntervalTime(hissuancelicense: UInt, pcdays: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetIntervalTime(hissuancelicense.toInt(), pcdays.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIssuanceLicenseInfo(hissuancelicense: UInt, psttimefrom: MutPtr, psttimeuntil: MutPtr, uflags: UInt, pudistributionpointnamelength: MutPtr, wszdistributionpointname: Pwstr, pudistributionpointurllength: MutPtr, wszdistributionpointurl: Pwstr, phowner: MutPtr, pfofficial: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseInfo(hissuancelicense.toInt(), psttimefrom.rawAddress.toString(), psttimeuntil.rawAddress.toString(), uflags.toInt(), pudistributionpointnamelength.rawAddress.toString(), wszdistributionpointname.rawAddress.toString(), pudistributionpointurllength.rawAddress.toString(), wszdistributionpointurl.rawAddress.toString(), phowner.rawAddress.toString(), pfofficial.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetIssuanceLicenseTemplate(hissuancelicense: UInt, puissuancelicensetemplatelength: MutPtr, wszissuancelicensetemplate: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetIssuanceLicenseTemplate(hissuancelicense.toInt(), puissuancelicensetemplatelength.rawAddress.toString(), wszissuancelicensetemplate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetMetaData(hissuancelicense: UInt, pucontentidlength: MutPtr, wszcontentid: Pwstr, pucontentidtypelength: MutPtr, wszcontentidtype: Pwstr, puskuidlength: MutPtr, wszskuid: Pwstr, puskuidtypelength: MutPtr, wszskuidtype: Pwstr, pucontenttypelength: MutPtr, wszcontenttype: Pwstr, pucontentnamelength: MutPtr, wszcontentname: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetMetaData(hissuancelicense.toInt(), pucontentidlength.rawAddress.toString(), wszcontentid.rawAddress.toString(), pucontentidtypelength.rawAddress.toString(), wszcontentidtype.rawAddress.toString(), puskuidlength.rawAddress.toString(), wszskuid.rawAddress.toString(), puskuidtypelength.rawAddress.toString(), wszskuidtype.rawAddress.toString(), pucontenttypelength.rawAddress.toString(), wszcontenttype.rawAddress.toString(), pucontentnamelength.rawAddress.toString(), wszcontentname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetNameAndDescription(hissuancelicense: UInt, uindex: UInt, pulcid: MutPtr, punamelength: MutPtr, wszname: Pwstr, pudescriptionlength: MutPtr, wszdescription: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetNameAndDescription(hissuancelicense.toInt(), uindex.toInt(), pulcid.rawAddress.toString(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), pudescriptionlength.rawAddress.toString(), wszdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetOwnerLicense(hissuancelicense: UInt, puownerlicenselength: MutPtr, wszownerlicense: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetOwnerLicense(hissuancelicense.toInt(), puownerlicenselength.rawAddress.toString(), wszownerlicense.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetProcAddress(hlibrary: UInt, wszprocname: Pcwstr, ppfnprocaddress: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetProcAddress(hlibrary.toInt(), wszprocname.rawAddress.toString(), ppfnprocaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRevocationPoint(hissuancelicense: UInt, puidlength: MutPtr, wszid: Pwstr, puidtypelength: MutPtr, wszidtype: Pwstr, puurllength: MutPtr, wszrl: Pwstr, pstfrequency: MutPtr, punamelength: MutPtr, wszname: Pwstr, pupublickeylength: MutPtr, wszpublickey: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetRevocationPoint(hissuancelicense.toInt(), puidlength.rawAddress.toString(), wszid.rawAddress.toString(), puidtypelength.rawAddress.toString(), wszidtype.rawAddress.toString(), puurllength.rawAddress.toString(), wszrl.rawAddress.toString(), pstfrequency.rawAddress.toString(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), pupublickeylength.rawAddress.toString(), wszpublickey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRightExtendedInfo(hright: UInt, uindex: UInt, puextendedinfonamelength: MutPtr, wszextendedinfoname: Pwstr, puextendedinfovaluelength: MutPtr, wszextendedinfovalue: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetRightExtendedInfo(hright.toInt(), uindex.toInt(), puextendedinfonamelength.rawAddress.toString(), wszextendedinfoname.rawAddress.toString(), puextendedinfovaluelength.rawAddress.toString(), wszextendedinfovalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetRightInfo(hright: UInt, purightnamelength: MutPtr, wszrightname: Pwstr, pstfrom: MutPtr, pstuntil: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetRightInfo(hright.toInt(), purightnamelength.rawAddress.toString(), wszrightname.rawAddress.toString(), pstfrom.rawAddress.toString(), pstuntil.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSecurityProvider(uflags: UInt, putypelen: MutPtr, wsztype: Pwstr, pupathlen: MutPtr, wszpath: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetSecurityProvider(uflags.toInt(), putypelen.rawAddress.toString(), wsztype.rawAddress.toString(), pupathlen.rawAddress.toString(), wszpath.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetServiceLocation(hclient: UInt, uservicetype: UInt, uservicelocation: UInt, wszissuancelicense: Pcwstr, puserviceurllength: MutPtr, wszserviceurl: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetServiceLocation(hclient.toInt(), uservicetype.toInt(), uservicelocation.toInt(), wszissuancelicense.rawAddress.toString(), puserviceurllength.rawAddress.toString(), wszserviceurl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSignedIssuanceLicense(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: MutPtr, cbsymkey: UInt, wszsymkeytype: Pcwstr, wszclientlicensorcertificate: Pcwstr, pfncallback: Drmcallback, wszurl: Pcwstr, pvcontext: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicense(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.rawAddress.toString(), cbsymkey.toInt(), wszsymkeytype.rawAddress.toString(), wszclientlicensorcertificate.rawAddress.toString(), 0L.toString(), wszurl.rawAddress.toString(), pvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetSignedIssuanceLicenseEx(henv: UInt, hissuancelicense: UInt, uflags: UInt, pbsymkey: ConstPtr, cbsymkey: UInt, wszsymkeytype: Pcwstr, pvreserved: ConstPtr, henablingprincipal: UInt, hboundlicenseclc: UInt, pfncallback: Drmcallback, pvcontext: ConstPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetSignedIssuanceLicenseEx(henv.toInt(), hissuancelicense.toInt(), uflags.toInt(), pbsymkey.rawAddress.toString(), cbsymkey.toInt(), wszsymkeytype.rawAddress.toString(), pvreserved.rawAddress.toString(), henablingprincipal.toInt(), hboundlicenseclc.toInt(), 0L.toString(), pvcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetTime(henv: UInt, etimeridtype: Drmtimetype, potimeobject: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetTime(henv.toInt(), etimeridtype, potimeobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseAttribute(hqueryroot: UInt, wszattributetype: Pcwstr, iwhich: UInt, peencoding: MutPtr, pcbuffer: MutPtr, pbbuffer: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttribute(hqueryroot.toInt(), wszattributetype.rawAddress.toString(), iwhich.toInt(), peencoding.rawAddress.toString(), pcbuffer.rawAddress.toString(), pbbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseAttributeCount(hqueryroot: UInt, wszattributetype: Pcwstr, pcattributes: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseAttributeCount(hqueryroot.toInt(), wszattributetype.rawAddress.toString(), pcattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseObject(hqueryroot: UInt, wszsubobjecttype: Pcwstr, iindex: UInt, phsubquery: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObject(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), iindex.toInt(), phsubquery.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUnboundLicenseObjectCount(hqueryroot: UInt, wszsubobjecttype: Pcwstr, pcsubobjects: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUnboundLicenseObjectCount(hqueryroot.toInt(), wszsubobjecttype.rawAddress.toString(), pcsubobjects.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUsagePolicy(hissuancelicense: UInt, uindex: UInt, peusagepolicytype: MutPtr, pfexclusion: MutPtr, punamelength: MutPtr, wszname: Pwstr, puminversionlength: MutPtr, wszminversion: Pwstr, pumaxversionlength: MutPtr, wszmaxversion: Pwstr, pupublickeylength: MutPtr, wszpublickey: Pwstr, pudigestalgorithmlength: MutPtr, wszdigestalgorithm: Pwstr, pcbdigest: MutPtr, pbdigest: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUsagePolicy(hissuancelicense.toInt(), uindex.toInt(), peusagepolicytype.rawAddress.toString(), pfexclusion.rawAddress.toString(), punamelength.rawAddress.toString(), wszname.rawAddress.toString(), puminversionlength.rawAddress.toString(), wszminversion.rawAddress.toString(), pumaxversionlength.rawAddress.toString(), wszmaxversion.rawAddress.toString(), pupublickeylength.rawAddress.toString(), wszpublickey.rawAddress.toString(), pudigestalgorithmlength.rawAddress.toString(), wszdigestalgorithm.rawAddress.toString(), pcbdigest.rawAddress.toString(), pbdigest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUserInfo(huser: UInt, puusernamelength: MutPtr, wszusername: Pwstr, puuseridlength: MutPtr, wszuserid: Pwstr, puuseridtypelength: MutPtr, wszuseridtype: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUserInfo(huser.toInt(), puusernamelength.rawAddress.toString(), wszusername.rawAddress.toString(), puuseridlength.rawAddress.toString(), wszuserid.rawAddress.toString(), puuseridtypelength.rawAddress.toString(), wszuseridtype.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUserRights(hissuancelicense: UInt, huser: UInt, uindex: UInt, phright: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUserRights(hissuancelicense.toInt(), huser.toInt(), uindex.toInt(), phright.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMGetUsers(hissuancelicense: UInt, uindex: UInt, phuser: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMGetUsers(hissuancelicense.toInt(), uindex.toInt(), phuser.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMInitEnvironment(esecurityprovidertype: Drmsecurityprovidertype, especification: Drmspectype, wszsecurityprovider: Pcwstr, wszmanifestcredentials: Pcwstr, wszmachinecredentials: Pcwstr, phenv: MutPtr, phdefaultlibrary: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMInitEnvironment(esecurityprovidertype, especification, wszsecurityprovider.rawAddress.toString(), wszmanifestcredentials.rawAddress.toString(), wszmachinecredentials.rawAddress.toString(), phenv.rawAddress.toString(), phdefaultlibrary.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMIsActivated(hclient: UInt, uflags: UInt, pactservinfo: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMIsActivated(hclient.toInt(), uflags.toInt(), pactservinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMIsWindowProtected(hwnd: Hwnd, pfprotected: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMIsWindowProtected(hwnd.rawAddress.toString(), pfprotected.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMLoadLibrary(henv: UInt, especification: Drmspectype, wszlibraryprovider: Pcwstr, wszcredentials: Pcwstr, phlibrary: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMLoadLibrary(henv.toInt(), especification, wszlibraryprovider.rawAddress.toString(), wszcredentials.rawAddress.toString(), phlibrary.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMParseUnboundLicense(wszcertificate: Pcwstr, phqueryroot: MutPtr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMParseUnboundLicense(wszcertificate.rawAddress.toString(), phqueryroot.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterContent(fregister: Bool): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMRegisterContent(fregister) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterProtectedWindow(henv: UInt, hwnd: Hwnd): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMRegisterProtectedWindow(henv.toInt(), hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRegisterRevocationList(henv: UInt, wszrevocationlist: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMRegisterRevocationList(henv.toInt(), wszrevocationlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMRepair(): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMRepair() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetApplicationSpecificData(hissuancelicense: UInt, fdelete: Bool, wszname: Pcwstr, wszvalue: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetApplicationSpecificData(hissuancelicense.toInt(), fdelete, wszname.rawAddress.toString(), wszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetGlobalOptions(eglobaloptions: Drmglobaloptions, pvdata: MutPtr, dwlen: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetGlobalOptions(eglobaloptions, pvdata.rawAddress.toString(), dwlen.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetIntervalTime(hissuancelicense: UInt, cdays: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetIntervalTime(hissuancelicense.toInt(), cdays.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetMetaData(hissuancelicense: UInt, wszcontentid: Pcwstr, wszcontentidtype: Pcwstr, wszskuid: Pcwstr, wszskuidtype: Pcwstr, wszcontenttype: Pcwstr, wszcontentname: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetMetaData(hissuancelicense.toInt(), wszcontentid.rawAddress.toString(), wszcontentidtype.rawAddress.toString(), wszskuid.rawAddress.toString(), wszskuidtype.rawAddress.toString(), wszcontenttype.rawAddress.toString(), wszcontentname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetNameAndDescription(hissuancelicense: UInt, fdelete: Bool, lcid: UInt, wszname: Pcwstr, wszdescription: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetNameAndDescription(hissuancelicense.toInt(), fdelete, lcid.toInt(), wszname.rawAddress.toString(), wszdescription.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetRevocationPoint(hissuancelicense: UInt, fdelete: Bool, wszid: Pcwstr, wszidtype: Pcwstr, wszurl: Pcwstr, pstfrequency: MutPtr, wszname: Pcwstr, wszpublickey: Pcwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetRevocationPoint(hissuancelicense.toInt(), fdelete, wszid.rawAddress.toString(), wszidtype.rawAddress.toString(), wszurl.rawAddress.toString(), pstfrequency.rawAddress.toString(), wszname.rawAddress.toString(), wszpublickey.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMSetUsagePolicy(hissuancelicense: UInt, eusagepolicytype: DrmUsagepolicyType, fdelete: Bool, fexclusion: Bool, wszname: Pcwstr, wszminversion: Pcwstr, wszmaxversion: Pcwstr, wszpublickey: Pcwstr, wszdigestalgorithm: Pcwstr, pbdigest: MutPtr, cbdigest: UInt): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMSetUsagePolicy(hissuancelicense.toInt(), eusagepolicytype, fdelete, fexclusion, wszname.rawAddress.toString(), wszminversion.rawAddress.toString(), wszmaxversion.rawAddress.toString(), wszpublickey.rawAddress.toString(), wszdigestalgorithm.rawAddress.toString(), pbdigest.rawAddress.toString(), cbdigest.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dRMVerify(wszdata: Pcwstr, pcattesteddata: MutPtr, wszattesteddata: Pwstr, petype: MutPtr, pcprincipal: MutPtr, wszprincipal: Pwstr, pcmanifest: MutPtr, wszmanifest: Pwstr): Hresult =
    if (windowsWin32DataRightsmanagementNapiAvailable) wasmWindowssysWindowsWin32DataRightsmanagementDRMVerify(wszdata.rawAddress.toString(), pcattesteddata.rawAddress.toString(), wszattesteddata.rawAddress.toString(), petype.rawAddress.toString(), pcprincipal.rawAddress.toString(), wszprincipal.rawAddress.toString(), pcmanifest.rawAddress.toString(), wszmanifest.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
