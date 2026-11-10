@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hmodule
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptDescriptorHandle
import io.github.kotlinmania.windowssys.windows.win32.security.NcryptStreamHandle
import io.github.kotlinmania.windowssys.windows.win32.security.ObjectSecurityInformation
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.system.registry.RegValueType

private val _windowsWin32SecurityCryptographyNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptAddContextFunction(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), dwposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptAddContextFunctionProvider(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pszprovider?.value ?: 0L).toString(), dwposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptCloseAlgorithmProvider((halgorithm?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptConfigureContext(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), (pconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptConfigureContextFunction(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptCreateContext(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), (pconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptCreateHash((halgorithm?.value ?: 0L).toString(), (phhash?.value ?: 0L).toString(), (pbhashobject?.value ?: 0L).toString(), cbhashobject.toInt(), (pbsecret?.value ?: 0L).toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: COpaquePointer?, nhashes: UInt, pbhashobject: COpaquePointer?, cbhashobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptCreateMultiHash((halgorithm?.value ?: 0L).toString(), (phhash?.value ?: 0L).toString(), nhashes.toInt(), (pbhashobject?.value ?: 0L).toString(), cbhashobject.toInt(), (pbsecret?.value ?: 0L).toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDecrypt((hkey?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (ppaddinginfo?.value ?: 0L).toString(), (pbiv?.value ?: 0L).toString(), cbiv.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDeleteContext(dwtable.toInt(), (pszcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDeriveKey((hsharedsecret?.value ?: 0L).toString(), (pwszkdf?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), (pbderivedkey?.value ?: 0L).toString(), cbderivedkey.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDeriveKeyCapi((hhash?.value ?: 0L).toString(), (htargetalg?.value ?: 0L).toString(), (pbderivedkey?.value ?: 0L).toString(), cbderivedkey.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: COpaquePointer?, cbpassword: UInt, pbsalt: COpaquePointer?, cbsalt: UInt, citerations: ULong, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDeriveKeyPBKDF2((hprf?.value ?: 0L).toString(), (pbpassword?.value ?: 0L).toString(), cbpassword.toInt(), (pbsalt?.value ?: 0L).toString(), cbsalt.toInt(), citerations.toString(), (pbderivedkey?.value ?: 0L).toString(), cbderivedkey.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDestroyHash((hhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDestroyKey((hkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDestroySecret((hsecret?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: COpaquePointer?, pbhashobject: COpaquePointer?, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDuplicateHash((hhash?.value ?: 0L).toString(), (phnewhash?.value ?: 0L).toString(), (pbhashobject?.value ?: 0L).toString(), cbhashobject.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptDuplicateKey((hkey?.value ?: 0L).toString(), (phnewkey?.value ?: 0L).toString(), (pbkeyobject?.value ?: 0L).toString(), cbkeyobject.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pbiv: COpaquePointer?, cbiv: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEncrypt((hkey?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (ppaddinginfo?.value ?: 0L).toString(), (pbiv?.value ?: 0L).toString(), cbiv.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEnumAlgorithms(dwalgoperations.toInt(), (palgcount?.value ?: 0L).toString(), (ppalglist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctionProviders(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEnumContextFunctions(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEnumContexts(dwtable.toInt(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: COpaquePointer?, ppimpllist: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEnumProviders((pszalgid?.value ?: 0L).toString(), (pimplcount?.value ?: 0L).toString(), (ppimpllist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptEnumRegisteredProviders((pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptExportKey((hkey?.value ?: 0L).toString(), (hexportkey?.value ?: 0L).toString(), (pszblobtype?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptFinalizeKeyPair((hkey?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptFinishHash((hhash?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFreeBuffer(pvbuffer: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptFreeBuffer((pvbuffer?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: COpaquePointer?, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptGenRandom((halgorithm?.value ?: 0L).toString(), (pbbuffer?.value ?: 0L).toString(), cbbuffer.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, dwlength: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptGenerateKeyPair((halgorithm?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString(), dwlength.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbsecret: COpaquePointer?, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptGenerateSymmetricKey((halgorithm?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString(), (pbkeyobject?.value ?: 0L).toString(), cbkeyobject.toInt(), (pbsecret?.value ?: 0L).toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptGetFipsAlgorithmMode((pfenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptGetProperty((hobject?.value ?: 0L).toString(), (pszproperty?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: COpaquePointer?, cbsecret: UInt, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptHash((halgorithm?.value ?: 0L).toString(), (pbsecret?.value ?: 0L).toString(), cbsecret.toInt(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptHashData((hhash?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbkeyobject: COpaquePointer?, cbkeyobject: UInt, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptImportKey((halgorithm?.value ?: 0L).toString(), (himportkey?.value ?: 0L).toString(), (pszblobtype?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString(), (pbkeyobject?.value ?: 0L).toString(), cbkeyobject.toInt(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptImportKeyPair((halgorithm?.value ?: 0L).toString(), (himportkey?.value ?: 0L).toString(), (pszblobtype?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptKeyDerivation((hkey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), (pbderivedkey?.value ?: 0L).toString(), cbderivedkey.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: COpaquePointer?, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptOpenAlgorithmProvider((phalgorithm?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (pszimplementation?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: COpaquePointer?, cboperations: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptProcessMultiOperations((hobject?.value ?: 0L).toString(), operationtype, (poperations?.value ?: 0L).toString(), cboperations.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptQueryContextConfiguration(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionConfiguration(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: COpaquePointer?, ppbvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptQueryContextFunctionProperty(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pszproperty?.value ?: 0L).toString(), (pcbvalue?.value ?: 0L).toString(), (ppbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptQueryProviderRegistration((pszprovider?.value ?: 0L).toString(), dwmode.toInt(), dwinterface.toInt(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRegisterConfigChangeNotify(phevent: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptRegisterConfigChangeNotify((phevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptRegisterProvider((pszprovider?.value ?: 0L).toString(), dwflags.toInt(), (preg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunction(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptRemoveContextFunctionProvider(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pszprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: COpaquePointer?, ppbuffer: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptResolveProviders((pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pszprovider?.value ?: 0L).toString(), dwmode.toInt(), dwflags.toInt(), (pcbbuffer?.value ?: 0L).toString(), (ppbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptSecretAgreement((hprivkey?.value ?: 0L).toString(), (hpubkey?.value ?: 0L).toString(), (phagreedsecret?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: COpaquePointer?): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptSetContextFunctionProperty(dwtable.toInt(), (pszcontext?.value ?: 0L).toString(), dwinterface.toInt(), (pszfunction?.value ?: 0L).toString(), (pszproperty?.value ?: 0L).toString(), cbvalue.toInt(), (pbvalue?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptSetProperty((hobject?.value ?: 0L).toString(), (pszproperty?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: BcryptFlags): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptSignHash((hkey?.value ?: 0L).toString(), (ppaddinginfo?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptUnregisterConfigChangeNotify((hevent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptUnregisterProvider((pszprovider?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhash: COpaquePointer?, cbhash: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_bCryptVerifySignature((hkey?.value ?: 0L).toString(), (ppaddinginfo?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), cbhash.toInt(), (pbsignature?.value ?: 0L).toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddCRLContextToStore((hcertstore?.value ?: 0L).toString(), (pcrlcontext?.value ?: 0L).toString(), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddCRLLinkToStore((hcertstore?.value ?: 0L).toString(), (pcrlcontext?.value ?: 0L).toString(), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddCTLContextToStore((hcertstore?.value ?: 0L).toString(), (pctlcontext?.value ?: 0L).toString(), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddCTLLinkToStore((hcertstore?.value ?: 0L).toString(), (pctlcontext?.value ?: 0L).toString(), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddCertificateContextToStore((hcertstore?.value ?: 0L).toString(), (pcertcontext?.value ?: 0L).toString(), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: COpaquePointer?, dwadddisposition: UInt, ppstorecontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddCertificateLinkToStore((hcertstore?.value ?: 0L).toString(), (pcertcontext?.value ?: 0L).toString(), dwadddisposition.toInt(), (ppstorecontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddEncodedCRLToStore((hcertstore?.value ?: 0L).toString(), dwcertencodingtype.toInt(), (pbcrlencoded?.value ?: 0L).toString(), cbcrlencoded.toInt(), dwadddisposition.toInt(), (ppcrlcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: COpaquePointer?, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddEncodedCTLToStore((hcertstore?.value ?: 0L).toString(), dwmsgandcertencodingtype.toInt(), (pbctlencoded?.value ?: 0L).toString(), cbctlencoded.toInt(), dwadddisposition.toInt(), (ppctlcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToStore((hcertstore?.value ?: 0L).toString(), dwcertencodingtype.toInt(), (pbcertencoded?.value ?: 0L).toString(), cbcertencoded.toInt(), dwadddisposition.toInt(), (ppcertcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreA((szcertstorename?.value ?: 0L).toString(), (pbcertencoded?.value ?: 0L).toString(), cbcertencoded.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddEncodedCertificateToSystemStoreW((szcertstorename?.value ?: 0L).toString(), (pbcertencoded?.value ?: 0L).toString(), cbcertencoded.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddEnhancedKeyUsageIdentifier((pcertcontext?.value ?: 0L).toString(), (pszusageidentifier?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddRefServerOcspResponse(hserverocspresponse: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponse((hserverocspresponse?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddRefServerOcspResponseContext((pserverocspresponsecontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: COpaquePointer?, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: COpaquePointer?, ppvcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddSerializedElementToStore((hcertstore?.value ?: 0L).toString(), (pbelement?.value ?: 0L).toString(), cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), (pdwcontexttype?.value ?: 0L).toString(), (ppvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAddStoreToCollection((hcollectionstore?.value ?: 0L).toString(), (hsiblingstore?.value ?: 0L).toString(), dwupdateflags.toInt(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certAlgIdToOID(dwalgid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCloseServerOcspResponse(hserverocspresponse: COpaquePointer?, dwflags: UInt) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCloseServerOcspResponse((hserverocspresponse?.value ?: 0L).toString(), dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCloseStore((hcertstore?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: COpaquePointer?, pcertid2: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCompareCertificate(dwcertencodingtype.toInt(), (pcertid1?.value ?: 0L).toString(), (pcertid2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: COpaquePointer?, pcertname2: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCompareCertificateName(dwcertencodingtype.toInt(), (pcertname1?.value ?: 0L).toString(), (pcertname2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareIntegerBlob(pint1: COpaquePointer?, pint2: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCompareIntegerBlob((pint1?.value ?: 0L).toString(), (pint2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: COpaquePointer?, ppublickey2: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certComparePublicKeyInfo(dwcertencodingtype.toInt(), (ppublickey1?.value ?: 0L).toString(), (ppublickey2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certControlStore((hcertstore?.value ?: 0L).toString(), dwflags.toInt(), dwctrltype.toInt(), (pvctrlpara?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: COpaquePointer?, cbcrlencoded: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateCRLContext(dwcertencodingtype.toInt(), (pbcrlencoded?.value ?: 0L).toString(), cbcrlencoded.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: COpaquePointer?, cbctlencoded: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateCTLContext(dwmsgandcertencodingtype.toInt(), (pbctlencoded?.value ?: 0L).toString(), cbctlencoded.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: COpaquePointer?, coptattr: UInt, rgoptattr: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pctlentry: COpaquePointer?, pcbctlentry: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateCTLEntryFromCertificateContextProperties((pcertcontext?.value ?: 0L).toString(), coptattr.toInt(), (rgoptattr?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (pctlentry?.value ?: 0L).toString(), (pcbctlentry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCertificateChainEngine(pconfig: COpaquePointer?, phchainengine: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateCertificateChainEngine((pconfig?.value ?: 0L).toString(), (phchainengine?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: COpaquePointer?, cbcertencoded: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateCertificateContext(dwcertencodingtype.toInt(), (pbcertencoded?.value ?: 0L).toString(), cbcertencoded.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pcreatepara: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), dwflags.toInt(), (pcreatepara?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: COpaquePointer?, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pstarttime: COpaquePointer?, pendtime: COpaquePointer?, pextensions: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certCreateSelfSignCertificate(hcryptprovorncryptkey.toString(), (psubjectissuerblob?.value ?: 0L).toString(), dwflags.toInt(), (pkeyprovinfo?.value ?: 0L).toString(), (psignaturealgorithm?.value ?: 0L).toString(), (pstarttime?.value ?: 0L).toString(), (pendtime?.value ?: 0L).toString(), (pextensions?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCRLFromStore(pcrlcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDeleteCRLFromStore((pcrlcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCTLFromStore(pctlcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDeleteCTLFromStore((pctlcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCertificateFromStore(pcertcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDeleteCertificateFromStore((pcertcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCRLContext(pcrlcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDuplicateCRLContext((pcrlcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCTLContext(pctlcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDuplicateCTLContext((pctlcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCertificateChain(pchaincontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDuplicateCertificateChain((pchaincontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCertificateContext(pcertcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDuplicateCertificateContext((pcertcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certDuplicateStore((hcertstore?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCRLContextProperties(pcrlcontext: COpaquePointer?, dwpropid: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumCRLContextProperties((pcrlcontext?.value ?: 0L).toString(), dwpropid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumCRLsInStore((hcertstore?.value ?: 0L).toString(), (pprevcrlcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCTLContextProperties(pctlcontext: COpaquePointer?, dwpropid: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumCTLContextProperties((pctlcontext?.value ?: 0L).toString(), dwpropid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumCTLsInStore((hcertstore?.value ?: 0L).toString(), (pprevctlcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCertificateContextProperties(pcertcontext: COpaquePointer?, dwpropid: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumCertificateContextProperties((pcertcontext?.value ?: 0L).toString(), dwpropid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumCertificatesInStore((hcertstore?.value ?: 0L).toString(), (pprevcertcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumPhysicalStore): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumPhysicalStore((pvsystemstore?.value ?: 0L).toString(), dwflags.toInt(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSubjectInSortedCTL(pctlcontext: COpaquePointer?, ppvnextsubject: COpaquePointer?, psubjectidentifier: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumSubjectInSortedCTL((pctlcontext?.value ?: 0L).toString(), (ppvnextsubject?.value ?: 0L).toString(), (psubjectidentifier?.value ?: 0L).toString(), (pencodedattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStore): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumSystemStore(dwflags.toInt(), (pvsystemstorelocationpara?.value ?: 0L).toString(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: COpaquePointer?, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certEnumSystemStoreLocation(dwflags.toInt(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindAttribute((pszobjid?.value ?: 0L).toString(), cattr.toInt(), (rgattr?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevcrlcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindCRLInStore((hcertstore?.value ?: 0L).toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L).toString(), (pprevcrlcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: COpaquePointer?, pprevctlcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindCTLInStore((hcertstore?.value ?: 0L).toString(), dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L).toString(), (pprevctlcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCertificateInCRL(pcert: COpaquePointer?, pcrlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppcrlentry: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindCertificateInCRL((pcert?.value ?: 0L).toString(), (pcrlcontext?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (ppcrlentry?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: COpaquePointer?, pprevcertcontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindCertificateInStore((hcertstore?.value ?: 0L).toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L).toString(), (pprevcertcontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: COpaquePointer?, pprevchaincontext: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindChainInStore((hcertstore?.value ?: 0L).toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), (pvfindpara?.value ?: 0L).toString(), (pprevchaincontext?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindExtension((pszobjid?.value ?: 0L).toString(), cextensions.toInt(), (rgextensions?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindRDNAttr((pszobjid?.value ?: 0L).toString(), (pname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), (pvsubject?.value ?: 0L).toString(), (pctlcontext?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: COpaquePointer?, pctlcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, pencodedattributes: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFindSubjectInSortedCTL((psubjectidentifier?.value ?: 0L).toString(), (pctlcontext?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (pencodedattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCRLContext(pcrlcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeCRLContext((pcrlcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCTLContext(pctlcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeCTLContext((pctlcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCertificateChain(pchaincontext: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeCertificateChain((pchaincontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeCertificateChainEngine((hchainengine?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateChainList(prgpselection: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeCertificateChainList((prgpselection?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateContext(pcertcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeCertificateContext((pcertcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certFreeServerOcspResponseContext((pserverocspresponsecontext?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certGetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetCRLContextProperty((pcrlcontext?.value ?: 0L).toString(), dwpropid.toInt(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: COpaquePointer?, pprevcrlcontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetCRLFromStore((hcertstore?.value ?: 0L).toString(), (pissuercontext?.value ?: 0L).toString(), (pprevcrlcontext?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetCTLContextProperty((pctlcontext?.value ?: 0L).toString(), dwpropid.toInt(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: COpaquePointer?, ptime: COpaquePointer?, hadditionalstore: Hcertstore, pchainpara: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?, ppchaincontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetCertificateChain((hchainengine?.value ?: 0L).toString(), (pcertcontext?.value ?: 0L).toString(), (ptime?.value ?: 0L).toString(), (hadditionalstore?.value ?: 0L).toString(), (pchainpara?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (ppchaincontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetCertificateContextProperty((pcertcontext?.value ?: 0L).toString(), dwpropid.toInt(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetEnhancedKeyUsage(pcertcontext: COpaquePointer?, dwflags: UInt, pusage: COpaquePointer?, pcbusage: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetEnhancedKeyUsage((pcertcontext?.value ?: 0L).toString(), dwflags.toInt(), (pusage?.value ?: 0L).toString(), (pcbusage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: COpaquePointer?, pbkeyusage: COpaquePointer?, cbkeyusage: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetIntendedKeyUsage(dwcertencodingtype.toInt(), (pcertinfo?.value ?: 0L).toString(), (pbkeyusage?.value ?: 0L).toString(), cbkeyusage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: COpaquePointer?, pprevissuercontext: COpaquePointer?, pdwflags: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetIssuerCertificateFromStore((hcertstore?.value ?: 0L).toString(), (psubjectcontext?.value ?: 0L).toString(), (pprevissuercontext?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetNameStringA(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pstr, cchnamestring: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetNameStringA((pcertcontext?.value ?: 0L).toString(), dwtype.toInt(), dwflags.toInt(), (pvtypepara?.value ?: 0L).toString(), (psznamestring?.value ?: 0L).toString(), cchnamestring.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetNameStringW(pcertcontext: COpaquePointer?, dwtype: UInt, dwflags: UInt, pvtypepara: COpaquePointer?, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetNameStringW((pcertcontext?.value ?: 0L).toString(), dwtype.toInt(), dwflags.toInt(), (pvtypepara?.value ?: 0L).toString(), (psznamestring?.value ?: 0L).toString(), cchnamestring.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: COpaquePointer?): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetPublicKeyLength(dwcertencodingtype.toInt(), (ppublickey?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetServerOcspResponseContext(hserverocspresponse: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetServerOcspResponseContext((hserverocspresponse?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetStoreProperty((hcertstore?.value ?: 0L).toString(), dwpropid.toInt(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetSubjectCertificateFromStore((hcertstore?.value ?: 0L).toString(), dwcertencodingtype.toInt(), (pcertid?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: COpaquePointer?, cnumoids: COpaquePointer?, rghoids: COpaquePointer?, pcboids: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certGetValidUsages(ccerts.toInt(), (rghcerts?.value ?: 0L).toString(), (cnumoids?.value ?: 0L).toString(), (rghoids?.value ?: 0L).toString(), (pcboids?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: COpaquePointer?, prdn: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), (pcertname?.value ?: 0L).toString(), (prdn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsStrongHashToSign(pstrongsignpara: COpaquePointer?, pwszcnghashalgid: Pcwstr, psigningcert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certIsStrongHashToSign((pstrongsignpara?.value ?: 0L).toString(), (pwszcnghashalgid?.value ?: 0L).toString(), (psigningcert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsValidCRLForCertificate(pcert: COpaquePointer?, pcrl: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certIsValidCRLForCertificate((pcert?.value ?: 0L).toString(), (pcrl?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: COpaquePointer?, ptimestamp: COpaquePointer?, pwszfilename: Pcwstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certIsWeakHash(dwhashusetype.toInt(), (pwszcnghashalgid?.value ?: 0L).toString(), dwchainflags.toInt(), (psignerchaincontext?.value ?: 0L).toString(), (ptimestamp?.value ?: 0L).toString(), (pwszfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certNameToStrA(dwcertencodingtype.toInt(), (pname?.value ?: 0L).toString(), dwstrtype.toInt(), (psz?.value ?: 0L).toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: COpaquePointer?, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certNameToStrW(dwcertencodingtype.toInt(), (pname?.value ?: 0L).toString(), dwstrtype.toInt(), (psz?.value ?: 0L).toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certOIDToAlgId((pszobjid?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenServerOcspResponse(pchaincontext: COpaquePointer?, dwflags: UInt, popenpara: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certOpenServerOcspResponse((pchaincontext?.value ?: 0L).toString(), dwflags.toInt(), (popenpara?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: COpaquePointer?): Hcertstore =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certOpenStore((lpszstoreprovider?.value ?: 0L).toString(), dwencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), (pvpara?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certOpenSystemStoreA(hprov.toString(), (szsubsystemprotocol?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certOpenSystemStoreW(hprov.toString(), (szsubsystemprotocol?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pstr, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRDNValueToStrA(dwvaluetype.toInt(), (pvalue?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: COpaquePointer?, psz: Pwstr, csz: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRDNValueToStrW(dwvaluetype.toInt(), (pvalue?.value ?: 0L).toString(), (psz?.value ?: 0L).toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRegisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRegisterPhysicalStore((pvsystemstore?.value ?: 0L).toString(), dwflags.toInt(), (pwszstorename?.value ?: 0L).toString(), (pstoreinfo?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRegisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pstoreinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRegisterSystemStore((pvsystemstore?.value ?: 0L).toString(), dwflags.toInt(), (pstoreinfo?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: COpaquePointer?, pszusageidentifier: Pcstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRemoveEnhancedKeyUsageIdentifier((pcertcontext?.value ?: 0L).toString(), (pszusageidentifier?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRemoveStoreFromCollection((hcollectionstore?.value ?: 0L).toString(), (hsiblingstore?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certResyncCertificateChainEngine((hchainengine?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: COpaquePointer?, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: COpaquePointer?, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?, ppwszmimetype: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certRetrieveLogoOrBiometricInfo((pcertcontext?.value ?: 0L).toString(), (lpszlogoorbiometrictype?.value ?: 0L).toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (ppbdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString(), (ppwszmimetype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSaveStore((hcertstore?.value ?: 0L).toString(), dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), (pvsavetopara?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSelectCertificateChains(pselectioncontext: COpaquePointer?, dwflags: UInt, pchainparameters: COpaquePointer?, ccriteria: UInt, rgpcriteria: COpaquePointer?, hstore: Hcertstore, pcselection: COpaquePointer?, pprgpselection: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSelectCertificateChains((pselectioncontext?.value ?: 0L).toString(), dwflags.toInt(), (pchainparameters?.value ?: 0L).toString(), ccriteria.toInt(), (rgpcriteria?.value ?: 0L).toString(), (hstore?.value ?: 0L).toString(), (pcselection?.value ?: 0L).toString(), (pprgpselection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCRLStoreElement(pcrlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSerializeCRLStoreElement((pcrlcontext?.value ?: 0L).toString(), dwflags.toInt(), (pbelement?.value ?: 0L).toString(), (pcbelement?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCTLStoreElement(pctlcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSerializeCTLStoreElement((pctlcontext?.value ?: 0L).toString(), dwflags.toInt(), (pbelement?.value ?: 0L).toString(), (pcbelement?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCertificateStoreElement(pcertcontext: COpaquePointer?, dwflags: UInt, pbelement: COpaquePointer?, pcbelement: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSerializeCertificateStoreElement((pcertcontext?.value ?: 0L).toString(), dwflags.toInt(), (pbelement?.value ?: 0L).toString(), (pcbelement?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCRLContextProperty(pcrlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSetCRLContextProperty((pcrlcontext?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCTLContextProperty(pctlcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSetCTLContextProperty((pctlcontext?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: COpaquePointer?, pctlentry: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSetCertificateContextPropertiesFromCTLEntry((pcertcontext?.value ?: 0L).toString(), (pctlentry?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCertificateContextProperty(pcertcontext: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSetCertificateContextProperty((pcertcontext?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetEnhancedKeyUsage(pcertcontext: COpaquePointer?, pusage: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSetEnhancedKeyUsage((pcertcontext?.value ?: 0L).toString(), (pusage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certSetStoreProperty((hcertstore?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certStrToNameA(dwcertencodingtype.toInt(), (pszx500?.value ?: 0L).toString(), dwstrtype.toInt(), (pvreserved?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString(), (ppszerror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?, ppszerror: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certStrToNameW(dwcertencodingtype.toInt(), (pszx500?.value ?: 0L).toString(), dwstrtype.toInt(), (pvreserved?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString(), (ppszerror?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certUnregisterPhysicalStore(pvsystemstore: COpaquePointer?, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certUnregisterPhysicalStore((pvsystemstore?.value ?: 0L).toString(), dwflags.toInt(), (pwszstorename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certUnregisterSystemStore(pvsystemstore: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certUnregisterSystemStore((pvsystemstore?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: COpaquePointer?, ccrlinfo: UInt, rgpcrlinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyCRLRevocation(dwcertencodingtype.toInt(), (pcertid?.value ?: 0L).toString(), ccrlinfo.toInt(), (rgpcrlinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCRLTimeValidity(ptimetoverify: COpaquePointer?, pcrlinfo: COpaquePointer?): Int =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyCRLTimeValidity((ptimetoverify?.value ?: 0L).toString(), (pcrlinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: COpaquePointer?, psubjectusage: COpaquePointer?, dwflags: UInt, pverifyusagepara: COpaquePointer?, pverifyusagestatus: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), (pvsubject?.value ?: 0L).toString(), (psubjectusage?.value ?: 0L).toString(), dwflags.toInt(), (pverifyusagepara?.value ?: 0L).toString(), (pverifyusagestatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: COpaquePointer?, ppolicypara: COpaquePointer?, ppolicystatus: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyCertificateChainPolicy((pszpolicyoid?.value ?: 0L).toString(), (pchaincontext?.value ?: 0L).toString(), (ppolicypara?.value ?: 0L).toString(), (ppolicystatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: COpaquePointer?, dwflags: UInt, prevpara: COpaquePointer?, prevstatus: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), (rgpvcontext?.value ?: 0L).toString(), dwflags.toInt(), (prevpara?.value ?: 0L).toString(), (prevstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifySubjectCertificateContext(psubject: COpaquePointer?, pissuer: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifySubjectCertificateContext((psubject?.value ?: 0L).toString(), (pissuer?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyTimeValidity(ptimetoverify: COpaquePointer?, pcertinfo: COpaquePointer?): Int =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyTimeValidity((ptimetoverify?.value ?: 0L).toString(), (pcertinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyValidityNesting(psubjectinfo: COpaquePointer?, pissuerinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_certVerifyValidityNesting((psubjectinfo?.value ?: 0L).toString(), (pissuerinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeCryptoHandle(hcrypto: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_closeCryptoHandle((hcrypto?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireCertificatePrivateKey(pcert: COpaquePointer?, dwflags: CryptAcquireFlags, pvparameters: COpaquePointer?, phcryptprovorncryptkey: COpaquePointer?, pdwkeyspec: COpaquePointer?, pfcallerfreeprovorncryptkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptAcquireCertificatePrivateKey((pcert?.value ?: 0L).toString(), dwflags.toInt(), (pvparameters?.value ?: 0L).toString(), (phcryptprovorncryptkey?.value ?: 0L).toString(), (pdwkeyspec?.value ?: 0L).toString(), (pfcallerfreeprovorncryptkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireContextA(phprov: COpaquePointer?, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptAcquireContextA((phprov?.value ?: 0L).toString(), (szcontainer?.value ?: 0L).toString(), (szprovider?.value ?: 0L).toString(), dwprovtype.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireContextW(phprov: COpaquePointer?, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptAcquireContextW((phprov?.value ?: 0L).toString(), (szcontainer?.value ?: 0L).toString(), (szprovider?.value ?: 0L).toString(), dwprovtype.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptBinaryToStringA(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptBinaryToStringA((pbbinary?.value ?: 0L).toString(), cbbinary.toInt(), dwflags.toInt(), (pszstring?.value ?: 0L).toString(), (pcchstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptBinaryToStringW(pbbinary: COpaquePointer?, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptBinaryToStringW((pbbinary?.value ?: 0L).toString(), cbbinary.toInt(), dwflags.toInt(), (pszstring?.value ?: 0L).toString(), (pcchstring?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptCloseAsyncHandle(hasync.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptContextAddRef(hprov.toString(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptCreateAsyncHandle(dwflags.toInt(), (phasync?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptCreateHash(hprov.toString(), algid.toInt(), hkey.toString(), dwflags.toInt(), (phhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: COpaquePointer?, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: COpaquePointer?, pbhash: COpaquePointer?, pcbhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), (pszpubkeyoid?.value ?: 0L).toString(), (ppubkeystruc?.value ?: 0L).toString(), cbpubkeystruc.toInt(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (pbhash?.value ?: 0L).toString(), (pcbhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencodedblob: COpaquePointer?, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: COpaquePointer?, pdwinnercontenttype: COpaquePointer?, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDecodeMessage(dwmsgtypeflags.toInt(), (pdecryptpara?.value ?: 0L).toString(), (pverifypara?.value ?: 0L).toString(), dwsignerindex.toInt(), (pbencodedblob?.value ?: 0L).toString(), cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), (pdwmsgtype?.value ?: 0L).toString(), (pdwinnercontenttype?.value ?: 0L).toString(), (pbdecoded?.value ?: 0L).toString(), (pcbdecoded?.value ?: 0L).toString(), (ppxchgcert?.value ?: 0L).toString(), (ppsignercert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDecodeObject(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), dwflags.toInt(), (pvstructinfo?.value ?: 0L).toString(), (pcbstructinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, dwflags: UInt, pdecodepara: COpaquePointer?, pvstructinfo: COpaquePointer?, pcbstructinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDecodeObjectEx(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), dwflags.toInt(), (pdecodepara?.value ?: 0L).toString(), (pvstructinfo?.value ?: 0L).toString(), (pcbstructinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDecrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), (pbdata?.value ?: 0L).toString(), (pdwdatalen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: COpaquePointer?, pverifypara: COpaquePointer?, dwsignerindex: UInt, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDecryptAndVerifyMessageSignature((pdecryptpara?.value ?: 0L).toString(), (pverifypara?.value ?: 0L).toString(), dwsignerindex.toInt(), (pbencryptedblob?.value ?: 0L).toString(), cbencryptedblob.toInt(), (pbdecrypted?.value ?: 0L).toString(), (pcbdecrypted?.value ?: 0L).toString(), (ppxchgcert?.value ?: 0L).toString(), (ppsignercert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecryptMessage(pdecryptpara: COpaquePointer?, pbencryptedblob: COpaquePointer?, cbencryptedblob: UInt, pbdecrypted: COpaquePointer?, pcbdecrypted: COpaquePointer?, ppxchgcert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDecryptMessage((pdecryptpara?.value ?: 0L).toString(), (pbencryptedblob?.value ?: 0L).toString(), cbencryptedblob.toInt(), (pbdecrypted?.value ?: 0L).toString(), (pcbdecrypted?.value ?: 0L).toString(), (ppxchgcert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDeriveKey(hprov.toString(), algid.toInt(), hbasedata.toString(), dwflags.toInt(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDestroyHash(hhash.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDestroyKey(hkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDuplicateHash(hhash.toString(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (phhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: COpaquePointer?, dwflags: UInt, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptDuplicateKey(hkey.toString(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEncodeObject(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L).toString(), (pvstructinfo?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, dwflags: CryptEncodeObjectFlags, pencodepara: COpaquePointer?, pvencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEncodeObjectEx(dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L).toString(), (pvstructinfo?.value ?: 0L).toString(), dwflags.toInt(), (pencodepara?.value ?: 0L).toString(), (pvencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwbuflen: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEncrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), (pbdata?.value ?: 0L).toString(), (pdwdatalen?.value ?: 0L).toString(), dwbuflen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncryptMessage(pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobeencrypted: COpaquePointer?, cbtobeencrypted: UInt, pbencryptedblob: COpaquePointer?, pcbencryptedblob: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEncryptMessage((pencryptpara?.value ?: 0L).toString(), crecipientcert.toInt(), (rgprecipientcert?.value ?: 0L).toString(), (pbtobeencrypted?.value ?: 0L).toString(), cbtobeencrypted.toInt(), (pbencryptedblob?.value ?: 0L).toString(), (pcbencryptedblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvarg: COpaquePointer?, pfnenum: PfnCryptEnumKeyidProp): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumKeyIdentifierProperties((pkeyidentifier?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pwszcomputername?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), (pszoid?.value ?: 0L).toString(), dwflags.toInt(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pstr, pcbtypename: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesA(dwindex.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (pdwprovtype?.value ?: 0L).toString(), (sztypename?.value ?: 0L).toString(), (pcbtypename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, sztypename: Pwstr, pcbtypename: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumProviderTypesW(dwindex.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (pdwprovtype?.value ?: 0L).toString(), (sztypename?.value ?: 0L).toString(), (pcbtypename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pstr, pcbprovname: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumProvidersA(dwindex.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (pdwprovtype?.value ?: 0L).toString(), (szprovname?.value ?: 0L).toString(), (pcbprovname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pdwprovtype: COpaquePointer?, szprovname: Pwstr, pcbprovname: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptEnumProvidersW(dwindex.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (pdwprovtype?.value ?: 0L).toString(), (szprovname?.value ?: 0L).toString(), (pcbprovname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptExportKey(hkey.toString(), hexpkey.toString(), dwblobtype.toInt(), dwflags.toInt(), (pbdata?.value ?: 0L).toString(), (pdwdatalen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pbprivatekeyblob: COpaquePointer?, pcbprivatekeyblob: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptExportPKCS8(hcryptprov.toString(), dwkeyspec.toInt(), (pszprivatekeyobjid?.value ?: 0L).toString(), dwflags.toInt(), (pvauxinfo?.value ?: 0L).toString(), (pbprivatekeyblob?.value ?: 0L).toString(), (pcbprivatekeyblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfo(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L).toString(), (pcbinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (pszpublickeyobjid?.value ?: 0L).toString(), dwflags.toInt(), (pvauxinfo?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString(), (pcbinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: COpaquePointer?, pinfo: COpaquePointer?, pcbinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptExportPublicKeyInfoFromBCryptKeyHandle((hbcryptkey?.value ?: 0L).toString(), dwcertencodingtype.toInt(), (pszpublickeyobjid?.value ?: 0L).toString(), dwflags.toInt(), (pvauxinfo?.value ?: 0L).toString(), (pinfo?.value ?: 0L).toString(), (pcbinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindCertificateKeyProvInfo(pcert: COpaquePointer?, dwflags: CryptFindFlags, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptFindCertificateKeyProvInfo((pcert?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptFindLocalizedName((pwszcryptname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: COpaquePointer?, dwgroupid: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptFindOIDInfo(dwkeytype.toInt(), (pvkey?.value ?: 0L).toString(), dwgroupid.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: COpaquePointer?, lpszstructtype: Pcstr, pbencoded: COpaquePointer?, cbencoded: UInt, pbformat: COpaquePointer?, pcbformat: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), (pformatstruct?.value ?: 0L).toString(), (lpszstructtype?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), (pbformat?.value ?: 0L).toString(), (pcbformat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptFreeOIDFunctionAddress((hfuncaddr?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGenKey(hprov.toString(), algid.toInt(), dwflags.toInt(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGenRandom(hprov.toString(), dwlen.toInt(), (pbbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: COpaquePointer?, ppfnfree: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetAsyncParam(hasync.toString(), (pszparamoid?.value ?: 0L).toString(), (ppvparam?.value ?: 0L).toString(), (ppfnfree?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultOIDDllList(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDDllList((hfuncset?.value ?: 0L).toString(), dwencodingtype.toInt(), (pwszdlllist?.value ?: 0L).toString(), (pcchdlllist?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetDefaultOIDFunctionAddress((hfuncset?.value ?: 0L).toString(), dwencodingtype.toInt(), (pwszdll?.value ?: 0L).toString(), dwflags.toInt(), (ppvfuncaddr?.value ?: 0L).toString(), (phfuncaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pstr, pcbprovname: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderA(dwprovtype.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (pszprovname?.value ?: 0L).toString(), (pcbprovname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt, pszprovname: Pwstr, pcbprovname: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetDefaultProviderW(dwprovtype.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt(), (pszprovname?.value ?: 0L).toString(), (pcbprovname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetHashParam(hhash.toString(), dwparam.toInt(), (pbdata?.value ?: 0L).toString(), (pdwdatalen?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetKeyIdentifierProperty((pkeyidentifier?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pwszcomputername?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetKeyParam(hkey.toString(), dwparam.toInt(), (pbdata?.value ?: 0L).toString(), (pdwdatalen?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Hcertstore =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), (pbsignedblob?.value ?: 0L).toString(), cbsignedblob.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt): Int =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetMessageSignerCount(dwmsgencodingtype.toInt(), (pbsignedblob?.value ?: 0L).toString(), cbsignedblob.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetOIDFunctionAddress(hfuncset: COpaquePointer?, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: COpaquePointer?, phfuncaddr: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionAddress((hfuncset?.value ?: 0L).toString(), dwencodingtype.toInt(), (pszoid?.value ?: 0L).toString(), dwflags.toInt(), (ppvfuncaddr?.value ?: 0L).toString(), (phfuncaddr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: COpaquePointer?, pbvaluedata: COpaquePointer?, pcbvaluedata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetOIDFunctionValue(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), (pszoid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), (pdwvaluetype?.value ?: 0L).toString(), (pbvaluedata?.value ?: 0L).toString(), (pcbvaluedata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: COpaquePointer?, dwflags: CryptGetUrlFlags, purlarray: COpaquePointer?, pcburlarray: COpaquePointer?, purlinfo: COpaquePointer?, pcburlinfo: COpaquePointer?, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetObjectUrl((pszurloid?.value ?: 0L).toString(), (pvpara?.value ?: 0L).toString(), dwflags.toInt(), (purlarray?.value ?: 0L).toString(), (pcburlarray?.value ?: 0L).toString(), (purlinfo?.value ?: 0L).toString(), (pcburlinfo?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: COpaquePointer?, pdwdatalen: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetProvParam(hprov.toString(), dwparam.toInt(), (pbdata?.value ?: 0L).toString(), (pdwdatalen?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptGetUserKey(hprov.toString(), dwkeyspec.toInt(), (phuserkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashCertificate(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: COpaquePointer?, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashCertificate2((pwszcnghashalgid?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashData(hhash: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashData(hhash.toString(), (pbdata?.value ?: 0L).toString(), dwdatalen.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashMessage(phashpara: COpaquePointer?, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbhashedblob: COpaquePointer?, pcbhashedblob: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashMessage((phashpara?.value ?: 0L).toString(), fdetachedhash, ctobehashed.toInt(), (rgpbtobehashed?.value ?: 0L).toString(), (rgcbtobehashed?.value ?: 0L).toString(), (pbhashedblob?.value ?: 0L).toString(), (pcbhashedblob?.value ?: 0L).toString(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashPublicKeyInfo(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L).toString(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashSessionKey(hhash.toString(), hkey.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptHashToBeSigned(hcryptprov.toString(), dwcertencodingtype.toInt(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportKey(hprov: ULong, pbdata: COpaquePointer?, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptImportKey(hprov.toString(), (pbdata?.value ?: 0L).toString(), dwdatalen.toInt(), hpubkey.toString(), dwflags.toInt(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: COpaquePointer?, pvauxinfo: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfo(hcryptprov.toString(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx(hcryptprov.toString(), dwcertencodingtype.toInt(), (pinfo?.value ?: 0L).toString(), aikeyalg.toInt(), dwflags.toInt(), (pvauxinfo?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: COpaquePointer?, dwflags: CryptImportPublicKeyFlags, pvauxinfo: COpaquePointer?, phkey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), (pinfo?.value ?: 0L).toString(), dwflags.toInt(), (pvauxinfo?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptInitOIDFunctionSet((pszfuncname?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptInstallCancelRetrieval(0L.toString(), (pvarg?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: COpaquePointer?, dwflags: CryptDefaultContextFlags, pvreserved: COpaquePointer?, phdefaultcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptInstallDefaultContext(hcryptprov.toString(), dwdefaulttype.toInt(), (pvdefaultpara?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString(), (phdefaultcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptInstallOIDFunctionAddress((hmodule?.value ?: 0L).toString(), dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), cfuncentry.toInt(), (rgfuncentry?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMemAlloc(cbsize: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMemAlloc(cbsize.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMemFree(pv: COpaquePointer?) {
    if (_windowsWin32SecurityCryptographyNapiAddon != null) {
        _windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMemFree((pv?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptMemRealloc(pv: COpaquePointer?, cbsize: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMemRealloc((pv?.value ?: 0L).toString(), cbsize.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), (pvmsgencodeinfo?.value ?: 0L).toString(), (pszinnercontentobjid?.value ?: 0L).toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgClose(hcryptmsg: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgClose((hcryptmsg?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgControl(hcryptmsg: COpaquePointer?, dwflags: UInt, dwctrltype: UInt, pvctrlpara: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgControl((hcryptmsg?.value ?: 0L).toString(), dwflags.toInt(), dwctrltype.toInt(), (pvctrlpara?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCountersign(hcryptmsg: COpaquePointer?, dwindex: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgCountersign((hcryptmsg?.value ?: 0L).toString(), dwindex.toInt(), ccountersigners.toInt(), (rgcountersigners?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: COpaquePointer?, pbcountersignature: COpaquePointer?, pcbcountersignature: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgCountersignEncoded(dwencodingtype.toInt(), (pbsignerinfo?.value ?: 0L).toString(), cbsignerinfo.toInt(), ccountersigners.toInt(), (rgcountersigners?.value ?: 0L).toString(), (pbcountersignature?.value ?: 0L).toString(), (pcbcountersignature?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgDuplicate(hcryptmsg: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgDuplicate((hcryptmsg?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: COpaquePointer?, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), (pctlinfo?.value ?: 0L).toString(), (psigninfo?.value ?: 0L).toString(), dwflags.toInt(), (pbencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: COpaquePointer?, csignerstore: UInt, rghsignerstore: COpaquePointer?, dwflags: UInt, ppsigner: COpaquePointer?, pdwsignerindex: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgGetAndVerifySigner((hcryptmsg?.value ?: 0L).toString(), csignerstore.toInt(), (rghsignerstore?.value ?: 0L).toString(), dwflags.toInt(), (ppsigner?.value ?: 0L).toString(), (pdwsignerindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgGetParam(hcryptmsg: COpaquePointer?, dwparamtype: UInt, dwindex: UInt, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgGetParam((hcryptmsg?.value ?: 0L).toString(), dwparamtype.toInt(), dwindex.toInt(), (pvdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: COpaquePointer?, pstreaminfo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toString(), (precipientinfo?.value ?: 0L).toString(), (pstreaminfo?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: COpaquePointer?, pszinnercontentobjid: Pcstr, pstreaminfo: COpaquePointer?): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), (pvmsgencodeinfo?.value ?: 0L).toString(), (pszinnercontentobjid?.value ?: 0L).toString(), (pstreaminfo?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: COpaquePointer?, cbctlcontent: UInt, psigninfo: COpaquePointer?, dwflags: UInt, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgSignCTL(dwmsgencodingtype.toInt(), (pbctlcontent?.value ?: 0L).toString(), cbctlcontent.toInt(), (psigninfo?.value ?: 0L).toString(), dwflags.toInt(), (pbencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgUpdate(hcryptmsg: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, ffinal: Bool): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgUpdate((hcryptmsg?.value ?: 0L).toString(), (pbdata?.value ?: 0L).toString(), cbdata.toInt(), ffinal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, pcicountersigner: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncoded(hcryptprov.toString(), dwencodingtype.toInt(), (pbsignerinfo?.value ?: 0L).toString(), cbsignerinfo.toInt(), (pbsignerinfocountersignature?.value ?: 0L).toString(), cbsignerinfocountersignature.toInt(), (pcicountersigner?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: COpaquePointer?, cbsignerinfo: UInt, pbsignerinfocountersignature: COpaquePointer?, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: COpaquePointer?, dwflags: UInt, pvextra: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toString(), dwencodingtype.toInt(), (pbsignerinfo?.value ?: 0L).toString(), cbsignerinfo.toInt(), (pbsignerinfocountersignature?.value ?: 0L).toString(), cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), (pvsigner?.value ?: 0L).toString(), dwflags.toInt(), (pvextra?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptProtectData(pdatain: COpaquePointer?, szdatadescr: Pcwstr, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptProtectData((pdatain?.value ?: 0L).toString(), (szdatadescr?.value ?: 0L).toString(), (poptionalentropy?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (ppromptstruct?.value ?: 0L).toString(), dwflags.toInt(), (pdataout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptProtectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptProtectMemory((pdatain?.value ?: 0L).toString(), cbdatain.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: COpaquePointer?, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: COpaquePointer?, pdwcontenttype: COpaquePointer?, pdwformattype: COpaquePointer?, phcertstore: COpaquePointer?, phmsg: COpaquePointer?, ppvcontext: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptQueryObject(dwobjecttype.toInt(), (pvobject?.value ?: 0L).toString(), dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), (pdwmsgandcertencodingtype?.value ?: 0L).toString(), (pdwcontenttype?.value ?: 0L).toString(), (pdwformattype?.value ?: 0L).toString(), (phcertstore?.value ?: 0L).toString(), (phmsg?.value ?: 0L).toString(), (ppvcontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), dwindex.toInt(), (pwszdll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptRegisterOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), (pszoid?.value ?: 0L).toString(), (pwszdll?.value ?: 0L).toString(), (pszoverridefuncname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterOIDInfo(pinfo: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptRegisterOIDInfo((pinfo?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptReleaseContext(hprov.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlA((pszurl?.value ?: 0L).toString(), (pszobjectoid?.value ?: 0L).toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), (ppvobject?.value ?: 0L).toString(), hasyncretrieve.toString(), (pcredentials?.value ?: 0L).toString(), (pvverify?.value ?: 0L).toString(), (pauxinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: COpaquePointer?, hasyncretrieve: Hcryptasync, pcredentials: COpaquePointer?, pvverify: COpaquePointer?, pauxinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptRetrieveObjectByUrlW((pszurl?.value ?: 0L).toString(), (pszobjectoid?.value ?: 0L).toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), (ppvobject?.value ?: 0L).toString(), hasyncretrieve.toString(), (pcredentials?.value ?: 0L).toString(), (pvverify?.value ?: 0L).toString(), (pauxinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptRetrieveTimeStamp((wszurl?.value ?: 0L).toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), (pszhashid?.value ?: 0L).toString(), (ppara?.value ?: 0L).toString(), (pbdata?.value ?: 0L).toString(), cbdata.toInt(), (pptscontext?.value ?: 0L).toString(), (pptssigner?.value ?: 0L).toString(), (phstore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: COpaquePointer?, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetAsyncParam(hasync.toString(), (pszparamoid?.value ?: 0L).toString(), (pvparam?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetHashParam(hhash.toString(), dwparam.toInt(), (pbdata?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: COpaquePointer?, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: COpaquePointer?, pvdata: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetKeyIdentifierProperty((pkeyidentifier?.value ?: 0L).toString(), dwpropid.toInt(), dwflags.toInt(), (pwszcomputername?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (pvdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetKeyParam(hkey.toString(), dwparam.toInt(), (pbdata?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: COpaquePointer?, cbvaluedata: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetOIDFunctionValue(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), (pszoid?.value ?: 0L).toString(), (pwszvaluename?.value ?: 0L).toString(), dwvaluetype.toInt(), (pbvaluedata?.value ?: 0L).toString(), cbvaluedata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetProvParam(hprov.toString(), dwparam.toInt(), (pbdata?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetProviderA((pszprovname?.value ?: 0L).toString(), dwprovtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetProviderExA((pszprovname?.value ?: 0L).toString(), dwprovtype.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetProviderExW((pszprovname?.value ?: 0L).toString(), dwprovtype.toInt(), (pdwreserved?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSetProviderW((pszprovname?.value ?: 0L).toString(), dwprovtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: COpaquePointer?, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbencoded: COpaquePointer?, pcbencoded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignAndEncodeCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (lpszstructtype?.value ?: 0L).toString(), (pvstructinfo?.value ?: 0L).toString(), (psignaturealgorithm?.value ?: 0L).toString(), (pvhashauxinfo?.value ?: 0L).toString(), (pbencoded?.value ?: 0L).toString(), (pcbencoded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignAndEncryptMessage(psignpara: COpaquePointer?, pencryptpara: COpaquePointer?, crecipientcert: UInt, rgprecipientcert: COpaquePointer?, pbtobesignedandencrypted: COpaquePointer?, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: COpaquePointer?, pcbsignedandencryptedblob: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignAndEncryptMessage((psignpara?.value ?: 0L).toString(), (pencryptpara?.value ?: 0L).toString(), crecipientcert.toInt(), (rgprecipientcert?.value ?: 0L).toString(), (pbtobesignedandencrypted?.value ?: 0L).toString(), cbtobesignedandencrypted.toInt(), (pbsignedandencryptedblob?.value ?: 0L).toString(), (pcbsignedandencryptedblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: COpaquePointer?, cbencodedtobesigned: UInt, psignaturealgorithm: COpaquePointer?, pvhashauxinfo: COpaquePointer?, pbsignature: COpaquePointer?, pcbsignature: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), (pbencodedtobesigned?.value ?: 0L).toString(), cbencodedtobesigned.toInt(), (psignaturealgorithm?.value ?: 0L).toString(), (pvhashauxinfo?.value ?: 0L).toString(), (pbsignature?.value ?: 0L).toString(), (pcbsignature?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignHashA(hhash.toString(), dwkeyspec.toInt(), (szdescription?.value ?: 0L).toString(), dwflags.toInt(), (pbsignature?.value ?: 0L).toString(), (pdwsiglen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: COpaquePointer?, pdwsiglen: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignHashW(hhash.toString(), dwkeyspec.toInt(), (szdescription?.value ?: 0L).toString(), dwflags.toInt(), (pbsignature?.value ?: 0L).toString(), (pdwsiglen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignMessage(psignpara: COpaquePointer?, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignMessage((psignpara?.value ?: 0L).toString(), fdetachedsignature, ctobesigned.toInt(), (rgpbtobesigned?.value ?: 0L).toString(), (rgcbtobesigned?.value ?: 0L).toString(), (pbsignedblob?.value ?: 0L).toString(), (pcbsignedblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignMessageWithKey(psignpara: COpaquePointer?, pbtobesigned: COpaquePointer?, cbtobesigned: UInt, pbsignedblob: COpaquePointer?, pcbsignedblob: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptSignMessageWithKey((psignpara?.value ?: 0L).toString(), (pbtobesigned?.value ?: 0L).toString(), cbtobesigned.toInt(), (pbsignedblob?.value ?: 0L).toString(), (pcbsignedblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptStringToBinaryA((pszstring?.value ?: 0L).toString(), cchstring.toInt(), dwflags.toInt(), (pbbinary?.value ?: 0L).toString(), (pcbbinary?.value ?: 0L).toString(), (pdwskip?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: COpaquePointer?, pcbbinary: COpaquePointer?, pdwskip: COpaquePointer?, pdwflags: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptStringToBinaryW((pszstring?.value ?: 0L).toString(), cchstring.toInt(), dwflags.toInt(), (pbbinary?.value ?: 0L).toString(), (pcbbinary?.value ?: 0L).toString(), (pdwskip?.value ?: 0L).toString(), (pdwflags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUninstallCancelRetrieval(dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUninstallDefaultContext(hdefaultcontext: COpaquePointer?, dwflags: UInt, pvreserved: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUninstallDefaultContext((hdefaultcontext?.value ?: 0L).toString(), dwflags.toInt(), (pvreserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnprotectData(pdatain: COpaquePointer?, ppszdatadescr: COpaquePointer?, poptionalentropy: COpaquePointer?, pvreserved: COpaquePointer?, ppromptstruct: COpaquePointer?, dwflags: UInt, pdataout: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUnprotectData((pdatain?.value ?: 0L).toString(), (ppszdatadescr?.value ?: 0L).toString(), (poptionalentropy?.value ?: 0L).toString(), (pvreserved?.value ?: 0L).toString(), (ppromptstruct?.value ?: 0L).toString(), dwflags.toInt(), (pdataout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnprotectMemory(pdatain: COpaquePointer?, cbdatain: UInt, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUnprotectMemory((pdatain?.value ?: 0L).toString(), cbdatain.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), (pwszdll?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUnregisterOIDFunction(dwencodingtype.toInt(), (pszfuncname?.value ?: 0L).toString(), (pszoid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterOIDInfo(pinfo: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUnregisterOIDInfo((pinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: COpaquePointer?, pdwfailurecount: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptUpdateProtectedState((poldsid?.value ?: 0L).toString(), (pwszoldpassword?.value ?: 0L).toString(), dwflags.toInt(), (pdwsuccesscount?.value ?: 0L).toString(), (pdwfailurecount?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: COpaquePointer?, cbencoded: UInt, ppublickey: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignature(hcryptprov.toString(), dwcertencodingtype.toInt(), (pbencoded?.value ?: 0L).toString(), cbencoded.toInt(), (ppublickey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: COpaquePointer?, dwissuertype: UInt, pvissuer: COpaquePointer?, dwflags: CryptVerifyCertFlags, pvextra: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyCertificateSignatureEx(hcryptprov.toString(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), (pvsubject?.value ?: 0L).toString(), dwissuertype.toInt(), (pvissuer?.value ?: 0L).toString(), dwflags.toInt(), (pvextra?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyDetachedMessageHash(phashpara: COpaquePointer?, pbdetachedhashblob: COpaquePointer?, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: COpaquePointer?, rgcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageHash((phashpara?.value ?: 0L).toString(), (pbdetachedhashblob?.value ?: 0L).toString(), cbdetachedhashblob.toInt(), ctobehashed.toInt(), (rgpbtobehashed?.value ?: 0L).toString(), (rgcbtobehashed?.value ?: 0L).toString(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbdetachedsignblob: COpaquePointer?, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: COpaquePointer?, rgcbtobesigned: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyDetachedMessageSignature((pverifypara?.value ?: 0L).toString(), dwsignerindex.toInt(), (pbdetachedsignblob?.value ?: 0L).toString(), cbdetachedsignblob.toInt(), ctobesigned.toInt(), (rgpbtobesigned?.value ?: 0L).toString(), (rgcbtobesigned?.value ?: 0L).toString(), (ppsignercert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageHash(phashpara: COpaquePointer?, pbhashedblob: COpaquePointer?, cbhashedblob: UInt, pbtobehashed: COpaquePointer?, pcbtobehashed: COpaquePointer?, pbcomputedhash: COpaquePointer?, pcbcomputedhash: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyMessageHash((phashpara?.value ?: 0L).toString(), (pbhashedblob?.value ?: 0L).toString(), cbhashedblob.toInt(), (pbtobehashed?.value ?: 0L).toString(), (pcbtobehashed?.value ?: 0L).toString(), (pbcomputedhash?.value ?: 0L).toString(), (pcbcomputedhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageSignature(pverifypara: COpaquePointer?, dwsignerindex: UInt, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?, ppsignercert: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignature((pverifypara?.value ?: 0L).toString(), dwsignerindex.toInt(), (pbsignedblob?.value ?: 0L).toString(), cbsignedblob.toInt(), (pbdecoded?.value ?: 0L).toString(), (pcbdecoded?.value ?: 0L).toString(), (ppsignercert?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: COpaquePointer?, ppublickeyinfo: COpaquePointer?, pbsignedblob: COpaquePointer?, cbsignedblob: UInt, pbdecoded: COpaquePointer?, pcbdecoded: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyMessageSignatureWithKey((pverifypara?.value ?: 0L).toString(), (ppublickeyinfo?.value ?: 0L).toString(), (pbsignedblob?.value ?: 0L).toString(), cbsignedblob.toInt(), (pbdecoded?.value ?: 0L).toString(), (pcbdecoded?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifySignatureA(hhash.toString(), (pbsignature?.value ?: 0L).toString(), dwsiglen.toInt(), hpubkey.toString(), (szdescription?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: COpaquePointer?, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifySignatureW(hhash.toString(), (pbsignature?.value ?: 0L).toString(), dwsiglen.toInt(), hpubkey.toString(), (szdescription?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: COpaquePointer?, cbtscontentinfo: UInt, pbdata: COpaquePointer?, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: COpaquePointer?, pptssigner: COpaquePointer?, phstore: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptVerifyTimeStampSignature((pbtscontentinfo?.value ?: 0L).toString(), cbtscontentinfo.toInt(), (pbdata?.value ?: 0L).toString(), cbdata.toInt(), (hadditionalstore?.value ?: 0L).toString(), (pptscontext?.value ?: 0L).toString(), (pptssigner?.value ?: 0L).toString(), (phstore?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlAddObject(hsignatureorobject: COpaquePointer?, dwflags: UInt, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, ppobject: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlAddObject((hsignatureorobject?.value ?: 0L).toString(), dwflags.toInt(), (rgproperty?.value ?: 0L).toString(), cproperty.toInt(), (pencoded?.value ?: 0L).toString(), (ppobject?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlClose(hcryptxml: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlClose((hcryptxml?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlCreateReference(hcryptxml: COpaquePointer?, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: COpaquePointer?, ctransform: UInt, rgtransform: COpaquePointer?, phreference: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlCreateReference((hcryptxml?.value ?: 0L).toString(), dwflags.toInt(), (wszid?.value ?: 0L).toString(), (wszuri?.value ?: 0L).toString(), (wsztype?.value ?: 0L).toString(), (pdigestmethod?.value ?: 0L).toString(), ctransform.toInt(), (rgtransform?.value ?: 0L).toString(), (phreference?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlDigestReference(hreference: COpaquePointer?, dwflags: UInt, pdataproviderin: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlDigestReference((hreference?.value ?: 0L).toString(), dwflags.toInt(), (pdataproviderin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlEncode(hcryptxml: COpaquePointer?, dwcharset: CryptXmlCharset, rgproperty: COpaquePointer?, cproperty: UInt, pvcallbackstate: COpaquePointer?, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlEncode((hcryptxml?.value ?: 0L).toString(), dwcharset, (rgproperty?.value ?: 0L).toString(), cproperty.toInt(), (pvcallbackstate?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: COpaquePointer?, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), (pvarg?.value ?: 0L).toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: COpaquePointer?, dwgroupid: UInt, dwflags: UInt): COpaquePointer? =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), (pvfindby?.value ?: 0L).toString(), dwgroupid.toInt(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: COpaquePointer?, dwflags: CryptXmlFlags, ppalginfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlGetAlgorithmInfo((pxmlalgorithm?.value ?: 0L).toString(), dwflags.toInt(), (ppalginfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetDocContext(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlGetDocContext((hcryptxml?.value ?: 0L).toString(), (ppstruct?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetReference(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlGetReference((hcryptxml?.value ?: 0L).toString(), (ppstruct?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetSignature(hcryptxml: COpaquePointer?, ppstruct: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlGetSignature((hcryptxml?.value ?: 0L).toString(), (ppstruct?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetStatus(hcryptxml: COpaquePointer?, pstatus: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlGetStatus((hcryptxml?.value ?: 0L).toString(), (pstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetTransforms(ppconfig: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlGetTransforms((ppconfig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: COpaquePointer?, phkey: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlImportPublicKey(dwflags.toInt(), (pkeyvalue?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlOpenToDecode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phcryptxml: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlOpenToDecode((pconfig?.value ?: 0L).toString(), dwflags.toInt(), (rgproperty?.value ?: 0L).toString(), cproperty.toInt(), (pencoded?.value ?: 0L).toString(), (phcryptxml?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlOpenToEncode(pconfig: COpaquePointer?, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: COpaquePointer?, cproperty: UInt, pencoded: COpaquePointer?, phsignature: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlOpenToEncode((pconfig?.value ?: 0L).toString(), dwflags.toInt(), (wszid?.value ?: 0L).toString(), (rgproperty?.value ?: 0L).toString(), cproperty.toInt(), (pencoded?.value ?: 0L).toString(), (phsignature?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlSetHMACSecret(hsignature: COpaquePointer?, pbsecret: COpaquePointer?, cbsecret: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlSetHMACSecret((hsignature?.value ?: 0L).toString(), (pbsecret?.value ?: 0L).toString(), cbsecret.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlSign(hsignature: COpaquePointer?, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: COpaquePointer?, psignaturemethod: COpaquePointer?, pcanonicalization: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlSign((hsignature?.value ?: 0L).toString(), hkey.toString(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, (pvkeyinfospec?.value ?: 0L).toString(), (psignaturemethod?.value ?: 0L).toString(), (pcanonicalization?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlVerifySignature(hsignature: COpaquePointer?, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_cryptXmlVerifySignature((hsignature?.value ?: 0L).toString(), (hkey?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_decrypt((hcrypto?.value ?: 0L).toString(), foaep, cbindata.toInt(), (pindata?.value ?: 0L).toString(), (pcboutdata?.value ?: 0L).toString(), (ppoutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encrypt(hcrypto: COpaquePointer?, foaep: Bool, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_encrypt((hcrypto?.value ?: 0L).toString(), foaep, cbindata.toInt(), (pindata?.value ?: 0L).toString(), (pcboutdata?.value ?: 0L).toString(), (ppoutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCertsByIssuer(pcertchains: COpaquePointer?, pcbcertchains: COpaquePointer?, pccertchains: COpaquePointer?, pbencodedissuername: COpaquePointer?, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_findCertsByIssuer((pcertchains?.value ?: 0L).toString(), (pcbcertchains?.value ?: 0L).toString(), (pccertchains?.value ?: 0L).toString(), (pbencodedissuername?.value ?: 0L).toString(), cbencodedissuername.toInt(), (pwszpurpose?.value ?: 0L).toString(), dwkeyspec.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeToken(pallocmemory: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_freeToken((pallocmemory?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateDerivedKey(hcrypto: COpaquePointer?, cblabel: UInt, plabel: COpaquePointer?, cbnonce: UInt, pnonce: COpaquePointer?, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: COpaquePointer?, ppkey: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_generateDerivedKey((hcrypto?.value ?: 0L).toString(), cblabel.toInt(), (plabel?.value ?: 0L).toString(), cbnonce.toInt(), (pnonce?.value ?: 0L).toString(), derivedkeylength.toInt(), offset.toInt(), (algid?.value ?: 0L).toString(), (pcbkey?.value ?: 0L).toString(), (ppkey?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getAsymmetricEncryptionInterface((pszprovidername?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBrowserToken(dwparamtype: UInt, pparam: COpaquePointer?, pcbtoken: COpaquePointer?, pptoken: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getBrowserToken(dwparamtype.toInt(), (pparam?.value ?: 0L).toString(), (pcbtoken?.value ?: 0L).toString(), (pptoken?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getCipherInterface((pszprovidername?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCryptoTransform(hsymmetriccrypto: COpaquePointer?, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: COpaquePointer?, pphtransform: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getHashInterface((pszprovidername?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getKeyDerivationInterface((pszprovidername?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getKeyStorageInterface((pszprovidername?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyedHash(hsymmetriccrypto: COpaquePointer?, pphhash: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getKeyedHash((hsymmetriccrypto?.value ?: 0L).toString(), (pphhash?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getRngInterface((pszprovidername?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getSChannelInterface((pszprovidername?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getSecretAgreementInterface((pszprovidername?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: COpaquePointer?, dwflags: UInt): Ntstatus =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getSignatureInterface((pszprovidername?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (ppfunctiontable?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getToken(cpolicychain: UInt, ppolicychain: COpaquePointer?, securitytoken: COpaquePointer?, phprooftokencrypto: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_getToken(cpolicychain.toInt(), (ppolicychain?.value ?: 0L).toString(), (securitytoken?.value ?: 0L).toString(), (phprooftokencrypto?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashCore(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_hashCore((hcrypto?.value ?: 0L).toString(), cbindata.toInt(), (pindata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashFinal(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_hashFinal((hcrypto?.value ?: 0L).toString(), cbindata.toInt(), (pindata?.value ?: 0L).toString(), (pcboutdata?.value ?: 0L).toString(), (ppoutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_importInformationCard((filename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun manageCardSpace(): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_manageCardSpace() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptCloseProtectionDescriptor((hdescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptCreateClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), (pparameterlist?.value ?: 0L).toString(), (pbclaimblob?.value ?: 0L).toString(), cbclaimblob.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptCreatePersistedKey(hprovider.toString(), (phkey?.value ?: 0L).toString(), (pszalgid?.value ?: 0L).toString(), (pszkeyname?.value ?: 0L).toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptCreateProtectionDescriptor((pwszdescriptorstring?.value ?: 0L).toString(), dwflags.toInt(), (phdescriptor?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptDecrypt(hkey.toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (ppaddinginfo?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptDeleteKey(hkey.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptDeriveKey(hsharedsecret.toString(), (pwszkdf?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), (pbderivedkey?.value ?: 0L).toString(), cbderivedkey.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, ppaddinginfo: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptEncrypt(hkey.toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (ppaddinginfo?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: COpaquePointer?, ppalglist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptEnumAlgorithms(hprovider.toString(), dwalgoperations.toInt(), (pdwalgcount?.value ?: 0L).toString(), (ppalglist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptEnumKeys(hprovider.toString(), (pszscope?.value ?: 0L).toString(), (ppkeyname?.value ?: 0L).toString(), (ppenumstate?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumStorageProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptEnumStorageProviders((pdwprovidercount?.value ?: 0L).toString(), (ppproviderlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptExportKey(hkey.toString(), hexportkey.toString(), (pszblobtype?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptFinalizeKey(hkey.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFreeBuffer(pvinput: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptFreeBuffer((pvinput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptFreeObject(hobject.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: ObjectSecurityInformation): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptGetProperty(hobject.toString(), (pszproperty?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: COpaquePointer?, dwinfotype: UInt, ppvinfo: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptGetProtectionDescriptorInfo((hdescriptor?.value ?: 0L).toString(), (pmempara?.value ?: 0L).toString(), dwinfotype.toInt(), (ppvinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: COpaquePointer?, phkey: COpaquePointer?, pbdata: COpaquePointer?, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptImportKey(hprovider.toString(), himportkey.toString(), (pszblobtype?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString(), (pbdata?.value ?: 0L).toString(), cbdata.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptIsAlgSupported(hprovider.toString(), (pszalgid?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptIsKeyHandle(hkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: COpaquePointer?, pbderivedkey: COpaquePointer?, cbderivedkey: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptKeyDerivation(hkey.toString(), (pparameterlist?.value ?: 0L).toString(), (pbderivedkey?.value ?: 0L).toString(), cbderivedkey.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptNotifyChangeKey(hprovider.toString(), (phevent?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: COpaquePointer?, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptOpenKey(hprovider.toString(), (phkey?.value ?: 0L).toString(), (pszkeyname?.value ?: 0L).toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptOpenStorageProvider(phprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptOpenStorageProvider((phprovider?.value ?: 0L).toString(), (pszprovidername?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: COpaquePointer?, cbdata: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbprotectedblob: COpaquePointer?, pcbprotectedblob: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptProtectSecret((hdescriptor?.value ?: 0L).toString(), dwflags.toInt(), (pbdata?.value ?: 0L).toString(), cbdata.toInt(), (pmempara?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (ppbprotectedblob?.value ?: 0L).toString(), (pcbprotectedblob?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptQueryProtectionDescriptorName((pwszname?.value ?: 0L).toString(), (pwszdescriptorstring?.value ?: 0L).toString(), (pcdescriptorstring?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptRegisterProtectionDescriptorName((pwszname?.value ?: 0L).toString(), (pwszdescriptorstring?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptSecretAgreement(hprivkey.toString(), hpubkey.toString(), (phagreedsecret?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: COpaquePointer?, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptSetProperty(hobject.toString(), (pszproperty?.value ?: 0L).toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptSignHash(hkey.toString(), (ppaddinginfo?.value ?: 0L).toString(), (pbhashvalue?.value ?: 0L).toString(), cbhashvalue.toInt(), (pbsignature?.value ?: 0L).toString(), cbsignature.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptStreamClose((hstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: COpaquePointer?, phstream: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptStreamOpenToProtect((hdescriptor?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (pstreaminfo?.value ?: 0L).toString(), (phstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotect((pstreaminfo?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (phstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: COpaquePointer?, dwflags: UInt, hwnd: Hwnd, phstream: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptStreamOpenToUnprotectEx((pstreaminfo?.value ?: 0L).toString(), dwflags.toInt(), (hwnd?.value ?: 0L).toString(), (phstream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: COpaquePointer?, cbdata: ULong, ffinal: Bool): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptStreamUpdate((hstream?.value ?: 0L).toString(), (pbdata?.value ?: 0L).toString(), cbdata.toString(), ffinal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptTranslateHandle(phprovider: COpaquePointer?, phkey: COpaquePointer?, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptTranslateHandle((phprovider?.value ?: 0L).toString(), (phkey?.value ?: 0L).toString(), hlegacyprov.toString(), hlegacykey.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptUnprotectSecret(phdescriptor: COpaquePointer?, dwflags: NcryptFlags, pbprotectedblob: COpaquePointer?, cbprotectedblob: UInt, pmempara: COpaquePointer?, hwnd: Hwnd, ppbdata: COpaquePointer?, pcbdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptUnprotectSecret((phdescriptor?.value ?: 0L).toString(), dwflags.toInt(), (pbprotectedblob?.value ?: 0L).toString(), cbprotectedblob.toInt(), (pmempara?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), (ppbdata?.value ?: 0L).toString(), (pcbdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: COpaquePointer?, pbclaimblob: COpaquePointer?, cbclaimblob: UInt, poutput: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptVerifyClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), (pparameterlist?.value ?: 0L).toString(), (pbclaimblob?.value ?: 0L).toString(), cbclaimblob.toInt(), (poutput?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: COpaquePointer?, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_nCryptVerifySignature(hkey.toString(), (ppaddinginfo?.value ?: 0L).toString(), (pbhashvalue?.value ?: 0L).toString(), cbhashvalue.toInt(), (pbsignature?.value ?: 0L).toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_pFXExportCertStore((hstore?.value ?: 0L).toString(), (ppfx?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: COpaquePointer?, szpassword: Pcwstr, pvpara: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_pFXExportCertStoreEx((hstore?.value ?: 0L).toString(), (ppfx?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString(), (pvpara?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXImportCertStore(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_pFXImportCertStore((ppfx?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXIsPFXBlob(ppfx: COpaquePointer?): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_pFXIsPFXBlob((ppfx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXVerifyPassword(ppfx: COpaquePointer?, szpassword: Pcwstr, dwflags: UInt): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_pFXVerifyPassword((ppfx?.value ?: 0L).toString(), (szpassword?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPrng(pbdata: COpaquePointer?, cbdata: ULong): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_processPrng((pbdata?.value ?: 0L).toString(), cbdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signError(): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, pcbsig: COpaquePointer?, ppsig: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signHash((hcrypto?.value ?: 0L).toString(), cbhash.toInt(), (phash?.value ?: 0L).toString(), (hashalgoid?.value ?: 0L).toString(), (pcbsig?.value ?: 0L).toString(), (ppsig?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerFreeSignerContext(psignercontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerFreeSignerContext((psignercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSign(psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerSign((psubjectinfo?.value ?: 0L).toString(), (psignercert?.value ?: 0L).toString(), (psignatureinfo?.value ?: 0L).toString(), (pproviderinfo?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerSignEx(dwflags.toInt(), (psubjectinfo?.value ?: 0L).toString(), (psignercert?.value ?: 0L).toString(), (psignatureinfo?.value ?: 0L).toString(), (pproviderinfo?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString(), (ppsignercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerSignEx2(dwflags.toInt(), (psubjectinfo?.value ?: 0L).toString(), (psignercert?.value ?: 0L).toString(), (psignatureinfo?.value ?: 0L).toString(), (pproviderinfo?.value ?: 0L).toString(), dwtimestampflags.toInt(), (psztimestampalgorithmoid?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString(), (ppsignercontext?.value ?: 0L).toString(), (pcryptopolicy?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: COpaquePointer?, psignercert: COpaquePointer?, psignatureinfo: COpaquePointer?, pproviderinfo: COpaquePointer?, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, pdigestsigninfo: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerSignEx3(dwflags.toInt(), (psubjectinfo?.value ?: 0L).toString(), (psignercert?.value ?: 0L).toString(), (psignatureinfo?.value ?: 0L).toString(), (pproviderinfo?.value ?: 0L).toString(), dwtimestampflags.toInt(), (psztimestampalgorithmoid?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString(), (ppsignercontext?.value ?: 0L).toString(), (pcryptopolicy?.value ?: 0L).toString(), (pdigestsigninfo?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStamp(psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerTimeStamp((psubjectinfo?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerTimeStampEx(dwflags.toInt(), (psubjectinfo?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString(), (ppsignercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerTimeStampEx2(dwflags.toInt(), (psubjectinfo?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), dwalgid.toInt(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString(), (ppsignercontext?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: COpaquePointer?, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: COpaquePointer?, psipdata: COpaquePointer?, ppsignercontext: COpaquePointer?, pcryptopolicy: COpaquePointer?, preserved: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_signerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), (psubjectinfo?.value ?: 0L).toString(), (pwszhttptimestamp?.value ?: 0L).toString(), (pszalgorithmoid?.value ?: 0L).toString(), (psrequest?.value ?: 0L).toString(), (psipdata?.value ?: 0L).toString(), (ppsignercontext?.value ?: 0L).toString(), (pcryptopolicy?.value ?: 0L).toString(), (preserved?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslChangeNotify((hevent?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslComputeClientAuthHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), (pszalgid?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: COpaquePointer?, cbrandoms: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslComputeEapKeyBlock(hsslprovider.toString(), hmasterkey.toString(), (pbrandoms?.value ?: 0L).toString(), cbrandoms.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslComputeFinishedHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslComputeSessionHash(hsslprovider.toString(), hhandshakehash.toString(), dwprotocol.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslCreateClientAuthHash(hsslprovider.toString(), (phhandshakehash?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), (pszhashalgid?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: COpaquePointer?, cbparams: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslCreateEphemeralKey(hsslprovider.toString(), (phephemeralkey?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), (pbparams?.value ?: 0L).toString(), cbparams.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslCreateHandshakeHash(hsslprovider.toString(), (phhandshakehash?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslDecrementProviderReferenceCount(hsslprovider.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslDecryptPacket(hsslprovider.toString(), hkey.toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), sequencenumber.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslDuplicateTranscriptHash(hsslprovider.toString(), htranscripthash.toString(), (phtranscripthash?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: COpaquePointer?, cbinput: UInt, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslEncryptPacket(hsslprovider.toString(), hkey.toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), sequencenumber.toString(), dwcontenttype.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslEnumCipherSuites(hsslprovider.toString(), hprivatekey.toString(), (ppciphersuite?.value ?: 0L).toString(), (ppenumstate?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslEnumCipherSuitesEx(hsslprovider.toString(), hprivatekey.toString(), (ppciphersuite?.value ?: 0L).toString(), (ppenumstate?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: COpaquePointer?, ppecccurve: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslEnumEccCurves(hsslprovider.toString(), (pecccurvecount?.value ?: 0L).toString(), (ppecccurve?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumProtocolProviders(pdwprovidercount: COpaquePointer?, ppproviderlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslEnumProtocolProviders((pdwprovidercount?.value ?: 0L).toString(), (ppproviderlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExpandBinderKey(hsslprovider.toString(), hearlykey.toString(), (phbinderkey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExpandExporterMasterKey(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), (phexportermasterkey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: COpaquePointer?, cbticketnonce: UInt, phpresharedkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExpandPreSharedKey(hsslprovider.toString(), hresumptionmasterkey.toString(), (pbticketnonce?.value ?: 0L).toString(), cbticketnonce.toInt(), (phpresharedkey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExpandResumptionMasterKey(hsslprovider.toString(), hmasterkey.toString(), hhashvalue.toString(), (phresumptionmasterkey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: COpaquePointer?, phservertraffickey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExpandTrafficKeys(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), (phclienttraffickey?.value ?: 0L).toString(), (phservertraffickey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExpandWriteKey(hsslprovider.toString(), hbasetraffickey.toString(), (phwritekey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExportKey(hsslprovider.toString(), hkey.toString(), (pszblobtype?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: COpaquePointer?, cbrandoms: UInt, pbcontextvalue: COpaquePointer?, cbcontextvalue: UShort, pboutput: COpaquePointer?, cboutput: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExportKeyingMaterial(hsslprovider.toString(), hmasterkey.toString(), (slabel?.value ?: 0L).toString(), (pbrandoms?.value ?: 0L).toString(), cbrandoms.toInt(), (pbcontextvalue?.value ?: 0L).toString(), cbcontextvalue.toInt(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExtractEarlyKey(hsslprovider.toString(), hpresharedkey.toString(), (phearlykey?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExtractHandshakeKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), hearlykey.toString(), (phhandshakekey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslExtractMasterKey(hsslprovider.toString(), hhandshakekey.toString(), (phmasterkey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeBuffer(pvinput: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslFreeBuffer((pvinput?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslFreeObject(hobject.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslGenerateMasterKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), (phmasterkey?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pboutput: COpaquePointer?, cboutput: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslGeneratePreMasterKey(hsslprovider.toString(), hpublickey.toString(), (phpremasterkey?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L).toString(), (pboutput?.value ?: 0L).toString(), cboutput.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: COpaquePointer?, phwritekey: COpaquePointer?, pparameterlist: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslGenerateSessionKeys(hsslprovider.toString(), hmasterkey.toString(), (phreadkey?.value ?: 0L).toString(), (phwritekey?.value ?: 0L).toString(), (pparameterlist?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslGetCipherSuitePRFHashAlgorithm(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), (szprfhash?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslGetKeyProperty(hkey.toString(), (pszproperty?.value ?: 0L).toString(), (ppboutput?.value ?: 0L).toString(), (pcboutput?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: COpaquePointer?, pcboutput: COpaquePointer?, ppenumstate: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslGetProviderProperty(hsslprovider.toString(), (pszproperty?.value ?: 0L).toString(), (ppboutput?.value ?: 0L).toString(), (pcboutput?.value ?: 0L).toString(), (ppenumstate?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: COpaquePointer?, cbinput: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslHashHandshake(hsslprovider.toString(), hhandshakehash.toString(), (pbinput?.value ?: 0L).toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: COpaquePointer?, pszblobtype: Pcwstr, pbkeyblob: COpaquePointer?, cbkeyblob: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslImportKey(hsslprovider.toString(), (phkey?.value ?: 0L).toString(), (pszblobtype?.value ?: 0L).toString(), (pbkeyblob?.value ?: 0L).toString(), cbkeyblob.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: COpaquePointer?, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: COpaquePointer?, pbencryptedkey: COpaquePointer?, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslImportMasterKey(hsslprovider.toString(), hprivatekey.toString(), (phmasterkey?.value ?: 0L).toString(), dwprotocol.toInt(), dwciphersuite.toInt(), (pparameterlist?.value ?: 0L).toString(), (pbencryptedkey?.value ?: 0L).toString(), cbencryptedkey.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslIncrementProviderReferenceCount(hsslprovider.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: COpaquePointer?, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslLookupCipherLengths(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), (pcipherlengths?.value ?: 0L).toString(), cbcipherlengths.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslLookupCipherSuiteInfo(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), (pciphersuite?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: COpaquePointer?, pcertcontext: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslOpenPrivateKey(hsslprovider.toString(), (phprivatekey?.value ?: 0L).toString(), (pcertcontext?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslOpenProvider(phsslprovider: COpaquePointer?, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslOpenProvider((phsslprovider?.value ?: 0L).toString(), (pszprovidername?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, pcbresult: COpaquePointer?, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslSignHash(hsslprovider.toString(), hprivatekey.toString(), (pbhashvalue?.value ?: 0L).toString(), cbhashvalue.toInt(), (pbsignature?.value ?: 0L).toString(), cbsignature.toInt(), (pcbresult?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: COpaquePointer?, cbhashvalue: UInt, pbsignature: COpaquePointer?, cbsignature: UInt, dwflags: UInt): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_sslVerifySignature(hsslprovider.toString(), hpublickey.toString(), (pbhashvalue?.value ?: 0L).toString(), cbhashvalue.toInt(), (pbsignature?.value ?: 0L).toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPrng(pbrandomdata: COpaquePointer?, cbrandomdata: ULong): Bool =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_systemPrng((pbrandomdata?.value ?: 0L).toString(), cbrandomdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_transformBlock((hcrypto?.value ?: 0L).toString(), cbindata.toInt(), (pindata?.value ?: 0L).toString(), (pcboutdata?.value ?: 0L).toString(), (ppoutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformFinalBlock(hcrypto: COpaquePointer?, cbindata: UInt, pindata: COpaquePointer?, pcboutdata: COpaquePointer?, ppoutdata: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_transformFinalBlock((hcrypto?.value ?: 0L).toString(), cbindata.toInt(), (pindata?.value ?: 0L).toString(), (pcboutdata?.value ?: 0L).toString(), (ppoutdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyHash(hcrypto: COpaquePointer?, cbhash: UInt, phash: COpaquePointer?, hashalgoid: Pcwstr, cbsig: UInt, psig: COpaquePointer?, pfverified: COpaquePointer?): Hresult =
    if (_windowsWin32SecurityCryptographyNapiAddon != null) (_windowsWin32SecurityCryptographyNapiAddon.windowssys_windows_win32_security_cryptography_verifyHash((hcrypto?.value ?: 0L).toString(), cbhash.toInt(), (phash?.value ?: 0L).toString(), (hashalgoid?.value ?: 0L).toString(), cbsig.toInt(), (psig?.value ?: 0L).toString(), (pfverified?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
