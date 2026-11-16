@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.cryptography

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32SecurityCryptographyNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun bCryptAddContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, dwposition: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunction(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), dwposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptAddContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwposition: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptAddContextFunctionProvider(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszprovider.rawAddress.toString(), dwposition.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCloseAlgorithmProvider(halgorithm: BcryptAlgHandle, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptCloseAlgorithmProvider(halgorithm.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptConfigureContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptConfigureContext(dwtable.toInt(), pszcontext.rawAddress.toString(), pconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptConfigureContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pconfig: ConstPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptConfigureContextFunction(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateContext(dwtable: BcryptTable, pszcontext: Pcwstr, pconfig: ConstPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptCreateContext(dwtable.toInt(), pszcontext.rawAddress.toString(), pconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptCreateHash(halgorithm.rawAddress.toString(), phhash.rawAddress.toString(), pbhashobject.rawAddress.toString(), cbhashobject.toInt(), pbsecret.rawAddress.toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptCreateMultiHash(halgorithm: BcryptAlgHandle, phhash: MutPtr, nhashes: UInt, pbhashobject: MutPtr, cbhashobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptCreateMultiHash(halgorithm.rawAddress.toString(), phhash.rawAddress.toString(), nhashes.toInt(), pbhashobject.rawAddress.toString(), cbhashobject.toInt(), pbsecret.rawAddress.toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDecrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDecrypt(hkey.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pbiv.rawAddress.toString(), cbiv.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeleteContext(dwtable: BcryptTable, pszcontext: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDeleteContext(dwtable.toInt(), pszcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKey(hsharedsecret: BcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKey(hsharedsecret.rawAddress.toString(), pwszkdf.rawAddress.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKeyCapi(hhash: BcryptHashHandle, htargetalg: BcryptAlgHandle, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyCapi(hhash.rawAddress.toString(), htargetalg.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDeriveKeyPBKDF2(hprf: BcryptAlgHandle, pbpassword: ConstPtr, cbpassword: UInt, pbsalt: ConstPtr, cbsalt: UInt, citerations: ULong, pbderivedkey: MutPtr, cbderivedkey: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDeriveKeyPBKDF2(hprf.rawAddress.toString(), pbpassword.rawAddress.toString(), cbpassword.toInt(), pbsalt.rawAddress.toString(), cbsalt.toInt(), citerations.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroyHash(hhash: BcryptHashHandle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDestroyHash(hhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroyKey(hkey: BcryptKeyHandle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDestroyKey(hkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDestroySecret(hsecret: BcryptSecretHandle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDestroySecret(hsecret.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDuplicateHash(hhash: BcryptHashHandle, phnewhash: MutPtr, pbhashobject: MutPtr, cbhashobject: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDuplicateHash(hhash.rawAddress.toString(), phnewhash.rawAddress.toString(), pbhashobject.rawAddress.toString(), cbhashobject.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptDuplicateKey(hkey: BcryptKeyHandle, phnewkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptDuplicateKey(hkey.rawAddress.toString(), phnewkey.rawAddress.toString(), pbkeyobject.rawAddress.toString(), cbkeyobject.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEncrypt(hkey: BcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pbiv: MutPtr, cbiv: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEncrypt(hkey.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pbiv.rawAddress.toString(), cbiv.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumAlgorithms(dwalgoperations: BcryptOperation, palgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEnumAlgorithms(dwalgoperations.toInt(), palgcount.rawAddress.toString(), ppalglist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContextFunctionProviders(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctionProviders(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContextFunctions(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEnumContextFunctions(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumContexts(dwtable: BcryptTable, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEnumContexts(dwtable.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumProviders(pszalgid: Pcwstr, pimplcount: MutPtr, ppimpllist: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEnumProviders(pszalgid.rawAddress.toString(), pimplcount.rawAddress.toString(), ppimpllist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptEnumRegisteredProviders(pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptEnumRegisteredProviders(pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptExportKey(hkey: BcryptKeyHandle, hexportkey: BcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptExportKey(hkey.rawAddress.toString(), hexportkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFinalizeKeyPair(hkey: BcryptKeyHandle, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptFinalizeKeyPair(hkey.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFinishHash(hhash: BcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptFinishHash(hhash.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptFreeBuffer(pvbuffer: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptFreeBuffer(pvbuffer.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun bCryptGenRandom(halgorithm: BcryptAlgHandle, pbbuffer: MutPtr, cbbuffer: UInt, dwflags: BcryptgenrandomFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptGenRandom(halgorithm.rawAddress.toString(), pbbuffer.rawAddress.toString(), cbbuffer.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGenerateKeyPair(halgorithm: BcryptAlgHandle, phkey: MutPtr, dwlength: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptGenerateKeyPair(halgorithm.rawAddress.toString(), phkey.rawAddress.toString(), dwlength.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGenerateSymmetricKey(halgorithm: BcryptAlgHandle, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbsecret: ConstPtr, cbsecret: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptGenerateSymmetricKey(halgorithm.rawAddress.toString(), phkey.rawAddress.toString(), pbkeyobject.rawAddress.toString(), cbkeyobject.toInt(), pbsecret.rawAddress.toString(), cbsecret.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGetFipsAlgorithmMode(pfenabled: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptGetFipsAlgorithmMode(pfenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptGetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptGetProperty(hobject.rawAddress.toString(), pszproperty.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptHash(halgorithm: BcryptAlgHandle, pbsecret: ConstPtr, cbsecret: UInt, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptHash(halgorithm.rawAddress.toString(), pbsecret.rawAddress.toString(), cbsecret.toInt(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptHashData(hhash: BcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptHashData(hhash.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptImportKey(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbkeyobject: MutPtr, cbkeyobject: UInt, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptImportKey(halgorithm.rawAddress.toString(), himportkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), phkey.rawAddress.toString(), pbkeyobject.rawAddress.toString(), cbkeyobject.toInt(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptImportKeyPair(halgorithm: BcryptAlgHandle, himportkey: BcryptKeyHandle, pszblobtype: Pcwstr, phkey: MutPtr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptImportKeyPair(halgorithm.rawAddress.toString(), himportkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), phkey.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptKeyDerivation(hkey: BcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptKeyDerivation(hkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptOpenAlgorithmProvider(phalgorithm: MutPtr, pszalgid: Pcwstr, pszimplementation: Pcwstr, dwflags: BcryptOpenAlgorithmProviderFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptOpenAlgorithmProvider(phalgorithm.rawAddress.toString(), pszalgid.rawAddress.toString(), pszimplementation.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptProcessMultiOperations(hobject: BcryptHandle, operationtype: BcryptMultiOperationType, poperations: ConstPtr, cboperations: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptProcessMultiOperations(hobject.rawAddress.toString(), operationtype, poperations.rawAddress.toString(), cboperations.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextConfiguration(dwtable.toInt(), pszcontext.rawAddress.toString(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextFunctionConfiguration(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionConfiguration(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, pcbvalue: MutPtr, ppbvalue: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptQueryContextFunctionProperty(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszproperty.rawAddress.toString(), pcbvalue.rawAddress.toString(), ppbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptQueryProviderRegistration(pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwinterface: BcryptInterface, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptQueryProviderRegistration(pszprovider.rawAddress.toString(), dwmode.toInt(), dwinterface.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRegisterConfigChangeNotify(phevent: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptRegisterConfigChangeNotify(phevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRegisterProvider(pszprovider: Pcwstr, dwflags: UInt, preg: ConstPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptRegisterProvider(pszprovider.rawAddress.toString(), dwflags.toInt(), preg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRemoveContextFunction(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunction(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptRemoveContextFunctionProvider(dwtable: UInt, pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptRemoveContextFunctionProvider(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptResolveProviders(pszcontext: Pcwstr, dwinterface: UInt, pszfunction: Pcwstr, pszprovider: Pcwstr, dwmode: BcryptQueryProviderMode, dwflags: BcryptResolveProvidersFlags, pcbbuffer: MutPtr, ppbuffer: MutPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptResolveProviders(pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszprovider.rawAddress.toString(), dwmode.toInt(), dwflags.toInt(), pcbbuffer.rawAddress.toString(), ppbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSecretAgreement(hprivkey: BcryptKeyHandle, hpubkey: BcryptKeyHandle, phagreedsecret: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptSecretAgreement(hprivkey.rawAddress.toString(), hpubkey.rawAddress.toString(), phagreedsecret.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSetContextFunctionProperty(dwtable: BcryptTable, pszcontext: Pcwstr, dwinterface: BcryptInterface, pszfunction: Pcwstr, pszproperty: Pcwstr, cbvalue: UInt, pbvalue: ConstPtr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptSetContextFunctionProperty(dwtable.toInt(), pszcontext.rawAddress.toString(), dwinterface.toInt(), pszfunction.rawAddress.toString(), pszproperty.rawAddress.toString(), cbvalue.toInt(), pbvalue.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSetProperty(hobject: BcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptSetProperty(hobject.rawAddress.toString(), pszproperty.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptSignHash(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptSignHash(hkey.rawAddress.toString(), ppaddinginfo.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptUnregisterConfigChangeNotify(hevent: Handle): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptUnregisterConfigChangeNotify(hevent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptUnregisterProvider(pszprovider: Pcwstr): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptUnregisterProvider(pszprovider.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bCryptVerifySignature(hkey: BcryptKeyHandle, ppaddinginfo: ConstPtr, pbhash: ConstPtr, cbhash: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: BcryptFlags): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyBCryptVerifySignature(hkey.rawAddress.toString(), ppaddinginfo.rawAddress.toString(), pbhash.rawAddress.toString(), cbhash.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCRLContextToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddCRLContextToStore(hcertstore.rawAddress.toString(), pcrlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCRLLinkToStore(hcertstore: Hcertstore, pcrlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddCRLLinkToStore(hcertstore.rawAddress.toString(), pcrlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCTLContextToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddCTLContextToStore(hcertstore.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCTLLinkToStore(hcertstore: Hcertstore, pctlcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddCTLLinkToStore(hcertstore.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCertificateContextToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddCertificateContextToStore(hcertstore.rawAddress.toString(), pcertcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddCertificateLinkToStore(hcertstore: Hcertstore, pcertcontext: ConstPtr, dwadddisposition: UInt, ppstorecontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddCertificateLinkToStore(hcertstore.rawAddress.toString(), pcertcontext.rawAddress.toString(), dwadddisposition.toInt(), ppstorecontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCRLToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt, dwadddisposition: UInt, ppcrlcontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCRLToStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), pbcrlencoded.rawAddress.toString(), cbcrlencoded.toInt(), dwadddisposition.toInt(), ppcrlcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCTLToStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: CertQueryEncodingType, pbctlencoded: ConstPtr, cbctlencoded: UInt, dwadddisposition: UInt, ppctlcontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCTLToStore(hcertstore.rawAddress.toString(), dwmsgandcertencodingtype.toInt(), pbctlencoded.rawAddress.toString(), cbctlencoded.toInt(), dwadddisposition.toInt(), ppctlcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt, dwadddisposition: UInt, ppcertcontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt(), dwadddisposition.toInt(), ppcertcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToSystemStoreA(szcertstorename: Pcstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreA(szcertstorename.rawAddress.toString(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEncodedCertificateToSystemStoreW(szcertstorename: Pcwstr, pbcertencoded: ConstPtr, cbcertencoded: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddEncodedCertificateToSystemStoreW(szcertstorename.rawAddress.toString(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddEnhancedKeyUsageIdentifier(pcertcontext.rawAddress.toString(), pszusageidentifier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddRefServerOcspResponse(hserverocspresponse: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponse(hserverocspresponse.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certAddRefServerOcspResponseContext(pserverocspresponsecontext: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddRefServerOcspResponseContext(pserverocspresponsecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certAddSerializedElementToStore(hcertstore: Hcertstore, pbelement: ConstPtr, cbelement: UInt, dwadddisposition: UInt, dwflags: UInt, dwcontexttypeflags: UInt, pdwcontexttype: MutPtr, ppvcontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddSerializedElementToStore(hcertstore.rawAddress.toString(), pbelement.rawAddress.toString(), cbelement.toInt(), dwadddisposition.toInt(), dwflags.toInt(), dwcontexttypeflags.toInt(), pdwcontexttype.rawAddress.toString(), ppvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAddStoreToCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore, dwupdateflags: UInt, dwpriority: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAddStoreToCollection(hcollectionstore.rawAddress.toString(), hsiblingstore.rawAddress.toString(), dwupdateflags.toInt(), dwpriority.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certAlgIdToOID(dwalgid: UInt): Pcstr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) ConstPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertAlgIdToOID(dwalgid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCloseServerOcspResponse(hserverocspresponse: ConstPtr, dwflags: UInt) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCloseServerOcspResponse(hserverocspresponse.rawAddress.toString(), dwflags.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certCloseStore(hcertstore: Hcertstore, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCloseStore(hcertstore.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareCertificate(dwcertencodingtype: CertQueryEncodingType, pcertid1: ConstPtr, pcertid2: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCompareCertificate(dwcertencodingtype.toInt(), pcertid1.rawAddress.toString(), pcertid2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareCertificateName(dwcertencodingtype: CertQueryEncodingType, pcertname1: ConstPtr, pcertname2: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCompareCertificateName(dwcertencodingtype.toInt(), pcertname1.rawAddress.toString(), pcertname2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCompareIntegerBlob(pint1: ConstPtr, pint2: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCompareIntegerBlob(pint1.rawAddress.toString(), pint2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certComparePublicKeyInfo(dwcertencodingtype: CertQueryEncodingType, ppublickey1: ConstPtr, ppublickey2: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertComparePublicKeyInfo(dwcertencodingtype.toInt(), ppublickey1.rawAddress.toString(), ppublickey2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certControlStore(hcertstore: Hcertstore, dwflags: CertControlStoreFlags, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertControlStore(hcertstore.rawAddress.toString(), dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCRLContext(dwcertencodingtype: CertQueryEncodingType, pbcrlencoded: ConstPtr, cbcrlencoded: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateCRLContext(dwcertencodingtype.toInt(), pbcrlencoded.rawAddress.toString(), cbcrlencoded.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCTLContext(dwmsgandcertencodingtype: UInt, pbctlencoded: ConstPtr, cbctlencoded: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateCTLContext(dwmsgandcertencodingtype.toInt(), pbctlencoded.rawAddress.toString(), cbctlencoded.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCTLEntryFromCertificateContextProperties(pcertcontext: ConstPtr, coptattr: UInt, rgoptattr: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pctlentry: MutPtr, pcbctlentry: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateCTLEntryFromCertificateContextProperties(pcertcontext.rawAddress.toString(), coptattr.toInt(), rgoptattr.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), pctlentry.rawAddress.toString(), pcbctlentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCertificateChainEngine(pconfig: ConstPtr, phchainengine: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateCertificateChainEngine(pconfig.rawAddress.toString(), phchainengine.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateCertificateContext(dwcertencodingtype: CertQueryEncodingType, pbcertencoded: ConstPtr, cbcertencoded: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateCertificateContext(dwcertencodingtype.toInt(), pbcertencoded.rawAddress.toString(), cbcertencoded.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateContext(dwcontexttype: UInt, dwencodingtype: UInt, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pcreatepara: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateContext(dwcontexttype.toInt(), dwencodingtype.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), dwflags.toInt(), pcreatepara.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certCreateSelfSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, psubjectissuerblob: ConstPtr, dwflags: CertCreateSelfsignFlags, pkeyprovinfo: ConstPtr, psignaturealgorithm: ConstPtr, pstarttime: ConstPtr, pendtime: ConstPtr, pextensions: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertCreateSelfSignCertificate(hcryptprovorncryptkey.toString(), psubjectissuerblob.rawAddress.toString(), dwflags.toInt(), pkeyprovinfo.rawAddress.toString(), psignaturealgorithm.rawAddress.toString(), pstarttime.rawAddress.toString(), pendtime.rawAddress.toString(), pextensions.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCRLFromStore(pcrlcontext: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDeleteCRLFromStore(pcrlcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCTLFromStore(pctlcontext: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDeleteCTLFromStore(pctlcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDeleteCertificateFromStore(pcertcontext: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDeleteCertificateFromStore(pcertcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCRLContext(pcrlcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDuplicateCRLContext(pcrlcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCTLContext(pctlcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDuplicateCTLContext(pctlcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCertificateChain(pchaincontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateChain(pchaincontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateCertificateContext(pcertcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDuplicateCertificateContext(pcertcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certDuplicateStore(hcertstore: Hcertstore): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertDuplicateStore(hcertstore.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCRLContextProperties(pcrlcontext: ConstPtr, dwpropid: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumCRLContextProperties(pcrlcontext.rawAddress.toString(), dwpropid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCRLsInStore(hcertstore: Hcertstore, pprevcrlcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumCRLsInStore(hcertstore.rawAddress.toString(), pprevcrlcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCTLContextProperties(pctlcontext: ConstPtr, dwpropid: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumCTLContextProperties(pctlcontext.rawAddress.toString(), dwpropid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCTLsInStore(hcertstore: Hcertstore, pprevctlcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumCTLsInStore(hcertstore.rawAddress.toString(), pprevctlcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCertificateContextProperties(pcertcontext: ConstPtr, dwpropid: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumCertificateContextProperties(pcertcontext.rawAddress.toString(), dwpropid.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumCertificatesInStore(hcertstore: Hcertstore, pprevcertcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumCertificatesInStore(hcertstore.rawAddress.toString(), pprevcertcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumPhysicalStore): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumPhysicalStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSubjectInSortedCTL(pctlcontext: ConstPtr, ppvnextsubject: MutPtr, psubjectidentifier: MutPtr, pencodedattributes: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumSubjectInSortedCTL(pctlcontext.rawAddress.toString(), ppvnextsubject.rawAddress.toString(), psubjectidentifier.rawAddress.toString(), pencodedattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSystemStore(dwflags: UInt, pvsystemstorelocationpara: ConstPtr, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStore): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumSystemStore(dwflags.toInt(), pvsystemstorelocationpara.rawAddress.toString(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certEnumSystemStoreLocation(dwflags: UInt, pvarg: MutPtr, pfnenum: PfnCertEnumSystemStoreLocation): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertEnumSystemStoreLocation(dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindAttribute(pszobjid: Pcstr, cattr: UInt, rgattr: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindAttribute(pszobjid.rawAddress.toString(), cattr.toInt(), rgattr.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCRLInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: UInt, pvfindpara: ConstPtr, pprevcrlcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindCRLInStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevcrlcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCTLInStore(hcertstore: Hcertstore, dwmsgandcertencodingtype: UInt, dwfindflags: UInt, dwfindtype: CertFindType, pvfindpara: ConstPtr, pprevctlcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindCTLInStore(hcertstore.rawAddress.toString(), dwmsgandcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevctlcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCertificateInCRL(pcert: ConstPtr, pcrlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppcrlentry: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindCertificateInCRL(pcert.rawAddress.toString(), pcrlcontext.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), ppcrlentry.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindCertificateInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: UInt, dwfindtype: CertFindFlags, pvfindpara: ConstPtr, pprevcertcontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindCertificateInStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevcertcontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindChainInStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, dwfindflags: CertFindChainInStoreFlags, dwfindtype: UInt, pvfindpara: ConstPtr, pprevchaincontext: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindChainInStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), dwfindflags.toInt(), dwfindtype.toInt(), pvfindpara.rawAddress.toString(), pprevchaincontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindExtension(pszobjid: Pcstr, cextensions: UInt, rgextensions: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindExtension(pszobjid.rawAddress.toString(), cextensions.toInt(), rgextensions.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindRDNAttr(pszobjid: Pcstr, pname: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindRDNAttr(pszobjid.rawAddress.toString(), pname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindSubjectInCTL(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindSubjectInCTL(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFindSubjectInSortedCTL(psubjectidentifier: ConstPtr, pctlcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, pencodedattributes: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFindSubjectInSortedCTL(psubjectidentifier.rawAddress.toString(), pctlcontext.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), pencodedattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCRLContext(pcrlcontext: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeCRLContext(pcrlcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCTLContext(pctlcontext: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeCTLContext(pctlcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeCertificateChain(pchaincontext: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChain(pchaincontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateChainEngine(hchainengine: Hcertchainengine) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainEngine(hchainengine.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateChainList(prgpselection: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateChainList(prgpselection.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certFreeCertificateContext(pcertcontext: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeCertificateContext(pcertcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certFreeServerOcspResponseContext(pserverocspresponsecontext: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertFreeServerOcspResponseContext(pserverocspresponsecontext.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certGetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetCRLContextProperty(pcrlcontext.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCRLFromStore(hcertstore: Hcertstore, pissuercontext: ConstPtr, pprevcrlcontext: ConstPtr, pdwflags: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetCRLFromStore(hcertstore.rawAddress.toString(), pissuercontext.rawAddress.toString(), pprevcrlcontext.rawAddress.toString(), pdwflags.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetCTLContextProperty(pctlcontext.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCertificateChain(hchainengine: Hcertchainengine, pcertcontext: ConstPtr, ptime: ConstPtr, hadditionalstore: Hcertstore, pchainpara: ConstPtr, dwflags: UInt, pvreserved: ConstPtr, ppchaincontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetCertificateChain(hchainengine.rawAddress.toString(), pcertcontext.rawAddress.toString(), ptime.rawAddress.toString(), hadditionalstore.rawAddress.toString(), pchainpara.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), ppchaincontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetCertificateContextProperty(pcertcontext.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetEnhancedKeyUsage(pcertcontext: ConstPtr, dwflags: UInt, pusage: MutPtr, pcbusage: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetEnhancedKeyUsage(pcertcontext.rawAddress.toString(), dwflags.toInt(), pusage.rawAddress.toString(), pcbusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetIntendedKeyUsage(dwcertencodingtype: CertQueryEncodingType, pcertinfo: ConstPtr, pbkeyusage: MutPtr, cbkeyusage: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetIntendedKeyUsage(dwcertencodingtype.toInt(), pcertinfo.rawAddress.toString(), pbkeyusage.rawAddress.toString(), cbkeyusage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetIssuerCertificateFromStore(hcertstore: Hcertstore, psubjectcontext: ConstPtr, pprevissuercontext: ConstPtr, pdwflags: MutPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetIssuerCertificateFromStore(hcertstore.rawAddress.toString(), psubjectcontext.rawAddress.toString(), pprevissuercontext.rawAddress.toString(), pdwflags.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetNameStringA(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pstr, cchnamestring: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetNameStringA(pcertcontext.rawAddress.toString(), dwtype.toInt(), dwflags.toInt(), pvtypepara.rawAddress.toString(), psznamestring.rawAddress.toString(), cchnamestring.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetNameStringW(pcertcontext: ConstPtr, dwtype: UInt, dwflags: UInt, pvtypepara: ConstPtr, psznamestring: Pwstr, cchnamestring: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetNameStringW(pcertcontext.rawAddress.toString(), dwtype.toInt(), dwflags.toInt(), pvtypepara.rawAddress.toString(), psznamestring.rawAddress.toString(), cchnamestring.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetPublicKeyLength(dwcertencodingtype: CertQueryEncodingType, ppublickey: ConstPtr): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetPublicKeyLength(dwcertencodingtype.toInt(), ppublickey.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetServerOcspResponseContext(hserverocspresponse: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetServerOcspResponseContext(hserverocspresponse.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetStoreProperty(hcertstore.rawAddress.toString(), dwpropid.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetSubjectCertificateFromStore(hcertstore: Hcertstore, dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetSubjectCertificateFromStore(hcertstore.rawAddress.toString(), dwcertencodingtype.toInt(), pcertid.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certGetValidUsages(ccerts: UInt, rghcerts: ConstPtr, cnumoids: MutPtr, rghoids: MutPtr, pcboids: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertGetValidUsages(ccerts.toInt(), rghcerts.rawAddress.toString(), cnumoids.rawAddress.toString(), rghoids.rawAddress.toString(), pcboids.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsRDNAttrsInCertificateName(dwcertencodingtype: CertQueryEncodingType, dwflags: UInt, pcertname: ConstPtr, prdn: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertIsRDNAttrsInCertificateName(dwcertencodingtype.toInt(), dwflags.toInt(), pcertname.rawAddress.toString(), prdn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsStrongHashToSign(pstrongsignpara: ConstPtr, pwszcnghashalgid: Pcwstr, psigningcert: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertIsStrongHashToSign(pstrongsignpara.rawAddress.toString(), pwszcnghashalgid.rawAddress.toString(), psigningcert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsValidCRLForCertificate(pcert: ConstPtr, pcrl: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertIsValidCRLForCertificate(pcert.rawAddress.toString(), pcrl.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certIsWeakHash(dwhashusetype: UInt, pwszcnghashalgid: Pcwstr, dwchainflags: UInt, psignerchaincontext: ConstPtr, ptimestamp: ConstPtr, pwszfilename: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertIsWeakHash(dwhashusetype.toInt(), pwszcnghashalgid.rawAddress.toString(), dwchainflags.toInt(), psignerchaincontext.rawAddress.toString(), ptimestamp.rawAddress.toString(), pwszfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certNameToStrA(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertNameToStrA(dwcertencodingtype.toInt(), pname.rawAddress.toString(), dwstrtype.toInt(), psz.rawAddress.toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certNameToStrW(dwcertencodingtype: CertQueryEncodingType, pname: ConstPtr, dwstrtype: CertStringType, psz: Pwstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertNameToStrW(dwcertencodingtype.toInt(), pname.rawAddress.toString(), dwstrtype.toInt(), psz.rawAddress.toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOIDToAlgId(pszobjid: Pcstr): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertOIDToAlgId(pszobjid.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenServerOcspResponse(pchaincontext: ConstPtr, dwflags: UInt, popenpara: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertOpenServerOcspResponse(pchaincontext.rawAddress.toString(), dwflags.toInt(), popenpara.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenStore(lpszstoreprovider: Pcstr, dwencodingtype: CertQueryEncodingType, hcryptprov: HcryptprovLegacy, dwflags: CertOpenStoreFlags, pvpara: ConstPtr): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertOpenStore(lpszstoreprovider.rawAddress.toString(), dwencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), pvpara.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenSystemStoreA(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcstr): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreA(hprov.toString(), szsubsystemprotocol.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certOpenSystemStoreW(hprov: HcryptprovLegacy, szsubsystemprotocol: Pcwstr): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertOpenSystemStoreW(hprov.toString(), szsubsystemprotocol.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRDNValueToStrA(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrA(dwvaluetype.toInt(), pvalue.rawAddress.toString(), psz.rawAddress.toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRDNValueToStrW(dwvaluetype: UInt, pvalue: ConstPtr, psz: Pwstr, csz: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRDNValueToStrW(dwvaluetype.toInt(), pvalue.rawAddress.toString(), psz.rawAddress.toString(), csz.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRegisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRegisterPhysicalStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pwszstorename.rawAddress.toString(), pstoreinfo.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRegisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt, pstoreinfo: ConstPtr, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRegisterSystemStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pstoreinfo.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRemoveEnhancedKeyUsageIdentifier(pcertcontext: ConstPtr, pszusageidentifier: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRemoveEnhancedKeyUsageIdentifier(pcertcontext.rawAddress.toString(), pszusageidentifier.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRemoveStoreFromCollection(hcollectionstore: Hcertstore, hsiblingstore: Hcertstore) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRemoveStoreFromCollection(hcollectionstore.rawAddress.toString(), hsiblingstore.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun certResyncCertificateChainEngine(hchainengine: Hcertchainengine): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertResyncCertificateChainEngine(hchainengine.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certRetrieveLogoOrBiometricInfo(pcertcontext: ConstPtr, lpszlogoorbiometrictype: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, dwflags: UInt, pvreserved: ConstPtr, ppbdata: MutPtr, pcbdata: MutPtr, ppwszmimetype: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertRetrieveLogoOrBiometricInfo(pcertcontext.rawAddress.toString(), lpszlogoorbiometrictype.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString(), ppbdata.rawAddress.toString(), pcbdata.rawAddress.toString(), ppwszmimetype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSaveStore(hcertstore: Hcertstore, dwencodingtype: CertQueryEncodingType, dwsaveas: CertStoreSaveAs, dwsaveto: CertStoreSaveTo, pvsavetopara: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSaveStore(hcertstore.rawAddress.toString(), dwencodingtype.toInt(), dwsaveas.toInt(), dwsaveto.toInt(), pvsavetopara.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSelectCertificateChains(pselectioncontext: ConstPtr, dwflags: UInt, pchainparameters: ConstPtr, ccriteria: UInt, rgpcriteria: ConstPtr, hstore: Hcertstore, pcselection: MutPtr, pprgpselection: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSelectCertificateChains(pselectioncontext.rawAddress.toString(), dwflags.toInt(), pchainparameters.rawAddress.toString(), ccriteria.toInt(), rgpcriteria.rawAddress.toString(), hstore.rawAddress.toString(), pcselection.rawAddress.toString(), pprgpselection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCRLStoreElement(pcrlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSerializeCRLStoreElement(pcrlcontext.rawAddress.toString(), dwflags.toInt(), pbelement.rawAddress.toString(), pcbelement.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCTLStoreElement(pctlcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSerializeCTLStoreElement(pctlcontext.rawAddress.toString(), dwflags.toInt(), pbelement.rawAddress.toString(), pcbelement.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSerializeCertificateStoreElement(pcertcontext: ConstPtr, dwflags: UInt, pbelement: MutPtr, pcbelement: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSerializeCertificateStoreElement(pcertcontext.rawAddress.toString(), dwflags.toInt(), pbelement.rawAddress.toString(), pcbelement.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCRLContextProperty(pcrlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSetCRLContextProperty(pcrlcontext.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCTLContextProperty(pctlcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSetCTLContextProperty(pctlcontext.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCertificateContextPropertiesFromCTLEntry(pcertcontext: ConstPtr, pctlentry: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextPropertiesFromCTLEntry(pcertcontext.rawAddress.toString(), pctlentry.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetCertificateContextProperty(pcertcontext: ConstPtr, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSetCertificateContextProperty(pcertcontext.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetEnhancedKeyUsage(pcertcontext: ConstPtr, pusage: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSetEnhancedKeyUsage(pcertcontext.rawAddress.toString(), pusage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certSetStoreProperty(hcertstore: Hcertstore, dwpropid: UInt, dwflags: UInt, pvdata: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertSetStoreProperty(hcertstore.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certStrToNameA(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertStrToNameA(dwcertencodingtype.toInt(), pszx500.rawAddress.toString(), dwstrtype.toInt(), pvreserved.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString(), ppszerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certStrToNameW(dwcertencodingtype: CertQueryEncodingType, pszx500: Pcwstr, dwstrtype: CertStringType, pvreserved: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr, ppszerror: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertStrToNameW(dwcertencodingtype.toInt(), pszx500.rawAddress.toString(), dwstrtype.toInt(), pvreserved.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString(), ppszerror.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certUnregisterPhysicalStore(pvsystemstore: ConstPtr, dwflags: UInt, pwszstorename: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertUnregisterPhysicalStore(pvsystemstore.rawAddress.toString(), dwflags.toInt(), pwszstorename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certUnregisterSystemStore(pvsystemstore: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertUnregisterSystemStore(pvsystemstore.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCRLRevocation(dwcertencodingtype: CertQueryEncodingType, pcertid: ConstPtr, ccrlinfo: UInt, rgpcrlinfo: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyCRLRevocation(dwcertencodingtype.toInt(), pcertid.rawAddress.toString(), ccrlinfo.toInt(), rgpcrlinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCRLTimeValidity(ptimetoverify: ConstPtr, pcrlinfo: ConstPtr): Int =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyCRLTimeValidity(ptimetoverify.rawAddress.toString(), pcrlinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCTLUsage(dwencodingtype: UInt, dwsubjecttype: UInt, pvsubject: ConstPtr, psubjectusage: ConstPtr, dwflags: UInt, pverifyusagepara: ConstPtr, pverifyusagestatus: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyCTLUsage(dwencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress.toString(), psubjectusage.rawAddress.toString(), dwflags.toInt(), pverifyusagepara.rawAddress.toString(), pverifyusagestatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyCertificateChainPolicy(pszpolicyoid: Pcstr, pchaincontext: ConstPtr, ppolicypara: ConstPtr, ppolicystatus: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyCertificateChainPolicy(pszpolicyoid.rawAddress.toString(), pchaincontext.rawAddress.toString(), ppolicypara.rawAddress.toString(), ppolicystatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyRevocation(dwencodingtype: UInt, dwrevtype: UInt, ccontext: UInt, rgpvcontext: ConstPtr, dwflags: UInt, prevpara: ConstPtr, prevstatus: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyRevocation(dwencodingtype.toInt(), dwrevtype.toInt(), ccontext.toInt(), rgpvcontext.rawAddress.toString(), dwflags.toInt(), prevpara.rawAddress.toString(), prevstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifySubjectCertificateContext(psubject: ConstPtr, pissuer: ConstPtr, pdwflags: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifySubjectCertificateContext(psubject.rawAddress.toString(), pissuer.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyTimeValidity(ptimetoverify: ConstPtr, pcertinfo: ConstPtr): Int =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyTimeValidity(ptimetoverify.rawAddress.toString(), pcertinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun certVerifyValidityNesting(psubjectinfo: ConstPtr, pissuerinfo: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCertVerifyValidityNesting(psubjectinfo.rawAddress.toString(), pissuerinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeCryptoHandle(hcrypto: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCloseCryptoHandle(hcrypto.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireCertificatePrivateKey(pcert: ConstPtr, dwflags: CryptAcquireFlags, pvparameters: ConstPtr, phcryptprovorncryptkey: MutPtr, pdwkeyspec: MutPtr, pfcallerfreeprovorncryptkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptAcquireCertificatePrivateKey(pcert.rawAddress.toString(), dwflags.toInt(), pvparameters.rawAddress.toString(), phcryptprovorncryptkey.rawAddress.toString(), pdwkeyspec.rawAddress.toString(), pfcallerfreeprovorncryptkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireContextA(phprov: MutPtr, szcontainer: Pcstr, szprovider: Pcstr, dwprovtype: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptAcquireContextA(phprov.rawAddress.toString(), szcontainer.rawAddress.toString(), szprovider.rawAddress.toString(), dwprovtype.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptAcquireContextW(phprov: MutPtr, szcontainer: Pcwstr, szprovider: Pcwstr, dwprovtype: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptAcquireContextW(phprov.rawAddress.toString(), szcontainer.rawAddress.toString(), szprovider.rawAddress.toString(), dwprovtype.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptBinaryToStringA(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pstr, pcchstring: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringA(pbbinary.rawAddress.toString(), cbbinary.toInt(), dwflags.toInt(), pszstring.rawAddress.toString(), pcchstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptBinaryToStringW(pbbinary: ConstPtr, cbbinary: UInt, dwflags: CryptString, pszstring: Pwstr, pcchstring: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptBinaryToStringW(pbbinary.rawAddress.toString(), cbbinary.toInt(), dwflags.toInt(), pszstring.rawAddress.toString(), pcchstring.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCloseAsyncHandle(hasync: Hcryptasync): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptCloseAsyncHandle(hasync.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptContextAddRef(hprov: ULong, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptContextAddRef(hprov.toString(), pdwreserved.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateAsyncHandle(dwflags: UInt, phasync: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptCreateAsyncHandle(dwflags.toInt(), phasync.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateHash(hprov: ULong, algid: AlgId, hkey: ULong, dwflags: UInt, phhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptCreateHash(hprov.toString(), algid.toInt(), hkey.toString(), dwflags.toInt(), phhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptCreateKeyIdentifierFromCSP(dwcertencodingtype: CertQueryEncodingType, pszpubkeyoid: Pcstr, ppubkeystruc: ConstPtr, cbpubkeystruc: UInt, dwflags: UInt, pvreserved: ConstPtr, pbhash: MutPtr, pcbhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptCreateKeyIdentifierFromCSP(dwcertencodingtype.toInt(), pszpubkeyoid.rawAddress.toString(), ppubkeystruc.rawAddress.toString(), cbpubkeystruc.toInt(), dwflags.toInt(), pvreserved.rawAddress.toString(), pbhash.rawAddress.toString(), pcbhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeMessage(dwmsgtypeflags: UInt, pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencodedblob: ConstPtr, cbencodedblob: UInt, dwprevinnercontenttype: UInt, pdwmsgtype: MutPtr, pdwinnercontenttype: MutPtr, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDecodeMessage(dwmsgtypeflags.toInt(), pdecryptpara.rawAddress.toString(), pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbencodedblob.rawAddress.toString(), cbencodedblob.toInt(), dwprevinnercontenttype.toInt(), pdwmsgtype.rawAddress.toString(), pdwinnercontenttype.rawAddress.toString(), pbdecoded.rawAddress.toString(), pcbdecoded.rawAddress.toString(), ppxchgcert.rawAddress.toString(), ppsignercert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDecodeObject(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), dwflags.toInt(), pvstructinfo.rawAddress.toString(), pcbstructinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, dwflags: UInt, pdecodepara: ConstPtr, pvstructinfo: MutPtr, pcbstructinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDecodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), dwflags.toInt(), pdecodepara.rawAddress.toString(), pvstructinfo.rawAddress.toString(), pcbstructinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDecrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecryptAndVerifyMessageSignature(pdecryptpara: ConstPtr, pverifypara: ConstPtr, dwsignerindex: UInt, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr, ppsignercert: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDecryptAndVerifyMessageSignature(pdecryptpara.rawAddress.toString(), pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbencryptedblob.rawAddress.toString(), cbencryptedblob.toInt(), pbdecrypted.rawAddress.toString(), pcbdecrypted.rawAddress.toString(), ppxchgcert.rawAddress.toString(), ppsignercert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDecryptMessage(pdecryptpara: ConstPtr, pbencryptedblob: ConstPtr, cbencryptedblob: UInt, pbdecrypted: MutPtr, pcbdecrypted: MutPtr, ppxchgcert: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDecryptMessage(pdecryptpara.rawAddress.toString(), pbencryptedblob.rawAddress.toString(), cbencryptedblob.toInt(), pbdecrypted.rawAddress.toString(), pcbdecrypted.rawAddress.toString(), ppxchgcert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDeriveKey(hprov: ULong, algid: AlgId, hbasedata: ULong, dwflags: UInt, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDeriveKey(hprov.toString(), algid.toInt(), hbasedata.toString(), dwflags.toInt(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDestroyHash(hhash: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDestroyHash(hhash.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDestroyKey(hkey: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDestroyKey(hkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDuplicateHash(hhash: ULong, pdwreserved: ConstPtr, dwflags: UInt, phhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDuplicateHash(hhash.toString(), pdwreserved.rawAddress.toString(), dwflags.toInt(), phhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptDuplicateKey(hkey: ULong, pdwreserved: ConstPtr, dwflags: UInt, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptDuplicateKey(hkey.toString(), pdwreserved.rawAddress.toString(), dwflags.toInt(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncodeObject(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEncodeObject(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pvstructinfo.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncodeObjectEx(dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, dwflags: CryptEncodeObjectFlags, pencodepara: ConstPtr, pvencoded: MutPtr, pcbencoded: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEncodeObjectEx(dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pvstructinfo.rawAddress.toString(), dwflags.toInt(), pencodepara.rawAddress.toString(), pvencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncrypt(hkey: ULong, hhash: ULong, final: Bool, dwflags: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwbuflen: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEncrypt(hkey.toString(), hhash.toString(), final, dwflags.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwbuflen.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEncryptMessage(pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobeencrypted: ConstPtr, cbtobeencrypted: UInt, pbencryptedblob: MutPtr, pcbencryptedblob: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEncryptMessage(pencryptpara.rawAddress.toString(), crecipientcert.toInt(), rgprecipientcert.rawAddress.toString(), pbtobeencrypted.rawAddress.toString(), cbtobeencrypted.toInt(), pbencryptedblob.rawAddress.toString(), pcbencryptedblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumKeyIdentifierProperties(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvarg: MutPtr, pfnenum: PfnCryptEnumKeyidProp): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumKeyIdentifierProperties(pkeyidentifier.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress.toString(), pvreserved.rawAddress.toString(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, dwflags: UInt, pvarg: MutPtr, pfnenumoidfunc: PfnCryptEnumOidFunc): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumOIDInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumoidinfo: PfnCryptEnumOidInfo): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumOIDInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProviderTypesA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pstr, pcbtypename: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesA(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), sztypename.rawAddress.toString(), pcbtypename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProviderTypesW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, sztypename: Pwstr, pcbtypename: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumProviderTypesW(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), sztypename.rawAddress.toString(), pcbtypename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProvidersA(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pstr, pcbprovname: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersA(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), szprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptEnumProvidersW(dwindex: UInt, pdwreserved: ConstPtr, dwflags: UInt, pdwprovtype: MutPtr, szprovname: Pwstr, pcbprovname: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptEnumProvidersW(dwindex.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pdwprovtype.rawAddress.toString(), szprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportKey(hkey: ULong, hexpkey: ULong, dwblobtype: UInt, dwflags: CryptKeyFlags, pbdata: MutPtr, pdwdatalen: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptExportKey(hkey.toString(), hexpkey.toString(), dwblobtype.toInt(), dwflags.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPKCS8(hcryptprov: ULong, dwkeyspec: UInt, pszprivatekeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pbprivatekeyblob: MutPtr, pcbprivatekeyblob: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptExportPKCS8(hcryptprov.toString(), dwkeyspec.toInt(), pszprivatekeyobjid.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), pbprivatekeyblob.rawAddress.toString(), pcbprivatekeyblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfo(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfo(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), pcbinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfoEx(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoEx(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pszpublickeyobjid.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), pinfo.rawAddress.toString(), pcbinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey: BcryptKeyHandle, dwcertencodingtype: CertQueryEncodingType, pszpublickeyobjid: Pcstr, dwflags: UInt, pvauxinfo: ConstPtr, pinfo: MutPtr, pcbinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptExportPublicKeyInfoFromBCryptKeyHandle(hbcryptkey.rawAddress.toString(), dwcertencodingtype.toInt(), pszpublickeyobjid.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), pinfo.rawAddress.toString(), pcbinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindCertificateKeyProvInfo(pcert: ConstPtr, dwflags: CryptFindFlags, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptFindCertificateKeyProvInfo(pcert.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindLocalizedName(pwszcryptname: Pcwstr): Pcwstr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) ConstPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptFindLocalizedName(pwszcryptname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFindOIDInfo(dwkeytype: UInt, pvkey: ConstPtr, dwgroupid: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptFindOIDInfo(dwkeytype.toInt(), pvkey.rawAddress.toString(), dwgroupid.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFormatObject(dwcertencodingtype: CertQueryEncodingType, dwformattype: UInt, dwformatstrtype: UInt, pformatstruct: ConstPtr, lpszstructtype: Pcstr, pbencoded: ConstPtr, cbencoded: UInt, pbformat: MutPtr, pcbformat: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptFormatObject(dwcertencodingtype.toInt(), dwformattype.toInt(), dwformatstrtype.toInt(), pformatstruct.rawAddress.toString(), lpszstructtype.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbformat.rawAddress.toString(), pcbformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptFreeOIDFunctionAddress(hfuncaddr: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptFreeOIDFunctionAddress(hfuncaddr.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGenKey(hprov: ULong, algid: AlgId, dwflags: CryptKeyFlags, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGenKey(hprov.toString(), algid.toInt(), dwflags.toInt(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGenRandom(hprov: ULong, dwlen: UInt, pbbuffer: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGenRandom(hprov.toString(), dwlen.toInt(), pbbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, ppvparam: MutPtr, ppfnfree: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetAsyncParam(hasync.toString(), pszparamoid.rawAddress.toString(), ppvparam.rawAddress.toString(), ppfnfree.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultOIDDllList(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdlllist: Pwstr, pcchdlllist: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDDllList(hfuncset.rawAddress.toString(), dwencodingtype.toInt(), pwszdlllist.rawAddress.toString(), pcchdlllist.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pwszdll: Pcwstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultOIDFunctionAddress(hfuncset.rawAddress.toString(), dwencodingtype.toInt(), pwszdll.rawAddress.toString(), dwflags.toInt(), ppvfuncaddr.rawAddress.toString(), phfuncaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultProviderA(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pstr, pcbprovname: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderA(dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pszprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetDefaultProviderW(dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt, pszprovname: Pwstr, pcbprovname: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetDefaultProviderW(dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt(), pszprovname.rawAddress.toString(), pcbprovname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetHashParam(hhash: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetHashParam(hhash.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetKeyIdentifierProperty(pkeyidentifier.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress.toString(), pvreserved.rawAddress.toString(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetKeyParam(hkey.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetMessageCertificates(dwmsgandcertencodingtype: UInt, hcryptprov: HcryptprovLegacy, dwflags: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetMessageCertificates(dwmsgandcertencodingtype.toInt(), hcryptprov.toString(), dwflags.toInt(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetMessageSignerCount(dwmsgencodingtype: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt): Int =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetMessageSignerCount(dwmsgencodingtype.toInt(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetOIDFunctionAddress(hfuncset: ConstPtr, dwencodingtype: UInt, pszoid: Pcstr, dwflags: UInt, ppvfuncaddr: MutPtr, phfuncaddr: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionAddress(hfuncset.rawAddress.toString(), dwencodingtype.toInt(), pszoid.rawAddress.toString(), dwflags.toInt(), ppvfuncaddr.rawAddress.toString(), phfuncaddr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, pdwvaluetype: MutPtr, pbvaluedata: MutPtr, pcbvaluedata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), pdwvaluetype.rawAddress.toString(), pbvaluedata.rawAddress.toString(), pcbvaluedata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetObjectUrl(pszurloid: Pcstr, pvpara: ConstPtr, dwflags: CryptGetUrlFlags, purlarray: MutPtr, pcburlarray: MutPtr, purlinfo: MutPtr, pcburlinfo: MutPtr, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetObjectUrl(pszurloid.rawAddress.toString(), pvpara.rawAddress.toString(), dwflags.toInt(), purlarray.rawAddress.toString(), pcburlarray.rawAddress.toString(), purlinfo.rawAddress.toString(), pcburlinfo.rawAddress.toString(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetProvParam(hprov: ULong, dwparam: UInt, pbdata: MutPtr, pdwdatalen: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetProvParam(hprov.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), pdwdatalen.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptGetUserKey(hprov: ULong, dwkeyspec: UInt, phuserkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptGetUserKey(hprov.toString(), dwkeyspec.toInt(), phuserkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashCertificate(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashCertificate(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashCertificate2(pwszcnghashalgid: Pcwstr, dwflags: UInt, pvreserved: ConstPtr, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashCertificate2(pwszcnghashalgid.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashData(hhash: ULong, pbdata: ConstPtr, dwdatalen: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashData(hhash.toString(), pbdata.rawAddress.toString(), dwdatalen.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashMessage(phashpara: ConstPtr, fdetachedhash: Bool, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbhashedblob: MutPtr, pcbhashedblob: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashMessage(phashpara.rawAddress.toString(), fdetachedhash, ctobehashed.toInt(), rgpbtobehashed.rawAddress.toString(), rgcbtobehashed.rawAddress.toString(), pbhashedblob.rawAddress.toString(), pcbhashedblob.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashPublicKeyInfo(hcryptprov: HcryptprovLegacy, algid: AlgId, dwflags: UInt, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashPublicKeyInfo(hcryptprov.toString(), algid.toInt(), dwflags.toInt(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashSessionKey(hhash: ULong, hkey: ULong, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashSessionKey(hhash.toString(), hkey.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptHashToBeSigned(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptHashToBeSigned(hcryptprov.toString(), dwcertencodingtype.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportKey(hprov: ULong, pbdata: ConstPtr, dwdatalen: UInt, hpubkey: ULong, dwflags: CryptKeyFlags, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptImportKey(hprov.toString(), pbdata.rawAddress.toString(), dwdatalen.toInt(), hpubkey.toString(), dwflags.toInt(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPKCS8(sprivatekeyandparams: CryptPkcs8ImportParams, dwflags: CryptKeyFlags, phcryptprov: MutPtr, pvauxinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfo(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfo(hcryptprov.toString(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfoEx(hcryptprov: ULong, dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, aikeyalg: AlgId, dwflags: UInt, pvauxinfo: ConstPtr, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx(hcryptprov.toString(), dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), aikeyalg.toInt(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptImportPublicKeyInfoEx2(dwcertencodingtype: CertQueryEncodingType, pinfo: ConstPtr, dwflags: CryptImportPublicKeyFlags, pvauxinfo: ConstPtr, phkey: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptImportPublicKeyInfoEx2(dwcertencodingtype.toInt(), pinfo.rawAddress.toString(), dwflags.toInt(), pvauxinfo.rawAddress.toString(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInitOIDFunctionSet(pszfuncname: Pcstr, dwflags: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptInitOIDFunctionSet(pszfuncname.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallCancelRetrieval(pfncancel: PfnCryptCancelRetrieval, pvarg: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptInstallCancelRetrieval(0L.toString(), pvarg.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallDefaultContext(hcryptprov: ULong, dwdefaulttype: CryptDefaultContextType, pvdefaultpara: ConstPtr, dwflags: CryptDefaultContextFlags, pvreserved: ConstPtr, phdefaultcontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptInstallDefaultContext(hcryptprov.toString(), dwdefaulttype.toInt(), pvdefaultpara.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString(), phdefaultcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptInstallOIDFunctionAddress(hmodule: Hmodule, dwencodingtype: UInt, pszfuncname: Pcstr, cfuncentry: UInt, rgfuncentry: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptInstallOIDFunctionAddress(hmodule.rawAddress.toString(), dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), cfuncentry.toInt(), rgfuncentry.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMemAlloc(cbsize: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMemAlloc(cbsize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMemFree(pv: ConstPtr) {
    if (windowsWin32SecurityCryptographyNapiAddon != null) {
        windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMemFree(pv.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun cryptMemRealloc(pv: ConstPtr, cbsize: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMemRealloc(pv.rawAddress.toString(), cbsize.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCalculateEncodedLength(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, cbdata: UInt): UInt =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgCalculateEncodedLength(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.rawAddress.toString(), pszinnercontentobjid.rawAddress.toString(), cbdata.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgClose(hcryptmsg: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgClose(hcryptmsg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgControl(hcryptmsg: ConstPtr, dwflags: UInt, dwctrltype: UInt, pvctrlpara: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgControl(hcryptmsg.rawAddress.toString(), dwflags.toInt(), dwctrltype.toInt(), pvctrlpara.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCountersign(hcryptmsg: ConstPtr, dwindex: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgCountersign(hcryptmsg.rawAddress.toString(), dwindex.toInt(), ccountersigners.toInt(), rgcountersigners.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgCountersignEncoded(dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, ccountersigners: UInt, rgcountersigners: ConstPtr, pbcountersignature: MutPtr, pcbcountersignature: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgCountersignEncoded(dwencodingtype.toInt(), pbsignerinfo.rawAddress.toString(), cbsignerinfo.toInt(), ccountersigners.toInt(), rgcountersigners.rawAddress.toString(), pbcountersignature.rawAddress.toString(), pcbcountersignature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgDuplicate(hcryptmsg: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgDuplicate(hcryptmsg.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgEncodeAndSignCTL(dwmsgencodingtype: UInt, pctlinfo: ConstPtr, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgEncodeAndSignCTL(dwmsgencodingtype.toInt(), pctlinfo.rawAddress.toString(), psigninfo.rawAddress.toString(), dwflags.toInt(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgGetAndVerifySigner(hcryptmsg: ConstPtr, csignerstore: UInt, rghsignerstore: ConstPtr, dwflags: UInt, ppsigner: MutPtr, pdwsignerindex: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgGetAndVerifySigner(hcryptmsg.rawAddress.toString(), csignerstore.toInt(), rghsignerstore.rawAddress.toString(), dwflags.toInt(), ppsigner.rawAddress.toString(), pdwsignerindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgGetParam(hcryptmsg: ConstPtr, dwparamtype: UInt, dwindex: UInt, pvdata: MutPtr, pcbdata: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgGetParam(hcryptmsg.rawAddress.toString(), dwparamtype.toInt(), dwindex.toInt(), pvdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgOpenToDecode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: UInt, hcryptprov: HcryptprovLegacy, precipientinfo: ConstPtr, pstreaminfo: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToDecode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), hcryptprov.toString(), precipientinfo.rawAddress.toString(), pstreaminfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgOpenToEncode(dwmsgencodingtype: UInt, dwflags: UInt, dwmsgtype: CryptMsgType, pvmsgencodeinfo: ConstPtr, pszinnercontentobjid: Pcstr, pstreaminfo: ConstPtr): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgOpenToEncode(dwmsgencodingtype.toInt(), dwflags.toInt(), dwmsgtype.toInt(), pvmsgencodeinfo.rawAddress.toString(), pszinnercontentobjid.rawAddress.toString(), pstreaminfo.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgSignCTL(dwmsgencodingtype: UInt, pbctlcontent: ConstPtr, cbctlcontent: UInt, psigninfo: ConstPtr, dwflags: UInt, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgSignCTL(dwmsgencodingtype.toInt(), pbctlcontent.rawAddress.toString(), cbctlcontent.toInt(), psigninfo.rawAddress.toString(), dwflags.toInt(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgUpdate(hcryptmsg: ConstPtr, pbdata: ConstPtr, cbdata: UInt, ffinal: Bool): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgUpdate(hcryptmsg.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toInt(), ffinal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgVerifyCountersignatureEncoded(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, pcicountersigner: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncoded(hcryptprov.toString(), dwencodingtype.toInt(), pbsignerinfo.rawAddress.toString(), cbsignerinfo.toInt(), pbsignerinfocountersignature.rawAddress.toString(), cbsignerinfocountersignature.toInt(), pcicountersigner.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptMsgVerifyCountersignatureEncodedEx(hcryptprov: HcryptprovLegacy, dwencodingtype: UInt, pbsignerinfo: ConstPtr, cbsignerinfo: UInt, pbsignerinfocountersignature: ConstPtr, cbsignerinfocountersignature: UInt, dwsignertype: UInt, pvsigner: ConstPtr, dwflags: UInt, pvextra: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptMsgVerifyCountersignatureEncodedEx(hcryptprov.toString(), dwencodingtype.toInt(), pbsignerinfo.rawAddress.toString(), cbsignerinfo.toInt(), pbsignerinfocountersignature.rawAddress.toString(), cbsignerinfocountersignature.toInt(), dwsignertype.toInt(), pvsigner.rawAddress.toString(), dwflags.toInt(), pvextra.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptProtectData(pdatain: ConstPtr, szdatadescr: Pcwstr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptProtectData(pdatain.rawAddress.toString(), szdatadescr.rawAddress.toString(), poptionalentropy.rawAddress.toString(), pvreserved.rawAddress.toString(), ppromptstruct.rawAddress.toString(), dwflags.toInt(), pdataout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptProtectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptProtectMemory(pdatain.rawAddress.toString(), cbdatain.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptQueryObject(dwobjecttype: CertQueryObjectType, pvobject: ConstPtr, dwexpectedcontenttypeflags: CertQueryContentTypeFlags, dwexpectedformattypeflags: CertQueryFormatTypeFlags, dwflags: UInt, pdwmsgandcertencodingtype: MutPtr, pdwcontenttype: MutPtr, pdwformattype: MutPtr, phcertstore: MutPtr, phmsg: MutPtr, ppvcontext: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptQueryObject(dwobjecttype.toInt(), pvobject.rawAddress.toString(), dwexpectedcontenttypeflags.toInt(), dwexpectedformattypeflags.toInt(), dwflags.toInt(), pdwmsgandcertencodingtype.rawAddress.toString(), pdwcontenttype.rawAddress.toString(), pdwformattype.rawAddress.toString(), phcertstore.rawAddress.toString(), phmsg.rawAddress.toString(), ppvcontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, dwindex: UInt, pwszdll: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptRegisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), dwindex.toInt(), pwszdll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszdll: Pcwstr, pszoverridefuncname: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), pwszdll.rawAddress.toString(), pszoverridefuncname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRegisterOIDInfo(pinfo: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptRegisterOIDInfo(pinfo.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptReleaseContext(hprov: ULong, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptReleaseContext(hprov.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveObjectByUrlA(pszurl: Pcstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlA(pszurl.rawAddress.toString(), pszobjectoid.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.rawAddress.toString(), hasyncretrieve.toString(), pcredentials.rawAddress.toString(), pvverify.rawAddress.toString(), pauxinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveObjectByUrlW(pszurl: Pcwstr, pszobjectoid: Pcstr, dwretrievalflags: UInt, dwtimeout: UInt, ppvobject: MutPtr, hasyncretrieve: Hcryptasync, pcredentials: ConstPtr, pvverify: ConstPtr, pauxinfo: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptRetrieveObjectByUrlW(pszurl.rawAddress.toString(), pszobjectoid.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), ppvobject.rawAddress.toString(), hasyncretrieve.toString(), pcredentials.rawAddress.toString(), pvverify.rawAddress.toString(), pauxinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptRetrieveTimeStamp(wszurl: Pcwstr, dwretrievalflags: UInt, dwtimeout: UInt, pszhashid: Pcstr, ppara: ConstPtr, pbdata: ConstPtr, cbdata: UInt, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptRetrieveTimeStamp(wszurl.rawAddress.toString(), dwretrievalflags.toInt(), dwtimeout.toInt(), pszhashid.rawAddress.toString(), ppara.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toInt(), pptscontext.rawAddress.toString(), pptssigner.rawAddress.toString(), phstore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetAsyncParam(hasync: Hcryptasync, pszparamoid: Pcstr, pvparam: ConstPtr, pfnfree: PfnCryptAsyncParamFreeFunc): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetAsyncParam(hasync.toString(), pszparamoid.rawAddress.toString(), pvparam.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetHashParam(hhash: ULong, dwparam: CryptSetHashParam, pbdata: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetHashParam(hhash.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetKeyIdentifierProperty(pkeyidentifier: ConstPtr, dwpropid: UInt, dwflags: UInt, pwszcomputername: Pcwstr, pvreserved: ConstPtr, pvdata: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetKeyIdentifierProperty(pkeyidentifier.rawAddress.toString(), dwpropid.toInt(), dwflags.toInt(), pwszcomputername.rawAddress.toString(), pvreserved.rawAddress.toString(), pvdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetKeyParam(hkey: ULong, dwparam: CryptKeyParamId, pbdata: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetKeyParam(hkey.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetOIDFunctionValue(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr, pwszvaluename: Pcwstr, dwvaluetype: RegValueType, pbvaluedata: ConstPtr, cbvaluedata: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetOIDFunctionValue(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString(), pwszvaluename.rawAddress.toString(), dwvaluetype.toInt(), pbvaluedata.rawAddress.toString(), cbvaluedata.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProvParam(hprov: ULong, dwparam: CryptSetProvParamId, pbdata: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetProvParam(hprov.toString(), dwparam.toInt(), pbdata.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderA(pszprovname: Pcstr, dwprovtype: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetProviderA(pszprovname.rawAddress.toString(), dwprovtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderExA(pszprovname: Pcstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetProviderExA(pszprovname.rawAddress.toString(), dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderExW(pszprovname: Pcwstr, dwprovtype: UInt, pdwreserved: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetProviderExW(pszprovname.rawAddress.toString(), dwprovtype.toInt(), pdwreserved.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSetProviderW(pszprovname: Pcwstr, dwprovtype: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSetProviderW(pszprovname.rawAddress.toString(), dwprovtype.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignAndEncodeCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwcertencodingtype: CertQueryEncodingType, lpszstructtype: Pcstr, pvstructinfo: ConstPtr, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbencoded: MutPtr, pcbencoded: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignAndEncodeCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), lpszstructtype.rawAddress.toString(), pvstructinfo.rawAddress.toString(), psignaturealgorithm.rawAddress.toString(), pvhashauxinfo.rawAddress.toString(), pbencoded.rawAddress.toString(), pcbencoded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignAndEncryptMessage(psignpara: ConstPtr, pencryptpara: ConstPtr, crecipientcert: UInt, rgprecipientcert: ConstPtr, pbtobesignedandencrypted: ConstPtr, cbtobesignedandencrypted: UInt, pbsignedandencryptedblob: MutPtr, pcbsignedandencryptedblob: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignAndEncryptMessage(psignpara.rawAddress.toString(), pencryptpara.rawAddress.toString(), crecipientcert.toInt(), rgprecipientcert.rawAddress.toString(), pbtobesignedandencrypted.rawAddress.toString(), cbtobesignedandencrypted.toInt(), pbsignedandencryptedblob.rawAddress.toString(), pcbsignedandencryptedblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignCertificate(hcryptprovorncryptkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: UInt, dwcertencodingtype: CertQueryEncodingType, pbencodedtobesigned: ConstPtr, cbencodedtobesigned: UInt, psignaturealgorithm: ConstPtr, pvhashauxinfo: ConstPtr, pbsignature: MutPtr, pcbsignature: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignCertificate(hcryptprovorncryptkey.toString(), dwkeyspec.toInt(), dwcertencodingtype.toInt(), pbencodedtobesigned.rawAddress.toString(), cbencodedtobesigned.toInt(), psignaturealgorithm.rawAddress.toString(), pvhashauxinfo.rawAddress.toString(), pbsignature.rawAddress.toString(), pcbsignature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignHashA(hhash: ULong, dwkeyspec: UInt, szdescription: Pcstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignHashA(hhash.toString(), dwkeyspec.toInt(), szdescription.rawAddress.toString(), dwflags.toInt(), pbsignature.rawAddress.toString(), pdwsiglen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignHashW(hhash: ULong, dwkeyspec: UInt, szdescription: Pcwstr, dwflags: UInt, pbsignature: MutPtr, pdwsiglen: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignHashW(hhash.toString(), dwkeyspec.toInt(), szdescription.rawAddress.toString(), dwflags.toInt(), pbsignature.rawAddress.toString(), pdwsiglen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignMessage(psignpara: ConstPtr, fdetachedsignature: Bool, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignMessage(psignpara.rawAddress.toString(), fdetachedsignature, ctobesigned.toInt(), rgpbtobesigned.rawAddress.toString(), rgcbtobesigned.rawAddress.toString(), pbsignedblob.rawAddress.toString(), pcbsignedblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptSignMessageWithKey(psignpara: ConstPtr, pbtobesigned: ConstPtr, cbtobesigned: UInt, pbsignedblob: MutPtr, pcbsignedblob: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptSignMessageWithKey(psignpara.rawAddress.toString(), pbtobesigned.rawAddress.toString(), cbtobesigned.toInt(), pbsignedblob.rawAddress.toString(), pcbsignedblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptStringToBinaryA(pszstring: Pcstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryA(pszstring.rawAddress.toString(), cchstring.toInt(), dwflags.toInt(), pbbinary.rawAddress.toString(), pcbbinary.rawAddress.toString(), pdwskip.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptStringToBinaryW(pszstring: Pcwstr, cchstring: UInt, dwflags: CryptString, pbbinary: MutPtr, pcbbinary: MutPtr, pdwskip: MutPtr, pdwflags: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptStringToBinaryW(pszstring.rawAddress.toString(), cchstring.toInt(), dwflags.toInt(), pbbinary.rawAddress.toString(), pcbbinary.rawAddress.toString(), pdwskip.rawAddress.toString(), pdwflags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUninstallCancelRetrieval(dwflags: UInt, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUninstallCancelRetrieval(dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUninstallDefaultContext(hdefaultcontext: ConstPtr, dwflags: UInt, pvreserved: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUninstallDefaultContext(hdefaultcontext.rawAddress.toString(), dwflags.toInt(), pvreserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnprotectData(pdatain: ConstPtr, ppszdatadescr: MutPtr, poptionalentropy: ConstPtr, pvreserved: ConstPtr, ppromptstruct: ConstPtr, dwflags: UInt, pdataout: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUnprotectData(pdatain.rawAddress.toString(), ppszdatadescr.rawAddress.toString(), poptionalentropy.rawAddress.toString(), pvreserved.rawAddress.toString(), ppromptstruct.rawAddress.toString(), dwflags.toInt(), pdataout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnprotectMemory(pdatain: MutPtr, cbdatain: UInt, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUnprotectMemory(pdatain.rawAddress.toString(), cbdatain.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterDefaultOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pwszdll: Pcwstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUnregisterDefaultOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pwszdll.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterOIDFunction(dwencodingtype: UInt, pszfuncname: Pcstr, pszoid: Pcstr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDFunction(dwencodingtype.toInt(), pszfuncname.rawAddress.toString(), pszoid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUnregisterOIDInfo(pinfo: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUnregisterOIDInfo(pinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptUpdateProtectedState(poldsid: Psid, pwszoldpassword: Pcwstr, dwflags: UInt, pdwsuccesscount: MutPtr, pdwfailurecount: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptUpdateProtectedState(poldsid.rawAddress.toString(), pwszoldpassword.rawAddress.toString(), dwflags.toInt(), pdwsuccesscount.rawAddress.toString(), pdwfailurecount.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyCertificateSignature(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, pbencoded: ConstPtr, cbencoded: UInt, ppublickey: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignature(hcryptprov.toString(), dwcertencodingtype.toInt(), pbencoded.rawAddress.toString(), cbencoded.toInt(), ppublickey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyCertificateSignatureEx(hcryptprov: HcryptprovLegacy, dwcertencodingtype: CertQueryEncodingType, dwsubjecttype: UInt, pvsubject: ConstPtr, dwissuertype: UInt, pvissuer: ConstPtr, dwflags: CryptVerifyCertFlags, pvextra: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyCertificateSignatureEx(hcryptprov.toString(), dwcertencodingtype.toInt(), dwsubjecttype.toInt(), pvsubject.rawAddress.toString(), dwissuertype.toInt(), pvissuer.rawAddress.toString(), dwflags.toInt(), pvextra.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyDetachedMessageHash(phashpara: ConstPtr, pbdetachedhashblob: ConstPtr, cbdetachedhashblob: UInt, ctobehashed: UInt, rgpbtobehashed: ConstPtr, rgcbtobehashed: ConstPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageHash(phashpara.rawAddress.toString(), pbdetachedhashblob.rawAddress.toString(), cbdetachedhashblob.toInt(), ctobehashed.toInt(), rgpbtobehashed.rawAddress.toString(), rgcbtobehashed.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyDetachedMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbdetachedsignblob: ConstPtr, cbdetachedsignblob: UInt, ctobesigned: UInt, rgpbtobesigned: ConstPtr, rgcbtobesigned: ConstPtr, ppsignercert: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyDetachedMessageSignature(pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbdetachedsignblob.rawAddress.toString(), cbdetachedsignblob.toInt(), ctobesigned.toInt(), rgpbtobesigned.rawAddress.toString(), rgcbtobesigned.rawAddress.toString(), ppsignercert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageHash(phashpara: ConstPtr, pbhashedblob: ConstPtr, cbhashedblob: UInt, pbtobehashed: MutPtr, pcbtobehashed: MutPtr, pbcomputedhash: MutPtr, pcbcomputedhash: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageHash(phashpara.rawAddress.toString(), pbhashedblob.rawAddress.toString(), cbhashedblob.toInt(), pbtobehashed.rawAddress.toString(), pcbtobehashed.rawAddress.toString(), pbcomputedhash.rawAddress.toString(), pcbcomputedhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageSignature(pverifypara: ConstPtr, dwsignerindex: UInt, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr, ppsignercert: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignature(pverifypara.rawAddress.toString(), dwsignerindex.toInt(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt(), pbdecoded.rawAddress.toString(), pcbdecoded.rawAddress.toString(), ppsignercert.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyMessageSignatureWithKey(pverifypara: ConstPtr, ppublickeyinfo: ConstPtr, pbsignedblob: ConstPtr, cbsignedblob: UInt, pbdecoded: MutPtr, pcbdecoded: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyMessageSignatureWithKey(pverifypara.rawAddress.toString(), ppublickeyinfo.rawAddress.toString(), pbsignedblob.rawAddress.toString(), cbsignedblob.toInt(), pbdecoded.rawAddress.toString(), pcbdecoded.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifySignatureA(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureA(hhash.toString(), pbsignature.rawAddress.toString(), dwsiglen.toInt(), hpubkey.toString(), szdescription.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifySignatureW(hhash: ULong, pbsignature: ConstPtr, dwsiglen: UInt, hpubkey: ULong, szdescription: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifySignatureW(hhash.toString(), pbsignature.rawAddress.toString(), dwsiglen.toInt(), hpubkey.toString(), szdescription.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptVerifyTimeStampSignature(pbtscontentinfo: ConstPtr, cbtscontentinfo: UInt, pbdata: ConstPtr, cbdata: UInt, hadditionalstore: Hcertstore, pptscontext: MutPtr, pptssigner: MutPtr, phstore: MutPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptVerifyTimeStampSignature(pbtscontentinfo.rawAddress.toString(), cbtscontentinfo.toInt(), pbdata.rawAddress.toString(), cbdata.toInt(), hadditionalstore.rawAddress.toString(), pptscontext.rawAddress.toString(), pptssigner.rawAddress.toString(), phstore.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlAddObject(hsignatureorobject: ConstPtr, dwflags: UInt, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, ppobject: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlAddObject(hsignatureorobject.rawAddress.toString(), dwflags.toInt(), rgproperty.rawAddress.toString(), cproperty.toInt(), pencoded.rawAddress.toString(), ppobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlClose(hcryptxml: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlClose(hcryptxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlCreateReference(hcryptxml: ConstPtr, dwflags: UInt, wszid: Pcwstr, wszuri: Pcwstr, wsztype: Pcwstr, pdigestmethod: ConstPtr, ctransform: UInt, rgtransform: ConstPtr, phreference: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlCreateReference(hcryptxml.rawAddress.toString(), dwflags.toInt(), wszid.rawAddress.toString(), wszuri.rawAddress.toString(), wsztype.rawAddress.toString(), pdigestmethod.rawAddress.toString(), ctransform.toInt(), rgtransform.rawAddress.toString(), phreference.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlDigestReference(hreference: ConstPtr, dwflags: UInt, pdataproviderin: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlDigestReference(hreference.rawAddress.toString(), dwflags.toInt(), pdataproviderin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlEncode(hcryptxml: ConstPtr, dwcharset: CryptXmlCharset, rgproperty: ConstPtr, cproperty: UInt, pvcallbackstate: MutPtr, pfnwrite: PfnCryptXmlWriteCallback): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlEncode(hcryptxml.rawAddress.toString(), dwcharset, rgproperty.rawAddress.toString(), cproperty.toInt(), pvcallbackstate.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlEnumAlgorithmInfo(dwgroupid: UInt, dwflags: UInt, pvarg: MutPtr, pfnenumalginfo: PfnCryptXmlEnumAlgInfo): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlEnumAlgorithmInfo(dwgroupid.toInt(), dwflags.toInt(), pvarg.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlFindAlgorithmInfo(dwfindbytype: UInt, pvfindby: ConstPtr, dwgroupid: UInt, dwflags: UInt): MutPtr =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlFindAlgorithmInfo(dwfindbytype.toInt(), pvfindby.rawAddress.toString(), dwgroupid.toInt(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetAlgorithmInfo(pxmlalgorithm: ConstPtr, dwflags: CryptXmlFlags, ppalginfo: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlGetAlgorithmInfo(pxmlalgorithm.rawAddress.toString(), dwflags.toInt(), ppalginfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetDocContext(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlGetDocContext(hcryptxml.rawAddress.toString(), ppstruct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetReference(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlGetReference(hcryptxml.rawAddress.toString(), ppstruct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetSignature(hcryptxml: ConstPtr, ppstruct: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlGetSignature(hcryptxml.rawAddress.toString(), ppstruct.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetStatus(hcryptxml: ConstPtr, pstatus: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlGetStatus(hcryptxml.rawAddress.toString(), pstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlGetTransforms(ppconfig: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlGetTransforms(ppconfig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlImportPublicKey(dwflags: CryptXmlFlags, pkeyvalue: ConstPtr, phkey: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlImportPublicKey(dwflags.toInt(), pkeyvalue.rawAddress.toString(), phkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlOpenToDecode(pconfig: ConstPtr, dwflags: CryptXmlFlags, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phcryptxml: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToDecode(pconfig.rawAddress.toString(), dwflags.toInt(), rgproperty.rawAddress.toString(), cproperty.toInt(), pencoded.rawAddress.toString(), phcryptxml.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlOpenToEncode(pconfig: ConstPtr, dwflags: CryptXmlFlags, wszid: Pcwstr, rgproperty: ConstPtr, cproperty: UInt, pencoded: ConstPtr, phsignature: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlOpenToEncode(pconfig.rawAddress.toString(), dwflags.toInt(), wszid.rawAddress.toString(), rgproperty.rawAddress.toString(), cproperty.toInt(), pencoded.rawAddress.toString(), phsignature.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlSetHMACSecret(hsignature: ConstPtr, pbsecret: ConstPtr, cbsecret: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlSetHMACSecret(hsignature.rawAddress.toString(), pbsecret.rawAddress.toString(), cbsecret.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlSign(hsignature: ConstPtr, hkey: HcryptprovOrNcryptKeyHandle, dwkeyspec: CertKeySpec, dwflags: CryptXmlFlags, dwkeyinfospec: CryptXmlKeyinfoSpec, pvkeyinfospec: ConstPtr, psignaturemethod: ConstPtr, pcanonicalization: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlSign(hsignature.rawAddress.toString(), hkey.toString(), dwkeyspec.toInt(), dwflags.toInt(), dwkeyinfospec, pvkeyinfospec.rawAddress.toString(), psignaturemethod.rawAddress.toString(), pcanonicalization.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cryptXmlVerifySignature(hsignature: ConstPtr, hkey: BcryptKeyHandle, dwflags: CryptXmlFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyCryptXmlVerifySignature(hsignature.rawAddress.toString(), hkey.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun decrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyDecrypt(hcrypto.rawAddress.toString(), foaep, cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun encrypt(hcrypto: ConstPtr, foaep: Bool, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyEncrypt(hcrypto.rawAddress.toString(), foaep, cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun findCertsByIssuer(pcertchains: MutPtr, pcbcertchains: MutPtr, pccertchains: MutPtr, pbencodedissuername: ConstPtr, cbencodedissuername: UInt, pwszpurpose: Pcwstr, dwkeyspec: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyFindCertsByIssuer(pcertchains.rawAddress.toString(), pcbcertchains.rawAddress.toString(), pccertchains.rawAddress.toString(), pbencodedissuername.rawAddress.toString(), cbencodedissuername.toInt(), pwszpurpose.rawAddress.toString(), dwkeyspec.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun freeToken(pallocmemory: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyFreeToken(pallocmemory.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun generateDerivedKey(hcrypto: ConstPtr, cblabel: UInt, plabel: ConstPtr, cbnonce: UInt, pnonce: ConstPtr, derivedkeylength: UInt, offset: UInt, algid: Pcwstr, pcbkey: MutPtr, ppkey: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGenerateDerivedKey(hcrypto.rawAddress.toString(), cblabel.toInt(), plabel.rawAddress.toString(), cbnonce.toInt(), pnonce.rawAddress.toString(), derivedkeylength.toInt(), offset.toInt(), algid.rawAddress.toString(), pcbkey.rawAddress.toString(), ppkey.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAsymmetricEncryptionInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetAsymmetricEncryptionInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBrowserToken(dwparamtype: UInt, pparam: ConstPtr, pcbtoken: MutPtr, pptoken: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetBrowserToken(dwparamtype.toInt(), pparam.rawAddress.toString(), pcbtoken.rawAddress.toString(), pptoken.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCipherInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetCipherInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCryptoTransform(hsymmetriccrypto: ConstPtr, mode: UInt, padding: PaddingMode, feedbacksize: UInt, direction: Direction, cbiv: UInt, piv: ConstPtr, pphtransform: MutPtr): Hresult =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getHashInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetHashInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyDerivationInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetKeyDerivationInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyStorageInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetKeyStorageInterface(pszprovidername.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKeyedHash(hsymmetriccrypto: ConstPtr, pphhash: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetKeyedHash(hsymmetriccrypto.rawAddress.toString(), pphhash.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRngInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetRngInterface(pszprovidername.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSChannelInterface(pszprovidername: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetSChannelInterface(pszprovidername.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSecretAgreementInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetSecretAgreementInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSignatureInterface(pszprovidername: Pcwstr, pszalgid: Pcwstr, ppfunctiontable: MutPtr, dwflags: UInt): Ntstatus =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetSignatureInterface(pszprovidername.rawAddress.toString(), pszalgid.rawAddress.toString(), ppfunctiontable.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getToken(cpolicychain: UInt, ppolicychain: ConstPtr, securitytoken: MutPtr, phprooftokencrypto: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyGetToken(cpolicychain.toInt(), ppolicychain.rawAddress.toString(), securitytoken.rawAddress.toString(), phprooftokencrypto.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashCore(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyHashCore(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hashFinal(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyHashFinal(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun importInformationCard(filename: Pcwstr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyImportInformationCard(filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun manageCardSpace(): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyManageCardSpace() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCloseProtectionDescriptor(hdescriptor: NcryptDescriptorHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptCloseProtectionDescriptor(hdescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreateClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: MutPtr, cbclaimblob: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptCreateClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), pparameterlist.rawAddress.toString(), pbclaimblob.rawAddress.toString(), cbclaimblob.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreatePersistedKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszalgid: Pcwstr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptCreatePersistedKey(hprovider.toString(), phkey.rawAddress.toString(), pszalgid.rawAddress.toString(), pszkeyname.rawAddress.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptCreateProtectionDescriptor(pwszdescriptorstring: Pcwstr, dwflags: UInt, phdescriptor: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptCreateProtectionDescriptor(pwszdescriptorstring.rawAddress.toString(), dwflags.toInt(), phdescriptor.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDecrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptDecrypt(hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDeleteKey(hkey: NcryptKeyHandle, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptDeleteKey(hkey.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptDeriveKey(hsharedsecret: NcryptSecretHandle, pwszkdf: Pcwstr, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptDeriveKey(hsharedsecret.toString(), pwszkdf.rawAddress.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEncrypt(hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, ppaddinginfo: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptEncrypt(hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), ppaddinginfo.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumAlgorithms(hprovider: NcryptProvHandle, dwalgoperations: NcryptOperation, pdwalgcount: MutPtr, ppalglist: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptEnumAlgorithms(hprovider.toString(), dwalgoperations.toInt(), pdwalgcount.rawAddress.toString(), ppalglist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumKeys(hprovider: NcryptProvHandle, pszscope: Pcwstr, ppkeyname: MutPtr, ppenumstate: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptEnumKeys(hprovider.toString(), pszscope.rawAddress.toString(), ppkeyname.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptEnumStorageProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptEnumStorageProviders(pdwprovidercount.rawAddress.toString(), ppproviderlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptExportKey(hkey: NcryptKeyHandle, hexportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptExportKey(hkey.toString(), hexportkey.toString(), pszblobtype.rawAddress.toString(), pparameterlist.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFinalizeKey(hkey: NcryptKeyHandle, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptFinalizeKey(hkey.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFreeBuffer(pvinput: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptFreeBuffer(pvinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptFreeObject(hobject: NcryptHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptFreeObject(hobject.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptGetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: ObjectSecurityInformation): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptGetProperty(hobject.toString(), pszproperty.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptGetProtectionDescriptorInfo(hdescriptor: NcryptDescriptorHandle, pmempara: ConstPtr, dwinfotype: UInt, ppvinfo: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptGetProtectionDescriptorInfo(hdescriptor.rawAddress.toString(), pmempara.rawAddress.toString(), dwinfotype.toInt(), ppvinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptImportKey(hprovider: NcryptProvHandle, himportkey: NcryptKeyHandle, pszblobtype: Pcwstr, pparameterlist: ConstPtr, phkey: MutPtr, pbdata: ConstPtr, cbdata: UInt, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptImportKey(hprovider.toString(), himportkey.toString(), pszblobtype.rawAddress.toString(), pparameterlist.rawAddress.toString(), phkey.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptIsAlgSupported(hprovider: NcryptProvHandle, pszalgid: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptIsAlgSupported(hprovider.toString(), pszalgid.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptIsKeyHandle(hkey: NcryptKeyHandle): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptIsKeyHandle(hkey.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptKeyDerivation(hkey: NcryptKeyHandle, pparameterlist: ConstPtr, pbderivedkey: MutPtr, cbderivedkey: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptKeyDerivation(hkey.toString(), pparameterlist.rawAddress.toString(), pbderivedkey.rawAddress.toString(), cbderivedkey.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptNotifyChangeKey(hprovider: NcryptProvHandle, phevent: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptNotifyChangeKey(hprovider.toString(), phevent.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptOpenKey(hprovider: NcryptProvHandle, phkey: MutPtr, pszkeyname: Pcwstr, dwlegacykeyspec: CertKeySpec, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptOpenKey(hprovider.toString(), phkey.rawAddress.toString(), pszkeyname.rawAddress.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptOpenStorageProvider(phprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptOpenStorageProvider(phprovider.rawAddress.toString(), pszprovidername.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptProtectSecret(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, pbdata: ConstPtr, cbdata: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbprotectedblob: MutPtr, pcbprotectedblob: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptProtectSecret(hdescriptor.rawAddress.toString(), dwflags.toInt(), pbdata.rawAddress.toString(), cbdata.toInt(), pmempara.rawAddress.toString(), hwnd.rawAddress.toString(), ppbprotectedblob.rawAddress.toString(), pcbprotectedblob.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptQueryProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pwstr, pcdescriptorstring: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptQueryProtectionDescriptorName(pwszname.rawAddress.toString(), pwszdescriptorstring.rawAddress.toString(), pcdescriptorstring.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptRegisterProtectionDescriptorName(pwszname: Pcwstr, pwszdescriptorstring: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptRegisterProtectionDescriptorName(pwszname.rawAddress.toString(), pwszdescriptorstring.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSecretAgreement(hprivkey: NcryptKeyHandle, hpubkey: NcryptKeyHandle, phagreedsecret: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptSecretAgreement(hprivkey.toString(), hpubkey.toString(), phagreedsecret.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSetProperty(hobject: NcryptHandle, pszproperty: Pcwstr, pbinput: ConstPtr, cbinput: UInt, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptSetProperty(hobject.toString(), pszproperty.rawAddress.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptSignHash(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptSignHash(hkey.toString(), ppaddinginfo.rawAddress.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamClose(hstream: NcryptStreamHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptStreamClose(hstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToProtect(hdescriptor: NcryptDescriptorHandle, dwflags: UInt, hwnd: Hwnd, pstreaminfo: ConstPtr, phstream: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToProtect(hdescriptor.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), pstreaminfo.rawAddress.toString(), phstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToUnprotect(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotect(pstreaminfo.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), phstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamOpenToUnprotectEx(pstreaminfo: ConstPtr, dwflags: UInt, hwnd: Hwnd, phstream: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptStreamOpenToUnprotectEx(pstreaminfo.rawAddress.toString(), dwflags.toInt(), hwnd.rawAddress.toString(), phstream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptStreamUpdate(hstream: NcryptStreamHandle, pbdata: ConstPtr, cbdata: ULong, ffinal: Bool): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptStreamUpdate(hstream.rawAddress.toString(), pbdata.rawAddress.toString(), cbdata.toString(), ffinal) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptTranslateHandle(phprovider: MutPtr, phkey: MutPtr, hlegacyprov: ULong, hlegacykey: ULong, dwlegacykeyspec: CertKeySpec, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptTranslateHandle(phprovider.rawAddress.toString(), phkey.rawAddress.toString(), hlegacyprov.toString(), hlegacykey.toString(), dwlegacykeyspec.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptUnprotectSecret(phdescriptor: MutPtr, dwflags: NcryptFlags, pbprotectedblob: ConstPtr, cbprotectedblob: UInt, pmempara: ConstPtr, hwnd: Hwnd, ppbdata: MutPtr, pcbdata: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptUnprotectSecret(phdescriptor.rawAddress.toString(), dwflags.toInt(), pbprotectedblob.rawAddress.toString(), cbprotectedblob.toInt(), pmempara.rawAddress.toString(), hwnd.rawAddress.toString(), ppbdata.rawAddress.toString(), pcbdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptVerifyClaim(hsubjectkey: NcryptKeyHandle, hauthoritykey: NcryptKeyHandle, dwclaimtype: UInt, pparameterlist: ConstPtr, pbclaimblob: ConstPtr, cbclaimblob: UInt, poutput: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptVerifyClaim(hsubjectkey.toString(), hauthoritykey.toString(), dwclaimtype.toInt(), pparameterlist.rawAddress.toString(), pbclaimblob.rawAddress.toString(), cbclaimblob.toInt(), poutput.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun nCryptVerifySignature(hkey: NcryptKeyHandle, ppaddinginfo: ConstPtr, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: NcryptFlags): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyNCryptVerifySignature(hkey.toString(), ppaddinginfo.rawAddress.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXExportCertStore(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyPFXExportCertStore(hstore.rawAddress.toString(), ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXExportCertStoreEx(hstore: Hcertstore, ppfx: MutPtr, szpassword: Pcwstr, pvpara: ConstPtr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyPFXExportCertStoreEx(hstore.rawAddress.toString(), ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), pvpara.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXImportCertStore(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: CryptKeyFlags): Hcertstore =
    if (windowsWin32SecurityCryptographyNapiAddon != null) MutPtr((windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyPFXImportCertStore(ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXIsPFXBlob(ppfx: ConstPtr): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyPFXIsPFXBlob(ppfx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pFXVerifyPassword(ppfx: ConstPtr, szpassword: Pcwstr, dwflags: UInt): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyPFXVerifyPassword(ppfx.rawAddress.toString(), szpassword.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun processPrng(pbdata: MutPtr, cbdata: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyProcessPrng(pbdata.rawAddress.toString(), cbdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signError(): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignError() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, pcbsig: MutPtr, ppsig: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignHash(hcrypto.rawAddress.toString(), cbhash.toInt(), phash.rawAddress.toString(), hashalgoid.rawAddress.toString(), pcbsig.rawAddress.toString(), ppsig.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerFreeSignerContext(psignercontext: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerFreeSignerContext(psignercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSign(psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerSign(psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerSignEx(dwflags.toInt(), psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx2(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerSignEx2(dwflags.toInt(), psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), dwtimestampflags.toInt(), psztimestampalgorithmoid.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString(), pcryptopolicy.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerSignEx3(dwflags: SignerSignFlags, psubjectinfo: ConstPtr, psignercert: ConstPtr, psignatureinfo: ConstPtr, pproviderinfo: ConstPtr, dwtimestampflags: SignerTimestampFlags, psztimestampalgorithmoid: Pcstr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, pdigestsigninfo: ConstPtr, preserved: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerSignEx3(dwflags.toInt(), psubjectinfo.rawAddress.toString(), psignercert.rawAddress.toString(), psignatureinfo.rawAddress.toString(), pproviderinfo.rawAddress.toString(), dwtimestampflags.toInt(), psztimestampalgorithmoid.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString(), pcryptopolicy.rawAddress.toString(), pdigestsigninfo.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStamp(psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerTimeStamp(psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx(dwflags: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx(dwflags.toInt(), psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx2(dwflags: SignerTimestampFlags, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, dwalgid: AlgId, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx2(dwflags.toInt(), psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), dwalgid.toInt(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun signerTimeStampEx3(dwflags: SignerTimestampFlags, dwindex: UInt, psubjectinfo: ConstPtr, pwszhttptimestamp: Pcwstr, pszalgorithmoid: Pcwstr, psrequest: ConstPtr, psipdata: ConstPtr, ppsignercontext: MutPtr, pcryptopolicy: ConstPtr, preserved: ConstPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySignerTimeStampEx3(dwflags.toInt(), dwindex.toInt(), psubjectinfo.rawAddress.toString(), pwszhttptimestamp.rawAddress.toString(), pszalgorithmoid.rawAddress.toString(), psrequest.rawAddress.toString(), psipdata.rawAddress.toString(), ppsignercontext.rawAddress.toString(), pcryptopolicy.rawAddress.toString(), preserved.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslChangeNotify(hevent: Handle, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslChangeNotify(hevent.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeClientAuthHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pszalgid: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslComputeClientAuthHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), pszalgid.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeEapKeyBlock(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, pbrandoms: ConstPtr, cbrandoms: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslComputeEapKeyBlock(hsslprovider.toString(), hmasterkey.toString(), pbrandoms.rawAddress.toString(), cbrandoms.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeFinishedHash(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhandshakehash: NcryptHashHandle, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslComputeFinishedHash(hsslprovider.toString(), hmasterkey.toString(), hhandshakehash.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslComputeSessionHash(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, dwprotocol: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslComputeSessionHash(hsslprovider.toString(), hhandshakehash.toString(), dwprotocol.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateClientAuthHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pszhashalgid: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslCreateClientAuthHash(hsslprovider.toString(), phhandshakehash.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pszhashalgid.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateEphemeralKey(hsslprovider: NcryptProvHandle, phephemeralkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, dwkeybitlen: UInt, pbparams: ConstPtr, cbparams: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslCreateEphemeralKey(hsslprovider.toString(), phephemeralkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), dwkeybitlen.toInt(), pbparams.rawAddress.toString(), cbparams.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslCreateHandshakeHash(hsslprovider: NcryptProvHandle, phhandshakehash: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslCreateHandshakeHash(hsslprovider.toString(), phhandshakehash.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDecrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslDecrementProviderReferenceCount(hsslprovider.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDecryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslDecryptPacket(hsslprovider.toString(), hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), sequencenumber.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslDuplicateTranscriptHash(hsslprovider: NcryptProvHandle, htranscripthash: NcryptHashHandle, phtranscripthash: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslDuplicateTranscriptHash(hsslprovider.toString(), htranscripthash.toString(), phtranscripthash.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEncryptPacket(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pbinput: ConstPtr, cbinput: UInt, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, sequencenumber: ULong, dwcontenttype: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslEncryptPacket(hsslprovider.toString(), hkey.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), sequencenumber.toString(), dwcontenttype.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumCipherSuites(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslEnumCipherSuites(hsslprovider.toString(), hprivatekey.toString(), ppciphersuite.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumCipherSuitesEx(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, ppciphersuite: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslEnumCipherSuitesEx(hsslprovider.toString(), hprivatekey.toString(), ppciphersuite.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumEccCurves(hsslprovider: NcryptProvHandle, pecccurvecount: MutPtr, ppecccurve: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslEnumEccCurves(hsslprovider.toString(), pecccurvecount.rawAddress.toString(), ppecccurve.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslEnumProtocolProviders(pdwprovidercount: MutPtr, ppproviderlist: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslEnumProtocolProviders(pdwprovidercount.rawAddress.toString(), ppproviderlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandBinderKey(hsslprovider: NcryptProvHandle, hearlykey: NcryptKeyHandle, phbinderkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExpandBinderKey(hsslprovider.toString(), hearlykey.toString(), phbinderkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandExporterMasterKey(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phexportermasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExpandExporterMasterKey(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), phexportermasterkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandPreSharedKey(hsslprovider: NcryptProvHandle, hresumptionmasterkey: NcryptKeyHandle, pbticketnonce: ConstPtr, cbticketnonce: UInt, phpresharedkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExpandPreSharedKey(hsslprovider.toString(), hresumptionmasterkey.toString(), pbticketnonce.rawAddress.toString(), cbticketnonce.toInt(), phpresharedkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandResumptionMasterKey(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phresumptionmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExpandResumptionMasterKey(hsslprovider.toString(), hmasterkey.toString(), hhashvalue.toString(), phresumptionmasterkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandTrafficKeys(hsslprovider: NcryptProvHandle, hbasekey: NcryptKeyHandle, hhashvalue: NcryptHashHandle, phclienttraffickey: MutPtr, phservertraffickey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExpandTrafficKeys(hsslprovider.toString(), hbasekey.toString(), hhashvalue.toString(), phclienttraffickey.rawAddress.toString(), phservertraffickey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExpandWriteKey(hsslprovider: NcryptProvHandle, hbasetraffickey: NcryptKeyHandle, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExpandWriteKey(hsslprovider.toString(), hbasetraffickey.toString(), phwritekey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExportKey(hsslprovider: NcryptProvHandle, hkey: NcryptKeyHandle, pszblobtype: Pcwstr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExportKey(hsslprovider.toString(), hkey.toString(), pszblobtype.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExportKeyingMaterial(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, slabel: Pcstr, pbrandoms: ConstPtr, cbrandoms: UInt, pbcontextvalue: ConstPtr, cbcontextvalue: UShort, pboutput: MutPtr, cboutput: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExportKeyingMaterial(hsslprovider.toString(), hmasterkey.toString(), slabel.rawAddress.toString(), pbrandoms.rawAddress.toString(), cbrandoms.toInt(), pbcontextvalue.rawAddress.toString(), cbcontextvalue.toInt(), pboutput.rawAddress.toString(), cboutput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractEarlyKey(hsslprovider: NcryptProvHandle, hpresharedkey: NcryptKeyHandle, phearlykey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExtractEarlyKey(hsslprovider.toString(), hpresharedkey.toString(), phearlykey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractHandshakeKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, hearlykey: NcryptKeyHandle, phhandshakekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExtractHandshakeKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), hearlykey.toString(), phhandshakekey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslExtractMasterKey(hsslprovider: NcryptProvHandle, hhandshakekey: NcryptKeyHandle, phmasterkey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslExtractMasterKey(hsslprovider.toString(), hhandshakekey.toString(), phmasterkey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeBuffer(pvinput: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslFreeBuffer(pvinput.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslFreeObject(hobject: NcryptHandle, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslFreeObject(hobject.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGenerateMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, hpublickey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslGenerateMasterKey(hsslprovider.toString(), hprivatekey.toString(), hpublickey.toString(), phmasterkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGeneratePreMasterKey(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, phpremasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pboutput: MutPtr, cboutput: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslGeneratePreMasterKey(hsslprovider.toString(), hpublickey.toString(), phpremasterkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), pboutput.rawAddress.toString(), cboutput.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGenerateSessionKeys(hsslprovider: NcryptProvHandle, hmasterkey: NcryptKeyHandle, phreadkey: MutPtr, phwritekey: MutPtr, pparameterlist: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslGenerateSessionKeys(hsslprovider.toString(), hmasterkey.toString(), phreadkey.rawAddress.toString(), phwritekey.rawAddress.toString(), pparameterlist.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetCipherSuitePRFHashAlgorithm(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, szprfhash: Pwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslGetCipherSuitePRFHashAlgorithm(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), szprfhash.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetKeyProperty(hkey: NcryptKeyHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslGetKeyProperty(hkey.toString(), pszproperty.rawAddress.toString(), ppboutput.rawAddress.toString(), pcboutput.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslGetProviderProperty(hsslprovider: NcryptProvHandle, pszproperty: Pcwstr, ppboutput: MutPtr, pcboutput: MutPtr, ppenumstate: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslGetProviderProperty(hsslprovider.toString(), pszproperty.rawAddress.toString(), ppboutput.rawAddress.toString(), pcboutput.rawAddress.toString(), ppenumstate.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslHashHandshake(hsslprovider: NcryptProvHandle, hhandshakehash: NcryptHashHandle, pbinput: ConstPtr, cbinput: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslHashHandshake(hsslprovider.toString(), hhandshakehash.toString(), pbinput.rawAddress.toString(), cbinput.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslImportKey(hsslprovider: NcryptProvHandle, phkey: MutPtr, pszblobtype: Pcwstr, pbkeyblob: ConstPtr, cbkeyblob: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslImportKey(hsslprovider.toString(), phkey.rawAddress.toString(), pszblobtype.rawAddress.toString(), pbkeyblob.rawAddress.toString(), cbkeyblob.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslImportMasterKey(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, phmasterkey: MutPtr, dwprotocol: UInt, dwciphersuite: UInt, pparameterlist: ConstPtr, pbencryptedkey: ConstPtr, cbencryptedkey: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslImportMasterKey(hsslprovider.toString(), hprivatekey.toString(), phmasterkey.rawAddress.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), pparameterlist.rawAddress.toString(), pbencryptedkey.rawAddress.toString(), cbencryptedkey.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslIncrementProviderReferenceCount(hsslprovider: NcryptProvHandle): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslIncrementProviderReferenceCount(hsslprovider.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslLookupCipherLengths(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pcipherlengths: MutPtr, cbcipherlengths: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslLookupCipherLengths(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pcipherlengths.rawAddress.toString(), cbcipherlengths.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslLookupCipherSuiteInfo(hsslprovider: NcryptProvHandle, dwprotocol: UInt, dwciphersuite: UInt, dwkeytype: UInt, pciphersuite: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslLookupCipherSuiteInfo(hsslprovider.toString(), dwprotocol.toInt(), dwciphersuite.toInt(), dwkeytype.toInt(), pciphersuite.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslOpenPrivateKey(hsslprovider: NcryptProvHandle, phprivatekey: MutPtr, pcertcontext: ConstPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslOpenPrivateKey(hsslprovider.toString(), phprivatekey.rawAddress.toString(), pcertcontext.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslOpenProvider(phsslprovider: MutPtr, pszprovidername: Pcwstr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslOpenProvider(phsslprovider.rawAddress.toString(), pszprovidername.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslSignHash(hsslprovider: NcryptProvHandle, hprivatekey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: MutPtr, cbsignature: UInt, pcbresult: MutPtr, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslSignHash(hsslprovider.toString(), hprivatekey.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), pcbresult.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun sslVerifySignature(hsslprovider: NcryptProvHandle, hpublickey: NcryptKeyHandle, pbhashvalue: ConstPtr, cbhashvalue: UInt, pbsignature: ConstPtr, cbsignature: UInt, dwflags: UInt): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySslVerifySignature(hsslprovider.toString(), hpublickey.toString(), pbhashvalue.rawAddress.toString(), cbhashvalue.toInt(), pbsignature.rawAddress.toString(), cbsignature.toInt(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemPrng(pbrandomdata: MutPtr, cbrandomdata: ULong): Bool =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographySystemPrng(pbrandomdata.rawAddress.toString(), cbrandomdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyTransformBlock(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transformFinalBlock(hcrypto: ConstPtr, cbindata: UInt, pindata: ConstPtr, pcboutdata: MutPtr, ppoutdata: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyTransformFinalBlock(hcrypto.rawAddress.toString(), cbindata.toInt(), pindata.rawAddress.toString(), pcboutdata.rawAddress.toString(), ppoutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun verifyHash(hcrypto: ConstPtr, cbhash: UInt, phash: ConstPtr, hashalgoid: Pcwstr, cbsig: UInt, psig: ConstPtr, pfverified: MutPtr): Hresult =
    if (windowsWin32SecurityCryptographyNapiAddon != null) (windowsWin32SecurityCryptographyNapiAddon.windowssysWindowsWin32SecurityCryptographyVerifyHash(hcrypto.rawAddress.toString(), cbhash.toInt(), phash.rawAddress.toString(), hashalgoid.rawAddress.toString(), cbsig.toInt(), psig.rawAddress.toString(), pfverified.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
