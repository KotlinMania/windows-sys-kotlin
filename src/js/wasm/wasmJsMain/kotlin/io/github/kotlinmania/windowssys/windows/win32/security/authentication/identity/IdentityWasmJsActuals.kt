@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.authentication.identity

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
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.Acl
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.QuotaLimits
import io.github.kotlinmania.windowssys.windows.win32.security.TokenGroups
import io.github.kotlinmania.windowssys.windows.win32.security.TokenSource
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.CredentialTargetInformationw
import io.github.kotlinmania.windowssys.windows.win32.security.credentials.SecHandle
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SecurityAuthenticationIdentityNapiAddon(): Boolean

private val windowsWin32SecurityAuthenticationIdentityNapiAvailable: Boolean = initWindowsWin32SecurityAuthenticationIdentityNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(p0: String, p1: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(p0: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(p0: String, p1: Boolean, p2: String, p3: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(p0: Int, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(p0: String, p1: String, p2: Int, p3: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(p0: Int, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(p0: String, p1: Int, p2: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(p0: String, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(p0: String, p1: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(p0: String, p1: String, p2: Int): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(p0: Int, p1: String): Boolean

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(p0: String, p1: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Int, p7: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Boolean, p6: Int, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(p0: Int, p1: String, p2: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA()")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW()")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW(): String

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String, p6: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(p0: String, p1: Int, p2: Int, p3: String, p4: String, p5: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(p0: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(p0: String, p1: String, p2: Boolean, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(p0: String, p1: String, p2: String, p3: Boolean, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(p0: String, p1: String, p2: Int, p3: String, p4: Boolean, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(p0: String, p1: Int): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLClose(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(p0: String, p1: Int, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(p0: String, p1: String, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(p0: String, p1: String, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(p0, p1, p2, p3, p4, p5, p6, p7, p8)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: String, p6: String, p7: String, p8: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(p0: String, p1: String, p2: String, p3: Int, p4: Int, p5: Int, p6: String, p7: Int, p8: String, p9: String, p10: String, p11: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(p0: Int)

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(p0: String, p1: Int, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(p0: String, p1: Int, p2: Int, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(p0: String, p1: Int)

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(p0: String, p1: Int, p2: String, p3: Int, p4: String, p5: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(p0: String, p1: Int, p2: String, p3: String, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(p0: Int, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(p0: String)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(p0: String): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(p0: Int): Boolean

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(p0: String, p1: String, p2: Int, p3: String, p4: String, p5: String, p6: String, p7: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(p0: String, p1: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(p0: String)

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings()")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(p0: Int, p1: String, p2: Int, p3: String, p4: Int, p5: Int, p6: String, p7: String, p8: String, p9: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(p0: Int, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(p0, p1)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(p0)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(p0: String, p1: Int, p2: Int, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(p0: String, p1: Int, p2: Int, p3: String, p4: String): Boolean

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(p0: String, p1: String, p2: Int, p3: String): Int

public actual fun acceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAcceptSecurityContext(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleA(pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleA(pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pvlogonid.rawAddress.toString(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), phcredential.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun acquireCredentialsHandleW(pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: SecpkgCred, pvlogonid: ConstPtr<CVoid>, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, phcredential: MutPtr<SecHandle>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAcquireCredentialsHandleW(pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pvlogonid.rawAddress.toString(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), phcredential.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsA(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcstr, pszpackage: Pcstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsA(hcredentials.rawAddress.toString(), pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addCredentialsW(hcredentials: ConstPtr<SecHandle>, pszprincipal: Pcwstr, pszpackage: Pcwstr, fcredentialuse: UInt, pauthdata: ConstPtr<CVoid>, pgetkeyfn: SecGetKeyFn, pvgetkeyargument: ConstPtr<CVoid>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddCredentialsW(hcredentials.rawAddress.toString(), pszprincipal.rawAddress.toString(), pszpackage.rawAddress.toString(), fcredentialuse.toInt(), pauthdata.rawAddress.toString(), 0L.toString(), pvgetkeyargument.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageA(pszpackagename: Pcstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageA(pszpackagename.rawAddress.toString(), poptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addSecurityPackageW(pszpackagename: Pcwstr, poptions: ConstPtr<SecurityPackageOptions>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAddSecurityPackageW(pszpackagename.rawAddress.toString(), poptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun applyControlToken(phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityApplyControlToken(phcontext.rawAddress.toString(), pinput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyBySid(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyBySid(psid.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditComputeEffectivePolicyByToken(htokenhandle: Handle, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditComputeEffectivePolicyByToken(htokenhandle.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateCategories(ppauditcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateCategories(ppauditcategoriesarray.rawAddress.toString(), pdwcountreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumeratePerUserPolicy(ppauditsidarray: MutPtr<MutPtr<PolicyAuditSidArray>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumeratePerUserPolicy(ppauditsidarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditEnumerateSubCategories(pauditcategoryguid: ConstPtr<Guid>, bretrieveallsubcategories: Boolean, ppauditsubcategoriesarray: MutPtr<MutPtr<Guid>>, pdwcountreturned: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditEnumerateSubCategories(pauditcategoryguid.rawAddress.toString(), bretrieveallsubcategories, ppauditsubcategoriesarray.rawAddress.toString(), pdwcountreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditFree(buffer: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditFree(buffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun auditLookupCategoryGuidFromCategoryId(auditcategoryid: PolicyAuditEventType, pauditcategoryguid: MutPtr<Guid>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryGuidFromCategoryId(auditcategoryid, pauditcategoryguid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryIdFromCategoryGuid(pauditcategoryguid: ConstPtr<Guid>, pauditcategoryid: MutPtr<PolicyAuditEventType>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryIdFromCategoryGuid(pauditcategoryguid.rawAddress.toString(), pauditcategoryid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameA(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameA(pauditcategoryguid.rawAddress.toString(), ppszcategoryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupCategoryNameW(pauditcategoryguid: ConstPtr<Guid>, ppszcategoryname: MutPtr<Pwstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupCategoryNameW(pauditcategoryguid.rawAddress.toString(), ppszcategoryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameA(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameA(pauditsubcategoryguid.rawAddress.toString(), ppszsubcategoryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditLookupSubCategoryNameW(pauditsubcategoryguid: ConstPtr<Guid>, ppszsubcategoryname: MutPtr<Pwstr>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditLookupSubCategoryNameW(pauditsubcategoryguid.rawAddress.toString(), ppszsubcategoryname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclA(objecttypename: Pcstr, acl: MutPtr<MutPtr<Acl>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclA(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryGlobalSaclW(objecttypename: Pcwstr, acl: MutPtr<MutPtr<Acl>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryGlobalSaclW(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQueryPerUserPolicy(psid: Psid, psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQueryPerUserPolicy(psid.rawAddress.toString(), psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySecurity(securityinformation: ObjectSecurityInformation, ppsecuritydescriptor: MutPtr<PsecurityDescriptor>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySecurity(securityinformation.toInt(), ppsecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditQuerySystemPolicy(psubcategoryguids: ConstPtr<Guid>, dwpolicycount: UInt, ppauditpolicy: MutPtr<MutPtr<AuditPolicyInformation>>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditQuerySystemPolicy(psubcategoryguids.rawAddress.toString(), dwpolicycount.toInt(), ppauditpolicy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclA(objecttypename: Pcstr, acl: ConstPtr<Acl>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclA(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetGlobalSaclW(objecttypename: Pcwstr, acl: ConstPtr<Acl>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetGlobalSaclW(objecttypename.rawAddress.toString(), acl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetPerUserPolicy(psid: Psid, pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetPerUserPolicy(psid.rawAddress.toString(), pauditpolicy.rawAddress.toString(), dwpolicycount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSecurity(securityinformation: ObjectSecurityInformation, psecuritydescriptor: PsecurityDescriptor): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSecurity(securityinformation.toInt(), psecuritydescriptor.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun auditSetSystemPolicy(pauditpolicy: ConstPtr<AuditPolicyInformation>, dwpolicycount: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityAuditSetSystemPolicy(pauditpolicy.rawAddress.toString(), dwpolicycount.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordA(pszpackagename: ConstPtr<Byte>, pszdomainname: ConstPtr<Byte>, pszaccountname: ConstPtr<Byte>, pszoldpassword: ConstPtr<Byte>, psznewpassword: ConstPtr<Byte>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordA(pszpackagename.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszaccountname.rawAddress.toString(), pszoldpassword.rawAddress.toString(), psznewpassword.rawAddress.toString(), bimpersonating, dwreserved.toInt(), poutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeAccountPasswordW(pszpackagename: ConstPtr<UShort>, pszdomainname: ConstPtr<UShort>, pszaccountname: ConstPtr<UShort>, pszoldpassword: ConstPtr<UShort>, psznewpassword: ConstPtr<UShort>, bimpersonating: Boolean, dwreserved: UInt, poutput: MutPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityChangeAccountPasswordW(pszpackagename.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszaccountname.rawAddress.toString(), pszoldpassword.rawAddress.toString(), psznewpassword.rawAddress.toString(), bimpersonating, dwreserved.toInt(), poutput.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun completeAuthToken(phcontext: ConstPtr<SecHandle>, ptoken: ConstPtr<SecBufferDesc>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityCompleteAuthToken(phcontext.rawAddress.toString(), ptoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credMarshalTargetInfo(intargetinfo: ConstPtr<CredentialTargetInformationw>, buffer: MutPtr<MutPtr<UShort>>, buffersize: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityCredMarshalTargetInfo(intargetinfo.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun credUnmarshalTargetInfo(buffer: ConstPtr<UShort>, buffersize: UInt, rettargetinfo: MutPtr<MutPtr<CredentialTargetInformationw>>, retactualsize: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityCredUnmarshalTargetInfo(buffer.rawAddress.toString(), buffersize.toInt(), rettargetinfo.rawAddress.toString(), retactualsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decryptMessage(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDecryptMessage(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityContext(phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageA(pszpackagename: Pcstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageA(pszpackagename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteSecurityPackageW(pszpackagename: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityDeleteSecurityPackageW(pszpackagename.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encryptMessage(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityEncryptMessage(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesA(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesA(pcpackages.rawAddress.toString(), pppackageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumerateSecurityPackagesW(pcpackages: MutPtr<UInt>, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityEnumerateSecurityPackagesW(pcpackages.rawAddress.toString(), pppackageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun exportSecurityContext(phcontext: ConstPtr<SecHandle>, fflags: ExportSecurityContextFlags, ppackedcontext: MutPtr<SecBuffer>, ptoken: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityExportSecurityContext(phcontext.rawAddress.toString(), fflags.toInt(), ppackedcontext.rawAddress.toString(), ptoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeContextBuffer(pvcontextbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityFreeContextBuffer(pvcontextbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeCredentialsHandle(phcredential: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityFreeCredentialsHandle(phcredential.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameA(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getComputerObjectNameW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetComputerObjectNameW(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExA(nameformat: ExtendedNameFormat, lpnamebuffer: Pstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExA(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUserNameExW(nameformat: ExtendedNameFormat, lpnamebuffer: Pwstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityGetUserNameExW(nameformat, lpnamebuffer.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun impersonateSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityImpersonateSecurityContext(phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextA(pszpackage: Pcstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextA(pszpackage.rawAddress.toString(), ppackedcontext.rawAddress.toString(), token.rawAddress.toString(), phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importSecurityContextW(pszpackage: Pcwstr, ppackedcontext: ConstPtr<SecBuffer>, token: ConstPtr<CVoid>, phcontext: MutPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityImportSecurityContextW(pszpackage.rawAddress.toString(), ppackedcontext.rawAddress.toString(), token.rawAddress.toString(), phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceA(): MutPtr<SecurityFunctionTableA> =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceA().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initSecurityInterfaceW(): MutPtr<SecurityFunctionTableW> =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitSecurityInterfaceW().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<Byte>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextA(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun initializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: ConstPtr<UShort>, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityInitializeSecurityContextW(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaAddAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaAddAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), userrights.rawAddress.toString(), countofrights.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCallAuthenticationPackage(lsahandle: Handle, authenticationpackage: UInt, protocolsubmitbuffer: ConstPtr<CVoid>, submitbufferlength: UInt, protocolreturnbuffer: MutPtr<MutPtr<CVoid>>, returnbufferlength: MutPtr<UInt>, protocolstatus: MutPtr<Int>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaCallAuthenticationPackage(lsahandle.rawAddress.toString(), authenticationpackage.toInt(), protocolsubmitbuffer.rawAddress.toString(), submitbufferlength.toInt(), protocolreturnbuffer.rawAddress.toString(), returnbufferlength.rawAddress.toString(), protocolstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaClose(objecthandle: LsaHandle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaClose(objecthandle.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaConnectUntrusted(lsahandle: MutPtr<Handle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaConnectUntrusted(lsahandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaCreateTrustedDomainEx(policyhandle: LsaHandle, trusteddomaininformation: ConstPtr<TrustedDomainInformationEx>, authenticationinformation: ConstPtr<TrustedDomainAuthInformation>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaCreateTrustedDomainEx(policyhandle.toString(), trusteddomaininformation.rawAddress.toString(), authenticationinformation.rawAddress.toString(), desiredaccess.toInt(), trusteddomainhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeleteTrustedDomain(policyhandle: LsaHandle, trusteddomainsid: Psid): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaDeleteTrustedDomain(policyhandle.toString(), trusteddomainsid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaDeregisterLogonProcess(lsahandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaDeregisterLogonProcess(lsahandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountRights(policyhandle: LsaHandle, accountsid: Psid, userrights: MutPtr<MutPtr<LsaUnicodeString>>, countofrights: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), userrights.rawAddress.toString(), countofrights.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateAccountsWithUserRight(policyhandle: LsaHandle, userright: ConstPtr<LsaUnicodeString>, buffer: MutPtr<MutPtr<CVoid>>, countreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateAccountsWithUserRight(policyhandle.toString(), userright.rawAddress.toString(), buffer.rawAddress.toString(), countreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateLogonSessions(logonsessioncount: MutPtr<UInt>, logonsessionlist: MutPtr<MutPtr<Luid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateLogonSessions(logonsessioncount.rawAddress.toString(), logonsessionlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomains(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomains(policyhandle.toString(), enumerationcontext.rawAddress.toString(), buffer.rawAddress.toString(), preferedmaximumlength.toInt(), countreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaEnumerateTrustedDomainsEx(policyhandle: LsaHandle, enumerationcontext: MutPtr<UInt>, buffer: MutPtr<MutPtr<CVoid>>, preferedmaximumlength: UInt, countreturned: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaEnumerateTrustedDomainsEx(policyhandle.toString(), enumerationcontext.rawAddress.toString(), buffer.rawAddress.toString(), preferedmaximumlength.toInt(), countreturned.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeMemory(buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeMemory(buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaFreeReturnBuffer(buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaFreeReturnBuffer(buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetAppliedCAPIDs(systemname: ConstPtr<LsaUnicodeString>, capids: MutPtr<MutPtr<Psid>>, capidcount: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaGetAppliedCAPIDs(systemname.rawAddress.toString(), capids.rawAddress.toString(), capidcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaGetLogonSessionData(logonid: ConstPtr<Luid>, pplogonsessiondata: MutPtr<MutPtr<SecurityLogonSessionData>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaGetLogonSessionData(logonid.rawAddress.toString(), pplogonsessiondata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLogonUser(lsahandle: Handle, originname: ConstPtr<LsaString>, logontype: SecurityLogonType, authenticationpackage: UInt, authenticationinformation: ConstPtr<CVoid>, authenticationinformationlength: UInt, localgroups: ConstPtr<TokenGroups>, sourcecontext: ConstPtr<TokenSource>, profilebuffer: MutPtr<MutPtr<CVoid>>, profilebufferlength: MutPtr<UInt>, logonid: MutPtr<Luid>, token: MutPtr<Handle>, quotas: MutPtr<QuotaLimits>, substatus: MutPtr<Int>): Ntstatus =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupAuthenticationPackage(lsahandle: Handle, packagename: ConstPtr<LsaString>, authenticationpackage: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupAuthenticationPackage(lsahandle.rawAddress.toString(), packagename.rawAddress.toString(), authenticationpackage.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames(policyhandle: LsaHandle, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames(policyhandle.toString(), count.toInt(), names.rawAddress.toString(), referenceddomains.rawAddress.toString(), sids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupNames2(policyhandle: LsaHandle, flags: UInt, count: UInt, names: ConstPtr<LsaUnicodeString>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, sids: MutPtr<MutPtr<LsaTranslatedSid2>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupNames2(policyhandle.toString(), flags.toInt(), count.toInt(), names.rawAddress.toString(), referenceddomains.rawAddress.toString(), sids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids(policyhandle: LsaHandle, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids(policyhandle.toString(), count.toInt(), sids.rawAddress.toString(), referenceddomains.rawAddress.toString(), names.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaLookupSids2(policyhandle: LsaHandle, lookupoptions: UInt, count: UInt, sids: ConstPtr<Psid>, referenceddomains: MutPtr<MutPtr<LsaReferencedDomainList>>, names: MutPtr<MutPtr<LsaTranslatedName>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaLookupSids2(policyhandle.toString(), lookupoptions.toInt(), count.toInt(), sids.rawAddress.toString(), referenceddomains.rawAddress.toString(), names.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaNtStatusToWinError(status: Ntstatus): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaNtStatusToWinError(status).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenPolicy(systemname: ConstPtr<LsaUnicodeString>, objectattributes: ConstPtr<LsaObjectAttributes>, desiredaccess: UInt, policyhandle: MutPtr<LsaHandle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenPolicy(systemname.rawAddress.toString(), objectattributes.rawAddress.toString(), desiredaccess.toInt(), policyhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaOpenTrustedDomainByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, desiredaccess: UInt, trusteddomainhandle: MutPtr<LsaHandle>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaOpenTrustedDomainByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), desiredaccess.toInt(), trusteddomainhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryCAPs(capids: ConstPtr<Psid>, capidcount: UInt, caps: MutPtr<MutPtr<CentralAccessPolicy>>, capcount: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryCAPs(capids.rawAddress.toString(), capidcount.toInt(), caps.rawAddress.toString(), capcount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation(policyhandle.toString(), trusteddomainname.rawAddress.toString(), foresttrustinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: MutPtr<MutPtr<LsaForestTrustInformation2>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryForestTrustInformation2(policyhandle.toString(), trusteddomainname.rawAddress.toString(), highestrecordtype, foresttrustinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfo(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfo(policyhandle.toString(), trusteddomainsid.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaQueryTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: MutPtr<MutPtr<CVoid>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaQueryTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterLogonProcess(logonprocessname: ConstPtr<LsaString>, lsahandle: MutPtr<Handle>, securitymode: MutPtr<UInt>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterLogonProcess(logonprocessname.rawAddress.toString(), lsahandle.rawAddress.toString(), securitymode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRegisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRegisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRemoveAccountRights(policyhandle: LsaHandle, accountsid: Psid, allrights: Boolean, userrights: ConstPtr<LsaUnicodeString>, countofrights: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRemoveAccountRights(policyhandle.toString(), accountsid.rawAddress.toString(), allrights, userrights.rawAddress.toString(), countofrights.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaRetrievePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: MutPtr<MutPtr<LsaUnicodeString>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaRetrievePrivateData(policyhandle.toString(), keyname.rawAddress.toString(), privatedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetCAPs(capdns: ConstPtr<LsaUnicodeString>, capdncount: UInt, flags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetCAPs(capdns.rawAddress.toString(), capdncount.toInt(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetDomainInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyDomainInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetDomainInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, foresttrustinfo: ConstPtr<LsaForestTrustInformation>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation(policyhandle.toString(), trusteddomainname.rawAddress.toString(), foresttrustinfo.rawAddress.toString(), checkonly, collisioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetForestTrustInformation2(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, highestrecordtype: LsaForestTrustRecordType, foresttrustinfo: ConstPtr<LsaForestTrustInformation2>, checkonly: Boolean, collisioninfo: MutPtr<MutPtr<LsaForestTrustCollisionInformation>>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetForestTrustInformation2(policyhandle.toString(), trusteddomainname.rawAddress.toString(), highestrecordtype, foresttrustinfo.rawAddress.toString(), checkonly, collisioninfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetInformationPolicy(policyhandle: LsaHandle, informationclass: PolicyInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetInformationPolicy(policyhandle.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInfoByName(policyhandle: LsaHandle, trusteddomainname: ConstPtr<LsaUnicodeString>, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInfoByName(policyhandle.toString(), trusteddomainname.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaSetTrustedDomainInformation(policyhandle: LsaHandle, trusteddomainsid: Psid, informationclass: TrustedInformationClass, buffer: ConstPtr<CVoid>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaSetTrustedDomainInformation(policyhandle.toString(), trusteddomainsid.rawAddress.toString(), informationclass, buffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaStorePrivateData(policyhandle: LsaHandle, keyname: ConstPtr<LsaUnicodeString>, privatedata: ConstPtr<LsaUnicodeString>): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaStorePrivateData(policyhandle.toString(), keyname.rawAddress.toString(), privatedata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lsaUnregisterPolicyChangeNotification(informationclass: PolicyNotificationInformationClass, notificationeventhandle: Handle): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityLsaUnregisterPolicyChangeNotification(informationclass, notificationeventhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun makeSignature(phcontext: ConstPtr<SecHandle>, fqop: UInt, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityMakeSignature(phcontext.rawAddress.toString(), fqop.toInt(), pmessage.rawAddress.toString(), messageseqno.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesExW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesExW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesExW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesExW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun queryCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQueryCredentialsAttributesW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityContextToken(phcontext: ConstPtr<SecHandle>, token: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityContextToken(phcontext.rawAddress.toString(), token.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoA(pszpackagename: Pcstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoA(pszpackagename.rawAddress.toString(), pppackageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun querySecurityPackageInfoW(pszpackagename: Pcwstr, pppackageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityQuerySecurityPackageInfoW(pszpackagename.rawAddress.toString(), pppackageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun revertSecurityContext(phcontext: ConstPtr<SecHandle>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRevertSecurityContext(phcontext.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlDecryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRtlDecryptMemory(memory.rawAddress.toString(), memorysize.toInt(), optionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlEncryptMemory(memory: MutPtr<CVoid>, memorysize: UInt, optionflags: UInt): Ntstatus =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRtlEncryptMemory(memory.rawAddress.toString(), memorysize.toInt(), optionflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGenRandom(randombuffer: MutPtr<CVoid>, randombufferlength: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityRtlGenRandom(randombuffer.rawAddress.toString(), randombufferlength.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLAcquireGenuineTicket(ppticketblob: MutPtr<MutPtr<CVoid>>, pcbticketblob: MutPtr<UInt>, pwsztemplateid: Pcwstr, pwszserverurl: Pcwstr, pwszclienttoken: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLAcquireGenuineTicket(ppticketblob.rawAddress.toString(), pcbticketblob.rawAddress.toString(), pwsztemplateid.rawAddress.toString(), pwszserverurl.rawAddress.toString(), pwszclienttoken.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLActivateProduct(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, cbappspecificdata: UInt, pvappspecificdata: ConstPtr<CVoid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszproxyserver: Pcwstr, wproxyport: UShort): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLActivateProduct(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), cbappspecificdata.toInt(), pvappspecificdata.rawAddress.toString(), pactivationinfo.rawAddress.toString(), pwszproxyserver.rawAddress.toString(), wproxyport.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLClose(hslc: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLClose(hslc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLConsumeRight(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pvreserved: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLConsumeRight(hslc.rawAddress.toString(), pappid.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszrightname.rawAddress.toString(), pvreserved.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationId(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszinstallationid.rawAddress.toString(), pwszconfirmationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLDepositOfflineConfirmationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, pwszinstallationid: Pcwstr, pwszconfirmationid: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLDepositOfflineConfirmationIdEx(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pactivationinfo.rawAddress.toString(), pwszinstallationid.rawAddress.toString(), pwszconfirmationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLFireEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLFireEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationId(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, ppwszinstallationid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationId(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), ppwszinstallationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGenerateOfflineInstallationIdEx(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pactivationinfo: ConstPtr<SlActivationInfoHeader>, ppwszinstallationid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGenerateOfflineInstallationIdEx(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pactivationinfo.rawAddress.toString(), ppwszinstallationid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetApplicationInformation(hslc: ConstPtr<CVoid>, papplicationid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetApplicationInformation(hslc.rawAddress.toString(), papplicationid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetGenuineInformation(pqueryid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetInstalledProductKeyIds(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pnproductkeyids: MutPtr<UInt>, ppproductkeyids: MutPtr<MutPtr<Guid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetInstalledProductKeyIds(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pnproductkeyids.rawAddress.toString(), ppproductkeyids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>, pcblicensefile: MutPtr<UInt>, ppblicensefile: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicense(hslc.rawAddress.toString(), plicensefileid.rawAddress.toString(), pcblicensefile.rawAddress.toString(), ppblicensefile.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseFileId(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseFileId(hslc.rawAddress.toString(), cblicenseblob.toInt(), pblicenseblob.rawAddress.toString(), plicensefileid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicenseInformation(hslc: ConstPtr<CVoid>, psllicenseid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicenseInformation(hslc.rawAddress.toString(), psllicenseid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetLicensingStatusInformation(hslc: ConstPtr<CVoid>, pappid: ConstPtr<Guid>, pproductskuid: ConstPtr<Guid>, pwszrightname: Pcwstr, pnstatuscount: MutPtr<UInt>, pplicensingstatus: MutPtr<MutPtr<SlLicensingStatus>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetLicensingStatusInformation(hslc.rawAddress.toString(), pappid.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszrightname.rawAddress.toString(), pnstatuscount.rawAddress.toString(), pplicensingstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyId(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyId(hslc.rawAddress.toString(), pwszpkeyalgorithm.rawAddress.toString(), pwszpkeystring.rawAddress.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress.toString(), ppkeyid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPKeyInformation(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPKeyInformation(hslc.rawAddress.toString(), ppkeyid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformation(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetPolicyInformationDWORD(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetPolicyInformationDWORD(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pdwvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetProductSkuInformation(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetProductSkuInformation(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetReferralInformation(hslc: ConstPtr<CVoid>, ereferraltype: Slreferraltype, pskuorappid: ConstPtr<Guid>, pwszvaluename: Pcwstr, ppwszvalue: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetReferralInformation(hslc.rawAddress.toString(), ereferraltype, pskuorappid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), ppwszvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetSLIDList(hslc: ConstPtr<CVoid>, equeryidtype: Slidtype, pqueryid: ConstPtr<Guid>, ereturnidtype: Slidtype, pnreturnids: MutPtr<UInt>, ppreturnids: MutPtr<MutPtr<Guid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetSLIDList(hslc.rawAddress.toString(), equeryidtype, pqueryid.rawAddress.toString(), ereturnidtype, pnreturnids.rawAddress.toString(), ppreturnids.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServerStatus(pwszserverurl: Pcwstr, pwszacquisitiontype: Pcwstr, pwszproxyserver: Pcwstr, wproxyport: UShort, phrstatus: MutPtr<Hresult>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetServerStatus(pwszserverurl.rawAddress.toString(), pwszacquisitiontype.rawAddress.toString(), pwszproxyserver.rawAddress.toString(), wproxyport.toInt(), phrstatus.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetServiceInformation(hslc: ConstPtr<CVoid>, pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetServiceInformation(hslc.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformation(pwszvaluename: Pcwstr, pedatatype: MutPtr<Sldatatype>, pcbvalue: MutPtr<UInt>, ppbvalue: MutPtr<MutPtr<UByte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformation(pwszvaluename.rawAddress.toString(), pedatatype.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLGetWindowsInformationDWORD(pwszvaluename: Pcwstr, pdwvalue: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLGetWindowsInformationDWORD(pwszvaluename.rawAddress.toString(), pdwvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallLicense(hslc: ConstPtr<CVoid>, cblicenseblob: UInt, pblicenseblob: ConstPtr<UByte>, plicensefileid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLInstallLicense(hslc.rawAddress.toString(), cblicenseblob.toInt(), pblicenseblob.rawAddress.toString(), plicensefileid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLInstallProofOfPurchase(hslc: ConstPtr<CVoid>, pwszpkeyalgorithm: Pcwstr, pwszpkeystring: Pcwstr, cbpkeyspecificdata: UInt, pbpkeyspecificdata: ConstPtr<UByte>, ppkeyid: MutPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLInstallProofOfPurchase(hslc.rawAddress.toString(), pwszpkeyalgorithm.rawAddress.toString(), pwszpkeystring.rawAddress.toString(), cbpkeyspecificdata.toInt(), pbpkeyspecificdata.rawAddress.toString(), ppkeyid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLIsGenuineLocal(pappid: ConstPtr<Guid>, pgenuinestate: MutPtr<SlGenuineState>, puioptions: MutPtr<SlNongenuineUiOptions>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLIsGenuineLocal(pappid.rawAddress.toString(), pgenuinestate.rawAddress.toString(), puioptions.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLOpen(phslc: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLOpen(phslc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLQueryLicenseValueFromApp(valuename: Pcwstr, valuetype: MutPtr<UInt>, databuffer: MutPtr<CVoid>, datasize: UInt, resultdatasize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLQueryLicenseValueFromApp(valuename.rawAddress.toString(), valuetype.rawAddress.toString(), databuffer.rawAddress.toString(), datasize.toInt(), resultdatasize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLRegisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLRegisterEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString(), hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetCurrentProductKey(hslc: ConstPtr<CVoid>, pproductskuid: ConstPtr<Guid>, pproductkeyid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLSetCurrentProductKey(hslc.rawAddress.toString(), pproductskuid.rawAddress.toString(), pproductkeyid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLSetGenuineInformation(pqueryid: ConstPtr<Guid>, pwszvaluename: Pcwstr, edatatype: Sldatatype, cbvalue: UInt, pbvalue: ConstPtr<UByte>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLSetGenuineInformation(pqueryid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), edatatype.toInt(), cbvalue.toInt(), pbvalue.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallLicense(hslc: ConstPtr<CVoid>, plicensefileid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallLicense(hslc.rawAddress.toString(), plicensefileid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUninstallProofOfPurchase(hslc: ConstPtr<CVoid>, ppkeyid: ConstPtr<Guid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLUninstallProofOfPurchase(hslc.rawAddress.toString(), ppkeyid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sLUnregisterEvent(hslc: ConstPtr<CVoid>, pwszeventid: Pcwstr, papplicationid: ConstPtr<Guid>, hevent: Handle): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySLUnregisterEvent(hslc.rawAddress.toString(), pwszeventid.rawAddress.toString(), papplicationid.rawAddress.toString(), hevent.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslAcceptSecurityContext(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, pinput: ConstPtr<SecBufferDesc>, fcontextreq: AscReqFlags, targetdatarep: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslAcceptSecurityContext(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), pinput.rawAddress.toString(), fcontextreq.toInt(), targetdatarep.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesA(profilelist: MutPtr<Pstr>, profilecount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesA(profilelist.rawAddress.toString(), profilecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslEnumerateProfilesW(profilelist: MutPtr<Pwstr>, profilecount: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslEnumerateProfilesW(profilelist.rawAddress.toString(), profilecount.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: MutPtr<CVoid>, size: UInt, needed: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslGetContextOption(contexthandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString(), size.toInt(), needed.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageA(profilename: Pcstr, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageA(profilename.rawAddress.toString(), packageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslGetProfilePackageW(profilename: Pcwstr, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslGetProfilePackageW(profilename.rawAddress.toString(), packageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageA(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoA>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageA(pinput.rawAddress.toString(), packageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslIdentifyPackageW(pinput: ConstPtr<SecBufferDesc>, packageinfo: MutPtr<MutPtr<SecPkgInfoW>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslIdentifyPackageW(pinput.rawAddress.toString(), packageinfo.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextA(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextA(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslInitializeSecurityContextW(phcredential: ConstPtr<SecHandle>, phcontext: ConstPtr<SecHandle>, psztargetname: Pcwstr, fcontextreq: IscReqFlags, reserved1: UInt, targetdatarep: UInt, pinput: ConstPtr<SecBufferDesc>, reserved2: UInt, phnewcontext: MutPtr<SecHandle>, poutput: MutPtr<SecBufferDesc>, pfcontextattr: MutPtr<UInt>, ptsexpiry: MutPtr<Long>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslInitializeSecurityContextW(phcredential.rawAddress.toString(), phcontext.rawAddress.toString(), psztargetname.rawAddress.toString(), fcontextreq.toInt(), reserved1.toInt(), targetdatarep.toInt(), pinput.rawAddress.toString(), reserved2.toInt(), phnewcontext.rawAddress.toString(), poutput.rawAddress.toString(), pfcontextattr.rawAddress.toString(), ptsexpiry.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saslSetContextOption(contexthandle: ConstPtr<SecHandle>, option: UInt, value: ConstPtr<CVoid>, size: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySaslSetContextOption(contexthandle.rawAddress.toString(), option.toInt(), value.rawAddress.toString(), size.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sendSAS(asuser: Bool) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySendSAS(asuser)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun setContextAttributesA(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesA(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setContextAttributesW(phcontext: ConstPtr<SecHandle>, ulattribute: SecpkgAttr, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetContextAttributesW(phcontext.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesA(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesA(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setCredentialsAttributesW(phcredential: ConstPtr<SecHandle>, ulattribute: UInt, pbuffer: ConstPtr<CVoid>, cbbuffer: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySetCredentialsAttributesW(phcredential.rawAddress.toString(), ulattribute.toInt(), pbuffer.rawAddress.toString(), cbbuffer.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCrackCertificate(pbcertificate: MutPtr<UByte>, cbcertificate: UInt, dwflags: UInt, ppcertificate: MutPtr<MutPtr<X509Certificate>>): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslCrackCertificate(pbcertificate.rawAddress.toString(), cbcertificate.toInt(), dwflags.toInt(), ppcertificate.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDeserializeCertificateStore(serializedcertificatestore: CryptIntegerBlob, ppcertcontext: MutPtr<MutPtr<CertContext>>): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheA(psztargetname: Pcstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheA(psztargetname.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEmptyCacheW(psztargetname: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslEmptyCacheW(psztargetname.rawAddress.toString(), dwflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeCertificate(pcertificate: MutPtr<X509Certificate>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslFreeCertificate(pcertificate.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGenerateRandomBits(prandomdata: MutPtr<UByte>, crandomdata: Int) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGenerateRandomBits(prandomdata.rawAddress.toString(), crandomdata)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sslGetExtensions(clienthello: ConstPtr<UByte>, clienthellobytesize: UInt, genericextensions: MutPtr<SchExtensionData>, genericextensionscount: UByte, bytestoread: MutPtr<UInt>, flags: SchGetExtensionsOptions): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetExtensions(clienthello.rawAddress.toString(), clienthellobytesize.toInt(), genericextensions.rawAddress.toString(), genericextensionscount.toInt(), bytestoread.rawAddress.toString(), flags) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetMaximumKeySize(reserved: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetMaximumKeySize(reserved.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetServerIdentity(clienthello: ConstPtr<UByte>, clienthellosize: UInt, serveridentity: MutPtr<MutPtr<UByte>>, serveridentitysize: MutPtr<UInt>, flags: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySslGetServerIdentity(clienthello.rawAddress.toString(), clienthellosize.toInt(), serveridentity.rawAddress.toString(), serveridentitysize.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCompareAuthIdentities(authidentity1: ConstPtr<CVoid>, authidentity2: ConstPtr<CVoid>, samesupplieduser: MutPtr<Boolean>, samesuppliedidentity: MutPtr<Boolean>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiCompareAuthIdentities(authidentity1.rawAddress.toString(), authidentity2.rawAddress.toString(), samesupplieduser.rawAddress.toString(), samesuppliedidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiCopyAuthIdentity(authdata: ConstPtr<CVoid>, authdatacopy: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiCopyAuthIdentity(authdata.rawAddress.toString(), authdatacopy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentity(encryptedauthdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentity(encryptedauthdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiDecryptAuthIdentityEx(options: UInt, encryptedauthdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiDecryptAuthIdentityEx(options.toInt(), encryptedauthdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeAuthIdentityAsStrings(pauthidentity: ConstPtr<CVoid>, ppszusername: MutPtr<Pcwstr>, ppszdomainname: MutPtr<Pcwstr>, ppszpackedcredentialsstring: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeAuthIdentityAsStrings(pauthidentity.rawAddress.toString(), ppszusername.rawAddress.toString(), ppszdomainname.rawAddress.toString(), ppszpackedcredentialsstring.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncodeStringsAsAuthIdentity(pszusername: Pcwstr, pszdomainname: Pcwstr, pszpackedcredentialsstring: Pcwstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncodeStringsAsAuthIdentity(pszusername.rawAddress.toString(), pszdomainname.rawAddress.toString(), pszpackedcredentialsstring.rawAddress.toString(), ppauthidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentity(authdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentity(authdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiEncryptAuthIdentityEx(options: UInt, authdata: MutPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiEncryptAuthIdentityEx(options.toInt(), authdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiExcludePackage(authidentity: ConstPtr<CVoid>, pszpackagename: Pcwstr, ppnewauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiExcludePackage(authidentity.rawAddress.toString(), pszpackagename.rawAddress.toString(), ppnewauthidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiFreeAuthIdentity(authdata: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiFreeAuthIdentity(authdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiGetTargetHostName(psztargetname: Pcwstr, pszhostname: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiGetTargetHostName(psztargetname.rawAddress.toString(), pszhostname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsAuthIdentityEncrypted(encryptedauthdata: ConstPtr<CVoid>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsAuthIdentityEncrypted(encryptedauthdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiIsPromptingNeeded(errororntstatus: UInt): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiIsPromptingNeeded(errororntstatus.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiLocalFree(databuffer: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiLocalFree(databuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun sspiMarshalAuthIdentity(authidentity: ConstPtr<CVoid>, authidentitylength: MutPtr<UInt>, authidentitybytearray: MutPtr<MutPtr<Byte>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiMarshalAuthIdentity(authidentity.rawAddress.toString(), authidentitylength.rawAddress.toString(), authidentitybytearray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredRead(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredRead(authidentity.rawAddress.toString(), psztargetname.rawAddress.toString(), pcredmancredentialtype.rawAddress.toString(), ppszcredmantargetname.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPrepareForCredWrite(authidentity: ConstPtr<CVoid>, psztargetname: Pcwstr, pcredmancredentialtype: MutPtr<UInt>, ppszcredmantargetname: MutPtr<Pcwstr>, ppszcredmanusername: MutPtr<Pcwstr>, ppcredentialblob: MutPtr<MutPtr<UByte>>, pcredentialblobsize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPrepareForCredWrite(authidentity.rawAddress.toString(), psztargetname.rawAddress.toString(), pcredmancredentialtype.rawAddress.toString(), ppszcredmantargetname.rawAddress.toString(), ppszcredmanusername.rawAddress.toString(), ppcredentialblob.rawAddress.toString(), pcredentialblobsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsA(psztargetname: Pcstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsA(psztargetname.rawAddress.toString(), puiinfo.rawAddress.toString(), dwautherror.toInt(), pszpackage.rawAddress.toString(), pinputauthidentity.rawAddress.toString(), ppauthidentity.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiPromptForCredentialsW(psztargetname: Pcwstr, puiinfo: ConstPtr<CVoid>, dwautherror: UInt, pszpackage: Pcwstr, pinputauthidentity: ConstPtr<CVoid>, ppauthidentity: MutPtr<MutPtr<CVoid>>, pfsave: MutPtr<Int>, dwflags: UInt): UInt =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiPromptForCredentialsW(psztargetname.rawAddress.toString(), puiinfo.rawAddress.toString(), dwautherror.toInt(), pszpackage.rawAddress.toString(), pinputauthidentity.rawAddress.toString(), ppauthidentity.rawAddress.toString(), pfsave.rawAddress.toString(), dwflags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiSetChannelBindingFlags(pbindings: MutPtr<SecPkgContextBindings>, flags: UInt): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiSetChannelBindingFlags(pbindings.rawAddress.toString(), flags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiUnmarshalAuthIdentity(authidentitylength: UInt, authidentitybytearray: Pcstr, ppauthidentity: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiUnmarshalAuthIdentity(authidentitylength.toInt(), authidentitybytearray.rawAddress.toString(), ppauthidentity.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiValidateAuthIdentity(authdata: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiValidateAuthIdentity(authdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sspiZeroAuthIdentity(authdata: ConstPtr<CVoid>) {
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) {
        wasmWindowssysWindowsWin32SecurityAuthenticationIdentitySspiZeroAuthIdentity(authdata.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun tokenBindingDeleteAllBindings(): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteAllBindings() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingDeleteBinding(targeturl: Pcwstr): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingDeleteBinding(targeturl.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateBinding(keytype: TokenbindingKeyParametersType, targeturl: Pcwstr, bindingtype: TokenbindingType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, extensionformat: TokenbindingExtensionFormat, extensiondata: ConstPtr<CVoid>, tokenbinding: MutPtr<MutPtr<CVoid>>, tokenbindingsize: MutPtr<UInt>, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateBinding(keytype, targeturl.rawAddress.toString(), bindingtype, tlsekm.rawAddress.toString(), tlsekmsize.toInt(), extensionformat, extensiondata.rawAddress.toString(), tokenbinding.rawAddress.toString(), tokenbindingsize.rawAddress.toString(), resultdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateID(keytype: TokenbindingKeyParametersType, publickey: ConstPtr<CVoid>, publickeysize: UInt, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateID(keytype, publickey.rawAddress.toString(), publickeysize.toInt(), resultdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateIDForUri(keytype: TokenbindingKeyParametersType, targeturi: Pcwstr, resultdata: MutPtr<MutPtr<TokenbindingResultData>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateIDForUri(keytype, targeturi.rawAddress.toString(), resultdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGenerateMessage(tokenbindings: ConstPtr<ConstPtr<CVoid>>, tokenbindingssize: ConstPtr<UInt>, tokenbindingscount: UInt, tokenbindingmessage: MutPtr<MutPtr<CVoid>>, tokenbindingmessagesize: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGenerateMessage(tokenbindings.rawAddress.toString(), tokenbindingssize.rawAddress.toString(), tokenbindingscount.toInt(), tokenbindingmessage.rawAddress.toString(), tokenbindingmessagesize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetHighestSupportedVersion(majorversion: MutPtr<UByte>, minorversion: MutPtr<UByte>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetHighestSupportedVersion(majorversion.rawAddress.toString(), minorversion.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesClient(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesClient(keytypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingGetKeyTypesServer(keytypes: MutPtr<MutPtr<TokenbindingKeyTypes>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingGetKeyTypesServer(keytypes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tokenBindingVerifyMessage(tokenbindingmessage: ConstPtr<CVoid>, tokenbindingmessagesize: UInt, keytype: TokenbindingKeyParametersType, tlsekm: ConstPtr<CVoid>, tlsekmsize: UInt, resultlist: MutPtr<MutPtr<TokenbindingResultList>>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTokenBindingVerifyMessage(tokenbindingmessage.rawAddress.toString(), tokenbindingmessagesize.toInt(), keytype, tlsekm.rawAddress.toString(), tlsekmsize.toInt(), resultlist.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameA(lpaccountname: Pcstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameA(lpaccountname.rawAddress.toString(), accountnameformat, desirednameformat, lptranslatedname.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun translateNameW(lpaccountname: Pcwstr, accountnameformat: ExtendedNameFormat, desirednameformat: ExtendedNameFormat, lptranslatedname: Pwstr, nsize: MutPtr<UInt>): Boolean =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityTranslateNameW(lpaccountname.rawAddress.toString(), accountnameformat, desirednameformat, lptranslatedname.rawAddress.toString(), nsize.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifySignature(phcontext: ConstPtr<SecHandle>, pmessage: ConstPtr<SecBufferDesc>, messageseqno: UInt, pfqop: MutPtr<UInt>): Hresult =
    if (windowsWin32SecurityAuthenticationIdentityNapiAvailable) wasmWindowssysWindowsWin32SecurityAuthenticationIdentityVerifySignature(phcontext.rawAddress.toString(), pmessage.rawAddress.toString(), messageseqno.toInt(), pfqop.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
